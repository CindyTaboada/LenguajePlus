package view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control.VentanaPrincipalListener;

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
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class VpInicio extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private static final int ANCHO = 600;
	private static final int ALTO = 350;
	
	public static final String ACT_CMN_BTN_CREAR_CUENTA = "Crear Cuenta";
	public static final String ACT_CMN_BTN_INICIAR_SESION = "Iniciar sesión";
	
	private JTextField txtEmail;
	private JLabel lblLogin;
	private JButton btnCrearCuenta;
	private JButton btnIniciarSesion;
	private JPasswordField pwdContrasenia;
	private JButton btnIcon;
	
	public VpInicio() {
		setTitle("LenjuagePlus");
		
		crearComponentes();
		
		configurarFrame();
		
		configurarComponentes();
	}

	private void crearComponentes() {
	}
	
	private void configurarFrame() {
		setSize(ANCHO, ALTO);
		
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((pantalla.width - this.getSize().width) / 2, (pantalla.height - this.getSize().height) / 2);
		
	}
	
	private void configurarComponentes() {
		
		setBackground(SystemColor.controlHighlight);
		getContentPane().setLayout(null);
		
		lblLogin = new JLabel("Inicia Sesión:");
		lblLogin.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblLogin.setBounds(235, 23, 210, 26);
		getContentPane().add(lblLogin);
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setBounds(235, 74, 45, 13);
		getContentPane().add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setToolTipText("Email");
		txtEmail.setBounds(315, 70, 130, 19);
		getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblContrasenia = new JLabel("Contraseña");
		lblContrasenia.setBounds(235, 113, 72, 13);
		getContentPane().add(lblContrasenia);
		
		pwdContrasenia = new JPasswordField();
		pwdContrasenia.setToolTipText("Contraseña");
		pwdContrasenia.setColumns(10);
		pwdContrasenia.setBounds(315, 109, 130, 19);
		getContentPane().add(pwdContrasenia);
		
		btnIniciarSesion = new JButton(ACT_CMN_BTN_INICIAR_SESION);
		btnIniciarSesion.setBounds(269, 160, 115, 39);
		getContentPane().add(btnIniciarSesion);
		
		JLabel lblTituloCuenta = new JLabel("¿Aún no tienes cuenta?");
		lblTituloCuenta.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTituloCuenta.setBounds(235, 206, 210, 25);
		getContentPane().add(lblTituloCuenta);
		
		btnCrearCuenta = new JButton(ACT_CMN_BTN_CREAR_CUENTA);
		btnCrearCuenta.setBounds(269, 243, 115, 39);
		btnCrearCuenta.setText("Crear Cuenta");

		getContentPane().add(btnCrearCuenta);
		
		btnIcon = new JButton("");
		btnIcon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIcon.setIcon(new ImageIcon(VpInicio.class.getResource("/view/Images/LogoPic2.png")));
		btnIcon.setBackground(new Color(51, 255, 102));
		btnIcon.setForeground(new Color(51, 255, 102));
		btnIcon.setBounds(36, 36, 165, 154);
		getContentPane().add(btnIcon);
		
		getContentPane().setBackground(new Color(51, 255, 102));
		
	}
	
	public void setListener(VentanaPrincipalListener l) {
		btnCrearCuenta.addActionListener(l);
		btnIniciarSesion.addActionListener(l);
	}
	
	public JButton getBtnCrearCuenta() {
		return btnCrearCuenta;
	}
	
	public JButton getBtnIniciarSesion() {
		return btnIniciarSesion;
		
	}
	


	public JTextField getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(JTextField txtEmail) {
		this.txtEmail = txtEmail;
	}

	public JPasswordField getPwdContrasenia() {
		return pwdContrasenia;
	}

	public void setPwdContrasenia(JPasswordField pwdContrasenia) {
		this.pwdContrasenia = pwdContrasenia;
	}

	public void limpiarDatos() {
		txtEmail.setText("");
		pwdContrasenia.setText("");
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
	
	
}
