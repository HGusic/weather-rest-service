package weather_rest_service;
import javax.swing.*;
import java.awt.*;


//FRAME CLASS CREATES FRAME
public class Frame extends JFrame {
	
	//Variables
	private JPanel backgroundPanel;
	private JLabel subject;
	
	public Frame() {
		
		//Set Frame Options
		setLayout(null);
		setSize(342, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Weather Rest Service");
		setResizable(false);
		
		//Create Background Panel
		JPanel backgroundPanel = new JPanel();
		backgroundPanel.setLayout(null);
		backgroundPanel.setLocation(0,0);
		backgroundPanel.setSize(340,500);
		backgroundPanel.setBackground(Color.decode("#474646"));
		add(backgroundPanel);
		
		//Create TextArea to Input Text
		TextField textArea = new TextField();
		textArea.setLayout(null);
		textArea.setBounds(0,0,340, 80);
		textArea.setBackground(Color.decode("#474646"));
		backgroundPanel.add(textArea);
		
		//Create ImageField for Weather Images
		imageField image = new imageField();
		image.setLayout(null);
		image.setBounds(0, 80, 340, 100);
		image.setBackground(Color.decode("#474646"));
		backgroundPanel.add(image);
		
		//Create InfoField for weather info
		infoField info = new infoField();
		info.setLayout(null);
		info.setBounds(0, 180, 340, 200);
		info.setBackground(Color.decode("#474646"));
		backgroundPanel.add(info);
		
		//Set Frame to be Visible
		setVisible(true);
		
	}

}
