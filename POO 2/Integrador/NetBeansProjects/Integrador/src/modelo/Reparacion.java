package modelo;

import java.util.HashMap;

public class Reparacion extends Servicio {

    private float manoDeObra;
    private HashMap problemas;

    public Reparacion () {
        super();
        problemas = new HashMap();
    }

    public Reparacion(int id, float valor, String observacion, Vehiculo mVehiculo, float manoDeObra){
        super(id, valor, observacion, mVehiculo);
        this.manoDeObra = manoDeObra;
        problemas = new HashMap();
    }

    public float getManoDeObra () {
        return manoDeObra;
    }

    public void setManoDeObra (float val) {
        this.manoDeObra = val;
    }

    @Override
    public void agregarRepuesto(Repuesto unRepuesto, int cantidad) throws Exception {
        unRepuesto.restarStock(cantidad);
        super.agregarRepuesto(unRepuesto, cantidad);
    }

    public void asociarProblema(Problema unProblema) throws Exception{
        if(!problemas.containsKey(unProblema.getId())){
            problemas.put(unProblema.getId(), unProblema);
        }else{
            throw new Exception("Ya se agrego este item a la reparación");
        }
    }
}

