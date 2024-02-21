package testing_learning.JavaSwingGUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayout_Manager {

	public static void main(String[] args) {
		// FlowLayout manager places components in a row. 
		// if too big to fit in one row, it moves on to next row
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout(FlowLayout.LEADING, 10, 10 )); // setting flowlayout
		frame.setSize(500,500); 			/* space between buttons, space between top and buttons*/
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(500,250));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(new FlowLayout());
		
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		
		
		frame.add(panel);
		frame.setVisible(true);
	}

}
