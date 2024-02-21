package tic_tac_toe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Game_X extends JFrame implements ActionListener, MouseListener {
	JButton box1,box2,box3,box4,box5,box6,box7,box8,box9;
	JPanel gamePanel;
	JPanel announcePanel;
		JLabel backGround;
			ImageIcon screen;
				JPanel announcer;
					JLabel winner;
	
	Game_X() {
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
		winner.setFont(new Font("SansSerif", Font.BOLD, 48));
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
				box1.setBackground(new Color(0, 71, 171));
				box2.setBackground(new Color(0, 71, 171));
				box3.setBackground(new Color(0, 71, 171));
				box4.setBackground(new Color(0, 71, 171));
				box5.setBackground(new Color(0, 71, 171));
				box6.setBackground(new Color(0, 71, 171));
				box7.setBackground(new Color(0, 71, 171));
				box8.setBackground(new Color(0, 71, 171));
				box9.setBackground(new Color(0, 71, 171));
				
		box1.addActionListener(this);
		box2.addActionListener(this);
		box3.addActionListener(this);
		box4.addActionListener(this);
		box5.addActionListener(this);
		box6.addActionListener(this);
		box7.addActionListener(this);
		box8.addActionListener(this);
		box9.addActionListener(this);
			box1.addMouseListener(this);
			box2.addMouseListener(this);
			box3.addMouseListener(this);
			box4.addMouseListener(this);
			box5.addMouseListener(this);
			box6.addMouseListener(this);
			box7.addMouseListener(this);
			box8.addMouseListener(this);
			box9.addMouseListener(this);
			
		
		
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
	
	int counter = 0;
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
					box1.setForeground(Color.red);
					box1.setFont(new Font("SansSerif", Font.BOLD, 90));
				box1.removeActionListener(this);
				counter++;
			}
			if(e.getSource()==box2) {
				two = true;
					box2.setText("X");
					box2.setForeground(Color.red);
					box2.setFont(new Font("SansSerif", Font.BOLD, 90));
				box2.removeActionListener(this);
				counter++;
			}
			if(e.getSource()==box3) {
				three = true;
					box3.setText("X");
					box3.setForeground(Color.red);
					box3.setFont(new Font("SansSerif", Font.BOLD, 90));
				box3.removeActionListener(this);
				counter++;
			}
			if(e.getSource()==box4) {
				four = true;
					box4.setText("X");
					box4.setForeground(Color.red);
					box4.setFont(new Font("SansSerif", Font.BOLD, 90));
				box4.removeActionListener(this);
				counter++;
			}
			if(e.getSource()==box5) {
				five = true;
					box5.setText("X");
					box5.setForeground(Color.red);
					box5.setFont(new Font("SansSerif", Font.BOLD, 90));
				box5.removeActionListener(this);
				counter++;
			}
			if(e.getSource()==box6) {
				six = true;
					box6.setText("X");
					box6.setForeground(Color.red);
					box6.setFont(new Font("SansSerif", Font.BOLD, 90));
				box6.removeActionListener(this);
				counter++;
			}
			if(e.getSource()==box7) {
				seven = true;
					box7.setText("X");
					box7.setForeground(Color.red);
					box7.setFont(new Font("SansSerif", Font.BOLD, 90));
				box7.removeActionListener(this);
				counter++;
			}
			if(e.getSource()==box8) {
				eight = true;
					box8.setText("X");
					box8.setForeground(Color.red);
					box8.setFont(new Font("SansSerif", Font.BOLD, 90));
				box8.removeActionListener(this);
				counter++;
			}
			if(e.getSource()==box9) {
				nine = true;
					box9.setText("X");
					box9.setForeground(Color.red);
					box9.setFont(new Font("SansSerif", Font.BOLD, 90));
				box9.removeActionListener(this);
				counter++;
			}
		}
		else if (counter % 2 != 0) {
			if(e.getSource()==box1) {
				one = true;
					box1.setText("O");
					box1.setForeground(Color.blue);
					box1.setFont(new Font("SansSerif", Font.BOLD, 90));
				box1.removeActionListener(this);
				counter++;
			}
			if(e.getSource()==box2) {
				two = true;
					box2.setText("O");
					box2.setForeground(Color.blue);
					box2.setFont(new Font("SansSerif", Font.BOLD, 90));
				box2.removeActionListener(this);
				counter++;
			}
			if(e.getSource()==box3) {
				three = true;
					box3.setText("O");
					box3.setForeground(Color.blue);
					box3.setFont(new Font("SansSerif", Font.BOLD, 90));
				box3.removeActionListener(this);
				counter++;
			}
			if(e.getSource()==box4) {
				four = true;
					box4.setText("O");
					box4.setForeground(Color.blue);
					box4.setFont(new Font("SansSerif", Font.BOLD, 90));
				box4.removeActionListener(this);
				counter++;
			}
			if(e.getSource()==box5) {
				five = true;
					box5.setText("O");
					box5.setForeground(Color.blue);
					box5.setFont(new Font("SansSerif", Font.BOLD, 90));
				box5.removeActionListener(this);
				counter++;
			}
			if(e.getSource()==box6) {
				six = true;
					box6.setText("O");
					box6.setForeground(Color.blue);
					box6.setFont(new Font("SansSerif", Font.BOLD, 90));
				box6.removeActionListener(this);
				counter++;
			}
			if(e.getSource()==box7) {
				seven = true;
					box7.setText("O");
					box7.setForeground(Color.blue);
					box7.setFont(new Font("SansSerif", Font.BOLD, 90));
				box7.removeActionListener(this);
				counter++;
			}
			if(e.getSource()==box8) {
				eight = true;
					box8.setText("O");
					box8.setForeground(Color.blue);
					box8.setFont(new Font("SansSerif", Font.BOLD, 90));
				box8.removeActionListener(this);
				counter++;
			}
			if(e.getSource()==box9) {
				nine = true;
					box9.setText("O");
					box9.setForeground(Color.blue);
					box9.setFont(new Font("SansSerif", Font.BOLD, 90));
				box9.removeActionListener(this);
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

			
			box4.removeActionListener(this);
			box5.removeActionListener(this);
			box6.removeActionListener(this);
			box7.removeActionListener(this);
			box8.removeActionListener(this);
			box9.removeActionListener(this);
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
			
			box1.removeActionListener(this);
			box2.removeActionListener(this);
			box3.removeActionListener(this);
			box7.removeActionListener(this);
			box8.removeActionListener(this);
			box9.removeActionListener(this);
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
			
			box1.removeActionListener(this);
			box2.removeActionListener(this);
			box3.removeActionListener(this);
			box4.removeActionListener(this);
			box5.removeActionListener(this);
			box6.removeActionListener(this);
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

			
			box4.removeActionListener(this);
			box5.removeActionListener(this);
			box6.removeActionListener(this);
			box7.removeActionListener(this);
			box8.removeActionListener(this);
			box9.removeActionListener(this);
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
			
			box1.removeActionListener(this);
			box2.removeActionListener(this);
			box3.removeActionListener(this);
			box7.removeActionListener(this);
			box8.removeActionListener(this);
			box9.removeActionListener(this);
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
			
			box1.removeActionListener(this);
			box2.removeActionListener(this);
			box3.removeActionListener(this);
			box4.removeActionListener(this);
			box5.removeActionListener(this);
			box6.removeActionListener(this);
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
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		box1.setBackground(new Color(0, 150, 255));
		box2.setBackground(new Color(0, 150, 255));
		box3.setBackground(new Color(0, 150, 255));
		box4.setBackground(new Color(0, 150, 255));
		box5.setBackground(new Color(0, 150, 255));
		box6.setBackground(new Color(0, 150, 255));
		box7.setBackground(new Color(0, 150, 255));
		box8.setBackground(new Color(0, 150, 255));
		box9.setBackground(new Color(0, 150, 255));
		
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		
		
	}
}
