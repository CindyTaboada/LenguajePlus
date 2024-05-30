package model.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
	
	
	
}
