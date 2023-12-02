<%-- 
    Document   : index
    Created on : Nov 28, 2023, 10:24:40 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Aplikasi Rent Car</title>
    <!-- Tambahkan gaya CSS Anda di sini -->
    <style>
        /* CSS styling goes here */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
        header {
            background-color: #333;
            color: #fff;
            text-align: center;
            padding: 1em;
        }
        nav {
            background-color: #444;
            color: #fff;
            padding: 1em;
        }
        nav ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
        }
        nav li {
            display: inline;
            margin-right: 10px;
        }
        nav li a {
            color: white;
            text-decoration: none;
        }
        #content {
            padding: 1em;
        }
        footer {
            background-color: #333;
            color: #fff;
            text-align: center;
            padding: 1em;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
        
        form {
            display: flex;
            flex-direction: column;
            max-width: 400px;
        }

        label {
            margin-bottom: 8px;
        }

        input,
        textarea {
            padding: 8px;
            margin-bottom: 16px;
        }

    </style>
</head>
<body>

    <header>
        <h1>Aplikasi Rent Car</h1>
    </header>

    <nav>
        <ul>
            <li><a href="index.jsp">Halaman Utama</a></li>
            <li><a href="#content" onclick="loadContent('mobilForm.jsp')">Form Mobil</a></li>
            <li><a href="#content" onclick="loadContent('customerForm.jsp')">Form Customer</a></li>
            <li><a href="#content" onclick="loadContent('transaksiForm.jsp')">Form Transaksi</a></li>
            <li><a href="#content" onclick="loadContent('transaksiLaporan.jsp')">Laporan Transaksi</a></li>
        </ul>
    </nav>

    <div id="content">
        <h2>Selamat datang di Aplikasi Rent Car!</h2>
    </div>

    
    <script>
        function loadContent(page) {
            // Load content dynamically based on the clicked link
            var contentDiv = document.getElementById('content');
            var xhttp = new XMLHttpRequest();
            xhttp.onreadystatechange = function() {
                if (this.readyState == 4 && this.status == 200) {
                    contentDiv.innerHTML = this.responseText;
                }
            };
            xhttp.open("GET", page, true);
            xhttp.send();
        }
    </script>

</body>
</html>
