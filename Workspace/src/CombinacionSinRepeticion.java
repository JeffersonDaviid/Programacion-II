/*
 * Autor: Angel Chuncho
 */

import java.util.Scanner;

public class CombinacionSinRepeticion {
    public static void main(String[] args) throws Exception {
        int nCombinaciones, nElementos;
        int n, r;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de elementos a ingresar:");
        nElementos = leer.nextInt();

        String[] conjunto = new String[nElementos];

        llenarArray(conjunto);

        System.out.println("Ingrese la cantidad de elementos a tomar del conjunto");
        r = leer.nextInt();
        n = conjunto.length;
        while (n<r){
            System.out.println("Ingrese un valor valido de cantidad de elementos a tomar del conjunto");
            r = leer.nextInt();
        }

        nCombinaciones = combinarSinR(conjunto, n, r);
        String[] combinacionesSR = new String[nCombinaciones];


        imprimir(conjunto, combinacionesSR, 0, (n-1), 0, r);
    }

    public static void llenarArray(String[] a){
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingrese el elemento "+(i+1)+" del conjunto");
            a[i] = leer.nextLine();           // Llenamos el Array
            a[i] = a[i].toLowerCase();      // Pasamos a minusculas
        }
    }

    public static int factorial (int n){
        int nFactorial = 1;
        for (int i = 1; i <= n; i++){
            nFactorial *= i;
        }
        return nFactorial;
    }

    public static int combinarSinR (String[] a, int n, int r){      
        // C = n!/r!(n-r)!
        // Donde n = # de elementos
        // r = # a tomar
        int nr;
        int nFactorial, rFactorial, nrFactorial;
        int combinaciones;
        Scanner leer = new Scanner(System.in);
        nr = n-r;

        nFactorial = factorial(n);
        rFactorial = factorial(r);
        nrFactorial = factorial(nr);
        combinaciones = nFactorial/((rFactorial)*(nrFactorial));
        System.out.println("El total de combinaciones sin repeticion posibles es de: "+combinaciones);
        return combinaciones;
    }

    public static void imprimir (String[] conjunto,String[] aux, int inicio, int fin, int indice , int r){
        if (indice == r) { // cuando esto sucede, se puede imprimir la combinacion, tomando un valor de pivote
            for (int j = 0; j < r; j++) {
                System.out.print(aux[j]);
            }
            System.out.println();
            return;
        }

        //condicion "fin - i + 1 >= r - indice" nos asegura no se utilicen repetidos
        //al llegar al indice hara la combinacion con los restantes en las posiciones siguientes
        for (int i = inicio; i <= fin && fin - i + 1 >= r - indice; i++) {
            aux[indice] = conjunto[i];
            imprimir(conjunto, aux, i+1, fin, indice+1, r);
        }
    }
}
