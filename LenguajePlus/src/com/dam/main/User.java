package com.dam.main;

public class User {
	
	//Atributos
	protected String email;
	protected String password;
	
	//Constructor
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	//Getter
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	
	//toString
	@Override
	public String toString() {
		return "Email: " + email + "Password:" + password;
	}
	
	
		
		
		
		

	}


