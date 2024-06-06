package view.sql;

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

import control.VentanaListener;

public class PnlTestSqlAvanzado extends JPanel {

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

	public PnlTestSqlAvanzado() {
		setBackground(new Color(64, 224, 208));
		setSize(ANCHO, ALTO);
		setLayout(null);
		
		initComponentes();


	}

	private void initComponentes() {
		lblPregutanas = new JLabel("<html>¿Cómo declarar variables dentro de una función SQL/PL?</html>");
		lblPregutanas.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblPregutanas.setBounds(77, 27, 414, 42);
		add(lblPregutanas);
		
		rdbtnRepuesta1 = new JRadioButton("<html> v_nombre := ‘Fulano’</html>");
		buttonGroupRespuestas.add(rdbtnRepuesta1);
		rdbtnRepuesta1.setBounds(35, 136, 173, 42);
		add(rdbtnRepuesta1);
		
		rdbtnRespuesta3 = new JRadioButton("<html> v_nombre nomTabla.NOMBRE%TYPE;</html>");
		buttonGroupRespuestas.add(rdbtnRespuesta3);
		rdbtnRespuesta3.setBounds(35, 228, 173, 42);
		add(rdbtnRespuesta3);
		
		rdbtnRespuesta2 = new JRadioButton("v_nombre;");
		buttonGroupRespuestas.add(rdbtnRespuesta2);
		rdbtnRespuesta2.setBounds(406, 136, 148, 42);
		add(rdbtnRespuesta2);
		
		rdbtnRespuesta4 = new JRadioButton("V_nombre");
		buttonGroupRespuestas.add(rdbtnRespuesta4);
		rdbtnRespuesta4.setBounds(406, 228, 148, 42);
		add(rdbtnRespuesta4);
		
		btnComprobar = new JButton("Comprobar");
		btnComprobar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnComprobar.setBounds(220, 281, 164, 42);
		add(btnComprobar);
	}

	public void setListener(VentanaListener l) {
		btnComprobar.addActionListener(l);
		
	}

	public JButton getBtnComprobar() {
		return btnComprobar;
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