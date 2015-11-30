/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Calendar;

/**
 *
 * @author Adamantium
 */
public class Funciones {
    
    public static Calendar horaCero(Calendar fecha){
        fecha.set(Calendar.HOUR_OF_DAY, 0);
        fecha.set(Calendar.MINUTE, 0);
        fecha.set(Calendar.SECOND, 0);
        fecha.set(Calendar.MILLISECOND, 0);
        return fecha;
    }
    
    public static int compararFecha(Calendar fecha1, Calendar fecha2){
        int retorno = 0;
        Calendar auxFecha1, auxFecha2;
        auxFecha1 =  (Calendar)fecha1.clone();
        auxFecha2 =  (Calendar)fecha2.clone();
        
        auxFecha1 =  horaCero(auxFecha1);
        auxFecha2 =  horaCero(auxFecha2);
        
        if(auxFecha1.compareTo(auxFecha2) > 0){
            retorno = 1;
        }else if(auxFecha1.compareTo(auxFecha2) <0){
            retorno = -1;
        }else{
            retorno = 0;
        }
        
        return retorno;
    }
    
    
}
