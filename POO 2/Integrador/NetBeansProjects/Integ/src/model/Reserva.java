package model;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Reserva {
   private int id;
   private GregorianCalendar fecha;
   private int duracion;
   private Especialista especialista;
   private Cliente cliente;
   private short estado;
   private List <Problema> problemas;
   private Servicio servicio;
   private Vehiculo vehiculo;

    public Reserva() {
        this.problemas = new ArrayList<Problema> ();
    }

   public Reserva(GregorianCalendar fecha, Especialista especialista, Cliente cliente, Vehiculo vehiculo) {
        this(); 
        this.fecha = fecha;
        this.especialista = especialista;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }
     
   public boolean estaOcupado(GregorianCalendar fecha, int hora) {
       return false;
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Especialista getEspecialista() {
        return especialista;
    }

    public void setEspecialista(Especialista especialista) {
        this.especialista = especialista;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    public List<Problema> getProblemas() {
        return problemas;
    }

    public void setProblemas(List<Problema> problemas) {
        this.problemas = problemas;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

   
}