/***********************************************************************
 * Module:  Problema.java
 * Author:  Adamantium
 * Purpose: Defines the Class Problema
 ***********************************************************************/

package model;

import java.util.*;

public class Problema {
   private int id;
   private String descripcion;
   private int duracion;

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

   
   
}