public class E03Cuadrado {

    // + - + - + - +
    // - ......... -
    // + ......... +
    // - ......... -
    // + ......... +
    // - ......... -
    // + - + - + - +

    public static void dibujar(int tamaño) {
        for (int x = 0; x < tamaño; x++) {
            for (int y = 0; y < tamaño; y++) {
                if (x == 0 || y == 0 || x == tamaño - 1 || y == tamaño - 1)
                    System.out.print(((y + x) % 2 == 0) ? "+ " : "- ");
                else
                    System.out.print("  ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        dibujar(15);
    }
}
