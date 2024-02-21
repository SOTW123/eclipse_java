package testing_learning.JavaSwingGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayout_Manager {

	public static void main(String[] args) {
		// 3 Types of Layout Managers
			// BorderLayout
		
		// create frame
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new BorderLayout(/* pixels of margin between panels: */ 10,10));
		frame.setVisible(true);
		
		
		// create 5 panels
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.green);
		panel3.setBackground(Color.blue);
		panel4.setBackground(Color.yellow);
		panel5.setBackground(Color.ORANGE);
		
		panel1.setPreferredSize(new Dimension(100,100));
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		
		//-----------------------------| Sub - Panels |---------------------------------------\\
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();
		
		panel6.setBackground(Color.black);
		panel7.setBackground(Color.DARK_GRAY);
		panel8.setBackground(Color.gray);
		panel9.setBackground(Color.LIGHT_GRAY);
		panel10.setBackground(Color.magenta);
		
		panel3.setLayout(new BorderLayout());
		
		panel6.setPreferredSize(new Dimension(50,50));
		panel7.setPreferredSize(new Dimension(50,50));
		panel8.setPreferredSize(new Dimension(50,50));
		panel9.setPreferredSize(new Dimension(50,50));
		panel10.setPreferredSize(new Dimension(50,50));
		
		panel3.add(panel6, BorderLayout.NORTH);
		panel3.add(panel7, BorderLayout.SOUTH);
		panel3.add(panel8, BorderLayout.CENTER);
		panel3.add(panel9, BorderLayout.EAST);
		panel3.add(panel10, BorderLayout.WEST);
		
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.SOUTH);
		frame.add(panel3, BorderLayout.CENTER);
		frame.add(panel4, BorderLayout.EAST);
		frame.add(panel5, BorderLayout.WEST);
		
	}

}
