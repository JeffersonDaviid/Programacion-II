public class E02Pares {
    public static void main(String[] args) throws Exception {
        System.out.println("Números pares: ");
        for (int i = 1; i < 20; i++)
            if (i % 2 == 0)
                System.out.print(i + ", ");
    }
}