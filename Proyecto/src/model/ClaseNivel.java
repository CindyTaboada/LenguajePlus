package model;

public class ClaseNivel {
    private int idClase;
    private String preguntas;
    private String respuestas;

    public ClaseNivel(int idClase, String preguntas, String respuestas) {
        this.idClase = idClase;
        this.preguntas = preguntas;
        this.respuestas = respuestas;
    }

    public int getIdClase() {
        return idClase;
    }

    public String getPreguntas() {
        return preguntas;
    }

    public String getRespuestas() {
        return respuestas;
    }
}