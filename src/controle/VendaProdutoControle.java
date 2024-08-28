/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import bean.OibVendaproduto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Oscar Iago
 */
public class VendaProdutoControle extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }

    public void addList(OibVendaproduto oibVendaProduto) {
        lista.add(oibVendaProduto);
        this.fireTableDataChanged();
    }

    public void removeList(int row) {
        lista.remove(row);
        this.fireTableDataChanged();
    }
    
    public OibVendaproduto getList(int index) {
        return (OibVendaproduto) lista.get(index);
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
        OibVendaproduto oibVendaProduto = (OibVendaproduto) lista.get(rowIndex);
        if (columnIndex == 0) {
            return oibVendaProduto.getOibProduto().getIdOibProduto();
        }
        if (columnIndex == 1) {
            return oibVendaProduto.getOibProduto().getOibNome();
        }
        if (columnIndex == 2) {
            return oibVendaProduto.getOibQuantidade();
        }
        if (columnIndex == 3) {
            return oibVendaProduto.getOibValorunitario();
        }
        if (columnIndex == 4) {
            return oibVendaProduto.getOibQuantidade() * oibVendaProduto.getOibValorunitario();
        }
        return "";
    }

    public String getColumnName(int column) {
        if (column == 0) {
            return "Codigo";
        }
        if (column == 1) {
            return "Nome";
        }
        if (column == 2) {
            return "Quantidade";
        }
        if (column == 3) {
            return "Valor Unitario";
        }
        if (column == 4) {
            return "Total";
        }

        return "";
    }

}
