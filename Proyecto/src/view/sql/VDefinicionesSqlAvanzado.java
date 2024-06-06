package view.sql;

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

public class VDefinicionesSqlAvanzado extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final int ANCHO = 800;
	private static final int ALTO = 500;
	private JButton btnPrueba;
	private JScrollPane scrollPane;
	private JButton btnAtras;

	public VDefinicionesSqlAvanzado() {
		getContentPane().setEnabled(false);

		setTitle("SQL Avanzado");

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

		JTextPane txtpnSqlAvanzado = new JTextPane();
		txtpnSqlAvanzado.setEditable(false);
		txtpnSqlAvanzado.setContentType("text/html");
		txtpnSqlAvanzado.setText(
				"<html>\r\n<body style=\"font-family: Arial, sans-serif; background-color: #f4f4f4; padding: 20px;\">\r\n  <div style=\"background-color: #ffffff; padding: 20px; border-radius: 8px; box-shadow: 0 0 10px rgba(0,0,0,0.1);\">\r\n\r\n    <h1 style=\"color: #333333; border-bottom: 2px solid #007acc; padding-bottom: 10px; text-align: center;\">SQL Avanzado</h1>\r\n\r\n    <h2>Declarar Variables en Funciones SQL</h2>\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      Dentro de una función SQL (SQL/PL), puedes crear variables para almacenar datos temporalmente. Estas variables te permiten realizar cálculos, manipular valores y almacenar resultados intermedios.\r\n    </p>\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      Ejemplo:\r\n      <ul>\r\n        <li><code>v_nombre nomTabla.NOMBRE%TYPE;</code>: Declara una variable llamada `v_nombre` que tendrá el mismo tipo de dato que la columna `NOMBRE` en la tabla `nomTabla`. Esto asegura que la variable pueda almacenar cualquier valor que pueda estar en esa columna.</li>\r\n      </ul>\r\n    </p>\r\n\r\n    <h2>Cursores: Recorrer Resultados</h2>\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      Un <strong>cursor</strong> es como un dedo que señala cada fila de una tabla, una por una. Te permite realizar acciones específicas en cada fila de los resultados de una consulta SQL. Imagina que tienes una lista de tareas, y el cursor te ayuda a revisar cada tarea individualmente.\r\n    </p>\r\n\r\n    <h2>Triggers: Automatizar Acciones</h2>\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      Los <strong>triggers</strong> son como guardias de seguridad que vigilan tu base de datos. Se activan automáticamente cuando ocurren ciertos eventos, como cuando se inserta, actualiza o elimina un registro. Puedes usarlos para realizar tareas como registrar cambios, validar datos o incluso enviar notificaciones.\r\n    </p>\r\n\r\n    <p style=\"text-align: center;\">\r\n      <a href=\"https://www.w3schools.com/sql/\" style=\"color: #007acc; text-decoration: none; font-weight: bold;\">Más información sobre SQL</a>\r\n    </p>\r\n\r\n  </div>\r\n</body>\r\n</html>\r\n");
		scrollPane.setColumnHeaderView(txtpnSqlAvanzado);
		scrollPane.setViewportView(txtpnSqlAvanzado);

		btnPrueba = new JButton("Pulsa Aqui");
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

	public void PruebaActionListener(VentanaListener Listener) {
		btnPrueba.addActionListener(Listener);

	}

}