package dam.models;

public class ClassNivelA implements Niveles {

	private String[] temas;
    private int cantidadLecciones;
    private int leccionesCompletadas;

    

   
    public ClassNivelA(String[] temas, int cantidadLecciones, int leccionesCompletadas) {
		super();
		this.temas = temas;
		this.cantidadLecciones = cantidadLecciones;
		this.leccionesCompletadas = leccionesCompletadas;
	}


	public String obtenerProgreso() {
        //TODO
        return "Progreso en Nivel A";
    }

   
    public String obtenerResultado() {
        // TODO
        return "Resultado de la prueba en Nivel A";
    }

    public void conceptosBasicos() {
        // TODO
    }



	public String obtenerComentario() {
        // TODO
        return "Comentario sobre la lección o prueba en Nivel A";
    }


	public void completaPrueba(int pruebaID) {
		// TODO Auto-generated method stub
		
	}


	

}
