/***********************************************************************
 * Module:  Dia.java
 * Author:  Adamantium
 * Purpose: Defines the Class Dia
 ***********************************************************************/

package model;

import java.util.*;

public class Dia {
   private int id; 
   private GregorianCalendar fecha;
   private Date entrada;
   private Date salida;
   private List <Servicio> servicios;
   private List <Reserva> reservas;

    public Dia() {
        this.servicios = new ArrayList();
        this.reservas = new ArrayList();
    }
    
    public Dia(GregorianCalendar fecha) {
        this();
        this.fecha = fecha;
        Empresa.getPersistencia().insert(this);
    }

    /**
     * 
     * @param fecha
     * @param entrada
     * @param salida 
     */
    public Dia(GregorianCalendar fecha, GregorianCalendar entrada, GregorianCalendar salida) {
        this();
        GregorianCalendar aux = (GregorianCalendar) fecha.clone();
        this.fecha = aux;
        this.entrada = entrada.getTime();
        this.salida = salida.getTime();
        Empresa.getPersistencia().insert(this);
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

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Date getSalida() {
        return salida;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

   
}