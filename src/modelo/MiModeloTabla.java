package modelo;

import javax.swing.table.DefaultTableModel;


public class MiModeloTabla extends DefaultTableModel {

    @Override
    public boolean isCellEditable(int row, int column) {
       
        boolean editable = true;
        if (column >= 0) {
            editable = false;
        }
        return editable;
    }

}
