package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import model.FuenteDatos;
import view.VentanaCrearCuenta;
import view.VentanaPrincipalInicio;
import view.VentanaRanking;

public class VentanaPrincipalInicioListener implements ActionListener {
	
	VentanaPrincipalInicio vpi;
	VentanaCrearCuenta vcc;
	VentanaRanking vr;
	private FuenteDatos datos;

	public VentanaPrincipalInicioListener(VentanaPrincipalInicio vpi, VentanaCrearCuenta vcc, VentanaRanking vr) {
		this.vpi = vpi;
		this.vcc = vcc;
		this.vr = vr;
		datos = new FuenteDatos();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			if (e.getSource().equals(vpi.getBtnIniciarSesion())) {
				
			} else if (e.getSource().equals(vpi.getBtnCrearCuenta())) {
				vpi.setVisible(false);
				vcc.setVisible(true);
			} else if (e.getSource().equals(vcc.getBtnCancelarCrearCuenta())) {
				vpi.setVisible(true);
				vcc.setVisible(false);
			} else if (e.getSource().equals(vcc.getBtnConfirmarCrearCuenta())) {
				
			} else if (e.getSource().equals(vr.getBtnSalirRanking())) {
				vr.setVisible(false);
				
			}
		}

	}

}
