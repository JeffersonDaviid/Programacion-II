import UI_Interface.Disconected;
import UI_Interface.Login;
import java.sql.*;

public class App {

    /* Test the button */
    public static void main(String[] args) {
        // v.setVisible(true);
        // Login vsdf = new Login();

        // INGRESAR DATOS EN LA BASE DE DATOS
        try {
            // ("RUTA Y NOMBRE DE LA BASE DE DATOS","USUARIO","CONTRASEÑA")
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_usuarios", "root", "");
            // // Query
            // PreparedStatement pst = cn.prepareStatement("insert into usuarios
            // values(?,?,?,?,?,?,?,?,?,?,?)");
            // // Llenando la base de datos
            // pst.setString(1, "DEVELOPER");
            // pst.setString(2, "271001");
            // pst.setString(3, "ADMINISTRADOR");
            // pst.setString(4, "ACTIVO");
            // pst.setString(5, " ");
            // pst.setString(6, " ");
            // pst.setString(7, " ");
            // pst.setString(8, " ");
            // pst.setString(9, " ");
            // pst.setString(10, " ");
            // pst.setInt(11, 21);
            // pst.executeUpdate(); // ENVIAR A LA BASE

            // // Consultar la base de datos
            // PreparedStatement pst = cn.prepareStatement("select * from usuarios where
            // User = ?");
            // pst.setString(1, txtUsuario.getText().trim());
            // // permite conocer si encontro los datos
            // ResultSet resultado = pst.executeQuery();

            // if (resultado.next()) {
            // JOptionPane.showMessageDialog(null, "El usuario " +
            // resultado.getString("User").toUpperCase() + " es "
            // + resultado.getString("Role").toUpperCase());
            // } else {
            // JOptionPane.showMessageDialog(null, "El usuario " +
            // txtUsuario.getText().toUpperCase()
            // + " no se encuentra en la base de datos");
            // }
            Login v = new Login();
            v.setVisible(true);
        } catch (Exception errorConectionInitial) {
            Disconected d = new Disconected();
            d.setVisible(true);
            // sudo /opt/lampp/lampp start -> inicar
            // sudo /opt/lampp/lampp stop -> parar
        }
    }
}