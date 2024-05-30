package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import control.VentanaPrincipalInicioListener;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.JPasswordField;
public class VentanaCrearCuenta extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private static final int ANCHO = 600;
	private static final int ALTO = 350;
	
	private JLabel lblTituloCrearCuenta;
	private JTextField txtNombreYApellido;
	private JTextField txtEdad;
	private JTextField txtEmail;
	private JButton btnCancelarCrearCuenta;
	private JButton btnConfirmarCrearCuenta;
	private JLabel lblNombreYApellido;
	private JLabel lblEdad;
	private JLabel lblEmail;
	private JLabel lblContrasenia;
	private JPasswordField pwdConstrasenia;
	
	public VentanaCrearCuenta() {
		getContentPane().setBackground(new Color(51, 255, 102));
		
		configurarFrame();
		
		configurarComponentes();
		
	}
	
	private void configurarFrame() {
		setSize(ANCHO, ALTO);
		
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((pantalla.width - this.getSize().width) / 2, (pantalla.height - this.getSize().height) / 2);

	}
	
	private void configurarComponentes() {
		setBackground(new Color(51, 255, 102));
		getContentPane().setLayout(null);
		setSize(ANCHO, ALTO);
		
		lblTituloCrearCuenta = new JLabel("Crear Cuenta");
		lblTituloCrearCuenta.setBackground(new Color(192, 192, 192));
		lblTituloCrearCuenta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTituloCrearCuenta.setBounds(230, 7, 126, 59);
		getContentPane().add(lblTituloCrearCuenta);
		
		txtNombreYApellido = new JTextField();
		txtNombreYApellido.setToolTipText("Nombre y Apellido");
		txtNombreYApellido.setBounds(230, 93, 126, 24);
		getContentPane().add(txtNombreYApellido);
		txtNombreYApellido.setColumns(10);
		
		txtEdad = new JTextField();
		txtEdad.setToolTipText("Edad");
		txtEdad.setColumns(10);
		txtEdad.setBounds(230, 144, 126, 24);
		getContentPane().add(txtEdad);
		
		txtEmail = new JTextField();
		txtEmail.setToolTipText("Email");
		txtEmail.setColumns(10);
		txtEmail.setBounds(230, 195, 126, 24);
		getContentPane().add(txtEmail);
		
		btnCancelarCrearCuenta = new JButton("Cancelar");
		btnCancelarCrearCuenta.setBounds(357, 275, 97, 21);
		getContentPane().add(btnCancelarCrearCuenta);
		
		btnConfirmarCrearCuenta = new JButton("Confirmar");
		btnConfirmarCrearCuenta.setBounds(130, 275, 97, 21);
		getContentPane().add(btnConfirmarCrearCuenta);
		
		lblNombreYApellido = new JLabel("Nombre Y Apellido");
		lblNombreYApellido.setBounds(230, 73, 126, 13);
		getContentPane().add(lblNombreYApellido);
		
		lblEdad = new JLabel("Edad");
		lblEdad.setBounds(230, 124, 45, 13);
		getContentPane().add(lblEdad);
		
		lblEmail = new JLabel("Email");
		lblEmail.setBounds(230, 175, 45, 13);
		getContentPane().add(lblEmail);
		
		lblContrasenia = new JLabel("Contraseña");
		lblContrasenia.setBounds(230, 226, 94, 13);
		getContentPane().add(lblContrasenia);
		
		pwdConstrasenia = new JPasswordField();
		pwdConstrasenia.setBounds(230, 246, 126, 22);
		getContentPane().add(pwdConstrasenia);
	}
	
	public void setListener(VentanaPrincipalInicioListener l) {
		btnCancelarCrearCuenta.addActionListener(l);
		btnConfirmarCrearCuenta.addActionListener(l);	
	}
	
	public JButton getBtnCancelarCrearCuenta() {
		return btnCancelarCrearCuenta;
	}
	
	public JButton getBtnConfirmarCrearCuenta() {
		return btnConfirmarCrearCuenta;
	}
}


