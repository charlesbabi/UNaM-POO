/***********************************************************************
 * Module:  Dia.java
 * Author:  Adamantium
 * Purpose: Defines the Class Dia
 ***********************************************************************/

package model;

import java.util.*;

public class Dia {
   private GregorianCalendar fecha;
   private List <Horario> horarios;
   private List <Servicio> servicios;
   private List <Reserva> reservas;

    public Dia() {
        this.horarios = new ArrayList();
        this.servicios = new ArrayList();
        this.reservas = new ArrayList();
    }

    public Dia(GregorianCalendar fecha) {
        this();
        this.fecha = fecha;
        Empresa.getPersistencia().insert(this);
    }
    
    /**Agrega horarios al día.
     * 
     * @param unHorario
     * @throws Exception 
     */
    public void agregarHorario(Horario unHorario) throws Exception{
        if (!this.horarios.contains(unHorario)) {
            this.horarios.add(unHorario);
        } else {
            throw new Exception ("Ese horario ya existe en ese dia.");
        }
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
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

   
}