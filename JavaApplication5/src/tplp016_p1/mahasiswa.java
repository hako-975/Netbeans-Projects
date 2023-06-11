/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tplp016_p1;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class mahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        P2_data dtMhs = new P2_data();
        dtMhs.Nama = "Ari";
        dtMhs.n_uts = 80;
        dtMhs.n_uas = 90;
        System.out.println(dtMhs.Nama);
        System.out.println(dtMhs.hitungNilaiAkhir());
//        Scanner input= new Scanner(System.in);
//        String Nim, Nama;
//        double n_uts, n_uas, n_akhir;
//        
//        System.out.println("=== Data Mahasiswa ===");
//        System.out.println("NIM :"); Nim = input.next();
//        System.out.println("Nama :"); Nama = input.next();
//        System.out.println("Nilai UTS :"); n_uts = input.nextDouble();
//        System.out.println("Nilai UAS :"); n_uas = input.nextDouble();
//        System.out.println("======================");
//        
//        //kalkulasi nilai akhir
//        n_akhir = (n_uts + n_uas) / 2;
//        
//        //Kalkulasi Grade
//        String grade = "0";
//        if (n_akhir >= 90) {
//            grade = "A";
//        }else if(n_akhir > 80 & n_akhir < 90){
//            grade = "B";
//        }else if(n_akhir > 60 & n_akhir < 80){
//            grade = "C";
//        }else if(n_akhir < 60){
//            grade = "D";
//        }
//        
//        System.out.println("=== Nilai Mahasiswa" + Nama + " ===");
//        System.out.println("NIM :" + Nim); 
//        System.out.println("Nama :" + Nama);
//        System.out.println("Nilai UTS :" + n_uts);
//        System.out.println("Nilai UAS :" + n_uas); 
//        System.out.println("Nilai Akhir :" + n_akhir); 
//        System.out.println("Garade : " + grade); 
//        System.out.println("======================");
    }
}
