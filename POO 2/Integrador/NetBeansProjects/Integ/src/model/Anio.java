/***********************************************************************
 * Module:  Anio.java
 * Author:  Babi, John Charles
 * Purpose: Defines the Class Agenda
 ***********************************************************************/

package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Babi, John Charles
 */
public class Anio {
    
    private int id;
    private int anio;
    private List <Mes> meses;

    /** Constructor Nulo.
     * 
     */
    public Anio() {
        this.meses = new ArrayList();
    }
    
    /** Crea un año.
     * 
     * @param anio 
     */
    public Anio(int anio){
        this();
        this.anio = anio;
        Empresa.getPersistencia().insert(this);
    }

    /**Pregunta si es el mes correcto.
     * 
     * @param anio
     * @return 
     */
    public boolean isThis(int anio){
        boolean retorno = false;
        if (anio == this.anio) {
            retorno = true;
        }
        return retorno;
    }
    
    /** Busca un Dia especifico.
     * 
     * @param fecha
     * @return 
     * @throws java.lang.Exception 
     */
    public Dia buscarDia(GregorianCalendar fecha) throws Exception{
        this.getMeses();
        //se declara el retorno.
        Dia retorno = null;
        Mes auxMes;
        auxMes = this.buscarMes(fecha.get(Calendar.MONTH));
        //se pregunta si existe el mes,
        if(auxMes != null){
            retorno = auxMes.buscarDia(fecha.get(Calendar.DAY_OF_MONTH));
        }
        return retorno;
    }
    
    /**Busca un mes y lo devuelve. caso contrario devuelve null.
     * 
     * @param mes
     * @return 
     */
    public Mes buscarMes(int mes){
        this.getMeses();
        Mes retorno = null;
        //Se obtiene el iterator para buscar el anio.
        ListIterator <Mes> it = this.meses.listIterator();
        boolean find = false;
        while(it.hasNext() && !find){
            retorno = it.next();
            find = retorno.isThis(mes);
        }
        if(!find){
            retorno = null;
        }
        return retorno; 
    }
    
    /**Agrega un mes en el año, si no existe devuelve una excepcion
     * 
     * @param mes
     * @return 
     * @throws Exception 
     */
    public Mes agregarMes(int mes) throws Exception{
        this.getMeses();
        Mes aux = this.buscarMes(mes);
        if(aux == null){
            aux = new Mes(mes);
            this.meses.add(aux);
            Empresa.getPersistencia().update(this);
        }
        return aux;
    }
    
    //Getters and Setters.
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public List<Mes> getMeses() {
        return meses;
    }
    public void setMeses(List<Mes> meses) {
        this.meses = meses;
    }
}
