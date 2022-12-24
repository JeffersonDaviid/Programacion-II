/**
 * @author Jefferson Chileno
 * @date 20-12-2022
 * @class: Deber #03
 **/
package pkEstudiante;

import java.util.ArrayList;
import java.util.Scanner;

// Constructor
public class Alumno {
    private final String nombre;
    private final int codigo;
    private boolean depresion;
    public ArrayList<Materia> lsMaterias;

    /**
     * @param nombre    nombre del alumno
     * @param codigo    id unico de alumno
     * @param depresion valor booleano
     */
    public Alumno(String nombre, int codigo, boolean depresion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.depresion = depresion;
        this.lsMaterias = new ArrayList<Materia>();
    }

    /**
     * Mostar todos los datos del estudiante
     * 
     * @param lsAlumnos lista de todos los estudiantes
     * @param posicion  posición del usuario
     */
    public void showStudent(ArrayList<Alumno> lsAlumnos, int posicion) {
        System.out.println("\t\t\tBIEVENID@ " + lsAlumnos.get(posicion).nombre);
        System.out.println("\n + Codigo:\t" + lsAlumnos.get(posicion).codigo);
        System.out.print(" + Depresion:\t");
        System.out.println(lsAlumnos.get(posicion).depresion ? "Afirmativo" : "Negativo");
        System.out.println(
                "----------------------------------------------------------------------------------");
        System.out.println("\t\t\tHORARIO - PROGRAMMED x JEFFERSON");
        System.out.println(
                "----------------------------------------------------------------------------------");
        showSchedule(lsAlumnos.get(posicion).lsMaterias);
    }

    public void showSchedule(ArrayList<Materia> lsMaterias) {
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
            for (int hora = materia.getHoraInicio(); hora < materia.getHoraInicio() + materia.getNumHoras(); hora++) {
                // Horario empieza a las 8 entonces restamos 7 para que me de la fila del
                // elemento es decir,8 am = fila 1, 9am = fila 2, 10am = fila =3...
                if (horario[hora - 7][materia.getDia()] == null)
                    horario[hora - 7][materia.getDia()] = materia.getNombreMateria();
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

    public void addClass(ArrayList<Materia> lsMaterias) {
        Scanner scMateria = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la materia: ");
        String nombreMateria = scMateria.nextLine().toUpperCase();
        System.out.println(
                "Ingrese el día que tiene la materia (1 = lunes, 2 = martes, 3 = Miercoles, 4 = Jueves, 5 = Viernes, 6 = Sábado): ");
        int dia = scMateria.nextInt();
        System.out.println("Ingrese la hora de inicio de la materia (Formato 24h)");
        int horaInicio = scMateria.nextInt();
        System.out.println("Ingrese la cantidad de horas de la materia");
        int numHoras = scMateria.nextInt();
        Materia m = new Materia(nombreMateria, dia, horaInicio, numHoras);
        if (m.getHoraInicio() + m.getNumHoras() > 21 || m.getHoraInicio() < 8 || m.getDia() < 1 || m.getDia() > 7) {
            System.out.println(
                    "\n\n\tWARNING! La materia no se encuentra en los limites del horario, intente nuevamente");
            return;
        }

        for (int i = 0; i < lsMaterias.size(); i++) {
            // Si existe un elemento que empizan el mismo getDia() y hora NO lo agregamos
            // para que no sobreescMateriariba a la materia que estaba primero
            if (m.getDia() == lsMaterias.get(i).getDia() && m.getHoraInicio() == lsMaterias.get(i).getHoraInicio()) {
                System.out.println("\n\n\tWARNING! Horario ocupado por " + lsMaterias.get(i).getNombreMateria()
                        + " no es posible sobreescribir, intente nuevamente\n\n");
                return;
            }
        }
        lsMaterias.add(m);
    }

    // GETTERS
    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public ArrayList<Materia> getLsMaterias() {
        return lsMaterias;
    }

    public boolean getDepresion() {
        return depresion;
    }

    // SETTERS
    public void setDepresion(boolean depresion) {
        this.depresion = depresion;
    }
}