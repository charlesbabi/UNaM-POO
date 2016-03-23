package model;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Cliente extends Persona {

   private List<Vehiculo> vehiculos;
   private List<Reserva> reservas;

    public Cliente(){
        super();
        this.vehiculos = new ArrayList();
        this.reservas = new ArrayList();
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
           Empresa.getPersistencia().update(this);
       }else{
           throw new Exception("El Cliente ya posee esa reserva.");
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

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
   
   
   
}