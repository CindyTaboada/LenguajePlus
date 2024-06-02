package view.Javascript;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import control.VentanaListener;

public class MaterialJavaScriptIntermedio extends JFrame {

	private static final int ANCHO = 800;
	private static final int ALTO = 500;
	private JButton btnPrueba;
	private JScrollPane scrollPane;

	public MaterialJavaScriptIntermedio() {

		setTitle("JavaScript Intermedio");

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

		JTextPane txtpnJavaScriptBasico = new JTextPane();
		txtpnJavaScriptBasico.setEditable(false);
		txtpnJavaScriptBasico.setContentType("text/html");
		txtpnJavaScriptBasico.setText(
				"<html>\r\n<body style=\"font-family: Arial, sans-serif; background-color: #f4f4f4; padding: 20px;\">\r\n  <div style=\"background-color: #ffffff; padding: 20px; border-radius: 8px; box-shadow: 0 0 10px rgba(0,0,0,0.1);\">\r\n\r\n    <h1 style=\"color: #333333; border-bottom: 2px solid #007acc; padding-bottom: 10px; text-align: center;\">JavaScript Intermedio</h1>\r\n\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      Para agregar un elemento al final de un array en JavaScript, usa el método <code>push()</code>. Este método añade uno o más \r\n      elementos al final de un array y devuelve la nueva longitud del array.\r\n    </p>\r\n\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      El método para ordenar los elementos de un array en JavaScript es <code>sort()</code>. Este método ordena los elementos del \r\n      array en su lugar y puede aceptar una función de comparación para definir el orden.\r\n    </p>\r\n\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      El objeto <code>Date</code> en JavaScript proporciona información sobre la fecha y hora actual. Puedes crear una nueva \r\n      instancia de <code>Date</code> para obtener la fecha y hora actuales.\r\n    </p>\r\n\r\n    <p style=\"text-align: center;\">\r\n      <a href=\"https://developer.mozilla.org/es/docs/Web/JavaScript\" style=\"color: #007acc; text-decoration: none; font-weight: bold;\">Más información sobre JavaScript</a>\r\n    </p>\r\n\r\n  </div>\r\n</body>\r\n</html>\r\n");
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

	public void pruebaListener(VentanaListener l) {
		btnPrueba.addActionListener(l);
	}
	
	public void cargarPanel(JPanel panel) {
		scrollPane.setViewportView(panel);
		
	}
}
