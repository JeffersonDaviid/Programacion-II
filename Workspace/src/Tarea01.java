import java.util.Scanner;

public class Tarea01 {
    public static void presentarElementos(String objetos[], String etiqueta) {
        System.out.println(etiqueta);
        for (int objeto = 0; objeto < objetos.length; objeto++)
            if (!objetos[objeto].equals("n"))
                System.out.println("- " + objetos[objeto] + ", ");
    }

    public static boolean verificarElemento(String elemento, String grupo[]) {
        for (int elem = 0; elem < grupo.length; elem++)
            if (grupo[elem].equals(elemento) && !grupo[elem].equals("n"))
                return true;
        return false;
    }

    public static void moverElemento(String valor, String grupoSalida[], String grupoLlegada[]) {
        for (int elemento = 0; elemento < grupoSalida.length; elemento++)
            if (grupoSalida[elemento].equals(valor))
                grupoSalida[elemento] = "n";
        for (int elemento = 0; elemento < grupoLlegada.length; elemento++)
            if (grupoLlegada[elemento].equals("n")) {
                grupoLlegada[elemento] = valor;
                break;
            }
        if ((verificarElemento("L", grupoSalida) && verificarElemento("C", grupoSalida))
                || verificarElemento("C", grupoSalida) && verificarElemento("U", grupoSalida)) {
            System.out.println("You lost :(");
            System.exit(0);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        boolean p_izquierda = true;
        String eleccion;
        String izquierda[] = { "L", "C", "U" };
        String derecha[] = { "n", "n", "n" };
        do {
            presentarElementos(izquierda,
                    "\nLos 3 elementos deben cruzar al otro lado del rio\nREGLAS DEL JUEGO:\n  Si esta solo el lobo con la caperucita ( marcha la caperucita )\n  Si la caperucita esta solo con las uvas ( marchan las uvas )\n\nElementos a la izquierda del rio");
            presentarElementos(derecha, "\nElementos a la derecha del rio");
            if (p_izquierda == true) {
                System.out.println("\nPorfavor ingrese la inicial del elemento a mover a la derecha ");
                eleccion = teclado.next().toUpperCase();
                if (verificarElemento(eleccion, izquierda)
                        && (eleccion.equals("L") || eleccion.equals("C") || eleccion.equals("U"))) {
                    moverElemento(eleccion, izquierda, derecha);
                    p_izquierda = false;
                }
            } else {
                System.out.println(
                        "\nEsta por volver a la izquierda, ¿Desea volver con un elemento? \n(Si) ingrese inicial del elemento\n(No) presione cualquier tecla ");
                eleccion = teclado.next().toUpperCase();
                if (verificarElemento(eleccion, derecha)
                        && (eleccion.equals("L") || eleccion.equals("C") || eleccion.equals("U")))
                    moverElemento(eleccion, derecha, izquierda);
                p_izquierda = true;
            }
        } while (verificarElemento("L", izquierda) || verificarElemento("C", izquierda)
                || verificarElemento("U", izquierda));
        System.out.println("You win :)");
    }
}
