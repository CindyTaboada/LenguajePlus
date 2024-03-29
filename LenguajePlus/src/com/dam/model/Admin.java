package com.dam.model;

import com.dam.main.User;

public class Admin extends User {
	//Atributos privados
	private boolean adminName;
	private boolean editUser;
	private boolean deleteUser;
	private boolean viewUser;

	//Constructor clase padre + hija
	public Admin(String email, String password, boolean adminName) {
		super(email, password);
		this.adminName = adminName;
	}

	//Generar los métodos
	public boolean isAdminName() {
		return adminName;
	}
	
	public boolean isEditUser() {
		return editUser;
	}
	
	public boolean isDeleteUser() {
		return deleteUser;
	}
	
	public boolean isViewUser() {
		return viewUser;
	}
	
	//toString
	@Override
	public String toString() {
		return super.toString()+ "\nEl usuario es administrador?" + (adminName? "SI": "NO") ;
	}
	
	
	
	
	
}
