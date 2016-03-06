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

   public Marca(){
        this.modelos = new ArrayList ();
        this.especialistas = new HashMap();
   }
   
    public Marca(String nombre, float valorPorHora) {
        this();
        this.nombre = nombre;
        this.valorPorHora = valorPorHora;
        Empresa.getPersistencia().insert(this);
    }   
    
   @Override
    public String toString(){
        return nombre + " - " + valorPorHora;
    }
   
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
   

   public void agregarModelo(String nombre) {
   }
   

   public void asociarEspecialista(Especialista unEspecialista) {
       
   }

}