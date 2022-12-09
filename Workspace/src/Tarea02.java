import java.util.ArrayList;

/**
 * @author Jefferson Chileno
 * @date 09-12-2022
 * @class: Deber #02
 **/

public class Tarea02 {

    public static boolean verificarElemento(String elemento, String grupo[]) {
        for (int elem = 0; elem < grupo.length; elem++)
            if (grupo[elem].equals(elemento))
                return true;
        return false;
    }

    public static int factorial(int valor) {
        return (valor == 0) ? 1 : valor * factorial(valor - 1);
    }

    public static int calcularTotalCombinaciones(int nroElementos, int nroAgrupacion) {
        return (factorial(nroElementos)) / (factorial(nroElementos - nroAgrupacion) * factorial(nroAgrupacion));
    }

    public static void combinar(String[] elementos, int nroAgrupacion) {

    }

    public ArrayList<ArrayList<Integer>> buscarCombinaciones(int arr[], int x) {
        boolean[] utilizados = new boolean[arr.length];
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        buscarCombinaciones(arr, x, utilizados, 0, res);
        return res;
    }

    private void buscarCombinaciones(int arr[], int x, boolean[] utilizados, int posAct,
            ArrayList<ArrayList<Integer>> res) {
        if (x == 0) {
            ArrayList<Integer> combinacion = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if (utilizados[i] == true) {
                    combinacion.add(arr[i]);
                }
            }
            res.add(combinacion);
        } else {
            for (int pos = posAct; pos < arr.length; pos++) {
                utilizados[pos] = true;
                buscarCombinaciones(arr, x - 1, utilizados, pos + 1, res);
                utilizados[pos] = false;
            }
        }
    }

    public static void main(String[] args) {
        String[] elementos = { "A", "B", "C", "D" };
        System.out.println(calcularTotalCombinaciones(elementos.length, 3));

        for (int posicion1 = 0; posicion1 < elementos.length; posicion1++) {
            System.out.println(elementos[posicion1] + " " + elementos[posicion1 + 1] + " " + elementos[posicion1 + 2]);
            {
                for (int posicion2 = 1; posicion2 < elementos.length; posicion2++) {
                    System.out.println(
                            elementos[posicion2] + " " + elementos[posicion2 + 1] + " " + elementos[posicion2 + 2]);
                }
            }
        }
    }
}
