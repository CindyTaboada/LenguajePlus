package main;

import java.awt.EventQueue;

import control.VentanaPrincipalListener;
import view.VPrincipalNivel;
import view.VPrincipalLenguaje;
import view.VentanaCrearCuenta;
import view.VentanaPrincipalInicio;
import view.VentanaRanking;

public class Inicio {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				
				VentanaPrincipalInicio vpi = new VentanaPrincipalInicio();
				VentanaCrearCuenta vcc = new VentanaCrearCuenta();
				VentanaRanking vr = new VentanaRanking();
			    VPrincipalLenguaje vpl = new VPrincipalLenguaje();
				VPrincipalNivel vpd = new VPrincipalNivel();
				
				
				
				VentanaPrincipalListener l = new VentanaPrincipalListener(vpi, vcc, vr, vpl, vpd);
				
				vpi.setListener(l);
				vcc.setListener(l);
				vr.setListener(l);
				vpl.setListener(l);
				vpd.setListener(l);
				
				vpi.setVisible(true);
				
			}
		});

	}

}
