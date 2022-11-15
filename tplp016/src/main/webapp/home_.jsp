<%-- 
    Document   : home
    Created on : Nov 1, 2022, 11:05:54 AM
    Author     : andri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page Home</title>
    </head>
    <body>
        <h1>Selamat Datang!</h1>
        <%
            String userLogin = "";
            
            String nimLogin = "";
            String namaLogin = "";
            String kelasLogin = "";
            String emailLogin = "";
            
            String nimCookie = "";
            String namaCookie = "";
            String kelasCookie = "";
            String emailCookie = "";

            String notif = "";
            
            try {
                // get data dari session
                userLogin = session.getAttribute("userLogin").toString();

                nimLogin = session.getAttribute("nimLogin").toString();
                namaLogin = session.getAttribute("namaLogin").toString();
                kelasLogin = session.getAttribute("kelasLogin").toString();
                emailLogin = session.getAttribute("emailLogin").toString();
                
                // get data dari cookie
                Cookie[] cookie_ = request.getCookies();
                for (int i = 0; i < cookie_.length; i++) {
                    if (cookie_[i].getName().equals("nimCookie")) {
                        // set value ke dalam variable 
                        nimCookie = cookie_[i].getValue().toString();
                    }

                    if (cookie_[i].getName().equals("namaCookie")) {
                        // set value ke dalam variable 
                        namaCookie = cookie_[i].getValue().toString();
                    }

                    if (cookie_[i].getName().equals("kelasCookie")) {
                        // set value ke dalam variable 
                        kelasCookie = cookie_[i].getValue().toString();
                    }

                    if (cookie_[i].getName().equals("emailCookie")) {
                        // set value ke dalam variable 
                        emailCookie = cookie_[i].getValue().toString();
                    }
                }
            } catch (Exception ex) {
              //  response.sendRedirect("index.jsp");
            }
            
            if (userLogin.equals("1")) {
                notif = "Hello, " + namaLogin;
            } else {
                notif = "Login kembali";
                response.sendRedirect("index.jsp");
            }
        %>
        <br>
        <%= notif %>
        <br>
        Data dari Session
        <br>
        NIM = <%= nimLogin %>
        <br>
        Nama Mahasiswa = <%= namaLogin %>
        <br>
        Kelas = <%= kelasLogin %>
        <br>
        Email = <%= emailLogin %>
        <br>
        <br>
        Data dari cookie
        <br>
        NIM = <%= nimCookie %>
        <br>
        Nama Mahasiswa = <%= namaCookie %>
        <br>
        Kelas = <%= kelasCookie %>
        <br>
        Email = <%= emailCookie %>
        <br>
    </body>
</html>
