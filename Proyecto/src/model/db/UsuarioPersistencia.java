package model.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Usuario;

public class UsuarioPersistencia {
    static final String NOM_TABLA = "USUARIO";
    static final String ID_USUARIO= "ID_USUARIO";
    static final String NOMBRE_USUARIO= "NOMBRE_USUARIO";
    static final String APELLIDO1= "APELLIDO1";
    static final String APELLIDO2= "APELLIDO2";
    static final String EDAD= "EDAD";
    static final String EMAIL= "EMAIL";
    static final String CONTRASENIA= "CONTRASENA";
    public static final int TAM_CONTRASENIA = 8;
    
    private AccesoBBDD acceso; // Encargado de establecer la conexion con la BBDD
    
    public UsuarioPersistencia() {
        acceso = new AccesoBBDD();
    }

    public boolean existeUsuario(String email) {
        String query = "SELECT COUNT(*) FROM " + NOM_TABLA + " WHERE " + EMAIL + " = ?";
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean exists = false;

        try {
            con = acceso.getConexion();
            stmt = con.prepareStatement(query);
            stmt.setString(1, email);
            rs = stmt.executeQuery();

            if (rs.next()) {
                exists = rs.getInt(1) > 0;
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return exists;
    }

    public boolean contraCorrecta(String email, String contrasenia) {
        String query = "SELECT " + CONTRASENIA + " FROM " + NOM_TABLA + " WHERE " + EMAIL + " = ?";
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean isCorrect = false;

        try {
            con = acceso.getConexion();
            stmt = con.prepareStatement(query);
            stmt.setString(1, email);
            rs = stmt.executeQuery();

            if (rs.next()) {
                isCorrect = rs.getString(1).equals(contrasenia);
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return isCorrect;
    }

    public Usuario obtenerUsuario(String email) {
        String query = "SELECT * FROM " + NOM_TABLA + " WHERE " + EMAIL + " = ?";
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;

        try {
            con = acceso.getConexion();
            stmt = con.prepareStatement(query);
            stmt.setString(1, email);
            rs = stmt.executeQuery();

            if (rs.next()) {
                usuario = new Usuario(
                    rs.getInt(ID_USUARIO),
                    rs.getString(NOMBRE_USUARIO),
                    rs.getString(APELLIDO1),
                    rs.getString(APELLIDO2),
                    rs.getInt(EDAD),
                    rs.getString(EMAIL),
                    rs.getString(CONTRASENIA)
                );
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return usuario;
    }

    public int registrarUsuario(Usuario usuario) {
        String insert = "INSERT INTO " + NOM_TABLA 
                        + " (" + NOMBRE_USUARIO + ", " + APELLIDO1 + ", " + APELLIDO2 + ", " 
                        + EDAD + ", " + EMAIL + ", " + CONTRASENIA + ") "
                        + "VALUES (?, ?, ?, ?, ?, ?)";
        
        Connection con = null;
        PreparedStatement stmt = null;
        int res = 0;

        try {
            con = acceso.getConexion();
            stmt = con.prepareStatement(insert);
            stmt.setString(1, usuario.getNombreUsuario());
            stmt.setString(2, usuario.getApellido1());
            stmt.setString(3, usuario.getApellido2());
            stmt.setInt(4, usuario.getEdad());
            stmt.setString(5, usuario.getEmail());
            stmt.setString(6, usuario.getContrasenia());

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


