package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;

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
	private PnlTestJavaIntermedio pJavaB;
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

	public VentanaListener(VpInicio vpi, VpCrearCuenta vcc, VpRanking vr,
			VpLenguajes vpl, VpNiveles vpd) {
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
		mSqlB = new VDefinicionesSqlBasico();
		mSqlI = new VDefinicionesSqlIntermedio();
		mSqlA = new VDefinicionesSqlAvanzado();
		mGitB = new VDefinicionesGitBasico();
		mGitI = new VDefinicionesGitIntermedio();
		mGitA = new VDefinicionesGitAvanzado();
		mJavaB = new VDeficionesJavaBasico();
		mJavaI = new VDefinicionesJavaIntermedio();
		mJavaA = new VDeficionesJavaAvanzado();
		mJavaScriptB = new VDefinicionesJavaScriptBasico();
		mJavaScriptI = new VDefinicionesJavaScriptIntermedio();
		mJavaScriptA = new VDefinicionesJavaScriptAvanzado();
		mLinuxB = new VDefinicionesLinuxBasico();
		mLinuxI = new VDefinicionesLinuxIntermedio();
		mLinuxA = new VDefinicionesLinuxAvanzado();

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
	            }else if (e.getSource().equals(vr.getBtnConsultar())) {
	                String selectedOption = (String) vr.getComboBRanking().getSelectedItem();
	                if (selectedOption.equals("TOP 10 N1")) {
	                    cargarRanking("10"); 
	                } else if (selectedOption.equals("TODAS")) {
	                    cargarRanking("TODAS");
	                }
	            }
	        }
		}
	}


	private void cargarRanking(String filtro) {
        ArrayList<Ranking> listaRanking = rp.consultarPilotos(filtro);
        vr.cargarTabla(listaRanking);
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
