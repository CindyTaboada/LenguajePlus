package dam.models;

public class ClassNivelC implements Niveles {
    
	private String[] temas;
    private int cantidadLecciones;
    private int leccionesCompletadas;
    
 

	public ClassNivelC(String[] temas, int cantidadLecciones, int leccionesCompletadas) {
		super();
		this.temas = temas;
		this.cantidadLecciones = cantidadLecciones;
		this.leccionesCompletadas = leccionesCompletadas;
	}


	public String obtenerProgreso() {
        // Implementation here
        return "Progreso en Nivel C";
    }

   
    public void completarPrueba(int pruebaID) {
        // Implementation here
    }

    
    public String obtenerResultado() {
        // Implementation here
        return "Resultado de la prueba en Nivel C";
    }

    public void conceptosIntermedios() {
        // Implementation here
    }

    public String obtenerComentario() {
        // Implementation here
        return "Comentario sobre la lección o prueba en Nivel C";
    }

	public void completaPrueba(int pruebaID) {
		// TODO Auto-generated method stub
		
	}

}
