/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tplp016_p1;

/**
 *
 * @author Asus
 */
public class P2_data {
    String Nim, Nama;
    char grade;
    double n_uts, n_uas, n_akhir;

    public String getNim() {
        return Nim;
    }

    public void setNim(String Nim) {
        this.Nim = Nim;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
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
    
    public double hitungNilaiAkhir(){
        n_akhir = (n_uts + n_uas) / 2;
        return n_akhir;
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
