/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Form;
import latihan1.ClassDatabase;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author andri
 */
public class FormDataPembelian extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormDataPembelian
     */
    public FormDataPembelian() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtKodePembelian = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtKodeBar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        LabelNamaBarang = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LabelHargaBeli = new javax.swing.JLabel();
        LabelHargaJual = new javax.swing.JLabel();
        LabelTotalStok = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TxtJumlahBeli = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TxtKodeSup = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        BtnAdd = new javax.swing.JButton();
        BtnSave = new javax.swing.JButton();
        BtnClose = new javax.swing.JButton();
        TxtTanggalBeli = new com.toedter.calendar.JDateChooser();
        LabelNamaSup = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblPembelian = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Form Entri Data Pembelian");

        jLabel2.setText("Kode Pembelian");

        TxtKodePembelian.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TxtKodePembelianCaretUpdate(evt);
            }
        });

        jLabel3.setText("Kode Barang");

        TxtKodeBar.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TxtKodeBarCaretUpdate(evt);
            }
        });
        TxtKodeBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtKodeBarActionPerformed(evt);
            }
        });

        jLabel4.setText("Nama Barang");

        LabelNamaBarang.setText(" ");

        jLabel5.setText("Harga Beli");

        jLabel6.setText("Harga Jual");

        jLabel7.setText("Total Stok");

        LabelHargaBeli.setText(" ");

        LabelHargaJual.setText(" ");

        LabelTotalStok.setText(" ");

        jLabel8.setText("Jumlah Beli");

        jLabel9.setText("Tanggal Beli");

        jLabel10.setText("Kode Sup");

        TxtKodeSup.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TxtKodeSupCaretUpdate(evt);
            }
        });
        TxtKodeSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtKodeSupActionPerformed(evt);
            }
        });

        jLabel11.setText("Nama Sup");

        BtnAdd.setText("Add");
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });

        BtnSave.setText("Save");
        BtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveActionPerformed(evt);
            }
        });

        BtnClose.setText("Close");
        BtnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCloseActionPerformed(evt);
            }
        });

        TxtTanggalBeli.setDateFormatString("yyyy-MM-dd");

        LabelNamaSup.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelNamaBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelHargaJual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelHargaBeli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelTotalStok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtKodePembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TxtKodeBar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtJumlahBeli)
                    .addComponent(TxtTanggalBeli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(LabelNamaSup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtKodeSup, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtKodePembelian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(TxtJumlahBeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(TxtKodeBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(BtnSave))
                    .addComponent(TxtTanggalBeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(LabelNamaBarang)
                    .addComponent(jLabel10)
                    .addComponent(TxtKodeSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnClose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(LabelHargaBeli)
                    .addComponent(jLabel11)
                    .addComponent(LabelNamaSup))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(LabelHargaJual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(LabelTotalStok))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        TblPembelian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No. Pembelian", "Kode Barang", "Nama Barang", "Harga Beli", "Harga Jual", "Total Stok"
            }
        ));
        jScrollPane1.setViewportView(TblPembelian);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtKodeBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtKodeBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtKodeBarActionPerformed

    private void TxtKodeSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtKodeSupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtKodeSupActionPerformed

    private void TxtKodePembelianCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TxtKodePembelianCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtKodePembelianCaretUpdate

    private void TxtKodeBarCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TxtKodeBarCaretUpdate
        // TODO add your handling code here:
        try {            
            Connection c=ClassDatabase.getkoneksi();
            Statement s= c.createStatement();
            String sql="Select * from barang where kodebar='" + this.TxtKodeBar.getText() + "'";
            ResultSet r=s.executeQuery(sql);
           while (r.next()){
                this.LabelNamaBarang.setText(r.getString("namabar"));              
                this.LabelHargaBeli.setText(r.getString("hargabeli"));
                this.LabelHargaJual.setText(r.getString("hargajual")); 
                this.LabelTotalStok.setText(r.getString("stok")); 
            }
            r.close();
            s.close();
            
        }catch(SQLException e) {
            System.out.println("Terjadi kesalahan" + e);
        }
    }//GEN-LAST:event_TxtKodeBarCaretUpdate

    private void TxtKodeSupCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TxtKodeSupCaretUpdate
        // TODO add your handling code here:
        try {            
            Connection c=ClassDatabase.getkoneksi();
            Statement s= c.createStatement();
            String sql="Select * from supplier where kodesup='" + this.TxtKodeSup.getText() + "'";
            ResultSet r=s.executeQuery(sql);
           while (r.next()){
                this.LabelNamaSup.setText(r.getString("namasup"));
            }
            r.close();
            s.close();
            
        }catch(SQLException e) {
            System.out.println("Terjadi kesalahan" + e);
        }
    }//GEN-LAST:event_TxtKodeSupCaretUpdate

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        // TODO add your handling code here:
        TxtKodePembelian.setText("");
        TxtKodeBar.setText("");
        TxtJumlahBeli.setText("");
        TxtKodeSup.setText("");
        TxtTanggalBeli.setDateFormatString("");
        TxtKodePembelian.requestFocus();
    }//GEN-LAST:event_BtnAddActionPerformed

    private void BtnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCloseActionPerformed
        // TODO add your handling code here:
        int ex = JOptionPane.showConfirmDialog(null, "Apakah anda akan keluar? ", "Anda yakin?",
        JOptionPane.YES_NO_OPTION);
        if (ex == 0) {
            dispose();
    }
    }//GEN-LAST:event_BtnCloseActionPerformed

    private void BtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveActionPerformed
        // TODO add your handling code here:
        String kodepem=this.TxtKodePembelian.getText();
        String kodebar=this.TxtKodeBar.getText();
        String jumlahbeli=this.TxtJumlahBeli.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String tanggalbeli = sdf.format(TxtTanggalBeli.getDate());
        String kodesup=this.TxtKodeSup.getText();
        if(TxtKodePembelian.getText().isEmpty()) 
        {
        JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Kode Pembelian Tidak Boleh Kosong");
       }
        else{
        if (TxtKodeBar.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Kode Barang Tidak Boleh Kosong");
        }
        else{
        if (TxtJumlahBeli.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Jumlah Beli Tidak Boleh Kosong");
        }
        else{
        if (TxtTanggalBeli.getDateFormatString().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Tanggal Beli Tidak Boleh Kosong");
        }   
        else{
    try {
            Connection c=ClassDatabase.getkoneksi();
            String sql = "Insert into pembelian values (?,?,?,?,?)";
            PreparedStatement p=(PreparedStatement) c.prepareStatement(sql);
            p.setString(1, kodepem);
            p.setString(2, kodebar);  
            p.setString(3, jumlahbeli);
            p.setString(4, tanggalbeli);
            p.setString(5, kodesup);
            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(this, "Sukses Tambah Data");
    
    
        }catch(SQLException e){
            System.out.println(e);
        }finally{       
    }}}}}
      try {        
        
            Connection c=ClassDatabase.getkoneksi();
            Statement s= c.createStatement();
            String sql="select * from pembelian";
            ResultSet r=s.executeQuery(sql);
            TblPembelian.setModel(DbUtils.resultSetToTableModel(r));
}catch (Exception e){
JOptionPane.showMessageDialog(null, e);
}
    }//GEN-LAST:event_BtnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnClose;
    private javax.swing.JButton BtnSave;
    private javax.swing.JLabel LabelHargaBeli;
    private javax.swing.JLabel LabelHargaJual;
    private javax.swing.JLabel LabelNamaBarang;
    private javax.swing.JLabel LabelNamaSup;
    private javax.swing.JLabel LabelTotalStok;
    private javax.swing.JTable TblPembelian;
    private javax.swing.JTextField TxtJumlahBeli;
    private javax.swing.JTextField TxtKodeBar;
    private javax.swing.JTextField TxtKodePembelian;
    private javax.swing.JTextField TxtKodeSup;
    private com.toedter.calendar.JDateChooser TxtTanggalBeli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
