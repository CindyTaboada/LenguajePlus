package model.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LenguajePersistencia {
	static final String NOM_TABLA = "LENGUAJE";
	static final String ID_LENGUAJE = "ID_LENGUAJE";
	static final String TIPO_LENGUAJE = "TIPO_LENGUAJE";

	private AccesoBBDD acceso; // Encargdo de establecer la conexion con la BBDD

	public LenguajePersistencia() {
		acceso = new AccesoBBDD();
	}

	public int insertarLenguaje(int idLenguaje, String tipoLenguaje) {
		String query = "INSERT INTO " + NOM_TABLA + " (" + ID_LENGUAJE + ", " + TIPO_LENGUAJE + ") VALUES (?, ?)";

		Connection con = null;
		PreparedStatement pstmt = null;
		int res = 0;

		try {
			con = acceso.getConexion();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, idLenguaje);
			pstmt.setString(2, tipoLenguaje);

			res = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return res;
	}

	public int actualizarLenguaje(int idLenguaje, String tipoLenguaje) {
		int res = 0;

		String query = "UPDATE " + NOM_TABLA + " SET " + TIPO_LENGUAJE + " = ? WHERE " + ID_LENGUAJE + " = ?";

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = acceso.getConexion();

			pstmt = con.prepareStatement(query);
			pstmt.setString(1, tipoLenguaje);
			pstmt.setInt(2, idLenguaje);

			res = pstmt.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return res;
	}

}
