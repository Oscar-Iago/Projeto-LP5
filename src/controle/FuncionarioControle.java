/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import bean.OibFuncionario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Oscar Iago
 */
public class FuncionarioControle extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }

    public OibFuncionario getBean(int row) {
        return (OibFuncionario) lista.get(row);
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        OibFuncionario oibFuncionario = (OibFuncionario) lista.get(rowIndex);
        if (columnIndex == 0) {
            return oibFuncionario.getIdOibFuncionario();
        }
        if (columnIndex == 1) {
            return oibFuncionario.getOibNome();
        }
        if (columnIndex == 2) {
            return oibFuncionario.getOibCpf();
        }
        if (columnIndex == 3) {
            return oibFuncionario.getOibFuncao();
        }

        return "";
    }

    public String getColumnName(int column) {
        if (column == 0) {
            return "Id";
        }
        if (column == 1) {
            return "Nome";
        }
        if (column == 2) {
            return "Cpf";
        }
        if (column == 3) {
            return "Funcao";
        }

        return "";
    }

}
