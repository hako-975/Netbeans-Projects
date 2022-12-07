<%
    String baseUrl = "http://localhost:8080/latihan_project_andri/";
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
    <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
        <div class="container">
            <a class="navbar-brand" href="<%= baseUrl%>"><img src="<%= baseUrl%>/media/icon.png" width="45" class="rounded m-0 me-2" alt="icon"/> Andri Lab</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarCollapse">
                <ul class="navbar-nav me-auto mb-2 mb-md-0">
                    <%
                        if (statusLogin.equals("1")) {
                    %>
                    <li class="nav-item">
                        <a class="nav-link text-dark mx-2 px-3 btn btn-light" href="<%= baseUrl%>admin.jsp"><i class="bi bi-speedometer"></i> Admin</a>
                    </li>
                    <%
                        }
                    %>
                    <li class="nav-item">
                        <a class="nav-link text-dark mx-2 px-3 btn btn-light" href="<%= baseUrl%>"><i class="bi bi-house"></i> Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link text-dark mx-2 px-3 btn btn-light" href="<%= baseUrl%>about.jsp"><i class="bi bi-person"></i> About</a>
                    </li>
                </ul>
                <ul class="navbar-nav mb-2 mb-md-0">
                    <li class="nav-item">
                        <%
                            if (statusLogin.equals("1")) {
                        %>
                    <li class="nav-item dropdown btn btn-light">
                        <a class="nav-link dropdown-toggle text-dark" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            <i class="bi bi-person"></i> <%= nama %>
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="#"><i class="bi bi-gear"></i> Settings</a></li>
                            <li><hr class="dropdown-divider"></li>
                            <li><a class="dropdown-item btn btn-danger" href="<%= baseUrl%>logout.jsp"><i class="bi bi-box-arrow-right"></i> Logout</a></li>
                        </ul>
                    </li>
                    <%
                    } else {
                    %>
                    <a class="btn btn-success" href="<%= baseUrl%>login.jsp"><i class="bi bi-box-arrow-in-right"></i> Login</a>
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