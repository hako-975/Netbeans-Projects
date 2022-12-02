/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import model.Enkripsi;
import model.Admin;
import view.FormLogin;

/**
 *
 * @author Aries Saifudin
 */
public class LoginController {

    private final Admin admin = new Admin();
    private final Enkripsi enkripsi = new Enkripsi();

    public boolean validasi(javax.swing.JTextField userIdTextField, javax.swing.JPasswordField passwordField) {
        boolean valid = false, userIdSalah = false;
        String hashedInputPassword = "";

        if (!userIdTextField.getText().equals("")) {

            if (!valid) {
                if (admin.baca(userIdTextField.getText())) {
                    try {
                        hashedInputPassword = enkripsi.hashMD5(new String(passwordField.getPassword()));
                    } catch (Exception ex) {
                    }

                    if (admin.getPassword().equalsIgnoreCase(hashedInputPassword)) {
                        valid = true;
                        FormLogin.tipe = "Mahasiswa";
                    } else {
                        userIdSalah = true;
                    }
                } else {
                    if (admin.getPesan().substring(0, 3).equalsIgnoreCase("Username")) {
                        userIdSalah = true;
                    }
                }

                if (!valid) {
                    if (userIdSalah) {
                        JOptionPane.showMessageDialog(null, "User Id atau password salah", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, admin.getPesan(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "User Id (Username) tidak boleh kosong", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }

        return valid;
    }
}
