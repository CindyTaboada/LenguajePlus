package model.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import model.ClaseQnA;

public class ClasePersistencia {
    static final String NOM_TABLA = "CLASE";
    static final String ID_CLASE = "ID_CLASE";
    static final String LECCION = "LECCION";
    static final String PREGUNTAS = "PREGUNTAS";
    static final String RESPUESTAS = "RESPUESTAS";
    static final String ID_LENGUAJE = "ID_LENGUAJE";

    private AccesoBBDD acceso; // Encargado de establecer la conexion con la BBDD

    public ClasePersistencia() {
        acceso = new AccesoBBDD();
    }

    public ClaseQnA getQuestion(int idLenguaje, int leccion) {
        ClaseQnA claseQnA = null;
        String query = "SELECT * FROM " + NOM_TABLA + " WHERE " + ID_LENGUAJE + " = ? AND " + LECCION + " = ?";

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            con = acceso.getConexion();
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, idLenguaje);
            pstmt.setInt(2, leccion);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                String preguntas = rs.getString(PREGUNTAS);
                String respuestas = rs.getString(RESPUESTAS);
                claseQnA = new ClaseQnA(rs.getInt(ID_CLASE), preguntas, respuestas);
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return claseQnA;
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
