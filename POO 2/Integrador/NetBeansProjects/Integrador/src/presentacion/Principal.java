/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * principal.java
 *
 * Created on 03-jul-2015, 20:49:29
 */

package presentacion;
import modelo.Empresa;
/**
 *
 * @author Adamantium
 */
public class Principal extends javax.swing.JFrame {

    private Empresa empresa;
    
    /** Creates new form principal */
    public Principal() {
        initComponents();
    }

    public Principal(Empresa unEmpresa) {
        this.empresa = unEmpresa;
        initComponents();
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        desktopPane = new javax.swing.JDesktopPane();
        jSeparator2 = new javax.swing.JSeparator();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JSeparator();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JSeparator();
        jMenuItem18 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JSeparator();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema tu carrito");
        setResizable(false);

        desktopPane.add(jSeparator2);
        jSeparator2.setBounds(90, 80, 0, 2);

        jMenu1.setText("Gestion");

        jMenu4.setText("Cliente");

        jMenuItem4.setText("Agregar");
        jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem4MouseClicked(evt);
            }
        });
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem5.setText("Buscar");
        jMenu4.add(jMenuItem5);

        jMenu1.add(jMenu4);

        jMenu5.setText("Especialista");

        jMenuItem7.setText("Agregar");
        jMenu5.add(jMenuItem7);

        jMenuItem6.setText("Buscar");
        jMenu5.add(jMenuItem6);

        jMenu1.add(jMenu5);
        jMenu1.add(jSeparator1);

        jMenu9.setText("Vehículo");

        jMenuItem9.setText("Agregar");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem9);

        jMenuItem8.setText("Buscar");
        jMenu9.add(jMenuItem8);

        jMenu1.add(jMenu9);

        jMenu6.setText("Marca");

        jMenuItem11.setText("Agregar");
        jMenu6.add(jMenuItem11);

        jMenuItem10.setText("Buscar");
        jMenu6.add(jMenuItem10);

        jMenu1.add(jMenu6);

        jMenu7.setText("Modelo");

        jMenuItem13.setText("Agregar");
        jMenu7.add(jMenuItem13);

        jMenuItem12.setText("Buscar");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem12);

        jMenu1.add(jMenu7);
        jMenu1.add(jSeparator3);

        jMenu8.setText("Problema");

        jMenuItem15.setText("Agregar");
        jMenu8.add(jMenuItem15);

        jMenuItem14.setText("Buscar");
        jMenu8.add(jMenuItem14);

        jMenu1.add(jMenu8);

        jMenu10.setText("Repuesto");

        jMenuItem17.setText("Agregar");
        jMenu10.add(jMenuItem17);

        jMenuItem16.setText("Buscar");
        jMenu10.add(jMenuItem16);

        jMenu1.add(jMenu10);

        menuBar.add(jMenu1);

        jMenu3.setText("Servicio");

        jMenuItem1.setText("Solicitud de Servicio");
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Buscar Servicio");
        jMenu3.add(jMenuItem2);
        jMenu3.add(jSeparator5);

        jMenuItem18.setText("Finalización de Servicio");
        jMenu3.add(jMenuItem18);
        jMenu3.add(jSeparator4);

        menuBar.add(jMenu3);

        jMenu2.setText("Especialista");

        jMenuItem3.setText("Ver Turnos");
        jMenu2.add(jMenuItem3);

        menuBar.add(jMenu2);

        jMenu11.setText("Servicio");
        menuBar.add(jMenu11);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        VtnAgregarCliente ventana = new VtnAgregarCliente(empresa);
        ventana.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4MouseClicked

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        VtnAgregarVehiculo VtnVehiculo = new VtnAgregarVehiculo();
        VtnVehiculo.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenuItem12ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}