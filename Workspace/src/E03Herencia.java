import Workspace.pkHerencia.Hijo;
import Workspace.pkHerencia.Padre;

public class E03Herencia {

    public static void main(String[] args) {
        Padre p1 = new Padre();
        // p1.presentarse();

        Padre p2 = new Padre("Jefferson", "Ing. Software", "M", 21);
        // p2.presentarse();

        Hijo h1 = new Hijo("Ana");
        h1.presentarse();
    }
}
