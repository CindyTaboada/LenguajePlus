package main;

import java.awt.EventQueue;

import control.VentanaListener;
import view.VpNiveles;
import view.VpLenguajes;
import view.VpCrearCuenta;
import view.VpFelicitaciones;
import view.VpInicio;
import view.VpRanking;
import view.Java.VDeficionesJavaAvanzado;
import view.Java.VDeficionesJavaBasico;
import view.Java.VDefinicionesJavaIntermedio;
import view.Javascript.VDefinicionesJavaScriptAvanzado;
import view.Javascript.VDefinicionesJavaScriptBasico;
import view.Javascript.VDefinicionesJavaScriptIntermedio;
import view.git.VDefinicionesGitAvanzado;
import view.git.VDefinicionesGitBasico;
import view.git.VDefinicionesGitIntermedio;
import view.linux.VDefinicionesLinuxAvanzado;
import view.linux.VDefinicionesLinuxBasico;
import view.linux.VDefinicionesLinuxIntermedio;
import view.sql.VDefinicionesSqlAvanzado;
import view.sql.VDefinicionesSqlBasico;
import view.sql.VDefinicionesSqlIntermedio;


public class Inicio {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				
				//LENGUAJES
				VpLenguajes vpl = new VpLenguajes();
				
				//ESTRELLAS
				VpFelicitaciones vf=new VpFelicitaciones();
				
				//RANKING
				VpRanking vr = new VpRanking();
				
				
				//INICIO
				VpInicio vpi = new VpInicio();
				VpCrearCuenta vcc = new VpCrearCuenta();
				
				//NIVELES
				VpNiveles vpd = new VpNiveles();

				//View para Ventanas Git
				VDefinicionesGitBasico mGitB = new VDefinicionesGitBasico();
				VDefinicionesGitIntermedio mGitI = new VDefinicionesGitIntermedio();
				VDefinicionesGitAvanzado mGitA = new VDefinicionesGitAvanzado();
				//View para Ventanas SQL
				VDefinicionesSqlBasico mSqlB = new VDefinicionesSqlBasico();
				VDefinicionesSqlIntermedio mSqlI = new VDefinicionesSqlIntermedio();
			    VDefinicionesSqlAvanzado mSqlA  = new VDefinicionesSqlAvanzado();
				//View para Ventanas JavaScript
				VDefinicionesJavaScriptBasico mJavaScriptB = new VDefinicionesJavaScriptBasico();
				VDefinicionesJavaScriptIntermedio mJavaScriptI = new VDefinicionesJavaScriptIntermedio();
				VDefinicionesJavaScriptAvanzado mJavaScriptA = new VDefinicionesJavaScriptAvanzado();
				//View para Ventanas Java
				VDeficionesJavaBasico mJavaB = new VDeficionesJavaBasico();
				VDefinicionesJavaIntermedio mJavaI = new VDefinicionesJavaIntermedio();
				VDeficionesJavaAvanzado mJavaA = new VDeficionesJavaAvanzado();
				//View para Ventanas Linux
				VDefinicionesLinuxBasico mLinuxB = new VDefinicionesLinuxBasico();
			    VDefinicionesLinuxIntermedio mLinuxI = new VDefinicionesLinuxIntermedio();
				VDefinicionesLinuxAvanzado mLinuxA = new VDefinicionesLinuxAvanzado();
				
				
				
				
				VentanaListener l = new VentanaListener(vpi, vcc, vr,vf, vpl, vpd, mGitB, mGitI, mGitA, mSqlB, mSqlI, mSqlA,
						mJavaScriptB, mJavaScriptI, mJavaScriptA, mJavaB, mJavaI, mJavaA, mLinuxB, mLinuxI, mLinuxA);

				

				
				vpi.setListener(l);
				vcc.setListener(l);
				vr.setListener(l);
				vpl.setListener(l);
				vpd.setListener(l);
				vf.setListener(l);
				
				
				
				    mGitB.pruebaListener(l);
	                mGitI.pruebaListener(l);
	                mGitA.pruebaListener(l);
	                mSqlB.pruebaListener(l);
	                mSqlI.pruebaListener(l);
	                mSqlA.pruebaListener(l);
	                mJavaScriptB.pruebaListener(l);
	                mJavaScriptI.pruebaListener(l);
	                mJavaScriptA.pruebaListener(l);
	                mJavaB.pruebaListener(l);
	                mJavaI.pruebaListener(l);
	                mJavaA.pruebaListener(l);
	                mLinuxB.pruebaListener(l);
	                mLinuxI.pruebaListener(l);
	                mLinuxA.pruebaListener(l);
				
				
				
				vpi.setVisible(true);
				
				
				
				
			}
		});

	}

}
