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
public class MobilServlet extends HttpServlet {
    private static final String jdbcDriver = "com.mysql.cj.jdbc.Driver";
    private static final String JDBC_URL = "jdbc:mysql://localhost/rent_car";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    private String merk_mobil;
    private int harga_sewa_per_jam;
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
            out.println("<title>Servlet MobilServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MobilServlet at " + request.getContextPath() + "</h1>");
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
        merk_mobil = request.getParameter("merk_mobil");
        harga_sewa_per_jam = Integer.parseInt(request.getParameter("harga_sewa_per_jam"));
        
        saveMobil(merk_mobil, harga_sewa_per_jam);
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Tambah Data Mobil</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Data Mobil yang Diproses:</h2>");
        out.println("<p>Merk Mobil: " + merk_mobil + "</p>");
        out.println("<p>Harga Sewa Per Jam: " + harga_sewa_per_jam + "</p>");
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

    private void saveMobil(String merk_mobil, int harga_sewa_per_jam) {
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
        String sql = "INSERT INTO mobil VALUES (?, ?, ?)";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, null);
            preparedStatement.setString(2, merk_mobil);
            preparedStatement.setInt(3, harga_sewa_per_jam);

            // Menjalankan pernyataan SQL
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MobilServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
