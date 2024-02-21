package tic_tac_toe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Game_O extends JFrame implements ActionListener {
	JButton box1,box2,box3,box4,box5,box6,box7,box8,box9;
	JPanel gamePanel;
	JPanel announcePanel;
		JLabel backGround;
			ImageIcon screen;
				JPanel announcer;
					JLabel winner;
	
	Game_O() {
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setResizable(false);
		
		screen = new ImageIcon("backGround.gif");
		
		announcePanel = new JPanel();
		announcePanel.setBounds(0,0,500,82);
		announcePanel.setLayout(null);
		announcePanel.setBackground(Color.black);
			backGround = new JLabel();
			backGround.setIcon(screen);
			
		
		winner = new JLabel();
		winner.setLayout(null);
		winner.setHorizontalAlignment(SwingConstants.CENTER);
		winner.setForeground(Color.black);
		winner.setBounds(150,0,200,100);
		winner.setFont(new Font("Arial", Font.BOLD, 48));
		winner.setOpaque(true);
		winner.setVisible(false);


		announcePanel.add(winner);
		announcePanel.add(backGround);
		
		
		gamePanel = new JPanel();
		gamePanel.setBounds(0,82,500,500);
		gamePanel.setLayout(new GridLayout(3,3,10,10));
		gamePanel.setBorder(BorderFactory.createLineBorder(Color.black));
		gamePanel.setBackground(Color.black);
		
		// creation of buttons
		box1 = new JButton();
		box2 = new JButton();
		box3 = new JButton();
		box4 = new JButton();
		box5 = new JButton();
		box6 = new JButton();
		box7 = new JButton();
		box8 = new JButton();
		box9 = new JButton();
			/// annoying text border
			box1.setFocusable(false);
			box2.setFocusable(false);
			box3.setFocusable(false);
			box4.setFocusable(false);
			box5.setFocusable(false);
			box6.setFocusable(false);
			box7.setFocusable(false);
			box8.setFocusable(false);
			box9.setFocusable(false);
				// button background
				box1.setBackground(Color.orange);
				box2.setBackground(Color.orange);
				box3.setBackground(Color.orange);
				box4.setBackground(Color.orange);
				box5.setBackground(Color.orange);
				box6.setBackground(Color.orange);
				box7.setBackground(Color.orange);
				box8.setBackground(Color.orange);
				box9.setBackground(Color.orange);
				
		box1.addActionListener(this);
		box2.addActionListener(this);
		box3.addActionListener(this);
		box4.addActionListener(this);
		box5.addActionListener(this);
		box6.addActionListener(this);
		box7.addActionListener(this);
		box8.addActionListener(this);
		box9.addActionListener(this);
		
		gamePanel.add(box1);
		gamePanel.add(box2);
		gamePanel.add(box3);
		gamePanel.add(box4);
		gamePanel.add(box5);
		gamePanel.add(box6);
		gamePanel.add(box7);
		gamePanel.add(box8);
		gamePanel.add(box9);
		
		
		
		this.setSize(515,620);
		this.add(announcePanel);
		this.add(gamePanel);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	int counter = 1;
	@Override
	public void actionPerformed(ActionEvent e) {
		boolean one = false;
		boolean two = false;
		boolean three = false;
		boolean four = false;
		boolean five = false;
		boolean six = false;
		boolean seven = false;
		boolean eight = false;
		boolean nine = false;
		
		if(counter % 2 == 0) {
			if(e.getSource()==box1) {
				one = true;
					box1.setText("X");
					box1.setFont(new Font("MV Boli", Font.BOLD, 90));
				box1.setEnabled(false);
				counter++;
			}
			if(e.getSource()==box2) {
				two = true;
					box2.setText("X");
					box2.setFont(new Font("MV Boli", Font.BOLD, 90));
				box2.setEnabled(false);
				counter++;
			}
			if(e.getSource()==box3) {
				three = true;
					box3.setText("X");
					box3.setFont(new Font("MV Boli", Font.BOLD, 90));
				box3.setEnabled(false);
				counter++;
			}
			if(e.getSource()==box4) {
				four = true;
					box4.setText("X");
					box4.setFont(new Font("MV Boli", Font.BOLD, 90));
				box4.setEnabled(false);
				counter++;
			}
			if(e.getSource()==box5) {
				five = true;
					box5.setText("X");
					box5.setFont(new Font("MV Boli", Font.BOLD, 90));
				box5.setEnabled(false);
				counter++;
			}
			if(e.getSource()==box6) {
				six = true;
					box6.setText("X");
					box6.setFont(new Font("MV Boli", Font.BOLD, 90));
				box6.setEnabled(false);
				counter++;
			}
			if(e.getSource()==box7) {
				seven = true;
					box7.setText("X");
					box7.setFont(new Font("MV Boli", Font.BOLD, 90));
				box7.setEnabled(false);
				counter++;
			}
			if(e.getSource()==box8) {
				eight = true;
					box8.setText("X");
					box8.setFont(new Font("MV Boli", Font.BOLD, 90));
				box8.setEnabled(false);
				counter++;
			}
			if(e.getSource()==box9) {
				nine = true;
					box9.setText("X");
					box9.setFont(new Font("MV Boli", Font.BOLD, 90));
				box9.setEnabled(false);
				counter++;
			}
		}
		else if (counter % 2 != 0) {
			if(e.getSource()==box1) {
				one = true;
					box1.setText("O");
					box1.setFont(new Font("MV Boli", Font.BOLD, 90));
				box1.setEnabled(false);
				counter++;
			}
			if(e.getSource()==box2) {
				two = true;
					box2.setText("O");
					box2.setFont(new Font("MV Boli", Font.BOLD, 90));
				box2.setEnabled(false);
				counter++;
			}
			if(e.getSource()==box3) {
				three = true;
					box3.setText("O");
					box3.setFont(new Font("MV Boli", Font.BOLD, 90));
				box3.setEnabled(false);
				counter++;
			}
			if(e.getSource()==box4) {
				four = true;
					box4.setText("O");
					box4.setFont(new Font("MV Boli", Font.BOLD, 90));
				box4.setEnabled(false);
				counter++;
			}
			if(e.getSource()==box5) {
				five = true;
					box5.setText("O");
					box5.setFont(new Font("MV Boli", Font.BOLD, 90));
				box5.setEnabled(false);
				counter++;
			}
			if(e.getSource()==box6) {
				six = true;
					box6.setText("O");
					box6.setFont(new Font("MV Boli", Font.BOLD, 90));
				box6.setEnabled(false);
				counter++;
			}
			if(e.getSource()==box7) {
				seven = true;
					box7.setText("O");
					box7.setFont(new Font("MV Boli", Font.BOLD, 90));
				box7.setEnabled(false);
				counter++;
			}
			if(e.getSource()==box8) {
				eight = true;
					box8.setText("O");
					box8.setFont(new Font("MV Boli", Font.BOLD, 90));
				box8.setEnabled(false);
				counter++;
			}
			if(e.getSource()==box9) {
				nine = true;
					box9.setText("O");
					box9.setFont(new Font("MV Boli", Font.BOLD, 90));
				box9.setEnabled(false);
				counter++;
			}
		}
		
		// x rows
		if(box1.getText().equals("X") && box2.getText().equals("X") && box3.getText().equals("X")) {
			box1.setBackground(Color.green);
			box2.setBackground(Color.green);
			box3.setBackground(Color.green);
				box1.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				box2.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				box3.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
			winner.setVisible(true);
			winner.setText("X wins!");
			winner.setBackground(Color.blue);

			
			box4.setEnabled(false);
			box5.setEnabled(false);
			box6.setEnabled(false);
			box7.setEnabled(false);
			box8.setEnabled(false);
			box9.setEnabled(false);
		}
		if(box4.getText().equals("X") && box5.getText().equals("X") && box6.getText().equals("X")) {
			box4.setBackground(Color.green);
			box5.setBackground(Color.green);
			box6.setBackground(Color.green);
				box4.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				box5.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				box6.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				
			winner.setVisible(true);
			winner.setText("X wins!");
			winner.setBackground(Color.blue);
			
			box1.setEnabled(false);
			box2.setEnabled(false);
			box3.setEnabled(false);
			box7.setEnabled(false);
			box8.setEnabled(false);
			box9.setEnabled(false);
		}
		if(box7.getText().equals("X") && box8.getText().equals("X") && box9.getText().equals("X")) {
			box7.setBackground(Color.green);
			box8.setBackground(Color.green);
			box9.setBackground(Color.green);
				box7.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				box8.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				box9.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));

				winner.setVisible(true);
				winner.setText("X wins!");
				winner.setBackground(Color.blue);
			
			box1.setEnabled(false);
			box2.setEnabled(false);
			box3.setEnabled(false);
			box4.setEnabled(false);
			box5.setEnabled(false);
			box6.setEnabled(false);
		}
		// make for O 
		// make for X
		if(box1.getText().equals("X") && box4.getText().equals("X") && box7.getText().equals("X")) {
			box1.setBackground(Color.green);
			box4.setBackground(Color.green);
			box7.setBackground(Color.green);
				box1.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				box4.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				box7.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				winner.setVisible(true);
				winner.setText("X wins!");
				winner.setBackground(Color.blue);
		}
		if(box2.getText().equals("X") && box5.getText().equals("X") && box8.getText().equals("X")) {
			box2.setBackground(Color.green);
			box5.setBackground(Color.green);
			box8.setBackground(Color.green);
				box2.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				box5.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				box8.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				winner.setVisible(true);
				winner.setText("X wins!");
				winner.setBackground(Color.blue);
		}
		if(box3.getText().equals("X") && box6.getText().equals("X") && box9.getText().equals("X")) {
			box3.setBackground(Color.green);
			box6.setBackground(Color.green);
			box9.setBackground(Color.green);
				box3.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				box6.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				box9.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				winner.setVisible(true);
				winner.setText("X wins!");
				winner.setBackground(Color.blue);
		}
		
		/// KAWAIII SUGOIIII
		
		if(box1.getText().equals("O") && box2.getText().equals("O") && box3.getText().equals("O")) {
			box1.setBackground(Color.green);
			box2.setBackground(Color.green);
			box3.setBackground(Color.green);
				box1.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				box2.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				box3.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
			winner.setVisible(true);
			winner.setText("O wins!");
			winner.setBackground(Color.blue);

			
			box4.setEnabled(false);
			box5.setEnabled(false);
			box6.setEnabled(false);
			box7.setEnabled(false);
			box8.setEnabled(false);
			box9.setEnabled(false);
		}
		if(box4.getText().equals("O") && box5.getText().equals("O") && box6.getText().equals("O")) {
			box4.setBackground(Color.green);
			box5.setBackground(Color.green);
			box6.setBackground(Color.green);
				box4.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				box5.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				box6.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				
			winner.setVisible(true);
			winner.setText("O wins!");
			winner.setBackground(Color.blue);
			
			box1.setEnabled(false);
			box2.setEnabled(false);
			box3.setEnabled(false);
			box7.setEnabled(false);
			box8.setEnabled(false);
			box9.setEnabled(false);
		}
		if(box7.getText().equals("O") && box8.getText().equals("O") && box9.getText().equals("O")) {
			box7.setBackground(Color.green);
			box8.setBackground(Color.green);
			box9.setBackground(Color.green);
				box7.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				box8.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				box9.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));

				winner.setVisible(true);
				winner.setText("O wins!");
				winner.setBackground(Color.blue);
			
			box1.setEnabled(false);
			box2.setEnabled(false);
			box3.setEnabled(false);
			box4.setEnabled(false);
			box5.setEnabled(false);
			box6.setEnabled(false);
		}
		// make for O 
		// make for X
		if(box1.getText().equals("O") && box4.getText().equals("O") && box7.getText().equals("O")) {
			box1.setBackground(Color.green);
			box4.setBackground(Color.green);
			box7.setBackground(Color.green);
				box1.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				box4.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				box7.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				winner.setVisible(true);
				winner.setText("O wins!");
				winner.setBackground(Color.blue);
		}
		if(box2.getText().equals("O") && box5.getText().equals("O") && box8.getText().equals("O")) {
			box2.setBackground(Color.green);
			box5.setBackground(Color.green);
			box8.setBackground(Color.green);
				box2.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				box5.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				box8.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				winner.setVisible(true);
				winner.setText("O wins!");
				winner.setBackground(Color.blue);
		}
		if(box3.getText().equals("O") && box6.getText().equals("O") && box9.getText().equals("O")) {
			box3.setBackground(Color.green);
			box6.setBackground(Color.green);
			box9.setBackground(Color.green);
				box3.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				box6.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				box9.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				winner.setVisible(true);
				winner.setText("O wins!");
				winner.setBackground(Color.blue);
		}
		
		if(box1.getText().equals("X") && box5.getText().equals("X") && box9.getText().equals("X")) {
			box1.setBackground(Color.green);
			box5.setBackground(Color.green);
			box9.setBackground(Color.green);
				box1.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				box5.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				box9.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				winner.setVisible(true);
				winner.setText("X wins!");
				winner.setBackground(Color.blue);
		}
		if(box3.getText().equals("X") && box5.getText().equals("X") && box7.getText().equals("X")) {
			box3.setBackground(Color.green);
			box5.setBackground(Color.green);
			box7.setBackground(Color.green);
				box3.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				box5.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				box7.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				winner.setVisible(true);
				winner.setText("X wins!");
				winner.setBackground(Color.blue);
		}
		
		if(box1.getText().equals("O") && box5.getText().equals("O") && box9.getText().equals("O")) {
			box1.setBackground(Color.green);
			box5.setBackground(Color.green);
			box9.setBackground(Color.green);
				box1.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				box5.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				box9.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				winner.setVisible(true);
				winner.setText("O wins!");
				winner.setBackground(Color.blue);
		}
		if(box3.getText().equals("O") && box5.getText().equals("O") && box7.getText().equals("O")) {
			box3.setBackground(Color.green);
			box5.setBackground(Color.green);
			box7.setBackground(Color.green);
				box3.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				box5.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				box7.setBorder(BorderFactory.createEtchedBorder(1, Color.red, Color.blue));
				winner.setVisible(true);
				winner.setText("O wins!");
				winner.setBackground(Color.blue);
		}
		
		
	}
}
