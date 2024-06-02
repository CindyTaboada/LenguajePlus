package view.Java;

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

public class VDeficionesJavaBasico extends JFrame {
	
	public static final String ACT_CMD_BTN_PULSAR = "Pulsa Aqui";
	private static final long serialVersionUID = 1L;
	private static final int ANCHO = 800;
	private static final int ALTO = 500;
	private static final Icon ACT_CMN_BTN_VOLVER = null;
	private JButton btnPrueba;
	private JScrollPane scrollPane;
	private JButton btnAtras;
	
	public VDeficionesJavaBasico() {
		getContentPane().setBackground(new Color(51, 255, 102));
		setTitle("Java Basico");
		
		configurarFrame();
		
		initComponentes();
	}

	private void initComponentes() {
		getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setBounds(68, 10, 639, 343);
		getContentPane().add(scrollPane);
		
		JTextPane txtpnJavaBasico = new JTextPane();
		txtpnJavaBasico.setEditable(false);
		txtpnJavaBasico.setContentType("text/html");
		txtpnJavaBasico.setText("<html>\r\n<body style=\"font-family: Arial, sans-serif; background-color: #f4f4f4; padding: 20px;\">\r\n  <div style=\"background-color: #ffffff; padding: 20px; border-radius: 8px; box-shadow: 0 0 10px rgba(0,0,0,0.1);\">\r\n\r\n    <h1 style=\"color: #333333; border-bottom: 2px solid #007acc; padding-bottom: 10px; text-align: center;\">Java Básico: Conceptos Clave</h1>\r\n\r\n    <h2>Comentarios: Explicar Tu Código</h2>\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      Los comentarios son como notas que dejas en tu código para explicar qué hace. En Java, puedes usar <code>//</code> para comentar una línea. Es como susurrar algo a alguien que está leyendo tu código.\r\n    </p>\r\n\r\n    <h2>Variables: Almacenar Datos</h2>\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      Las variables son como pequeñas cajas donde puedes guardar información. En Java, para guardar texto (palabras o frases), usas el tipo <code>String</code> y lo pones entre comillas dobles.\r\n    </p>\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      Ejemplo:\r\n      <ul>\r\n        <li><code>String nombre = \"Fulano\";</code>: Crea una variable llamada \"nombre\" y guarda el texto \"Fulano\" en ella.</li>\r\n      </ul>\r\n    </p>\r\n\r\n    <h2>Imprimir en la Consola: `System.out.println()`</h2>\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      La instrucción <code>System.out.println()</code> es como usar un megáfono para mostrar un mensaje en la pantalla. Lo que pongas entre paréntesis y comillas se mostrará en la consola.\r\n    </p>\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      Ejemplo:\r\n      <ul>\r\n        <li><code>System.out.println(\"¡Hola!\");</code>: Imprime \"¡Hola!\" en la consola.</li>\r\n      </ul>\r\n    </p>\r\n\r\n    <h2>Métodos Públicos: Abiertos a Todos</h2>\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      Los métodos son como acciones que tu código puede realizar. Cuando un método es <code>public</code>, significa que cualquier parte de tu programa puede usarlo. Es como una puerta abierta que todos pueden cruzar.\r\n    </p>\r\n\r\n    <h2>Importar Librerías: `import`</h2>\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      Java tiene muchas herramientas útiles llamadas librerías. Para usarlas, necesitas importarlas con la palabra clave <code>import</code>. Es como traer un conjunto de herramientas a tu taller para que puedas usarlas.\r\n    </p>\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      Ejemplo:\r\n      <ul>\r\n        <li><code>import java.io.*;</code>: Importa herramientas para leer y escribir archivos.</li>\r\n      </ul>\r\n    </p>\r\n\r\n    <p style=\"text-align: center;\">\r\n      <a href=\"https://docs.oracle.com/en/java/javase/tutorial/\" style=\"color: #007acc; text-decoration: none; font-weight: bold;\">Más información sobre Java</a>\r\n    </p>\r\n\r\n  </div>\r\n</body>\r\n</html>\r\n");
		scrollPane.setColumnHeaderView(txtpnJavaBasico);
		scrollPane.setViewportView(txtpnJavaBasico);
		
		btnPrueba = new JButton(ACT_CMD_BTN_PULSAR);
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
