/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Adamantium
 */
public class Funciones {
    
    /** Reinicia en 0 las horas minutos y segundos de el GregorianCalendar pasado como paramentro.
     * 
     * @param time 
     * @return  
     */
    public static GregorianCalendar horaCero(GregorianCalendar time){
        time.set(Calendar.HOUR_OF_DAY, 00);
        time.set(Calendar.MINUTE, 00);
        time.set(Calendar.SECOND, 00);
        time.set(Calendar.MILLISECOND, 00);
        return time;
    }
}
