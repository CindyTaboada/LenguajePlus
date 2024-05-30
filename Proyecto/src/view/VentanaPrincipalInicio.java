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
import javax.swing.ScrollPaneConstants;
import javax.swing.WindowConstants;
import javax.swing.JPasswordField;

public class VentanaPrincipalInicio extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private static final int ANCHO = 600;
	private static final int ALTO = 350;
	
	private JTextField txtEmail;
	private JLabel lblLogin;
	private JLabel lblImagen;
	private JButton btnCrearCuenta;
	private JButton btnIniciarSesion;
	private JScrollPane scrpContenedor;
	private JPasswordField pwdContrasenia;
	
	public VentanaPrincipalInicio() {
		
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
		
		lblImagen = new JLabel("Imagen");
		lblImagen.setBounds(268, 13, 50, 50);
		getContentPane().add(lblImagen);
		
		lblLogin = new JLabel("LOGIN");
		lblLogin.setBounds(228, 76, 130, 13);
		getContentPane().add(lblLogin);
		
		txtEmail = new JTextField();
		txtEmail.setToolTipText("Email");
		txtEmail.setBounds(228, 128, 130, 19);
		getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		btnCrearCuenta = new JButton("Crear Cuenta");
		btnCrearCuenta.setBounds(243, 251, 115, 21);
		getContentPane().add(btnCrearCuenta);
		
		btnIniciarSesion = new JButton("Iniciar sesión");
		btnIniciarSesion.setBounds(243, 218, 115, 21);
		getContentPane().add(btnIniciarSesion);
		
		pwdContrasenia = new JPasswordField();
		pwdContrasenia.setToolTipText("Contraseña");
		pwdContrasenia.setColumns(10);
		pwdContrasenia.setBounds(228, 186, 130, 19);
		getContentPane().add(pwdContrasenia);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(228, 102, 45, 13);
		getContentPane().add(lblEmail);
		
		JLabel lblContrasenia = new JLabel("Contraseña");
		lblContrasenia.setBounds(228, 160, 72, 13);
		getContentPane().add(lblContrasenia);
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

	public void cargarPanel(VentanaCrearCuenta vcc) {
		scrpContenedor.setViewportView(vcc);
		
	}
}
