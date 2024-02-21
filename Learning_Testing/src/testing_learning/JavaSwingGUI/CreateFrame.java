package testing_learning.JavaSwingGUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class CreateFrame extends JFrame implements ActionListener {
	JButton button;
	JLabel label;
	CreateFrame() {
		// create label for button
		label = new JLabel();
		label.setText("you needa start sucking");
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label.setForeground(Color.blue);
		label.setBounds(0,0, 500, 100);
		label.setVisible(false);
		
		// icon for button
		ImageIcon image = new ImageIcon("My project.jpg");
		
		// creates button
		button = new JButton();
		button.setBounds(100, 100, 250, 100);
		button.addActionListener(this);
		button.setText("I'm a butt");
		button.setFocusable(false);
		button.setIcon(image);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.CENTER);
		button.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button.setIconTextGap(-25);
		button.setForeground(new Color(255,255,255));
		button.setBackground(new Color(0,0,0));
		button.setBorder(BorderFactory.createEtchedBorder());
		// button.setEnabled(false); TO DISABLE A BUTTON
			// if you want the button to only be performed once then 
			// you can say button.setEnabled(False) after pressing it in 
			// the if statement
		
		
		// creates frame
		this.setVisible(true);
		this.setSize(650, 650);
		this.setLayout(null);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.getContentPane().setBackground(new Color(50,50,50));
		this.add(button);
		this.add(label);
		
		/*
		frame.setVisible(true);
		frame.setSize(650, 650);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(50,50,50));
		*/
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println("poo");
			label.setVisible(true);
			
		}
		
	}
}
