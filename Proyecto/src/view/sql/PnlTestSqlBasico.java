package view.sql;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PnlTestSqlBasico extends JPanel {

	private static final long serialVersionUID = 1L;
	private static final int ANCHO = 600;
	private static final int ALTO = 350;
	private JRadioButton rbtnA;
	private JLabel lblPregunta;
	private final ButtonGroup buttonGroupRespuestas = new ButtonGroup();
	private JRadioButton rbtnC;
	private JRadioButton rbtnD;
	private JRadioButton rbtnB;
	private JButton btnComprobar;

	public PnlTestSqlBasico() {
		setSize(ANCHO, ALTO);

		initComponentes();

	}

	private void initComponentes() {
		setBackground(new Color(51, 255, 102));
		setLayout(null);
		lblPregunta = new JLabel("Pregunta:");
		lblPregunta.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblPregunta.setBounds(77, 27, 414, 13);
		add(lblPregunta);

		rbtnA = new JRadioButton("A");
		buttonGroupRespuestas.add(rbtnA);
		rbtnA.setBounds(77, 136, 103, 21);
		add(rbtnA);

		rbtnC = new JRadioButton("C");
		buttonGroupRespuestas.add(rbtnC);
		rbtnC.setBounds(77, 202, 103, 21);
		add(rbtnC);

		rbtnB = new JRadioButton("B");
		buttonGroupRespuestas.add(rbtnB);
		rbtnB.setBounds(77, 169, 103, 21);
		add(rbtnB);

		rbtnD = new JRadioButton("D");
		buttonGroupRespuestas.add(rbtnD);
		rbtnD.setBounds(77, 230, 103, 21);
		add(rbtnD);

		btnComprobar = new JButton("Comprobar");
		btnComprobar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnComprobar.setBounds(147, 278, 164, 42);
		add(btnComprobar);
	}
	

}
