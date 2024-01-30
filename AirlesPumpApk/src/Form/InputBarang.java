/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Form;

import javax.swing.JOptionPane;
import FORM.*;
import Koneksi.ClassDatabase;
import com.mysql.jdbc.*;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.*;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Teguk
 */
public class InputBarang extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormInputBarang
     */
    public InputBarang() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        addBn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        tampil = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nmBrg = new javax.swing.JTextField();
        kdBrg = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        stok = new javax.swing.JTextField();
        KotakImg = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        gambar = new javax.swing.JButton();
        rBtn = new javax.swing.JRadioButton();
        kBtn = new javax.swing.JRadioButton();
        path_gmbr = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelData = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(0, 204, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INPUT BARANG");

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        addBn.setText("ADD");
        addBn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBnActionPerformed(evt);
            }
        });

        saveBtn.setText("SAVE");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        editBtn.setText("EDIT");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        closeBtn.setText("CLOSE");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        tampil.setText("TAMPIL");
        tampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addBn, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(saveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(closeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(tampil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(addBn)
                .addGap(12, 12, 12)
                .addComponent(saveBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tampil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeBtn)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setText("Kode Barang");

        jLabel3.setText("Nama Barang");

        kdBrg.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                kdBrgCaretUpdate(evt);
            }
        });
        kdBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kdBrgActionPerformed(evt);
            }
        });

        jLabel5.setText("Keterangan");

        jLabel7.setText("Stok");

        KotakImg.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        jLabel6.setText("Gambar");

        gambar.setText("Choose File");
        gambar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gambarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rBtn);
        rBtn.setText("READY");
        rBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(kBtn);
        kBtn.setText("KOSONG");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nmBrg, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                        .addComponent(kdBrg)
                        .addComponent(stok)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(path_gmbr, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(gambar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(KotakImg, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rBtn)
                        .addGap(18, 18, 18)
                        .addComponent(kBtn)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kdBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nmBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rBtn)
                    .addComponent(kBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(KotakImg, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gambar)
                    .addComponent(path_gmbr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TabelData.setAutoCreateRowSorter(true);
        TabelData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Stok", "Keterangan"
            }
        ));
        jScrollPane2.setViewportView(TabelData);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(207, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(216, 216, 216))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tampilData() {
        try {
            Connection c = ClassDatabase.getKoneksi();
            Statement s = c.createStatement();
            String sql = "SELECT kode, spek, qty, ket FROM inputbrg";
            ResultSet r = s.executeQuery(sql);

            DefaultTableModel model = (DefaultTableModel) TabelData.getModel();
            model.setRowCount(0); // Clear existing rows

            while (r.next()) {
                Object[] rowData = {
                    r.getString("kode"),
                    r.getString("spek"),
                    r.getString("qty"),
                    r.getString("ket")
                };
                model.addRow(rowData);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }


    private void addBnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBnActionPerformed
        // TODO add your handling code here:
        //ADD
        kdBrg.setText("");
        kdBrg.requestFocus();
        nmBrg.setText("");
        buttonGroup1.clearSelection();
        stok.setText("");
        path_gmbr.setText("");
        KotakImg.setIcon(frameIcon);
    }//GEN-LAST:event_addBnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        //SAVE
        String kode = this.kdBrg.getText();
        String spek = this.nmBrg.getText();
        String qty = this.stok.getText();
        String ket = null;
        if (rBtn.isSelected()) {
            ket = "READY";
        } else if (kBtn.isSelected()) {
            ket = "KOSONG";
        }

        String gambarPath = this.path_gmbr.getText();
        byte[] gambarBytes = null;
        try {
            File gambarFile = new File(gambarPath);
            FileInputStream fis = new FileInputStream(gambarFile);
            gambarBytes = new byte[(int) gambarFile.length()];
            fis.read(gambarBytes);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (kdBrg.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data belum lengkap, Kode Barang tidak boleh kosong");
        } else {
            if (nmBrg.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Data belum lengkap, Nama Barang tidak boleh kosong");
            } else {
                if (stok.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Data belum lengkap, Stok Barang tidak boleh kosong");
                } else {
                    try {
                        Connection c = ClassDatabase.getKoneksi();
                        String sql = "Insert into inputbrg values(?,?,?,?,?)";
                        PreparedStatement p = (PreparedStatement) c.prepareStatement(sql);
                        p.setString(1, kode);
                        p.setString(2, spek);
                        p.setString(3, qty);
                        p.setString(4, ket);
                        p.setBytes(5, gambarBytes);

                        p.executeUpdate();
                        p.close();
                        JOptionPane.showMessageDialog(this, "Sukses tambah data");
                    } catch (SQLException e) {
                        System.out.println(e);
                        //JOptionPane.showMessageDialog(null, e);
                    } finally {
                    }
                }
            }
        }

        tampilData();
    }//GEN-LAST:event_saveBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        //edit
        String kode = this.kdBrg.getText();
        String spek = this.nmBrg.getText();
        String qty = this.stok.getText();
        String ket = null;
        if (rBtn.isSelected()) {
            ket = "READY";
        } else if (kBtn.isSelected()) {
            ket = "KOSONG";
        }

        String gambarPath = this.path_gmbr.getText();
        byte[] gambarBytes = null;
        try {
            File gambarFile = new File(gambarPath);
            FileInputStream fis = new FileInputStream(gambarFile);
            gambarBytes = new byte[(int) gambarFile.length()];
            fis.read(gambarBytes);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Connection c = ClassDatabase.getKoneksi();
            String sql = "UPDATE inputbrg SET spek=?, qty=?, ket=?, gambar=? WHERE kode=?";
            PreparedStatement p = (PreparedStatement) c.prepareStatement(sql);
            p.setString(5, kode);
            p.setString(1, spek);
            p.setString(2, qty);
            p.setString(3, ket);
            p.setBytes(4, gambarBytes);
            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(this, "Sukses update data");
        } catch (SQLException e) {
            System.out.println(e);
        }

        tampilData();
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        //delete
        String kode = this.kdBrg.getText();
        try {
            Connection c = ClassDatabase.getKoneksi();
            String sql = "DELETE FROM inputbrg WHERE kode=?";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, kode);
            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(this, "Sukses hapus data");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        kdBrg.setText("");
        kdBrg.requestFocus();
        nmBrg.setText("");
        buttonGroup1.clearSelection();
        stok.setText("");
        path_gmbr.setText("");
        KotakImg.setIcon(frameIcon);

        tampilData();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        // TODO add your handling code here:
        //        String tanya = "Yakin akan keluar?";
        //        int dialogResult = JOptionPane.showConfirmDialog(null, tanya);
        //        boolean yakin = dialogResult == JOptionPane.YES_OPTION;
        //        if (yakin) {
        //            System.exit(0);
        //        }
        int exit = JOptionPane.showConfirmDialog(null, "Apakah anda akan keluar?", "Anda Yakin?", JOptionPane.YES_NO_OPTION);
        if (exit == 0) {
            dispose();
        }
    }//GEN-LAST:event_closeBtnActionPerformed

    private void tampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilActionPerformed
        // TODO add your handling code here:
        tampilData();
    }//GEN-LAST:event_tampilActionPerformed

    private void kdBrgCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_kdBrgCaretUpdate
        // TODO add your handling code here:
        try {
            Connection c = ClassDatabase.getKoneksi();
            Statement s = c.createStatement();
            String sql = "Select * from inputbrg Where kode='" + this.kdBrg.getText() + "'";
            ResultSet r = s.executeQuery(sql);
            while (r.next()) {
                this.nmBrg.setText(r.getString(2));

                if ("READY".equalsIgnoreCase(r.getString("ket"))) {
                    rBtn.setSelected(true);
                } else {
                    kBtn.setSelected(true);
                }
                this.stok.setText(r.getString(3));

                Blob blob = r.getBlob("gambar");
                byte[] imageData = blob.getBytes(1, (int) blob.length());

                ImageIcon imageIcon = new ImageIcon(imageData);

                int LebarLabel = 200;
                int PanjangLabel = 400;
                int LebarGambar = imageIcon.getIconWidth();
                int PanjangGambar = imageIcon.getIconHeight();
                double scaleX = (double) LebarLabel / (double) LebarGambar;
                double scaleY = (double) PanjangLabel / (double) PanjangGambar;
                double scale = Math.min(scaleX, scaleY);
                Image scaledImage = imageIcon.getImage().getScaledInstance((int) (scale * LebarGambar), (int) (scale * PanjangGambar), Image.SCALE_SMOOTH);

                KotakImg.setIcon(new ImageIcon(scaledImage));
                // Add the label to your GUI to display the image

            }
            r.close();
            s.close();
        } catch (SQLException e) {
            System.out.println("Terjadi Kesalahan" + e);
        }
    }//GEN-LAST:event_kdBrgCaretUpdate

    private void kdBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kdBrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kdBrgActionPerformed

    private void gambarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gambarActionPerformed
        // TODO add your handling code here:
        JFileChooser pilihFile = new JFileChooser();
        pilihFile.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg", "png", "gif");
        pilihFile.addChoosableFileFilter(filter);

        int result = pilihFile.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectFile = pilihFile.getSelectedFile();
            String path = selectFile.getAbsolutePath();
            path_gmbr.setText(path);

            try {
                //konversi blok gambar ke ImageIcon
                byte[] gmbr = Files.readAllBytes(selectFile.toPath());
                ImageIcon ikongambar = new ImageIcon(gmbr);

                //ukuran jlabel yang diinginkan
                int LebarLabel = 200;
                int PanjangLabel = 400;

                //ukuran gambar asli
                int LebarGambar = ikongambar.getIconWidth();
                int PanjangGambar = ikongambar.getIconHeight();

                //Hitung skala untuk gambar baru
                double scaleX = (double) LebarLabel / (double) LebarGambar;
                double scaleY = (double) PanjangLabel / (double) PanjangGambar;
                double scale = Math.min(scaleX, scaleY);

                //ubah ukuran gambar dengan skala yang diitung diatas
                Image scaledImage = ikongambar.getImage().getScaledInstance((int) (scale * LebarGambar), (int) (scale * PanjangGambar), Image.SCALE_SMOOTH);

                //tampilan ikongambar pada JLabel
                KotakImg.setIcon(new ImageIcon(scaledImage));

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_gambarActionPerformed

    private void rBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel KotakImg;
    private javax.swing.JTable TabelData;
    private javax.swing.JButton addBn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton gambar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton kBtn;
    private javax.swing.JTextField kdBrg;
    private javax.swing.JTextField nmBrg;
    private javax.swing.JTextField path_gmbr;
    private javax.swing.JRadioButton rBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField stok;
    private javax.swing.JButton tampil;
    // End of variables declaration//GEN-END:variables
}
