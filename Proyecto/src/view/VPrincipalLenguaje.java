/**
 * 
 */
package view;

import javax.swing.JFrame;

import dam.control.VListenerNiveles;

import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;


public class VPrincipalLenguaje extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private static final int ANCHO = 500;
	private static final int ALTO = 400;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ventana de cierre para window o mac
		setLocationRelativeTo(null); // localización de la ventan
		setSize(ANCHO, ALTO);// tamaño a la ventana
		setResizable(true);
	}


	private void configurarComponetes() {
		getContentPane().setLayout(null);
		
		btnJava = new JButton(ACT_CMN_BTN_JAVA);
		btnJava.setFont(new Font("Sylfaen", Font.BOLD, 18));
		btnJava.setBounds(42, 119, 144, 47);
		getContentPane().add(btnJava);
		
		btnHtml = new JButton(ACT_CMN_BTN_LINUX);
		btnHtml.setFont(new Font("Sylfaen", Font.BOLD, 18));
		btnHtml.setBounds(302, 119, 144, 47);
		getContentPane().add(btnHtml);
		
		btnGithub = new JButton(ACT_CMN_BTN_GITHUB);
		btnGithub.setFont(new Font("Sylfaen", Font.BOLD, 18));
		btnGithub.setBounds(42, 270, 144, 47);
		getContentPane().add(btnGithub);
		
		btnJavaScript = new JButton( ACT_CMN_BTN_HMTL);
		btnJavaScript.setFont(new Font("Sylfaen", Font.BOLD, 13));
		btnJavaScript.setBounds(302, 271, 144, 47);
		getContentPane().add(btnJavaScript);
		
		btnSql = new JButton(ACT_CMN_BTN_SQL);
		btnSql.setFont(new Font("Sylfaen", Font.BOLD, 18));
		btnSql.setBounds(170, 197, 144, 47);
		getContentPane().add(btnSql);
		
		lblEligeLen = new JLabel("Elige un lenguaje de programación para empezar a aprender");
		lblEligeLen.setFont(new Font("Sylfaen", Font.BOLD, 16));
		lblEligeLen.setBounds(22, 23, 454, 74);
		getContentPane().add(lblEligeLen);
		
		
	}
	
	public void setListener(VListenerNiveles listener) {
		btnJava.addActionListener(null);
		btnHtml.addActionListener(null);
		btnJavaScript.addActionListener(null);
		btnGithub.addActionListener(null);
		btnSql.addActionListener(null);

	
	
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
}

