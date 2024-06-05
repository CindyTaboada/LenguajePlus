package model;

public class ClaseNiveles {
    private int idClase;
    private int idNivel;

    public ClaseNiveles(int idClase, int idNivel) {
        this.idClase = idClase;
        this.idNivel = idNivel;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public int getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(int idNivel) {
        this.idNivel = idNivel;
    }
}
