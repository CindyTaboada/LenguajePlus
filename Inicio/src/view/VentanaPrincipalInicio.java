package view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;

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
	
	public VentanaPrincipalInicio() {
		configurarFrame();
		
		configurarComponentes();
	}

	private void configurarComponentes() {
		setBackground(SystemColor.controlHighlight);
		setLayout(null);
		
		lblImagen = new JLabel("Imagen");
		lblImagen.setBounds(252, 10, 50, 50);
		add(lblImagen);
		
		lblLogin = new JLabel("LOGIN");
		lblLogin.setBounds(212, 91, 130, 13);
		add(lblLogin);
		
		txtEmail = new JTextField();
		txtEmail.setText("Email");
		txtEmail.setBounds(212, 114, 130, 19);
		add(txtEmail);
		txtEmail.setColumns(10);
		
		txtContrasenia = new JTextField();
		txtContrasenia.setText("Contraseña");
		txtContrasenia.setBounds(212, 140, 130, 19);
		add(txtContrasenia);
		txtContrasenia.setColumns(10);
		
		lblO = new JLabel("O");
		lblO.setBounds(270, 169, 14, 13);
		add(lblO);
		
		btnCrearCuenta = new JButton("Crear Cuenta");
		btnCrearCuenta.setBounds(220, 192, 115, 21);
		add(btnCrearCuenta);
	}
	
	private void configurarFrame() {
//		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//		setLocationRelativeTo(null);
		setSize(ANCHO, ALTO);
		
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
}
