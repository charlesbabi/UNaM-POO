/***********************************************************************
 * Module:  Cliente.java
 * Author:  Babi, John Charles
 * Purpose: Defines the Class Cliente
 ***********************************************************************/

package model;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

/** Cliente que hereda de persona.
 * 
 * @author Babi, John Charles
 */
public class Cliente extends Persona {

   private List<Vehiculo> vehiculos;
   private List<Reserva> reservas;

   /**Constructor Nulo.
    * 
    */
    public Cliente(){
        super();
        this.vehiculos = new ArrayList();
        this.reservas = new ArrayList();
    }  
    
    /**Crea un cliente con el dni, apellido, nombre, fecha de nacimiento, Telefono.
     * 
     * @param dni
     * @param apellido
     * @param nombre
     * @param fechaDeNacimiento
     * @param telefono 
     */
    public Cliente(String dni, String apellido, String nombre, GregorianCalendar fechaDeNacimiento, String telefono) {
        super(dni, apellido, nombre, fechaDeNacimiento, telefono);        
        this.vehiculos = new ArrayList();
        this.reservas = new ArrayList();
        Empresa.getPersistencia().insert(this);
    }   
   
    //Metodos de reservas.
   /** Agrega una Reserva al Cliente.
    * 
    * @param unaReserva
    * @throws Exception 
    */
   public void agregarReserva(Reserva unaReserva) throws Exception {
       if(!this.getReservas().contains(unaReserva)){
           this.reservas.add(unaReserva);
           Empresa.getPersistencia().update(this);
       }else{
           throw new Exception("El Cliente ya posee esa reserva.");
       }  
   }
   
   //Metodos de vehiculos,
   /**Obtiene la lista de vehiculos del cliente. si no posee vehiculos, devuelve null.
    * 
    * @return 
    */
   public List obtenerVehiculos(){
       List retorno = null;
       if(this.getVehiculos().size() > 0){
           retorno = vehiculos;
       }
       return retorno; 
   }
   
   /** Agrega un vehiculo a la lista si no existe en ella, sino larga una excepcion.
    * 
    * @param unCar 
     * @throws java.lang.Exception 
    */
   public void agregarVehiculo(Vehiculo unCar) throws Exception{
       if(existeVehiculo(unCar.getPatente())){
           this.vehiculos.add(unCar);
       }else{
           throw new Exception("Ya existe el vehiculo: " + unCar + " en la lista del Cliente.");
       }
   }
   
   /** Devuelve verdadero si existe el vehiculo.
    * 
    * @param patente
    * @return 
    */
   public boolean existeVehiculo(String patente){
       //declaramos el retorno
       boolean retorno = false;
       //si encuentra el vehiculo cambiamos el retorno a true.
       if(buscarVehiculo(patente) != null){
           retorno = true;
       }
       return retorno;
   }

   /**Busca un vehiculo por la patente en la lista de vehiculos del cliente.
    * 
    * @param patente
    * @return 
    */
   public Vehiculo buscarVehiculo(String patente){
       //se declara el retorno
       Vehiculo retorno= null;
       //se piden los vehiculos para que el hibernate traiga de la base de datos.
       this.getVehiculos();
       Iterator <Vehiculo> it = this.vehiculos.iterator();
       //Busca el vehiculo hasta que la lista no tenga siguiente o encuentre el dicho vehiculo.
       while(it.hasNext() && retorno != null){
           retorno = it.next();
           if(!retorno.isThis(patente)){
               retorno = null;
           }
       }
       return retorno;
   }
   
   //Getter and Setters.
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