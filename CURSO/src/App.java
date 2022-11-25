import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
    Scanner teclado = new Scanner(System.in); // Objeto de entrada teclado

    public static void main(String args[]) {
        String cadena;
        int entero;
        char letra;
        float decimal;

        cadena = JOptionPane.showInputDialog("Digite una cadena : ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor entero: "));
        letra = JOptionPane.showInputDialog("Ingrese un caracter: ").charAt(0);
        // decimal = Integer.parseFloat(JOptionPane.showInputDialog("Ingrese un valor
        // decimal: "));

        JOptionPane.showMessageDialog(null, "La cadena es: " + cadena);
        JOptionPane.showMessageDialog(null, "El valor entero es: " + entero);
        JOptionPane.showMessageDialog(null, "El caracter escrito es: " + letra);
    }
}
