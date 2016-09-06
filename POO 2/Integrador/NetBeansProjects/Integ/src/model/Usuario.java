/***********************************************************************
 * Module:  Usuario.java
 * Author:  Adamantium
 * Purpose: Defines the Class Usuario
 ***********************************************************************/

package model;

public class Usuario {

   private String nombreUsuario;
   private String clave;
   private Persona unaPersona;

    public Usuario() {
        this.nombreUsuario = "";
        this.clave = "";
        this.unaPersona = null;
    }
    
    public Usuario(String nombre, String pass) {
        this.nombreUsuario = nombre;
        this.clave = pass;
        Empresa.getPersistencia().insert(this);
    }
   
   
   
   /** Verificar que la clave ingresada para el usuario sea correcta. En caso afirmativo devuelve True, en caso de no coincidir devuelve False.
    * 
    * @param clave
    * @return 
    */
   public boolean verificarClave(String clave) {
      boolean retorno = false;
       if (this.clave.equals(clave)){
          retorno = true;
      }
      return retorno;
   }

   public void asociarPersona(Persona persona){
       this.unaPersona = persona;
   }
   
   public boolean isThis(String usuario){
      boolean retorno = false;
       if (this.nombreUsuario.equals(usuario)){
          retorno = true;
      }
      return retorno; 
   }
   
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Persona getUnaPersona() {
        return unaPersona;
    }

    public void setUnaPersona(Persona unaPersona) {
        this.unaPersona = unaPersona;
    }
   
   

}