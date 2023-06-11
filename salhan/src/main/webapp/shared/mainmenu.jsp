<%    String menu = "";
    String baseUrl = "http://localhost:8080/salhan/";
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
    <a href="http://localhost:8080/salhan" class="menu">Home</a>
    <%= menu %>
</div>