public class DeberDos {
    /**
     * 
     * @param n numero entero total de elementos
     * @param r numero entero de elementos que se toma del total
     * @return numero de combinaciones posibles
     */
    private static int combinaciones(int n, int r) {
        // Factorial de n
        int factorialN = 1;
        for (int i = 1; i <= n; i++) {
            factorialN *= i;
        }
        // Factorial de k
        int factorialR = 1;
        for (int i = 1; i <= r; i++) {
            factorialR *= i;
        }
        // Factorial de n-r
        int factorialNYR = 1;
        for (int i = 1; i <= n - r; i++) {
            factorialNYR *= i;
        }
        return factorialN / (factorialNYR * factorialR);
    }

    /**
     * 
     * @param n numero entero total de elementos
     * @param h numero entero de elementos que se toma del total
     * @return numero de combinaciones posibles
     */
    private static int combinaciones2(int n, int h) {
        // Factorial de n
        int factorialN = 1;
        for (int i = 1; i <= n; i++) {
            factorialN *= i;
        }
        // Factorial de h
        int factorialH = 1;
        for (int i = 1; i <= h; i++) {
            factorialH *= i;
        }
        // Factorial de n-h
        int factorialNYH = 1;
        for (int i = 1; i <= n - h; i++) {
            factorialNYH *= i;
        }
        return factorialN / (factorialNYH * factorialH);
    }

    /**
     * @author Damaris Suquillo
     */
    public static void main(String[] args) {
        // Definición de variables
        String letras = "abcd";
        int n = 4;
        int r = 2;
        int h = 3;
        int combinaciones = combinaciones(n, r);
        int combinaciones2 = combinaciones2(n, h);
        // Operaciones factorial y combinación
        System.out.println("El número de combinaciones de dos letras que se realizarán son: " + combinaciones);
        System.out.println("El número de combinaciones de tres letras que se realizarán son: " + combinaciones2);
        // Operaciones combinaciones
        // Proceso para la combinación de dos letras
        for (int i = 0; i < letras.length(); i++) {
            char a = letras.charAt(i);
            for (int j = i + 1; j < letras.length(); j++) {
                char b = letras.charAt(j);
                System.out.println("Combinaciones de dos letras");
                System.out.println(a + " " + b);
            }
        }
        // Proceso para la combinación de tres letras
        for (int i = 0; i < letras.length(); i++) {
            char c = letras.charAt(i);
            for (int j = i + 1; j < letras.length(); j++) {
                char d = letras.charAt(j);
                for (int k = j + 1; k < letras.length(); k++) {
                    char e = letras.charAt(k);
                    System.out.println("Combinaciones de tres letras");
                    System.out.println(c + " " + d + " " + e);
                }
            }
        }
    }
}
