import javax.swing.*;

public class Homepage extends JFrame {

    private JLabel wellcometext;


    public Homepage(String username)
    {
        super("Homepage");
        setLayout(null);

        wellcometext = new JLabel("Wellcome to the app : "+username);
        wellcometext.setBounds(150,10,300,30);
        add(wellcometext);



    }


}
