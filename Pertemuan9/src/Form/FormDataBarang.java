/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

package Form;
import Database.ClassDatabase;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author andri
 */
public class FormDataBarang extends javax.swing.JInternalFrame {

    /** Creates new form FormDataBarang */
    public FormDataBarang() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtNamaBarang = new javax.swing.JTextField();
        TxtHargaBeli = new javax.swing.JTextField();
        TxtStok = new javax.swing.JTextField();
        TxtKodeBarang = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        LblSaham = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TxtHargaJual = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblBarang = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Form Data Barang");

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel2.setText("Kode Barang");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel3.setText("Nama Barang");

        jLabel5.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel5.setText("Harga Beli");

        jLabel6.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel6.setText("Stok");

        TxtNamaBarang.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N

        TxtHargaBeli.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N

        TxtStok.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N

        TxtKodeBarang.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        TxtKodeBarang.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TxtKodeBarangCaretUpdate(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jButton5.setText("Close");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel7.setText("Saham");

        LblSaham.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        LblSaham.setText("0");

        jLabel9.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel9.setText("Harga Jual");

        TxtHargaJual.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtHargaBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtStok, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblSaham, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtHargaJual, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtKodeBarang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblSaham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtHargaBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtHargaJual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtStok, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TblBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Harga Jual", "Harga Beli", "Stok"
            }
        ));
        jScrollPane1.setViewportView(TblBarang);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String kodebarang=this.TxtKodeBarang.getText();
        String namabarang=this.TxtNamaBarang.getText();
        String hargabeli=this.TxtHargaBeli.getText();
        String hargajual=this.TxtHargaJual.getText();
        String stokbarang=this.TxtStok.getText();
        
        int saham = 0;
        saham = Integer.parseInt(stokbarang) * Integer.parseInt(hargabeli);
        
        if(TxtKodeBarang.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Kode Barang Tidak Boleh Kosong");
        } else {
            if (TxtNamaBarang.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Nama Barang Tidak Boleh Kosong");
            }
            else{
            if (TxtHargaBeli.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Harga Jual Tidak Boleh Kosong");
            }   
            else{
            try {
                    Connection c=ClassDatabase.getkoneksi();
                    String sql = "Insert into barang values (?,?,?,?,?,?)";
                    PreparedStatement p=(PreparedStatement) c.prepareStatement(sql);
                    p.setString(1, kodebarang);
                    p.setString(2, namabarang);  
                    p.setString(3, hargabeli);
                    p.setString(4, hargajual);
                    p.setString(5, stokbarang);
                    p.setInt(6, saham);
                    p.executeUpdate();
                    p.close();
                    JOptionPane.showMessageDialog(this, "Sukses Tambah Data");


                }catch(SQLException e){
                    System.out.println(e);
                }finally{       
            }}}}
              try {        

                    Connection c=ClassDatabase.getkoneksi();
                    Statement s= c.createStatement();
                    String sql="select * from barang";
                    ResultSet r=s.executeQuery(sql);
                    TblBarang.setModel(DbUtils.resultSetToTableModel(r));
        }catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        TxtKodeBarang.setText("");
        TxtNamaBarang.setText("");
        TxtHargaBeli.setText("");
        TxtStok.setText("");
        TxtKodeBarang.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TxtKodeBarangCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TxtKodeBarangCaretUpdate
        // TODO add your handling code here:
        try {            
            Connection c=ClassDatabase.getkoneksi();
            Statement s= c.createStatement();
            String sql="Select * from barang where kodebar='" + this.TxtKodeBarang.getText() + "'";
            ResultSet r=s.executeQuery(sql);
           while (r.next()){
                this.TxtNamaBarang.setText(r.getString("namabar"));              
                this.TxtHargaBeli.setText(r.getString("hargabeli")); 
                this.TxtHargaJual.setText(r.getString("hargajual")); 
                this.TxtStok.setText(r.getString("stok")); 
                this.LblSaham.setText(r.getString("saham")); 
            }
            r.close();
            s.close();
            
        }catch(SQLException e) {
            System.out.println("Terjadi kesalahan" + e);
        }

    }//GEN-LAST:event_TxtKodeBarangCaretUpdate

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    // TODO add your handling code here:
    String kodebar=this.TxtKodeBarang.getText();
    String namabar=this.TxtNamaBarang.getText();
    String hargabeli=this.TxtHargaBeli.getText();
    String hargajual=this.TxtHargaJual.getText();
    String stok=this.TxtStok.getText();
    
    int saham = 0;
    saham = Integer.parseInt(stok) * Integer.parseInt(hargabeli);
    
    if(TxtKodeBarang.getText().isEmpty()) 
    {
    JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Kode Barang Tidak Boleh Kosong");
   }
    else{
    if (TxtNamaBarang.getText().isEmpty())
    {
        JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Nama Barang Tidak Boleh Kosong");
    }
    else{
    if (TxtHargaBeli.getText().isEmpty())
    {
        JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Harga Jual Tidak Boleh Kosong");
    }   
    else{
    try {
            Connection c=ClassDatabase.getkoneksi();
            String sql ="UPDATE barang SET namabar=?,hargabeli=?, hargajual=?, stok=?, saham=? where kodebar=?";
            PreparedStatement p =(PreparedStatement) c.prepareStatement(sql);
            p.setString(6, kodebar);
            p.setString(1, namabar);
            p.setString(2, hargabeli);
            p.setString(3, hargajual);
            p.setString(4, stok);
            p.setInt(5, saham);
            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(this, "Sukses Update Data");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{        
      }}}  }
    try {        
        Connection c=ClassDatabase.getkoneksi();
        Statement s= c.createStatement();
        String sql="select * from barang";
        ResultSet r=s.executeQuery(sql);
        TblBarang.setModel(DbUtils.resultSetToTableModel(r));
}catch (Exception e){
JOptionPane.showMessageDialog(null, e);
}

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String kodebar=this.TxtKodeBarang.getText();
    
    try {
            Connection c=ClassDatabase.getkoneksi();
            String sql = "Delete from barang Where kodebar=?";
            PreparedStatement p=(PreparedStatement) c.prepareStatement(sql);
            p.setString(1, kodebar);          
           
            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(this, "Sukses Hapus Data");
        }catch(SQLException e){
            System.out.println(e);
        }finally{
        }
     try {        
        
            Connection c=ClassDatabase.getkoneksi();
            Statement s= c.createStatement();
            String sql="select * from barang";
            ResultSet r=s.executeQuery(sql);
            TblBarang.setModel(DbUtils.resultSetToTableModel(r));
}catch (Exception e){
JOptionPane.showMessageDialog(null, e);
}

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         int ex = JOptionPane.showConfirmDialog(null, "Apakah anda akan keluar? ", "Anda yakin?",
            JOptionPane.YES_NO_OPTION);
            if (ex == 0) {
                dispose();
        }
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblSaham;
    private javax.swing.JTable TblBarang;
    private javax.swing.JTextField TxtHargaBeli;
    private javax.swing.JTextField TxtHargaJual;
    private javax.swing.JTextField TxtKodeBarang;
    private javax.swing.JTextField TxtNamaBarang;
    private javax.swing.JTextField TxtStok;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}