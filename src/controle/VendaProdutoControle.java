/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Oscar Iago
 */
public class VendaProdutoControle extends AbstractTableModel {

    private List lista;

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return 0;
    }

    public String getColumnName(int column) {
        if (column == 0) {
            return "";
        }
        if (column == 1) {
            return "";
        }
        if (column == 2) {
            return "";
        }
        if (column == 3) {
            return "";
        }
        if (column == 4) {
            return "";
        }

        return "";
    }

}


