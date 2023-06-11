/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dasar;

/**
 *
 * @author andri
 */
public class Play {
    // definisi atribut
    String name;
    int speed;
    int healthPoin;
    
    // definisi method Run
    void Run()
    {
        System.out.println(name + " sedang berjalan");
        System.out.println("Kecepatan: " + speed);
    }
    
    // definisi method IsDead untuk mengecek nilai kesehatan (healthPoin)
    boolean IsDead()
    {
        if (healthPoin <= 0) 
        {
            return true;
        }
        
        return false;
    }
}
