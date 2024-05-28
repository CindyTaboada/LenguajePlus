package dam.view;

import java.awt.Font;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import dam.control.VListenerNiveles;
import java.awt.SystemColor;

public class VPrincipalDificultad extends JFrame {
	
	private static final int ANCHO = 500;
	private static final int ALTO = 400;
	public static final String ACT_CMN_BTN_BEGINNER = "Nivel Principante";
	public static final String ACT_CMN_BTN_INTERMEDIATE = "Nivel Intermedio";
	public static final String ACT_CMN_BTN_ADVANCE = "Nivel Avansado";
	private JButton btnAdvance;
	private JLabel lblEligeDif;
	private JButton btnIntermediate;
	private JButton btnBeginner;
	
    public VPrincipalDificultad() {
    	getContentPane().setForeground(SystemColor.controlHighlight);
    	getContentPane().setBackground(SystemColor.activeCaption);
		
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
		
		btnBeginner = new JButton(ACT_CMN_BTN_BEGINNER);
		btnBeginner.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		btnBeginner.setBounds(135, 96, 170, 57);
		getContentPane().add(btnBeginner);
		
		btnIntermediate = new JButton(ACT_CMN_BTN_INTERMEDIATE);
		btnIntermediate.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		btnIntermediate.setBounds(135, 182, 170, 57);
		getContentPane().add(btnIntermediate);
		
		btnAdvance = new JButton(ACT_CMN_BTN_ADVANCE);
		btnAdvance.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		btnAdvance.setBounds(135, 262, 170, 57);
		getContentPane().add(btnAdvance);
		
		lblEligeDif = new JLabel("Elige una dificultad para empezar");
		lblEligeDif.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lblEligeDif.setBounds(101, 27, 235, 59);
		getContentPane().add(lblEligeDif);
		
		
	}
	
	public void setListener(VListenerNiveles listener) {
		btnBeginner.addActionListener(listener);
		btnIntermediate.addActionListener(listener);
		btnAdvance.addActionListener(listener);
		
	
	
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
}

