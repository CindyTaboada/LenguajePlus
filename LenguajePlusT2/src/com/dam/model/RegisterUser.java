package com.dam.model;

public class RegisterUser {
	
	//Atributos
	private String email;
	private String password;
	private String name;
	private String surname;
	private int fone;
	private String registerDate;
	
	//Constructor padre + composición
	public RegisterUser(String email, String password, String name, String surname, int fone, String registerDate) {
		super();
		this.name = name;
		this.surname = surname;
		this.fone = fone;
		this.registerDate = registerDate;
	}

	//Métodos
	public void login () {
		
	}
	

	public String getRegisterDate() {
		return registerDate;
	}
	


	//toString
	@Override
	public String toString() {
		return super.toString() + "\nRegistro de usuario: " 
				+ "\nName=" + name 
				+ "\nSurname=" + surname
				+ "\nTelephone" + fone 
				+ "\nEmail: "+ email 
				+ "\nPassword:" + password ;
				
	}
	
	

}
