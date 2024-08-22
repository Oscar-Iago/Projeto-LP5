/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import bean.OibUsuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Oscar Iago
 */
public class UsuariosControle extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }

    public OibUsuario getBean(int row) {
        return (OibUsuario) lista.get(row);
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
        OibUsuario oibUsuario = (OibUsuario) lista.get(rowIndex);
        if( columnIndex == 0){
            return oibUsuario.getIdOibUsuario();
        }
        if( columnIndex == 1){
            return oibUsuario.getOibNome();
        }
        if( columnIndex == 2){
            return oibUsuario.getOibApelido();
        }
        if( columnIndex == 3){
            return oibUsuario.getOibCpf();
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
            return "Senha";
        }

        return "";
    }

}
