package testing_learning.JavaSwingGUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class MyFrame extends JFrame implements ActionListener {
	JButton button;
	JTextField field;
	JLabel label;
	MyFrame() {
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		/* just a JLabel
		 * Key tips: make sure to add the label at the end
		label = new JLabel();
		label.setText("you're gonna start sucking this cock");
		label.setBounds(100,100,100,100);
		label.setVisible(false);
		*/
		
		button = new JButton("Submit");
		button.addActionListener(this);
		
		field = new JTextField();
		field.setPreferredSize(new Dimension(250,40));
		field.setFont(new Font("Times New Roman", Font.BOLD, 25));
		field.setForeground(Color.white);
		field.setBackground(Color.black);
		field.setCaretColor(Color.white); // sets the | thingy idk
		field.setSelectedTextColor(Color.green);
		field.setText("whadya wanna do"); // sets pretext

		
		this.setSize(500,500);
		this.add(button);
		this.add(field);
		// this.add(label);
		this.pack();
		this.setVisible(true);

	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println("Welcome " + field.getText());
			button.setEnabled(false);
			field.setEditable(false);
			// label.setVisible(true);
		}
		
	}

}
