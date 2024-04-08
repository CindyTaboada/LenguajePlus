package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.SystemColor;

public class VentanaPrincipalInicio extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private static final int ANCHO = 600;
	private static final int ALTO = 350;
	
	private JTextField txtEmail;
	private JTextField txtContrasenia;
	private JLabel lblO;
	private JLabel lblLogin;
	private JLabel lblImagen;
	private JButton btnCrearCuenta;
	
	public VentanaPrincipalInicio() {
		setTitle("Inicio");
		
		configurarFrame();
		
		configurarComponentes();
	}

	private void configurarComponentes() {
		getContentPane().setBackground(SystemColor.controlHighlight);
		getContentPane().setLayout(null);
		
		lblImagen = new JLabel("Imagen");
		lblImagen.setBounds(252, 10, 50, 50);
		getContentPane().add(lblImagen);
		
		lblLogin = new JLabel("LOGIN");
		lblLogin.setBounds(212, 91, 130, 13);
		getContentPane().add(lblLogin);
		
		txtEmail = new JTextField();
		txtEmail.setText("Email");
		txtEmail.setBounds(212, 114, 130, 19);
		getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		txtContrasenia = new JTextField();
		txtContrasenia.setText("Contraseña");
		txtContrasenia.setBounds(212, 140, 130, 19);
		getContentPane().add(txtContrasenia);
		txtContrasenia.setColumns(10);
		
		lblO = new JLabel("O");
		lblO.setBounds(270, 169, 14, 13);
		getContentPane().add(lblO);
		
		btnCrearCuenta = new JButton("Crear Cuenta");
		btnCrearCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				VentanaCrearCuenta ventanaCrearCuenta = new VentanaCrearCuenta();
				ventanaCrearCuenta.setVisible(true);
			}
		});
		btnCrearCuenta.setBounds(220, 192, 115, 21);
		getContentPane().add(btnCrearCuenta);
	}
	
	private void configurarFrame() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(ANCHO, ALTO);
		
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
}
