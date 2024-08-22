/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import bean.OibCliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Oscar Iago
 */
public class ClientesControle extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
    }

    public OibCliente getBean(int row) {
        return (OibCliente) lista.get(row);
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
        OibCliente oibCliente = (OibCliente) lista.get(rowIndex);
        if (columnIndex == 0) {
            return oibCliente.getIdOibCliente();
        }
        if (columnIndex == 1) {
            return oibCliente.getOibNome();
        }
        if (columnIndex == 2) {
            return oibCliente.getOibSobrenome();
        }
        if (columnIndex == 3) {
            return oibCliente.getOibGenero();
        }
        if (columnIndex == 4) {
            return oibCliente.getOibCpf();
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
            return "Sobrenome";
        }
        if (column == 3) {
            return "Genero";
        }
        if (column == 4) {
            return "CPF";
        }

        return "";
    }

}
