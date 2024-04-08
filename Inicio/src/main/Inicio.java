package main;

import java.awt.EventQueue;

import view.VentanaPrincipalInicio;

public class Inicio {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				VentanaPrincipalInicio vppal = new VentanaPrincipalInicio();
				vppal.hacerVisible();
			}
		});

	}

}
