/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Empresa;
import modelo.Especialista;
import modelo.Horario;
import modelo.Vehiculo;

/**
 *
 * @author Adamantium
 */
public class VtnSolicitudServicio extends javax.swing.JFrame {

    private Empresa emp;
    private GregorianCalendar diaSeleccionado;
    private Especialista[][][] horariosDeTrabajo;
    private int diasMostrados = 8;
    /**
     * Creates new form VtnSolicitudServicio
     */
    VtnSolicitudServicio() {
        initComponents();
             
    }

    VtnSolicitudServicio(Empresa emp) {
        this();
        this.emp = emp;
        this.diaSeleccionado = new GregorianCalendar();
        
        CalFecha.getDayChooser().addPropertyChangeListener(
                new java.beans.PropertyChangeListener() {
 
                    @Override
                    public void propertyChange(java.beans.PropertyChangeEvent evt) {
                        //evt.getPropertyName().
                        if (evt.getPropertyName().compareTo("day") == 0) {
                            //SimpleDateFormat formatoDeFecha = new SimpleDateFormat("dd/MM/yyyy");
                            diaSeleccionado = (GregorianCalendar) CalFecha.getCalendar();
                            llenarTabla();
                            //JOptionPane.showMessageDialog(rootPane, CalFecha.getDate());
                            //txtFechaSeleccionada.setText(formatoDeFecha.format(cldFecha.getDate()));
                        }
                    }
                });    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtDni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtApellidoYNombre = new javax.swing.JTextField();
        BtnBuscarCliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        ComboVehiculos = new javax.swing.JComboBox();
        CalFecha = new com.toedter.calendar.JCalendar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BtnBuscarEspecialista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setToolTipText("Cliente");

        jLabel1.setText("Cliente DNI");

        TxtDni.setText("35006321");

        jLabel2.setText("Apellido y Nombre");

        TxtApellidoYNombre.setEditable(false);
        TxtApellidoYNombre.setText("jTextField1");
        TxtApellidoYNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApellidoYNombreActionPerformed(evt);
            }
        });

        BtnBuscarCliente.setText("Buscar");
        BtnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BtnBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(TxtDni)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(TxtApellidoYNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtApellidoYNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnBuscarCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Vehiculos"));
        jPanel2.setToolTipText("Vehiculos");

        ComboVehiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComboVehiculosMouseClicked(evt);
            }
        });
        ComboVehiculos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboVehiculosItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ComboVehiculos, 0, 210, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(ComboVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CalFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CalFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CalFechaMouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        BtnBuscarEspecialista.setText("Buscar Turnos");
        BtnBuscarEspecialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarEspecialistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CalFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscarEspecialista))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CalFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnBuscarEspecialista))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtApellidoYNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApellidoYNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApellidoYNombreActionPerformed
    
    private void BtnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarClienteActionPerformed
        // TODO add your handling code here:       
        
        TxtApellidoYNombre.setText("");
        ComboVehiculos.removeAllItems();
        
        if (TxtDni.getText().length() > 5){
            try {
                this.emp.getClientes();
                Cliente aux;               
                int dniAux = Integer.parseInt(TxtDni.getText());                
                aux = this.emp.buscarCliente(dniAux);                
                Map vehiculos = aux.getVehiculos();                
                if (vehiculos.size() > 0){
                    Iterator it = vehiculos.values().iterator();
                    TxtApellidoYNombre.setText(aux.getApellido() + " " + aux.getNombre());                    
                    while (it.hasNext()){
                        Vehiculo temp = (Vehiculo)it.next();
                        ComboVehiculos.addItem(temp);
                    }
                }else{
                    JOptionPane.showMessageDialog(rootPane, "El cliente no tiene vehiculos asociados.");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Ingrese al menos 6 digitos.");
        }
        
    }//GEN-LAST:event_BtnBuscarClienteActionPerformed

    public void cargarHorariosDeTrabajo(){
        horariosDeTrabajo = new Especialista[diasMostrados][48][];
    }
    
    public void llenarTabla(){
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        ((DefaultTableModel) jTable1.getModel()).setColumnCount(0);
        int i = 0;
        GregorianCalendar dia = (GregorianCalendar) CalFecha.getCalendar();
        SimpleDateFormat formatoDeFecha = new SimpleDateFormat("dd-MM");
        modelo.addColumn(formatoDeFecha.format(dia.getTime()));
        for(i = 0; i < diasMostrados; i++){
            dia.add(Calendar.DAY_OF_YEAR, 1);
            modelo.addColumn(formatoDeFecha.format(dia.getTime()));
        }
        for(i = 1; i < 48; i++){
            modelo.addRow((Object[])(Object)i);
        }
        jTable1.setModel(modelo);
    }
    
    private void ComboVehiculosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboVehiculosItemStateChanged
        try {
            // TODO add your handling code here:
            Vehiculo aux = (Vehiculo) ComboVehiculos.getSelectedItem();
            this.emp.buscarEspecialistasPorMarca(aux.getModelo().getMarca());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }       
    }//GEN-LAST:event_ComboVehiculosItemStateChanged

    private void ComboVehiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboVehiculosMouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Vehiculo aux = (Vehiculo) ComboVehiculos.getSelectedItem();
            this.emp.buscarEspecialistasPorMarca(aux.getModelo().getMarca());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }  
    }//GEN-LAST:event_ComboVehiculosMouseClicked

    private void llenarHorariosDeTrabajo(){
        try {
            // TODO add your handling code here:
            List aux = this.emp.buscarEspecialistasPorMarca(((Vehiculo)ComboVehiculos.getSelectedItem()).getModelo().getMarca());
            Iterator it = aux.iterator();            
            while(it.hasNext()){
                List horAux = ( it.next()).getHorarios();
                Iterator it2 = horAux.iterator();
                while(it2.hasNext()){
                    Horario aux2 = (Horario) it2.next();
                    
                    for (i = aux2.)
                    
                    horariosDeTrabajo[aux2.getDiaEntrada()][aux2.getHorarioEntrada()][] =  aux2;
                }
            }
            llenarTabla();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }   
    }
    
    private void BtnBuscarEspecialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarEspecialistaActionPerformed
             
    }//GEN-LAST:event_BtnBuscarEspecialistaActionPerformed

    private void CalFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalFechaMouseClicked

    }//GEN-LAST:event_CalFechaMouseClicked

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
            java.util.logging.Logger.getLogger(VtnSolicitudServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnSolicitudServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnSolicitudServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnSolicitudServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnSolicitudServicio().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscarCliente;
    private javax.swing.JButton BtnBuscarEspecialista;
    private com.toedter.calendar.JCalendar CalFecha;
    private javax.swing.JComboBox ComboVehiculos;
    private javax.swing.JTextField TxtApellidoYNombre;
    private javax.swing.JTextField TxtDni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}