/***********************************************************************
 * Module:  Dia.java
 * Author:  Babi, John Charles
 * Purpose: Defines the Class Dia
 ***********************************************************************/

package model;

import java.text.SimpleDateFormat;
import java.util.*;

public class Dia {
   private int id; 
   private GregorianCalendar fecha;
   private Date entrada;
   private Date salida;
   private List <Servicio> servicios;
   private List <Reserva> reservas;

   /**Constructor nulo.
    * 
    */
    public Dia() {
        this.servicios = new ArrayList();
        this.reservas = new ArrayList();
    }
    
    /**Constructor, crea una fecha.
     * 
     * @param fecha 
     */
    public Dia(GregorianCalendar fecha) {
        this();
        GregorianCalendar aux = (GregorianCalendar) fecha.clone();
        this.fecha = aux;
        Empresa.getPersistencia().insert(this);
    }

    /**Constructor crea un dia con los parametros recibidos.
     * 
     * @param fecha
     * @param entrada
     * @param salida 
     */
    public Dia(GregorianCalendar fecha, GregorianCalendar entrada, GregorianCalendar salida) {
        this();
        //se usa una variable auxiliar ya que las fechas siempre se pasan por referencia.S
        GregorianCalendar aux = (GregorianCalendar) fecha.clone();
        this.fecha = aux;
        this.entrada = entrada.getTime();
        this.salida = salida.getTime();
        Empresa.getPersistencia().insert(this);
    }
    
    /** Devuelve un ArrayList con los horarios de entrada y salida, en los cuales se encuentra disponible.
     * 
     * @return 
     * @throws java.lang.Exception 
     */
    public List horarioLibre() throws Exception{
        this.getReservas();
        List retorno = new ArrayList();
        
        Date entradaAux, salidaAux;
        entradaAux = new Date(Funciones.horaCero(this.fecha).getTimeInMillis());
        salidaAux = new Date(Funciones.horaCero(this.fecha).getTimeInMillis());
              
        //aca creamos una variable auxiliar para manejar la fecha, el date tiene problemas para sumar.
        GregorianCalendar auxiliarFecha, auxiliarSalida;
        //se clona la fecha para no usar esta, ya que se modificará y esta siempre pasa como referencia.
        auxiliarFecha = (GregorianCalendar) this.fecha.clone();
        auxiliarSalida = (GregorianCalendar) this.fecha.clone();
        //a la fecha auxiliar se iguala como la entrada.
        auxiliarFecha.setTime(Funciones.horaCero(this.fecha).getTime());
        auxiliarSalida.setTime(Funciones.horaCero(this.fecha).getTime());
        //usamos un formato para utilizar las horas
        SimpleDateFormat df = new SimpleDateFormat("kk:mm");
        //separamos las horas y minutos para agregarlas luego.
        String[] hora = df.format(entrada.getTime()).split(":");  
        //agregamos horas y minutos en el auxiliar de fecha de entrada.
        auxiliarFecha.add(Calendar.HOUR, Integer.parseInt(hora[0]));
        auxiliarFecha.add(Calendar.MINUTE, Integer.parseInt(hora[1]));
        //separamos las fechas para la salida.
        hora = df.format(salida.getTime()).split(":");  
        auxiliarSalida.add(Calendar.HOUR, Integer.parseInt(hora[0]));
        auxiliarSalida.add(Calendar.MINUTE, Integer.parseInt(hora[1]));
        
        //se suman la duracion de todas las reservas, para saber si quedará disponible algun horario.
        Iterator<Reserva> it = reservas.iterator();
        while(it.hasNext()){
            auxiliarFecha.add(Calendar.MINUTE, it.next().getDuracion());
        }
        //un vez sumado todas las duracion de las reservas, se procede a cargar la lista de retorno con los horarios libre
        //Realiza esto hasta que la fecha de inicio del dia sea inferior a la de salida.
        if(auxiliarFecha.before(auxiliarSalida)){
            //Se formatea la fecha para entregar solo la hora y los minutos.
            SimpleDateFormat sdf = new SimpleDateFormat("kk:mm");
            //se agregan los horarios libres de entrada y salida.
            retorno.add(sdf.format(auxiliarFecha.getTime()));
            retorno.add(sdf.format(auxiliarSalida.getTime()));
            //entradaAux.add(Calendar.MINUTE, moduloDeHorario);
        }else{
            throw new Exception("Este Dia tiene todos los horarios ocupados.");
        }
        return retorno;
    }
    
    /** Agrega una reserva al dia seleccionado.
     * 
     * @param unaReserva
     * @throws Exception 
     */
    public void agregarReserva(Reserva unaReserva) throws Exception {
       if(!this.getReservas().contains(unaReserva)){
           this.reservas.add(unaReserva);
           Empresa.getPersistencia().update(this);
       }else{
           throw new Exception("El Dia ya posee esa reserva.");
       }       
    }
    
    /** Esta funcion pregunta si es el dia indicado.
     * 
     * @param fecha
     * @return 
     */
    public boolean isThis(int fecha){
        boolean retorno = false;
        if(this.fecha.get(Calendar.DAY_OF_MONTH) == fecha){
            retorno = true;
        }
        return retorno;
    }
    
    /** Devuelve todas las reservas, si esta vacia lanza una excepcion.
     * 
     * @return
     * @throws Exception 
     */
    public List<Reserva> obtenerReservas() throws Exception{
        //llamamos para obtener los vehiculos de la bd
        this.getReservas();
        //si esta vacia la lista larga una excepcion.
        if(this.reservas.isEmpty()){
            throw new Exception("El dia no posee reservas.");
        }
        //si no larga la excepcion es porque no esta vacia, por ello devuelve todas las reservas.
        return this.reservas;
    }
    
    //Getters and Setters..
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