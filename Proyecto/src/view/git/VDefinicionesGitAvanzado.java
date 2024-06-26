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

public class VDefinicionesGitAvanzado extends JFrame {

	public static final String ACT_CMN_BTN_PULSAR = "Pulsa Aqui";
	private static final long serialVersionUID = 1L;
	private static final int ANCHO = 800;
	private static final int ALTO = 500;
	private static final Icon ACT_CMN_BTN_VOLVER = null;
	private JButton btnPrueba;
	private JScrollPane scrollPane;

	private JButton btnAtras;


	public VDefinicionesGitAvanzado() {

		setTitle("Git Avanzado");

		configurarFrame();

		initComponentes();

		getContentPane().setBackground(new Color(64, 224, 208));
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
				"<html>\r\n<body style=\"font-family: Arial, sans-serif; background-color: #f4f4f4; padding: 20px;\">\r\n  <div style=\"background-color: #ffffff; padding: 20px; border-radius: 8px; box-shadow: 0 0 10px rgba(0,0,0,0.1);\">\r\n\r\n    <h1 style=\"color: #333333; border-bottom: 2px solid #007acc; padding-bottom: 10px; text-align: center;\">Git Avanzado</h1>\r\n\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      La diferencia entre un <strong>clon superficial</strong> y un <strong>clon completo</strong> en Git es que un clon superficial \r\n      solo descarga el historial de commits más reciente, mientras que un clon completo descarga todo el historial. \r\n      Esto puede ser útil para ahorrar espacio y tiempo si no necesitas todo el historial del repositorio.\r\n    </p>\r\n\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      El comando para clonar un repositorio Git existente en tu máquina local es <code>git clone url_del_repo</code>. \r\n      Esto copia el repositorio remoto a tu máquina local, incluyendo todos los archivos y el historial de commits.\r\n    </p>\r\n\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      En Git, la rama \"HEAD\" siempre apunta al commit más reciente en tu rama local. Esto significa que HEAD es un \r\n      puntero que indica la posición actual en el historial de commits.\r\n    </p>\r\n\r\n    <p style=\"text-align: center;\">\r\n      <a href=\"https://git-scm.com/doc\" style=\"color: #007acc; text-decoration: none; font-weight: bold;\">Más información sobre Git</a>\r\n    </p>\r\n\r\n  </div>\r\n</body>\r\n</html>\r\n");
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
	
	public void cargarPanel(JPanel panel) {
		scrollPane.setViewportView(panel);
	}
	public void PruebaActionListener(VentanaListener Listener) {
		btnPrueba.addActionListener(Listener);

	}

	public JButton getBtnAtras() {
		return btnAtras;
	}

	
}
