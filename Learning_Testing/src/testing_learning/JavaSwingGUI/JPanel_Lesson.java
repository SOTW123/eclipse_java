package testing_learning.JavaSwingGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics2D;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;


public class JPanel_Lesson {

	public static void main(String[] args) {
		// make images for seperate jpanels
			ImageIcon image = new ImageIcon("My project.jpg");
			
		// make text for seperate jpanels
			JLabel label = new JLabel();
			label.setText("Hi");
			label.setIcon(image);
			/*		ONLY USE THIS WHEN YOU USE BORDERLAYOUT MANAGER
				label.setHorizontalAlignment(JLabel.CENTER);
				label.setVerticalAlignment(JLabel.CENTER);
				label.setHorizontalAlignment(SwingConstants.CENTER);
				label.setVerticalAlignment(SwingConstants.CENTER);
			*/
			label.setBounds(0,0,100,100);
			
		// a container to hold other components
			JPanel redPanel = new JPanel(); // because we're creating a few different panels
			redPanel.setBackground(Color.red);
			redPanel.setBounds(0, 0, 250, 250);
			redPanel.setLayout(null);
			
			JPanel bluePanel = new JPanel(); // because we're creating a few different panels
			bluePanel.setBackground(Color.blue);
			bluePanel.setBounds(250, 0, 250, 250);
			bluePanel.setLayout(null);
			
			JPanel greenPanel = new JPanel(); // because we're creating a few different panels
			greenPanel.setBackground(Color.green);
			greenPanel.setBounds(0, 250, 500, 250);
			greenPanel.setLayout(null);
			
			JFrame frame = new JFrame();
			frame.setVisible(true);
			frame.setLayout(null);
			frame.setSize(650, 650);
			frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			frame.setResizable(false);
			
			redPanel.add(label);
			frame.add(redPanel);
			frame.add(bluePanel);
			frame.add(greenPanel);
			

	}

}
