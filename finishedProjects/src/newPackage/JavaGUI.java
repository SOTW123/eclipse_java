package newPackage;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JavaGUI {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Siyam's GUI");
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(500,500);
		frame.setVisible(true);
		
		ImageIcon image = new ImageIcon("CET.jpg");
		frame.setIconImage(image.getImage());
		frame.getContentPane().setBackground(new Color(0, 128, 255));
// 0 128 255
	}

}
