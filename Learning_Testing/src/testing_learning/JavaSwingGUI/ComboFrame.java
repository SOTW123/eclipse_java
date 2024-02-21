package testing_learning.JavaSwingGUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class ComboFrame extends JFrame implements ActionListener {
	JComboBox box;
	
	ComboFrame() {
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		String[] option = {"dog", "cat", "bird"};
		box = new JComboBox<>(option);
		box.addActionListener(this);
		
		// box.setEditable(true);
		// System.out.println(box.getItemCount());
		// box.addItem("Horse");
		// box.insertItemAt("Pig", 0);
		// box.setSelectedIndex(0); always gonna select index 0
		// box.removeItem("cat");
		// box.removeItemAt(0);
		// box.removeAllItems();
		
		this.add(box);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==box) {
			// System.out.println(box.getSelectedItem());
			// System.out.println(box.getSelectedIndex());
		}
		
	}
	
}
