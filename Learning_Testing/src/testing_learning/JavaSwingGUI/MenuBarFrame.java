package testing_learning.JavaSwingGUI;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;

public class MenuBarFrame extends JFrame implements ActionListener {
	JMenuBar menu;
	
	JMenu file;
	JMenu edit;
	JMenu help;
	
	JMenuItem newFile;
	JMenuItem openFile;
	JMenuItem saveFile;
	
	MenuBarFrame() {
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setSize(new Dimension(500,500));
		this.setLayout(new FlowLayout());
		
		menu = new JMenuBar();
		
		// adding menus to menu bar
		file = new JMenu("File");
		edit = new JMenu("Edit");
		help = new JMenu("Help");
		
		// adding actionListener
		
		
		// add menu items
			// USE IMAGES ON MENU ITEMS
		newFile = new JMenuItem("New File");
		openFile = new JMenuItem("Open File");
		saveFile = new JMenuItem("Save/Save As...");
		
		newFile.addActionListener(this);
		openFile.addActionListener(this);
		saveFile.addActionListener(this);
		
		newFile.setMnemonic(KeyEvent.VK_N);
		openFile.setMnemonic(KeyEvent.VK_O);
		saveFile.setMnemonic(KeyEvent.VK_S);
		
		file.add(newFile);
		file.add(openFile);
		file.add(saveFile);
		
		menu.add(file);
		menu.add(edit);
		menu.add(help);
		
		this.setJMenuBar(menu);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==newFile) {
			System.out.println("Creating a New File");
		}
		if(e.getSource()==openFile) {
			System.out.println("Opening a File");
		}
		if(e.getSource()==saveFile) {
			System.out.println("Saving the File");
		}
		
		
	}

}
