import javax.swing.*;
import java.awt.*;

/**
 * Created by antoine on 02/04/16.
 */
public class Panel extends JPanel {

    public Panel(){

        JPanel panel = new JPanel();
        Font font = new Font("Courier",Font.BOLD,10);
        JTextField bite1= new JTextField("bite1");
        JTextField bite2= new JTextField("bite2");
        JTextField bite3= new JTextField("bite3");
        JTextField bite4= new JTextField("bite4");


        panel.add(bite1);
        panel.add(bite2);
        panel.add(bite3);
        panel.add(bite4);


    }


}
