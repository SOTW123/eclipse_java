package testing_learning.JavaSwingGUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class SelectFrame extends JFrame implements ActionListener{
	JButton button;
	SelectFrame() {
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Select a File");
		button.addActionListener(this);
		button.setFocusable(false);
		
		this.add(button);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			JFileChooser chooser = new JFileChooser();
			
			// change default directory
			chooser.setCurrentDirectory(new File("C:\\Users\\SiyamZ\\Downloads"));
			
			
			int response = chooser.showSaveDialog(null);
								//.showOpenDialog : OPENS A FILE
			
			if(response == JFileChooser.APPROVE_OPTION) {
				File file = new File(chooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
			
			
		}
		
	}
}
