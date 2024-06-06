package view.Javascript;

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
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

import control.VentanaListener;

public class VDefinicionesJavaScriptAvanzado extends JFrame {

	public static final String ACT_CMN_BTN_PULSAR = "Pulsa Aqui";
	private static final long serialVersionUID = 1L;
	private static final int ANCHO = 800;
	private static final int ALTO = 500;
	private static final Icon ACT_CMN_BTN_VOLVER = null;
	private JButton btnPrueba;
	private JScrollPane scrollPane;
	private JButton btnAtras;

	public VDefinicionesJavaScriptAvanzado() {
		getContentPane().setEnabled(false);

		setTitle("JavaScript Avanzado");

		configurarFrame();

		initComponentes();

		getContentPane().setBackground(new Color(64, 224, 208));
	}

	private void initComponentes() {
		getContentPane().setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(68, 10, 639, 343);
		getContentPane().add(scrollPane);

		JTextPane txtpnJavaScriptBasico = new JTextPane();
		txtpnJavaScriptBasico.setEditable(false);
		txtpnJavaScriptBasico.setContentType("text/html");
		txtpnJavaScriptBasico.setText(
				"<html>\r\n<body style=\"font-family: Arial, sans-serif; background-color: #f4f4f4; padding: 20px;\">\r\n  <div style=\"background-color: #ffffff; padding: 20px; border-radius: 8px; box-shadow: 0 0 10px rgba(0,0,0,0.1);\">\r\n\r\n    <h1 style=\"color: #333333; border-bottom: 2px solid #007acc; padding-bottom: 10px; text-align: center;\">JavaScript Avanzado</h1>\r\n\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      El <strong>BOM</strong> (Browser Object Model) en JavaScript es una interfaz para interactuar con el navegador web. Incluye objetos como \r\n      <code>window</code>, <code>navigator</code>, <code>screen</code> y <code>history</code> que permiten interactuar con el entorno del navegador.\r\n    </p>\r\n\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      Un evento en el contexto del <strong>DOM</strong> (Document Object Model) en JavaScript es una acción del usuario, como un clic o un \r\n      movimiento del mouse, una notificación del navegador sobre un cambio en el estado de la página, o un mecanismo para ejecutar \r\n      código JavaScript en un momento específico. Por lo tanto, <strong>todas las anteriores</strong> son correctas.\r\n    </p>\r\n\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      Para seleccionar un elemento del DOM por su ID en JavaScript, utiliza el método <code>getElementById()</code>. Este método devuelve una \r\n      referencia al primer objeto con el ID especificado.\r\n    </p>\r\n\r\n    <p style=\"text-align: center;\">\r\n      <a href=\"https://developer.mozilla.org/es/docs/Web/JavaScript\" style=\"color: #007acc; text-decoration: none; font-weight: bold;\">Más información sobre JavaScript</a>\r\n    </p>\r\n   \r\n  </div>\r\n</body>\r\n</html>\r\n");
		scrollPane.setColumnHeaderView(txtpnJavaScriptBasico);
		scrollPane.setViewportView(txtpnJavaScriptBasico);

		btnPrueba = new JButton(ACT_CMN_BTN_PULSAR);
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
	

	public JButton getBtnAtras() {
		return btnAtras;
	}

	public void pruebaListener(VentanaListener l) {
		btnPrueba.addActionListener(l);
		btnAtras.addActionListener(l);
	}
	
	public void cargarPanel(JPanel panel) {
		scrollPane.setViewportView(panel);
	}

}
