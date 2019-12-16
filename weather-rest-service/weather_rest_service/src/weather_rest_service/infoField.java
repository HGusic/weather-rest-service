package weather_rest_service;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import java.awt.image.*;
import java.io.*;
import javax.swing.event.*;
import java.awt.event.*;
public class infoField extends JPanel implements DocumentListener{
	
		static JLabel temp = new JLabel("");
		static JLabel lowTemp = new JLabel("Low:");
		static JLabel highTemp = new JLabel("High:");
		static JLabel pressure = new JLabel("Pressure:");
		static JLabel humidity = new JLabel("Humidity:");
	public infoField() {
		Font titleFont = new Font("tahoma", Font.PLAIN, 35);
		Font littleFont = new Font("tahoma", Font.PLAIN, 15);
		
		temp.setBounds(115 , 20 ,120, 40);
		temp.setFont(titleFont);
		temp.setForeground(Color.black);
		
		lowTemp.setBounds(35, 60, 200, 40);
		lowTemp.setFont(littleFont);
		lowTemp.setForeground(Color.black);
		
		pressure.setBounds(180, 60, 200, 40);
		pressure.setFont(littleFont);
		pressure.setForeground(Color.black);
		
		highTemp.setBounds(35, 80, 200, 40);
		highTemp.setFont(littleFont);
		highTemp.setForeground(Color.black);
		
		humidity.setBounds(180, 80, 200, 40);
		humidity.setFont(littleFont);
		humidity.setForeground(Color.black);
		
		add(temp);
		add(lowTemp);
		add(highTemp);
		add(humidity);
		add(pressure);
	}
	
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
