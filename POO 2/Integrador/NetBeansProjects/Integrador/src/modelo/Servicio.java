package modelo;


import java.util.HashMap;


public class Servicio {

    private int id;
    private float valor;
    private int duracion;
    private String observacion;
    private Vehiculo vehiculo;
    private HashMap repuestos;

    public Servicio () {
        this.repuestos = new HashMap();
    }

    public Servicio(int id, float valor, String observacion, Vehiculo mVehiculo) {
        this();
        this.id = id;
        this.valor = valor;
        this.observacion = observacion;
        this.vehiculo = mVehiculo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }    
    
    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public HashMap getRepuestos() {
        return repuestos;
    }

    public void setRepuestos(HashMap repuestos) {
        this.repuestos = repuestos;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    //Metodos Especificos.
    public void agregarRepuesto(Repuesto unRepuesto, int cantidad)throws Exception{
        if(!repuestos.containsKey(unRepuesto.getId())){
            RepuestoLinea aux = new RepuestoLinea(unRepuesto, cantidad);
            repuestos.put(unRepuesto.getId(), aux);
        }else{
            throw new Exception("El repuesta ya fue asociado al servicio.");
        }
    }
}

