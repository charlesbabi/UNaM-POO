package modelo;

public class Problema {

    private int id;
    private String descripcion;
    private int tiempo;

    public Problema() {
    }

    public Problema(int id, String descripcion, int tiempo) {
        this.id = id;
        this.descripcion = descripcion;
        this.tiempo = tiempo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    
}
