/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Adamantium
 */
public class Mes {
    
    private int id;
    private int mes;
    private List<Dia> dias;

    public Mes() {
        this.dias = new ArrayList();
    }
    
    public Mes(int mes) {
        this();
        this.mes = mes;
        Empresa.getPersistencia().insert(this);
    }
    
    /** Pregunta si es el mes correcto.
     * 
     * @param mes
     * @return 
     */
    public boolean isThis(int mes){
        boolean retorno = false;
        if (mes == this.mes) {
            retorno = true;
        }
        return retorno;
    }
    
    //Metodos Dias
    /** Buscar un Dia en caso de no ecnontrar devuelve null.
     * 
     * @param fecha
     * @return
     * @throws Exception 
     */
    public Dia buscarDia(int fecha) throws Exception{
        this.getDias();
        Dia retorno = null;
        //Se obtiene el iterator para buscar el anio.
        ListIterator <Dia> it = this.dias.listIterator();
        boolean find = false;
        while(it.hasNext() && !find){
            retorno = it.next();
            find = retorno.isThis(fecha);
        }
        if(!find){
           retorno = null; 
        }
        return retorno;
    }
    
    
    void agregarDia(GregorianCalendar fecha, GregorianCalendar entrada, GregorianCalendar salida) throws Exception {
        this.getDias();
        Dia aux = this.buscarDia(fecha.get(Calendar.DAY_OF_MONTH));
        if(aux == null){
            aux = new Dia(fecha, entrada, salida);
            this.dias.add(aux);
            Empresa.getPersistencia().update(this);
        }else{
            throw new Exception("Ya existe el Día " + fecha.get(Calendar.DAY_OF_MONTH) + " en el mes  " + this.mes);
        }
    }
    
    //Getters And Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Dia> getDias() {
        return dias;
    }

    public void setDias(List<Dia> dias) {
        this.dias = dias;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public void agregarDia(Dia unDia){
        //s;ldkfj;aklshd n;lfkhas;ldf;lakshnd;fkjas;la
    }

}
