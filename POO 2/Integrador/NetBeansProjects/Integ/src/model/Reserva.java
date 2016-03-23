package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

public class Reserva {
   private int id;
   private Date fecha;
   private int duracion;
   private Especialista especialista;
   private Cliente cliente;
   private short estado;
   private List <Problema> problemas;
   private Servicio servicio;
   private Vehiculo vehiculo;

    public Reserva() {
        this.estado = 0;
        this.servicio = null;
        this.problemas = new ArrayList<Problema> ();
    }

    /**
     * 
     * @param fecha
     * @param unDia
     * @param especialista
     * @param cliente
     * @param vehiculo 
     * @throws java.lang.Exception 
     */
   public Reserva(GregorianCalendar fecha, Dia unDia, Especialista especialista, Cliente cliente, Vehiculo vehiculo) throws Exception {
        this();
        Date aux = (Date) fecha.getTime().clone();
        this.fecha = aux;
        this.especialista = especialista;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.duracion = 60;
        this.especialista.agregarReserva(this);
        this.cliente.agregarReserva(this);
        Empresa.getPersistencia().insert(this);
        unDia.agregarReserva(this);
        this.vehiculo.asociarReserva(this);
    }
     
   public boolean estaOcupado(GregorianCalendar fecha, int hora) {
       return false;
   }

   public void calcularDuracion(){
       this.getProblemas();
       if (!this.problemas.isEmpty()) {
           Iterator<Problema> it = this.problemas.iterator();
           duracion = 0;
           while(it.hasNext()){
               duracion += it.next().getDuracion();
           }
       } else {
           duracion = 60;
       }
   }
   
   //Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
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