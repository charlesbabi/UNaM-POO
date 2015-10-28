package modelo;

import persistencia.Persistencia;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.55C0D6C2-28C2-73EC-586F-B26CE0EF80AC]
// </editor-fold> 
public class Persona {

    private int dni;
    private String nombre;
    private String apellido;
    private String telefono;

    public Persona () {
    }

    public Persona(int dni, String nombre, String apellido, String telefono) {
        this();
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public int getDni () {
        return dni;
    }

    public void setDni (int val) {
        this.dni = val;
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String val) {
        this.nombre = val;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
}

