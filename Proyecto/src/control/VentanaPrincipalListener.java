package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
	private PreguntasJavaBasico pJavaB;
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

	public VentanaPrincipalListener(VpInicio vpi, VpCrearCuenta vcc, VpRanking vr,
			VpLenguajes vpl, VpNiveles vpd, MaterialGitBasico mGitB, MaterialGitIntermedio mGitI, MaterialGitAvanzado mGitA,
			 MaterialSqlBasico mSqlB, MaterialSqlIntermedio mSqlI, 
			MaterialSqlAvanzado mSqlA, MaterialJavaScriptBasico mJavaScriptB, 
			MaterialJavaScriptIntermedio mJavaScriptI, MaterialJavaScriptAvanzado mJavaScriptA, 
			MaterialJavaBasico mJavaB, MaterialJavaIntermedio mJavaI, MaterialJavaAvanzado mJavaA, 
			MaterialLinuxBasico mLinuxB, MaterialLinuxIntermedio mLinuxI, MaterialLinuxAvanzado mLinxA) {
		
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
	    this.mLinuxA = mLinxA;
		
		// datos = new FuenteDatos();
		cnp = new Clase_NivelPersistencia();
		cp = new ClasePersistencia();
		lp = new LenguajePersistencia();
		np = new NivelPersistencia();
		rp = new RankingPersistencia();
		ulp = new Usuario_LenguajePersistencia();
		up = new UsuarioPersistencia();

		// Instantiate the view classes
		

		pGitB = new PreguntasGitBasico();
		pGitI = new PreguntasGitIntermedio();
		pGitA = new PreguntasGitAvanzado();
		
		pSqlB = new PreguntasSqlBasico();
		pSqlI = new PreguntasSqlIntermedio();
		pSqlA = new PreguntasSqlAvanzado();
		
		pJavaScriptB = new PreguntasJavaScriptBasico();
		pJavaScriptI = new PreguntasJavaScriptIntermedio();
		pJavaScriptA = new PreguntasJavaScriptAvanzado();
		
		pJavaB = new PreguntasJavaBasico();
		pJavaI = new PreguntasJavaIntermedio();
		pJavaA = new PreguntasJavaAvanzado();
	
		
		pLinuxA = new PreguntasLinuxAvanzado();
		pLinuxI = new PreguntasLinuxIntermedio();
		pLinuxB = new PreguntasLinuxBasico();

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
			        } else if (e.getSource().equals(mJavaScriptB.getBtnPrueba())) {
			            mJavaScriptB.cargarPanel(pJavaScriptB);
			        } else if (e.getSource().equals(mJavaScriptI.getBtnPrueba())) {
			            mJavaScriptI.cargarPanel(pJavaScriptI);
			        } else if (e.getSource().equals(mJavaScriptA.getBtnPrueba())) {
			            mJavaScriptA.cargarPanel(pJavaScriptA);
			        } else if (e.getSource().equals(mJavaB.getBtnPrueba())) {
			            mJavaB.cargarPanel(pJavaB);
			        } else if (e.getSource().equals(mJavaI.getBtnPrueba())) {
			            mJavaI.cargarPanel(pJavaI);
			        } else if (e.getSource().equals(mJavaA.getBtnPrueba())) {
			            mJavaA.cargarPanel(pJavaA);
			        } else if (e.getSource().equals(mLinuxB.getBtnPrueba())) {
			            mLinuxB.cargarPanel(pLinuxB);
			        } else if (e.getSource().equals(mLinuxI.getBtnPrueba())) {
			            mLinuxI.cargarPanel(pLinuxI);
			        } else if (e.getSource().equals(mLinuxA.getBtnPrueba())) {
			            mLinuxA.cargarPanel(pLinuxA);
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
