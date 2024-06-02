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

public class VDefinicionesSqlIntermedio extends JFrame {

	private static final int ANCHO = 800;
	private static final int ALTO = 500;
	private static final Icon ACT_CMN_BTN_VOLVER = null;
	private JButton btnPrueba;
	private JScrollPane scrollPane;
	private JButton btnAtras;

	public VDefinicionesSqlIntermedio() {
		getContentPane().setEnabled(false);

		setTitle("SQL Intermedio");

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

		JTextPane txtpnSqlIntermedio = new JTextPane();
		txtpnSqlIntermedio.setEditable(false);
		txtpnSqlIntermedio.setContentType("text/html");
		txtpnSqlIntermedio.setText(
				"<html>\r\n<body style=\"font-family: Arial, sans-serif; background-color: #f4f4f4; padding: 20px;\">\r\n  <div style=\"background-color: #ffffff; padding: 20px; border-radius: 8px; box-shadow: 0 0 10px rgba(0,0,0,0.1);\">\r\n\r\n    <h1 style=\"color: #333333; border-bottom: 2px solid #007acc; padding-bottom: 10px; text-align: center;\">SQL Intermedio</h1>\r\n\r\n    <h2>Combinar Tablas: `JOIN`</h2>\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      Imagina que tienes dos rompecabezas: uno con información sobre clientes y otro con información sobre sus pedidos. La cláusula <code>JOIN</code> te permite unir esas piezas para ver qué cliente hizo qué pedido. Es como conectar dos tablas mediante una columna común, como un número de identificación.\r\n    </p>\r\n\r\n    <h2>Contar Filas: `COUNT()`</h2>\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      La función <code>COUNT()</code> es como contar cuántos libros hay en una estantería específica. Te dice cuántas filas (registros) cumplen una condición determinada en tu consulta SQL.\r\n    </p>\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      Ejemplo:\r\n      <ul>\r\n        <li><code>SELECT COUNT(*) FROM empleados WHERE departamento = 'Ventas';</code>: Cuenta cuántos empleados trabajan en el departamento de \"Ventas\".</li>\r\n      </ul>\r\n    </p>\r\n\r\n    <h2>Fecha Actual: `SYSDATE`</h2>\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      La función <code>SYSDATE</code> es como mirar tu reloj para saber la hora exacta. En SQL, te da la fecha y hora actual del sistema en el que se ejecuta la base de datos. Esto es útil para registrar cuándo se realizaron cambios o para calcular fechas futuras.\r\n    </p>\r\n\r\n    <p style=\"text-align: center;\">\r\n      <a href=\"https://www.w3schools.com/sql/\" style=\"color: #007acc; text-decoration: none; font-weight: bold;\">Más información sobre SQL</a>\r\n    </p>\r\n\r\n  </div>\r\n</body>\r\n</html>\r\n");
		scrollPane.setColumnHeaderView(txtpnSqlIntermedio);
		scrollPane.setViewportView(txtpnSqlIntermedio);

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
}
