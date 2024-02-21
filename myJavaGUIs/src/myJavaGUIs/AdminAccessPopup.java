package myJavaGUIs;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AdminAccessPopup extends JDialog {

    private JLabel label;
    private JButton button1, button2;

    public AdminAccessPopup() {
        super(null, "Admin Access Required", true);

        label = new JLabel("Please enter your admin credentials.");
        button1 = new JButton("OK");
        button2 = new JButton("Cancel");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Do something with the admin credentials.
                dispose();
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(label);
        getContentPane().add(button1);
        getContentPane().add(button2);

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        AdminAccessPopup popup = new AdminAccessPopup();
        popup.setVisible(true);
    }
}
