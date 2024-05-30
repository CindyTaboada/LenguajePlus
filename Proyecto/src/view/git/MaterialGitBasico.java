package view.git;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Font;

public class MaterialGitBasico extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private static final int ANCHO = 800;
	private static final int ALTO = 500;
	private JButton btnPrueba;
	
	public MaterialGitBasico() {
		getContentPane().setBackground(new Color(51, 255, 102));
		setTitle("Git Basico");
		
		configurarFrame();
		
		initComponentes();
	}

	private void initComponentes() {
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
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
		
		btnPrueba = new JButton("<html>Listo para una Prueba?<br>Plusar Aqui</html>");
		btnPrueba.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnPrueba.setBounds(247, 381, 229, 39);
		getContentPane().add(btnPrueba);
	}
	
	private void configurarFrame() {
		setSize(ANCHO, ALTO);
		
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((pantalla.width - this.getSize().width) / 2, (pantalla.height - this.getSize().height) / 2);
		
	}
}
