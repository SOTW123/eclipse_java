package testing_learning.JavaSwingGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

import java.util.Scanner;

public class JavaSwing {

	public static void main(String[] args) {
		
		// to add image to screen
		ImageIcon image = new ImageIcon("CET.jpg");
		Border border = BorderFactory.createLineBorder(Color.green,3);
		
		// to add text to screen
		JLabel label = new JLabel(/*"Siyam is the coolest guy in the world"*/);
		label.setText("Bro, you need to start smd");
		// label.setIcon(image);
					// to align the text IN the label NOT the label itself
				// label.setHorizontalTextPosition(SwingConstants.RIGHT);
				// label.setVerticalTextPosition(JLabel.TOP);
		// to align the label itself
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setVerticalAlignment(SwingConstants.CENTER);
		
		// set Color & Font of Text
		label.setForeground(Color.blue);
		label.setFont(new Font("MV Boli",Font.BOLD,36));
		
		// set gap between image and text
		label.setIconTextGap(-25);
		
		// set background color
		label.setBackground(Color.black);
		label.setOpaque(true);
		
		// set border
		label.setBorder(border);
		
		// setting bounds
		label.setBounds(100,100,250,250);
		
		
		// to generate the screen
		JFrame frame = new JFrame();
		frame.setVisible(true);
		//frame.setSize(650, 650);
		// layout
		// frame.setLayout(null);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setResizable(true);
			// frame.getContentPane().setBackground(new Color(50,50,50));
		frame.add(label);
		frame.pack();
		
	}

}
