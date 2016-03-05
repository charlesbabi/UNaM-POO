/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JTextField;

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

    
}
