<%-- 
    Document   : auth
    Created on : Nov 1, 2022, 11:06:11 AM
    Author     : andri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page Auth</title>
    </head>
    <body>
        <h1>Cek Authentikasi</h1>
        Username = <%= request.getParameter("user") %> <br>
        Password = <%= request.getParameter("pass") %>
        <%
            String user = request.getParameter("user");
            String pass = request.getParameter("pass");
            String notif = "";
            
            if (user.equals("admin") && pass.equals("12345")) {
                notif = "Login Berhasil";
                // set data session
                session.setAttribute("userLogin", "1"); // set session
                session.setAttribute("nimLogin", "201011402125"); // set session
                session.setAttribute("namaLogin", "Andri Firman Saputra"); // set session
                session.setAttribute("kelasLogin", "05TPLP016"); // set session
                session.setAttribute("emailLogin", "andrifirmansaputra1@gmail.com"); // set session
                session.setMaxInactiveInterval(300); // 5 menit
                
                // set data cookie
                Cookie nim_cookie = new Cookie("nimCookie", "201011402125_cookie");
                nim_cookie.setMaxAge(300);
                response.addCookie(nim_cookie);

                Cookie nama_cookie = new Cookie("namaCookie", "Andri_Firman_Saputra_cookie");
                nama_cookie.setMaxAge(300);
                response.addCookie(nama_cookie);

                Cookie kelas_cookie = new Cookie("kelasCookie", "05TPLP016_cookie");
                kelas_cookie.setMaxAge(300);
                response.addCookie(kelas_cookie);

                Cookie email_cookie = new Cookie("emailCookie", "andrifirmansaputra1@gmail.com");
                email_cookie.setMaxAge(300);
                response.addCookie(email_cookie);
                
                response.sendRedirect("home.jsp");
            } else {
                notif = "Login Gagal! Username dan password tidak ditemukan!";
            }
        %>
        <br>
        Status Login: <%= notif %>
    </body>
</html>
