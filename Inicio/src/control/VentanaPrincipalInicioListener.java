package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import view.VentanaCrearCuenta;
import view.VentanaPrincipalInicio;
import view.VentanaRanking;

public class VentanaPrincipalInicioListener implements ActionListener {
	
	VentanaPrincipalInicio vppal;
	VentanaCrearCuenta vcc;
	VentanaRanking vr;

	public VentanaPrincipalInicioListener(VentanaPrincipalInicio vppal, VentanaCrearCuenta vcc, VentanaRanking vr) {
		this.vppal = vppal;
		this.vcc = vcc;
		this.vr = vr;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() instanceof JButton) {
			if (e.getSource().equals(vppal.getBtnIniciarSesion())) {
				vppal.cargarPanel(null);
			} else if (e.getSource().equals(vppal.getBtnCrearCuenta())) {
				vppal.cargarPanel(vcc);
			}
		}

	}

}
