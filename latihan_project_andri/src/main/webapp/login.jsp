<%-- 
    Document   : login
    Created on : Dec 6, 2022, 11:11:31 AM
    Author     : andri
--%>
<%
    String baseUrl = "http://localhost:8080/latihan_project_andri/";
    String notif = "";
    try {
        String gagalLogin = session.getAttribute("gagalLogin").toString();
        if (gagalLogin.equals("1")) {
            notif = "<div class='alert alert-danger alert-dismissible fade show' role='alert'>"
                    + "<span><strong>Username</strong> dan <strong>Password</strong> tidak ditemukan!</span>"
                    + "<button type='button' class='btn-close' data-bs-dismiss='alert' aria-label='Close'></button>"
                    + "</div>";
            session.removeAttribute("gagalLogin");
        }
    } catch (Exception e) {
    }

    Cookie[] cookie_ = request.getCookies();
    for (int i = 0; i < cookie_.length; i++) {
        if (cookie_[i].getName().equals("rememberMeCookie")) {
            // set session
            session.setAttribute("statusLogin", "1");
            session.setAttribute("nama", "Andri Firman Saputra");
            session.setMaxInactiveInterval(600);
            response.sendRedirect("admin.jsp");
        }
    }

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" class="h-100">
    <head>
        <jsp:include page="/shared/header.jsp" />
        <title>Home Page</title>
    </head>
    <body class="d-flex flex-column h-100">

        <jsp:include page="/shared/mainmenu.jsp" />

        <!-- content -->
        <form class="form-signin w-100 m-auto" action="auth.jsp" method="post">
            <%= notif%>

            <img class="mb-4 d-block mx-auto" src="<%= baseUrl%>/media/icon.png" alt="Icon" width="75">
            <h1 class="h3 mb-3 fw-normal text-center">Please sign in</h1>

            <div class="form-floating">
                <input type="text" name="user" class="form-control" id="floatingInput" placeholder="Username" required>
                <label for="floatingInput">Username</label>
            </div>
            <div class="form-floating">
                <input type="password" name="pass" class="form-control" id="floatingPassword" placeholder="Password" required>
                <label for="floatingPassword">Password</label>
            </div>

            <div class="checkbox mb-3">
                <label>
                    <input type="checkbox" name="remember_me" value="remember_me"> Remember me
                </label>
            </div>
            <button class="w-100 btn btn-lg btn-success" type="submit"><i class="bi bi-box-arrow-in-right"></i> Login</button>
        </form>

        <!-- end content -->

        <jsp:include page="/shared/footer.jsp" />
