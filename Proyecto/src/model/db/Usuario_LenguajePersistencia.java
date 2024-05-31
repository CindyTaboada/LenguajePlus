package model.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.UsuarioLenguaje;

public class Usuario_LenguajePersistencia {
	static final String NOM_TABLA = "USUARIO_LENGUAJE";
	static final String ID_LENGUAJE= "ID_LENGUAJE";
	static final String ID_USUARIO= "ID_USUARIO";
	

private AccesoBBDD acceso; //Encargdo de establecer la conexion con la BBDD
	
	public Usuario_LenguajePersistencia() {
		acceso= new AccesoBBDD();
	}
	 public ArrayList<UsuarioLenguaje> leerTodasLasRelaciones() {
	        ArrayList<UsuarioLenguaje> relaciones = new ArrayList<>();
	        String query = "SELECT * FROM " + NOM_TABLA;
	        
	        Connection con = null;
	        PreparedStatement stmt = null;
			ResultSet rslt = null;
			
			try {
				con = acceso.getConexion();
				stmt = con.prepareStatement(query);
				rslt = stmt.executeQuery();
				
            while (rslt.next()) {
                relaciones.add(new UsuarioLenguaje(
					                    rslt.getInt(ID_USUARIO),
					                    rslt.getInt(ID_LENGUAJE)));
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
