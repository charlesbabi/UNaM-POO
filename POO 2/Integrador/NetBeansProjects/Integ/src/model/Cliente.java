package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {

   private List vehiculos;
   private List reservas;

   public Cliente(){
       super();
       this.vehiculos = new ArrayList();
       this.reservas = new ArrayList();
   }
   
    public Cliente(String dni, String apellido, String nombre, String telefono) {
        super(dni, apellido, nombre, telefono);
        this.vehiculos = new ArrayList();
        this.reservas = new ArrayList();
        Empresa.getPersistencia().insert(this);
    }

    public List getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List vehiculos) {
        this.vehiculos = vehiculos;
    }

    public List getReservas() {
        return reservas;
    }

    public void setReservas(List reservas) {
        this.reservas = reservas;
    }
   
   
   
   /** @param unaReserva
    * @exception Exception
    * @pdOid 73700d97-c501-4f5f-92a6-ff61b767bfca */
   public void agregarReserva(Reserva unaReserva) throws Exception {
       if(!this.getReservas().contains(unaReserva)){
           this.reservas.add(unaReserva);
       }else{
           throw new Exception("El cliente ya posee la reserva.");
       }
       
   }

}