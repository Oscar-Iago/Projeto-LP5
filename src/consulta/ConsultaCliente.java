/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consulta;

import bean.OibCliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Oscar Iago
 */
public class ConsultaCliente extends AbstractTableModel {

    private List lista;
    
    public void setList(List lista){
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
       
        OibCliente oibCliente = (OibCliente) lista.get(rowIndex);
        
        if (columnIndex == 0) {
            return oibCliente.getIdOibCliente();
        }
        if (columnIndex == 1) {
            return oibCliente.getOibNome();
        }
        if (columnIndex == 2) {
            return oibCliente.getOibCpf();
        }
        return null;
         
    }
    
        public String getColumnName(int column) {
        if (column == 0) {
            return "Id";
        }
        if (column == 1) {
            return "Nome";
        }
        if (column == 2) {
            return "CPF";
        }

        return "";
    }
    
}