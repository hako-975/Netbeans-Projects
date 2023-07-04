package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Koneksi;
import model.Peserta;

public class PesertaController {
    private Connection connection;
    private PreparedStatement stmt;
    private ResultSet rs;

    public PesertaController() {
        connection = Koneksi.getConnection();
    }

    public List<Peserta> getAllPeserta() {
        List<Peserta> pesertaList = new ArrayList<>();

        try {
            String query = "SELECT * FROM peserta";
            stmt = connection.prepareStatement(query);
            rs = stmt.executeQuery();

            while (rs.next()) {
                String nim = rs.getString("nim");
                String nama = rs.getString("nama");
                String alamat = rs.getString("alamat");
                String telp = rs.getString("telp");
                String alasan = rs.getString("alasan");

                Peserta peserta = new Peserta(nim, nama, alamat, telp, alasan);

                pesertaList.add(peserta);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources();
        }

        return pesertaList;
    }


    public void addPeserta(Peserta peserta) {
        try {
            String query = "INSERT INTO peserta (nim, nama, alamat, telp, alasan) VALUES (?, ?, ?, ?, ?)";
            stmt = connection.prepareStatement(query);
            stmt.setString(1, peserta.getNim());
            stmt.setString(2, peserta.getNama());
            stmt.setString(3, peserta.getAlamat());
            stmt.setString(4, peserta.getTelp());
            stmt.setString(5, peserta.getAlasan());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources();
        }
    }

    public void updatePeserta(Peserta peserta) {
        try {
            String query = "UPDATE peserta SET nama = ?, alamat = ?, telp = ?, alasan = ? WHERE nim = ?";
            stmt = connection.prepareStatement(query);
            stmt.setString(1, peserta.getNama());
            stmt.setString(2, peserta.getAlamat());
            stmt.setString(3, peserta.getTelp());
            stmt.setString(4, peserta.getAlasan());
            stmt.setString(5, peserta.getNim());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources();
        }
    }

    public void deletePeserta(String nim) {
        try {
            String query = "DELETE FROM peserta WHERE nim = ?";
            stmt = connection.prepareStatement(query);
            stmt.setString(1, nim);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources();
        }
    }
    
    public List<Peserta> searchPeserta(String keyword) {
        List<Peserta> pesertaList = new ArrayList<>();

        try {
            String query = "SELECT * FROM peserta WHERE nim LIKE ? OR nama LIKE ?";
            stmt = connection.prepareStatement(query);
            stmt.setString(1, "%" + keyword + "%");
            stmt.setString(2, "%" + keyword + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                String nim = rs.getString("nim");
                String nama = rs.getString("nama");
                String alamat = rs.getString("alamat");
                String telp = rs.getString("telp");
                String alasan = rs.getString("alasan");

                Peserta peserta = new Peserta(nim, nama, alamat, telp, alasan);

                pesertaList.add(peserta);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources();
        }

        return pesertaList;
    }

    public void closeResources() {
        try {
            if (rs != null)
                rs.close();
            if (stmt != null)
                stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
