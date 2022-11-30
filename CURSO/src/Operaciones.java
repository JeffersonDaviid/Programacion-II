import javax.swing.JOptionPane;

public class Operaciones {
    // Atributos
    int numero1;
    int numero2;

    // Metodos

    // Metodo para pedir al usuario
    public void leerNumeros() {
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
    }

    public int sumar(int valor1, int valor2) {
        return numero1 + numero2;
    }

    public int restar(int valor1, int valor2) {
        return numero1 - numero2;
    }
}
