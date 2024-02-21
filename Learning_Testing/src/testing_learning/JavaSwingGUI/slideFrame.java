package testing_learning.JavaSwingGUI;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class slideFrame implements ChangeListener {
	
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	

	slideFrame() {
		frame = new JFrame("Slider");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0,100);
		
		slider.setPreferredSize(new Dimension(400,200));
		
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25);
		
		slider.setPaintLabels(true);
		slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
		
		
		slider.setOrientation(SwingConstants.VERTICAL);
		
		label.setFont(new Font("MV Boli", Font.PLAIN, 25));
		label.setText(slider.getValue() + " Degrees");
		
		slider.addChangeListener(this);
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(500,500);
		
		
		
		frame.setVisible(true);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		label.setText(slider.getValue() + " Degrees");
		
	}


}
