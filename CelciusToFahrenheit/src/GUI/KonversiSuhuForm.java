/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;
import javax.swing.JOptionPane;

public class KonversiSuhuForm extends javax.swing.JFrame {
    
    public KonversiSuhuForm() {
        initComponents();
    }
    
    private void initComponents() {
        lblCelsius = new javax.swing.JLabel();
        lblFahrenheit = new javax.swing.JLabel();
        txtCelsius = new javax.swing.JTextField();
        txtFahrenheit = new javax.swing.JTextField();
        btnKonversiCtoF = new javax.swing.JButton();
        btnKonversiFtoC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Konversi Suhu");

        lblCelsius.setText("Celsius");

        lblFahrenheit.setText("Fahrenheit");

        btnKonversiCtoF.setText("Celsius to Fahrenheit");
        btnKonversiCtoF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKonversiCtoFActionPerformed(evt);
            }
        });

        btnKonversiFtoC.setText("Fahrenheit to Celsius");
        btnKonversiFtoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKonversiFtoCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCelsius)
                    .addComponent(lblFahrenheit))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCelsius, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(txtFahrenheit))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnKonversiCtoF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKonversiFtoC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCelsius)
                    .addComponent(txtCelsius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKonversiCtoF))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFahrenheit)
                    .addComponent(txtFahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKonversiFtoC))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnKonversiCtoFActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            double celsius = Double.parseDouble(txtCelsius.getText());
            double fahrenheit = (celsius * 9 / 5) + 32;
            txtFahrenheit.setText(String.format("%.2f", fahrenheit));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!");
        }
    }

    private void btnKonversiFtoCActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            double fahrenheit = Double.parseDouble(txtFahrenheit.getText());
            double celsius = (fahrenheit - 32) * 5 / 9;
            txtCelsius.setText(String.format("%.2f", celsius));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiSuhuForm().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnKonversiCtoF;
    private javax.swing.JButton btnKonversiFtoC;
    private javax.swing.JLabel lblCelsius;
    private javax.swing.JLabel lblFahrenheit;
    private javax.swing.JTextField txtCelsius;
    private javax.swing.JTextField txtFahrenheit;
}
