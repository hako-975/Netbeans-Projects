<%-- 
    Document   : auth
    Created on : Dec 6, 2022, 11:12:03 AM
    Author     : andri
--%>

<%
    String username = request.getParameter("user");
    String password = request.getParameter("pass");
    String rememberMe = request.getParameter("remember_me");
    
    if (username.equals("admin") && password.equals("1234")) {
        //  login berhasil
        session.setAttribute("statusLogin", "1");
        session.setAttribute("nama", "Andri Firman Saputra");
        session.setMaxInactiveInterval(600);

        if (rememberMe != null) {
            Cookie rememberMeCookie = new Cookie("rememberMeCookie", "statusLogin");
            rememberMeCookie.setMaxAge(3600);
            response.addCookie(rememberMeCookie);
        }
        
        response.sendRedirect("admin.jsp");
    } else {
        //  login gagal
        session.setAttribute("gagalLogin", "1");
        session.setMaxInactiveInterval(3);
        response.sendRedirect("login.jsp");
    }
%>
