/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import model.Koneksi;
import model.Transaksi;
import view.FormLihatTransaksi;
import view.FormLogin;
import view.FormUtama;

/**
 *
 * @author 4R135
 */
public class TransaksiController {

    private final Transaksi transaksi = new Transaksi();
    private final Koneksi koneksi = new Koneksi();

    private FormLihatTransaksi formLihatTransaksi;

    public void simpan(
            javax.swing.JTextField nikPembeliTextField,
            javax.swing.JTextField kodeMobilTextField,
            javax.swing.JTextField bayarTextField,
            javax.swing.JLabel totalHargaLabel,
            javax.swing.JLabel kembalianLabel
    ) {
        LocalDateTime now = LocalDateTime.now();
        transaksi.setTglTransaksi(String.valueOf(now));
        transaksi.setNikPembeli(nikPembeliTextField.getText());
        transaksi.setKodeMobil(kodeMobilTextField.getText());
        transaksi.setBayar(bayarTextField.getText());
        transaksi.setKembalian(kembalianLabel.getText());
        transaksi.setTotalHarga(totalHargaLabel.getText());
        String kodeAdmin = "";
        try {
            Connection c;
            c = koneksi.getConnection();
            Statement s = c.createStatement();
            String sql = "Select * from admin where username='" + FormLogin.userLogin + "'";
            ResultSet r = s.executeQuery(sql);
            while (r.next()) {
                kodeAdmin = r.getString("kodeAdmin");
            }
            r.close();
            s.close();

        } catch (SQLException e) {
            System.out.println("Terjadi kesalahan" + e);
        }
        transaksi.setKodeAdmin(kodeAdmin);

        if (transaksi.simpan()) {
            FormUtama.formTransaksi.setKodeTransaksi("");
            FormUtama.formTransaksi.setNikPembeli("");
            FormUtama.formTransaksi.setKodeMobil("");
            FormUtama.formTransaksi.setBayar("");
        } else {
            if (transaksi.getPesan().length() > 0) {
                JOptionPane.showMessageDialog(null, transaksi.getPesan(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void hapus(javax.swing.JTextField kodeTransaksiTextField) {
        if (!kodeTransaksiTextField.getText().equals("")) {
            if (transaksi.hapus(kodeTransaksiTextField.getText())) {
                FormUtama.formTransaksi.setKodeTransaksi("");
                FormUtama.formTransaksi.setNikPembeli("");
                FormUtama.formTransaksi.setKodeMobil("");
                FormUtama.formTransaksi.setBayar("");
            } else {
                JOptionPane.showMessageDialog(null, transaksi.getPesan(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Username tidak boleh kosong", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cari(javax.swing.JTextField kodeTransaksiTextField) {
        if (!kodeTransaksiTextField.getText().equals("")) {
            if (transaksi.baca(kodeTransaksiTextField.getText())) {
                FormUtama.formTransaksi.setKodeTransaksi(transaksi.getKodeTransaksi());
                FormUtama.formTransaksi.setNikPembeli(transaksi.getNikPembeli());
                FormUtama.formTransaksi.setKodeMobil(transaksi.getKodeMobil());
                FormUtama.formTransaksi.setBayar(transaksi.getBayar());
            } else {
                FormUtama.formTransaksi.setNikPembeli("");
                FormUtama.formTransaksi.setKodeMobil("");
                FormUtama.formTransaksi.setBayar("");

                JOptionPane.showMessageDialog(null, transaksi.getPesan(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Username tidak boleh kosong", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void tampilkanFormLihatTransaksi() {
        formLihatTransaksi = new FormLihatTransaksi(null, true);

        if (transaksi.bacaData()) {
            formLihatTransaksi.tampilkanData(transaksi.getList());

            formLihatTransaksi.setVisible(true);
            if (!formLihatTransaksi.getKodeTransaksiDipilih().equals("")) {
                FormUtama.formTransaksi.setKodeTransaksi(formLihatTransaksi.getKodeTransaksiDipilih());
                if (transaksi.baca(formLihatTransaksi.getKodeTransaksiDipilih())) {
                    FormUtama.formTransaksi.setKodeTransaksi(transaksi.getKodeTransaksi());
                    FormUtama.formTransaksi.setNikPembeli(transaksi.getNikPembeli());
                    FormUtama.formTransaksi.setKodeMobil(transaksi.getKodeMobil());
                    FormUtama.formTransaksi.setBayar(transaksi.getBayar());
                } else {
                    FormUtama.formTransaksi.setNikPembeli("");
                    FormUtama.formTransaksi.setKodeMobil("");
                    FormUtama.formTransaksi.setBayar("");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, transaksi.getPesan());
        }
    }

}
