package pkEstudiante;

public class Materia {
    private String nombreMateria;
    private int dia;
    private int horaInicio;
    private int numHoras;

    /**
     * @param nombreMateria nombre de la materia
     * @param dia           numero del dia de la semana
     * @param horaInicio    hora formato 24h del inicio de la materia
     * @param numHoras      cantidad de horas en enteros
     */
    public Materia(String nombreMateria, int dia, int horaInicio, int numHoras) {
        this.nombreMateria = nombreMateria;
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.numHoras = numHoras;
    }

    // GETTERS
    public String getNombreMateria() {
        return nombreMateria;
    }

    public int getDia() {
        return dia;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getNumHoras() {
        return numHoras;
    }

    // public static void ingresarDato(int dato, String leyenda) {
    // System.out.println(leyenda);
    // Scanner scMateria = new Scanner(System.in);
    // dato = scMateria.nextInt();
    // System.out.println(27 + dato);
    // }

    // public static void ingresarDato(String dato, String leyenda) {
    // System.out.println(leyenda);
    // Scanner scMateria = new Scanner(System.in);
    // dato = scMateria.nextLine();
    // }

    // public static void ingresarDato(Boolean dato, String leyenda) {
    // Scanner scMateria = new Scanner(System.in);
    // System.out.println(leyenda);
    // String aux = scMateria.next();
    // if (aux.equals("S"))
    // dato = true;
    // else
    // dato = false;
    // }

}
