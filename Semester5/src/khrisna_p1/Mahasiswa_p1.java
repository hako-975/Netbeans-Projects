/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khrisna_p1;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
class DataMHS {
    String nim, nama, kelas;
    double uts, uas, rata;
    public double hitungRatarata()
    {
        rata = (uts + uas /2);
        return rata;
    }
}

public class Mahasiswa_p1 {
    private static boolean x;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataMHS dtMHS = new DataMHS();
        dtMHS.nim = "1234";
        dtMHS.uts = 86;
        dtMHS.uas = 90;
        System.out.println(dtMHS.hitungRatarata());
        
        //String nim, nama, kelas;
        //double uts, uas, rata;

        //System.out.println("=======Masukan Data Mahasiswa============");
        //System.out.println("Nim :");
        //nim = input.next();
        //System.out.println("Nama : ");
        //nama = input.next();
        //System.out.println("Kelas : ");
        //kelas = input.next();
        //System.out.println("Nilai UTS : ");
        //uts = input.nextDouble();
        //System.out.println("Nilai UAS : ");
        //uas = input.nextDouble();
        //System.out.println("=====================");
        
        //rata = (uts + uas) /2;
        //System.out.println("=======Nilai Mahasiswa " + nama + " ============");
        //System.out.println("Nilai Akhir :" +rata);
    }
}
