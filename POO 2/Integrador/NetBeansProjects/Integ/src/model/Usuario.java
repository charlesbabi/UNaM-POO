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
   
   /** @param clave
    * @pdOid ca5e574d-d61c-410e-a00b-b8c3b876947b */
   public boolean verificarClave(String clave) {
      // TODO: implement
      return false;
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