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
public class FormDataPenjualan extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormDataPenjualan
     */
    
    int subtotalhargajual;
    int totalhargajual;
    
    public FormDataPenjualan() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtKodePenjualan = new javax.swing.JTextField();
        TxtKodeBarang = new javax.swing.JTextField();
        LabelNamaBarang = new javax.swing.JLabel();
        LabelHargaBeli = new javax.swing.JLabel();
        LabelStok = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TxtDiskon = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        BtnDiskon = new javax.swing.JButton();
        BtnAdd = new javax.swing.JButton();
        BtnSave = new javax.swing.JButton();
        BtnClose = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        LabelSaham = new javax.swing.JLabel();
        TxtTanggalJual = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        LabelTotal = new javax.swing.JLabel();
        LabelSubTotal = new javax.swing.JLabel();
        TxtJumlahJual = new javax.swing.JTextField();
        TxtCari = new javax.swing.JTextField();
        BtnPencarian = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        LabelHargaJual = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblPenjualan = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Form Data Penjualan");

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel2.setText("Kode Penjualan");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel3.setText("Kode Barang");

        jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel4.setText("Nama Barang");

        jLabel5.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel5.setText("Harga Beli");

        jLabel6.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel6.setText("Stok Barang");

        TxtKodePenjualan.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N

        TxtKodeBarang.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        TxtKodeBarang.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TxtKodeBarangCaretUpdate(evt);
            }
        });

        LabelNamaBarang.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        LabelNamaBarang.setText("-");

        LabelHargaBeli.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        LabelHargaBeli.setText("-");

        LabelStok.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        LabelStok.setText("-");

        jLabel10.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel10.setText("Jumlah Jual");

        jLabel11.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel11.setText("Tanggal Jual");

        TxtDiskon.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        TxtDiskon.setToolTipText("");
        TxtDiskon.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TxtDiskonCaretUpdate(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel13.setText("SubTotal");

        BtnDiskon.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        BtnDiskon.setText("Diskon %");
        BtnDiskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDiskonActionPerformed(evt);
            }
        });

        BtnAdd.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        BtnAdd.setText("Add");
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });

        BtnSave.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        BtnSave.setText("Save");
        BtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveActionPerformed(evt);
            }
        });

        BtnClose.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        BtnClose.setText("Close");
        BtnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCloseActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel7.setText("Saham");

        LabelSaham.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        LabelSaham.setText("-");

        TxtTanggalJual.setDateFormatString("yyyy-MM-dd");

        jLabel14.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel14.setText("Total");

        LabelTotal.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        LabelTotal.setText("-");

        LabelSubTotal.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        LabelSubTotal.setText("-");

        TxtJumlahJual.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N

        TxtCari.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        TxtCari.setToolTipText("");

        BtnPencarian.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        BtnPencarian.setText("Cari");
        BtnPencarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPencarianActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jLabel9.setText("Harga Jual");

        LabelHargaJual.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        LabelHargaJual.setText("-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(TxtKodePenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelHargaBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelHargaJual, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LabelStok, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSaham, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(TxtTanggalJual, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtJumlahJual, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LabelSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(TxtCari))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelHargaJual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelStok, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelSaham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtTanggalJual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtKodePenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtJumlahJual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelHargaBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TblPenjualan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TblPenjualan);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                .addContainerGap())
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
                .addGap(0, 5, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtKodeBarangCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TxtKodeBarangCaretUpdate
        // TODO add your handling code here:
        try {            
            Connection c=ClassDatabase.getkoneksi();
            Statement s= c.createStatement();
            String sql="Select * from barang where kodebar='" + this.TxtKodeBarang.getText() + "'";
            ResultSet r=s.executeQuery(sql);
           while (r.next()){
                this.LabelNamaBarang.setText(r.getString("namabar"));              
                this.LabelHargaBeli.setText(r.getString("hargabeli")); 
                this.LabelHargaJual.setText(r.getString("hargajual")); 
                this.LabelStok.setText(r.getString("stok")); 
                this.LabelSaham.setText(r.getString("saham")); 
            }
            r.close();
            s.close();
            
        }catch(SQLException e) {
            System.out.println("Terjadi kesalahan" + e);
        }
    }//GEN-LAST:event_TxtKodeBarangCaretUpdate

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        // TODO add your handling code here:
        TxtKodePenjualan.setText("");
        TxtKodeBarang.setText("");
        TxtJumlahJual.setText("");
        TxtTanggalJual.setDateFormatString("");
        TxtDiskon.setText("");
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
        String kodePenjualan = this.TxtKodePenjualan.getText();
        String kodeBarang = this.TxtKodeBarang.getText();
        String jumlahJual = TxtJumlahJual.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String tanggalJual = sdf.format(TxtTanggalJual.getDate());
        String diskon = this.TxtDiskon.getText();
        
        if (Integer.parseInt(jumlahJual) > Integer.parseInt(this.LabelStok.getText())) {
            JOptionPane.showMessageDialog(this, "Jumlah jual tidak boleh melebihi stok!");
            return;
        }
        
        subtotalhargajual = (Integer.parseInt(this.LabelHargaJual.getText()) * Integer.parseInt(jumlahJual));
        totalhargajual = subtotalhargajual - ((subtotalhargajual * Integer.parseInt(diskon)) / 100);
        
        int totalstok = Integer.parseInt(this.LabelStok.getText()) - Integer.parseInt(jumlahJual);
        int saham = totalstok * Integer.parseInt(this.LabelHargaBeli.getText());
        int profit = totalhargajual - (Integer.parseInt(this.LabelHargaBeli.getText()) * Integer.parseInt(jumlahJual));
        
        if (kodePenjualan.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Kode Penjualan Tidak Boleh Kosong");
        } else {
        if (kodeBarang.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Kode Barang Tidak Boleh Kosong");
        } else {
        if (jumlahJual.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Jumlah Jual Tidak Boleh Kosong");
        } else {
        if (tanggalJual.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Tanggal Jual Tidak Boleh Kosong");
        } else {
        if (diskon.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Diskon Tidak Boleh Kosong");
        } else {
            try {            
                Connection c=ClassDatabase.getkoneksi();
                String sql = "Insert into penjualan values (?,?,?,?,?,?,?)";
                PreparedStatement p=(PreparedStatement) c.prepareStatement(sql);
                p.setString(1, kodePenjualan);
                p.setString(2, kodeBarang);  
                p.setString(3, jumlahJual);
                p.setString(4, tanggalJual);            
                p.setString(5, diskon);
                p.setString(6, Integer.toString(totalhargajual));
                p.setInt(7, profit);
                p.executeUpdate();
                p.close();
                JOptionPane.showMessageDialog(this, "Sukses Tambah Data");
            }catch(SQLException e){
                JOptionPane.showMessageDialog(this, e);
            } finally {}}}}}}
            try {
                Connection c = ClassDatabase.getkoneksi();
                Statement s = c.createStatement();
                String sql = "select * from penjualan";
                ResultSet r = s.executeQuery(sql);
                TblPenjualan.setModel(DbUtils.resultSetToTableModel(r));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            try {
                Connection c=ClassDatabase.getkoneksi();
                String sql ="UPDATE barang SET stok = ?, saham = ? where kodebar=?";
                PreparedStatement p=(PreparedStatement) c.prepareStatement(sql);
                p.setString(3, kodeBarang);
                p.setInt(1, totalstok);
                p.setInt(2, saham);
                p.executeUpdate();
                p.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            TxtKodeBarang.setText("");
    }//GEN-LAST:event_BtnSaveActionPerformed

    private void BtnDiskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDiskonActionPerformed
        // TODO add your handling code here:
        String jumlahJual = TxtJumlahJual.getText();
        String diskon = this.TxtDiskon.getText();
        
        subtotalhargajual = (Integer.parseInt(this.LabelHargaBeli.getText()) * Integer.parseInt(jumlahJual));
        totalhargajual = subtotalhargajual - ((subtotalhargajual * Integer.parseInt(diskon)) / 100);
        
        this.LabelSubTotal.setText(Integer.toString(subtotalhargajual));
        this.LabelTotal.setText(Integer.toString(totalhargajual));
    }//GEN-LAST:event_BtnDiskonActionPerformed

    private void TxtDiskonCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TxtDiskonCaretUpdate
        // TODO add your handling code here:
        String jumlahJual = TxtJumlahJual.getText();
        String diskon = this.TxtDiskon.getText();
                
        subtotalhargajual = (Integer.parseInt(this.LabelHargaBeli.getText()) * Integer.parseInt(jumlahJual));
        totalhargajual = subtotalhargajual - ((subtotalhargajual * Integer.parseInt(diskon)) / 100);
        
        this.LabelSubTotal.setText(Integer.toString(subtotalhargajual));
        this.LabelTotal.setText(Integer.toString(totalhargajual));
    }//GEN-LAST:event_TxtDiskonCaretUpdate

    private void BtnPencarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPencarianActionPerformed
        // TODO add your handling code here:
        String cari = this.TxtCari.getText();
        try {
                Connection c = ClassDatabase.getkoneksi();
                Statement s = c.createStatement();
                String sql = "select * from penjualan where kodepenjualan LIKE '%" + cari + "%'" +
                        " OR kodebar LIKE '%" + cari + "%'" +
                        " OR tanggaljual LIKE '%" + cari + "%'" +
                        " OR diskon LIKE '%" + cari + "%'" +
                        " OR totalhargajual LIKE '%" + cari + "%'";
                ResultSet r = s.executeQuery(sql);
                TblPenjualan.setModel(DbUtils.resultSetToTableModel(r));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_BtnPencarianActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnClose;
    private javax.swing.JButton BtnDiskon;
    private javax.swing.JButton BtnPencarian;
    private javax.swing.JButton BtnSave;
    private javax.swing.JLabel LabelHargaBeli;
    private javax.swing.JLabel LabelHargaJual;
    private javax.swing.JLabel LabelNamaBarang;
    private javax.swing.JLabel LabelSaham;
    private javax.swing.JLabel LabelStok;
    private javax.swing.JLabel LabelSubTotal;
    private javax.swing.JLabel LabelTotal;
    private javax.swing.JTable TblPenjualan;
    private javax.swing.JTextField TxtCari;
    private javax.swing.JTextField TxtDiskon;
    private javax.swing.JTextField TxtJumlahJual;
    private javax.swing.JTextField TxtKodeBarang;
    private javax.swing.JTextField TxtKodePenjualan;
    private com.toedter.calendar.JDateChooser TxtTanggalJual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
