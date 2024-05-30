package model.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
	
	
	
}
