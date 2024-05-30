package view;

import javax.swing.JFrame;

import control.VentanaPrincipalInicioListener;

import javax.swing.JButton;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;


public class VPrincipalLenguaje extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private static final int ANCHO = 600;
	private static final int ALTO = 350;

	public static final String ACT_CMN_BTN_JAVA = "JAVA";
	public static final String ACT_CMN_BTN_GIT = "GIT";
	public static final String ACT_CMN_BTN_SQL = "SQL";
	public static final String ACT_CMN_BTN_LINUX = "LINUX";
	public static final String ACT_CMN_BTN_JAVASCRIPT = "JAVASCRIPT";
	
	private JButton btnJava;
	private JButton btnGit;
	private JButton btnSql;
	private JButton btnLinux;
	private JButton btnJavaScript;
	private JLabel lblEligeLen;
	private JButton btnAtras;

	public VPrincipalLenguaje() {
		getContentPane().setBackground(new Color(51, 255, 102));
		
		setTitle("LengaujePlus");
		
		configurarComponetes();
		
		configurarFrame();
		
		
	}
	

	private void configurarFrame() {
		
		setSize(ANCHO, ALTO);
		
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((pantalla.width - this.getSize().width) / 2, (pantalla.height - this.getSize().height) / 2);
		
	}


	private void configurarComponetes() {
		getContentPane().setLayout(null);
		
		btnJava = new JButton(ACT_CMN_BTN_JAVA);
		btnJava.setFont(new Font("Sylfaen", Font.BOLD, 18));
		btnJava.setBounds(27, 136, 159, 47);
		getContentPane().add(btnJava);
		
		btnLinux = new JButton(ACT_CMN_BTN_LINUX);
		btnLinux.setFont(new Font("Sylfaen", Font.BOLD, 18));
		btnLinux.setBounds(399, 136, 159, 47);
		getContentPane().add(btnLinux);
		
		btnGit = new JButton(ACT_CMN_BTN_GIT);
		btnGit.setFont(new Font("Sylfaen", Font.BOLD, 18));
		btnGit.setBounds(27, 254, 159, 47);
		getContentPane().add(btnGit);
		
		btnJavaScript = new JButton( ACT_CMN_BTN_JAVASCRIPT);
		btnJavaScript.setFont(new Font("Sylfaen", Font.BOLD, 18));
		btnJavaScript.setBounds(399, 254, 159, 47);
		getContentPane().add(btnJavaScript);
		
		btnSql = new JButton(ACT_CMN_BTN_SQL);
		btnSql.setFont(new Font("Sylfaen", Font.BOLD, 18));
		btnSql.setBounds(213, 195, 159, 47);
		getContentPane().add(btnSql);
		
		lblEligeLen = new JLabel("Elige un lenguaje de programación para empezar a aprender");
		lblEligeLen.setFont(new Font("Sylfaen", Font.BOLD, 16));
		lblEligeLen.setBounds(65, 50, 454, 74);
		getContentPane().add(lblEligeLen);
		
		btnAtras = new JButton("Atrás");
		btnAtras.setVerticalAlignment(SwingConstants.TOP);
		btnAtras.setFont(new Font("Sylfaen", Font.BOLD, 18));
		btnAtras.setBounds(10, 12, 83, 26);
		getContentPane().add(btnAtras);
		
		
	}
	
	public void setListener(VentanaPrincipalInicioListener listener) {
		btnJava.addActionListener(listener);
		btnLinux.addActionListener(listener);
		btnJavaScript.addActionListener(listener);
		btnGit.addActionListener(listener);
		btnSql.addActionListener(listener);
		btnAtras.addActionListener(listener);

	}
	

	public JButton getBtnJava() {
		return btnJava;
	}


	public JButton getBtnGit() {
		return btnGit;
	}


	public JButton getBtnSql() {
		return btnSql;
	}


	public JButton getBtnLinux() {
		return btnLinux;
	}


	public JButton getBtnJavaScript() {
		return btnJavaScript;
	}
	
	public JButton getBtnAtras() {
		return btnAtras;
	}
}

