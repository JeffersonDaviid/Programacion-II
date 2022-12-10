import java.util.Scanner;
import java.util.Arrays;

public class Deber2 {
    public static void main(String[] args) throws Exception {
        String[] letras = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z" };
        int Combtotal = 0, Numletras = 0, Part1 = 0, Part2 = 1, a = 0, b = 0, c = 0;
        Scanner teclado = new Scanner(System.in);
        // en esta primera parte se especifica cuantas letras se van a utilizar para la
        // combinacion de 2 letras
        System.out.println("Ingrese la cantidad de letras que desea utilizar para realizar la combinacion (2-24)");
        Numletras = teclado.nextInt();
        Combtotal = (Numletras * (Numletras - 1)) / 2;
        String[] combinacion = new String[Combtotal];
        Numletras = Numletras - 1;
        c = Numletras;
        for (int i = 0; i < Combtotal; i++) {
            combinacion[i] = letras[Part1] + letras[Part2];
            a++;
            if (a == Numletras) {
                Part1++;
                a = 0;
                Numletras--;
            }
            if (Part2 == c) {
                b++;
                Part2 = b;
            }
            Part2++;
        }
        System.out.println(Arrays.toString(combinacion));
        teclado.close();
    }
}
