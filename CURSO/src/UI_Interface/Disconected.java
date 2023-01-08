package UI_Interface;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Image;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Disconected extends JFrame {

    public Disconected() {
        setTitle("DESCONECTADO");
        setBounds(0, 0, 800, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        ImageIcon imageBackground = new ImageIcon("images/disconected_DataBase.png");

        JLabel lbLeyendaDesconentado = new JLabel("Estás Desconectado");
        lbLeyendaDesconentado.setFont(new Font("Fira Code Medium", Font.BOLD | Font.ITALIC, 30));
        lbLeyendaDesconentado.setHorizontalAlignment(SwingConstants.CENTER);
        lbLeyendaDesconentado.setBounds(12, 30, 766, 38);
        add(lbLeyendaDesconentado);

        JLabel lbBackground = new JLabel();
        lbBackground.setBounds(0, 0, 800, 372);
        Icon iconBackgound = new ImageIcon(
                imageBackground.getImage().getScaledInstance(lbBackground.getWidth(), lbBackground.getHeight(),
                        Image.SCALE_SMOOTH));
        lbBackground.setIcon(iconBackgound);
        getContentPane().add(lbBackground);
    }

    public static void main(String[] args) {
        Disconected d = new Disconected();
        // d.setVisible(true); // EL SETVISIBLE VA OBLIGATORIAMENTE CUANDO SE LLAMA A
        // LA CLASE, esta aqui solo para probar la app de forma independiente
    }
}
