package view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import control.VentanaPrincipalInicioListener;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VentanaRanking extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final int ANCHO = 600;
	private static final int ALTO = 350;

	private JLabel lblRanking;
	private JButton btnSalirRanking;
	private JScrollPane scrpContenedor;
	private JTable tblRanking;
	private JButton btnConsultar;
	private JComboBox <String>comboBRanking;

	public VentanaRanking() {
		getContentPane().setBackground(new Color(51, 255, 102));
		
		crearComponentes();
		
		configurarFrame();

		configurarComponentes();
	}

	private void configurarComponentes() {
		setBackground(SystemColor.controlHighlight);
		getContentPane().setLayout(null);

		lblRanking = new JLabel("RANKING");
		lblRanking.setHorizontalAlignment(SwingConstants.CENTER);
		lblRanking.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRanking.setBounds(214, 24, 116, 51);
		getContentPane().add(lblRanking);

		btnSalirRanking = new JButton("Salir del Ranking");
		btnSalirRanking.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSalirRanking.setBounds(228, 279, 143, 21);
		getContentPane().add(btnSalirRanking);
		
		JScrollPane scrpRanking = new JScrollPane();
		scrpRanking.setBounds(65, 85, 455, 181);
		getContentPane().add(scrpRanking);
		
		tblRanking = new JTable();
		scrpRanking.setViewportView(tblRanking);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnConsultar.setBounds(65, 16, 99, 28);
		getContentPane().add(btnConsultar);
		
		comboBRanking = new JComboBox();
		comboBRanking.setModel(new DefaultComboBoxModel<String>(new String[] {"TODAS", "TOP 10 N1", ""}));
		comboBRanking.setBounds(75, 54, 59, 21);
		getContentPane().add(comboBRanking);
	}
	
	private void crearComponentes() {
		scrpContenedor = new JScrollPane();
		getContentPane().add(scrpContenedor, BorderLayout.CENTER);
	}

	private void configurarFrame() {
		setSize(ANCHO, ALTO);
		
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((pantalla.width - this.getSize().width) / 2, (pantalla.height - this.getSize().height) / 2);
	}

	public void setListener(VentanaPrincipalInicioListener l) {
		btnSalirRanking.addActionListener(l);
	}
	
	public JButton getBtnSalirRanking() {
		return btnSalirRanking;
	}
}

