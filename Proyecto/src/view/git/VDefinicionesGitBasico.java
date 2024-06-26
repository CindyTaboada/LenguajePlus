package view.git;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import control.VentanaListener;

import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.Font;

public class VDefinicionesGitBasico extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private static final int ANCHO = 800;
	private static final int ALTO = 500;
	private JButton btnPrueba;
	private JScrollPane scrollPane;
	private JButton btnAtras;
	
	public VDefinicionesGitBasico() {
		getContentPane().setBackground(new Color(64, 224, 208));
		setTitle("Git Basico");
		
		configurarFrame();
		
		initComponentes();
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
		txtpnGitBasico.setText("<html>\r\n<body style=\"font-family: Arial, sans-serif; background-color: #f4f4f4; padding: 20px;\">\r\n    "
				+ "<div style=\"background-color: #ffffff; padding: 20px; border-radius: 8px; box-shadow: 0 0 10px rgba(0,0,0,0.1);\">\r\n        "
				+ "<h1 style=\"color: #333333; border-bottom: 2px solid #007acc; padding-bottom: 10px; text-align: center;\">Git Básico</h1>\r\n        "
				+ "<p style=\"color: #333333; line-height: 1.6;\">\r\n            "
				+ "<strong>El comando <code>git status</code></strong> se utiliza para mostrar archivos sin seguimiento y modificados.\r\n            "
				+ "Este comando es útil para ver el estado de tu repositorio y verificar qué archivos han sido modificados o agregados\r\n            "
				+ "pero no comprometidos.\r\n        </p>\r\n        <p style=\"color: #333333; line-height: 1.6;\">\r\n            "
				+ "<strong>El comando <code>git add nombre_archivo</code></strong> prepara un archivo para el siguiente commit. Esto\r\n            "
				+ "significa que el archivo se añade al área de preparación (staging area), listo para ser incluido en el próximo commit.\r\n        "
				+ "</p>\r\n        <p style=\"color: #333333; line-height: 1.6;\">\r\n            <strong>El propósito de un mensaje de commit</strong> es describir los cambios realizados en un commit. Esto ayuda a otros desarrolladores (y a ti mismo) a entender qué cambios se han hecho y por qué.\r\n        </p>\r\n        <p style=\"text-align: center;\">\r\n            <a href=\"https://git-scm.com/doc\" style=\"color: #007acc; text-decoration: none; font-weight: bold;\">Más información sobre Git</a>\r\n        </p>\r\n    </div>\r\n</body>\r\n</html>\r\n");
		scrollPane.setColumnHeaderView(txtpnGitBasico);
		
		btnPrueba = new JButton();
		btnPrueba.setText("Pulsa aqui!");
		btnPrueba.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnPrueba.setBounds(289, 404, 162, 39);
		getContentPane().add(btnPrueba);
		
		JLabel lblNewLabel = new JLabel("¿Listo para una prueba?");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblNewLabel.setBounds(289, 365, 187, 29);
		getContentPane().add(lblNewLabel);
		
		btnAtras = new JButton();
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
		btnAtras.addActionListener(Listener);

	}

	public JButton getBtnAtras() {
		return btnAtras;
	}

	
}
