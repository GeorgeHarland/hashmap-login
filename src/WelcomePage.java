import java.awt.Font;

import javax.swing.*;

public class WelcomePage {
    JFrame frame = new JFrame("Welcome Page");
    JLabel welcomeLabel = new JLabel();

    WelcomePage(String username) {

        welcomeLabel.setBounds(0,0,200,35);
        welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
        welcomeLabel.setText("Welcome " + username + "!");

        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
