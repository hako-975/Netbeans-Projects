<%-- 
    Document   : admin
    Created on : Dec 6, 2022, 11:12:31 AM
    Author     : aisyah
--%>
<%
    String baseUrl = "";
    if (session.getAttribute("statusLogin") == null) {
        response.sendRedirect("login.jsp");
    } else {
        baseUrl = "http://localhost:8080/latihan_project_aisyah/";
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
        <div class="row">
            <div class="col-lg-5">
                <a href="<%= baseUrl%>/media/profile.jpg" target="_blank">
                    <img class="img-profile" src="<%= baseUrl%>/media/aisyah.jpeg" alt="Foto Profile"/>
                </a>
                <table class="table table-bordered rounded mt-2">
                    <tr>
                        <td><strong>Nama Lengkap</strong></td>
                        <td>Aisyah.M.K.S</td>
                    </tr>
                    <tr>
                        <td><strong>NIM</strong></td>
                        <td>201011400704</td>
                    </tr>
                    <tr>
                        <td><strong>Kelas</strong></td>
                        <td>05TPLP016</td>
                    </tr>
                    <tr>
                        <td><strong>Email</strong></td>
                        <td>aisyahmawar886@gmail.com</td>
                    </tr>
                </table>
            </div>
        </div>

        <!-- end content -->

        <jsp:include page="/shared/footer.jsp" />
