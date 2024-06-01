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

public class VentanaPrincipalInicio extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private static final int ANCHO = 600;
	private static final int ALTO = 350;
	
	public static final String ACT_CMN_BTN_CREAR_CUENTA = "Crear Cuenta";
	public static final String ACT_CMN_BTN_INICIAR_SESION = "Iniciar sesión";
	
	private JTextField txtEmail;
	private JLabel lblLogin;
	private JButton btnCrearCuenta;
	private JButton btnIniciarSesion;
	private JScrollPane scrpContenedor;
	private JPasswordField pwdContrasenia;
	private JButton btnIcon;
	
	public VentanaPrincipalInicio() {
		setTitle("LenjuagePlus");
		
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
		
		lblLogin = new JLabel("LOGIN");
		lblLogin.setBounds(228, 102, 130, 13);
		getContentPane().add(lblLogin);
		
		txtEmail = new JTextField();
		txtEmail.setToolTipText("Email");
		txtEmail.setBounds(228, 154, 130, 19);
		getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		btnCrearCuenta = new JButton(ACT_CMN_BTN_CREAR_CUENTA);
		btnCrearCuenta.setBounds(235, 278, 115, 21);
		btnCrearCuenta.setText("Crear Cuenta");

		getContentPane().add(btnCrearCuenta);
		
		btnIniciarSesion = new JButton(ACT_CMN_BTN_INICIAR_SESION);
		btnIniciarSesion.setBounds(235, 244, 115, 21);
		getContentPane().add(btnIniciarSesion);
		
		pwdContrasenia = new JPasswordField();
		pwdContrasenia.setToolTipText("Contraseña");
		pwdContrasenia.setColumns(10);
		pwdContrasenia.setBounds(228, 212, 130, 19);
		getContentPane().add(pwdContrasenia);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(228, 128, 45, 13);
		getContentPane().add(lblEmail);
		
		JLabel lblContrasenia = new JLabel("Contraseña");
		lblContrasenia.setBounds(228, 186, 72, 13);
		getContentPane().add(lblContrasenia);
		
		btnIcon = new JButton("");
		btnIcon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIcon.setIcon(new ImageIcon(VentanaPrincipalInicio.class.getResource("/view/Images/LogoPic2.png")));
		btnIcon.setBackground(new Color(51, 255, 102));
		btnIcon.setForeground(new Color(51, 255, 102));
		btnIcon.setBounds(235, 13, 115, 76);
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

	public void cargarPanel(JPanel panel) {
		scrpContenedor.setViewportView(panel);
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
}
