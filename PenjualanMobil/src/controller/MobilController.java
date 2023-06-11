/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import model.Mobil;
import view.FormLihatMobil;
import view.FormUtama;

/**
 *
 * @author 4R135
 */
public class MobilController {

    private final Mobil mobil = new Mobil();
    private FormLihatMobil formLihatMobil;

    public void simpan(
            javax.swing.JTextField merkMobilTextField,
            javax.swing.JTextField tahunMobilTextField,
            javax.swing.JTextField hargaMobilTextField
    ) {
        mobil.setMerkMobil(merkMobilTextField.getText());
        mobil.setTahunMobil(tahunMobilTextField.getText());
        mobil.setHargaMobil(hargaMobilTextField.getText());

        if (mobil.simpan()) {
            FormUtama.formMobil.setKodeMobil("");
            FormUtama.formMobil.setMerkMobil("");
            FormUtama.formMobil.setTahunMobil("");
            FormUtama.formMobil.setHargaMobil("");

        } else {
            if (mobil.getPesan().length() > 0) {
                JOptionPane.showMessageDialog(null, mobil.getPesan(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void hapus(javax.swing.JTextField kodeMobilTextField) {
        if (!kodeMobilTextField.getText().equals("")) {
            if (mobil.hapus(kodeMobilTextField.getText())) {
                FormUtama.formMobil.setKodeMobil("");
                FormUtama.formMobil.setMerkMobil("");
                FormUtama.formMobil.setTahunMobil("");
                FormUtama.formMobil.setHargaMobil("");
            } else {
                JOptionPane.showMessageDialog(null, mobil.getPesan(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Username tidak boleh kosong", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cari(javax.swing.JTextField kodeMobilTextField) {
        if (!kodeMobilTextField.getText().equals("")) {
            if (mobil.baca(kodeMobilTextField.getText())) {
                FormUtama.formMobil.setMerkMobil(mobil.getMerkMobil());
                FormUtama.formMobil.setTahunMobil(mobil.getTahunMobil() + "");
                FormUtama.formMobil.setHargaMobil(mobil.getHargaMobil() + "");
            } else {
                FormUtama.formMobil.setMerkMobil("");
                FormUtama.formMobil.setTahunMobil("");
                FormUtama.formMobil.setHargaMobil("");

                JOptionPane.showMessageDialog(null, mobil.getPesan(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Username tidak boleh kosong", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void tampilkanFormLihatMobil() {
        formLihatMobil = new FormLihatMobil(null, true);

        if (mobil.bacaData()) {
            formLihatMobil.tampilkanData(mobil.getList());

            formLihatMobil.setVisible(true);
            if (!formLihatMobil.getKodeMobilDipilih().equals("")) {
                FormUtama.formMobil.setKodeMobil(formLihatMobil.getKodeMobilDipilih());
                if (mobil.baca(formLihatMobil.getKodeMobilDipilih())) {
                    FormUtama.formMobil.setMerkMobil(mobil.getMerkMobil());
                    FormUtama.formMobil.setTahunMobil(mobil.getTahunMobil() + "");
                    FormUtama.formMobil.setHargaMobil(mobil.getHargaMobil() + "");
                } else {
                    FormUtama.formMobil.setMerkMobil("");
                    FormUtama.formMobil.setTahunMobil("");
                    FormUtama.formMobil.setHargaMobil("");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, mobil.getPesan());
        }
    }

}
