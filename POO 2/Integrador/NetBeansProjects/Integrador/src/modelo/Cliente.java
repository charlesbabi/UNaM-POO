package modelo;

import java.util.HashMap;
import java.util.Map;

public class Cliente extends Persona {

    private Map vehiculos;

    public Cliente () {
        super();
        this.vehiculos = new HashMap();
    }

    public Cliente(int dni, String nombre, String apellido, String telefono) {
        super(dni, nombre, apellido, telefono);
        this.vehiculos = new HashMap();
    }

    public Map getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Map vehiculos) {
        this.vehiculos = vehiculos;
    }

    //Metodos especificos
    public void asociarVehiculo(Vehiculo unVehiculo) throws Exception{
        if(!vehiculos.containsKey(unVehiculo.getPatente())){
            vehiculos.put(unVehiculo.getPatente(), unVehiculo);
        }else{
            throw new Exception("El cliente: " + this.getNombre() + "ya posee ese vehiculo asociado.");
        }
    }
}

