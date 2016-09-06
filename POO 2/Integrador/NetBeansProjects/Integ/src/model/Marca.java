/***********************************************************************
 * Module:  Marca.java
 * Author:  Babi, John Charles
 * Purpose: Defines the Class Marca
 ***********************************************************************/

package model;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class Marca {

   private String nombre;
   private float valorPorHora;
   private List modelos;
   private Map especialistas;

   /**constructor nulo
    * 
    */
   public Marca(){
        this.modelos = new ArrayList ();
        this.especialistas = new HashMap();
   }
   
    /**Constructor crea una marca.
    * 
    * @param nombre
    * @param valorPorHora 
    */
    public Marca(String nombre, float valorPorHora) {
        this();
        this.nombre = nombre;
        this.valorPorHora = valorPorHora;
        Empresa.getPersistencia().insert(this);
    }
    
    /** Muestra el [nombre - Valor por hora] de la marca.
     * 
     * @return 
     */
    @Override
    public String toString(){
        return nombre + " - " + valorPorHora;
    }
       
    /** Agrega un modelo a la lista de marcas y actualiza la bd.
      * 
      * @param unModelo 
      */
    public void agregarModelo(Modelo unModelo) {
        this.getModelos();
        this.modelos.add(unModelo);
        //Empresa.getPersistencia().update(this);
    }

    /**Asocia un especialista a la marca y actualiza la bd.
     * 
     * @param unEspecialista 
     */
    public void asociarEspecialista(Especialista unEspecialista) {
        this.getEspecialistas();
        this.especialistas.put(unEspecialista.getDni(), unEspecialista);
        //Empresa.getPersistencia().update(this);
    }
    
    //Getters and Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public float getValorPorHora() {
        return valorPorHora;
    }
    public void setValorPorHora(float valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
    public List getModelos() {
        return modelos;
    }
    public void setModelos(List modelos) {
        this.modelos = modelos;
    }
    public Map getEspecialistas() {
        return especialistas;
    }
    public void setEspecialistas(Map especialistas) {
        this.especialistas = especialistas;
    }
}