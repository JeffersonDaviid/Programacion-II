package Workspace.pkHerencia;

public class Padre {
    // Propiedades
    private String nombre;
    private String ocupacion;
    private String sexo;
    private int edad;

    // Constructor
    public Padre() {
        nombre = "pepe";
        ocupacion = "Programador";
        sexo = "M";
        edad = 20;
    }

    // Constructor + sobrecarga
    public Padre(String nombre) {
        this.nombre = nombre;
        this.ocupacion = "Ingeniero Software";
        this.sexo = "M";
        this.edad = 22;
    }

    public Padre(String nombre, String ocupacion, String sexo, int edad) {
        this.nombre = nombre;
        this.ocupacion = ocupacion;
        this.sexo = sexo;
        this.edad = edad;
    }

    // metodos
    public void presentarse() {
        System.out.println("-------------------------------");
        System.out.println(" Yo me llamo: " + nombre);
        System.out.println(" Soy un: " + ocupacion);
        System.out.println(" Sexo: " + sexo);
        System.out.println(" Edad: " + edad);
    }
}
