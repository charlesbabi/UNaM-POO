package model;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

public class Especialista extends Persona {

   private List<Reserva> reservas;
   private Marca marca;
   private List<Servicio> servicios;
   private Agenda agenda;
   
   public Especialista(){
       super();
       this.reservas = new ArrayList();
       this.marca = null;
       this.servicios = new ArrayList();
       this.agenda = new Agenda();
   }

    public Especialista(String dni, String apellido, String nombre, GregorianCalendar fechaDeNacimiento, String telefono, Marca unaMarca) {
        super(dni, apellido, nombre, fechaDeNacimiento, telefono);
        this.reservas = new ArrayList();
        this.servicios = new ArrayList();
        this.agenda = new Agenda(dni, this);
        this.marca = unaMarca;
        this.marca.asociarEspecialista(this);
        Empresa.getPersistencia().insert(this);
    }
   
   /**
    * 
    * @param fecha 
     * @return  
     * @throws java.lang.Exception  
    */
   public List<Reserva> verReservas(GregorianCalendar fecha) throws Exception {
       return this.agenda.buscarReservas(fecha);
   }
   
   public List horarioDisponible(GregorianCalendar fecha) throws Exception{
       List retorno = null;
       retorno = agenda.buscarHorariosLibres(fecha);
       return retorno;
   }
   
   /** @param unaReserva
    * @exception Exception
    * @pdOid 830e165a-9345-48dc-a12c-c2bf9652fe15 */
   public void agregarReserva(Reserva unaReserva) throws Exception {
        if(!this.getReservas().contains(unaReserva)){
            this.reservas.add(unaReserva);
            Empresa.getPersistencia().update(this);
        }else{
            throw new Exception("El Especialista ya posee esa reserva.");
        } 
       /*
       
       Iterator<Reserva> itReservas = this.reservas.iterator();
       boolean act = true;
           while(itReservas.hasNext() && act == true){
               Reserva temp = itReservas.next();
           }        
       if(act){
           this.reservas.add(unaReserva);
           Empresa.getPersistencia().update(this);
       }else{
           throw new Exception("El horario para esa reserva esta ocupado.");
       } 
       
       */
   }
   
   //Getters and Setters..
   public List<Reserva> getReservas() {
        return reservas;
    }
    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
    public Marca getMarca() {
        return marca;
    }
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    public List<Servicio> getServicios() {
        return servicios;
    }
    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }
    public Agenda getAgenda() {
        return agenda;
    }
    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }
    @Override
    public String toString() {
        return this.getApellido() +" "+ this.getNombre();
    }   
}