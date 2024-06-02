package view.Javascript;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JTextPane;

import control.VentanaPrincipalListener;

import javax.swing.JButton;
import java.awt.Font;

public class MaterialJavaScriptBasico extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private static final int ANCHO = 800;
	private static final int ALTO = 500;
	private JButton btnPrueba;
	private JScrollPane scrollPane;
	
	public MaterialJavaScriptBasico() {
		getContentPane().setBackground(new Color(51, 255, 102));
		setTitle("JavaScript Basico");
		
		configurarFrame();
		
		initComponentes();
	}

	private void initComponentes() {
		getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setBounds(68, 10, 639, 343);
		getContentPane().add(scrollPane);
		
		JTextPane txtpnJavaScriptBasico = new JTextPane();
		txtpnJavaScriptBasico.setEditable(false);
		txtpnJavaScriptBasico.setContentType("text/html");
		txtpnJavaScriptBasico.setText("<html>\r\n<body style=\"font-family: Arial, sans-serif; background-color: #f4f4f4; padding: 20px;\">\r\n  <div style=\"background-color: #ffffff; padding: 20px; border-radius: 8px; box-shadow: 0 0 10px rgba(0,0,0,0.1);\">\r\n\r\n    <h1 style=\"color: #333333; border-bottom: 2px solid #007acc; padding-bottom: 10px; text-align: center;\">JavaScript Básico</h1>\r\n\r\n\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      Para declarar una variable en JavaScript, utiliza <code>var nombreVariable;</code>. Esta es la forma correcta de crear una variable, \r\n      aunque también existen otras formas modernas como <code>let</code> y <code>const</code>.\r\n    </p>\r\n\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      El operador para concatenar cadenas en JavaScript es <code>+</code>. Este operador une dos o más cadenas en una sola.\r\n    </p>\r\n\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      La función <code>document.write()</code> en JavaScript se utiliza para escribir directamente en el HTML de la página. \r\n      Esto puede ser útil para mostrar contenido durante la carga inicial de la página.\r\n    </p>\r\n\r\n    <p style=\"text-align: center;\">\r\n      <a href=\" \" style=\"color: #007acc; text-decoration: none; font-weight: bold;\">Más información sobre JavaScript</a>\r\n    </p>\r\n\r\n  </div>\r\n</body>\r\n</html>\r\n");
		scrollPane.setColumnHeaderView(txtpnJavaScriptBasico);
		scrollPane.setViewportView(txtpnJavaScriptBasico);
		
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
	
	public JButton getBtnPrueba() {
		return btnPrueba;
	}

	public void pruebaListener(VentanaPrincipalListener l) {
		btnPrueba.addActionListener(l);
	}
	
	public void cargarPanel(JPanel panel) {
		scrollPane.setViewportView(panel);
		
	}
}
