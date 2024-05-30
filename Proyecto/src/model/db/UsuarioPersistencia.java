package model.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Usuario;

public class UsuarioPersistencia {
	static final String NOM_TABLA = "PILOTOS";
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


	public int registrarUsuario(Usuario usuario) {
		
	// comprobación: Antes de registrar va a comprobar que no exista un usuario con mismo id
		String select = "SELECT * FROM " + NOM_TABLA + " WHERE " + ID_USUARIO + " = ?";
	
	// INSERT INTO USUARIO VALUES (?, ?, ?, ?, ?, ?, ?);
			String insert = "INSERT INTO " + NOM_TABLA  + " VALUES (?, ?, ?, ?, ?, ?, ?)";
			Connection con = null;
			PreparedStatement stmt = null;
			int res = 0;
			
			try {
				con = acceso.getConexion();
				
				stmt = con.prepareStatement(insert);
				stmt.setInt(1, usuario.getIdUsuario());
				stmt.setString(2, usuario.getNombreUsuario());
				stmt.setString(3, usuario.getApellido1());
				stmt.setString(4, usuario.getApellido2());
				stmt.setInt(5, usuario.getEdad());
				stmt.setString(6, usuario.getEmail());
				stmt.setString(7, usuario.getContrasenia());
				
				
				res = stmt.executeUpdate();
				
			} catch (Exception e) {
				e.printStackTrace();
				
			} finally {
				try {
					if (stmt != null) stmt.close();
					if (con != null) con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			return res;
		}
	
}
