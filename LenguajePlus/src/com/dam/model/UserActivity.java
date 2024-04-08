package com.dam.model;

public class UserActivity {
	//Atributos
	private String lastLogin;
	private String timeLogged;
	
	//Constructor padre + composición
	public UserActivity(String lastLogin, String timeLogged) {
		super();
		this.lastLogin = lastLogin;
		this.timeLogged = timeLogged;
	}
	//Métodos:
	
	public String getLastLogin() {
		return lastLogin;
	}

	public String getTimeLogged() {
		return timeLogged;
	}


	//ToString
	@Override
	public String toString() {
		return super.toString()+"\nActividad de Usuario:"
				+ "\nÚltima conexión:" + lastLogin 
				+ "\nTiempo de conexión:" + timeLogged;
				
	}
	
	

}
