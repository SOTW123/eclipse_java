package testing_learning.JavaSwingGUI;

import javax.swing.JOptionPane;

public class JOptionPane_Lesson {

	public static void main(String[] args) {
		
		// JOptionPane is a pop up dialog box that prompts the user for 
		// 			   a value or informs them of something like alert();
		
	// ALERTS
		// JOptionPane.showMessageDialog(null, "Message Content", "Title", JOptionPane.PLAIN_MESSAGE);
			// PLAIN
			// INFORMATION
			// QUESTION
			// WARNING
			// ERROR 
		// they have different icons
		
	// YES/NO BOX
		// 0 : yes
		// 1 : no
		// 2 : cancel
		// -1: X (close)
		int option = JOptionPane.showConfirmDialog(null, "drink", "yeah i said it", JOptionPane.INFORMATION_MESSAGE);
		
	// Input Box
		String name = JOptionPane.showInputDialog("What is your name?");
		
	// create your own button/button text	
			// we need to make a string array for the everythin of the button	
		String[] responses = {"Suck", "My", "Wiener"};
		
	// combines all of them
		JOptionPane.showOptionDialog(
				null, 
				"Message.", 
				"Title", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, 
				null, // image
				responses, 
				0);
																																// Icon,Options,Initial Value
																												 //,for Buttons   
	
		
	}

}
