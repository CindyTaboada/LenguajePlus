package model;

public class ClaseQnA {
    private int idClase;
    private String preguntas;
    private String respuestas;

    public ClaseQnA(int idClase, String preguntas, String respuestas) {
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