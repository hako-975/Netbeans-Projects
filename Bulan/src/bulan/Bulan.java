/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bulan;

/**
 *
 * @author andri
 */
public class Bulan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bulan bulan = new Bulan();
        bulan.namaBulan();
    }
    
    public void namaBulan() {
        String[] namaBulan = {
            "Januari",
            "Februari",
            "Maret",
            "April",
            "Mei",
            "Juni",
            "Juli",
            "Agustus",
            "September",
            "Oktober",
            "November",
            "Desember"
        };
        
        for (String bulan : namaBulan) {
            System.out.println("Bulan " + bulan);
        }
    }
    
}
