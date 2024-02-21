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
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class HomeScreen extends JFrame implements ActionListener {
JPanel homeScreen;
	JPanel menu;
	JPanel intro;
	
	JLabel title;
	JLabel description;
	
	JButton singlePlayer;
	JButton twoPlayer;
	JButton settings;
	JButton credits;
	
	ImageIcon background;
	JLabel screen;


JPanel creditScreen;
	JButton goHome,exit;

JPanel settingScreen;
	JPanel playerSelect; // make flowlayout radio buttons
		JLabel playerSelectText;
			ButtonGroup group;
				JRadioButton X,O;
	
	JPanel botDifficulty;
		JLabel botText, disclaimer;
			ButtonGroup botGroup;
				JRadioButton easy, hard, impossible;

JPanel twoPlayerScreen;
	JPanel gamePanel;
		JButton box1,box2,box3,box4,box5,box6,box7,box8,box9;
			JPanel announcePanel;
				JLabel container;
			
ImageIcon iconX, iconO, iconBlank, winner;

JPanel singlePlayerScreen;
	HomeScreen() {
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setSize(1332,750);
		
	// SettingPage Radio Buttons
		// bot difficulty level
			botDifficulty = new JPanel();
			botDifficulty.setBounds(25,175,400,75);
			botDifficulty.setBackground(Color.gray);
				botGroup = new ButtonGroup();
					easy = new JRadioButton();
						easy.setText("Easy Mode");
						easy.setBounds(0,0,25,25);
						easy.addActionListener(this);
						easy.setFocusable(false);
					hard = new JRadioButton();
						hard.setText("Hard Mode");
						easy.setBounds(0,0,25,25);
						hard.addActionListener(this);
						hard.setFocusable(false);
					impossible = new JRadioButton();
						impossible.setText("Impossible Mode (try three games at least with this mode)");
						impossible.setBounds(0,0,50,25);
						impossible.addActionListener(this);
						impossible.setFocusable(false);
				botGroup.add(easy);
				botGroup.add(hard);
				botGroup.add(impossible);
			botDifficulty.add(easy);
			botDifficulty.add(hard);
			botDifficulty.add(impossible);
				
		// player select
		playerSelectText = new JLabel();
		playerSelectText.setText("What would you like to play as?");
		X = new JRadioButton();
			X.setText("Play as X");
			X.setBounds(0,0,25,25);
			X.addActionListener(this);
		O = new JRadioButton();
			O.setText("Play as O");
			O.setBounds(0,0,25,25);
			O.addActionListener(this);
				group = new ButtonGroup();
					group.add(X);
					group.add(O);

		playerSelect = new JPanel();
		playerSelect.setBackground(Color.LIGHT_GRAY);
		playerSelect.setLayout(new FlowLayout(FlowLayout.LEADING, 10, 10 ));
		playerSelect.setBounds(25,75,200,75);
		playerSelect.add(playerSelectText);
		playerSelect.add(O);
		playerSelect.add(X);
	// AllPage
		goHome = new JButton("Back");
		goHome.setBounds(25,10, 100,50);
		goHome.addActionListener(this);
		goHome.setFocusable(false);
		
		exit = new JButton("Exit");
		exit.setBounds(130, 10, 100,50);
		exit.addActionListener(this);
		
	// Credits Page
		creditScreen = new JPanel();
		creditScreen.setSize(getSize());
		creditScreen.setLayout(null);
		creditScreen.setBackground(new Color(222,184,135));
		
	// Settings Page
		settingScreen = new JPanel();
		settingScreen.setSize(getSize());
		settingScreen.setLayout(null);
		settingScreen.setBackground(new Color(222,184,135));
		settingScreen.add(playerSelect);
		settingScreen.add(botDifficulty);
			
			
	// Single-Player Page
		singlePlayerScreen = new JPanel();
			singlePlayerScreen.setSize(getSize());
			singlePlayerScreen.setLayout(null);
			singlePlayerScreen.setBackground(new Color(222,184,135));
	// Two-Player Page
			
		//box1.setIcon(iconO); these are for later
		//box1.setSelectedIcon(iconX);
		twoPlayerScreen = new JPanel();
			twoPlayerScreen.setSize(getSize());
			twoPlayerScreen.setLayout(null);
			twoPlayerScreen.setBackground(new Color(222,184,135));
		
		// current ideas
			// maybe could use buttons. easier to see on gridlayout and
			// basically you could say like if u press it then the button
			// shouldnt be visible anymore and also shouldnt be able to be
			// used anymore either. then replace with image and depending
			// on counter if odd or even or you could use a boolean if
			// true or false. remember all these box_# panels are useless
			// and also time consuming and they dont make sense. just use 
			// buttons because for some reason they take up the entire space
			// or maybe we could have used like setHorizontalAlignment and stuff
			// but just keep at it ig
		
		// background image
		background = new ImageIcon("backGround.gif");
		screen = new JLabel(background);
		
		
		// homescreen
		homeScreen = new JPanel();
		homeScreen.setLayout(null);
		homeScreen.setSize(getSize());
		
		
		// Title and description
		intro = new JPanel();
		intro.setBounds(450,250,500,60);
		intro.setBackground(Color.green);
		intro.setBorder(BorderFactory.createLineBorder(new Color(0,0,255), 3));
		
		title = new JLabel();
		title.setBounds(0,0,500,200);
		title.setText("A TicTacToe Game");
		title.setFont(new Font("MV Boli", Font.PLAIN, 36));

		
		description = new JLabel();
		description.setText("Made in Java Swing");
		description.setHorizontalAlignment(SwingConstants.CENTER);
		description.setVerticalAlignment(SwingConstants.CENTER);
		description.setBackground(new Color(0,150,255));
		description.setOpaque(true);
		description.setFont(new Font("SansSerif", Font.BOLD, 24));
		description.setForeground(Color.black);
		description.setBounds(550,318,300,60);
		description.setBorder(BorderFactory.createLineBorder(Color.green, 3));
		
			// end of title and description
		
		
		// menu
		menu = new JPanel();
		menu.setBounds(450,385,500,120);
		menu.setBackground(Color.orange);
		menu.setLayout(new GridLayout(2,2,10,10));
		menu.setBorder(BorderFactory.createLineBorder(Color.orange, 10));
		
		singlePlayer = new JButton("Single-Player");
		twoPlayer = new JButton("Two-Player");
		settings = new JButton("Settings");
		credits = new JButton("Credits");
			singlePlayer.setFocusable(false);
			twoPlayer.setFocusable(false);
			settings.setFocusable(false);
			credits.setFocusable(false);
				singlePlayer.setFont(new Font("Arial", Font.PLAIN, 20));
				twoPlayer.setFont(new Font("Arial", Font.PLAIN, 20));
				settings.setFont(new Font("Arial", Font.PLAIN, 20));
				credits.setFont(new Font("Arial", Font.PLAIN, 20));
					singlePlayer.setBorder(BorderFactory.createEtchedBorder(Color.black, Color.gray));
					twoPlayer.setBorder(BorderFactory.createEtchedBorder(Color.black, Color.gray));
					settings.setBorder(BorderFactory.createEtchedBorder(Color.black, Color.gray));
					credits.setBorder(BorderFactory.createEtchedBorder(Color.black, Color.gray));
						singlePlayer.addActionListener(this);
						twoPlayer.addActionListener(this);
						settings.addActionListener(this);
						credits.addActionListener(this);
		menu.add(singlePlayer);
		menu.add(twoPlayer);
		menu.add(settings);
		menu.add(credits);
		
		intro.add(title);
		
		homeScreen.add(intro);
		homeScreen.add(description);
		homeScreen.add(menu);
		
		screen.setBounds(0,0,homeScreen.getWidth(), homeScreen.getHeight());
		
		homeScreen.add(screen);
		this.add(homeScreen);
		this.getContentPane().setBackground(Color.blue);
		this.setLayout(null);
		this.setResizable(false);
		this.setVisible(true);
	}
	int counter = 0;
	boolean Easy = false;
	boolean Hard = false;
	boolean Impossible = false;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		/*
		  Default:
		  	goHome.setVisible(true);
			exit.setVisible(true);	
			homeScreen.setVisible(false);
				// variations go here
			this.add(exit);
			this.add(goHome);
		*/
		if(e.getSource()==singlePlayer) {
			if(impossible.isSelected()) {
				new AI_ImpossibleMode();
			}
		}
		// Single-Player
		if(e.getSource()==impossible) {
			Impossible = true;
		}
		
		// Two-Player
			// opening * exiting page
		if(e.getSource()==twoPlayer) {
			goHome.setVisible(true);
			exit.setVisible(true);	
			homeScreen.setVisible(false);
			twoPlayerScreen.setVisible(true);
			this.add(exit);
			this.add(goHome);	
			this.add(twoPlayerScreen);
			
			if(X.isSelected()) {
				new Game_X();
			} else if(O.isSelected()) {
				new Game_O();
			} else {
				new Game_X();
			}
			
		}	
			
		// Credits Page
		if(e.getSource()==credits) {
			goHome.setVisible(true);
			exit.setVisible(true);	
			homeScreen.setVisible(false);
			creditScreen.setVisible(true);
			this.add(exit);
			this.add(goHome);	
			this.add(creditScreen);
		}
		
		// Settings Page
		if(e.getSource()==settings) {
			goHome.setVisible(true);
			exit.setVisible(true);
			homeScreen.setVisible(false);
			settingScreen.setVisible(true);
			playerSelect.setVisible(true);
			this.add(playerSelect);
			this.add(exit);
			this.add(goHome);	
			this.add(settingScreen);
		}
		
		// All Page
		if(e.getSource()==goHome) {
			homeScreen.setVisible(true);
				creditScreen.setVisible(false);
				settingScreen.setVisible(false);
				twoPlayerScreen.setVisible(false);
				playerSelect.setVisible(false);
			goHome.setVisible(false);
			exit.setVisible(false);
		}
		if(e.getSource()==exit) {
			System.exit(0);
		}
	}
	
}
