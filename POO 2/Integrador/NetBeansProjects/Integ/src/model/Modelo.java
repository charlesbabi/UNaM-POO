package model;

public class Modelo {

   private String nombre;

   private Marca marca;
   
   public Modelo(){
       this.nombre = "";
       this.marca = null;
   }
   
    public Modelo(String nombre, Marca marca) {
        this.nombre = nombre;
        this.marca = marca;
        this.marca.agregarModelo(this);  
        Empresa.getPersistencia().insert(this);              
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    @Override
    public String toString(){
        return this.nombre;
    }
   
}