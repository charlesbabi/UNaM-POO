/***********************************************************************
 * Module:  Agenda.java
 * Author:  Adamantium
 * Purpose: Defines the Class Agenda
 ***********************************************************************/

package model;

import java.util.*;

/** @pdOid e98ad5a0-63cd-4435-be10-8e700fcd9743 */
public class Agenda {
   /** @pdOid 00d1aeb4-ded9-4319-9297-e204bf106cca */
   private String id;
   /** @pdOid e2b80fae-e3e1-4077-b0da-b47719afe780 */
   private Map <GregorianCalendar, Dia> dias;
   private Especialista especialista;

   public Agenda(){
       this.dias = new HashMap();
   }
   
    public Agenda(String id, Especialista especialista) {
        this();
        this.id = id;
        this.especialista = especialista;
        Empresa.getPersistencia().insert(this);
    }
    
    /** Agrega un dia a la agenda.
     *
     * @param unDia
     * @throws java.lang.Exception
     */
    public void agregarDias(Dia unDia) throws Exception{
        if(!this.dias.containsValue(unDia)){
            this.dias.put(unDia.getFecha(), unDia);
        }else{
            throw new Exception ("Ya existe ese dia en la agenda.");
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<GregorianCalendar, Dia> getDias() {
        return dias;
    }

    public void setDias(Map<GregorianCalendar, Dia> dias) {
        this.dias = dias;
    }

    public Especialista getEspecialista() {
        return especialista;
    }

    public void setEspecialista(Especialista especialista) {
        this.especialista = especialista;
    }

}