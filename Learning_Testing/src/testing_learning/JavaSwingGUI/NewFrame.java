package testing_learning.JavaSwingGUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class NewFrame extends JFrame implements ActionListener {
	JCheckBox box;
	JButton button;
	ImageIcon Gay;
	ImageIcon Safe;
	
	NewFrame() {
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		Gay = new ImageIcon("gay.jpg");
		Safe = new ImageIcon("safe.png");
		
		button = new JButton("Submit");
		button.addActionListener(this);
		
		box = new JCheckBox("are you gay");
		// box.setText("");
		box.setFocusable(false); // takes away annoying text border
		box.setFont(new Font("Comic Sans", Font.PLAIN, 35));
		box.setIcon(Safe);
		box.setSelectedIcon(Gay);
		
		this.add(button);
		this.add(box);
		this.pack();
		this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println(box.isSelected());
		}
		
	}

}

	/*
	this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	this.setLayout(new FlowLayout());
	this.pack();
	this.setVisible(true);
	*/