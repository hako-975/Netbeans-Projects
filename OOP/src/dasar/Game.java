/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dasar;

/**
 *
 * @author andri
 */
public class Game {
    public static void main(String[] args)
    {
        // membuat objek player
        Play p = new Play();
        
        // mengisi atribut player
        p.name = "Andri";
        p.speed = 90;
        p.healthPoin = 100;
        
        // menjalankan method
        p.Run();
        
        if (p.IsDead()) 
        {
            System.out.println("Game Over");
        }
    }
}
