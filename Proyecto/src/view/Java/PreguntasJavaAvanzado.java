package view.Java;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PreguntasJavaAvanzado extends JPanel {

	private static final long serialVersionUID = 1L;
	private static final int ANCHO = 600;
	private static final int ALTO = 350;
	private JRadioButton rdbtnRepuesta1;
	private JLabel lblPregutanas;
	private final ButtonGroup buttonGroupRespuestas = new ButtonGroup();
	private JRadioButton rdbtnRespuesta3;
	private JRadioButton rdbtnRespuesta4;
	private JRadioButton rdbtnRespuesta2;
	private JButton btnComprobar;
	private JLabel lblPreguntasActual;

	public PreguntasJavaAvanzado() {
		setBackground(new Color(51, 255, 102));
		setSize(ANCHO, ALTO);
		setLayout(null);
		
		initComponentes();


	}

	private void initComponentes() {
		lblPregutanas = new JLabel("PREGUNTA:");
		lblPregutanas.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblPregutanas.setBounds(18, 10, 131, 13);
		add(lblPregutanas);
		
		rdbtnRepuesta1 = new JRadioButton("New radio button");
		buttonGroupRespuestas.add(rdbtnRepuesta1);
		rdbtnRepuesta1.setBounds(18, 133, 557, 21);
		add(rdbtnRepuesta1);
		
		rdbtnRespuesta3 = new JRadioButton("New radio button");
		buttonGroupRespuestas.add(rdbtnRespuesta3);
		rdbtnRespuesta3.setBounds(18, 237, 557, 21);
		add(rdbtnRespuesta3);
		
		rdbtnRespuesta2 = new JRadioButton("New radio button");
		buttonGroupRespuestas.add(rdbtnRespuesta2);
		rdbtnRespuesta2.setBounds(18, 165, 557, 21);
		add(rdbtnRespuesta2);
		
		rdbtnRespuesta4 = new JRadioButton("New radio button");
		buttonGroupRespuestas.add(rdbtnRespuesta4);
		rdbtnRespuesta4.setBounds(18, 198, 557, 21);
		add(rdbtnRespuesta4);
		
		btnComprobar = new JButton("Comprobar");
		btnComprobar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnComprobar.setBounds(208, 281, 164, 42);
		add(btnComprobar);
		
		lblPreguntasActual = new JLabel("Pregunta");
		lblPreguntasActual.setBounds(18, 33, 572, 77);
		add(lblPreguntasActual);
	}
}