package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import control.VentanaListener;

import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
public class VpCrearCuenta extends JFrame {
	
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
	
	public VpCrearCuenta() {
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
		spnEdad.setModel(new SpinnerNumberModel(Integer.valueOf(6), Integer.valueOf(6), null, Integer.valueOf(1)));
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
		

	}
	
	public void setListener(VentanaListener l) {
		btnCancelarCrearCuenta.addActionListener(l);
		btnConfirmarCrearCuenta.addActionListener(l);	
		
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


	public JTextField getTxtNombre() {
		txtNombre.getText();
		return txtNombre;
	}

	public JTextField getTxtApellido1() {
		txtApellido1.getText();
		return txtApellido1;
	}

	public JTextField getTxtEmail() {
		txtEmail.getText();
		return txtEmail;
	}

	public JTextField getTxtApellido2() {
		txtApellido2.getText();
		return txtApellido2;
	}

	public JPasswordField getPwdConstrasenia() {
		return pwdConstrasenia;
	}


	public JPasswordField getPwdConfirmarContrasenia() {
		return pwdConfirmarContrasenia;
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


