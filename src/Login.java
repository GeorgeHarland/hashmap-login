import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.*;

public class Login implements ActionListener{

    JFrame frame = new JFrame("Login Page");
    JButton loginButton = new JButton("Login");
    JLabel usernameLabel = new JLabel("Username:");
    JLabel passLabel = new JLabel("Password:");
    JTextField usernameInput = new JTextField();
    JPasswordField passInput = new JPasswordField();
    JLabel validLabel = new JLabel();
    JLabel titleLabel = new JLabel();
    HashMap<String,String> infoCopy = new HashMap<String,String>();

    Login(HashMap<String,String> loginInfo){

        infoCopy = loginInfo;

        usernameLabel.setBounds(50,100,75,25);
        passLabel.setBounds(50,150,75,25);

        validLabel.setBounds(50,250,400,35);
        validLabel.setFont(new Font(null,Font.ITALIC,20));
        validLabel.setForeground(Color.DARK_GRAY);

        titleLabel.setBounds(50,30,400,35);
        titleLabel.setFont(new Font(null,Font.ITALIC,28));
        titleLabel.setForeground(Color.DARK_GRAY);
        titleLabel.setText("Login-Systems");

        usernameInput.setBounds(125,100,200,25);
        passInput.setBounds(125,150,200,25);

        loginButton.setBounds(125,200,100,25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        frame.add(usernameLabel);
        frame.add(passLabel);
        frame.add(validLabel);
        frame.add(titleLabel);
        frame.add(usernameInput);
        frame.add(passInput);
        frame.add(loginButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loginButton) {
            String username = usernameInput.getText();
            String password = String.valueOf(passInput.getPassword());

            if(infoCopy.containsKey(username)) {
                if(infoCopy.get(username).equals(password)) {
                    frame.dispose();
                    WelcomePage welcomePage = new WelcomePage(username);
                } else {
                    validLabel.setText("Wrong password. Please try again.");
                    passInput.setText("");
                }
            } else {
                validLabel.setText("Username is incorrect. Please try again.");
            }
        }
    }
    
}
