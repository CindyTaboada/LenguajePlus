package model;

public class Usuario {
	private int idUsuario;
	private String nombreUsuario;
	private String apellido1;
	private String apellido2;
	private int edad;
	private String email;
	private String contrasenia;
	

	public Usuario(int idUsuario,String nombreUsuario, String apellido1, String apellido2, int edad, String email, String contrasenia) {
		super();
		this.idUsuario=idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.edad = edad;
		this.email = email;
		this.contrasenia = contrasenia;
	}

	public int getIdUsuario() {
		return idUsuario;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public String getApellido1() {
		return apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public int getEdad() {
		return edad;
	}

	public String getEmail() {
		return email;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	@Override
	public String toString() {
		return nombreUsuario + " " + apellido1 + " " + apellido2
				+ " " + edad + " años \nEmail: " + email + "\nContraseña: " + contraseniaCensurada(contrasenia);
	}

	private String contraseniaCensurada(String contrasenia) {
		String contraseniaCensurada = "";
		for (int i = 0; i < contrasenia.length(); i++) {
			contraseniaCensurada+="*";
		}
		return contraseniaCensurada;
	}


	
}
