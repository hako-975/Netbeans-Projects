/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import model.Pembeli;
import view.FormLihatPembeli;
import view.FormUtama;

/**
 *
 * @author 4R135
 */
public class PembeliController {

    private final Pembeli pembeli = new Pembeli();
    private FormLihatPembeli formLihatPembeli;

    public void simpan(
            javax.swing.JTextField nikPembeliTextField,
            javax.swing.JTextField namaPembeliTextField,
            javax.swing.JTextField noTeleponPembeliTextField,
            javax.swing.JTextField alamatPembeliTextField
    ) {
        pembeli.setNikPembeli(nikPembeliTextField.getText());
        pembeli.setNamaPembeli(namaPembeliTextField.getText());
        pembeli.setNoTeleponPembeli(noTeleponPembeliTextField.getText());
        pembeli.setAlamatPembeli(alamatPembeliTextField.getText());

        if (pembeli.simpan()) {
            FormUtama.formPembeli.setNikPembeli("");
            FormUtama.formPembeli.setNamaPembeli("");
            FormUtama.formPembeli.setNoTeleponPembeli("");
            FormUtama.formPembeli.setAlamatPembeli("");

        } else {
            if (pembeli.getPesan().length() > 0) {
                JOptionPane.showMessageDialog(null, pembeli.getPesan(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void hapus(javax.swing.JTextField kodePembeliTextField) {
        if (!kodePembeliTextField.getText().equals("")) {
            if (pembeli.hapus(kodePembeliTextField.getText())) {
                FormUtama.formPembeli.setNikPembeli("");
                FormUtama.formPembeli.setNamaPembeli("");
                FormUtama.formPembeli.setNoTeleponPembeli("");
                FormUtama.formPembeli.setAlamatPembeli("");
            } else {
                JOptionPane.showMessageDialog(null, pembeli.getPesan(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Username tidak boleh kosong", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cari(javax.swing.JTextField kodePembeliTextField) {
        if (!kodePembeliTextField.getText().equals("")) {
            if (pembeli.baca(kodePembeliTextField.getText())) {
                FormUtama.formPembeli.setNikPembeli(pembeli.getNikPembeli());
                FormUtama.formPembeli.setNamaPembeli(pembeli.getNamaPembeli());
                FormUtama.formPembeli.setNoTeleponPembeli(pembeli.getNoTeleponPembeli());
                FormUtama.formPembeli.setAlamatPembeli(pembeli.getAlamatPembeli());
            } else {
                FormUtama.formPembeli.setNikPembeli("");
                FormUtama.formPembeli.setNamaPembeli("");
                FormUtama.formPembeli.setNoTeleponPembeli("");
                FormUtama.formPembeli.setAlamatPembeli("");
                JOptionPane.showMessageDialog(null, pembeli.getPesan(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "NIK tidak boleh kosong", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void tampilkanFormLihatPembeli() {
        formLihatPembeli = new FormLihatPembeli(null, true);

        if (pembeli.bacaData()) {
            formLihatPembeli.tampilkanData(pembeli.getList());

            formLihatPembeli.setVisible(true);
            if (!formLihatPembeli.getKodePembeliDipilih().equals("")) {
                FormUtama.formPembeli.setNikPembeli(formLihatPembeli.getKodePembeliDipilih());
                if (pembeli.baca(formLihatPembeli.getKodePembeliDipilih())) {
                    FormUtama.formPembeli.setNikPembeli(pembeli.getNikPembeli());
                    FormUtama.formPembeli.setNamaPembeli(pembeli.getNamaPembeli());
                    FormUtama.formPembeli.setNoTeleponPembeli(pembeli.getNoTeleponPembeli());
                    FormUtama.formPembeli.setAlamatPembeli(pembeli.getAlamatPembeli());
                } else {
                    FormUtama.formPembeli.setNikPembeli("");
                    FormUtama.formPembeli.setNamaPembeli("");
                    FormUtama.formPembeli.setNoTeleponPembeli("");
                    FormUtama.formPembeli.setAlamatPembeli("");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, pembeli.getPesan());
        }
    }

}
