public class Arbol {

    public static void main(String args[]) {
        char izq[] = "         ".toCharArray();
        char der[] = "         ".toCharArray();
        for (int i = 0; i < izq.length - 1; i++) {
            izq[izq.length - 1 - i] = der[i] = '+';
            System.out.println(new String(izq) + (new String(der)));
        }
        System.out.println("_______|  |_______");
    }
}
