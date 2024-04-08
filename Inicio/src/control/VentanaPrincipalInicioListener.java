package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import view.VentanaPrincipalInicio;

public class VentanaPrincipalInicioListener implements ActionListener {
	
	VentanaPrincipalInicio vppal;
	
	public 	VentanaPrincipalInicioListener(	VentanaPrincipalInicio vppal) {
		this.vppal = vppal;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() instanceof JButton) {
			
		}

	}

}
