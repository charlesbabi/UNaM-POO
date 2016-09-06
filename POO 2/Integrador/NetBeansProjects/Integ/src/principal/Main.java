/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package principal;

import GUI.Login;
import model.Empresa;
import GUI.VtnPrincipal;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author Adamantium
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        try {
            Empresa empresa = null;
            empresa = (Empresa) Empresa.getPersistencia().get("model.Empresa", 1);
            if (empresa == null){
                empresa = new Empresa("Empresa 01", "Calle falsa 123");
            }
            //Usuario user = empresa.buscarUsuario("admin");
            if(!empresa.existeUsuario("admin")){
                empresa.crearUsuario("admin", "admin");
                //empresa.agregarEspecialista("admin", "admin", "amdin", null, null, null);
            }
            Login vtnLogin = new Login(empresa);
            vtnLogin.setLocationRelativeTo(null);
            vtnLogin.setVisible(true);
            /*
            VtnPrincipal ventana = new VtnPrincipal(empresa);
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
            */
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
            
    }

}
