package view;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import control.VentanaListener;

import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.Color;

public class VpNiveles extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private static final int ANCHO = 600;
	private static final int ALTO = 350;
	
	public static final String ACT_CMN_BTN_BEGINNER = "Nivel Principante";
	public static final String ACT_CMN_BTN_INTERMEDIATE = "Nivel Intermedio";
	public static final String ACT_CMN_BTN_ADVANCE = "Nivel Avanzado";
	public static final String ACT_CMN_BTN_VOLVER = "Volver";
	
	private JButton btnAdvance;
	private JLabel lblEligeDif;
	private JButton btnIntermediate;
	private JButton btnBeginner;
	private JButton btnAtras;
	
    public VpNiveles() {

		
		setTitle("LenguajePlus");
		
		configurarComponetes();
		
		configurarFrame();
		
		
	}
	

    private void configurarFrame() {
    	getContentPane().setForeground(SystemColor.controlHighlight);
    	getContentPane().setBackground(new Color(51, 255, 102));
		
		setSize(ANCHO, ALTO);
		
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((pantalla.width - this.getSize().width) / 2, (pantalla.height - this.getSize().height) / 2);
		
	}


	private void configurarComponetes() {
		getContentPane().setLayout(null);
		
		btnBeginner = new JButton("Principante");
		btnBeginner.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		btnBeginner.setBounds(208, 89, 170, 59);
		getContentPane().add(btnBeginner);
		
		btnIntermediate = new JButton("Intermedio");
		btnIntermediate.setBackground(new Color(255, 255, 240));
		btnIntermediate.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		btnIntermediate.setBounds(208, 162, 170, 59);
		getContentPane().add(btnIntermediate);
		
		btnAdvance = new JButton("Avanzado");
		btnAdvance.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		btnAdvance.setBounds(208, 235, 170, 59);
		getContentPane().add(btnAdvance);
		
		lblEligeDif = new JLabel("¡No marques tus límites, elígelos!");
		lblEligeDif.setBackground(new Color(255, 255, 240));
		lblEligeDif.setHorizontalAlignment(SwingConstants.CENTER);
		lblEligeDif.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lblEligeDif.setBounds(57, 18, 427, 59);
		getContentPane().add(lblEligeDif);
		
		btnAtras = new JButton(ACT_CMN_BTN_VOLVER);
		btnAtras.setBackground(new Color(237, 243, 217));
		btnAtras.setVerticalAlignment(SwingConstants.TOP);
		btnAtras.setFont(new Font("Dialog", Font.BOLD, 14));
		btnAtras.setBounds(495, 290, 99, 26);
		getContentPane().add(btnAtras);
		
	}
	
	public void setListener(VentanaListener listener) {
		btnBeginner.addActionListener(listener);
		btnIntermediate.addActionListener(listener);
		btnAdvance.addActionListener(listener);
		btnAtras.addActionListener(listener);
	
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
	
	public JButton getBtnAtras() {
		return btnAtras;
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
}

