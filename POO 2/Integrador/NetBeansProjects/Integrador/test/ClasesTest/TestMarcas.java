/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesTest;

import modelo.Empresa;
import presentacion.VtnGestionarMarcas;
import junit.framework.TestCase;

/**
 *
 * @author Adamantium
 */
public class TestMarcas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Empresa empresa = null;
            empresa = (Empresa) Empresa.getPersistencia().get("modelo.Empresa", 1);
            if (empresa == null){
                empresa = new Empresa(1,"Empresa 01", "Calle falsa 123");
            }
            VtnGestionarMarcas ventana = new VtnGestionarMarcas(empresa);
            ventana.setVisible(true);  
    }
    
}
