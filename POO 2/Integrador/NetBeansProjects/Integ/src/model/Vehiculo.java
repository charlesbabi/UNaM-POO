package model;

import java.util.GregorianCalendar;
public class Vehiculo {
   private String patente;
   private GregorianCalendar fechaDeCompra;
   private Modelo modelo;
   private Reserva reserva;
   private Cliente cliente;

    public Vehiculo(){
        this.reserva = null;
    }
    
    public Vehiculo(String patente, GregorianCalendar fechaDeCompra, Modelo modelo, Cliente cliente) {
        this();
        this.patente = patente;
        this.fechaDeCompra = fechaDeCompra;
        this.modelo = modelo;
        this.cliente = cliente;
        
    }   

   @Override
    public String toString(){
        return this.patente + " - " + this.modelo.getNombre();
    }
    
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