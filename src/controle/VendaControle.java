/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import bean.OibVenda;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Oscar Iago
 */
public class VendaControle extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }

    public OibVenda getBean(int row) {
        return (OibVenda) lista.get(row);
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        OibVenda oibVenda = (OibVenda) lista.get(rowIndex);
        if( columnIndex == 0){
            return oibVenda.getIdOibVenda();
        }
        if( columnIndex == 1){
            return oibVenda.getOibData();
        }
        if( columnIndex == 2){
            return oibVenda.getOibCliente().getIdOibCliente();
        }
        if( columnIndex == 3){
            return oibVenda.getOibFuncionario().getIdOibFuncionario();
        }
        if( columnIndex == 4){
            return oibVenda.getOibTotal();
        }
        
        return "";
    }

    public String getColumnName(int column) {
        if (column == 0) {
            return "Id";
        }
        if (column == 1) {
            return "Data";
        }
        if (column == 2) {
            return "Cliente";
        }
        if (column == 3) {
            return "Funcionario";
        }
        if (column == 4) {
            return "Total";
        }

        return "";
    }

}
