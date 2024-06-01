package view.sql;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JTextPane;

import control.VentanaPrincipalListener;

import javax.swing.JButton;
import java.awt.Font;

public class MaterialSqlBasico extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private static final int ANCHO = 800;
	private static final int ALTO = 500;
	private JButton btnPrueba;
	
	public MaterialSqlBasico() {
		getContentPane().setBackground(new Color(51, 255, 102));
		setTitle("SQL Basico");
		
		configurarFrame();
		
		initComponentes();
	}

	private void initComponentes() {
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setBounds(68, 10, 639, 343);
		getContentPane().add(scrollPane);
		
		JTextPane txtpnSqlBasico = new JTextPane();
		txtpnSqlBasico.setEditable(false);
		txtpnSqlBasico.setContentType("text/html");
		txtpnSqlBasico.setText("<html>\r\n<body style=\"font-family: Arial, sans-serif; background-color: #f4f4f4; padding: 20px;\">\r\n  <div style=\"background-color: #ffffff; padding: 20px; border-radius: 8px; box-shadow: 0 0 10px rgba(0,0,0,0.1);\">\r\n\r\n    <h1 style=\"color: #333333; border-bottom: 2px solid #007acc; padding-bottom: 10px; text-align: center;\">SQL Básico</h1>\r\n\r\n    <h2>¿Qué es SQL?</h2>\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      <strong>SQL</strong> (Structured Query Language) es el idioma que usamos para hablar con las bases de datos. Es como hacer preguntas a una biblioteca gigante llena de información organizada en tablas.\r\n    </p>\r\n\r\n    <h2>Seleccionar Datos: `SELECT`</h2>\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      El comando <code>SELECT</code> es como pedirle a la biblioteca que te muestre libros específicos. Puedes elegir qué información quieres ver y de qué tabla.\r\n    </p>\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      Ejemplo:\r\n      <ul>\r\n        <li><code>SELECT nombre, apellido FROM empleados;</code>: Muestra los nombres y apellidos de todos los empleados de la tabla \"empleados\".</li>\r\n      </ul>\r\n    </p>\r\n\r\n    <h2>Filtrar Resultados: `WHERE`</h2>\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      La cláusula <code>WHERE</code> es como decirle a la biblioteca que solo quieres ver libros de un autor específico o de un género en particular. Te permite seleccionar solo los datos que te interesan.\r\n    </p>\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      Ejemplo:\r\n      <ul>\r\n        <li><code>SELECT * FROM empleados WHERE departamento = 'Ventas';</code>: Muestra todos los datos de los empleados que trabajan en el departamento de \"Ventas\".</li>\r\n      </ul>\r\n    </p>\r\n\r\n    <p style=\"text-align: center;\">\r\n      <a href=\"https://www.w3schools.com/sql/\" style=\"color: #007acc; text-decoration: none; font-weight: bold;\">Más información sobre SQL</a>\r\n    </p>\r\n\r\n  </div>\r\n</body>\r\n</html>\r\n");
		scrollPane.setColumnHeaderView(txtpnSqlBasico);
		scrollPane.setViewportView(txtpnSqlBasico);
		
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

	public void PruebaActionListener(VentanaPrincipalListener Listener) {
		btnPrueba.addActionListener(Listener);
	}
}
