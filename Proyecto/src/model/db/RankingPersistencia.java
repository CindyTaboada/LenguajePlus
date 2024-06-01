package model.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Ranking;
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
	
	public ArrayList<Ranking> consultarPilotos(String posicion) {
        ArrayList<Ranking> listaRanking = new ArrayList<>();

        String query = "SELECT * FROM " + NOM_TABLA;

        if (!posicion.equals("TODAS")) {
            query += " WHERE " + POSICIONES + " = ?";
        }

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rslt = null;

        try {
            con = acceso.getConexion();

            stmt = con.prepareStatement(query);

            if (!posicion.equals("TODAS")) {
                stmt.setString(1, posicion);
            }

            rslt = stmt.executeQuery();

            while (rslt.next()) {
                listaRanking.add(new Ranking(rslt.getString("usuario"),
                                             rslt.getInt("lenguaje")));
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

        return listaRanking;
    }
}
