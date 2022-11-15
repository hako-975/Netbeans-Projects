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
                <div class="kontak">
                    <h2>Kontak</h2>
                    <div class="profile"></div>
                    <h4>Nama Lengkap: Andri Firman Saputra</h4>
                    <h4>NIM: 201011402125</h4>
                    <h4>Kelas: 05TPLP016</h4>
                    <h4>Email: andrifirmansaputra1@gmail.com</h4>
                </div>
            </div>
            <!--footer-->
            <jsp:include page="/shared/footer.jsp" />
        </div>
    </body>
</html>
