/***********************************************************************
 * Module:  Problema.java
 * Author:  Adamantium
 * Purpose: Defines the Class Problema
 ***********************************************************************/

package model;

public class Problema {
   private int id;
   private String descripcion;
   private int duracion;

    public Problema() {
    }

    public Problema(String descripcion, int duracion) {
        this.descripcion = descripcion;
        this.duracion = duracion;
        Empresa.getPersistencia().insert(this);
    }
    
    public boolean isThis(String descripcion){
        boolean retorno = false;
        if(this.descripcion.equals(descripcion)){
            retorno = true;
        }
        return retorno;
    }
   
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

   @Override
    public String toString(){
        return this.descripcion + ": " + this.duracion;
    }
}