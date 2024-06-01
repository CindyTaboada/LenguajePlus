package main;

import java.awt.EventQueue;

import control.VentanaListener;
import view.VpNiveles;
import view.VpLenguajes;
import view.VpCrearCuenta;
import view.VpInicio;
import view.VpRanking;

public class Inicio {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				
				VpInicio vpi = new VpInicio();
				VpCrearCuenta vcc = new VpCrearCuenta();
				VpRanking vr = new VpRanking();
			    VpLenguajes vpl = new VpLenguajes();
				VpNiveles vpd = new VpNiveles();
				
				
				
				VentanaListener l = new VentanaListener(vpi, vcc, vr, vpl, vpd);
				
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
