/***********************************************************************
 * Module:  Agenda.java
 * Author:  Adamantium
 * Purpose: Defines the Class Agenda
 ***********************************************************************/

package model;

import java.text.SimpleDateFormat;
import java.util.*;

public class Agenda {
    
   private String id;
   private List < Dia> dias;
   private Especialista especialista;

   public Agenda(){
       this.dias = new ArrayList <Dia>();
   }
   
    public Agenda(String id, Especialista especialista) {
        this();
        this.id = id;
        this.especialista = especialista;
        Empresa.getPersistencia().insert(this);
    }
    
    /** Agrega un dia a la agenda.
     *
     * @param fecha
     * @param entrada
     * @param salida
     * @throws java.lang.Exception
     */
    public void agregarDia(GregorianCalendar fecha, GregorianCalendar entrada, GregorianCalendar salida) throws Exception{
        this.getDias();
        Iterator<Dia> it = this.dias.iterator();
        while(it.hasNext()){
            GregorianCalendar auxFecha = it.next().getFecha();
            GregorianCalendar auxFecha2 = fecha;
            horaCero(auxFecha);
            horaCero(auxFecha2);
            //SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            if(!auxFecha.equals(auxFecha2)){
                Dia dia = new Dia(fecha, entrada, salida);
                this.dias.add(dia);
                Empresa.getPersistencia().update(this);
                //throw new Exception ("Ya existe " + sdf.format(auxFecha2.getTime()) +" dia en la agenda.");
            }
        }
    }
    
    private void horaCero(GregorianCalendar time){
        time.set(Calendar.HOUR_OF_DAY, 00);
        time.set(Calendar.MINUTE, 00);
        time.set(Calendar.SECOND, 00);
        time.set(Calendar.MILLISECOND, 00);
    }

    public void agregarDiasEnRangoDeFecha(GregorianCalendar desde, GregorianCalendar hasta, GregorianCalendar entrada, GregorianCalendar salida,int dias[]) throws Exception{
        int i, size = dias.length;
        if (size > 0) {
            if (desde.before(hasta) || !desde.equals(hasta)) {
                //hasta.add(Calendar.DAY_OF_MONTH, 1);
                while(desde.before(hasta)){
                    i = 0;
                    while(i < size){
                        if (desde.get(Calendar.DAY_OF_WEEK) == (dias[i] + 1)) {
                            agregarDia(desde, entrada, salida);
                        }
                        i++;
                    }
                    desde.add(Calendar.DAY_OF_MONTH, 1);
                }
            } else {
                throw new Exception("La fecha final debe ser mayor que la inicial.");
            }
        } else {
            throw new Exception("Debe seleccionar los dias para agregar la agenda.");
        }
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public  List < Dia> getDias() {
        return dias;
    }

    public void setDias( List < Dia> dias) {
        this.dias = dias;
    }

    public Especialista getEspecialista() {
        return especialista;
    }

    public void setEspecialista(Especialista especialista) {
        this.especialista = especialista;
    }

}