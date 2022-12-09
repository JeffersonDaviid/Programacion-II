import java.security.PublicKey;
import java.util.Scanner;

public class E01DibujarGradas {

    public static void dibujarEscaleras(int numeroGradas) {
        for (int gradas = 1; gradas <= numeroGradas * 2; gradas++) {
            System.out.print("-");
            if (gradas % 2 == 0) {
                System.out.println("|");
                for (int saltos = 0; saltos < gradas; saltos++)
                    System.out.print("  ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int numeroGradas = sc.nextInt();

        dibujarEscaleras(5);

    }
}
