package weather_rest_service;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import java.awt.image.*;
import java.io.*;
import javax.swing.event.*;
import java.awt.event.*;


public class TextField extends JPanel implements ActionListener, KeyListener, DocumentListener{

	
	static JTextField inputFieldPanel = new JTextField(12);
	
	public TextField() {
		
		JLabel title = new JLabel("Get Weather For");
		Font titleFont = new Font("tahoma", Font.PLAIN, 15);
		
		inputFieldPanel.setBounds(8, 40, 320, 30);
		inputFieldPanel.setBackground(Color.white);
		inputFieldPanel.setForeground(Color.black);
		inputFieldPanel.setFont(titleFont);
		inputFieldPanel.addKeyListener(this);
		inputFieldPanel.addActionListener(this);
		inputFieldPanel.getDocument().addDocumentListener(this);
		
		title.setBounds(10, 5, 200, 40);
		title.setFont(titleFont);
		title.setForeground(Color.black);
		
		add(inputFieldPanel);
		add(title);
		
	}

	public static JTextField getInputField() {
		return inputFieldPanel;
	}
	public void actionPerformed(ActionEvent e)
    {
		getWeather weather = new getWeather();
		String city = inputFieldPanel.getText();
		String temp = weather.evaluate(city);
		String[] data = temp.split(" ");
	
		infoField.getTemp().setText(data[0] + "\u00B0");
		infoField.getTempMax().setText("High: " + data[2] + "\u00B0");
		infoField.getTempMin().setText("Low:" + data[1] + "\u00B0");
		infoField.getPressure().setText("Pressure: " + data[3] + " mb");
		infoField.getHumidity().setText("Humidity: " + data[4] + "RH");
		
		String sunny = "clear";
		String foggy = "foggy";
		String cloudy = "cloudy";
		String rainy = "raining";
		
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
