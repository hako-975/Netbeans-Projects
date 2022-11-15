<%-- 
    Document   : index
    Created on : Nov 1, 2022, 11:05:10 AM
    Author     : andri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="auth.jsp" method="post">
            <label>Username</label>
            <input type="text" name="user"> <br>
            <label>Password</label>
            <input type="password" name="pass"> <br>
            <button type="submit">Kirim</button>
        </form>
    </body>
</html>
