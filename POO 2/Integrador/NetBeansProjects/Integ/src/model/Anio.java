/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Adamantium
 */
public class Anio {
    
    private int id;
    private int anio;
    private List <Mes> meses;

    public Anio() {
        this.meses = new ArrayList();
    }
    
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
            find = retorno.isThis(anio);
        }
        return retorno; 
    }
    
    /**Agrega un mes en el año, si no existe devuelve una excepcion
     * 
     * @param mes
     * @throws Exception 
     */
    public void agregarMes(int mes) throws Exception{
        this.getMeses();
        Mes aux = this.buscarMes(mes);
        if(aux == null){
            aux = new Mes(mes);
            this.meses.add(aux);
            Empresa.getPersistencia().update(this);
        }else{
            throw new Exception("Ya existe el año " + mes + " en el año  " + this.anio);
        }
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
