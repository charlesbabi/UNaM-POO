package model;

import java.util.GregorianCalendar;

public class Horario {
   private int id;
   private Reserva reserva;   
   private GregorianCalendar entrada;
   private GregorianCalendar salida;

    public Horario() {
        this.reserva = null;
    }

    /**
     * 
     * @param entrada
     * @param salida 
     */
    public Horario(GregorianCalendar entrada, GregorianCalendar salida) {
        this();
        this.entrada = entrada;
        this.salida = salida;
        Empresa.getPersistencia().insert(this);
    }

   
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public GregorianCalendar getEntrada() {
        return entrada;
    }

    public void setEntrada(GregorianCalendar entrada) {
        this.entrada = entrada;
    }

    public GregorianCalendar getSalida() {
        return salida;
    }

    public void setSalida(GregorianCalendar salida) {
        this.salida = salida;
    }

   
}