package dam.models;

public class ClassNivelB implements Niveles {
    
	private String[] temas;
    private int cantidadLecciones;
    private int leccionesCompletadas;
    
    
    public ClassNivelB(String[] temas, int cantidadLecciones, int leccionesCompletadas) {
		super();
		this.temas = temas;
		this.cantidadLecciones = cantidadLecciones;
		this.leccionesCompletadas = leccionesCompletadas;
	}


	public String obtenerProgreso() {
        // Implementation here
        return "Progreso en Nivel B";
    }

    public String obtenerResultado() {
        // Implementation here
        return "Resultado de la prueba en Nivel B";
    }

    public void conceptosIntermedios() {
        // Implementation here
    }

    public String obtenerComentario() {
        // Implementation here
        return "Comentario sobre la lección o prueba en Nivel B";
    }

	public void completaPrueba(int pruebaID) {
		// TODO Auto-generated method stub
		
	}
}
