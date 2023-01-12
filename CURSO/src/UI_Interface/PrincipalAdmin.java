package UI_Interface;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class PrincipalAdmin extends JFrame {

    public void main() {
        PrincipalAdmin p = new PrincipalAdmin();
        p.setVisible(true);
    }

    PrincipalAdmin() {
        setTitle("PRINCIAPAL");
        setBounds(0, 0, 800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        getContentPane().setLayout(new BorderLayout(0, 0));

        JPanel footer = new JPanel();
        getContentPane().add(footer, BorderLayout.SOUTH);

        JLabel footer_derechos = new JLabel("© EASY SELL | Todos los derechos reservados");
        footer.add(footer_derechos);

    }
}
