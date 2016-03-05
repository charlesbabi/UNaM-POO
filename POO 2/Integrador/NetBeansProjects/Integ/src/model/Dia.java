/***********************************************************************
 * Module:  Dia.java
 * Author:  Adamantium
 * Purpose: Defines the Class Dia
 ***********************************************************************/

package model;

import java.util.*;

/** @pdOid aebe4f6b-c403-4f45-8e54-83b1c7476155 */
public class Dia {
   /** @pdOid 8cb14bd9-0e29-4991-b840-e0c128c1f427 */
   private GregorianCalendar fecha;
   /** @pdOid 3c193e61-91f5-4995-abeb-c66d17788ec7 */
   private List <Horario> horarios;
   /** @pdOid ef35c7ad-5b7e-4095-b213-65fe727fd659 */
   private List <Servicio> servicios;
   

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

   
}