package model.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioPersistencia {
	static final String ID_USUARIO= "ID_USUARIO";
	static final String NOMBRE_USUARIO= "NOMBRE_USUARIO";
	static final String APELLIDO1= "APELLIDO1";
	static final String APELLIDO2= "APELLIDO2";
	static final String EDAD= "EDAD";
	static final String EMAIL= "MAIL";
	static final String CONTRASENIA= "CONTRASENA";
	

private AccesoBBDD acceso; //Encargdo de establecer la conexion con la BBDD
	
	public UsuarioPersistencia() {
		acceso= new AccesoBBDD();
	}
	
	
	
}
