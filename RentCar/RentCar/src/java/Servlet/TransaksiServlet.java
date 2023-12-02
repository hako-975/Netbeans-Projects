/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Churul Ain Yahya
 */
public class TransaksiServlet extends HttpServlet {

    private static final String jdbcDriver = "com.mysql.cj.jdbc.Driver";
    private static final String JDBC_URL = "jdbc:mysql://localhost/rent_car";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    private String id_customer;
    private String id_mobil;
    private String jam_sewa;
    private String tgl_sewa;

    Connection connection;
    PreparedStatement preparedStatement;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TransaksiServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TransaksiServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        id_customer = request.getParameter("id_customer");
        id_mobil = request.getParameter("id_mobil");
        jam_sewa = request.getParameter("jam_sewa");
        tgl_sewa = request.getParameter("tgl_sewa");

        saveTransaksi(id_customer, id_mobil, jam_sewa, tgl_sewa);

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Proses Transaksi</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Data Transaksi yang Diproses:</h2>");
        out.println("<p>ID Customer: " + id_customer + "</p>");
        out.println("<p>ID Mobil: " + id_mobil + "</p>");
        out.println("<p>Jam Sewa: " + jam_sewa + "</p>");
        out.println("<p>Tgl Sewa: " + tgl_sewa + "</p>");
        out.println("<a href='index.jsp'>Kembali</a>");
        out.println("</body>");
        out.println("</html>");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void saveTransaksi(String id_customer, String id_mobil, String jam_sewa, String tgl_sewa) {
        try {
            Class.forName(jdbcDriver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MobilServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(MobilServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Query SQL untuk menyimpan data mobil ke dalam tabel
        String sql = "INSERT INTO transaksi VALUES (?, ?, ?, ?, ?)";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, null);
            preparedStatement.setString(2, id_customer);
            preparedStatement.setString(3, id_mobil);
            preparedStatement.setString(4, jam_sewa);
            preparedStatement.setString(5, tgl_sewa);

            // Menjalankan pernyataan SQL
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MobilServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
