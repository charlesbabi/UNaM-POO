/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package integrador;

import modelo.Empresa;
import presentacion.VtnPrincipal;

/**
 *
 * @author Adamantium
 */
public class Main {

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
            VtnPrincipal ventana = new VtnPrincipal(empresa);
            ventana.setVisible(true);        
    }

}
