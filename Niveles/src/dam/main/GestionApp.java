package dam.main;

import java.awt.EventQueue;

import dam.control.VListenerNiveles;
import dam.view.VPrincipalDificultad;
import dam.view.VPrincipalLenguaje;

public class GestionApp {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {

				VPrincipalLenguaje vNiveles = new VPrincipalLenguaje();
				VPrincipalDificultad vDificultad = new VPrincipalDificultad();

				VListenerNiveles listener = new VListenerNiveles(vNiveles, vDificultad);

				vNiveles.setListener(listener);

				vNiveles.hacerVisible();

			}

		});
	}
}