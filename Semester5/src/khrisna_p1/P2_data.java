/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package khrisna_p1;

/**
 *
 * @author Lenovo
 */
public class P2_data {
    private String nim, nama, kelas;
    private  double uts, uas, rata;
    private int nilaiAkhir;
    private String grade;

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

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }
    
    
    public double hitungRatarata()
    {
        rata = (uts + uas )/2;
        return rata;
    }  
    
    public String getgrade () {
        if (nilaiAkhir < 50) 
            grade = "E";
        else if(nilaiAkhir < 60)
            grade = "E";
        else if(nilaiAkhir < 70)
            grade = "C";
        else if(nilaiAkhir < 80)
            grade = "B";
        else
            grade ="A";
        
        return grade;
        
    } 

    String grade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
   }

   