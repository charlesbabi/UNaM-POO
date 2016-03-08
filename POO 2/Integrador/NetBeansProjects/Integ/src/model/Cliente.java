package model;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Cliente extends Persona {

   private List vehiculos;
   private List reservas;

    public Cliente(){
        super();
    }   
    public Cliente(String dni, String apellido, String nombre, GregorianCalendar fechaDeNacimiento, String telefono) {
        super(dni, apellido, nombre, fechaDeNacimiento, telefono);        
        this.vehiculos = new ArrayList();
        this.reservas = new ArrayList();
        Empresa.getPersistencia().insert(this);
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
   
   public List obtenerVehiculos(){
       List retorno = null;
       if(this.getVehiculos().size() > 0){
           retorno = vehiculos;
       }
       return retorno; 
   }
   
   public void agregarVehiculo(Vehiculo unCar){
       this.vehiculos.add(unCar);       
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
   
   
   
}