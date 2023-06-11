<%-- 
    Document   : index
    Created on : Nov 15, 2022, 10:37:04 AM
    Author     : andri
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <!--include file header-->
    <jsp:include page="/shared/header.jsp" />
    <body>
        <div class="container">
            <div class="banner"></div>
            <!--include file main menu-->
            <jsp:include page="/shared/mainmenu.jsp" />
            <div class="content">
                <h2 class="text-center">Kontak</h2>
                <div class="profile"></div>
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
            <!--footer-->
            <jsp:include page="/shared/footer.jsp" />
        </div>
    </body>
</html>
