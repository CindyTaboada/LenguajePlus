package view.git;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class PreguntasGit extends JFrame {
	
	private static final int ANCHO = 600;
	private static final int ALTO = 350;
	private JLabel lblPreguntas;
	private JRadioButton rdbtnResupesta1;
	private JRadioButton rdbtnResupesta2;
	private JRadioButton rdbtnResupesta3;
	private JRadioButton rdbtnResupesta4;
	private final ButtonGroup buttonGroupRespuestas = new ButtonGroup();
	private JButton btnComprobar;
	
	public PreguntasGit() {
		getContentPane().setBackground(new Color(0, 255, 127));
		
		setTitle("LenjuagePlus");
		
		configurarFrame();
		
		initComponents();
	}

	private void initComponents() {
		getContentPane().setLayout(null);
		
		lblPreguntas = new JLabel("Primera Pregunta");
		lblPreguntas.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblPreguntas.setBounds(117, 37, 339, 35);
		getContentPane().add(lblPreguntas);
		
		rdbtnResupesta1 = new JRadioButton("a)");
		buttonGroupRespuestas.add(rdbtnResupesta1);
		rdbtnResupesta1.setBackground(new Color(255, 255, 255));
		rdbtnResupesta1.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnResupesta1.setBounds(59, 129, 85, 29);
		getContentPane().add(rdbtnResupesta1);
		
		rdbtnResupesta2 = new JRadioButton("c)");
		buttonGroupRespuestas.add(rdbtnResupesta2);
		rdbtnResupesta2.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnResupesta2.setBackground(Color.WHITE);
		rdbtnResupesta2.setBounds(59, 214, 85, 29);
		getContentPane().add(rdbtnResupesta2);
		
		rdbtnResupesta3 = new JRadioButton("b)");
		buttonGroupRespuestas.add(rdbtnResupesta3);
		rdbtnResupesta3.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnResupesta3.setBackground(Color.WHITE);
		rdbtnResupesta3.setBounds(371, 129, 85, 29);
		getContentPane().add(rdbtnResupesta3);
		
		rdbtnResupesta4 = new JRadioButton("d)");
		buttonGroupRespuestas.add(rdbtnResupesta4);
		rdbtnResupesta4.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnResupesta4.setBackground(Color.WHITE);
		rdbtnResupesta4.setBounds(371, 214, 85, 29);
		getContentPane().add(rdbtnResupesta4);
		
		btnComprobar = new JButton("Comprobar");
		btnComprobar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnComprobar.setBounds(181, 256, 156, 29);
		getContentPane().add(btnComprobar);
	}
	
	private void configurarFrame() {
		setSize(ANCHO, ALTO);
		
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((pantalla.width - this.getSize().width) / 2, (pantalla.height - this.getSize().height) / 2);
		
	}
	
	
}
