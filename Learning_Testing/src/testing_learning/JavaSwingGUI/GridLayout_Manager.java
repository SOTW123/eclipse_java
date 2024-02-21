package testing_learning.JavaSwingGUI;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayout_Manager {

	public static void main(String[] args) {
		// Grid Layout
			// * places components in boxes
			// * each component takes whole space of box
			// * each cell is the same size
		
		// creating frame
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(3,3, 10, 10));
		frame.setSize(500,500);      // rows, columns, horizontal spacing, vertical spacing
		
		// button
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));

		
		frame.setVisible(true);
	}

}
