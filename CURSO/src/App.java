import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class App {

    /* Test the button */
    public static void main(String[] args) {
        // v.setVisible(true);
        // Login vsdf = new Login();

        // // INGRESAR DATOS EN LA BASE DE DATOS
        try {
            // ("RUTA Y NOMBRE DE LA BASE DE DATOS","USUARIO","CONTRASEÑA")
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd_usuarios", "root", "");
            // // // Query
            // // PreparedStatement pst = cn.prepareStatement("insert into usuarios
            // // values(?,?,?,?,?,?,?,?,?,?,?)");
            // // // Llenando la base de datos
            // // pst.setString(1, "DEVELOPER");
            // // pst.setString(2, "271001");
            // // pst.setString(3, "ADMINISTRADOR");
            // // pst.setString(4, "ACTIVO");
            // // pst.setString(5, " ");
            // // pst.setString(6, " ");
            // // pst.setString(7, " ");
            // // pst.setString(8, " ");
            // // pst.setString(9, " ");
            // // pst.setString(10, " ");
            // // pst.setInt(11, 21);
            // // pst.executeUpdate(); // ENVIAR A LA BASE

            // // // Consultar la base de datos
            // // PreparedStatement pst = cn.prepareStatement("select * from usuarios where
            // // User = ?");
            // // pst.setString(1, txtUsuario.getText().trim());
            // // // permite conocer si encontro los datos
            // // ResultSet resultado = pst.executeQuery();

            // // if (resultado.next()) {
            // // JOptionPane.showMessageDialog(null, "El usuario " +
            // // resultado.getString("User").toUpperCase() + " es "
            // // + resultado.getString("Role").toUpperCase());
            // // } else {
            // // JOptionPane.showMessageDialog(null, "El usuario " +
            // // txtUsuario.getText().toUpperCase()
            // // + " no se encuentra en la base de datos");
            // // }
            // Login v = new Login();
            // v.setVisible(true);
            // // conexion.close();
        } catch (SQLException errorConectionInitial) {
            Disconected d = new Disconected();
            d.setVisible(true);
            // // sudo /opt/lampp/lampp start -> inicar
            // // sudo /opt/lampp/lampp stop -> parar
        }

        String txt;
        int datoInt;
        float datoFloat;

        txt = getString("Ingrese el texto");

        datoInt = getNumberInt("Ingrese valor entero");

        datoFloat = getNumberFloat("Ingrese dato float");

        System.out.println(
                "valor txt: " + txt + "    Este es el dato Int: " + datoInt + "    Este es el dato float" + datoFloat);

    }

    /**
     * Obteniene y verifica un valor entero
     * 
     * @param etiqueta texto a mostrar de la petición
     * @return retorna el valor entero
     */
    public static int getNumberInt(String etiqueta) {
        Scanner sc = new Scanner(System.in);
        String dato;
        do {
            System.out.println(etiqueta);
            dato = sc.nextLine();
            if (dato.trim().length() == 0)
                System.out.println(" WARNING! No se puede dejar campos sin llenar :(");
            if (validarDatoEntero(dato))
                return Integer.parseInt(dato);
            else {
                System.out.println(" WARNING! El valor ingresado no es válido");
            }
        } while (true);
    }

    /**
     * Obteniene y verifica una numero decimal
     * 
     * @param etiqueta texto a mostrar de la petición
     * @return retorna el valor float
     */
    public static float getNumberFloat(String etiqueta) {
        Scanner sc = new Scanner(System.in);
        String dato;
        do {
            System.out.println(etiqueta);
            dato = sc.nextLine();
            if (dato.trim().length() == 0)
                System.out.println(" WARNING! No se puede dejar campos sin llenar :(");
            else {
                if (validarDatoFloat(dato))
                    return Float.parseFloat(dato);
                else {
                    System.out.println(" WARNING! El valor ingresado no es válido");
                }
            }
        } while (true);
    }

    /**
     * Obteniene y verifica una cadena de texto
     * 
     * @param etiqueta texto a mostrar de la petición
     */
    public static String getString(String etiqueta) {
        Scanner sc = new Scanner(System.in);
        String dato;
        do {
            System.out.println(etiqueta);
            dato = sc.nextLine();
            if (dato.trim().length() == 0)
                System.out.println("WARNING! No es posible dejar campos sin llenar :( \n");
        } while (dato.trim().length() == 0);
        return dato;
    }

    public static boolean validarDatoEntero(String dato) {
        return dato.matches("[0-9]{1,9}");
    }

    public static boolean validarDatoFloat(String dato) {
        return dato.matches("[0-9]{1,9}.[0-9]{1,9}");
    }

}