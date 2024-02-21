package testing_learning.JavaSwingGUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class ColorFrame extends JFrame implements ActionListener {
	
	JButton button;
	JLabel label;
	
	ColorFrame() {
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Pick a Color!");
		label = new JLabel();
		
		label.setOpaque(true);
		label.setBackground(new Color(255,255,255));
		label.setText("Wow isn't this a nice label");
		label.setFont(new Font("MV Boli", Font.PLAIN, 75));
		
		button.addActionListener(this);
		
		this.add(button);
		this.add(label);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			JColorChooser colorChooser = new JColorChooser();
			
			Color color = JColorChooser.showDialog(null, "Hey", Color.black);

			// label.setForeground(color);
			label.setBackground(color);
		}
		
	}
}
