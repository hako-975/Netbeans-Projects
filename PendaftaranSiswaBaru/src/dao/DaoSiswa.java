/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.sun.istack.internal.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import koneksi.Koneksi;
import model.Siswa;

/**
 *
 * @author andri
 */
public class DaoSiswa implements ImplementSiswa {
    Connection connection;
    
    final String insert = "INSERT INTO siswa (nama_siswa, no_telp_siswa, alamat_siswa) VALUES (?, ?, ?)";
    final String update = "UPDATE siswa SET nama_siswa=?, no_telp_siswa=?, alamat_siswa=? WHERE id_siswa = ?";
    final String delete = "DELETE FROM siswa WHERE id_siswa = ?";
    final String select = "SELECT * FROM siswa";
    final String cariNama = "SELECT * FROM siswa WHERE nama_siswa LIKE ?";
    
    public DaoSiswa() {
        connection = Koneksi.connection();
    }
    
    @Override
    public void Insert(Siswa s) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setString(1, s.getNamaSiswa());
            statement.setString(2, s.getNoTelpSiswa());
            statement.setString(3, s.getAlamatSiswa());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()) {
                s.setIdSiswa(rs.getInt(1));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void Update(Siswa s) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update);
            statement.setString(1, s.getNamaSiswa());
            statement.setString(2, s.getNoTelpSiswa());
            statement.setString(3, s.getAlamatSiswa());
            statement.setInt(4, s.getIdSiswa());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void Delete(int id) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<Siswa> getAll() {
        List<Siswa> ls = null;
        try {
            ls = new ArrayList<Siswa>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                Siswa s = new Siswa();
                s.setIdSiswa(rs.getInt("id_siswa"));
                s.setNamaSiswa(rs.getString("nama_siswa"));
                s.setNoTelpSiswa(rs.getString("no_telp_siswa"));
                s.setAlamatSiswa(rs.getString("alamat_siswa"));
                ls.add(s);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return ls;
    }

    @Override
    public List<Siswa> getCariNamaSiswa(String namaSiswa) {
        List<Siswa> ls = null;
        try {
            ls = new ArrayList<Siswa>();
            PreparedStatement st = connection.prepareStatement(cariNama);
            st.setString(1, "%" + namaSiswa + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Siswa s = new Siswa();
                s.setIdSiswa(rs.getInt("id_siswa"));
                s.setNamaSiswa(rs.getString("nama_siswa"));
                s.setNoTelpSiswa(rs.getString("no_telp_siswa"));
                s.setAlamatSiswa(rs.getString("alamat_siswa"));
                ls.add(s);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return ls;
    }
    
}
