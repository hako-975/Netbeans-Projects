/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.DaoSiswa;
import dao.ImplementSiswa;
import java.util.List;
import javax.swing.JOptionPane;
import model.Siswa;
import model.TableModelSiswa;
import view.PendaftaranSiswaForm;

/**
 *
 * @author andri
 */
public class ControllerSiswa {
    PendaftaranSiswaForm form;
    ImplementSiswa implementSiswa;
    List<Siswa> ls = null;
    
    public ControllerSiswa(PendaftaranSiswaForm form) {
        this.form = form;
        implementSiswa = new DaoSiswa();
        ls = implementSiswa.getAll();
    }
    
    public void reset() {
        form.getTxtIdSiswa().setText("");
        form.getTxtNamaSiswa().setText("");
        form.getTxtNoTelpSiswa().setText("");
        form.getTxtAlamatSiswa().setText("");
    }
    
    public void isiTable() {
        ls = implementSiswa.getAll();
        TableModelSiswa tms = new TableModelSiswa(ls);
        form.getTableSiswa().setModel(tms);
    }
    
    public void isiField(int row) {
        form.getTxtIdSiswa().setText(String.valueOf(ls.get(row).getIdSiswa()));
        form.getTxtNamaSiswa().setText(ls.get(row).getNamaSiswa());
        form.getTxtNoTelpSiswa().setText(ls.get(row).getNoTelpSiswa());
        form.getTxtAlamatSiswa().setText(ls.get(row).getAlamatSiswa());
    }
    
    public void insert() {
        Siswa s = new Siswa();
        s.setNamaSiswa(form.getTxtNamaSiswa().getText());
        s.setNoTelpSiswa(form.getTxtNoTelpSiswa().getText());
        s.setAlamatSiswa(form.getTxtAlamatSiswa().getText());
        
        implementSiswa.Insert(s);
    }
    
    public void update() {
        Siswa s = new Siswa();
        s.setNamaSiswa(form.getTxtNamaSiswa().getText());
        s.setNoTelpSiswa(form.getTxtNoTelpSiswa().getText());
        s.setAlamatSiswa(form.getTxtAlamatSiswa().getText());
        s.setIdSiswa(Integer.parseInt(form.getTxtIdSiswa().getText()));
        
        implementSiswa.Update(s);
    }
    
    public void delete() {
        if (!form.getTxtIdSiswa().getText().trim().isEmpty()) {
            int id = Integer.parseInt(form.getTxtIdSiswa().getText());
            implementSiswa.Delete(id);
        } else {
            JOptionPane.showMessageDialog(form, "Pilih data yang akan di hapus");
        }
    }
    
    public void isiTableCariNama() {
        ls = implementSiswa.getCariNamaSiswa(form.getTxtCariNamaSiswa().getText());
        TableModelSiswa tms = new TableModelSiswa(ls);
        form.getTableSiswa().setModel(tms);
    }
    
    public void cariNama() {
        if (!form.getTxtCariNamaSiswa().getText().trim().isEmpty()) {
            implementSiswa.getCariNamaSiswa(form.getTxtCariNamaSiswa().getText());
            isiTableCariNama();
        } else {
            JOptionPane.showMessageDialog(form, "Pilih data");
        }
    }
}
