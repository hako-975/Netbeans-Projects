/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tplp016_p1;

/**
 *
 * @author andri
 */
public class P2_data {
    String nim, nama;
    char grade;
    double n_uts, n_uas, n_akhir;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getN_uts() {
        return n_uts;
    }

    public void setN_uts(double n_uts) {
        this.n_uts = n_uts;
    }

    public double getN_uas() {
        return n_uas;
    }

    public void setN_uas(double n_uas) {
        this.n_uas = n_uas;
    }
    
    public double hitungNilaiAkhir()
    {
        return n_akhir = (n_uts + n_uas) / 2;
    }
    
    public char hitungGrade()
    {
        if (n_akhir >= 90) {
            grade = 'A';
        } else if (n_akhir >= 80 && n_akhir < 90) {
            grade = 'B';
        } else if (n_akhir >= 60 && n_akhir < 80) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        
        return grade;
    }
}
