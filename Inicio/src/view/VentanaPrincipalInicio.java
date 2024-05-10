package view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control.VentanaPrincipalInicioListener;

import javax.swing.JButton;

import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class VentanaPrincipalInicio extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private static final int ANCHO = 600;
	private static final int ALTO = 350;
	
	private JTextField txtEmail;
	private JTextField txtContrasenia;
	private JLabel lblO;
	private JLabel lblLogin;
	private JLabel lblImagen;
	private JButton btnCrearCuenta;
	private JButton btnIniciarSesion;
	private JScrollPane scrpContenedor;
	private JPanel panel;
	
	public VentanaPrincipalInicio() {
		
		setSize(ANCHO, ALTO);
		
		configurarComponentes();
	}
	
	private void configurarComponentes() {
		
		setBackground(SystemColor.controlHighlight);
		setLayout(null);
		
		scrpContenedor = new JScrollPane();
		scrpContenedor.setBounds(0, 0, 600, 350);
		add(scrpContenedor);
		scrpContenedor.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		panel = new JPanel();
		panel.setBackground(SystemColor.controlHighlight);
		scrpContenedor.setViewportView(panel);
		panel.setLayout(null);
		
		lblImagen = new JLabel("Imagen");
		lblImagen.setBounds(274, 24, 50, 50);
		panel.add(lblImagen);
		
		lblLogin = new JLabel("LOGIN");
		lblLogin.setBounds(234, 98, 130, 13);
		panel.add(lblLogin);
		
		txtEmail = new JTextField();
		txtEmail.setToolTipText("Email");
		txtEmail.setBounds(234, 135, 130, 19);
		panel.add(txtEmail);
		txtEmail.setText("Email");
		txtEmail.setColumns(10);
		
		txtContrasenia = new JTextField();
		txtContrasenia.setToolTipText("Contraseña");
		txtContrasenia.setBounds(234, 178, 130, 19);
		panel.add(txtContrasenia);
		txtContrasenia.setText("Contraseña");
		txtContrasenia.setColumns(10);
		
		lblO = new JLabel("O");
		lblO.setBounds(292, 266, 14, 13);
		panel.add(lblO);
		
		btnCrearCuenta = new JButton("Crear Cuenta");
		btnCrearCuenta.setBounds(241, 303, 115, 21);
		panel.add(btnCrearCuenta);
		
		btnIniciarSesion = new JButton("Iniciar sesión");
		btnIniciarSesion.setBounds(241, 221, 115, 21);
		panel.add(btnIniciarSesion);
	}
	
	public void setListener(VentanaPrincipalInicioListener l) {
		btnCrearCuenta.addActionListener(l);
		btnIniciarSesion.addActionListener(l);
	}
	
	public void hacerVisible() {
		setVisible(true);
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
