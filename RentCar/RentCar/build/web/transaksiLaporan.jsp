<%-- 
    Document   : transaksiLaporan
    Created on : Nov 29, 2023, 12:30:35 AM
    Author     : Churul Ain Yahya
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Transaksi Laporan</title>
        <style>
            table {
                border-collapse: collapse;
                width: 80%;
                margin: 20px;
            }

            th, td {
                border: 1px solid #dddddd;
                text-align: left;
                padding: 8px;
            }

            th {
                background-color: #f2f2f2;
            }
        </style>
    </head>
    <body>

        <%@ page import="java.sql.*" %>
        <%@ page import="java.util.*" %>

        <%
            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;

            try {
                // JDBC URL, username, dan password basis data
                String jdbcDriver = "com.mysql.cj.jdbc.Driver";
                String JDBC_URL = "jdbc:mysql://localhost/rent_car";
                String DB_USER = "root";
                String DB_PASSWORD = "";

                // Membuat koneksi ke database
                Class.forName(jdbcDriver);
                connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);

                // Membuat pernyataan SQL
                String sql = "SELECT *, (harga_sewa_per_jam * jam_sewa) as total_pembayaran FROM transaksi INNER JOIN customer ON transaksi.id_customer = customer.id_customer INNER JOIN mobil ON transaksi.id_mobil = mobil.id_mobil";
                statement = connection.createStatement();
                resultSet = statement.executeQuery(sql);
        %>

        <h2>Laporan Transaksi</h2>
        <table>
            <tr>
                <th>Customer</th>
                <th>Mobil</th>
                <th>Harga Sewa</th>
                <th>Jam Sewa</th>
                <th>Tanggal Sewa</th>
                <th>Total Pembayaran</th>
            </tr>
            <%
                // Menampilkan data transaksi dari tabel
                while (resultSet.next()) {
            %>
            <tr>
                <td><%= resultSet.getString("nama_customer")%></td>
                <td><%= resultSet.getString("merk_mobil")%></td>
                <td><%= resultSet.getString("harga_sewa_per_jam")%></td>
                <td><%= resultSet.getString("jam_sewa")%></td>
                <td><%= resultSet.getString("tgl_sewa")%></td>            
                <td><%= resultSet.getString("total_pembayaran")%></td>
            </tr>
            <%

                }%>
        </table>

        <%
            } catch (ClassNotFoundException | SQLException ex) {
                ex.printStackTrace();
            } finally {
                // Menutup semua sumber daya
                if (resultSet != null) {
                    try {
                        resultSet.close();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
                if (statement != null) {
                    try {
                        statement.close();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
                if (connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        %>

    </body>
</html>
