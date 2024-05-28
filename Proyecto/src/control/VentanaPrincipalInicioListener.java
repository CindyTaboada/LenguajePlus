package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.FuenteDatos;
import view.VentanaDificultad;
import view.VentanaLenguajeOpciones;
import view.VentanaCrearCuenta;
import view.VentanaPrincipalInicio;
import view.VentanaRanking;

public class VentanaPrincipalInicioListener implements ActionListener {
	
	VentanaPrincipalInicio vpi;
	VentanaCrearCuenta vcc;
	VentanaRanking vr;
	VentanaLenguajeOpciones vpl;
	VentanaDificultad vpd;
	private FuenteDatos datos;

	public VentanaPrincipalInicioListener(VentanaPrincipalInicio vpi, VentanaCrearCuenta vcc, VentanaRanking vr, VentanaLenguajeOpciones vpl, VentanaDificultad vpd) {
		this.vpi = vpi;
		this.vcc = vcc;
		this.vr = vr;
		this.vpl = vpl;
		this.vpd = vpd;
		datos = new FuenteDatos();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			if (e.getSource().equals(vpi.getBtnIniciarSesion())) {
				//esto es temporal
				vpi.setVisible(false);
				vpl.setVisible(true);
			} else if (e.getSource().equals(vpi.getBtnCrearCuenta())) {
				vpi.setVisible(false);
				vcc.setVisible(true);
			} else if (e.getSource().equals(vcc.getBtnCancelarCrearCuenta())) {
				vpi.setVisible(true);
				vcc.setVisible(false);
			} else if (e.getSource().equals(vcc.getBtnConfirmarCrearCuenta())) {
				//esto tambien es temporal
				vpi.setVisible(true);
				vcc.setVisible(false);
			} else if (e.getSource().equals(vpl.getBtnGithub())) {
				vpl.setVisible(false);
				vpd.setVisible(true);
			} else if (e.getSource().equals(vpl.getBtnHtml())) {
				vpl.setVisible(false);
				vpd.setVisible(true);
			} else if (e.getSource().equals(vpl.getBtnJava())) {
				vpl.setVisible(false);
				vpd.setVisible(true);
			} else if (e.getSource().equals(vpl.getBtnJavaScript())) {
				vpl.setVisible(false);
				vpd.setVisible(true);
			} else if (e.getSource().equals(vpl.getBtnSql())) {
				vpl.setVisible(false);
				vpd.setVisible(true);
			} else if (e.getSource().equals(vpd.getBtnBeginner())) {
				
			} else if (e.getSource().equals(vpd.getBtnIntermediate())) {

			} else if (e.getSource().equals(vpd.getBtnAvance())) {
				
			} else if (e.getSource().equals(vr.getBtnSalirRanking())) {
				vr.setVisible(false);
				
			} 
		}

	}

}
