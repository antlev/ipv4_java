import javax.swing.*;
import java.awt.*;

/**
 * Created by antoine on 02/04/16.
 */
public class Window  {

    public Window(){
        JFrame window = new JFrame();
        window.setTitle("IPV4");
        window.setVisible(true);
        window.setSize(800,200);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel panel = new Panel();


        window.getContentPane().add(panel);
        window.setVisible(true);


    }
}
