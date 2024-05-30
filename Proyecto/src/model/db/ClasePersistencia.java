package model.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClasePersistencia {
	static final String NOM_TABLA = "CLASE";
	static final String ID_CLASE= "ID_CLASE";
	static final String LECCION= "LECCION";
	static final String PREGUNTAS= "PREGUNTAS";
	static final String RESPUESTAS= "RESPUESTAS";
	static final String ID_LENGUAJE= "ID_LENGUAJE";
	

private AccesoBBDD acceso; //Encargdo de establecer la conexion con la BBDD
	
	public ClasePersistencia() {
		acceso= new AccesoBBDD();
	}
	
	
	
}
