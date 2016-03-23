/***********************************************************************
 * Module:  Agenda.java
 * Author:  Adamantium
 * Purpose: Defines the Class Agenda
 ***********************************************************************/

package model;

import java.util.*;

public class Agenda {
    
   private String id;
   private List <Anio> anios;
   private Especialista especialista;
   
   public Agenda(){
       this.anios = new ArrayList <Anio>();
   }
   
    public Agenda(String id, Especialista especialista) {
        this();
        this.id = id;
        this.especialista = especialista;
        Empresa.getPersistencia().insert(this);
    }
    
    /** Agrega un dia a la agenda.
     *
     * @param fecha
     * @param entrada
     * @param salida
     * @return 
     * @throws java.lang.Exception
     */
    public void agregarDiaALaAgenda(GregorianCalendar fecha, GregorianCalendar entrada, GregorianCalendar salida) throws Exception{
        //Se obitenen todos los anios de esta agenda.
        this.getAnios();
        //se obtiene la fecha por parte de la fecha ingresada.
        int anio = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        //Se crea las variables de anio mes y dia que usaremos luego.
        Anio anioAux = this.buscarAnio(anio);
        Mes mesAux = null;
        Dia diaAux = null;
        //se pregunta si el anio es null quiere decir que no lo encontro en el metodo de buscar anio.
        if (anioAux == null) {
            //;p agrega al anio
            this.agregarAnio(anio);
            //recupera el abio
            anioAux = this.buscarAnio(anio);
        }
        //en el anio que obtuvimos buscamos el mes
        mesAux = anioAux.buscarMes(mes);
        //preguntamos si es null el mes, eso implica que no existe en el anio.
        if (mesAux == null) {
            //entonces se agrega al mes
            anioAux.agregarMes(mes);
            //recupera el mes que agregamos recien.
            mesAux = anioAux.buscarMes(mes);
        }
        //se busca el dia si existe en el mes que seleccionamos.
        diaAux = mesAux.buscarDia(dia);
        //preguntamos si es null el dia, eso implica que no existe en el mes.
        if (diaAux == null) {
            //entonces se agrega al dia
            mesAux.agregarDia(fecha, entrada, salida);
            //recupera el dia que agregamos recien.
            //diaAux = mesAux.buscarDia(dia);
        }      
    }
    
    /**
     * 
     * @param desde
     * @param hasta
     * @param entrada
     * @param salida
     * @param dias
     * @return
     * @throws Exception 
     */
    public void agregarDiasEnRangoDeFecha(GregorianCalendar desde, GregorianCalendar hasta, GregorianCalendar entrada, GregorianCalendar salida,int dias[]) throws Exception{
        //i es un contador, size es la cantidad de dias a la semana que se agregaran
        int i, size = dias.length;
        //se crea un auxiliar de fecha ya que la fecha siempre se trabaja como variables de referencia y no de parametro.
        GregorianCalendar desdeAux, hastaAux;
        //se inicializan las variable locales, clonando las que ingresaron, para poder trabajar sin modificar las que ingresaron.
        desdeAux = (GregorianCalendar) desde.clone();
        hastaAux = (GregorianCalendar) hasta.clone();
        //se verifica que se haya pasado un vector con la cantidad de los dias.
        if (size > 0) {
            //se verifica que la fecha final sea mayor a la inicial.
            if (desdeAux.before(hastaAux) || desdeAux.equals(hastaAux)) {
                //mientras la fecha inicial sea inferior a la final.
                while(desdeAux.before(hastaAux)){
                    i = 0;
                    //se controlan los dias que se quieren agregar.
                    while(i < size){
                        //Si el dia elegido concuerda con el dia seleccionado se agrega.
                        if (desdeAux.get(Calendar.DAY_OF_WEEK) == (dias[i] + 1)) {
                            //se utiliza el metodo de esta misma clase para agregar un dia.
                            agregarDiaALaAgenda(desdeAux, entrada, salida);
                        }
                        //se pasa al siguiente dia.
                        i++;
                    }
                    //se suma un dia, hasta llegar a la fecha final.
                    desdeAux.add(Calendar.DAY_OF_MONTH, 1);
                }
            } else {
                throw new Exception("La fecha final debe ser mayor que la inicial.");
            }
        } else {
            throw new Exception("Debe seleccionar algunos dias para agregar la agenda.");
        }
    }

    public Dia buscarDia(GregorianCalendar fecha) throws Exception{
        this.getAnios();
        Anio unAnio;
        Mes unMes;
        unAnio = this.buscarAnio(fecha.get(Calendar.YEAR));
        unMes = unAnio.buscarMes(fecha.get(Calendar.MONTH));
        return unMes.buscarDia(fecha.get(Calendar.DAY_OF_MONTH));
    }
    
    //Agregar Anios
    /**Agrega un Anio si no existe, y si existe lanza una excepcion
     * 
     * @param anio 
     */
    public void agregarAnio(int anio) throws Exception{
        Anio unAnio = buscarAnio(anio);
        if(unAnio == null){
            unAnio = new Anio(anio);
            this.anios.add(unAnio);
            Empresa.getPersistencia().update(this);
        }else{
            throw new Exception("Ya existe el año " + anio + " en la Agenda " + this.getId());
        }
    }
    
    /**Buscar un anio, devuelve null si no se encuentra.
     * 
     * @param anio
     * @return 
     */
    public Anio buscarAnio(int anio){
        Anio retorno = null;
        //Se obtiene el iterator para buscar el anio.
        ListIterator <Anio> itAnio = this.anios.listIterator();
        boolean find = false;
        while(itAnio.hasNext() && !find){
            retorno = itAnio.next();
            find = retorno.isThis(anio);
        }
        return retorno;        
    }
    
    //Metodos Horarios
   /** Buscar horarios libres en una fecha especifica para cierta duracion.
    *  @param fecha
     * @return List
     * @throws java.lang.Exception
    */
   public List buscarHorariosLibres(GregorianCalendar fecha, int duracion) throws Exception {        
       List horarios = null;
       Anio auxAnio = this.buscarAnio(fecha.get(Calendar.YEAR));
       Mes auxMes = auxAnio.buscarMes(fecha.get(Calendar.MONTH));
       Dia unDia = auxMes.buscarDia(fecha.get(Calendar.DAY_OF_MONTH));
       if (unDia != null) {
           horarios = unDia.horarioLibre();
       } else {
           throw new Exception("El especialista no tiene horarios ese dia.");
       }
       return horarios;
   }
   
   /**Busca horarios libre en una fecha especifica.
    * 
    * @param fecha
    * @return
    * @throws Exception 
    */
   public List buscarHorariosLibres(GregorianCalendar fecha) throws Exception {
       List horarios = null;
       Anio auxAnio = this.buscarAnio(fecha.get(Calendar.YEAR));
       Mes auxMes = auxAnio.buscarMes(fecha.get(Calendar.MONTH));
       Dia unDia = auxMes.buscarDia(fecha.get(Calendar.DAY_OF_MONTH));
       if (unDia != null) {
           horarios = unDia.horarioLibre();
       } else {
           throw new Exception("El especialista no tiene horarios ese dia.");
       }
       return horarios;
   }
    
   //Metodos Reservas de Dias
   public List<Reserva> buscarReservas(GregorianCalendar fecha) throws Exception{
       Anio auxAnio = this.buscarAnio(fecha.get(Calendar.YEAR));
       Mes auxMes = auxAnio.buscarMes(fecha.get(Calendar.MONTH));
       Dia unDia = auxMes.buscarDia(fecha.get(Calendar.DAY_OF_MONTH));
       return auxMes.buscarDia(fecha.get(Calendar.DAY_OF_MONTH)).getReservas();
   }
   
    //Getter and Setter..
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Especialista getEspecialista() {
        return especialista;
    }
    public void setEspecialista(Especialista especialista) {
        this.especialista = especialista;
    }
    public List<Anio> getAnios() {
        return anios;
    }
    public void setAnios(List<Anio> anios) {
        this.anios = anios;
    }

    
    
}