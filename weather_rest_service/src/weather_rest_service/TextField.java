package weather_rest_service;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import java.awt.image.*;
import java.io.*;
import javax.swing.event.*;
import java.awt.event.*;

//TEXTFIELD CLASS CREATES TEXTFIELD
public class TextField extends JPanel implements ActionListener, KeyListener, DocumentListener{

	//Variables
	static JTextField inputFieldPanel = new JTextField(12);
	
	public TextField() {
		
		//Prompt and prompt font
		JLabel title = new JLabel("Enter City or Zipcode");
		Font titleFont = new Font("tahoma", Font.PLAIN, 15);
		
		//Variables for the textfield
		inputFieldPanel.setBounds(8, 40, 320, 30);
		inputFieldPanel.setBackground(Color.white);
		inputFieldPanel.setForeground(Color.black);
		inputFieldPanel.setFont(titleFont);
		inputFieldPanel.addKeyListener(this);
		inputFieldPanel.addActionListener(this);
		inputFieldPanel.getDocument().addDocumentListener(this);
		
		//Set Prompt options
		title.setBounds(10, 5, 200, 40);
		title.setFont(titleFont);
		title.setForeground(Color.black);
		
		//Add to frame
		add(inputFieldPanel);
		add(title);
		
	}

	//Function to return data in input field
	public static JTextField getInputField() {
		return inputFieldPanel;
	}
	
	//When 'enter' is hit, get weather
	public void actionPerformed(ActionEvent e)
    {
		//Create new getWeather object
		getWeather weather = new getWeather();
		//Return City from input field
		String city = inputFieldPanel.getText();
		//Return String of data from API and JSON in getWeather class
		String temp = weather.evaluate(city);
		//Split data up into array
		String[] data = temp.split(" ");
	
		//Evauluate Data and Display it
		infoField.getTemp().setText(data[0] + "\u00B0");
		infoField.getTempMax().setText("High: " + data[2] + "\u00B0");
		infoField.getTempMin().setText("Low:" + data[1] + "\u00B0");
		infoField.getPressure().setText("Pressure: " + data[3] + " mb");
		infoField.getHumidity().setText("Humidity: " + data[4] + "RH");
		
		String sunny = "clear";
		String foggy = "foggy";
		String cloudy = "cloudy";
		String rainy = "raining";
		
		//If statements decide what image to show
		String main = data[5];
		int var1 = main.compareTo(sunny);
		int var2 = main.compareTo(foggy);
		int var3 = main.compareTo(cloudy);
		int var4  = main.compareTo(rainy);
		if(var1 == 0)
			imageField.setSunnyImage();
		if(var2 == 0)
			imageField.setFoggyImage();
		if(var3 == 0)
			imageField.setCloudyImage();
		if(var4 == 0)
			imageField.setRainyImage();

    }
	@Override
	public void changedUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeUpdate(DocumentEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
}
