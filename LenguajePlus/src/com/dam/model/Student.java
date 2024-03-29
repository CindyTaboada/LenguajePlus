package com.dam.model;

import com.dam.main.User;

public class Student extends User {
	//Atributos
	private boolean studentName;
	private boolean editProfile;
	private boolean changePassword;

	//constructor 
	public Student(String email, String password, boolean studentName) {
		super(email, password);
		this.studentName = studentName;
	}

	//Métodos:
	
	public boolean isEditProfile() {
		return editProfile;
	}
	
	public boolean isChangePassword() {
		return changePassword;
	}
	
	
	//tostring 
	@Override
	public String toString() {
		return super.toString() +"\nEs un estudiante?" +(studentName? "SI": "NO");
	}
	
	
	

}
