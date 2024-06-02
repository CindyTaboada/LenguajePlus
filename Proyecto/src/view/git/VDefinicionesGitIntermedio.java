package view.git;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JLabel;

import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import control.VentanaListener;

public class VDefinicionesGitIntermedio extends JFrame {

	public static final String ACT_CMN_BTN_PULSAR = "Pulsa Aqui";
	private static final int ANCHO = 800;
	private static final int ALTO = 500;
	private static final Icon ACT_CMN_BTN_VOLVER = null;
	private JButton btnPrueba;

	private JScrollPane scrollPane;

	private JButton btnAtras;


	public VDefinicionesGitIntermedio() {

		setTitle("Git Intermedio");

		configurarFrame();

		initComponentes();

		getContentPane().setBackground(new Color(51, 255, 102));

	}

	private void initComponentes() {
		getContentPane().setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setBounds(68, 10, 639, 343);
		getContentPane().add(scrollPane);

		JTextPane txtpnGitBasico = new JTextPane();
		txtpnGitBasico.setEditable(false);
		txtpnGitBasico.setContentType("text/html");
		txtpnGitBasico.setText(
				"<html>\r\n<body style=\"font-family: Arial, sans-serif; background-color: #f4f4f4; padding: 20px;\">\r\n  <div style=\"background-color: #ffffff; padding: 20px; border-radius: 8px; box-shadow: 0 0 10px rgba(0,0,0,0.1);\">\r\n\r\n    <h1 style=\"color: #333333; border-bottom: 2px solid #007acc; padding-bottom: 10px; text-align: center;\">Git Intermedio</h1>\r\n\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      Para resolver un conflicto de merge en Git, debes editar manualmente las secciones conflictivas del código. \r\n      Después de hacer los cambios necesarios, puedes continuar con el proceso de merge.\r\n    </p>\r\n\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      Un <strong>stash</strong> en Git es un almacenamiento temporal para cambios no confirmados. Esto te permite guardar \r\n      cambios que no están listos para ser confirmados y limpiar tu espacio de trabajo para cambiar a otra tarea.\r\n    </p>\r\n\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      El comando <code>git remote</code> administra repositorios remotos asociados con tu proyecto local. Esto incluye \r\n      agregar, eliminar y listar repositorios remotos.\r\n    </p>\r\n\r\n    <p style=\"text-align: center;\">\r\n      <a href=\"https://git-scm.com/doc\" style=\"color: #007acc; text-decoration: none; font-weight: bold;\">Más información sobre Git</a>\r\n    </p>\r\n\r\n  </div>\r\n</body>\r\n</html>\r\n");
		scrollPane.setColumnHeaderView(txtpnGitBasico);

		btnPrueba = new JButton(ACT_CMN_BTN_PULSAR);
		btnPrueba.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnPrueba.setBounds(289, 404, 162, 39);
		getContentPane().add(btnPrueba);
		
		JLabel lblNewLabel = new JLabel("¿Listo para una prueba?");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblNewLabel.setBounds(289, 365, 187, 29);
		getContentPane().add(lblNewLabel);
		
		btnAtras = new JButton(ACT_CMN_BTN_VOLVER);
		btnAtras.setText("Volver");
		btnAtras.setHorizontalAlignment(SwingConstants.LEFT);
		btnAtras.setFont(new Font("Dialog", Font.BOLD, 14));
		btnAtras.setBounds(621, 404, 90, 39);
		getContentPane().add(btnAtras);
	}

	private void configurarFrame() {
		setSize(ANCHO, ALTO);

		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((pantalla.width - this.getSize().width) / 2, (pantalla.height - this.getSize().height) / 2);

	}
	
	public JButton getBtnPrueba() {
		return btnPrueba;
	}

	public void pruebaListener(VentanaListener l) {
		btnPrueba.addActionListener(l);
	}

	public void PruebaActionListener(VentanaListener Listener) {
		btnPrueba.addActionListener(Listener);
	}
	
	public void cargarPanel(JPanel panel) {
		scrollPane.setViewportView(panel);
		
	}
}
