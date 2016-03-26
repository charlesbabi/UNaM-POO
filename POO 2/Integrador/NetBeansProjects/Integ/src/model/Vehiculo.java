/***********************************************************************
 * Module:  Vehiculo.java
 * Author:  Babi, John Charles
 * Purpose: Defines the Class Vehiculo
 ***********************************************************************/

package model;

import java.util.GregorianCalendar;
/**
 * 
 * @author Babi, John Charles
 */
public class Vehiculo {
   private String patente;
   private GregorianCalendar fechaDeCompra;
   private Modelo modelo;
   private Reserva reserva;
   private Cliente cliente;

   /**Constructor Nulo.
    * 
    */
    public Vehiculo(){
        this.reserva = null;
    }
    
    /**Constructor de vehiculo, crea y asocia con el cliente 
     * 
     * @param patente
     * @param fechaDeCompra
     * @param modelo
     * @param cliente 
     */
    public Vehiculo(String patente, GregorianCalendar fechaDeCompra, Modelo modelo, Cliente cliente) throws Exception {
        this();
        this.patente = patente;
        this.fechaDeCompra = fechaDeCompra;
        this.modelo = modelo;
        this.cliente = cliente;
        this.cliente.agregarVehiculo(this);
        Empresa.getPersistencia().insert(this);
    }   

    /**Asocia una reserva al vehiculo.
     * 
     * @param unaReserva 
     */
    public void asociarReserva(Reserva unaReserva){
        this.reserva = unaReserva;
    }
    
    /** Retorna verdadero si es la patente del vehiculo,
     * 
     * @param patente
     * @return 
     */
    public boolean isThis(String patente){
        boolean retorno = false;
        if(this.patente == null ? patente == null : this.patente.equals(patente)){
            retorno = true;
        }
        return retorno;
    }
    
   /** Metodo tostring que devuelve la patente y el nombre de modelo.
    * 
     * @return 
    */
   @Override
    public String toString(){
        return this.patente + " - " + this.modelo.getNombre();
    }
    
    //Getters and Setters
    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }
    public GregorianCalendar getFechaDeCompra() {
        return fechaDeCompra;
    }
    public void setFechaDeCompra(GregorianCalendar fechaDeCompra) {
        this.fechaDeCompra = fechaDeCompra;
    }
    public Modelo getModelo() {
        return modelo;
    }
    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
    public Reserva getReserva() {
        return reserva;
    }
    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente unCliente) {
        this.cliente = unCliente;
    }
}