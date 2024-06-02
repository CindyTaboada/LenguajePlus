package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import view.sql.VDefinicionesSqlBasico;
import view.sql.VDefinicionesSqlIntermedio;
import view.sql.VDefinicionesSqlAvanzado;
import view.git.VDefinicionesGitBasico;
import view.git.VDefinicionesGitIntermedio;
import view.git.VDefinicionesGitAvanzado;
import view.Java.VDeficionesJavaBasico;
import view.Java.VDefinicionesJavaIntermedio;
import view.Java.VDeficionesJavaAvanzado;
import view.Javascript.VDefinicionesJavaScriptBasico;
import view.Javascript.VDefinicionesJavaScriptIntermedio;
import view.Javascript.VDefinicionesJavaScriptAvanzado;
import view.linux.VDefinicionesLinuxBasico;
import view.linux.VDefinicionesLinuxIntermedio;
import view.linux.VDefinicionesLinuxAvanzado;
import model.FuenteDatos;
import model.Ranking;
import model.Usuario;
import model.db.ClasePersistencia;
import model.db.Clase_NivelPersistencia;
import model.db.LenguajePersistencia;
import model.db.NivelPersistencia;
import model.db.RankingPersistencia;
import model.db.UsuarioPersistencia;
import model.db.Usuario_LenguajePersistencia;
import view.VpNiveles;
import view.VpLenguajes;
import view.VpCrearCuenta;
import view.VpFelicitaciones;
import view.VpInicio;
import view.VpRanking;
import view.Java.VDeficionesJavaAvanzado;
import view.Java.VDeficionesJavaBasico;
import view.Java.VDefinicionesJavaIntermedio;
import view.Java.PnlTestJavaAvanzado;
import view.Java.PnlTestJavaBasico;
import view.Java.PnlTestJavaIntermedio;
import view.git.VDefinicionesGitAvanzado;
import view.git.VDefinicionesGitBasico;
import view.git.VDefinicionesGitIntermedio;
import view.git.PnlTestGitAvanzado;
import view.git.PnlTesGitBasico;
import view.git.PnlTestGitIntermedio;
import view.Javascript.VDefinicionesJavaScriptAvanzado;
import view.Javascript.VDefinicionesJavaScriptBasico;
import view.Javascript.VDefinicionesJavaScriptIntermedio;
import view.Javascript.PnlTestJavaScriptAvanzado;
import view.Javascript.PnlTestJavaScriptBasico;
import view.Javascript.PnlTestJavaScriptIntermedio;
import view.linux.VDefinicionesLinuxAvanzado;
import view.linux.VDefinicionesLinuxBasico;
import view.linux.VDefinicionesLinuxIntermedio;
import view.linux.PnlTestLinuxAvanzado;
import view.linux.PnlTestLinuxBasico;
import view.linux.PnlTestLinuxIntermedio;
import view.sql.VDefinicionesSqlAvanzado;
import view.sql.VDefinicionesSqlBasico;
import view.sql.VDefinicionesSqlIntermedio;
import view.sql.PnlTestSqlAvanzado;
import view.sql.PnlTestSqlBasico;
import view.sql.PnlTestSqlIntermedio;

public class VentanaListener implements ActionListener {

	
	
	private VpInicio vpi;
	private VpCrearCuenta vcc;
	private VpRanking vr;
	private VpLenguajes vpl;
	private VpNiveles vpd;
	// private FuenteDatos datos;
	private Clase_NivelPersistencia cnp;
	private ClasePersistencia cp;
	private LenguajePersistencia lp;
	private NivelPersistencia np;
	private RankingPersistencia rp;
	private Usuario_LenguajePersistencia ulp;
	private UsuarioPersistencia up;
	// SQL Views
	private VDefinicionesSqlBasico mSqlB;
	private VDefinicionesSqlIntermedio mSqlI;
	private VDefinicionesSqlAvanzado mSqlA;
	private PnlTestSqlBasico pSqlB;
	private PnlTestSqlIntermedio pSqlI;
	private PnlTestSqlAvanzado pSqlA;
	// Git Views
	private VDefinicionesGitBasico mGitB;
	private VDefinicionesGitIntermedio mGitI;
	private VDefinicionesGitAvanzado mGitA;
	private PnlTesGitBasico pGitB;
	private PnlTestGitIntermedio pGitI;
	private PnlTestGitAvanzado pGitA;
	// Java Views

	private VDeficionesJavaBasico mJavaB;
	private VDefinicionesJavaIntermedio mJavaI;
	private VDeficionesJavaAvanzado mJavaA;
	private PnlTestJavaBasico pJavaB;
	private PnlTestJavaIntermedio pJavaI;
	private PnlTestJavaAvanzado pJavaA;
	
	// JavaScript Views
	private VDefinicionesJavaScriptBasico mJavaScriptB;
	private VDefinicionesJavaScriptIntermedio mJavaScriptI;
	private VDefinicionesJavaScriptAvanzado mJavaScriptA;
	private PnlTestJavaScriptBasico pJavaScriptB;
	private PnlTestJavaScriptIntermedio pJavaScriptI;
	private PnlTestJavaScriptAvanzado pJavaScriptA;
	// Linux Views
	private VDefinicionesLinuxBasico mLinuxB;
	private VDefinicionesLinuxIntermedio mLinuxI;
	private VDefinicionesLinuxAvanzado mLinuxA;
	private PnlTestLinuxBasico pLinuxB;
	private PnlTestLinuxIntermedio pLinuxI;
	private PnlTestLinuxAvanzado pLinuxA;

	String lenguaje = "";

	public VentanaListener(VpInicio vpi, VpCrearCuenta vcc, VpRanking vr, VpFelicitaciones vf, VpLenguajes vpl, 
			VpNiveles vpd, VDefinicionesGitBasico mGitB, VDefinicionesGitIntermedio mGitI, 
			VDefinicionesGitAvanzado mGitA, VDefinicionesSqlBasico mSqlB, VDefinicionesSqlIntermedio 
			mSqlI, VDefinicionesSqlAvanzado mSqlA, VDefinicionesJavaScriptBasico mJavaScriptB, 
			VDefinicionesJavaScriptIntermedio mJavaScriptI, VDefinicionesJavaScriptAvanzado mJavaScriptA, 
			VDeficionesJavaBasico mJavaB, VDefinicionesJavaIntermedio mJavaI, VDeficionesJavaAvanzado mJavaA, 
			VDefinicionesLinuxBasico mLinuxB, VDefinicionesLinuxIntermedio mLinuxI, 
			VDefinicionesLinuxAvanzado mLinuxA) {

		this.vpi = vpi;
		this.vcc = vcc;
		this.vr = vr;
		this.vpl = vpl;
		this.vpd = vpd;
		this.mGitB = mGitB;
	    this.mGitI = mGitI;
	    this.mGitA = mGitA;
	    this.mSqlB = mSqlB;
	    this.mSqlI = mSqlI;
	    this.mSqlA = mSqlA;
	    this.mJavaScriptB = mJavaScriptB;
	    this.mJavaScriptI = mJavaScriptI;
	    this.mJavaScriptA = mJavaScriptA;
	    this.mJavaB = mJavaB;
	    this.mJavaI = mJavaI;
	    this.mJavaA = mJavaA;
	    this.mLinuxB = mLinuxB;
	    this.mLinuxI = mLinuxI;
	    this.mLinuxA = mLinuxA;
		
		
		cnp = new Clase_NivelPersistencia();
		cp = new ClasePersistencia();
		lp = new LenguajePersistencia();
		np = new NivelPersistencia();
		rp = new RankingPersistencia();
		ulp = new Usuario_LenguajePersistencia();
		up = new UsuarioPersistencia();

		

		pGitB = new PnlTesGitBasico();
		pGitI = new PnlTestGitIntermedio();
		pGitA = new PnlTestGitAvanzado();
		
		pSqlB = new PnlTestSqlBasico();
		pSqlI = new PnlTestSqlIntermedio();
		pSqlA = new PnlTestSqlAvanzado();
		
		pJavaScriptB = new PnlTestJavaScriptBasico();
		pJavaScriptI = new PnlTestJavaScriptIntermedio();
		pJavaScriptA = new PnlTestJavaScriptAvanzado();
		
		pJavaB = new PnlTestJavaBasico();
		pJavaI = new PnlTestJavaIntermedio();
		pJavaA = new PnlTestJavaAvanzado();
	
		pLinuxB = new PnlTestLinuxBasico();		
		pLinuxI = new PnlTestLinuxIntermedio();
		pLinuxA = new PnlTestLinuxAvanzado();
		


	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			if (e.getSource().equals(vpi.getBtnIniciarSesion())) {
				iniciarSesion();
				vpi.hacerVisible();
			} else if (e.getSource().equals(vpi.getBtnCrearCuenta())) {
				vcc.hacerVisible();
				vpl.hacerVisible();
			} else if (e.getSource().equals(vcc.getBtnCancelarCrearCuenta())) {
				vcc.setVisible(false);
				vpi.setVisible(true);
			} else if (e.getSource().equals(vcc.getBtnConfirmarCrearCuenta())) {
				crearCuenta();
				vpl.hacerVisible();
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
				openMaterialWindow("Beginner");
			} else if (e.getSource().equals(vpd.getBtnIntermediate())) {
				openMaterialWindow("Intermediate");
			} else if (e.getSource().equals(vpd.getBtnAvance())) {
				openMaterialWindow("Advanced");
			} else if (e.getSource().equals(vr.getBtnSalirRanking())) {
				vr.setVisible(false);
			} else if (e.getSource().equals(vr.getBtnConsultar())) {
				String selectedOption = (String) vr.getComboBRanking().getSelectedItem();
				if (selectedOption.equals("TOP 10 N1")) {
					cargarRanking("10");
				} else if (selectedOption.equals("TODAS")) {
					cargarRanking("TODAS");
				}
			} else if (e.getSource().equals(mGitB.getBtnPrueba())) {
				mGitB.cargarPanel(pGitB);
			} else if (e.getSource().equals(mGitI.getBtnPrueba())) {
				mGitI.cargarPanel(pGitI);
			} else if (e.getSource().equals(mGitA.getBtnPrueba())) {
				mGitA.cargarPanel(pGitA);
			} else if (e.getSource().equals(mSqlB.getBtnPrueba())) {
				mSqlB.cargarPanel(pSqlB);
			} else if (e.getSource().equals(mSqlI.getBtnPrueba())) {
				mSqlI.cargarPanel(pSqlI);
			} else if (e.getSource().equals(mSqlA.getBtnPrueba())) {
				mSqlA.cargarPanel(pSqlA);
	            
	        }
		}
	}


	private void cargarRanking(String filtro) {
        ArrayList<Ranking> listaRanking = rp.consultarPilotos(filtro);
        vr.cargarTabla(listaRanking);
    }

	private void crearCuenta() {
		String nombre = vcc.getTxtNombre().getText();
        String apellido1 = vcc.getTxtApellido1().getText();
        String apellido2 = vcc.getTxtApellido2().getText();
        String email = vcc.getTxtEmail().getText();
        String pssw = new String(vcc.getPwdConstrasenia().getPassword());
        String confirmarPsswd = new String(vcc.getPwdConfirmarContrasenia().getPassword());

        if (nombre.isBlank()) {
            mostrarError("El nombre es un dato obligatorio");
        } else if (apellido1.isBlank()) {
            mostrarError("El primer apellido es un dato obligatorio");
        } else if (email.isBlank()) {
            mostrarError("El email es un dato obligatorio");
        } else if (!emailValido(email)) {
            mostrarError("No es una dirección de correo válida. Ejemplo: info@lenguajeplus.com");
        } else if (up.emailRepe(email)) {
            mostrarError("El email ya existe");
        } else if (pssw.isBlank()) {
            mostrarError("Introduce una contraseña");
        } else if (pssw.length() > UsuarioPersistencia.TAM_CONTRASENIA) {
            mostrarError("La contraseña no puede tener más de " + UsuarioPersistencia.TAM_CONTRASENIA + " caracteres");
        } else if (confirmarPsswd.isBlank()) {
            mostrarError("Vuelve a escribir la contraseña");
        } else if (!pssw.equals(confirmarPsswd)) {
            mostrarError("Las contraseñas no coinciden");
        } else {
            Usuario usuario = new Usuario(0, nombre, apellido1, apellido2, 0, email, pssw);
            up.registrarUsuario(usuario);
            mensajeInfo("¡Enhorabuena! Registro completado!");
        }
    }



	private Usuario iniciarSesion() {
	       String email = vpi.getTxtEmail().getText();
	        String pssw = new String(vpi.getPwdContrasenia().getPassword());

	    if (email.isBlank()) {
	        mostrarError("Introduce un email");
	    } else if (pssw.isBlank()) {
	        mostrarError("Introduce una contraseña");
	    } else if (pssw.length() > UsuarioPersistencia.TAM_CONTRASENIA) {
	        mostrarError("La contraseña no puede tener más de " + UsuarioPersistencia.TAM_CONTRASENIA + " caracteres");
	    } else {
	        boolean emailOk = up.existeUsuario(email.trim());
	        if (!emailOk) {
	            mostrarError("El usuario no existe. Crea una cuenta");
	        } else {
	            boolean psswOk = up.contraCorrecta(email.trim(), pssw);
	            if (!psswOk) {
	                mostrarError("Contraseña incorrecta");
	            } else {
	                return up.obtenerUsuario(email.trim());
	            }
	        }
	    }
	    return null; // Devolver null si la autenticación falla
	}




	private void mostrarError(String string) {
		JOptionPane.showMessageDialog(vpi, string, "Error de datos", JOptionPane.ERROR_MESSAGE);
		
	}
	
	private void mensajeInfo(String string) {
		JOptionPane.showMessageDialog(vpi, string, "Mensaje info", JOptionPane.INFORMATION_MESSAGE);
		
	}

	
    private boolean emailValido(String email) {
        String regex = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}";
        return email.matches(regex);
    }
    
	private void openMaterialWindow(String level) {
		switch (lenguaje) {
		case "Sql":
			openSqlMaterialWindow(level);
			break;
		case "Git":
			openGitMaterialWindow(level);
			break;
		case "Java":
			openJavaMaterialWindow(level);
			break;
		case "JavaScript":
			openJavaScriptMaterialWindow(level);
			break;
		case "Linux":
			openLinuxMaterialWindow(level);
			break;
		default:
			JOptionPane.showMessageDialog(vpd, "Lenguaje incorrecto", "ERROR", JOptionPane.ERROR_MESSAGE);
			break;
		}
	}

	private void openSqlMaterialWindow(String level) {
		switch (level) {
		case "Beginner":
			vpd.setVisible(false);
			mSqlB.setVisible(true);
			break;
		case "Intermediate":
			vpd.setVisible(false);
			mSqlI.setVisible(true);
			break;
		case "Advanced":
			vpd.setVisible(false);
			mSqlA.setVisible(true);
			break;
		default:
			JOptionPane.showMessageDialog(vpd, "Nivel incorrecto", "ERROR", JOptionPane.ERROR_MESSAGE);
			break;
		}
	}

	private void openGitMaterialWindow(String level) {
		switch (level) {
		case "Beginner":
			vpd.setVisible(false);
			mGitB.setVisible(true);
			break;
		case "Intermediate":
			vpd.setVisible(false);
			mGitI.setVisible(true);
			break;
		case "Advanced":
			vpd.setVisible(false);
			mGitA.setVisible(true);
			break;
		default:
			JOptionPane.showMessageDialog(vpd, "Nivel incorrecto", "ERROR", JOptionPane.ERROR_MESSAGE);
			break;
		}
	}

	private void openJavaMaterialWindow(String level) {
		switch (level) {
		case "Beginner":
			vpd.setVisible(false);
			mJavaB.setVisible(true);
			break;
		case "Intermediate":
			vpd.setVisible(false);
			mJavaI.setVisible(true);
			break;
		case "Advanced":
			vpd.setVisible(false);
			mJavaA.setVisible(true);
			break;
		default:
			JOptionPane.showMessageDialog(vpd, "Nivel incorrecto", "ERROR", JOptionPane.ERROR_MESSAGE);
			break;
		}
	}

	private void openJavaScriptMaterialWindow(String level) {
		switch (level) {
		case "Beginner":
			vpd.setVisible(false);
			mJavaScriptB.setVisible(true);
			break;
		case "Intermediate":
			vpd.setVisible(false);
			mJavaScriptI.setVisible(true);
			break;
		case "Advanced":
			vpd.setVisible(false);
			mJavaScriptA.setVisible(true);
			break;
		default:
			JOptionPane.showMessageDialog(vpd, "Nivel incorrecto", "ERROR", JOptionPane.ERROR_MESSAGE);
			break;
		}
	}

	private void openLinuxMaterialWindow(String level) {
		switch (level) {
		case "Beginner":
			vpd.setVisible(false);
			mLinuxB.setVisible(true);
			break;
		case "Intermediate":
			vpd.setVisible(false);
			mLinuxI.setVisible(true);
			break;
		case "Advanced":
			vpd.setVisible(false);
			mLinuxA.setVisible(true);
			break;
		default:
			JOptionPane.showMessageDialog(vpd, "Nivel incorrecto", "ERROR", JOptionPane.ERROR_MESSAGE);
			break;
		}
	}

}
