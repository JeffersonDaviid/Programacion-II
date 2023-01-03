package pkInterfaz;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Interfaz {

    public static void main(String[] args) {
        JFrame frm = new JFrame();
        frm.setTitle("PRIMERA INTERFAZ");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setResizable(true);
        frm.setSize(500, 500);
        frm.setVisible(true);

        ImageIcon image = new ImageIcon("https://www.epn.edu.ec/wp-content/uploads/2022/08/logo-epn-vertical.png");
        frm.setIconImage(image.getImage());
        frm.getContentPane().setBackground(new Color(255, 255, 255));
    }
}
