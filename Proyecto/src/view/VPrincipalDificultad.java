package view;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import control.VentanaPrincipalInicioListener;

import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.Color;

public class VPrincipalDificultad extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private static final int ANCHO = 600;
	private static final int ALTO = 350;
	
	public static final String ACT_CMN_BTN_BEGINNER = "Nivel Principante";
	public static final String ACT_CMN_BTN_INTERMEDIATE = "Nivel Intermedio";
	public static final String ACT_CMN_BTN_ADVANCE = "Nivel Avanzado";
	
	private JButton btnAdvance;
	private JLabel lblEligeDif;
	private JButton btnIntermediate;
	private JButton btnBeginner;
	
    public VPrincipalDificultad() {
    	getContentPane().setForeground(SystemColor.controlHighlight);
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
		
		btnBeginner = new JButton(ACT_CMN_BTN_BEGINNER);
		btnBeginner.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		btnBeginner.setBounds(207, 91, 170, 57);
		getContentPane().add(btnBeginner);
		
		btnIntermediate = new JButton(ACT_CMN_BTN_INTERMEDIATE);
		btnIntermediate.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		btnIntermediate.setBounds(207, 164, 170, 57);
		getContentPane().add(btnIntermediate);
		
		btnAdvance = new JButton(ACT_CMN_BTN_ADVANCE);
		btnAdvance.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		btnAdvance.setBounds(207, 237, 170, 57);
		getContentPane().add(btnAdvance);
		
		lblEligeDif = new JLabel("Elige una dificultad para empezar");
		lblEligeDif.setHorizontalAlignment(SwingConstants.CENTER);
		lblEligeDif.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lblEligeDif.setBounds(174, 16, 235, 59);
		getContentPane().add(lblEligeDif);
		
	}
	
	public void setListener(VentanaPrincipalInicioListener listener) {
		btnBeginner.addActionListener(listener);
		btnIntermediate.addActionListener(listener);
		btnAdvance.addActionListener(listener);
	
	}
	
	public JButton getBtnBeginner() {
		return btnBeginner;
	}
	
	public JButton getBtnIntermediate() {
		return btnIntermediate;
	}
	
	public JButton getBtnAvance() {
		return btnAdvance;
	}
	
}

