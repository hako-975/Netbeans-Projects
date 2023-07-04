/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author andri
 */
public class TableModelSiswa extends AbstractTableModel {
    List<Siswa> ls;
    
    public TableModelSiswa(List<Siswa> ls) {
        this.ls = ls;
    }

    @Override
    public int getRowCount() {
        return ls.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID Siswa";
            case 1:
                return "Nama Siswa";
            case 2:
                return "No. Telp Siswa";
            case 3:
                return "Alamat Siswa";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return ls.get(rowIndex).getIdSiswa();
            case 1:
                return ls.get(rowIndex).getNamaSiswa();
            case 2:
                return ls.get(rowIndex).getNoTelpSiswa();
            case 3:
                return ls.get(rowIndex).getAlamatSiswa();
            default:
                return null;
        }
    }
    
}
