/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import com.toedter.calendar.JDateChooser;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Adamantium
 */
public class Modulo {
    
    public static boolean verificarCamposVacios(String texto){
        boolean retorno = true;
        if (texto.isEmpty()) {
            retorno = false;
        }
        return retorno;
    }
    
    public static boolean soloNumerosEvento(java.awt.event.KeyEvent evt) {                                  
        boolean retorno = true;
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            retorno = false;
        }
        return retorno;
    }  
    
    public boolean soloNumeros(String texto){
        boolean retorno = false;
        if (retorno) {
            
        } else {
        }
        return retorno;        
    }

    /** Pasar de DateChooser a Gregorian Calendar
    * Este metodo pasa los años, mes y dias. Inicia en 0 las horas, minutos y segundos.
     * @param unDate
     * @return GregorianCalendar
     * @throws java.lang.Exception
    */
    public static GregorianCalendar DateChooserToGregorianCalendar(JDateChooser unDate) throws Exception{
        GregorianCalendar fecha = null;
        if (unDate != null) {
            fecha = new GregorianCalendar(unDate.getCalendar().get(Calendar.YEAR), unDate.getCalendar().get(Calendar.MONTH), unDate.getCalendar().get(Calendar.DAY_OF_MONTH),00,00,00);
        } else {
            throw new Exception("Ingrese un JDateChooser Válido para transformar a Gregorian Calendar.");
        }        
        return fecha;   
    }
    
}
