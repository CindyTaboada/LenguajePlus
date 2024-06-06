package view.sql;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import control.VentanaListener;

public class PnlTestSqlBasico extends JPanel {

	private static final long serialVersionUID = 1L;
	private static final int ANCHO = 600;
	private static final int ALTO = 350;
	private JRadioButton rbtnA;
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
		
		setBackground(new Color(64, 224, 208));
		setLayout(null);
		
		JLabel lblPregunta = new JLabel("<html>¿Cuál es la cláusula utilizada para filtrar los resultados de una consulta SQL? </html>");
		lblPregunta.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblPregunta.setBounds(54, 27, 480, 42);
		add(lblPregunta);

		rbtnA = new JRadioButton("ORDER BY");
		buttonGroupRespuestas.add(rbtnA);
		rbtnA.setBounds(77, 136, 103, 42);
		add(rbtnA);
		
		rbtnB = new JRadioButton("GROUP BY");
		buttonGroupRespuestas.add(rbtnB);
		rbtnB.setBounds(400, 136, 103, 42);
		add(rbtnB);

		rbtnC = new JRadioButton("<html>WHERE</html");
		buttonGroupRespuestas.add(rbtnC);
		rbtnC.setBounds(77, 197, 103, 42);
		add(rbtnC);

		rbtnD = new JRadioButton("<html>HAVING</html>");
		buttonGroupRespuestas.add(rbtnD);
		rbtnD.setBounds(400, 197, 103, 42);
		add(rbtnD);

		btnComprobar = new JButton("Comprobar");
		btnComprobar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnComprobar.setBounds(218, 278, 164, 42);
		add(btnComprobar);
	}

	public JRadioButton getRbtnA() {
		return rbtnA;
	}

	public JRadioButton getRbtnC() {
		return rbtnC;
	}

	public JRadioButton getRbtnD() {
		return rbtnD;
	}

	public JRadioButton getRbtnB() {
		return rbtnB;
	}

	public JButton getBtnComprobar() {
		return btnComprobar;
	}
	
	public void setListener(VentanaListener l) {
		rbtnA.addActionListener(l);
		rbtnB.addActionListener(l);
		rbtnC.addActionListener(l);
		rbtnD.addActionListener(l);
		btnComprobar.addActionListener(l);
	

	}

	public void setRbtnA(JRadioButton rbtnA) {
		this.rbtnA = rbtnA;
	}

	public void setRbtnC(JRadioButton rbtnC) {
		this.rbtnC = rbtnC;
	}

	public void setRbtnD(JRadioButton rbtnD) {
		this.rbtnD = rbtnD;
	}

	public void setRbtnB(JRadioButton rbtnB) {
		this.rbtnB = rbtnB;
	}



	
	
	
	

}
