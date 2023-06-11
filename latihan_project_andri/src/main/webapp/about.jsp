<%-- 
    Document   : about
    Created on : Dec 7, 2022, 2:51:29 PM
    Author     : andri
--%>
<%
    String baseUrl = "http://localhost:8080/latihan_project_andri/";
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" class="h-100">
    <head>
        <jsp:include page="/shared/header.jsp" />
        <title>About Page</title>
    </head>
    <body class="d-flex flex-column h-100">

        <jsp:include page="/shared/mainmenu.jsp" />

        <img class="mb-4 d-block mx-auto" src="<%= baseUrl%>/media/icon.png" alt="Icon" width="75">

        <!-- content -->
        <h1 class="text-center">Tentang Andri Lab</h1>
        <hr class="my-3">

        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Deserunt beatae facere id molestias animi est excepturi officiis ad vitae, at. Exercitationem hic dicta voluptatum voluptates aut harum, laboriosam sint veniam!</p>

        <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Magnam, ut. Quasi laudantium praesentium debitis. Harum dolorem, nulla, qui necessitatibus quisquam officia, officiis quos voluptatem labore earum optio laudantium tenetur dicta.</p>

        <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Animi velit, itaque voluptas tempore totam atque quibusdam aperiam dignissimos. Corrupti, dolor temporibus molestiae possimus doloremque tenetur praesentium impedit id delectus ex.</p>

        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Numquam facere voluptates natus omnis modi blanditiis recusandae. Nemo temporibus earum sint eius quaerat doloribus quasi quia pariatur excepturi? Veniam, quasi, accusantium?</p>
        <!-- end content -->

        <jsp:include page="/shared/footer.jsp" />