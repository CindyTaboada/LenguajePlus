package view.Java;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import control.VentanaListener;

public class PnlTestJavaIntermedio extends JPanel {
	
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

	public PnlTestJavaIntermedio() {
		setSize(ANCHO, ALTO);

		initComponentes();

	}

	private void initComponentes() {
		setBackground(new Color(64, 224, 208));
		setLayout(null);
		lblPregutanas = new JLabel("<html>¿Cuál de las siguientes afirmaciones es verdadera acerca de los ArrayList en Java?</html>");
		lblPregutanas.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblPregutanas.setBounds(50, 10, 459, 42);
		add(lblPregutanas);

		rdbtnRepuesta1 = new JRadioButton("<html> Tienen un tamaño fijo y no se pueden redimensionar </html>");
		buttonGroupRespuestas.add(rdbtnRepuesta1);
		rdbtnRepuesta1.setBounds(42, 143, 138, 64);
		add(rdbtnRepuesta1);

		rdbtnRespuesta3 = new JRadioButton("<html>Almacenan elementos ordenados de un mismo tipo de dato</html>");
		buttonGroupRespuestas.add(rdbtnRespuesta3);
		rdbtnRespuesta3.setBounds(42, 244, 138, 64);
		add(rdbtnRespuesta3);

		rdbtnRespuesta2 = new JRadioButton("<html>No permiten elementos duplicados</html>");
		buttonGroupRespuestas.add(rdbtnRespuesta2);
		rdbtnRespuesta2.setBounds(410, 143, 138, 64);
		add(rdbtnRespuesta2);

		rdbtnRespuesta4 = new JRadioButton("<html>Se utilizan para almacenar pares clave-valor</html>");
		buttonGroupRespuestas.add(rdbtnRespuesta4);
		rdbtnRespuesta4.setBounds(410, 242, 138, 66);
		add(rdbtnRespuesta4);

		btnComprobar = new JButton("Comprobar");
		btnComprobar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnComprobar.setBounds(217, 281, 164, 42);
		add(btnComprobar);
	}

	public JButton getBtnComprobar() {
		return btnComprobar;
	}

	public void setListener(VentanaListener l) {
		btnComprobar.addActionListener(l);
		
	}

	public JRadioButton getRdbtnRepuesta1() {
		return rdbtnRepuesta1;
	}

	public JRadioButton getRdbtnRespuesta3() {
		return rdbtnRespuesta3;
	}

	public JRadioButton getRdbtnRespuesta4() {
		return rdbtnRespuesta4;
	}

	public JRadioButton getRdbtnRespuesta2() {
		return rdbtnRespuesta2;
	}

}