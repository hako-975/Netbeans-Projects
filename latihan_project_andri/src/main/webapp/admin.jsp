<%-- 
    Document   : admin
    Created on : Dec 6, 2022, 11:12:31 AM
    Author     : andri
--%>
<%
    if (session.getAttribute("statusLogin") == null) {
        response.sendRedirect("login.jsp");
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" class="h-100">
    <head>
        <jsp:include page="/shared/header.jsp" />
        <title>Admin Page</title>
    </head>
    <body class="d-flex flex-column h-100">
        <jsp:include page="/shared/mainmenu.jsp" />


        <!-- content -->

        <h1>Admin</h1>
        <hr class="my-3">
        <div class="row">
            <div class="col-lg-5">
                <table class="mx-auto table">
                    <tr>
                        <td><strong>Nama Lengkap</strong></td>
                        <td>:</td>
                        <td><strong>Andri Firman Saputra</strong></td>
                    </tr>
                    <tr>
                        <td><strong>NIM</strong></td>
                        <td>:</td>
                        <td><strong>201011402125</strong></td>
                    </tr>
                    <tr>
                        <td><strong>Kelas</strong></td>
                        <td>:</td>
                        <td><strong>05TPLP016</strong></td>
                    </tr>
                    <tr>
                        <td><strong>Email</strong></td>
                        <td>:</td>
                        <td><strong>andrifirmansaputra1@gmail.com</strong></td>
                    </tr>
                </table>
            </div>
        </div>

        <!-- end content -->

        <jsp:include page="/shared/footer.jsp" />
