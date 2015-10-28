package modelo;

public class RepuestoLinea {

    private Repuesto repuesto;
    private int cantidad;

    public RepuestoLinea() {
    }

    public RepuestoLinea(Repuesto repuesto, int cantidad) {
        this.repuesto = repuesto;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Repuesto getRepuesto() {
        return repuesto;
    }

    public void setRepuesto(Repuesto repuesto) {
        this.repuesto = repuesto;
    }

    public boolean isClave(int id){
        return this.repuesto.isClave(id);
    }
}
