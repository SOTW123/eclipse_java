package testing_learning.JavaSwingGUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class KeyFrame extends JFrame implements KeyListener {
	JLabel label;
	
	KeyFrame() {
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		this.addKeyListener(this);
		label = new JLabel();
		label.setBounds(0,0,100,100);
		label.setBackground(new Color(255,0,0));
		label.setOpaque(true);
		
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// when the key is typed once
		switch(e.getKeyChar()) {
		case 'a': label.setLocation(label.getX()-100, label.getY()); break;
		case 'd': label.setLocation(label.getX()+100, label.getY()); break;
		case 'w': label.setLocation(label.getX(), label.getY()-100); break;
		case 's': label.setLocation(label.getX(), label.getY()+100); break;
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// when the key is held
		switch(e.getKeyCode()) {
		case 37: label.setLocation(label.getX()-100, label.getY()); break;
		case 39: label.setLocation(label.getX()+100, label.getY()); break;
		case 38: label.setLocation(label.getX(), label.getY()-100); break;
		case 40: label.setLocation(label.getX(), label.getY()+100); break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// when the key is released
			//System.out.println("You released key char: " + e.getKeyChar());
			//System.out.println("You released key code: " + e.getKeyCode());
		
		
	}
}
