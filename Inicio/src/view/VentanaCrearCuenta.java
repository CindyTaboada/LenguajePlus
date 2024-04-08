package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.awt.Font;
import java.awt.SystemColor;
public class VentanaCrearCuenta extends JFrame {
	
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
		setTitle("Crear Cuenta");
		
		configurarFrame();
		
		configurarComponentes();
	}

	private void configurarComponentes() {
		getContentPane().setBackground(SystemColor.controlHighlight);
		getContentPane().setLayout(null);
		
		lblTituloCrearCuenta = new JLabel("Crear Cuenta");
		lblTituloCrearCuenta.setBackground(new Color(192, 192, 192));
		lblTituloCrearCuenta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTituloCrearCuenta.setBounds(215, 10, 126, 59);
		getContentPane().add(lblTituloCrearCuenta);
		
		txtNombreYApellido = new JTextField();
		txtNombreYApellido.setText("Nombre y Apellido");
		txtNombreYApellido.setBounds(215, 61, 126, 24);
		getContentPane().add(txtNombreYApellido);
		txtNombreYApellido.setColumns(10);
		
		txtEdad = new JTextField();
		txtEdad.setText("Edad");
		txtEdad.setColumns(10);
		txtEdad.setBounds(215, 95, 126, 24);
		getContentPane().add(txtEdad);
		
		txtEmail = new JTextField();
		txtEmail.setText("Email");
		txtEmail.setColumns(10);
		txtEmail.setBounds(215, 129, 126, 24);
		getContentPane().add(txtEmail);
		// TODO: veruficar email
		
		txtContrasenia = new JTextField();
		txtContrasenia.setText("Contraseña");
		txtContrasenia.setColumns(10);
		txtContrasenia.setBounds(215, 163, 126, 24);
		getContentPane().add(txtContrasenia);
		
		btnCancelarCrearCuenta = new JButton("Cancelar");
		btnCancelarCrearCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				VentanaPrincipalInicio ventanaPrincipalInicio = new VentanaPrincipalInicio();
				ventanaPrincipalInicio.setVisible(true);
			}
		});
		btnCancelarCrearCuenta.setBounds(157, 223, 97, 21);
		getContentPane().add(btnCancelarCrearCuenta);
		
		btnConfirmarCrearCuenta = new JButton("Confirmar");
		btnConfirmarCrearCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				VentanaPrincipalInicio ventanaPrincipalInicio = new VentanaPrincipalInicio();
				ventanaPrincipalInicio.setVisible(true);
			}
		});
		btnConfirmarCrearCuenta.setBounds(307, 223, 97, 21);
		getContentPane().add(btnConfirmarCrearCuenta);
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


