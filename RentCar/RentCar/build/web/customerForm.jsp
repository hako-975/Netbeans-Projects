<%-- 
    Document   : pembeliForm
    Created on : Nov 29, 2023, 12:19:24 AM
    Author     : Churul Ain Yahya
--%>

<h2>Formulir Data Customer</h2>
<form action="CustomerServlet" method="post">
    <label for="nama_customer">Nama Customer:</label>
    <input type="text" id="nama_customer" name="nama_customer" required><br>

    <label for="no_telp_customer">Nomor Telepon Customer:</label>
    <input type="number" id="no_telp_customer" name="no_telp_customer" required><br>

    <label for="alamat_customer">Alamat Customer:</label>
    <textarea id="alamat_customer" name="alamat_customer" rows="4" required></textarea><br>

    <input type="submit" value="Simpan">
</form>
