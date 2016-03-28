/***********************************************************************
 * Module:  Especialista.java
 * Author:  Babi, John Charles
 * Purpose: Defines the Class Especialista
 ***********************************************************************/

package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.ListIterator;

public class Especialista extends Persona {

   private List<Reserva> reservas;
   private Marca marca;
   private List<Servicio> servicios;
   private Agenda agenda;
   
   /**Constructor nulo
    * 
    */
   public Especialista(){
       super();
       this.reservas = new ArrayList();
       this.marca = null;
       this.servicios = new ArrayList();
       this.agenda = new Agenda();
   }

   /** Constructor, crea un especialista y asocia a la marca ingresada.
    * 
    * @param dni
    * @param apellido
    * @param nombre
    * @param fechaDeNacimiento
    * @param telefono
    * @param unaMarca 
    */
    public Especialista(String dni, String apellido, String nombre, GregorianCalendar fechaDeNacimiento, String telefono, Marca unaMarca) {
        super(dni, apellido, nombre, fechaDeNacimiento, telefono);
        this.reservas = new ArrayList();
        this.servicios = new ArrayList();
        this.agenda = new Agenda(dni, this);
        this.marca = unaMarca;
        this.marca.asociarEspecialista(this);
        Empresa.getPersistencia().insert(this);
    }
   
   /**Devuelve una lista de reservas.
    * 
    * @param fecha 
     * @return  
     * @throws java.lang.Exception  
    */
   public List<Reserva> verReservas(GregorianCalendar fecha) throws Exception {
       return this.agenda.buscarReservas(fecha);
   }
   
   /**Devuelve la lista con los horarios disponible.
    * 
    * @param fecha
    * @return
    * @throws Exception 
    */
   public List horarioDisponible(GregorianCalendar fecha) throws Exception{
       return this.agenda.buscarHorariosLibres(fecha);
   }
      
   //Metodos Reservas
   /**Agrega una reserva al especialista, en caso contrari lanza una excepcion
    * 
    * @param fecha
    * @param unDia
    * @param especialista
    * @param cliente
    * @param vehiculo
    * @throws Exception 
    */
   public void agregarReserva(GregorianCalendar fecha, Dia unDia, Especialista especialista, Cliente cliente, Vehiculo vehiculo) throws Exception {
       //inicializamos en null la reserva. 
       Reserva aux;
       //buscamos que la reserva no exista.
       aux = this.buscarReserva(fecha);
       //como la funcion devuelve nulo si no encuentra la reserva, debemos comprobar esto.
       if(aux != null){
           //creamos la nueva reserva.
           aux = new Reserva(fecha, unDia, especialista, cliente, vehiculo);
           //asociamos la reserva con este especialista.
           this.asociarReserva(aux);
       }
   }
   
   /**
     *
     * @param unaReserva
     * @throws java.lang.Exception
     */
   public void asociarReserva(Reserva unaReserva) throws Exception{
       if(!this.getReservas().contains(unaReserva)){
            this.reservas.add(unaReserva);
            Empresa.getPersistencia().update(this);
        }else{
            throw new Exception("El Especialista ya posee esa reserva.");
        } 
   }
   
   /**Busca una reserva, en caso de no encontrar devuelve un null.
    * 
    * @param fecha
    * @return 
    */
   public Reserva buscarReserva(GregorianCalendar fecha){
       //se llama al metodo para que el hibernate traiga las reservas de la base de datos.
       this.getReservas();
       Reserva retorno = null;
       ListIterator<Reserva> it = this.reservas.listIterator();
       //se castea el GregorianCalendar ingresado a Date para ello se una un auxiliar.
       Date aux = (Date) fecha.getTime().clone();
       //declaramos una variable boolean para comprobar si encuentra la reserva o no.
       boolean find = false; // al principio decimo que no existe
       //se pregunta si el listiterator tiene siguiente, y no encontro la reserva.
       while(it.hasNext() && !find){
           retorno = it.next(); //movemos uno la coleccion
           find = retorno.isThis(aux); //preguntamos si es esta reserva.
       }
       //si termino el bucle y no encontro la reserva.
       if(!find){
           //dejamos en null la variable que usamos, para que devuelva null si no encontro la reserva al termina de recorrer la collecion.
           retorno = null;
       }
       return retorno;
   }
   
   public Dia buscarDia(GregorianCalendar fecha) throws Exception{
       Dia retorno =this.agenda.buscarDia(fecha);
       if(retorno == null){
           SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
           throw new Exception("No existe el dia: " + sdf.format(fecha) + " en la agenda del especialista: " + this.toString());
       }
       return retorno;
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

    public void generarAgenda(GregorianCalendar desde, GregorianCalendar hasta, GregorianCalendar gregorianCalendar, GregorianCalendar gregorianCalendar0, int[] Dias) throws Exception {
        this.agenda.agregarDiasEnRangoDeFecha(desde, hasta, hasta, hasta, Dias);
    }
}