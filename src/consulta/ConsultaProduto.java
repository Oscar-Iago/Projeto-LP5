/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consulta;

import bean.OibProduto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Oscar Iago
 */
public class ConsultaProduto extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       
        OibProduto oibProduto = (OibProduto) lista.get(rowIndex);
        

        if (columnIndex == 0) {
            return oibProduto.getOibNome();
        }
        if (columnIndex == 1) {
            return oibProduto.getOibPreco();
        }
        if (columnIndex == 2) {
            return oibProduto.getOibEspecie();
        }
        return null;
         
    }
    
        public String getColumnName(int column) {
        if (column == 0) {
            return "Nome";
        }
        if (column == 1) {
            return "Preco";
        }
        if (column == 2) {
            return "Especie";
        }

        return "";
    }

}
