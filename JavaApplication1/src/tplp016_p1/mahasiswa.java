/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tplp016_p1;

import java.util.Scanner;

/**
 *
 * @author andri
 */
public class mahasiswa {

    public static void main(String[] args) {
        P2_data dtMhs = new P2_data();
        dtMhs.nama = "Ari";
        dtMhs.n_uts = 80;
        dtMhs.n_uas = 90;
        System.out.println(dtMhs.nama);
        System.out.println(dtMhs.hitungNilaiAkhir());
        
//        Scanner input = new Scanner(System.in);
//        String nim, nama, grade;
//        double n_uts, n_uas, n_akhir;
//
//        System.out.println("===== Input Data Mahasiswa =====");
//        System.out.print("NIM: ");
//        nim = input.next();
//        System.out.print("Nama: ");
//        nama = input.next();
//        System.out.print("Nilai UTS: ");
//        n_uts = input.nextDouble();
//        System.out.print("Nilai UAS: ");
//        n_uas = input.nextDouble();
//        System.out.println("===============================");
//
//        n_akhir = (n_uts + n_uas) / 2;
//
//        if (n_akhir >= 90) {
//            grade = "A";
//        } else if (n_akhir >= 80 && n_akhir < 90) {
//            grade = "B";
//        } else if (n_akhir >= 60 && n_akhir < 80) {
//            grade = "C";
//        } else {
//            grade = "D";
//        }
//
//        System.out.println("======= Nilai Mahasiswa " + nama + " =======");
//        System.out.println("===============================");
//        System.out.println("NIM:" + nim);
//        System.out.println("Nama: " + nama);
//        System.out.println("Nilai UTS: " + n_uts);
//        System.out.println("Nilai UAS: " + n_uas);
//        System.out.println("Nilai Akhir: " + n_akhir);
//        System.out.println("Grade: " + grade);
//        System.out.println("===============================");
    }
}
