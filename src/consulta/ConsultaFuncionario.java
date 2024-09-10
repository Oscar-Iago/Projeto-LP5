/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consulta;

import bean.OibFuncionario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Oscar Iago
 */
public class ConsultaFuncionario extends AbstractTableModel {

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
       
        OibFuncionario oibFuncionario = (OibFuncionario) lista.get(rowIndex);
        

        if (columnIndex == 0) {
            return oibFuncionario.getOibNome();
        }
        if (columnIndex == 1) {
            return oibFuncionario.getOibCpf();
        }
        if (columnIndex == 2) {
            return oibFuncionario.getOibFuncao();
        }
        return null;
         
    }
    
        public String getColumnName(int column) {
        if (column == 0) {
            return "Nome";
        }
        if (column == 1) {
            return "CPF";
        }
        if (column == 2) {
            return "Função";
        }

        return "";
    }
    
}
