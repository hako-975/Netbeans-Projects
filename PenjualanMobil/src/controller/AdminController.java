/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import model.Enkripsi;
import model.Admin;
import view.FormLihatAdmin;
import view.FormUtama;

/**
 *
 * @author 4R135
 */
public class AdminController {

    private final Admin admin = new Admin();
    private FormLihatAdmin formLihatAdmin;
    private final Enkripsi enkripsi = new Enkripsi();
    private boolean hashed = false;

    public void setHashed(boolean hashed) {
        this.hashed = hashed;
    }

    public void simpan(
            javax.swing.JTextField usernameTextField, 
            javax.swing.JTextField namaAdminTextField,
            javax.swing.JPasswordField passwordField
    ) {
        if (!usernameTextField.getText().equals("")) {
            admin.setUsername(usernameTextField.getText());
            admin.setNama_admin(namaAdminTextField.getText());

            if (hashed) {
                admin.setPassword(new String(passwordField.getPassword()));
            } else {
                try {
                    admin.setPassword(enkripsi.hashMD5(new String(passwordField.getPassword())));
                } catch (Exception ex) {
                    admin.setPassword("");
                }
            }

            if (admin.simpan()) {
                FormUtama.formAdmin.setUsername("");
                FormUtama.formAdmin.setNamaAdmin("");
                FormUtama.formAdmin.setPassword("");
            } else {
                if (admin.getPesan().length() > 0) {
                    JOptionPane.showMessageDialog(null, admin.getPesan(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Username tidak boleh kosong", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void hapus(javax.swing.JTextField usernameTextField) {
        if (!usernameTextField.getText().equals("")) {
            if (admin.hapus(usernameTextField.getText())) {
                FormUtama.formAdmin.setUsername("");
                FormUtama.formAdmin.setNamaAdmin("");
                FormUtama.formAdmin.setPassword("");
            } else {
                JOptionPane.showMessageDialog(null, admin.getPesan(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Username tidak boleh kosong", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cari(javax.swing.JTextField usernameTextField) {
        if (!usernameTextField.getText().equals("")) {
            if (admin.baca(usernameTextField.getText())) {
                FormUtama.formAdmin.setNamaAdmin(admin.getNama_admin());
                FormUtama.formAdmin.setPassword(admin.getPassword());
                hashed = true;
            } else {
                FormUtama.formAdmin.setNamaAdmin("");
                FormUtama.formAdmin.setPassword("");

                JOptionPane.showMessageDialog(null, admin.getPesan(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Username tidak boleh kosong", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void tampilkanFormLihatAdmin() {
        formLihatAdmin = new FormLihatAdmin(null, true);

        if (admin.bacaData()) {
            formLihatAdmin.tampilkanData(admin.getList());

            formLihatAdmin.setVisible(true);
            if (!formLihatAdmin.getUsernameDipilih().equals("")) {
                FormUtama.formAdmin.setUsername(formLihatAdmin.getUsernameDipilih());
                if (admin.baca(formLihatAdmin.getUsernameDipilih())) {
                    FormUtama.formAdmin.setNamaAdmin(admin.getNama_admin());
                    FormUtama.formAdmin.setPassword(admin.getPassword());
                    hashed = true;
                } else {
                    FormUtama.formAdmin.setNamaAdmin("");
                    FormUtama.formAdmin.setPassword("");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, admin.getPesan());
        }
    }
}
