/**
 * @Autor: Jefferson Chileno
 */

public class Arbol {

    public static void main(String args[]) {

        // CODIGO GUIA ARBOL DE NAVIDAD
        char izq[] = "         ".toCharArray();
        char der[] = "         ".toCharArray();
        int len = izq.length - 1;
        for (int i = 0; i < len; i++) {
            izq[len - i] = der[i] = '+';
            System.out.println(new String(izq) + (new String(der)));
        }
        System.out.println("_______| |_______  :) pat_mic");
        System.out.println("\n\n");

        // OPTIMIZAR
        char izquierda[] = "         ".toCharArray();
        char derecha[] = "         ".toCharArray();
        for (int i = 0; i < izquierda.length - 1; i++) {
            izquierda[izquierda.length - 1 - i] = derecha[i] = '+';
            System.out.println(new String(izquierda) + (new String(derecha)));
        }
        System.out.print("_______| |________  メ Merry Christmas メ ಠ‿↼ ");
    }
}
