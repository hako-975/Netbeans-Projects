<%-- 
    Document   : transaksiForm
    Created on : Nov 29, 2023, 12:25:19 AM
    Author     : Churul Ain Yahya
--%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>

<%
    Connection connection = null;
    Statement statementCustomer = null;
    Statement statementMobil = null;
    ResultSet resultSetCustomer = null;
    ResultSet resultSetMobil = null;

    try {
        // JDBC URL, username, dan password basis data
        String jdbcDriver = "com.mysql.cj.jdbc.Driver";
        String JDBC_URL = "jdbc:mysql://localhost/rent_car";
        String DB_USER = "root";
        String DB_PASSWORD = "";

        // Membuat koneksi ke database
        Class.forName(jdbcDriver);
        connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);
        
        // Membuat statement untuk customer
        statementCustomer = connection.createStatement();
        String sqlCustomer = "SELECT * FROM customer";
        resultSetCustomer = statementCustomer.executeQuery(sqlCustomer);

        // Membuat statement untuk mobil
        statementMobil = connection.createStatement();
        String sqlMobil = "SELECT * FROM mobil";
        resultSetMobil = statementMobil.executeQuery(sqlMobil);
%>

<html>
<head>
    <title>Formulir Data Transaksi</title>
</head>
<body>

<h2>Formulir Data Transaksi</h2>
<form action="TransaksiServlet" method="post">
    <label for="id_customer">Customer:</label>
    <select id="id_customer" name="id_customer" required>
        <% 
            // Assuming resultSetCustomer contains customer data
            while (resultSetCustomer.next()) {
                int customerId = resultSetCustomer.getInt("id_customer");
                String customerName = resultSetCustomer.getString("nama_customer");
        %>
            <option value="<%= customerId %>"><%= customerName %></option>
        <% } %>
    </select><br>

    <label for="id_mobil">Mobil:</label>
    <select id="id_mobil" name="id_mobil" required>
        <% 
            // Assuming resultSetMobil contains car data
            while (resultSetMobil.next()) {
                int carId = resultSetMobil.getInt("id_mobil");
                String carName = resultSetMobil.getString("merk_mobil");
        %>
            <option value="<%= carId %>"><%= carName %></option>
        <% } %>
    </select><br>

    <label for="jam_sewa">Jam Sewa:</label>
    <input type="number" id="jam_sewa" name="jam_sewa" required><br>

    <label for="tgl_sewa">Tanggal Sewa:</label>
    <input type="date" id="tgl_sewa" name="tgl_sewa" required><br>

    <input type="submit" value="Simpan">
</form>

</body>
</html>

<%
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        // Close resources in the reverse order of their creation
        try {
            if (resultSetCustomer != null) resultSetCustomer.close();
            if (resultSetMobil != null) resultSetMobil.close();
            if (statementCustomer != null) statementCustomer.close();
            if (statementMobil != null) statementMobil.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
%>
