package modelo;

public class Modelo {

    private int id;
    private String nombre;
    private Marca marca;

    public Modelo () {
    }

    public Modelo(int id, String nombre, Marca mMarca) throws Exception {
        this();
        this.id = id;
        this.nombre = nombre;
        this.marca = mMarca;
        this.marca.asociarModelo(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Marca getMarca () {
        return marca;
    }

    public void setMarca (Marca val) {
        this.marca = val;
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String val) {
        this.nombre = val;
    }
    
    
    
}

