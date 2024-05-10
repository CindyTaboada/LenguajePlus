package view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control.VentanaPrincipalInicioListener;

import java.awt.Font;
import java.awt.SystemColor;
public class VentanaCrearCuenta extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private static final int ANCHO = 600;
	private static final int ALTO = 350;
	private JLabel lblTituloCrearCuenta;
	private JTextField txtNombreYApellido;
	private JTextField txtEdad;
	private JTextField txtEmail;
	private JTextField txtContrasenia;
	private JButton btnCancelarCrearCuenta;
	private JButton btnConfirmarCrearCuenta;
	
	public VentanaCrearCuenta() {
		configurarComponentes();
		
	}
	private void configurarComponentes() {
		setBackground(SystemColor.controlHighlight);
		setLayout(null);
		setSize(ANCHO, ALTO);
		
		lblTituloCrearCuenta = new JLabel("Crear Cuenta");
		lblTituloCrearCuenta.setBackground(new Color(192, 192, 192));
		lblTituloCrearCuenta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTituloCrearCuenta.setBounds(215, 10, 126, 59);
		add(lblTituloCrearCuenta);
		
		txtNombreYApellido = new JTextField();
		txtNombreYApellido.setToolTipText("Nombre y Apellido");
		txtNombreYApellido.setText("Nombre y Apellido");
		txtNombreYApellido.setBounds(215, 61, 126, 24);
		add(txtNombreYApellido);
		txtNombreYApellido.setColumns(10);
		
		txtEdad = new JTextField();
		txtEdad.setToolTipText("Edad");
		txtEdad.setText("Edad");
		txtEdad.setColumns(10);
		txtEdad.setBounds(215, 95, 126, 24);
		add(txtEdad);
		
		txtEmail = new JTextField();
		txtEmail.setToolTipText("Email");
		txtEmail.setText("Email");
		txtEmail.setColumns(10);
		txtEmail.setBounds(215, 129, 126, 24);
		add(txtEmail);
		// TODO: verificar email
		
		txtContrasenia = new JTextField();
		txtContrasenia.setToolTipText("Contraseña");
		txtContrasenia.setText("Contraseña");
		txtContrasenia.setColumns(10);
		txtContrasenia.setBounds(215, 163, 126, 24);
		add(txtContrasenia);
		
		btnCancelarCrearCuenta = new JButton("Cancelar");
		btnCancelarCrearCuenta.setBounds(157, 223, 97, 21);
		add(btnCancelarCrearCuenta);
		
		btnConfirmarCrearCuenta = new JButton("Confirmar");
		btnConfirmarCrearCuenta.setBounds(307, 223, 97, 21);
		add(btnConfirmarCrearCuenta);
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
	public void setListener(VentanaPrincipalInicioListener l) {
		btnCancelarCrearCuenta.addActionListener(l);
		btnConfirmarCrearCuenta.addActionListener(l);
		
	}
}


