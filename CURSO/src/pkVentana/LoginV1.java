package pkVentana;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;

import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
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

public class LoginV1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtContrasena;

	public LoginV1() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 383, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JLabel lbHeader = new JLabel("EASY SELL");
		lbHeader.setForeground(new Color(43, 168, 121));
		lbHeader.setFont(new Font("Impact", Font.PLAIN, 31));
		lbHeader.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbHeader, BorderLayout.NORTH);

		JLabel lbFooter = new JLabel("© Easy sell | Todos los derechos reservados");
		lbFooter.setFont(new Font("Yu Gothic", Font.BOLD, 11));
		lbFooter.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbFooter, BorderLayout.SOUTH);

		JPanel panelMain = new JPanel();
		contentPane.add(panelMain, BorderLayout.CENTER);
		panelMain.setLayout(null);

		JLabel lbUsuario = new JLabel("Usuario:");
		lbUsuario.setBounds(10, 150, 105, 19);
		panelMain.add(lbUsuario);

		txtUsuario = new JTextField();
		txtUsuario.setBounds(10, 180, 216, 29);
		panelMain.add(txtUsuario);
		txtUsuario.setColumns(10);

		JLabel lbContrasena = new JLabel("Contraseña:");
		lbContrasena.setBounds(10, 220, 105, 19);
		panelMain.add(lbContrasena);

		txtContrasena = new JPasswordField();
		txtContrasena.setBounds(10, 245, 216, 29);
		panelMain.add(txtContrasena);

		ImageIcon imLogo = new ImageIcon("images/logoEmpresa.png");
		JLabel lbLogo = new JLabel();
		lbLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lbLogo.setBounds(48, 11, 128, 128);
		lbLogo.setIcon(new ImageIcon(
				imLogo.getImage().getScaledInstance(lbLogo.getWidth(), lbLogo.getHeight(), Image.SCALE_DEFAULT)));
		panelMain.add(lbLogo);

		JLabel lbRol = new JLabel("Rol:");
		lbRol.setBounds(10, 285, 105, 14);
		panelMain.add(lbRol);

		// Forma actualizada de JComboBox
		// String[] comboItems = { "-- Seleccione una opcion --", "Administrador",
		// "Trabajador" };
		// JComboBox<String> comboRoles = new JComboBox<>(comboItems);
		JComboBox comboRoles = new JComboBox(new DefaultComboBoxModel(
				new String[] { "-- Seleccione una opcion --", "Administrador", "Trabajador" }));

		comboRoles.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboRoles.setToolTipText("");
		comboRoles.setBounds(10, 310, 158, 29);
		panelMain.add(comboRoles);

		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

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
					// pst.executeUpdate();

					// Consultar la base de datos
					PreparedStatement pst = cn.prepareStatement("select * from usuarios where User = ?");
					pst.setString(1, txtUsuario.getText().trim());
					// permite conocer si encontro los datos
					ResultSet resultado = pst.executeQuery();

					if (resultado.next()) {
						JOptionPane.showMessageDialog(null, "El usuario " +
								resultado.getString("User").toUpperCase() + " es "
								+ resultado.getString("Role").toUpperCase());
					} else {
						JOptionPane.showMessageDialog(null, "El usuario " + txtUsuario.getText().toUpperCase()
								+ " no se encuentra en la base de datos");
					}

				} catch (Exception error) {
					JOptionPane.showMessageDialog(null, "No se puede conectar con la base de datos");
					// sudo /opt/lampp/lampp start -> inicar
					// sudo /opt/lampp/lampp stop -> parar
				}

			}
		});
		btnIngresar.setBounds(60, 369, 116, 29);
		panelMain.add(btnIngresar);

		Component horizontalStrut_1 = Box.createHorizontalStrut(60);
		contentPane.add(horizontalStrut_1, BorderLayout.EAST);
		Component horizontalStrut_2 = Box.createHorizontalStrut(60);
		contentPane.add(horizontalStrut_2, BorderLayout.WEST);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginV1 frame = new LoginV1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
