package model;

public class Nivel {
	private int idNivel;
    private String tipoNivel;
    private String premio;
    private int idClase;
    
	public Nivel(int idNivel, String tipoNivel, String premio, int idClase) {
		
		this.idNivel = idNivel;
		this.tipoNivel = tipoNivel;
		this.premio = premio;
		this.idClase = idClase;
	}
	
	
	public int getIdNivel() {
		return idNivel;
	}
	public String getTipoNivel() {
		return tipoNivel;
	}
	public String getPremio() {
		return premio;
	}
	public int getIdClase() {
		return idClase;
	}
    

}
