package testing_learning.JavaSwingGUI;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class JLayeredPanes {

	public static void main(String[] args) {
		// JLayered Pane is basically the third dimension.
		// - depth, z index | [wtv u wanna call it]
		
		// lets add labels to our layeredFrame!!!
		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.red);
		label1.setBounds(50,50,200,200);
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.blue);
		label2.setBounds(100,100,200,200);
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.green);
		label3.setBounds(150,150,200,200);
		
		// creating jlayeredframe
		JLayeredPane pane = new JLayeredPane();
		pane.setBounds(0, 0, 500,500);
		
		//
		pane.add(label1, Integer.valueOf(0)); // JLayeredPane.DEFAULT_LAYER
		pane.add(label2, Integer.valueOf(1)); // JLayeredPane.DEFAULT_LAYER
		pane.add(label3, Integer.valueOf(2)); // JLayeredPane.DRAG_LAYER
			// the higher the number the topper it is. highest number is in front of all
		
		
		// creating frame
		JFrame frame = new JFrame("JLayeredPane");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500); 
		frame.setLayout(null);
		
		// adding layeredpane
		frame.add(pane);
		
		
		
		frame.setVisible(true);
	}

}
