package myJavaGUIs;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Game extends JFrame implements ActionListener {
	JPanel mainPanel;
	JPanel gamePanel;
	
	JCheckBox box1;
	JCheckBox box2;
	JCheckBox box3;
	JCheckBox box4;
	JCheckBox box5;
	JCheckBox box6;
	JCheckBox box7;
	JCheckBox box8;
	JCheckBox box9;
	
	Game() {
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setSize(850,750);
		
		mainPanel = new JPanel();
		gamePanel = new JPanel();
		
		gamePanel.setLayout(new GridLayout(3,3,10,10));
		box1 = new JCheckBox();
		box2 = new JCheckBox();
		box3 = new JCheckBox();
		box4 = new JCheckBox();
		box5 = new JCheckBox();
		box6 = new JCheckBox();
		box7 = new JCheckBox();
		box8 = new JCheckBox();
		box9 = new JCheckBox();
		
		// adding checkboxes to gamePanel
		gamePanel.add(box1);
		gamePanel.add(box2);
		gamePanel.add(box3);
		gamePanel.add(box4);
		gamePanel.add(box5);
		gamePanel.add(box6);
		gamePanel.add(box7);
		gamePanel.add(box8);
		gamePanel.add(box9);
		
		mainPanel.add(gamePanel);
		this.add(mainPanel);
		this.setLayout(null);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
