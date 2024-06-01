package model;

public class Ranking {
	

    private String usuario;
    private int lenguajesCompletados;

    public Ranking(String usuario, int lenguajesCompletados) {
        this.usuario = usuario;
        this.lenguajesCompletados = lenguajesCompletados;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getLenguajesCompletados() {
        return lenguajesCompletados;
    }

    public void setLenguajesCompletados(int lenguajesCompletados) {
        this.lenguajesCompletados = lenguajesCompletados;
    }
}