<%-- 
    Document   : logout
    Created on : Dec 6, 2022, 11:13:35 AM
    Author     : andri
--%>

<% 
    session.invalidate();
    response.sendRedirect("index.jsp");
%>