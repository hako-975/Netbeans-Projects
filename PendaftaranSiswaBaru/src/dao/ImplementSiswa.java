/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import model.*;

/**
 *
 * @author andri
 */
public interface ImplementSiswa {
    public void Insert(Siswa s);
    public void Update(Siswa s);
    public void Delete(int id);
    
    public List<Siswa> getAll();
    public List<Siswa> getCariNamaSiswa(String namaSiswa);
}
