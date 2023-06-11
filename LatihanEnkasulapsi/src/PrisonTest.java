/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andri
 */
public class PrisonTest {

    public static void main(String[] args) {
        Cell c01 = new Cell("Cell 01", "123");
        Cell c02 = new Cell("Cell 02", "321");
        Prisoner p01 = new Prisoner("Bubba", 170, c01);
        Prisoner p02 = new Prisoner("Babba", 165, c01);
        p01.display();
        c01.openDoor("123");
        p01.display();
    }
}
