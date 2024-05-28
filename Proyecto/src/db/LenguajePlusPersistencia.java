package db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LenguajePlusPersistencia {

private AccesoBBDD acceso; //Encargdo de establecer la conexion con la BBDD
	
	public LenguajePlusPersistencia() {
		acceso= new AccesoBBDD();
	}
}
