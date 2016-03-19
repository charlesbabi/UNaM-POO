/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Adamantium
 */
public class MyTableModel extends DefaultTableModel {
        /** Creates a new instance of MyTableModel */
    public MyTableModel() {
      
    }
    
    
    
    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
}
