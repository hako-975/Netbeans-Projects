<%
    String username = request.getParameter("user");
    String password = request.getParameter("pass");
    
    if (username.equals("admin") && password.equals("1234")) {
        //  login berhasil
        session.setAttribute("statusLogin", "1");
        session.setAttribute("namaMahasiswa", "Salhan Taris Agusti");
        session.setMaxInactiveInterval(600);
        response.sendRedirect("admin.jsp");
    } else {
        //  login gagal
        session.setAttribute("gagalLogin", "1");
        session.setMaxInactiveInterval(3);
        response.sendRedirect("login.jsp");
    }
%>