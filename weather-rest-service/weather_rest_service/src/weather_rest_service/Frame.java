package weather_rest_service;
import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
	
	private JPanel backgroundPanel;
	private JLabel subject;
	
	public Frame() {
		
		setLayout(null);
		setSize(342, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Weather Rest Service");
		setResizable(false);
		
		JPanel backgroundPanel = new JPanel();
		backgroundPanel.setLayout(null);
		backgroundPanel.setLocation(0,0);
		backgroundPanel.setSize(340,500);
		backgroundPanel.setBackground(Color.decode("#E6E6E6"));
		add(backgroundPanel);
		
		
		TextField textArea = new TextField();
		textArea.setLayout(null);
		textArea.setBounds(0,0,340, 80);
		textArea.setBackground(Color.LIGHT_GRAY);
		backgroundPanel.add(textArea);
		
		
		imageField image = new imageField();
		image.setLayout(null);
		image.setBounds(0, 80, 340, 100);
		image.setBackground(Color.LIGHT_GRAY);
		backgroundPanel.add(image);
		
		infoField info = new infoField();
		info.setLayout(null);
		info.setBounds(0, 180, 340, 200);
		info.setBackground(Color.LIGHT_GRAY);
		backgroundPanel.add(info);
		
		setVisible(true);
		
	}

}
