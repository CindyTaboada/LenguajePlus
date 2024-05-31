package model.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Nivel;

public class NivelPersistencia {
	static final String NOM_TABLA = "NIVEL";
	static final String ID_NIVEL= "ID_NIVEL";
	static final String TIPO_NIVEL= "TIPO_NIVEL";
	static final String PREMIO= "PREMIO";
	static final String ID_CLASE= "ID_CLASE";
	
	

private AccesoBBDD acceso; //Encargdo de establecer la conexion con la BBDD
	
	public NivelPersistencia() {
		acceso= new AccesoBBDD();
	}
	
    public int insertarNivel(int idNivel, String tipoNivel, String premio, int idClase) {
        String query = "INSERT INTO " + NOM_TABLA 
        		+ " (" + ID_NIVEL + ", " + TIPO_NIVEL
        		+ ", " + PREMIO + ", " + ID_CLASE 
        		+ ") VALUES (?, ?, ?, ?)";

        
        Connection con = null;
		PreparedStatement pstmt = null;
		int res = 0;
		
		try {
			con = acceso.getConexion();
	        pstmt.setInt(1, idNivel);
	        pstmt.setString(2, tipoNivel);
	        pstmt.setString(3, premio);
	        pstmt.setInt(4, idClase);
			
			res = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return res;
	}
	
    
    public ArrayList<Nivel> leerTodosLosNiveles() {
        ArrayList<Nivel> listaNiveles = new ArrayList<>();
        String query = "SELECT * FROM " + NOM_TABLA;
        
        Connection con = null;
        PreparedStatement stmt = null;
		ResultSet rslt = null;
		
		try {
			con = acceso.getConexion();
			stmt = con.prepareStatement(query);
			rslt = stmt.executeQuery();
  
            while (rslt.next()) {
                listaNiveles.add(new Nivel(
				                   rslt.getInt(ID_NIVEL),
				                   rslt.getString(TIPO_NIVEL),
				                   rslt.getString(PREMIO),
				                   rslt.getInt(ID_CLASE)
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
        return listaNiveles;
    }
    
    public int actualizarNivel(int idNivel, String tipoNivel, String premio, int idClase) {
        String query = "UPDATE " + NOM_TABLA + " SET " + TIPO_NIVEL 
								        		 		+ PREMIO+ " = ?, " 
								        		 		+ ID_CLASE + " = ?, "
					+ " WHERE "+ ID_NIVEL + " = ?";
        
		Connection con = null;
		PreparedStatement pstmt = null;
		int res = 0;
        
        try {
			con = acceso.getConexion();
			pstmt = con.prepareStatement(query);
			
	        pstmt.setString(1, tipoNivel);
	        pstmt.setString(2, premio);
	        pstmt.setInt(3, idClase);
	        pstmt.setInt(4, idNivel);
	
			res = pstmt.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return res;
    }
    public int eliminarNivel(int idNivel) {
        String query = "DELETE FROM " + NOM_TABLA 
        		+ " WHERE " + ID_NIVEL + " = ?";
        
        
        Connection con = null;
		PreparedStatement pstmt = null;
		int res = 0;
		
		try {
			con = acceso.getConexion();
			
			pstmt = con.prepareStatement(query);
		    pstmt.setInt(1, idNivel);
			
			res = pstmt.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return res;
    }
    
    
}
