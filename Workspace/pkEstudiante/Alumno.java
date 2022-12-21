/**
 * @author Jefferson Chileno
 * @date 20-12-2022
 * @class: Deber #03
 **/
package Workspace.pkEstudiante;

import java.util.ArrayList;

// Constructor
public class Alumno extends Materia {
    public String nombre;
    public int codigo;
    public boolean depresion;
    public ArrayList<Materia> lsMaterias;

    public Alumno() {
    }

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

    /**
     * Buscar la posición en arrayList de un estudiante
     * 
     * @param codigo    codigo unico de cada estudiante
     * @param lsAlumnos arrayList de los alumnos donde se buscará el estudiante
     */
    public static int searchStudent(int codigo, ArrayList<Alumno> lsAlumnos) {
        System.out.println("\n<> Lista total de estudiantes: ");
        // Se puede mejorar con el INDEXOF pero me dio error + mimir time
        for (int position = 0; position < lsAlumnos.size(); position++) {
            System.out.println(lsAlumnos.get(position).codigo + "  →  " + lsAlumnos.get(position).nombre);
            if (lsAlumnos.get(position).codigo == codigo)
                return position;
        }
        return -1;
    }
}