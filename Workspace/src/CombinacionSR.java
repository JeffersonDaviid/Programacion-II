import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Gabriel Jaya
 * @date : 09.dic.2022
 * @version 1.3
 *          Realicar combinaciones de caracteres sin repeticiones
 */
public class CombinacionSR {
    /**
     * Esta funcion me sirve para calcular el factorial de un numero
     * 
     * @param numIngresado
     * @return
     */
    public static int calcularfactorial(int numIngresado) {
        int i = 0, f = 1;

        for (i = 1; i <= numIngresado; i++)
            f = f * i;
        return f;
    }

    /**
     * Esta funcion sirve para calcular el numero de combinaciones posibles sin
     * repetirse
     * 
     * @param n = numero total de elementos
     * @param r = grupos tomados de r en r
     * @return
     */
    public static int calcularNroCombinaciones(int n, int r) {
        int c = 0;
        c = calcularfactorial(n) / (calcularfactorial(r) * calcularfactorial(n - r));
        return c;
    }
    
    /**
     * Esta funcion me permite mostrar todos las posibles combinaciones sin
     * repeticion
     * 
     * @param conjunto   de caracteres
     * @param n          = numero total de elementos
     * @param k          = grupos tomados de r en r
     * @param y          =
     * @param i          =
     * @param grupoPeque = arreglo donde se guardara los nuevos grupos
     */
    public static void showCombinaciones(char[] conjunto, int n, int k, int y, int i, int[] grupoPeque) {
        if (grupoPeque == null) {
            grupoPeque = new int[k];
        }
        if (i < k) {
            for (int x = y; x < n; x++) {
                grupoPeque[i] = x;
                showCombinaciones(conjunto, n, k, x + 1, i + 1, grupoPeque);
            }
        } else {
            // Imprimir la lista
            System.out.println("");
            for (int w = 0; w < k; w++) {
                System.out.print(conjunto[grupoPeque[w]]);

            }
        }

    }

    public static void main(String[] args) {
        // Definicion de variables
        int n = 0, k = 0, numCombina = 0;
        Scanner sc = new Scanner(System.in);
        int y = 0;
        int i = 0;
        int[] grupoPeque = null;

        // Ejercicio
        System.out.println("*****************");
        char[] conjunto = { 'a', 'b', 'c', 'd', 'e', 'f' };
        n = conjunto.length;
        System.out.println("Su conjunto es" + Arrays.toString(conjunto));
        System.out.println("Introduzca la cantidad de elementos que conformaran un grupo:");
        k = sc.nextInt();
        numCombina = calcularNroCombinaciones(n, k);
        System.out.println("Numero de combinaciones posibles sin repetir: " + numCombina);
        showCombinaciones(conjunto, n, k, y, i, grupoPeque);
        sc.close();

    }
}