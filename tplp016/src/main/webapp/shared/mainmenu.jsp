<%    String menu = "";
    String baseUrl = "http://localhost:8080/tplp016/";
    try {
        String statusLogin = session.getAttribute("statusLogin").toString();
        String namaMahasiswa = session.getAttribute("namaMahasiswa").toString();
        if (statusLogin.equals("1")) {
            menu = "<a href='" + baseUrl + "logout.jsp' class='menu btn-logout'>Logout</a> "
            + "Hello, " + namaMahasiswa;
        }
    } catch (Exception e) {
        menu = "<a href='" + baseUrl + "login.jsp' class='menu'>Login</a>";
    }
%>
<div class="mainmenu">
    <a href="http://localhost:8080/tplp016" class="menu">Home</a>
    <a href="http://localhost:8080/tplp016/portfolio.jsp" class="menu">Portfolio</a>
    <a href="http://localhost:8080/tplp016/kontak.jsp" class="menu">Kontak</a>
    <%= menu %>
</div>