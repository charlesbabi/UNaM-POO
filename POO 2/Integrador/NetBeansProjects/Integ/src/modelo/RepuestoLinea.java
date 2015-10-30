package modelo;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.211F76F0-8E19-6FB7-E828-E374E04F77A6]
// </editor-fold> 
public class RepuestoLinea {

    private int id;    
    private int cantidad;
    private Repuesto repuesto;

    
    public RepuestoLinea () {
    }

    public RepuestoLinea(int cantidad, Repuesto mRepuesto) {
        this.cantidad = cantidad;
        this.repuesto = mRepuesto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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


}

