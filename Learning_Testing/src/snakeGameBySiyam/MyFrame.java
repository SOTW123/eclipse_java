package snakeGameBySiyam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements KeyListener {
	JPanel panel;
	JLabel snakeBody;
		Point currPoint = snakeBody.getLocation();
	
	MyFrame obj;
	
	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setResizable(false);
		this.setBackground(Color.black);
		
		snakeBody = new JLabel();
		snakeBody.setBounds(200,200,15,15);
				   // left right, up down
		snakeBody.setBackground(Color.red);
		snakeBody.setOpaque(true);

		
		this.add(snakeBody);
		this.setVisible(true);
		this.addKeyListener(this);
		
		
	}
	
	private boolean isOver() {
		if(currPoint.getX() == 0) {
			System.out.println("game over");
		}
		return false;
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
