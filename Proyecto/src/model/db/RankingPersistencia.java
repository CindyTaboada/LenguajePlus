package model.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Usuario;
import view.VentanaRanking;

public class RankingPersistencia {
	static final String NOM_TABLA = "RANKING";
	static final String ID_RANKING= "ID_RANKING";
	static final String ID_USUARIO= "ID_USUARIO";
	static final String ID_NIVEL= "ID_NIVEL";
	static final String POSICIONES= "POSICIONES";

	

private AccesoBBDD acceso; //Encargdo de establecer la conexion con la BBDD
	
	public RankingPersistencia() {
		acceso= new AccesoBBDD();
	}
	
	public ArrayList<Usuario> consultarPilotos(String posicion) {
		ArrayList<Usuario> listaUsuario = new ArrayList<>();
		
		String query = "SELECT * FROM " + NOM_TABLA; 
		
		// si la posición que nos llega como parámetro es distinta de TODAS
		// completamos la sentencia con la claúsula WHERE
		if (!posicion.equals(VentanaRanking.CMB_SIN_FILTRO)) {
			query += " WHERE " + POSICIONES + " = ?";
		}
		
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rslt = null;
		
		try {
			con = acceso.getConexion();
			
			stmt = con.prepareStatement(query);
			
			// si la posicion que nos llega como parámetro es distinta de TODAS
			// completamos el PreparedStatement
			if (!posicion.equals(VentanaRanking.CMB_SIN_FILTRO)) {
				stmt.setString(1, posicion);
			}
			
			rslt = stmt.executeQuery();
			
			while (rslt.next()) {
				listaUsuario.add(new Usuario(rslt.getInt(1), 
											rslt.getString(2), 
											rslt.getString(3), 
											rslt.getString(4),
											rslt.getInt(5),
											rslt.getString(6),
											rslt.getString(7)));
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rslt != null) rslt.close();
				if (stmt != null) stmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return listaUsuario;
	}
	
}
