import java.util.Scanner;
import javax.swing.*;

public class App extends JFrame {
    Scanner teclado = new Scanner(System.in); // Objeto de entrada teclado
    private JLabel etiqueta;

    public App() {
        setLayout(null);
        etiqueta = new JLabel("Jefferson David");
        etiqueta.setBounds(0, 0, 300, 200);
        add(etiqueta);
    }

    public static void main(String args[]) {
        App ventana = new App();
        ventana.setBounds(0, 0, 400, 550);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(true);

    }
}
