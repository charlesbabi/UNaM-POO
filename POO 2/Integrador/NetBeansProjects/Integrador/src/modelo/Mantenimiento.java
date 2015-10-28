package modelo;

public class Mantenimiento extends Servicio {

    public Mantenimiento () {
        super();
    }

    public Mantenimiento(int id, float valor, String observacion, Vehiculo mVehiculo) {
        super(id, valor, observacion, mVehiculo);
    }

    @Override
    public void agregarRepuesto(Repuesto unRepuesto, int cantidad) throws Exception {
        super.agregarRepuesto(unRepuesto, cantidad);
    }
}

