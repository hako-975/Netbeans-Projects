
import java.text.DecimalFormat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author andri
 */
public class HitungGajiTest {

    /* 
    Main Method
     */
    public static void main(String[] Args) {
        // Mengeset tampilan hasil menjadi dua digit desimal 
        DecimalFormat digitPresisi = new DecimalFormat("0.00");

        System.out.println("\nDEMO ENKAPSULASI");
        System.out.println("---------\n");
        // Membuat instans dari kelas hitungGaji untuk suatu 
        // pegawai, dan memanggil method-methodnya. 
        HitungGaji tony = new HitungGaji();
        tony.setGaji(2500000);
        tony.hitungGaji();

        System.out.println("Informasi Gaji Pegawai");
        System.out.println("\nBesar Gaji kotor: "
                + digitPresisi.format(tony.getGajiKotor()));
        System.out.println("\nBesar Gaji yang dibawa pulang: " + digitPresisi.format(tony.getGajiBersih()));
    }
}
