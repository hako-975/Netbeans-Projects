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
public class CustomerServlet extends HttpServlet {

    private static final String jdbcDriver = "com.mysql.cj.jdbc.Driver";
    private static final String JDBC_URL = "jdbc:mysql://localhost/rent_car";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    private String nama_customer;
    private String no_telp_customer;
    private String alamat_customer;

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
            out.println("<title>Servlet CustomerServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CustomerServlet at " + request.getContextPath() + "</h1>");
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
        nama_customer = request.getParameter("nama_customer");
        no_telp_customer = request.getParameter("no_telp_customer");
        alamat_customer = request.getParameter("alamat_customer");

        saveCustomer(nama_customer, no_telp_customer, alamat_customer);

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Proses Customer</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Data Customer yang Diproses:</h2>");
        out.println("<p>Nama Customer: " + nama_customer + "</p>");
        out.println("<p>Nomor Telepon: " + no_telp_customer + "</p>");
        out.println("<p>Alamat: " + alamat_customer + "</p>");
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

    private void saveCustomer(String nama_customer, String no_telp_customer, String alamat_customer) {
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
        String sql = "INSERT INTO customer VALUES (?, ?, ?, ?)";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, null);
            preparedStatement.setString(2, nama_customer);
            preparedStatement.setString(3, no_telp_customer);
            preparedStatement.setString(4, alamat_customer);

            // Menjalankan pernyataan SQL
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MobilServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
