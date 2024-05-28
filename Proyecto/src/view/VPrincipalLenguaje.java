package view;

import javax.swing.JFrame;

import control.VentanaPrincipalInicioListener;

import javax.swing.JButton;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JLabel;


public class VPrincipalLenguaje extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private static final int ANCHO = 600;
	private static final int ALTO = 350;

	public static final String ACT_CMN_BTN_JAVA = "JAVA";
	public static final String ACT_CMN_BTN_GITHUB = "GITHUB";
	public static final String ACT_CMN_BTN_SQL = "SQL";
	public static final String ACT_CMN_BTN_LINUX = "LINUX";
	public static final String ACT_CMN_BTN_HMTL = "HTML";
	
	private JButton btnJava;
	private JButton btnGithub;
	private JButton btnSql;
	private JButton btnHtml;
	private JButton btnJavaScript;
	private JLabel lblEligeLen;

	public VPrincipalLenguaje() {
		
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
		
		btnHtml = new JButton(ACT_CMN_BTN_LINUX);
		btnHtml.setFont(new Font("Sylfaen", Font.BOLD, 18));
		btnHtml.setBounds(402, 112, 144, 47);
		getContentPane().add(btnHtml);
		
		btnGithub = new JButton(ACT_CMN_BTN_GITHUB);
		btnGithub.setFont(new Font("Sylfaen", Font.BOLD, 18));
		btnGithub.setBounds(38, 244, 144, 47);
		getContentPane().add(btnGithub);
		
		btnJavaScript = new JButton( ACT_CMN_BTN_HMTL);
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
		btnHtml.addActionListener(listener);
		btnJavaScript.addActionListener(listener);
		btnGithub.addActionListener(listener);
		btnSql.addActionListener(listener);

	}
	

	public JButton getBtnJava() {
		return btnJava;
	}


	public JButton getBtnGithub() {
		return btnGithub;
	}


	public JButton getBtnSql() {
		return btnSql;
	}


	public JButton getBtnHtml() {
		return btnHtml;
	}


	public JButton getBtnJavaScript() {
		return btnJavaScript;
	}
	
}

