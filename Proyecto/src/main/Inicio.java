package main;

import java.awt.EventQueue;

import control.VentanaListener;
import view.VpNiveles;
import view.VpLenguajes;
import view.VpCrearCuenta;
import view.VpFelicitaciones;
import view.VpInicio;
import view.VpRanking;
import view.Java.PnlTestJavaAvanzado;
import view.Java.PnlTestJavaBasico;
import view.Java.PnlTestJavaIntermedio;
import view.Java.VDeficionesJavaAvanzado;
import view.Java.VDeficionesJavaBasico;
import view.Java.VDefinicionesJavaIntermedio;
import view.Javascript.PnlTestJavaScriptAvanzado;
import view.Javascript.PnlTestJavaScriptBasico;
import view.Javascript.PnlTestJavaScriptIntermedio;
import view.Javascript.VDefinicionesJavaScriptAvanzado;
import view.Javascript.VDefinicionesJavaScriptBasico;
import view.Javascript.VDefinicionesJavaScriptIntermedio;
import view.git.PnlTesGitBasico;
import view.git.PnlTestGitAvanzado;
import view.git.PnlTestGitIntermedio;
import view.git.VDefinicionesGitAvanzado;
import view.git.VDefinicionesGitBasico;
import view.git.VDefinicionesGitIntermedio;
import view.linux.PnlTestLinuxAvanzado;
import view.linux.PnlTestLinuxBasico;
import view.linux.PnlTestLinuxIntermedio;
import view.linux.VDefinicionesLinuxAvanzado;
import view.linux.VDefinicionesLinuxBasico;
import view.linux.VDefinicionesLinuxIntermedio;
import view.sql.PnlTestSqlAvanzado;
import view.sql.PnlTestSqlBasico;
import view.sql.PnlTestSqlIntermedio;
import view.sql.VDefinicionesSqlAvanzado;
import view.sql.VDefinicionesSqlBasico;
import view.sql.VDefinicionesSqlIntermedio;

public class Inicio {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {

				// LENGUAJES
				VpLenguajes vpl = new VpLenguajes();

				// ESTRELLAS
				VpFelicitaciones vf = new VpFelicitaciones();

				// RANKING
				VpRanking vr = new VpRanking();

				// INICIO
				VpInicio vpi = new VpInicio();
				VpCrearCuenta vcc = new VpCrearCuenta();

				// NIVELES
				VpNiveles vpd = new VpNiveles();

				// View para Ventanas Git
				VDefinicionesGitBasico mGitB = new VDefinicionesGitBasico();
				VDefinicionesGitIntermedio mGitI = new VDefinicionesGitIntermedio();
				VDefinicionesGitAvanzado mGitA = new VDefinicionesGitAvanzado();
				// View para Ventanas SQL
				VDefinicionesSqlBasico mSqlB = new VDefinicionesSqlBasico();
				VDefinicionesSqlIntermedio mSqlI = new VDefinicionesSqlIntermedio();
				VDefinicionesSqlAvanzado mSqlA = new VDefinicionesSqlAvanzado();
				// View para Ventanas JavaScript
				VDefinicionesJavaScriptBasico mJavaScriptB = new VDefinicionesJavaScriptBasico();
				VDefinicionesJavaScriptIntermedio mJavaScriptI = new VDefinicionesJavaScriptIntermedio();
				VDefinicionesJavaScriptAvanzado mJavaScriptA = new VDefinicionesJavaScriptAvanzado();
				// View para Ventanas Java
				VDeficionesJavaBasico mJavaB = new VDeficionesJavaBasico();
				VDefinicionesJavaIntermedio mJavaI = new VDefinicionesJavaIntermedio();
				VDeficionesJavaAvanzado mJavaA = new VDeficionesJavaAvanzado();
				// View para Ventanas Linux
				VDefinicionesLinuxBasico mLinuxB = new VDefinicionesLinuxBasico();
				VDefinicionesLinuxIntermedio mLinuxI = new VDefinicionesLinuxIntermedio();
				VDefinicionesLinuxAvanzado mLinuxA = new VDefinicionesLinuxAvanzado();
				
				// View para Ventanas Git preguntas
				PnlTesGitBasico pGitB = new PnlTesGitBasico();
				PnlTestGitIntermedio pGitI = new PnlTestGitIntermedio();
				PnlTestGitAvanzado pGitA = new PnlTestGitAvanzado();
				// View para Ventanas SQL preguntas
				PnlTestSqlBasico pSqlB = new PnlTestSqlBasico();
				PnlTestSqlIntermedio pSqlI = new PnlTestSqlIntermedio();
				PnlTestSqlAvanzado pSqlA = new PnlTestSqlAvanzado();
				// View para Ventanas JavaScript preguntas
				PnlTestJavaScriptBasico pJavaScriptB = new PnlTestJavaScriptBasico();
				PnlTestJavaScriptIntermedio pJavaScriptI = new PnlTestJavaScriptIntermedio();
				PnlTestJavaScriptAvanzado pJavaScriptA = new PnlTestJavaScriptAvanzado();
				// View para Ventanas Java preguntas
				PnlTestJavaBasico pJavaB = new PnlTestJavaBasico();
				PnlTestJavaIntermedio pJavaI =  new PnlTestJavaIntermedio();
				PnlTestJavaAvanzado pJavaA = new PnlTestJavaAvanzado();
				// View para Ventanas Linux preguntas
				PnlTestLinuxBasico pLinuxB = new PnlTestLinuxBasico();
				PnlTestLinuxIntermedio pLinuxI = new PnlTestLinuxIntermedio();
				PnlTestLinuxAvanzado pLinuxA = new PnlTestLinuxAvanzado();

				VentanaListener l = new VentanaListener(vpi, vcc, vr, vf, vpl, vpd, mGitB, mGitI, mGitA, mSqlB, mSqlI,
						mSqlA, mJavaScriptB, mJavaScriptI, mJavaScriptA, mJavaB, mJavaI, mJavaA, mLinuxB, mLinuxI,
						mLinuxA, pGitB, pGitI, pGitA, pSqlB, pSqlI, pSqlA, pJavaScriptB, pJavaScriptI, pJavaScriptA,
						pJavaB, pJavaI, pJavaA, pLinuxB, pLinuxI, pLinuxA);

				vpi.setListener(l);
				vcc.setListener(l);
				vr.setListener(l);
				vpl.setListener(l);
				vpd.setListener(l);
				vf.setListener(l);

				// Ventanas Deficiones
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
				
				//Ventanas Preguntas
				pGitB.setListener(l);
				pGitI.setListener(l);
				pGitA.setListener(l);
				pJavaB.setListener(l);
				pJavaI.setListener(l);
				pJavaA.setListener(l);
				pSqlB.setListener(l);
				pSqlI.setListener(l);
				pSqlA.setListener(l);
				pJavaScriptB.setListener(l);
				pJavaScriptI.setListener(l);
				pJavaScriptA.setListener(l);
				pLinuxB.setListener(l);
				pLinuxI.setListener(l);
				pLinuxA.setListener(l);

				vpi.setVisible(true);

			}
		});

	}

}
