package model.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.ClaseNivel;
import model.Nivel;

public class Clase_NivelPersistencia {
	static final String NOM_TABLA = "CLASE_NIVEL";
    static final String ID_CLASE = "ID_CLASE";
    static final String ID_NIVEL = "ID_NIVEL";
	

private AccesoBBDD acceso; //Encargado de establecer la conexion con la BBDD
	
	public Clase_NivelPersistencia() {
		acceso= new AccesoBBDD();
	}
	
    public ArrayList<ClaseNivel> leerTodasLasRelaciones() {
        ArrayList<ClaseNivel> relaciones = new ArrayList<>();
        String query = "SELECT * FROM " + NOM_TABLA;
        

            Connection con = null;
            PreparedStatement stmt = null;
    		ResultSet rslt = null;
    		
    		try {
    			con = acceso.getConexion();
    			stmt = con.prepareStatement(query);
    			rslt = stmt.executeQuery();
      
                while (rslt.next()) {
                        relaciones.add(new ClaseNivel(
                            rslt.getInt(ID_CLASE),
                            rslt.getInt(ID_NIVEL)
                        ));
                }
    		} catch (ClassNotFoundException | SQLException e) {
    			e.printStackTrace();
    			
    		} finally {
    			try {
    				if (stmt != null) stmt.close();
    				if (con != null) con.close();
    			} catch (SQLException e) {
    				e.printStackTrace();
    			}
    		}
        return relaciones;
    }
    


	
}
