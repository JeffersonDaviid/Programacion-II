package UI_Interface;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtContrasena;

	public static void main(String[] args) {
		// Login frame = new Login();
		// frame.setVisible(true);
		// frame.setIconImage(new
		// ImageIcon(getClass().getResource("images/logoEmpresa.png")).getImage());

	}

	public Login() {
		// setIconImage(new
		// ImageIcon(getClass().getResource("images/logoEmpresa.png")).getImage());

		setTitle("Iniciar sesión");
		setBounds(0, 0, 800, 400);
		contentPane = new JPanel();
		contentPane.setAutoscrolls(true);
		contentPane.setFont(new Font("FreeSerif", Font.PLAIN, 12));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		// setVisible(true); // NO PUEDE estar en el constructor
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lbNameBusiness = new JLabel("EASY SELL");
		lbNameBusiness.setFont(new Font("DejaVu Sans Mono", Font.BOLD | Font.ITALIC, 35));
		lbNameBusiness.setHorizontalAlignment(SwingConstants.CENTER);
		lbNameBusiness.setBounds(12, 0, 776, 42);
		contentPane.add(lbNameBusiness);

		JLabel lbEslogan = new JLabel("Te ayudamos en todo");
		lbEslogan.setForeground(new Color(255, 255, 255));
		lbEslogan.setHorizontalAlignment(SwingConstants.CENTER);
		lbEslogan.setHorizontalTextPosition(SwingConstants.CENTER);
		lbEslogan.setFont(new Font("Chandas", Font.ITALIC, 20));
		lbEslogan.setBounds(12, 27, 776, 51);
		contentPane.add(lbEslogan);

		JLabel lbLeyenda = new JLabel("Registre sus Datos");
		lbLeyenda.setHorizontalAlignment(SwingConstants.CENTER);
		lbLeyenda.setFont(new Font("Dialog", Font.BOLD, 13));
		lbLeyenda.setBounds(481, 79, 255, 17);
		contentPane.add(lbLeyenda);

		JLabel lblUsuario_icon = new JLabel();
		lblUsuario_icon.setBounds(434, 130, 30, 30);
		ImageIcon imgUsuario = new ImageIcon("images/icons/user.png");
		Icon iconUsuario = new ImageIcon(
				imgUsuario.getImage().getScaledInstance(lblUsuario_icon.getWidth(), lblUsuario_icon.getHeight(),
						Image.SCALE_SMOOTH));
		lblUsuario_icon.setIcon(iconUsuario);
		contentPane.add(lblUsuario_icon);

		JLabel lbContrasena_icon = new JLabel();
		lbContrasena_icon.setBounds(434, 250, 30, 30);
		ImageIcon imgContrasena = new ImageIcon("images/icons/password.png");
		Icon iconContrasena = new ImageIcon(
				imgContrasena.getImage().getScaledInstance(lbContrasena_icon.getWidth(),
						lbContrasena_icon.getHeight(),
						Image.SCALE_DEFAULT));
		lbContrasena_icon.setIcon(iconContrasena);
		contentPane.add(lbContrasena_icon);

		txtUsuario = new JTextField();
		txtUsuario.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtUsuario.setFont(new Font("Dialog", Font.PLAIN, 13));
		txtUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		txtUsuario.setOpaque(false);
		txtUsuario.setBounds(481, 130, 255, 30);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);

		txtContrasena = new JPasswordField();
		txtContrasena.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtContrasena.setHorizontalAlignment(SwingConstants.CENTER);
		txtContrasena.setOpaque(false);
		txtContrasena.setBounds(482, 250, 253, 30);
		contentPane.add(txtContrasena);

		JComboBox comboRol = new JComboBox(new String[] { "Administrador", "Trabajador", "Otro" });
		comboRol.setForeground(Color.DARK_GRAY);
		comboRol.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboRol.setBackground(new Color(246, 211, 45));
		comboRol.setBounds(497, 195, 223, 24);
		contentPane.add(comboRol);

		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iniciarSesion();
			}
		});
		btnIngresar.setBackground(new Color(246, 211, 45));
		btnIngresar.setBorderPainted(false);
		btnIngresar.setBorder(new LineBorder(new Color(73, 168, 53), 10, true));
		btnIngresar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		setLocationRelativeTo(null);
		btnIngresar.setBounds(550, 318, 117, 25);
		contentPane.add(btnIngresar);

		JLabel lbBackground = new JLabel();
		lbBackground.setBounds(0, 0, 821, 372);
		ImageIcon imageBackground = new ImageIcon("images/loginBackground.jpg");
		Icon iconBackgound = new ImageIcon(
				imageBackground.getImage().getScaledInstance(lbBackground.getWidth(), lbBackground.getHeight(),
						Image.SCALE_SMOOTH));
		lbBackground.setIcon(iconBackgound);
		contentPane.add(lbBackground);
	}

	public void iniciarSesion() {
		try {
			// Consultar la base de datos
			// ("RUTA Y NOMBRE DE LA BASE DE DATOS","USUARIO","CONTRASEÑA")
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd_usuarios", "root", "");
			PreparedStatement consulta = conexion
					.prepareStatement("select * from usuarios where User = ?");
			consulta.setString(1, txtUsuario.getText().trim());// otra opcion
			// permite conocer si encontro los datos
			ResultSet resultado = consulta.executeQuery();

			if (resultado.next()) {
				if (resultado.getString("User").toUpperCase().equals(txtUsuario.getText().trim().toUpperCase())
						&& resultado.getString("Password").equals(new String(txtContrasena.getPassword()))) {

					JOptionPane.showMessageDialog(null, "Bienvenido usuario " +
							resultado.getString("User").toUpperCase() + " Su pass es "
							+ resultado.getString("Password") + "Y su selección es ");

					PrincipalAdmin p = new PrincipalAdmin();
					p.setVisible(true);
					this.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null, "Usuario o Contraseña son incorrectos, intente nuevamente");
				}
			} else {
				JOptionPane.showMessageDialog(null, "El usuario " +
						txtUsuario.getText().toUpperCase()
						+ " no se encuentra en la base de datos");
			}

			// // Query
			// PreparedStatement inputDataBase = conexion
			// .prepareStatement("insert into usuarios values(?,?,?,?,?,?,?,?,?,?,?)");
			// // Llenando la base de datos
			// inputDataBase.setString(1, "emersonjones18");
			// inputDataBase.setString(2, "271511");
			// inputDataBase.setString(3, "Trabajador");
			// inputDataBase.setString(4, "ACTIVO");
			// inputDataBase.setString(5, "Emerson");
			// inputDataBase.setString(6, "Daniel");
			// inputDataBase.setString(7, "Jones");
			// inputDataBase.setString(8, "Germain");
			// inputDataBase.setString(9, "1860576842");
			// inputDataBase.setString(10, "0992758487");
			// inputDataBase.setInt(11, 25);
			// inputDataBase.executeUpdate(); // ENVIAR A LA BASE

			conexion.close();
		} catch (SQLException errorSesion) {
			JOptionPane.showMessageDialog(null, "No se puede conectar con la base de datos");
		}
	}
}
