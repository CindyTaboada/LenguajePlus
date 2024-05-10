package model;

import java.util.ArrayList;

public class FuenteDatos {
	private ArrayList<Usuario> listaUsuarios;
	
	public FuenteDatos() {
		listaUsuarios = new ArrayList<Usuario>();
	}
	
	public void addUsuario(Usuario usuario) {
		listaUsuarios.add(usuario);
	}
	
	public ArrayList<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

}
