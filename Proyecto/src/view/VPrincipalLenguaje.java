package view;

import javax.swing.JFrame;

import control.VentanaPrincipalInicioListener;

import javax.swing.JButton;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JLabel;
import java.awt.Color;


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
		btnJava.setBounds(38, 112, 144, 47);
		getContentPane().add(btnJava);
		
		btnLinux = new JButton(ACT_CMN_BTN_LINUX);
		btnLinux.setFont(new Font("Sylfaen", Font.BOLD, 18));
		btnLinux.setBounds(402, 112, 144, 47);
		getContentPane().add(btnLinux);
		
		btnGit = new JButton(ACT_CMN_BTN_GIT);
		btnGit.setFont(new Font("Sylfaen", Font.BOLD, 18));
		btnGit.setBounds(38, 244, 144, 47);
		getContentPane().add(btnGit);
		
		btnJavaScript = new JButton( ACT_CMN_BTN_JAVASCRIPT);
		btnJavaScript.setFont(new Font("Sylfaen", Font.BOLD, 18));
		btnJavaScript.setBounds(402, 244, 144, 47);
		getContentPane().add(btnJavaScript);
		
		btnSql = new JButton(ACT_CMN_BTN_SQL);
		btnSql.setFont(new Font("Sylfaen", Font.BOLD, 18));
		btnSql.setBounds(220, 178, 144, 47);
		getContentPane().add(btnSql);
		
		lblEligeLen = new JLabel("Elige un lenguaje de programación para empezar a aprender");
		lblEligeLen.setFont(new Font("Sylfaen", Font.BOLD, 16));
		lblEligeLen.setBounds(65, 19, 454, 74);
		getContentPane().add(lblEligeLen);
		
		
	}
	
	public void setListener(VentanaPrincipalInicioListener listener) {
		btnJava.addActionListener(listener);
		btnLinux.addActionListener(listener);
		btnJavaScript.addActionListener(listener);
		btnGit.addActionListener(listener);
		btnSql.addActionListener(listener);

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
	
}

