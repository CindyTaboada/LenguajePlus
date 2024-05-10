package main;

import java.awt.EventQueue;

import control.VentanaPrincipalInicioListener;
import view.VentanaCrearCuenta;
import view.VentanaPrincipalInicio;
import view.VentanaRanking;

public class Inicio {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				VentanaPrincipalInicio vppal = new VentanaPrincipalInicio();
				VentanaCrearCuenta vcc = new VentanaCrearCuenta();
				VentanaRanking vr = new VentanaRanking();
				
				VentanaPrincipalInicioListener l = new VentanaPrincipalInicioListener(vppal, vcc, vr);
				
				vppal.setListener(l);
				vcc.setListener(l);
				vr.setListener(l);
				
				vppal.hacerVisible();
			}
		});

	}

}
