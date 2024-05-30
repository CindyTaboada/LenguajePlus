package model.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClasePersistencia {
	static final String NOM_TABLA = "CLASE";
	static final String ID_CLASE = "ID_CLASE";
	static final String LECCION = "LECCION";
	static final String PREGUNTAS = "PREGUNTAS";
	static final String RESPUESTAS = "RESPUESTAS";
	static final String ID_LENGUAJE = "ID_LENGUAJE";

	private AccesoBBDD acceso; // Encargdo de establecer la conexion con la BBDD

	public ClasePersistencia() {
		acceso = new AccesoBBDD();
	}

	
	public int actualizarClase(int idClase, String leccion, String preguntas, String respuestas, int idLenguaje){
		int res = 0;
		
		String query = "UPDATE " + NOM_TABLA + " SET " + LECCION
											 + PREGUNTAS + " = ?, "  
											 + RESPUESTAS + " = ?, " 
											 + ID_LENGUAJE + " = ?, " 
					 + "WHERE " + ID_CLASE + " = ?";
		
		Connection con =null;
		PreparedStatement pstmt=null;
		
		try  {
			con= acceso.getConexion();
			
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, leccion);
			pstmt.setString(2, preguntas);
			pstmt.setString(3, respuestas);
			pstmt.setInt(4, idLenguaje);
			pstmt.setInt(5, idClase);
			
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
	
    public int eliminarClase(int idClase) {
    	int res = 0;
    	
        String query = "DELETE FROM " + NOM_TABLA 
        				+ " WHERE " + ID_CLASE + " = ?";
        
         
        Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = acceso.getConexion();
			
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, idClase);
			
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
