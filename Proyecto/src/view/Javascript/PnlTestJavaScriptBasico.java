package view.Javascript;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import control.VentanaListener;


public class PnlTestJavaScriptBasico extends JPanel {

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

	public PnlTestJavaScriptBasico() {
		setSize(ANCHO, ALTO);

		initComponentes();

	}

	private void initComponentes() {
		setBackground(new Color(51, 255, 102));
		setLayout(null);
		lblPregutanas = new JLabel("<html>¿Cuál es la forma correcta de declarar una variable en JavaScript?</html>");
		lblPregutanas.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblPregutanas.setBounds(77, 27, 414, 42);
		add(lblPregutanas);

		rdbtnRepuesta1 = new JRadioButton("<html>variable nombreVariable; </html>");
		buttonGroupRespuestas.add(rdbtnRepuesta1);
		rdbtnRepuesta1.setBounds(77, 136, 103, 35);
		add(rdbtnRepuesta1);

		rdbtnRespuesta3 = new JRadioButton("<html>variable = nombreVariable;</html>");
		buttonGroupRespuestas.add(rdbtnRespuesta3);
		rdbtnRespuesta3.setBounds(77, 239, 103, 31);
		add(rdbtnRespuesta3);

		rdbtnRespuesta2 = new JRadioButton("<html>v nombreVariable;</html>");
		buttonGroupRespuestas.add(rdbtnRespuesta2);
		rdbtnRespuesta2.setBounds(406, 136, 103, 35);
		add(rdbtnRespuesta2);

		rdbtnRespuesta4 = new JRadioButton("<html>var nombreVariable;</html>");
		buttonGroupRespuestas.add(rdbtnRespuesta4);
		rdbtnRespuesta4.setBounds(406, 239, 103, 31);
		add(rdbtnRespuesta4);

		btnComprobar = new JButton("Comprobar");
		btnComprobar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnComprobar.setBounds(208, 281, 164, 42);
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