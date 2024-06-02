package view.linux;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;

import control.VentanaPrincipalListener;

public class MaterialLinuxAvanzado extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final int ANCHO = 800;
	private static final int ALTO = 500;
	private JButton btnPrueba;
	private JScrollPane scrollPane;

	public MaterialLinuxAvanzado() {
		getContentPane().setEnabled(false);

		setTitle("Linux Avanzado");

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

		JTextPane txtpnLinuxAvanzado = new JTextPane();
		txtpnLinuxAvanzado.setEditable(false);
		txtpnLinuxAvanzado.setContentType("text/html");
		txtpnLinuxAvanzado.setText(
				"<html>\r\n<body style=\"font-family: Arial, sans-serif; background-color: #f4f4f4; padding: 20px;\">\r\n  <div style=\"background-color: #ffffff; padding: 20px; border-radius: 8px; box-shadow: 0 0 10px rgba(0,0,0,0.1);\">\r\n\r\n    <h1 style=\"color: #333333; border-bottom: 2px solid #007acc; padding-bottom: 10px; text-align: center;\">Linux Intermedio</h1>\r\n\r\n    <h2>Cambiar Permisos: `chmod`</h2>\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      Imagina que tienes una caja fuerte con un código. El comando <code>chmod</code> te permite cambiar ese código, decidiendo quién puede abrir la caja (leer el archivo), meter cosas nuevas (escribir en el archivo) o ejecutar acciones especiales (ejecutar el archivo como un programa).\r\n    </p>\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      Ejemplos:\r\n      <ul>\r\n        <li><code>chmod +x mi_script.sh</code>: Permite que el archivo \"mi_script.sh\" se ejecute como un programa.</li>\r\n        <li><code>chmod 644 documento.txt</code>: Solo tú puedes modificar el archivo, pero otros pueden leerlo.</li>\r\n      </ul>\r\n    </p>\r\n\r\n    <h2>Ejecutar Scripts de Bash: Varias Formas</h2>\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n      Los scripts de Bash son como pequeñas listas de instrucciones para tu computadora. Hay varias formas de decirle a Linux que las siga:\r\n      <ul>\r\n        <li><code>./script.sh</code>: La forma más común, funciona si el archivo tiene permiso de ejecución.</li>\r\n        <li><code>bash script.sh</code>: Le dices explícitamente a Bash que ejecute el script.</li>\r\n        <li><code>sh script.sh</code>: Similar a lo anterior, pero usa el intérprete de comandos `sh`.</li>\r\n      </ul>\r\n    </p>\r\n\r\n    <h2>Bucles `for`: Repetir Tareas</h2>\r\n    <p style=\"color: #333333; line-height: 1.6;\">\r\n Un bucle for es como decirle a tu computadora que haga algo varias veces seguidas. Por ejemplo, si quieres imprimir los números del 1 al 10, puedes usar:\r\n    </p>\r\n    <pre style=\"background-color: #f0f0f0; padding: 10px; border-radius: 5px;\"><code>for i in {1..10}; do echo $i; done</code></pre>\r\n\r\n    <p style=\"text-align: center;\">\r\n      <a href=\"https://www.linux.org/\" style=\"color: #007acc; text-decoration: none; font-weight: bold;\">Más información sobre Linux</a>\r\n    </p>\r\n\r\n  </div>\r\n</body>\r\n</html>\r\n");
		scrollPane.setColumnHeaderView(txtpnLinuxAvanzado);
		scrollPane.setViewportView(txtpnLinuxAvanzado);

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
