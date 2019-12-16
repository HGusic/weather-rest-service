package weather_rest_service;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class getWeather {

		private static HttpURLConnection connection;
		String city;
		public getWeather() {
			
		}
		
		public static String evaluate(String city) {
		
			//VAIABLES
			int option = -1;
			Scanner input = new Scanner(System.in);
			
			
			//Create a Buffered reader for the Open Weather API
			BufferedReader reader;
			String line;
			StringBuffer responseContent = new StringBuffer();
			
			
			//Try Catch to Access API's
			try {
				
			//set the url for open weather API
			URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=2edd12d1cb247fca23d28f9b809935c7&units=imperial");
			
			//open set connection status for open weather api
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setConnectTimeout(5000);
			connection.setReadTimeout(5000);
			
			//get connection status for open weather api
			int status = connection.getResponseCode();
			
			//if connection to api is good enough
			if(status > 299) {
				//read in json object for open waether api
				reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
				while((line = reader.readLine()) != null) {
					responseContent.append(line);
				}
				reader.close();
			//else close 
			}else {
				reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				while((line = reader.readLine()) != null) {
					responseContent.append(line);
				}
				reader.close();
			}
			
		
			//convert json to string
			String json = responseContent.toString();
			
			//use gson to parse through json
			JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();
			
			//return temp min/max, pressure, humidity from json
			String temp = jsonObject.getAsJsonObject("main").get("temp").getAsString();
			String temp_min = jsonObject.getAsJsonObject("main").get("temp_min").getAsString();
			String temp_max = jsonObject.getAsJsonObject("main").get("temp_max").getAsString();
			String pressure = jsonObject.getAsJsonObject("main").get("pressure").getAsString();
			String humidity = jsonObject.getAsJsonObject("main").get("humidity").getAsString();
		
			//description is in an array so you must use json array
			JsonArray arr = jsonObject.getAsJsonArray("weather");
			String main = arr.get(0).getAsJsonObject().get("main").getAsString();
			String description = arr.get(0).getAsJsonObject().get("description").getAsString();
			
			//This converts it to more understandable english
			String Rain = "Rain";
			String Fog = "Fog";
			String Clouds = "Clouds";
			String Clear = "Clear";
			int var1 = main.compareTo(Rain);
			int var2 = main.compareTo(Fog);
			int var3 = main.compareTo(Clouds);
			int var4  = main.compareTo(Clear);
			if(var1 == 0)
				main = "raining";
			if(var2 == 0)
				main = "foggy";
			if(var3 == 0)
				main = "cloudy";
			if(var4 == 0)
				main =  "clear";
			
			//display the weather
			//System.out.println("In " + city + " it is currently " + main + " with a(n) " + description);
			//System.out.println("The current temperature is " + temp + " degrees, with a low of " + temp_min + " and a high of " + temp_max);
			//System.out.println("The pressure is about " + pressure + " mb and the humiditiy is about " + humidity + " g/m^3");
	
			String result = temp + " " + temp_min + " " + temp_max + " " + pressure + " " + humidity + " " + main;
			return result;
			
			
			//catch exceptions
			}catch(MalformedURLException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}
			return "DNE";
		
			

		
			
		}
}
