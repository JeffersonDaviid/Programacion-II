/**
 * @author Jefferson Chileno
 * @date 09-12-2022
 * @class: Deber #02
 **/

public class Tarea02 {

    public static int factorial(int valor) {
        return (valor == 0) ? 1 : valor * factorial(valor - 1);
    }

    public static int calcularTotalCombinaciones(int nroElementos, int nroAgrupacion) {
        return (factorial(nroElementos)) / (factorial(nroElementos - nroAgrupacion) * factorial(nroAgrupacion));
    }

    public static void combinarElementos1(String[] elementos, int nroCombinacion) {
        int aux1 = 0;
        for (int i = 0; elementos.length - i >= nroCombinacion; i++) {
            aux1 = i + 1;
            while (elementos.length - aux1 > 0) {
                System.out.println("[ " + elementos[i] + " " + elementos[aux1] + " ]");
                aux1++;
            }
        }
    }

    public static void combinarElementos2(String[] elementos, int nroCombinacion) {
        int aux1 = 0, aux2 = 0;
        for (int i = 0; elementos.length - i >= nroCombinacion; i++) {
            aux1 = i + 1;
            while (true) {
                aux2 = aux1 + 1;
                while (elementos.length - aux2 > 0) {
                    System.out.println("[ " + elementos[i] + " " + elementos[aux1] + " " + elementos[aux2] + " ]");
                    aux2++;
                }
                aux1++;
                if (elementos.length - aux1 == nroCombinacion - 1)
                    continue;
                break;
            }
        }
    }

    public static void main(String[] args) {
        String[] elementos = { "A", "B", "C", "D" };

        System.out.println("\nAcontinuación se tiene un array [A, B, C, D], que se combinarán en grupos de 2 y de 3");
        System.out.println("\nPara el caso de grupos de 2, el numero de combinaciones son: "
                + calcularTotalCombinaciones(elementos.length, 2));
        System.out.println();

        combinarElementos1(elementos, 2);
        System.out.println("\nPara el caso de grupos de 3, el numero de combinaciones son: "
                + calcularTotalCombinaciones(elementos.length, 3));
        System.out.println();
        combinarElementos2(elementos, 3);

    }
}
