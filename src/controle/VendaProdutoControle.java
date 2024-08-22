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
    }

    public OibVendaproduto getBean(int row) {
        return (OibVendaproduto) lista.get(row);
    }

    public void addList(VendaProduto vendaProduto) {
        lista.add(vendaProduto);
    }
    public void removeList(VendaProduto vendaProduto) {
        lista.add(vendaProduto);
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
        VendaProduto vendaProduto = (VendaProduto) lista.get(rowIndex);
        if (columnIndex == 0) {
            return vendaProduto.getProduto().getidOibVenda();
        }
        if (columnIndex == 1) {
            return vendaProduto.getProduto().getidOibVenda();
        }
        if (columnIndex == 2) {
            return vendaProduto.getProduto().getidOibVenda();
        }
        if (columnIndex == 3) {
            return vendaProduto.getProduto().getidOibVenda();
        }
        if (columnIndex == 4) {
            return vendaProduto.getProduto().getidOibVenda();
        }
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
