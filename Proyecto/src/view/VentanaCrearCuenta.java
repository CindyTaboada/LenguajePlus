package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import control.VentanaPrincipalListener;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
public class VentanaCrearCuenta extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private static final int ANCHO = 600;
	private static final int ALTO = 350;
	
	private JLabel lblTituloCrearCuenta;
	private JTextField txtNombre;
	private JTextField txtApellido1;
	private JTextField txtEmail;
	private JButton btnCancelarCrearCuenta;
	private JButton btnConfirmarCrearCuenta;
	private JLabel lblNombre;
	private JLabel lblEdad;
	private JLabel lblEmail;
	private JLabel lblContrasenia;
	private JPasswordField pwdConstrasenia;
	private JLabel lblApellido1;
	private JLabel lblApellido2;
	private JTextField txtApellido2;
	private JLabel lblConfirmarContrasenia;
	private JPasswordField pwdConfirmarContrasenia;
	private JSpinner spnEdad;
	private JButton btnAtras;
	
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
		lblTituloCrearCuenta.setBounds(229, 5, 126, 48);
		getContentPane().add(lblTituloCrearCuenta);
		
		lblNombre = new JLabel("Nombre ");
		lblNombre.setBounds(16, 65, 57, 13);
		getContentPane().add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setToolTipText("");
		txtNombre.setBounds(78, 60, 182, 24);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		lblApellido1 = new JLabel("Primer apellido:");
		lblApellido1.setBounds(16, 96, 112, 13);
		getContentPane().add(lblApellido1);
		
		txtApellido1 = new JTextField();
		txtApellido1.setToolTipText("");
		txtApellido1.setColumns(10);
		txtApellido1.setBounds(118, 90, 143, 24);
		getContentPane().add(txtApellido1);
		
		lblApellido2 = new JLabel("Segundo Apellido:");
		lblApellido2.setBounds(277, 96, 126, 13);
		getContentPane().add(lblApellido2);
		
		txtApellido2 = new JTextField();
		txtApellido2.setToolTipText("");
		txtApellido2.setColumns(10);
		txtApellido2.setBounds(412, 90, 157, 24);
		getContentPane().add(txtApellido2);
		
		lblEdad = new JLabel("Edad");
		lblEdad.setBounds(16, 136, 45, 13);
		getContentPane().add(lblEdad);
		
		spnEdad = new JSpinner();
		spnEdad.setBounds(78, 129, 57, 26);
		getContentPane().add(spnEdad);
		
		lblEmail = new JLabel("Email");
		lblEmail.setBounds(16, 168, 45, 13);
		getContentPane().add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setToolTipText("");
		txtEmail.setColumns(10);
		txtEmail.setBounds(78, 162, 355, 24);
		getContentPane().add(txtEmail);
		
		lblContrasenia = new JLabel("Contraseña");
		lblContrasenia.setBounds(16, 198, 94, 13);
		getContentPane().add(lblContrasenia);
		
		pwdConstrasenia = new JPasswordField();
		pwdConstrasenia.setBounds(118, 198, 169, 22);
		getContentPane().add(pwdConstrasenia);
		
		lblConfirmarContrasenia = new JLabel("Confirmar contraseña:");
		lblConfirmarContrasenia.setBounds(16, 223, 157, 33);
		getContentPane().add(lblConfirmarContrasenia);
		
		pwdConfirmarContrasenia = new JPasswordField();
		pwdConfirmarContrasenia.setBounds(168, 232, 169, 22);
		getContentPane().add(pwdConfirmarContrasenia);
		
		btnConfirmarCrearCuenta = new JButton("Confirmar");
		btnConfirmarCrearCuenta.setBounds(148, 269, 97, 36);
		getContentPane().add(btnConfirmarCrearCuenta);
		
		btnCancelarCrearCuenta = new JButton("Cancelar");
		btnCancelarCrearCuenta.setBounds(277, 271, 97, 33);
		getContentPane().add(btnCancelarCrearCuenta);
		
		btnAtras = new JButton("Volver");
		btnAtras.setVerticalAlignment(SwingConstants.TOP);
		btnAtras.setFont(new Font("Dialog", Font.BOLD, 14));
		btnAtras.setBounds(511, 290, 83, 26);
		getContentPane().add(btnAtras);
	}
	

	
	public JButton getBtnCancelarCrearCuenta() {
		return btnCancelarCrearCuenta;
	}
	
	public JButton getBtnConfirmarCrearCuenta() {
		return btnConfirmarCrearCuenta;
	}
	
	
	
	public JButton getBtnAtras() {
		return btnAtras;
	}

	public void setListener(VentanaPrincipalListener l) {
		btnCancelarCrearCuenta.addActionListener(l);
		btnConfirmarCrearCuenta.addActionListener(l);	
		btnAtras.addActionListener(l);
	}
	
	
	
	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public JTextField getTxtApellido1() {
		return txtApellido1;
	}

	public JTextField getTxtEmail() {
		return txtEmail;
	}

	public JPasswordField getPwdConstrasenia() {
		return pwdConstrasenia;
	}

	public JTextField getTxtApellido2() {
		return txtApellido2;
	}

	public JPasswordField getPwdConfirmarContrasenia() {
		return pwdConfirmarContrasenia;
	}

	public JSpinner getSpnEdad() {
		return spnEdad;
	}

	public void hacerVisible() {
		setVisible(true);
	}
	
	public void limpiarDatos() {
		txtNombre.setText("");
		txtApellido1.setText("");
		txtApellido2.setText("");
		txtEmail.setText("");
		spnEdad.setValue("6");
		pwdConfirmarContrasenia.setText("");
		pwdConfirmarContrasenia.setText("");
	}
	
}


