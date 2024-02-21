package testing_learning.JavaSwingGUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

public class RadioFrame extends JFrame implements ActionListener {
	
	JRadioButton pizza;
	JRadioButton burger;
	JRadioButton iceCream;
	
	ImageIcon pizza1;
	ImageIcon burger1;
	ImageIcon iceCream1;
	
	
	RadioFrame() {
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout(FlowLayout.LEADING, 10, 10 ));
		
		pizza1 = new ImageIcon("pizza.jpg");
		burger1 = new ImageIcon("burger.jpg");
		iceCream1 = new ImageIcon("ice cream.jpg");
		
		pizza = new JRadioButton();
			pizza.setText("Pizza");
			pizza.setIcon(pizza1);
		burger = new JRadioButton();
			burger.setText("Burger");
			burger.setIcon(burger1);
		iceCream = new JRadioButton();
			iceCream.setText("Ice Cream");
			iceCream.setIcon(iceCream1);
		
		ButtonGroup group = new ButtonGroup();
		group.add(burger);
		group.add(pizza);
		group.add(iceCream);
		
		pizza.addActionListener(this);
		burger.addActionListener(this);
		iceCream.addActionListener(this);
		
		this.add(pizza);
		this.add(burger);
		this.add(iceCream);
		this.pack();
		this.setVisible(true);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==pizza) {
			System.out.println("You ordered pizza");
		}
		else if(e.getSource()==burger) {
			System.out.println("You ordered burger");
		}
		else if(e.getSource()==iceCream) {
			System.out.println("You ordered ice cream");
		}
		
	}
}
