<%
    String baseUrl = "http://localhost:8080/latihan_project_aisyah/";
    String statusLogin = "";
    String nama = "";
    try {
        statusLogin = session.getAttribute("statusLogin").toString();
        nama = session.getAttribute("nama").toString();
    } catch (Exception e) {
    }
%>

<header>
    <!-- Fixed navbar -->
    <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-primary">
        <div class="container">
            <a class="navbar-brand fw-bold" href="<%= baseUrl%>">Aisyah</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarCollapse">
                <ul class="navbar-nav me-auto mb-2 mb-md-0">
                    <%
                        if (statusLogin.equals("1")) {
                    %>
                    <li class="nav-item">
                        <a class="nav-link text-dark mx-2 px-3 text-white fw-bold" href="<%= baseUrl%>admin.jsp">Admin</a>
                    </li>
                    <%
                        }
                    %>
                    <li class="nav-item">
                        <a class="nav-link text-dark mx-2 px-3 text-white fw-bold" href="<%= baseUrl%>">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link text-dark mx-2 px-3 text-white fw-bold" href="<%= baseUrl%>about.jsp">About</a>
                    </li>
                </ul>
                <ul class="navbar-nav mb-2 mb-md-0">
                    <li class="nav-item">
                        <%
                            if (statusLogin.equals("1")) {
                        %>
                    <li class="nav-item">
                        <a class="nav-link mx-2 px-3 text-white fw-bold btn btn-danger" href="<%= baseUrl%>logout.jsp">Logout</a>
                    </li>
                    <%
                    } else {
                    %>
                    <a class="text-white fw-bold text-decoration-none" href="<%= baseUrl%>login.jsp">Login</a>
                    <%
                        }
                    %>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</header>

<!-- Begin page content -->
<main class="flex-shrink-0 ">
    <div class="container my-4">