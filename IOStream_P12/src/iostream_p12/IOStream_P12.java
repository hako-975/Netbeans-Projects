/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iostream_p12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author churul
 */
public class IOStream_P12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Masukkan NIM: ");
            String nim = reader.readLine();

            System.out.print("Masukkan Nama: ");
            String nama = reader.readLine();

            System.out.print("Masukkan Kelas: ");
            String kelas = reader.readLine();

            System.out.println("\nOutput:");
            System.out.println("NIM: " + nim);
            System.out.println("Nama: " + nama);
            System.out.println("Kelas: " + kelas);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
