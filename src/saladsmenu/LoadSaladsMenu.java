
package saladsmenu;

import javax.swing.table.DefaultTableModel;

public class LoadSaladsMenu {
    
    
    public DefaultTableModel loadSaladsMenu(){
        DefaultTableModel model = new DefaultTableModel(){
            @Override
                public Class getColumnClass(int column) {
                    switch (column) {
                        case 0: 
                            return String.class;
                        case 1: 
                            return String.class;
                        case 2: 
                            return Boolean.class;
                        default:
                            return String.class; 
                        
                    }
                }
        };
        String[] columnNames = {"Tipo", "Precio", "Con Aderezo*"}; 
        Object[][] data = {
            {"Chica", "35", true},
        {"Mediana", "45", false},
        {"Grande", "55", true}
        };
        model.setDataVector(data, columnNames);
        
        return model; 
    }
    
     public String[] cargaNombreCol() {
        String[] col = {"Tipo", "Precio", "Cantidad", "Total"}; 
        
        return col;
    }
}
