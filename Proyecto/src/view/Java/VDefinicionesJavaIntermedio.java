package view.Java;

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

public class VDefinicionesJavaIntermedio extends JFrame {

	public static final String ACT_CMN_BTN_PULSAR = "Pulsa Aqui";
	private static final int ANCHO = 800;
	private static final int ALTO = 500;
	private static final Icon ACT_CMN_BTN_VOLVER = null;
	private JButton btnPrueba;
	private JScrollPane scrollPane;
	private JButton btnAtras;


	public VDefinicionesJavaIntermedio() {
		getContentPane().setEnabled(false);

		setTitle("Java Intermedio");

		configurarFrame();

		initComponentes();

		getContentPane().setBackground(new Color(51, 255, 102));
	}

	private void initComponentes() {
		getContentPane().setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(68, 10, 639, 343);
		getContentPane().add(scrollPane);

		JTextPane txtpnJavaIntermedio = new JTextPane();
		txtpnJavaIntermedio.setEditable(false);
		txtpnJavaIntermedio.setContentType("text/html");
		txtpnJavaIntermedio.setText(
				"<html>\r\n<body style=\"font-family: Arial, sans-serif; background-color: #f4f4f4; padding: 20px;\">\r\n  <div style=\"background-color: #ffffff; padding: 20px; border-radius: 8px; box-shadow: 0 0 10px rgba(0,0,0,0.1);\">\r\n\r\n    <h1 style=\"color: #333333; border-bottom: 2px solid #007acc; padding-bottom: 10px; text-align: center;\">Java Intermedio: Conceptos Clave</h1>\r\n\r\n    <h2>ArrayList: Lista Flexible</h2>\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      Un <code>ArrayList</code> es como una lista de compras que puedes cambiar fácilmente. Puedes agregar o quitar elementos a medida que lo necesitas. Es útil cuando no sabes cuántos elementos tendrás de antemano.\r\n    </p>\r\n\r\n    <h2>Interfaces: Contratos y Flexibilidad</h2>\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      Las interfaces en Java son como contratos que establecen qué métodos una clase debe tener. Son útiles para crear diseños flexibles y desacoplados, donde diferentes clases pueden cumplir el mismo contrato de maneras distintas. Imagina que tienes un contrato para un servicio de entrega: diferentes empresas pueden cumplirlo usando camiones, bicicletas o incluso drones, siempre y cuando entreguen el paquete.\r\n    </p>\r\n\r\n    <h2>Clases Abstractas: Plantillas para Clases</h2>\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      Las clases abstractas son como plantillas para crear otras clases. Proporcionan una estructura básica y algunos métodos, pero dejan otros sin implementar. Es como un plano de una casa que te dice dónde deberían estar las habitaciones, pero tú decides cómo decorarlas.\r\n    </p>\r\n\r\n    <h2>Excepciones: Manejo de Errores</h2>\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      Las excepciones son como señales de advertencia en tu código. Te avisan cuando algo inesperado sucede, como intentar dividir por cero o acceder a un archivo que no existe. Puedes usar bloques <code>try-catch</code> para \"atrapar\" estas excepciones y manejarlas de manera elegante, evitando que tu programa se bloquee.\r\n    </p>\r\n\r\n    <pre style=\"background-color: #f0f0f0; padding: 10px; border-radius: 5px;\"><code>\r\ntry {\r\n    // Código que podría generar una excepción\r\n} catch (Exception e) {\r\n    // Código para manejar la excepción\r\n}\r\n    </code></pre>\r\n\r\n    <p style=\"text-align: center;\">\r\n      <a href=\"https://docs.oracle.com/en/java/javase/tutorial/\" style=\"color: #007acc; text-decoration: none; font-weight: bold;\">Más información sobre Java</a>\r\n    </p>\r\n\r\n  </div>\r\n</body>\r\n</html>\r\n");
		scrollPane.setColumnHeaderView(txtpnJavaIntermedio);
		scrollPane.setViewportView(txtpnJavaIntermedio);

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
