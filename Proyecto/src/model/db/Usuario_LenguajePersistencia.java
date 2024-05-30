package model.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Usuario_LenguajePersistencia {
	
	static final String ID_LENGUAJE= "ID_LENGUAJE";
	static final String ID_USUARIO= "ID_USUARIO";
	

private AccesoBBDD acceso; //Encargdo de establecer la conexion con la BBDD
	
	public Usuario_LenguajePersistencia() {
		acceso= new AccesoBBDD();
	}
	
	
	
}
