package Workspace.pkEstudiante;

import java.util.ArrayList;
import java.util.Scanner;

public class Materia {
    private String nombreMateria;
    private int dia;
    private int horaInicio;
    private int numHoras;

    public Materia() {
    }

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

    public void addClass(ArrayList<Materia> lsMaterias) {
        Scanner scMateria = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la materia: ");
        nombreMateria = scMateria.nextLine().toUpperCase();
        scMateria.nextLine(); // limpiar buffer :(
        System.out.println(
                "Ingrese el día que tiene la materia (1 = lunes, 2 = martes, 3 = Miercoles, 4 = Jueves, 5 = Viernes, 6 = Sábado): ");
        dia = scMateria.nextInt();
        scMateria.nextLine(); // limpiar buffer :(
        System.out.println("Ingrese la hora de inicio de la materia (Formato 24h)");
        horaInicio = scMateria.nextInt();
        scMateria.nextLine(); // limpiar buffer :(
        System.out.println("Ingrese la cantidad de horas de la materia");
        numHoras = scMateria.nextInt();
        scMateria.nextLine(); // limpiar buffer :(
        // scMateria.close();
        Materia m = new Materia(nombreMateria, dia, horaInicio, numHoras);
        if (m.horaInicio + m.numHoras > 21 || m.horaInicio < 8 || m.dia < 1 || m.dia > 7) {
            System.out.println(
                    "\n\n\tWARNING! La materia no se encuentra en los limites del horario, intente nuevamente");
            return;
        }

        for (int i = 0; i < lsMaterias.size(); i++) {
            // Si existe un elemento que empizan el mismo dia y hora NO lo agregamos
            // para que no sobreescMateriariba a la materia que estaba primero
            if (m.dia == lsMaterias.get(i).dia && m.horaInicio == lsMaterias.get(i).horaInicio) {
                System.out.println("\n\n\tWARNING! Horario ocupado por " + lsMaterias.get(i).nombreMateria
                        + " no es posible sobreescribir, intente nuevamente\n\n");
                return;
            }
        }
        lsMaterias.add(m);
    }

    public static void showSchedule(ArrayList<Materia> lsMaterias) {
        String horario[][] = new String[14][7];
        String[] lsDiasHorario = { " Sunday ", " Monday ", "Tuesday ", "Wednesday", "Thursday", " Friday ",
                "Saturday" };
        String[] lsHoras = { " 07:00  ", " 08:00  ", " 09:00  ", " 10:00  ", " 11:00  ", " 12:00  ", " 13:00  ",
                " 14:00  ", " 15:00  ", " 16:00  ", " 17:00  ", " 18:00  ", " 19:00  ", " 20:00  " };
        // Colocar dias y horas en el horario
        for (int fila = 0; fila < horario.length; fila++) {
            for (int columna = 0; columna < horario[fila].length; columna++) {
                if (fila == 0 && columna > 0)
                    horario[fila][columna] = lsDiasHorario[columna];
                if (columna == 0 && fila > 0)
                    horario[fila][columna] = lsHoras[fila];
            }
        }
        // Ingresar materia en el horario
        for (Materia materia : lsMaterias) {
            for (int hora = materia.horaInicio; hora < materia.horaInicio + materia.numHoras; hora++) {
                // Horario empieza a las 8 entonces restamos 7 para que me de la fila del
                // elemento es decir,8 am = fila 1, 9am = fila 2, 10am = fila =3...
                if (horario[hora - 7][materia.dia] == null)
                    horario[hora - 7][materia.dia] = materia.nombreMateria;
            }
        }
        // Mostrar horario completo
        for (int i = 0; i < horario.length; i++) {
            for (int j = 0; j < horario[i].length; j++) {
                if (horario[i][j] != null) {
                    System.out.print(String.format("%.8s    ", horario[i][j]));
                } else
                    System.out.print("            ");
            }
            System.out.println();
        }

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
