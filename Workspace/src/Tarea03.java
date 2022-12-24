import java.util.ArrayList;
import java.util.Scanner;

import pkEstudiante.Alumno;
import pkEstudiante.Materia;

public class Tarea03 {

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\tMENU\n");

        System.out.println(" 1. Agregar estudiante \n 2. Consultar estudiante\n 0. Salir");
        int option = Integer.parseInt(sc.nextLine());
        return option;
    }

    /**
     * Agrega un nuevo estudiante
     * 
     * @param lsAlumnos lista de arraylist donde se guardará el nuevo alumno
     */
    public static void addStudent(ArrayList<Alumno> lsAlumnos) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIngrese el nombre del estudiante: ");
        String nombre = sc.nextLine().toUpperCase();
        // sc.nextLine(); // Limpiar buffer :(
        System.out.println("Ingrese el codigo único del estudiante: ");
        int codigo = sc.nextInt();
        boolean depresion = false;

        Alumno e = new Alumno(nombre, codigo, depresion);
        for (int i = 0; i < lsAlumnos.size(); i++) {
            // Si existe un estudiante que tiene el mismo código NO lo agregamos
            // para que no sobreescriba al otro estudiante que estaba primero
            if (e.getCodigo() == lsAlumnos.get(i).getCodigo()) {
                System.out.println("\n\n\t\t\tWARNING! Código ocupado por " + lsAlumnos.get(i).getNombre()
                        + " no es posible sobreescribir, intente nuevamente.\n\n\n\n");
                return;
            }
        }
        lsAlumnos.add(e);
        System.out.println("Estudiante " + e.getNombre() + " fue agregado exitosamente!\n\n\n");
    }

    /**
     * Buscar la posición en arrayList de un estudiante
     * 
     * @param lsAlumnos arrayList de los alumnos donde se buscará el estudiante
     * @return devuelve la posición del estudiante
     */
    public static int searchStudent(ArrayList<Alumno> lsAlumnos) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese código de estudiante: ");
        int codigo = sc.nextInt();
        System.out.println("\n<> Lista total de estudiantes: ");
        // Se puede mejorar con el INDEXOF pero me dio error + mimir time
        for (int position = 0; position < lsAlumnos.size(); position++) {
            System.out.println(lsAlumnos.get(position).getCodigo() + "  →  " + lsAlumnos.get(position).getNombre());
            if (lsAlumnos.get(position).getCodigo() == codigo)
                return position;
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        ArrayList<Alumno> lsAlumnos = new ArrayList<Alumno>();

        // ESTUDIANTES POR DEFECTO
        Alumno e1 = new Alumno("JEFFERSON", 27, true);
        Materia m1e1 = new Materia("CALCULO ", 1, 9, 5);
        e1.lsMaterias.add(m1e1);
        Materia m2e1 = new Materia("ANALISIS", 3, 17, 2);
        e1.lsMaterias.add(m2e1);
        Materia m3e1 = new Materia("ELECTRONICA", 2, 8, 3);
        e1.lsMaterias.add(m3e1);
        Materia m4e1 = new Materia("MATEMATICAS", 6, 9, 6);
        e1.lsMaterias.add(m4e1);
        Materia m5e1 = new Materia("PROGRAMACION", 5, 13, 4);
        e1.lsMaterias.add(m5e1);
        Materia m6e1 = new Materia("ENGLISH ", 4, 18, 2);
        e1.lsMaterias.add(m6e1);
        lsAlumnos.add(e1);
        Alumno e2 = new Alumno("ALANIS", 18, false);
        Materia m1e2 = new Materia("CALCULO ", 6, 9, 4);
        e2.lsMaterias.add(m1e2);
        Materia m2e2 = new Materia("ANALISIS", 4, 15, 2);
        e2.lsMaterias.add(m2e2);
        Materia m3e2 = new Materia("ELECTRONICA", 1, 8, 3);
        e2.lsMaterias.add(m3e2);
        Materia m4e2 = new Materia("MATEMATICAS", 3, 16, 2);
        e2.lsMaterias.add(m4e2);
        Materia m5e2 = new Materia("PROGRAMACION", 2, 18, 2);
        e2.lsMaterias.add(m5e2);
        Materia m6e2 = new Materia("ENGLISH ", 5, 11, 2);
        e2.lsMaterias.add(m6e2);
        lsAlumnos.add(e2);
        Scanner sc = new Scanner(System.in);

        String option;
        do {
            switch (menu()) {
                case 0:
                    sc.close();
                    return;
                case 1:
                    addStudent(lsAlumnos);
                    break;

                case 2:
                    int posicion = searchStudent(lsAlumnos);
                    if (posicion > -1) {
                        // "Inicio sesion de usuario, sí lo encotró"
                        do {
                            lsAlumnos.get(posicion).showStudent(lsAlumnos, posicion);
                            System.out.println("\n\n 1. Agregar Materia \n 2. Salir\n");
                            option = sc.nextLine();
                            if (option.equals("1")) {
                                lsAlumnos.get(posicion).addClass(lsAlumnos.get(posicion).getLsMaterias());
                            }
                        } while (!option.equals("2"));
                    }
                    break;
                default:
                    break;
            }
        } while (true);
    }
}