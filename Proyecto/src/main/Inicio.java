package main;

import java.awt.EventQueue;

import control.VentanaPrincipalListener;
import view.VpNiveles;
import view.VpLenguajes;
import view.VpCrearCuenta;
import view.VpInicio;
import view.VpRanking;
import view.Java.MaterialJavaAvanzado;
import view.Java.MaterialJavaBasico;
import view.Java.MaterialJavaIntermedio;
import view.Javascript.MaterialJavaScriptAvanzado;
import view.Javascript.MaterialJavaScriptBasico;
import view.Javascript.MaterialJavaScriptIntermedio;
import view.git.MaterialGitAvanzado;
import view.git.MaterialGitBasico;
import view.git.MaterialGitIntermedio;
import view.linux.MaterialLinuxAvanzado;
import view.linux.MaterialLinuxBasico;
import view.linux.MaterialLinuxIntermedio;
import view.sql.MaterialSqlAvanzado;
import view.sql.MaterialSqlBasico;
import view.sql.MaterialSqlIntermedio;

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
				
				//View para Ventanas Git
				MaterialGitBasico mGitB = new MaterialGitBasico();
				MaterialGitIntermedio mGitI = new MaterialGitIntermedio();
				MaterialGitAvanzado mGitA = new MaterialGitAvanzado();
				//View para Ventanas SQL
				MaterialSqlBasico mSqlB = new MaterialSqlBasico();
				MaterialSqlIntermedio mSqlI = new MaterialSqlIntermedio();
				MaterialSqlAvanzado mSqlA  = new MaterialSqlAvanzado();
				//View para Ventanas JavaScript
				MaterialJavaScriptBasico mJavaScriptB = new MaterialJavaScriptBasico();
				MaterialJavaScriptIntermedio mJavaScriptI = new MaterialJavaScriptIntermedio();
				MaterialJavaScriptAvanzado mJavaScriptA = new MaterialJavaScriptAvanzado();
				//View para Ventanas Java
				MaterialJavaBasico mJavaB = new MaterialJavaBasico();
				MaterialJavaIntermedio mJavaI = new MaterialJavaIntermedio();
				MaterialJavaAvanzado mJavaA = new MaterialJavaAvanzado();
				//View para Ventanas Linux
				MaterialLinuxBasico mLinuxB = new MaterialLinuxBasico();
				MaterialLinuxIntermedio mLinuxI = new MaterialLinuxIntermedio();
				MaterialLinuxAvanzado mLinuxA = new MaterialLinuxAvanzado();
				
				
				
				
				VentanaPrincipalListener l = new VentanaPrincipalListener(vpi, vcc, vr, vpl, vpd, mGitB, mGitI, mGitA, mSqlB, mSqlI, mSqlA,
						mJavaScriptB, mJavaScriptI, mJavaScriptA, mJavaB, mJavaI, mJavaA, mLinuxB, mLinuxI, mLinuxA);
				
				vpi.setListener(l);
				vcc.setListener(l);
				vr.setListener(l);
				vpl.setListener(l);
				vpd.setListener(l);
				
				
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
