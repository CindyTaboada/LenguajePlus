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
import view.Javascript.PnlTestJavaScriptBasico;
import view.Javascript.PnlTestJavaScriptIntermedio;
import view.Javascript.VDefinicionesJavaScriptAvanzado;
import view.Javascript.VDefinicionesJavaScriptBasico;
import view.Javascript.VDefinicionesJavaScriptIntermedio;
import view.git.VDefinicionesGitAvanzado;
import view.git.VDefinicionesGitBasico;
import view.git.VDefinicionesGitIntermedio;
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
				
				//INICIO
				VpInicio vpi = new VpInicio();
				VpCrearCuenta vcc = new VpCrearCuenta();
				
				//NIVELES
				VpNiveles vpd = new VpNiveles();
				
				//LENGUAJES
				VpLenguajes vpl = new VpLenguajes();
				
				//SQL TEMARIO+TEST
				VDefinicionesSqlBasico vsqlb= new VDefinicionesSqlBasico();
				VDefinicionesSqlIntermedio vsqli=new VDefinicionesSqlIntermedio();
				VDefinicionesSqlAvanzado vsqla= new VDefinicionesSqlAvanzado();
				PnlTestSqlBasico psqlb=new PnlTestSqlBasico();
				PnlTestSqlIntermedio psqli =new PnlTestSqlIntermedio();
				PnlTestSqlAvanzado psqla=new PnlTestSqlAvanzado();
				
				//JAVA TEMARIO + TEST
				VDeficionesJavaBasico vjb= new VDeficionesJavaBasico();
				VDefinicionesJavaIntermedio vji= new VDefinicionesJavaIntermedio();
				VDeficionesJavaAvanzado vja= new VDeficionesJavaAvanzado();
				PnlTestJavaBasico pjb=new PnlTestJavaBasico();
				PnlTestJavaIntermedio pji = new PnlTestJavaIntermedio();
				PnlTestJavaAvanzado pja=new PnlTestJavaAvanzado();
				
				//JAVASCRIPT TEMARIO+ TEST
				VDefinicionesJavaScriptBasico vjsb= new VDefinicionesJavaScriptBasico();
				VDefinicionesJavaScriptIntermedio vjsi= new VDefinicionesJavaScriptIntermedio();
				VDefinicionesJavaScriptAvanzado vjsa= new VDefinicionesJavaScriptAvanzado();
				PnlTestJavaScriptBasico pjsb=new PnlTestJavaScriptBasico();
			
				
				//GIT TEMARIO + TEST
				VDefinicionesGitBasico vgb = new VDefinicionesGitBasico();
				VDefinicionesGitIntermedio vgi = new VDefinicionesGitIntermedio();
				VDefinicionesGitAvanzado vga = new VDefinicionesGitAvanzado();
				
				//GIT
				VDefinicionesLinuxBasico vlb=new VDefinicionesLinuxBasico();
				VDefinicionesLinuxIntermedio vli = new VDefinicionesLinuxIntermedio();
				VDefinicionesLinuxAvanzado vla = new VDefinicionesLinuxAvanzado();
				
				//ESTRELLAS
				VpFelicitaciones vf=new VpFelicitaciones();
				
				//RANKING
				VpRanking vr = new VpRanking();
				
				
				VentanaListener l = new VentanaListener(vpi, vcc, vr, vpl, vpd );
				
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
