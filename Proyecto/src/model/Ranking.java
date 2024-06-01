package model;

public class Ranking {
	
	private String usuario;
    private int lenjuages;

    public Ranking(String usuario, int lenjuages) {
        this.usuario = usuario;
        this.lenjuages = lenjuages;
        
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

	public int getLenjuages() {
		return lenjuages;
	}

	public void setLenjuages(int lenjuages) {
		this.lenjuages = lenjuages;
	}

   
}