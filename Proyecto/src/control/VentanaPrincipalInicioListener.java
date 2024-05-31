package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import model.FuenteDatos;
import model.db.ClasePersistencia;
import model.db.Clase_NivelPersistencia;
import model.db.LenguajePersistencia;
import model.db.NivelPersistencia;
import model.db.RankingPersistencia;
import model.db.UsuarioPersistencia;
import model.db.Usuario_LenguajePersistencia;
import view.VPrincipalDificultad;
import view.VPrincipalLenguaje;
import view.VentanaCrearCuenta;
import view.VentanaPrincipalInicio;
import view.VentanaRanking;

public class VentanaPrincipalInicioListener implements ActionListener {
	
	private VentanaPrincipalInicio vpi;
	private VentanaCrearCuenta vcc;
	private	VentanaRanking vr;
	private	VPrincipalLenguaje vpl;
	private	VPrincipalDificultad vpd;
	//private FuenteDatos datos;
	private Clase_NivelPersistencia cnp;
	private ClasePersistencia cp;
	private LenguajePersistencia lp;
	private NivelPersistencia np;
	private RankingPersistencia rp;
	private Usuario_LenguajePersistencia ulp;
	private UsuarioPersistencia up;
	
	String lenguaje = "";

	public VentanaPrincipalInicioListener(VentanaPrincipalInicio vpi, VentanaCrearCuenta vcc, VentanaRanking vr, VPrincipalLenguaje vpl, VPrincipalDificultad vpd) {
		this.vpi = vpi;
		this.vcc = vcc;
		this.vr = vr;
		this.vpl = vpl;
		this.vpd = vpd;
		//datos = new FuenteDatos();
		cnp = new Clase_NivelPersistencia();
		cp = new ClasePersistencia();
		lp = new LenguajePersistencia();
		np = new NivelPersistencia();
		rp = new RankingPersistencia();
		ulp = new Usuario_LenguajePersistencia();
		up = new UsuarioPersistencia();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			if (e.getSource().equals(vpi.getBtnIniciarSesion())) {
				//esto es temporal
				vpi.setVisible(false);
				vpl.setVisible(true);
			} else if (e.getSource().equals(vpi.getBtnCrearCuenta())) {
				//VentanaPrincipalInicio.ACT_CMN_BTN_CREARCUENTA
				//vpi.cargarPanel(vcc);
				vpi.setVisible(false);
				vcc.setVisible(true);
			} else if (e.getSource().equals(vcc.getBtnCancelarCrearCuenta())) {
				vpi.setVisible(true);
				vcc.setVisible(false);
			} else if (e.getSource().equals(vcc.getBtnConfirmarCrearCuenta())) {
				//esto tambien es temporal
				vpi.setVisible(true);
				vcc.setVisible(false);
			} else if (e.getSource().equals(vpl.getBtnAtras())) {
				vpl.setVisible(false);
				vpi.setVisible(true);
			} else if (e.getSource().equals(vpl.getBtnGit())) {
				vpl.setVisible(false);
				vpd.setVisible(true);
				lenguaje = "Git";
			} else if (e.getSource().equals(vpl.getBtnLinux())) {
				vpl.setVisible(false);
				vpd.setVisible(true);
				lenguaje = "Linux";
			} else if (e.getSource().equals(vpl.getBtnJava())) {
				vpl.setVisible(false);
				vpd.setVisible(true);
				lenguaje = "Java";
			} else if (e.getSource().equals(vpl.getBtnJavaScript())) {
				vpl.setVisible(false);
				vpd.setVisible(true);
				lenguaje = "JavaScript";
			} else if (e.getSource().equals(vpl.getBtnSql())) {
				vpl.setVisible(false);
				vpd.setVisible(true);
				lenguaje = "Sql";
			} else if (e.getSource().equals(vpd.getBtnAtras())) {
				vpd.setVisible(false);
				vpl.setVisible(true);
			} else if (e.getSource().equals(vpd.getBtnBeginner())) {
				switch (lenguaje) {
				case "Git":
					
					break;
				case "Linux":
					
					break;
				case "Java":
					
					break;
				case "JavaScript":
					
					break;
				case "Sql":
					
					break;
				default:
					JOptionPane.showMessageDialog(vpl, "Lenguaje incorrecto", "ERROR", JOptionPane.ERROR_MESSAGE);
					break;
				}
			} else if (e.getSource().equals(vpd.getBtnIntermediate())) {
				switch (lenguaje) {
				case "Git":
					
					break;
				case "Linux":
					
					break;
				case "Java":
					
					break;
				case "JavaScript":
					
					break;
				case "Sql":
					
					break;
				default:
					JOptionPane.showMessageDialog(vpl, "Lenguaje incorrecto", "ERROR", JOptionPane.ERROR_MESSAGE);
					break;
				}
			} else if (e.getSource().equals(vpd.getBtnAvance())) {
				switch (lenguaje) {
				case "Git":
					
					break;
				case "Linux":
					
					break;
				case "Java":
					
					break;
				case "JavaScript":
					
					break;
				case "Sql":
					
					break;
				default:
					JOptionPane.showMessageDialog(vpl, "Lenguaje incorrecto", "ERROR", JOptionPane.ERROR_MESSAGE);
					break;
				}
			} else if (e.getSource().equals(vr.getBtnSalirRanking())) {
				vr.setVisible(false);
				
			} 
		}

	}

}
