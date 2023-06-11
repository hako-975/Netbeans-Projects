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
                <%
                    String notif = "";
                    try {
                        String gagalLogin = session.getAttribute("gagalLogin").toString();
                        if (gagalLogin.equals("1")) {
                            notif = "<h3 class='notif-gagal'>Username dan Password tidak ditemukan!</h3>";
                            session.removeAttribute("gagalLogin");
                        }
                    } catch (Exception e) {
                    }
                %>
                <%= notif %>
                <div class="form">
                    <h2 class="heading2">Login</h2>
                    <form action="auth.jsp" method="post">
                        <table>
                            <tr>
                                <td><label>Username</label></td>
                                <td><input type="text" name="user"></td>
                            </tr>
                            <tr>
                                <td><label>Password</label></td>
                                <td><input type="password" name="pass"></td>
                            </tr>
                        </table>
                        <button class="buttonLogin" type="submit">Kirim</button>
                    </form>
                </div>
            </div>
            <!--footer-->
            <jsp:include page="/shared/footer.jsp" />
        </div>
    </body>
</html>
