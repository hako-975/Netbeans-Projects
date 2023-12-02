<%-- 
    Document   : carForm
    Created on : Nov 28, 2023, 10:28:42 PM
    Author     : Churul Ain Yahya
--%>

<h2>Formulir Data Mobil</h2>
<form action="MobilServlet" method="post">
    <label for="merk_mobil">Merek Mobil:</label>
    <input type="text" id="merk_mobil" name="merk_mobil" required><br>

    <label for="harga_sewa_per_jam">Harga Sewa Mobil Per Jam:</label>
    <input type="number" id="harga_sewa_per_jam" name="harga_sewa_per_jam" required><br>

    <input type="submit" value="Simpan">
</form>