package UI_Interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Panel;
import javax.swing.JPopupMenu;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import java.awt.SystemColor;
import java.awt.Cursor;
import javax.swing.JRadioButtonMenuItem;

public class PrincipalModelo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalModelo frame = new PrincipalModelo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PrincipalModelo() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1300, 750);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel footer = new JPanel();
		contentPane.add(footer, BorderLayout.SOUTH);
		footer.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel footer_leyenda = new JLabel("© EASY SELL | Todos los derechos reservados");
		footer.add(footer_leyenda);
		
		JPanel header = new JPanel();
		contentPane.add(header, BorderLayout.NORTH);
		FlowLayout fl_header = new FlowLayout(FlowLayout.LEFT, 5, 5);
		header.setLayout(fl_header);
		
		JMenuBar menu_contenedor = new JMenuBar();
		menu_contenedor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		header.add(menu_contenedor);
		
		JMenuItem menuItem_CerrarSesion = new JMenuItem("Cerrar sesion");
		menu_contenedor.add(menuItem_CerrarSesion);
		
		JMenuItem mntmConfiguracion = new JMenuItem("Configuracion");
		menu_contenedor.add(mntmConfiguracion);
		
		JMenu mnNewMenu = new JMenu("Configuracion");
		menu_contenedor.add(mnNewMenu);
		
		JMenuItem mntmCerrarSesion = new JMenuItem("Cerrar Sesion");
		mnNewMenu.add(mntmCerrarSesion);
		
		JPanel contenedor = new JPanel();
		contentPane.add(contenedor, BorderLayout.WEST);
		
		JMenuItem mntmCerrarSesion_1 = new JMenuItem("Cerrar Sesion");
		contenedor.add(mntmCerrarSesion_1);
		
		Panel aside = new Panel();
		contentPane.add(aside, BorderLayout.CENTER);
	}

}
