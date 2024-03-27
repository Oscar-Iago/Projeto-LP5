/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JTextField;

/**
 *
 * @author u06539293151
 */
public class Util {

    public static void habilitar(boolean valor, JComponent... vetComp) {
        for (int i = 0; i < vetComp.length; i++) {
            vetComp[i].setEnabled(valor);
        }
    }

    public static void limparCampos(JComponent... vetComp) {
        for (int i = 0; i < vetComp.length; i++) {
            if (vetComp[i] instanceof JTextField) {
                ((JTextField) vetComp[1]).setText("");
            }
            if (vetComp[i] instanceof JComboBox) {
                ((JComboBox) vetComp[1]).setSelectedIndex(-1);
            }
            if (vetComp[i] instanceof JComboBox) {
                ((JComboBox) vetComp[1]).setSelectedIndex(-1);
            }

        }
    }
}
