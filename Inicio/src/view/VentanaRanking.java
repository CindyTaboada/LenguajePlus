package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;

public class VentanaRanking extends JFrame{
	
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
	public VentanaRanking() {
		
	setTitle("Ranking");
	
	configurarFrame();
	
	configurarComponentes();
}

private void configurarComponentes() {
	getContentPane().setBackground(SystemColor.controlHighlight);
	getContentPane().setLayout(null);
	
	lblRanking = new JLabel("Ranking");
	lblRanking.setFont(new Font("Tahoma", Font.PLAIN, 20));
	lblRanking.setBounds(229, 10, 78, 51);
	getContentPane().add(lblRanking);
	
	lblTop1 = new JLabel("1º");
	lblTop1.setBounds(174, 53, 15, 13);
	getContentPane().add(lblTop1);
	
	lblTop2 = new JLabel("2º");
	lblTop2.setBounds(174, 64, 15, 13);
	getContentPane().add(lblTop2);
	
	lblTop3 = new JLabel("3º");
	lblTop3.setBounds(174, 76, 15, 13);
	getContentPane().add(lblTop3);
	
	lblTop4 = new JLabel("4º");
	lblTop4.setBounds(174, 87, 15, 13);
	getContentPane().add(lblTop4);
	
	lblTop5 = new JLabel("5º");
	lblTop5.setBounds(174, 99, 15, 13);
	getContentPane().add(lblTop5);
	
	lblTop6 = new JLabel("6º");
	lblTop6.setBounds(174, 110, 15, 13);
	getContentPane().add(lblTop6);
	
	lblTop7 = new JLabel("7º");
	lblTop7.setBounds(174, 122, 15, 13);
	getContentPane().add(lblTop7);
	
	lblTop8 = new JLabel("8º");
	lblTop8.setBounds(174, 133, 15, 13);
	getContentPane().add(lblTop8);
	
	lblTop9 = new JLabel("9º");
	lblTop9.setBounds(174, 146, 15, 13);
	getContentPane().add(lblTop9);
	
	lblTop10 = new JLabel("10º");
	lblTop10.setBounds(174, 156, 16, 20);
	getContentPane().add(lblTop10);
	
	lblTop1_1 = new JLabel("");
	lblTop1_1.setToolTipText("Nombre");
	lblTop1_1.setBounds(199, 53, 86, 13);
	getContentPane().add(lblTop1_1);
	
	lblTop2_1 = new JLabel("");
	lblTop2_1.setToolTipText("Nombre");
	lblTop2_1.setBounds(199, 64, 86, 13);
	getContentPane().add(lblTop2_1);
	
	lblTop3_1 = new JLabel("");
	lblTop3_1.setToolTipText("Nombre");
	lblTop3_1.setBounds(199, 76, 86, 13);
	getContentPane().add(lblTop3_1);
	
	lblTop4_1 = new JLabel("");
	lblTop4_1.setToolTipText("Nombre");
	lblTop4_1.setBounds(199, 87, 86, 13);
	getContentPane().add(lblTop4_1);
	
	lblTop5_1 = new JLabel("");
	lblTop5_1.setToolTipText("Nombre");
	lblTop5_1.setBounds(199, 99, 86, 13);
	getContentPane().add(lblTop5_1);
	
	lblTop6_1 = new JLabel("");
	lblTop6_1.setToolTipText("Nombre");
	lblTop6_1.setBounds(199, 110, 86, 13);
	getContentPane().add(lblTop6_1);
	
	lblTop7_1 = new JLabel("");
	lblTop7_1.setToolTipText("Nombre");
	lblTop7_1.setBounds(199, 122, 86, 13);
	getContentPane().add(lblTop7_1);
	
	lblTop8_1 = new JLabel("");
	lblTop8_1.setToolTipText("Nombre");
	lblTop8_1.setBounds(199, 133, 86, 13);
	getContentPane().add(lblTop8_1);
	
	lblTop9_1 = new JLabel("");
	lblTop9_1.setToolTipText("Nombre");
	lblTop9_1.setBounds(199, 146, 86, 13);
	getContentPane().add(lblTop9_1);
	
	lblTop10_1 = new JLabel("");
	lblTop10_1.setToolTipText("Nombre");
	lblTop10_1.setBounds(199, 156, 86, 20);
	getContentPane().add(lblTop10_1);
	
	lblTop1_1_1 = new JLabel("");
	lblTop1_1_1.setToolTipText("Estrellas");
	lblTop1_1_1.setBounds(298, 53, 53, 13);
	getContentPane().add(lblTop1_1_1);
	
	lblTop2_1_1 = new JLabel("");
	lblTop2_1_1.setToolTipText("Estrellas");
	lblTop2_1_1.setBounds(298, 64, 53, 13);
	getContentPane().add(lblTop2_1_1);
	
	lblTop3_1_1 = new JLabel("");
	lblTop3_1_1.setToolTipText("Estrellas");
	lblTop3_1_1.setBounds(298, 76, 53, 13);
	getContentPane().add(lblTop3_1_1);
	
	lblTop4_1_1 = new JLabel("");
	lblTop4_1_1.setToolTipText("Estrellas");
	lblTop4_1_1.setBounds(298, 87, 53, 13);
	getContentPane().add(lblTop4_1_1);
	
	lblTop5_1_1 = new JLabel("");
	lblTop5_1_1.setToolTipText("Estrellas");
	lblTop5_1_1.setBounds(298, 99, 53, 13);
	getContentPane().add(lblTop5_1_1);
	
	lblTop6_1_1 = new JLabel("");
	lblTop6_1_1.setToolTipText("Estrellas");
	lblTop6_1_1.setBounds(298, 110, 53, 13);
	getContentPane().add(lblTop6_1_1);
	
	lblTop7_1_1 = new JLabel("");
	lblTop7_1_1.setToolTipText("Estrellas");
	lblTop7_1_1.setBounds(298, 122, 53, 13);
	getContentPane().add(lblTop7_1_1);
	
	lblTop8_1_1 = new JLabel("");
	lblTop8_1_1.setToolTipText("Estrellas");
	lblTop8_1_1.setBounds(298, 133, 53, 13);
	getContentPane().add(lblTop8_1_1);
	
	lblTop9_1_1 = new JLabel("");
	lblTop9_1_1.setToolTipText("Estrellas");
	lblTop9_1_1.setBounds(298, 146, 53, 13);
	getContentPane().add(lblTop9_1_1);
	
	lblTop10_1_1 = new JLabel("");
	lblTop10_1_1.setToolTipText("Estrellas");
	lblTop10_1_1.setBounds(298, 156, 53, 20);
	getContentPane().add(lblTop10_1_1);
	
	btnSalirRanking = new JButton("Salir del Ranking");
	btnSalirRanking.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
		}
	});
	btnSalirRanking.setBounds(204, 218, 129, 21);
	getContentPane().add(btnSalirRanking);
}
private void configurarFrame() {
	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	setSize(ANCHO, ALTO);
	
}

public void hacerVisible() {
	setVisible(true);
}
}
	

