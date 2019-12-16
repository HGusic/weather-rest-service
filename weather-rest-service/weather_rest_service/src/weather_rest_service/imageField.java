package weather_rest_service;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import java.awt.image.*;
import java.io.*;
import javax.swing.event.*;
import java.awt.event.*;

public class imageField extends JPanel {
	 static JLabel label = new JLabel();
	 static ImageIcon rainyNewIcon = new ImageIcon();
	 static ImageIcon foggyNewIcon = new ImageIcon();
	 static ImageIcon cloudyNewIcon = new ImageIcon();
	 static ImageIcon sunnyNewIcon = new ImageIcon();
	public imageField() {
		
	   ImageIcon sunnyImageIcon = new ImageIcon(this.getClass().getResource("/sunny.png"));
	   Image sunnyImg = sunnyImageIcon.getImage();
	   Image sunnyNewImg = sunnyImg.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH);
	   sunnyNewIcon.setImage(sunnyNewImg);
	   
	   ImageIcon cloudyImageIcon = new ImageIcon(this.getClass().getResource("/cloudy.png"));
	   Image cloudyImg = cloudyImageIcon.getImage();
	   Image cloudyNewImg = cloudyImg.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH);
	   cloudyNewIcon.setImage(cloudyNewImg);
	   
	   
	   ImageIcon foggyImageIcon = new ImageIcon(this.getClass().getResource("/foggy.png"));
	   Image foggyImg = foggyImageIcon.getImage();
	   Image foggyNewImg = foggyImg.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH);
	   foggyNewIcon.setImage(foggyNewImg);
	   
	   ImageIcon rainyImageIcon = new ImageIcon(this.getClass().getResource("/rainy.png"));
	   Image rainyImg = rainyImageIcon.getImage();
	   Image rainyNewImg = rainyImg.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH);
	   rainyNewIcon.setImage(rainyNewImg);
	   
	   label.setBounds(110, 0, 100, 100);
	   add(label);
	
		
	}

	public static void setSunnyImage() {
		
		label.setIcon(sunnyNewIcon);
	}
	public static void setCloudyImage() {
		
		label.setIcon(cloudyNewIcon);
	}
	public static void setFoggyImage() {
		
		label.setIcon(foggyNewIcon);
	}
	public static void setRainyImage() {
		
		label.setIcon(rainyNewIcon);
	}
}
