/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;
import model.Empresa;
import model.Especialista;
import model.Marca;

/**
 *
 * @author Adamantium
 */
public class VtnAltaDeEspecialista extends javax.swing.JFrame {

    /**
     * Creates new form VtnAltaDeEspecialista
     */
    private Empresa emp = null;
    private boolean modificar = false;
    public VtnAltaDeEspecialista() {
        initComponents();
    }
    
    public VtnAltaDeEspecialista(Empresa emp) {
        initComponents();
        this.emp = emp;
        actualizarComboMarcas();
    }

    public VtnAltaDeEspecialista(Empresa unaEmpresa, Especialista tipo) {
        initComponents();
        this.emp = unaEmpresa;        
        this.modificar = true;
        BtnAceptar.setText("Modificar");        
        TxtDNI.setText(tipo.getDni());
        TxtDNI.disable();
        TxtApellido.setText(tipo.getApellido());
        TxtNombre.setText(tipo.getNombre());
        TxtTelefono.setText(tipo.getTelefono());
        DateNacimiento.setCalendar(tipo.getFechaDeNacimiento());
        CbMarcas.setSelectedItem(tipo.getMarca());
        lblTitulo.setText("Modificar Especialista");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnAceptar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        TxtTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtDNI = new javax.swing.JTextField();
        TxtApellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CbMarcas = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        DateNacimiento = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BtnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/accept.png"))); // NOI18N
        BtnAceptar.setText("Aceptar");
        BtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarActionPerformed(evt);
            }
        });

        BtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancel.png"))); // NOI18N
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel6.setText("Ingresar solo numeros");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 34)); // NOI18N
        lblTitulo.setText("Alta de Especialista");

        jLabel4.setText("Telefono");

        jLabel3.setText("Nombre:");

        TxtDNI.setName(""); // NOI18N
        TxtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtDNIKeyTyped(evt);
            }
        });

        TxtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApellidoActionPerformed(evt);
            }
        });

        jLabel2.setText("Apellido:");

        jLabel1.setText("D.N.I.:");

        jLabel7.setText("Marca");

        jLabel8.setText("Fecha de Nacimiento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CbMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblTitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DateNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(TxtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(BtnAceptar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnCancelar))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(121, 121, 121))
                                        .addComponent(TxtApellido))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)))))
                        .addContainerGap(13, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DateNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CbMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAceptar)
                    .addComponent(BtnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarActionPerformed
        try {
            if (modificar == false) {
                if (CbMarcas.getSelectedIndex() >= 0) {
                    GregorianCalendar fecha = new GregorianCalendar(DateNacimiento.getCalendar().get(Calendar.YEAR), Calendar.MONTH, Calendar.DAY_OF_MONTH);
                    this.emp.agregarEspecialista(TxtDNI.getText(), TxtNombre.getText(), TxtApellido.getText(), fecha, TxtTelefono.getText(), (Marca) CbMarcas.getSelectedItem());
                } else {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar una marca");
                }
            } else if (modificar == true) {
                GregorianCalendar fecha = new GregorianCalendar(DateNacimiento.getCalendar().get(Calendar.YEAR), Calendar.MONTH, Calendar.DAY_OF_MONTH);
                this.emp.modificarEspecialista(TxtDNI.getText(), TxtNombre.getText(), TxtApellido.getText(), fecha, TxtTelefono.getText(), (Marca) CbMarcas.getSelectedItem());
            }
            
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_BtnAceptarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void actualizarComboMarcas(){
        CbMarcas.removeAllItems();
        Map lista = this.emp.getMarcas();
        if (lista.size() > 0) {
            Iterator<Marca>  it = lista.values().iterator();
            while(it.hasNext()){
                CbMarcas.addItem(it.next());
            }
        } else {
            JOptionPane.showMessageDialog(this, "No existe ninguna marca en el sistema. Por favor registre una para poder asignarle al especialista.");
        }
    }
    
    private void TxtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtDNIKeyTyped
        if(!Modulo.soloNumerosEvento(evt)){
            evt.consume();
        }
    }//GEN-LAST:event_TxtDNIKeyTyped

    private void TxtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApellidoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VtnAltaDeEspecialista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnAltaDeEspecialista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnAltaDeEspecialista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnAltaDeEspecialista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnAltaDeEspecialista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JComboBox CbMarcas;
    private com.toedter.calendar.JDateChooser DateNacimiento;
    private javax.swing.JTextField TxtApellido;
    private javax.swing.JTextField TxtDNI;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
