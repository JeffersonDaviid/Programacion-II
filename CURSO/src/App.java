import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

import UI_Interface.BottonFlat;

public class App {

    /* Test the button */
    public static void main(String[] args) {
        BottonFlat button = new BottonFlat("Hello, World!");
        // Crea boton.
        JButton myButton = new JButton("my button");
        // Define 40 como Radio.
        // myButton.setBorder(new Border(40));

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        Container contentPane = frame.getContentPane();
        // contentPane.setLayout(new BorderLayout(10, 10));
        contentPane.add(button);

        frame.setVisible(true);
    }
}