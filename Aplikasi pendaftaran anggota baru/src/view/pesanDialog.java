/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class pesanDialog {
    public int tampilkanPilihan(String pesan, String judul, Object[] opsiPilihan){        
        return JOptionPane.showOptionDialog(null, pesan, judul, JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, opsiPilihan, opsiPilihan[0]);
    }
}
