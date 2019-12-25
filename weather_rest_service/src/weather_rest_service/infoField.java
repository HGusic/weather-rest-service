package weather_rest_service;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import java.awt.image.*;
import java.io.*;
import javax.swing.event.*;
import java.awt.event.*;

//INFO FIELD CLASS DISPLAYS WEATHER INFO
public class infoField extends JPanel implements DocumentListener{
	
		//Variables for every weather info variable
		static JLabel temp = new JLabel("");
		static JLabel lowTemp = new JLabel("");
		static JLabel highTemp = new JLabel("");
		static JLabel pressure = new JLabel("");
		static JLabel humidity = new JLabel("");
		
	public infoField() {
		
		//Set a big and a little font
		Font titleFont = new Font("tahoma", Font.PLAIN, 35);
		Font littleFont = new Font("tahoma", Font.PLAIN, 15);
		
		//Options for Temperature Display
		temp.setBounds(115 , 20 ,120, 40);
		temp.setFont(titleFont);
		temp.setForeground(Color.black);
		
		//Options for Low Temp Display
		lowTemp.setBounds(35, 60, 200, 40);
		lowTemp.setFont(littleFont);
		lowTemp.setForeground(Color.black);
		
		//Options for Pressure Display
		pressure.setBounds(180, 60, 200, 40);
		pressure.setFont(littleFont);
		pressure.setForeground(Color.black);
		
		//Options for High Temp Display
		highTemp.setBounds(35, 80, 200, 40);
		highTemp.setFont(littleFont);
		highTemp.setForeground(Color.black);
		
		//Options for Humidity Display
		humidity.setBounds(180, 80, 200, 40);
		humidity.setFont(littleFont);
		humidity.setForeground(Color.black);
		
		//Add to frame
		add(temp);
		add(lowTemp);
		add(highTemp);
		add(humidity);
		add(pressure);
	}
	
	//VARIABLES TO RETURN INFO
	public static JLabel getTemp() {
		return temp;
	}
	public static JLabel getTempMin() {
		return lowTemp;
	}
	public static JLabel getTempMax() {
		return highTemp;
	}
	public static JLabel getPressure() {
		return pressure;
	}
	public static JLabel getHumidity() {
		return humidity;
	}
	@Override
	public void changedUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void insertUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
