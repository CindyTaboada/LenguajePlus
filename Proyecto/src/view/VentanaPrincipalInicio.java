package view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control.VentanaPrincipalInicioListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JScrollPane;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.ImageIcon;

public class VentanaPrincipalInicio extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private static final int ANCHO = 600;
	private static final int ALTO = 350;
	
	public static final String ACT_CMN_BTN_CREAR_CUENTA = "Crear Cuenta";
	public static final String ACT_CMN_BTN_INICIAR_SESION = "Iniciar sesión";
	
	private JTextField txtEmail;
	private JLabel lblLogin;
	private JButton btnCrearCuenta;
	private JButton btnIniciarSesion;
	private JScrollPane scrpContenedor;
	private JPasswordField pwdContrasenia;
	
	public VentanaPrincipalInicio() {
		setTitle("LenjuagePlus");
		
		crearComponentes();
		
		configurarFrame();
		
		configurarComponentes();
	}

	private void crearComponentes() {
		scrpContenedor = new JScrollPane();
		getContentPane().add(scrpContenedor, BorderLayout.CENTER);
	}
	
	private void configurarFrame() {
		setSize(ANCHO, ALTO);
		
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((pantalla.width - this.getSize().width) / 2, (pantalla.height - this.getSize().height) / 2);
		
	}
	
	private void configurarComponentes() {
		
		setBackground(SystemColor.controlHighlight);
		getContentPane().setLayout(null);
		
		lblLogin = new JLabel("LOGIN");
		lblLogin.setBounds(228, 91, 130, 13);
		getContentPane().add(lblLogin);
		
		txtEmail = new JTextField();
		txtEmail.setToolTipText("Email");
		txtEmail.setBounds(228, 145, 130, 19);
		getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		btnCrearCuenta = new JButton(ACT_CMN_BTN_CREAR_CUENTA);
		btnCrearCuenta.setBounds(235, 273, 115, 21);
		btnCrearCuenta.setText("Crear Cuenta");

		getContentPane().add(btnCrearCuenta);
		
		btnIniciarSesion = new JButton(ACT_CMN_BTN_INICIAR_SESION);
		btnIniciarSesion.setBounds(235, 238, 115, 21);
		getContentPane().add(btnIniciarSesion);
		
		pwdContrasenia = new JPasswordField();
		pwdContrasenia.setToolTipText("Contraseña");
		pwdContrasenia.setColumns(10);
		pwdContrasenia.setBounds(228, 205, 130, 19);
		getContentPane().add(pwdContrasenia);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(228, 118, 45, 13);
		getContentPane().add(lblEmail);
		
		JLabel lblContrasenia = new JLabel("Contraseña");
		lblContrasenia.setBounds(228, 178, 72, 13);
		getContentPane().add(lblContrasenia);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon(VentanaPrincipalInicio.class.getResource("/view/Images/Webp.net-resizeimage.png")));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(254, 14, 78, 63);
		getContentPane().add(btnNewButton);
		
		getContentPane().setBackground(new Color(51, 255, 102));
		
	}
	
	public void setListener(VentanaPrincipalInicioListener l) {
		btnCrearCuenta.addActionListener(l);
		btnIniciarSesion.addActionListener(l);
	}
	
	public JButton getBtnCrearCuenta() {
		return btnCrearCuenta;
	}
	
	public JButton getBtnIniciarSesion() {
		return btnIniciarSesion;
	}

	public void cargarPanel(JPanel panel) {
		scrpContenedor.setViewportView(panel);
	}
}
