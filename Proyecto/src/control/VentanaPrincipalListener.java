package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import view.sql.MaterialSqlBasico;
import view.sql.MaterialSqlIntermedio;
import view.sql.MaterialSqlAvanzado;
import view.git.MaterialGitBasico;
import view.git.MaterialGitIntermedio;
import view.git.MaterialGitAvanzado;
import view.Java.MaterialJavaBasico;
import view.Java.MaterialJavaIntermedio;
import view.Java.MaterialJavaAvanzado;
import view.Javascript.MaterialJavaScriptBasico;
import view.Javascript.MaterialJavaScriptIntermedio;
import view.Javascript.MaterialJavaScriptAvanzado;
import view.linux.MaterialLinuxBasico;
import view.linux.MaterialLinuxIntermedio;
import view.linux.MaterialLinuxAvanzado;
import model.FuenteDatos;
import model.db.ClasePersistencia;
import model.db.Clase_NivelPersistencia;
import model.db.LenguajePersistencia;
import model.db.NivelPersistencia;
import model.db.RankingPersistencia;
import model.db.UsuarioPersistencia;
import model.db.Usuario_LenguajePersistencia;
import view.VPrincipalNivel;
import view.VPrincipalLenguaje;
import view.VentanaCrearCuenta;
import view.VentanaPrincipalInicio;
import view.VentanaRanking;
import view.Java.MaterialJavaAvanzado;
import view.Java.MaterialJavaBasico;
import view.Java.MaterialJavaIntermedio;
import view.Java.PreguntasJavaAvanzado;
import view.Java.PreguntasJavaBasico;
import view.Java.PreguntasJavaIntermedio;
import view.git.MaterialGitAvanzado;
import view.git.MaterialGitBasico;
import view.git.MaterialGitIntermedio;
import view.git.PreguntasGitAvanzado;
import view.git.PreguntasGitBasico;
import view.git.PreguntasGitIntermedio;
import view.Javascript.MaterialJavaScriptAvanzado;
import view.Javascript.MaterialJavaScriptBasico;
import view.Javascript.MaterialJavaScriptIntermedio;
import view.Javascript.PreguntasJavaScriptAvanzado;
import view.Javascript.PreguntasJavaScriptBasico;
import view.Javascript.PreguntasJavaScriptIntermedio;
import view.linux.MaterialLinuxAvanzado;
import view.linux.MaterialLinuxBasico;
import view.linux.MaterialLinuxIntermedio;
import view.linux.PreguntasLinuxAvanzado;
import view.linux.PreguntasLinuxBasico;
import view.linux.PreguntasLinuxIntermedio;
import view.sql.MaterialSqlAvanzado;
import view.sql.MaterialSqlBasico;
import view.sql.MaterialSqlIntermedio;
import view.sql.PreguntasSqlAvanzado;
import view.sql.PreguntasSqlBasico;
import view.sql.PreguntasSqlIntermedio;

public class VentanaPrincipalListener implements ActionListener {

	private VentanaPrincipalInicio vpi;
	private VentanaCrearCuenta vcc;
	private VentanaRanking vr;
	private VPrincipalLenguaje vpl;
	private VPrincipalNivel vpd;
	// private FuenteDatos datos;
	private Clase_NivelPersistencia cnp;
	private ClasePersistencia cp;
	private LenguajePersistencia lp;
	private NivelPersistencia np;
	private RankingPersistencia rp;
	private Usuario_LenguajePersistencia ulp;
	private UsuarioPersistencia up;
	// SQL Views
	private MaterialSqlBasico mSqlB;
	private MaterialSqlIntermedio mSqlI;
	private MaterialSqlAvanzado mSqlA;
	private PreguntasSqlBasico pSqlB;
	private PreguntasSqlIntermedio pSqlI;
	private PreguntasSqlAvanzado pSqlA;
	// Git Views
	private MaterialGitBasico mGitB;
	private MaterialGitIntermedio mGitI;
	private MaterialGitAvanzado mGitA;
	private PreguntasGitBasico pGitB;
	private PreguntasGitIntermedio pGitI;
	private PreguntasGitAvanzado pGitA;
	// Java Views
	private MaterialJavaBasico mJavaB;
	private MaterialJavaIntermedio mJavaI;
	private MaterialJavaAvanzado mJavaA;
	private PreguntasJavaIntermedio pJavaB;
	private PreguntasJavaIntermedio pJavaI;
	private PreguntasJavaAvanzado pJavaA;
	
	// JavaScript Views
	private MaterialJavaScriptBasico mJavaScriptB;
	private MaterialJavaScriptIntermedio mJavaScriptI;
	private MaterialJavaScriptAvanzado mJavaScriptA;
	private PreguntasJavaScriptBasico pJavaScriptB;
	private PreguntasJavaScriptIntermedio pJavaScriptI;
	private PreguntasJavaScriptAvanzado pJavaScriptA;
	// Linux Views
	private MaterialLinuxBasico mLinuxB;
	private MaterialLinuxIntermedio mLinuxI;
	private MaterialLinuxAvanzado mLinuxA;
	private PreguntasLinuxBasico pLinuxB;
	private PreguntasLinuxIntermedio pLinuxI;
	private PreguntasLinuxAvanzado pLinuxA;

	String lenguaje = "";

	public VentanaPrincipalListener(VentanaPrincipalInicio vpi, VentanaCrearCuenta vcc, VentanaRanking vr,
			VPrincipalLenguaje vpl, VPrincipalNivel vpd) {
		this.vpi = vpi;
		this.vcc = vcc;
		this.vr = vr;
		this.vpl = vpl;
		this.vpd = vpd;
		// datos = new FuenteDatos();
		cnp = new Clase_NivelPersistencia();
		cp = new ClasePersistencia();
		lp = new LenguajePersistencia();
		np = new NivelPersistencia();
		rp = new RankingPersistencia();
		ulp = new Usuario_LenguajePersistencia();
		up = new UsuarioPersistencia();

		// Instantiate the view classes
		mSqlB = new MaterialSqlBasico();
		mSqlI = new MaterialSqlIntermedio();
		mSqlA = new MaterialSqlAvanzado();
		mGitB = new MaterialGitBasico();
		mGitI = new MaterialGitIntermedio();
		mGitA = new MaterialGitAvanzado();
		mJavaB = new MaterialJavaBasico();
		mJavaI = new MaterialJavaIntermedio();
		mJavaA = new MaterialJavaAvanzado();
		mJavaScriptB = new MaterialJavaScriptBasico();
		mJavaScriptI = new MaterialJavaScriptIntermedio();
		mJavaScriptA = new MaterialJavaScriptAvanzado();
		mLinuxB = new MaterialLinuxBasico();
		mLinuxI = new MaterialLinuxIntermedio();
		mLinuxA = new MaterialLinuxAvanzado();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			if (e.getSource().equals(vpi.getBtnIniciarSesion())) {
				iniciarSesion();
				vpi.setVisible(false);
				vpl.setVisible(true);
			} else if (e.getSource().equals(vpi.getBtnCrearCuenta())) {
				// No conseguimos que funcione con JPanels a si que hicimos todo JFrames
				// VentanaPrincipalInicio.ACT_CMN_BTN_CREARCUENTA
				// vpi.cargarPanel(vcc);
				crearCuenta();
				vpi.setVisible(false);
				vcc.setVisible(true);
			} else if (e.getSource().equals(vcc.getBtnCancelarCrearCuenta())) {
				vpi.setVisible(true);
				vcc.setVisible(false);
			} else if (e.getSource().equals(vcc.getBtnConfirmarCrearCuenta())) {
				// esto tambien es temporal
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
			if (e.getSource() instanceof JButton) {
				if (e.getSource().equals(vpi.getBtnIniciarSesion())) {
					// esto es temporal
					vpi.setVisible(false);
					vpl.setVisible(true);
				} else if (e.getSource().equals(vpi.getBtnCrearCuenta())) {
					// VentanaPrincipalInicio.ACT_CMN_BTN_CREARCUENTA
					// vpi.cargarPanel(vcc);
					vpi.setVisible(false);
					vcc.setVisible(true);
				} else if (e.getSource().equals(vcc.getBtnCancelarCrearCuenta())) {
					vpi.setVisible(true);
					vcc.setVisible(false);
				} else if (e.getSource().equals(vcc.getBtnConfirmarCrearCuenta())) {
					// esto tambien es temporal
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
					openMaterialWindow("Beginner");
				} else if (e.getSource().equals(vpd.getBtnIntermediate())) {
					openMaterialWindow("Intermediate");
				} else if (e.getSource().equals(vpd.getBtnAvance())) {
					openMaterialWindow("Advanced");
				} else if (e.getSource().equals(vr.getBtnSalirRanking())) {
					vr.setVisible(false);
				} else if (e.getSource().equals(mSqlB.getBtnPrueba())) {
	                pSqlB.setVisible(true);
	            } else if (e.getSource().equals(mSqlI.getBtnPrueba())) {
	                pSqlI.setVisible(true);
	            } else if (e.getSource().equals(mSqlA.getBtnPrueba())) {
	                pSqlA.setVisible(true);
	            } else if (e.getSource().equals(mGitB.getBtnPrueba())) {
	                pGitB.setVisible(true);
	            } else if (e.getSource().equals(mGitI.getBtnPrueba())) {
	                pGitI.setVisible(true);
	            } else if (e.getSource().equals(mGitA.getBtnPrueba())) {
	                pGitA.setVisible(true);
	            } else if (e.getSource().equals(mJavaB.getBtnPrueba())) {
	                pJavaB.setVisible(true);
	            } else if (e.getSource().equals(mJavaI.getBtnPrueba())) {
	                pJavaI.setVisible(true);
	            } else if (e.getSource().equals(mJavaA.getBtnPrueba())) {
	                pJavaA.setVisible(true);
	            } else if (e.getSource().equals(mJavaScriptB.getBtnPrueba())) {
	                pJavaScriptB.setVisible(true);
	            } else if (e.getSource().equals(mJavaScriptI.getBtnPrueba())) {
	                pJavaScriptI.setVisible(true);
	            } else if (e.getSource().equals(mJavaScriptA.getBtnPrueba())) {
	                pJavaScriptA.setVisible(true);
	            } else if (e.getSource().equals(mLinuxB.getBtnPrueba())) {
	                pLinuxB.setVisible(true);
	            } else if (e.getSource().equals(mLinuxI.getBtnPrueba())) {
	                pLinuxI.setVisible(true);
	            } else if (e.getSource().equals(mLinuxA.getBtnPrueba())) {
	                pLinuxA.setVisible(true);
	            }
	        }
		}
	}

	private void crearCuenta() {
		
		
	}

	private void iniciarSesion() {
			
		
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
