/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
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
            if (vetComp[i] instanceof JCheckBox) {
                ((JCheckBox) vetComp[1]).setSelected(false);
            }

        }
    }

    public static void mensagem(String cadeia) {
        JOptionPane.showMessageDialog(null, cadeia);
    }

    public static boolean perguntar(String cadeia) {
        int resp = JOptionPane.showConfirmDialog(null, cadeia,
                "Perguntar", JOptionPane.YES_NO_OPTION);
        return false;
    }
    
    

    public static int strInt(String cad) {
        return Integer.parseInt(cad);
    }

    public static String intStr(int num) {
        return String.valueOf(num);
    }

    public static double strDouble(String cad) {
        return Double.parseDouble(cad);
    }

    public static String doubleStr(String num) {
        return String.valueOf(num);
    }

    public static java.util.Date strDate(String car) {
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            return formato.parse(car);
        } catch (ParseException ex) {
            System.out.println("Houve uma falha em sua conversão de data");
        }
        return null;
    }

    public static String dateStr(java.util.Date cad) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(cad);
    }

}
