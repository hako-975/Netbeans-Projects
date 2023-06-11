/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andri
 */
public class HitungGaji {

    /*Mendeklarasikan variabel
    -variabel internal kelas HitungGaji Variabel potongan menyatakan dana untuk Asuransi
    Kesehatan(Askes), iuran koperasi, cicilan kendaraan dan sebagainya. Hanya variabel gajiKotor dan gajiBersih yang dapat diakses oleh "lingkungan luar". 
     */
    private double gajiKotor, gajisetelahPajak;
    public double gajiBersih;
    private double potongan = 75000.00;
// Method untuk mengeset variabel internal gajiKotor 

    public void setGaji(double gaji) {
        gajiKotor = gaji;
    }

// Method untuk menghitung gaji bersih 
    public void hitungGaji() {
        gajisetelahPajak = gajiKotor - (0.2 * gajiKotor);
        gajiBersih = gajisetelahPajak - potongan;
    }
// Method yang mengembalikan gaji kotor 

    public double getGajiKotor() {
        return gajiKotor;
    }

// Method yang mengembalikan besar gaji bersih 
    public double getGajiBersih() { 
        return gajiBersih;
    }
}