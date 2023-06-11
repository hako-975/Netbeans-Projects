/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andri
 */
public class Cell {

    private String namaCell;
    private String key;
    private boolean isOpen;

    Cell(String namaCell, String key) {
        this.namaCell = namaCell;
        this.key = key;
        isOpen = false;
    }

    public String getNamaCell() {
        return namaCell;
    }

    public void setNamaCell(String namaCell) {
        this.namaCell = namaCell;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public String getKey() {
        return key;
    }

    public void openDoor(String key) {
        if (key.equals(getKey())) {
            if (isOpen() == true) {
                setOpen(false);
            } else {
                setOpen(true);
            }
        } else {
            System.out.println("Tidak punya akses");
        }
    }
}
