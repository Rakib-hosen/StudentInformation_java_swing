import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Loginpage extends JFrame {

    private JLabel username;
    private JTextField usernametext;
    private JLabel password;
    private JPasswordField passwordField;
    private JButton button;

    public Loginpage()
    {
        super("Log in page");
        setLayout(null);

        username = new JLabel("User Name");
        username.setBounds(10,10,100,30);
        add(username);

        usernametext = new JTextField(15);
        usernametext.setBounds(110,10,150,30);
        add(usernametext);

        password = new JLabel("Password");
        password.setBounds(10,45,100,30);
        add(password);

        passwordField = new JPasswordField(15);
        passwordField.setBounds(110,45,150,30);
        add(passwordField);

        button =new JButton("Login");
        button.setBounds(130,80,100,30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Homepage w = new Homepage(usernametext.getText());
                w.setSize(480,300);
                w.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                w.setVisible(true);

            }
        });
        add(button);


    }

}
