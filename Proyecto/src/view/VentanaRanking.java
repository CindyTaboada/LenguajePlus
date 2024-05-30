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

public class VentanaRanking extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final int ANCHO = 600;
	private static final int ALTO = 350;

	private JLabel lblRanking;
	private JLabel lblTop1;
	private JLabel lblTop2;
	private JLabel lblTop3;
	private JLabel lblTop4;
	private JLabel lblTop5;
	private JLabel lblTop6;
	private JLabel lblTop7;
	private JLabel lblTop8;
	private JLabel lblTop9;
	private JLabel lblTop10;
	private JLabel lblTop1_1;
	private JLabel lblTop2_1;
	private JLabel lblTop3_1;
	private JLabel lblTop4_1;
	private JLabel lblTop5_1;
	private JLabel lblTop6_1;
	private JLabel lblTop7_1;
	private JLabel lblTop8_1;
	private JLabel lblTop9_1;
	private JLabel lblTop10_1;
	private JLabel lblTop1_1_1;
	private JLabel lblTop2_1_1;
	private JLabel lblTop3_1_1;
	private JLabel lblTop4_1_1;
	private JLabel lblTop5_1_1;
	private JLabel lblTop6_1_1;
	private JLabel lblTop7_1_1;
	private JLabel lblTop8_1_1;
	private JLabel lblTop9_1_1;
	private JLabel lblTop10_1_1;
	private JButton btnSalirRanking;
	private JScrollPane scrpContenedor;

	public VentanaRanking() {
		getContentPane().setBackground(new Color(51, 255, 102));
		
		crearComponentes();
		
		configurarFrame();

		configurarComponentes();
	}

	private void configurarComponentes() {
		setBackground(SystemColor.controlHighlight);
		getContentPane().setLayout(null);

		lblRanking = new JLabel("Ranking");
		lblRanking.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRanking.setBounds(261, 10, 78, 51);
		getContentPane().add(lblRanking);

		lblTop1 = new JLabel("1º");
		lblTop1.setBounds(209, 105, 15, 13);
		getContentPane().add(lblTop1);

		lblTop2 = new JLabel("2º");
		lblTop2.setBounds(209, 116, 15, 13);
		getContentPane().add(lblTop2);

		lblTop3 = new JLabel("3º");
		lblTop3.setBounds(209, 128, 15, 13);
		getContentPane().add(lblTop3);

		lblTop4 = new JLabel("4º");
		lblTop4.setBounds(209, 139, 15, 13);
		getContentPane().add(lblTop4);

		lblTop5 = new JLabel("5º");
		lblTop5.setBounds(209, 151, 15, 13);
		getContentPane().add(lblTop5);

		lblTop6 = new JLabel("6º");
		lblTop6.setBounds(209, 162, 15, 13);
		getContentPane().add(lblTop6);

		lblTop7 = new JLabel("7º");
		lblTop7.setBounds(209, 174, 15, 13);
		getContentPane().add(lblTop7);

		lblTop8 = new JLabel("8º");
		lblTop8.setBounds(209, 185, 15, 13);
		getContentPane().add(lblTop8);

		lblTop9 = new JLabel("9º");
		lblTop9.setBounds(209, 198, 15, 13);
		getContentPane().add(lblTop9);

		lblTop10 = new JLabel("10º");
		lblTop10.setBounds(209, 208, 16, 20);
		getContentPane().add(lblTop10);

		lblTop1_1 = new JLabel("");
		lblTop1_1.setToolTipText("Nombre");
		lblTop1_1.setBounds(234, 105, 86, 13);
		getContentPane().add(lblTop1_1);

		lblTop2_1 = new JLabel("");
		lblTop2_1.setToolTipText("Nombre");
		lblTop2_1.setBounds(234, 116, 86, 13);
		getContentPane().add(lblTop2_1);

		lblTop3_1 = new JLabel("");
		lblTop3_1.setToolTipText("Nombre");
		lblTop3_1.setBounds(234, 128, 86, 13);
		getContentPane().add(lblTop3_1);

		lblTop4_1 = new JLabel("");
		lblTop4_1.setToolTipText("Nombre");
		lblTop4_1.setBounds(234, 139, 86, 13);
		getContentPane().add(lblTop4_1);

		lblTop5_1 = new JLabel("");
		lblTop5_1.setToolTipText("Nombre");
		lblTop5_1.setBounds(234, 151, 86, 13);
		getContentPane().add(lblTop5_1);

		lblTop6_1 = new JLabel("");
		lblTop6_1.setToolTipText("Nombre");
		lblTop6_1.setBounds(234, 162, 86, 13);
		getContentPane().add(lblTop6_1);

		lblTop7_1 = new JLabel("");
		lblTop7_1.setToolTipText("Nombre");
		lblTop7_1.setBounds(234, 174, 86, 13);
		getContentPane().add(lblTop7_1);

		lblTop8_1 = new JLabel("");
		lblTop8_1.setToolTipText("Nombre");
		lblTop8_1.setBounds(234, 185, 86, 13);
		getContentPane().add(lblTop8_1);

		lblTop9_1 = new JLabel("");
		lblTop9_1.setToolTipText("Nombre");
		lblTop9_1.setBounds(234, 198, 86, 13);
		getContentPane().add(lblTop9_1);

		lblTop10_1 = new JLabel("");
		lblTop10_1.setToolTipText("Nombre");
		lblTop10_1.setBounds(234, 212, 86, 13);
		getContentPane().add(lblTop10_1);

		lblTop1_1_1 = new JLabel("");
		lblTop1_1_1.setToolTipText("Estrellas");
		lblTop1_1_1.setBounds(333, 105, 53, 13);
		getContentPane().add(lblTop1_1_1);

		lblTop2_1_1 = new JLabel("");
		lblTop2_1_1.setToolTipText("Estrellas");
		lblTop2_1_1.setBounds(333, 116, 53, 13);
		getContentPane().add(lblTop2_1_1);

		lblTop3_1_1 = new JLabel("");
		lblTop3_1_1.setToolTipText("Estrellas");
		lblTop3_1_1.setBounds(333, 128, 53, 13);
		getContentPane().add(lblTop3_1_1);

		lblTop4_1_1 = new JLabel("");
		lblTop4_1_1.setToolTipText("Estrellas");
		lblTop4_1_1.setBounds(333, 139, 53, 13);
		getContentPane().add(lblTop4_1_1);

		lblTop5_1_1 = new JLabel("");
		lblTop5_1_1.setToolTipText("Estrellas");
		lblTop5_1_1.setBounds(333, 151, 53, 13);
		getContentPane().add(lblTop5_1_1);

		lblTop6_1_1 = new JLabel("");
		lblTop6_1_1.setToolTipText("Estrellas");
		lblTop6_1_1.setBounds(333, 162, 53, 13);
		getContentPane().add(lblTop6_1_1);

		lblTop7_1_1 = new JLabel("");
		lblTop7_1_1.setToolTipText("Estrellas");
		lblTop7_1_1.setBounds(333, 174, 53, 13);
		getContentPane().add(lblTop7_1_1);

		lblTop8_1_1 = new JLabel("");
		lblTop8_1_1.setToolTipText("Estrellas");
		lblTop8_1_1.setBounds(333, 185, 53, 13);
		getContentPane().add(lblTop8_1_1);

		lblTop9_1_1 = new JLabel("");
		lblTop9_1_1.setToolTipText("Estrellas");
		lblTop9_1_1.setBounds(333, 198, 53, 13);
		getContentPane().add(lblTop9_1_1);

		lblTop10_1_1 = new JLabel("");
		lblTop10_1_1.setToolTipText("Estrellas");
		lblTop10_1_1.setBounds(333, 212, 53, 13);
		getContentPane().add(lblTop10_1_1);

		btnSalirRanking = new JButton("Salir del Ranking");
		btnSalirRanking.setBounds(235, 279, 129, 21);
		getContentPane().add(btnSalirRanking);
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

