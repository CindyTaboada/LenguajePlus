package model.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Clase_NivelPersistencia {
	static final String ID_LENGUAJE= "ID_LENGUAJE";
	static final String TIPO_LENGUAJE= "TIPO_LENGUAJE";
	

private AccesoBBDD acceso; //Encargdo de establecer la conexion con la BBDD
	
	public Clase_NivelPersistencia() {
		acceso= new AccesoBBDD();
	}
	
	
	
}
