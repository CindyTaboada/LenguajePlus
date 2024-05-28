package main;

import java.awt.EventQueue;

import control.VentanaPrincipalInicioListener;
import dam.main.VPrincipalDificultad;
import dam.main.VPrincipalLenguaje;
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
				VPrincipalLenguaje vn = new VPrincipalLenguaje();
				VPrincipalDificultad vd = new VPrincipalDificultad();
				
				VentanaPrincipalInicioListener l = new VentanaPrincipalInicioListener(vpi, vcc, vr,vn,vd);
				
				vpi.setListener(l);
				vcc.setListener(l);
				vr.setListener(l);
				vn.setListener(l);
				vd.setListener(l);
				
				vpi.setVisible(true);
				vn.hacerVisible();
			}
		});

	}

}
