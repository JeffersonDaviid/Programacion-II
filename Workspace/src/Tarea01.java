import java.util.Scanner;
import javax.swing.JOptionPane;

public class Tarea01 {
    public static void presentarObjeto(String objetos[]) {
        int elemento = 0;
        for (int objeto = 0; objeto < objetos.length; objeto++)
            if (objetos[objeto] != null)
                if (!objetos[objeto].equals("n")) {
                    elemento++;
                    System.out.println(elemento + ": " + objetos[objeto] + ", ");
                }
    }

    public static boolean verificarElemento(String grupo[], String elemento) {
        for (int elem = 0; elem < grupo.length; elem++)
            if (grupo[elem] != null)
                if (grupo[elem].equals(elemento) && !grupo[elem].equals("n"))
                    return true;
        return false;
    }

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        boolean p_izquierda = true;
        String izquierda[] = new String[3];
        String derecha[] = new String[3];
        izquierda[0] = "L";
        izquierda[1] = "C";
        izquierda[2] = "U";
        do {
            System.out.println("\nElementos a la izquierda del rio");
            presentarObjeto(izquierda);
            System.out.println("\nElementos a la derecha del rio");
            presentarObjeto(derecha);
            if (p_izquierda == true) {
                System.out.println("\nPorfavor ingrese la inicial del elemento a mover a la derecha: ");
                String eleccion = teclado.next().toUpperCase();
                if ((eleccion.equals("L") || eleccion.equals("C") || eleccion.equals("U"))
                        && verificarElemento(izquierda, eleccion)) {
                    for (int objetoIzquierda = 0; objetoIzquierda < izquierda.length; objetoIzquierda++) {
                        if (izquierda[objetoIzquierda].equals(eleccion)) {
                            izquierda[objetoIzquierda] = "n";
                            break;
                        }
                    }
                    for (int objetoDerecha = 0; objetoDerecha < derecha.length; objetoDerecha++) {
                        if (derecha[objetoDerecha] == null || derecha[objetoDerecha].equals("n")) {
                            derecha[objetoDerecha] = eleccion;
                            break;
                        }
                    }
                    p_izquierda = false;
                    if ((verificarElemento(izquierda, "L") && verificarElemento(izquierda, "C"))
                            || verificarElemento(izquierda, "C") && verificarElemento(izquierda, "U")) {
                        JOptionPane.showMessageDialog(null, "You lost :(");
                        return;
                    }
                }
            } else {
                System.out.println(
                        "\nEsta por volver a la izquierda, ¿Desea volver con un elemento? \n(Si) ingrese inicial del elemento\n(No) presione 0 : ");
                String eleccion = teclado.next().toUpperCase();
                if ((eleccion.equals("L") || eleccion.equals("C") || eleccion.equals("U"))
                        && verificarElemento(derecha, eleccion)) {
                    for (int objetoDerecha = 0; objetoDerecha < derecha.length; objetoDerecha++) {
                        if (derecha[objetoDerecha].equals(eleccion)) {
                            derecha[objetoDerecha] = "n";
                            break;
                        }
                    }
                    for (int objetoIzquierda = 0; objetoIzquierda < izquierda.length; objetoIzquierda++) {
                        if (izquierda[objetoIzquierda] == null || izquierda[objetoIzquierda].equals("n")) {
                            izquierda[objetoIzquierda] = eleccion;
                            break;
                        }
                    }
                    p_izquierda = true;
                }
                if (eleccion.equals("0"))
                    p_izquierda = true;
                if ((verificarElemento(derecha, "L") && verificarElemento(derecha, "C"))
                        || verificarElemento(derecha, "C") && verificarElemento(derecha, "U")) {
                    JOptionPane.showMessageDialog(null, "You lost :(");
                    return;
                }
            }
            if (verificarElemento(derecha, "L") && verificarElemento(derecha, "C") && verificarElemento(derecha, "U")) {
                JOptionPane.showMessageDialog(null, "You Win :)");
                return;
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();
        } while (1 < 2);
    }
}
