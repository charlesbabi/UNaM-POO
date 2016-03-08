package model;

import java.util.GregorianCalendar;

/**  <editor-fold defaultstate="collapsed" desc=" UML Marker ">
 *  #[regen=yes,id=DCE.317FE082-359C-FF49-C289-D1467E3A1042]
 *  </editor-fold>
 * 
 * @pdOid 7a11e306-381d-483a-9ea3-5252a31afba1 */
public class Persona {

   private String dni;
   private String apellido;
   private String nombre;
   private GregorianCalendar fechaDeNacimiento;
   private String telefono;
   private Usuario usuario;
   private boolean estado;

   public Persona (){
       this.usuario = null;
       this.estado = true;
   }
   
    public Persona(String dni, String apellido, String nombre, GregorianCalendar fechaDeNacimiento, String telefono) {
        this();
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    //metodos especificos
    public void cambiarEstado(){
        estado = estado != true;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario unUsuario) {
        this.usuario = unUsuario;
    }

    public GregorianCalendar getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(GregorianCalendar fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}