package view;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import control.VentanaListener;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VpFelicitaciones extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private static final int ANCHO = 600;
	private static final int ALTO = 350;
	
	private JButton btnIcon;
	private JButton btnVolver;
	public VpFelicitaciones() {
		
		
		configurarFrame();
		configurarComponentes();
	}
	private void configurarComponentes() {	
		getContentPane().setBackground(new Color(51, 255, 102));
		getContentPane().setLayout(null);

		JLabel lblFelicidades = new JLabel("¡FELICIDADES!");
		lblFelicidades.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFelicidades.setHorizontalAlignment(SwingConstants.CENTER);
		lblFelicidades.setBounds(195, 25, 195, 62);
		getContentPane().add(lblFelicidades);
		
		JLabel lblTexto = new JLabel("¡Nivel superado! Ganas una estrella");
		lblTexto.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
		lblTexto.setBounds(172, 112, 286, 42);
		getContentPane().add(lblTexto);
		
		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnVolver.setBounds(248, 255, 102, 42);
		getContentPane().add(btnVolver);
		
		btnIcon = new JButton("");
		btnIcon.setSelectedIcon(new ImageIcon(VpFelicitaciones.class.getResource("/view/Images/Star.png")));
		btnIcon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIcon.setIcon(new ImageIcon(VpInicio.class.getResource("/view/Images/Star.png")));
		btnIcon.setForeground(new Color(51, 255, 102));
		btnIcon.setBackground(new Color(51, 255, 102));
		btnIcon.setBounds(265, 179, 55, 51);
		getContentPane().add(btnIcon);
		
		JButton btnIcon_1 = new JButton("");
		btnIcon_1.setIcon(new ImageIcon(VpFelicitaciones.class.getResource("/view/Images/Star.png")));
		btnIcon_1.setForeground(new Color(51, 255, 102));
		btnIcon_1.setBackground(new Color(51, 255, 102));
		btnIcon_1.setBounds(195, 179, 55, 51);
		getContentPane().add(btnIcon_1);
		
		JButton btnIcon_2 = new JButton("");
		btnIcon_2.setIcon(new ImageIcon(VpFelicitaciones.class.getResource("/view/Images/Star.png")));
		btnIcon_2.setForeground(new Color(51, 255, 102));
		btnIcon_2.setBackground(new Color(51, 255, 102));
		btnIcon_2.setBounds(335, 179, 55, 51);
		getContentPane().add(btnIcon_2);
		setBackground(new Color(51, 255, 102));
	}
	

	private void configurarFrame() {
		setSize(ANCHO, ALTO);
		
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((pantalla.width - this.getSize().width) / 2, (pantalla.height - this.getSize().height) / 2);
		
	}
	public void setListener(VentanaListener l) {
		btnVolver.addActionListener(l);
		
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
	public JButton getBtnVolver() {
		return btnVolver;
	}
	
	
}
