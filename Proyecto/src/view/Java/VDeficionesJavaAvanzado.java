package view.Java;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

import control.VentanaListener;

import java.awt.event.ActionListener;

public class VDeficionesJavaAvanzado extends JFrame {

	public static final String ACT_CMN_BTN_PULSAR = "Pulsa Aqui";
	private static final long serialVersionUID = 1L;
	private static final int ANCHO = 800;
	private static final int ALTO = 500;
	private static final Icon ACT_CMN_BTN_VOLVER = null;
	private JButton btnPrueba;
	private PnlTestJavaAvanzado preguntasFrame;
	private JButton btnAtras;

	public VDeficionesJavaAvanzado() {
		getContentPane().setEnabled(false);

		setTitle("Java Avanzado");

		configurarFrame();

		initComponentes();

		getContentPane().setBackground(new Color(51, 255, 102));
	}

	private void initComponentes() {
		getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(68, 10, 639, 343);
		getContentPane().add(scrollPane);

		JTextPane txtpnJavaAvanzado = new JTextPane();
		txtpnJavaAvanzado.setEditable(false);
		txtpnJavaAvanzado.setContentType("text/html");
		txtpnJavaAvanzado.setText(
				"<html>\r\n<body style=\"font-family: Arial, sans-serif; background-color: #f4f4f4; padding: 20px;\">\r\n  <div style=\"background-color: #ffffff; padding: 20px; border-radius: 8px; box-shadow: 0 0 10px rgba(0,0,0,0.1);\">\r\n\r\n    <h1 style=\"color: #333333; border-bottom: 2px solid #007acc; padding-bottom: 10px; text-align: center;\">Java Avanzado: Conceptos Clave</h1>\r\n\r\n    <h2>Interfaces: Contratos y Flexibilidad</h2>\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      Las interfaces en Java son como contratos que establecen qué métodos una clase debe implementar. Son útiles para crear diseños flexibles y desacoplados, donde diferentes clases pueden cumplir el mismo contrato de maneras distintas. Imagina que tienes un contrato para un servicio de entrega: diferentes empresas pueden cumplirlo usando camiones, bicicletas o incluso drones, siempre y cuando entreguen el paquete.\r\n    </p>\r\n\r\n    <h2>Menús Desplegables Avanzados: `JMenu` y `JMenuItem`</h2>\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      La clase <code>JMenu</code> te permite crear menús desplegables, mientras que la clase <code>JMenuItem</code> representa los elementos individuales dentro de esos menús. Puedes crear menús complejos con submenús, atajos de teclado y acciones personalizadas. Es como construir un menú de restaurante con diferentes categorías, platos y opciones adicionales.\r\n    </p>\r\n\r\n    <h2>Manejo de Errores: `IndexOutOfBoundsException`</h2>\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      Imagina que tienes una caja con 10 compartimentos numerados. Si intentas acceder al compartimento número 15, te encontrarás con un error. En Java, este error se llama `IndexOutOfBoundsException` y ocurre cuando intentas acceder a un elemento de una colección (como un array o un `ArrayList`) que no existe porque estás fuera de los límites permitidos.\r\n    </p>\r\n\r\n    <h2>Ventanas Personalizadas: `JFrame`</h2>\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      Un `JFrame` es la base para crear ventanas gráficas en tus aplicaciones Java. Puedes personalizar su apariencia, tamaño, posición y comportamiento. Es como construir una casa: puedes elegir el tamaño, el diseño, los colores y agregar diferentes elementos como puertas, ventanas y muebles.\r\n    </p>\r\n\r\n    <p style=\"text-align: center;\">\r\n      <a href=\"https://docs.oracle.com/en/java/javase/tutorial/uiswing/index.html\" style=\"color: #007acc; text-decoration: none; font-weight: bold;\">Más información sobre Java Swing</a>\r\n    </p>\r\n\r\n  </div>\r\n</body>\r\n</html>\r\n");
		scrollPane.setColumnHeaderView(txtpnJavaAvanzado);
		scrollPane.setViewportView(txtpnJavaAvanzado);

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
		
		preguntasFrame = new PnlTestJavaAvanzado();
	}

	public JButton getBtnPrueba() {
		return btnPrueba;
	}

	public void PruebaActionListener(VentanaListener Listener) {
		btnPrueba.addActionListener(Listener);
	}

	private void configurarFrame() {
		setSize(ANCHO, ALTO);

		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((pantalla.width - this.getSize().width) / 2, (pantalla.height - this.getSize().height) / 2);

	}
}

