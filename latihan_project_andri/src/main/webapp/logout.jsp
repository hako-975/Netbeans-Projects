<%-- 
    Document   : logout
    Created on : Dec 6, 2022, 11:13:35 AM
    Author     : andri
--%>

<%
    Cookie cookie = null;
    Cookie[] cookies = null;

    // Get an array of Cookies associated with the this domain
    cookies = request.getCookies();

    if (cookies != null) {
        for (int i = 0; i < cookies.length; i++) {
            cookie = cookies[i];
            if ((cookie.getName()).compareTo("rememberMeCookie") == 0) {
                cookie.setMaxAge(0);
                response.addCookie(cookie);
            }
        }
    }

    session.removeAttribute("statusLogin");
    session.removeAttribute("nama");

    session.invalidate();
    response.sendRedirect("index.jsp");
%>