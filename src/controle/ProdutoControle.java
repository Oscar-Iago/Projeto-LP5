/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import bean.OibProduto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Oscar Iago
 */
public class ProdutoControle extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
    }

    public OibProduto getBean(int row) {
        return (OibProduto) lista.get(row);
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        OibProduto oibProduto = (OibProduto) lista.get(rowIndex);
        if (columnIndex == 0) {
            return oibProduto.getIdOibProduto();
        }
        if (columnIndex == 1) {
            return oibProduto.getOibNome();
        }
        if (columnIndex == 2) {
            return oibProduto.getOibEspecie();
        }
        if (columnIndex == 3) {
            return oibProduto.getOibQuantidade();
        }
        if (columnIndex == 4) {
            return oibProduto.getOibPreco();
        }
        if (columnIndex == 5) {
            return oibProduto.getOibCor();
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
            return "Especie";
        }
        if (column == 3) {
            return "Quantidade";
        }
        if (column == 4) {
            return "Preco";
        }
        if (column == 5) {
            return "Cor";
        }

        return "";
    }

}
