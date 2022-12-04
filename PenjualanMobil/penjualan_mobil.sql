-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 04 Des 2022 pada 12.05
-- Versi server: 10.4.24-MariaDB
-- Versi PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `penjualan_mobil`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `kodeAdmin` int(11) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(255) NOT NULL,
  `namaAdmin` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`kodeAdmin`, `username`, `password`, `namaAdmin`) VALUES
(1, 'alvin123', '202cb962ac59075b964b07152d234b70', 'Alvin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `mobil`
--

CREATE TABLE `mobil` (
  `kodeMobil` int(11) NOT NULL,
  `merkMobil` varchar(100) NOT NULL,
  `tahunMobil` int(11) NOT NULL,
  `hargaMobil` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `mobil`
--

INSERT INTO `mobil` (`kodeMobil`, `merkMobil`, `tahunMobil`, `hargaMobil`) VALUES
(1, 'Advanza', 2022, 200000000),
(2, 'Pajero', 2014, 140000000),
(3, 'Agya', 2012, 50000000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pembeli`
--

CREATE TABLE `pembeli` (
  `nikPembeli` varchar(20) NOT NULL,
  `namaPembeli` varchar(30) NOT NULL,
  `noTeleponPembeli` varchar(20) NOT NULL,
  `alamatPembeli` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pembeli`
--

INSERT INTO `pembeli` (`nikPembeli`, `namaPembeli`, `noTeleponPembeli`, `alamatPembeli`) VALUES
('3674072901020001', 'Andre Farhan Saputra', '087733932416', 'Jl. Pocis'),
('3674072901021001', 'Andri Firman Saputra', '087808675313', 'Jl. AMD Babakan Pocis No. 88');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `kodeTransaksi` int(11) NOT NULL,
  `tglTransaksi` datetime NOT NULL,
  `nikPembeli` varchar(20) NOT NULL,
  `kodeMobil` int(11) NOT NULL,
  `kodeAdmin` int(11) NOT NULL,
  `totalHarga` int(11) NOT NULL,
  `bayar` int(11) NOT NULL,
  `kembalian` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`kodeTransaksi`, `tglTransaksi`, `nikPembeli`, `kodeMobil`, `kodeAdmin`, `totalHarga`, `bayar`, `kembalian`) VALUES
(1, '2022-12-04 16:24:47', '3674072901021001', 2, 1, 140000000, 150000000, 10000000),
(2, '2022-12-04 18:04:06', '3674072901020001', 3, 1, 50000000, 50000000, 0);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`kodeAdmin`);

--
-- Indeks untuk tabel `mobil`
--
ALTER TABLE `mobil`
  ADD PRIMARY KEY (`kodeMobil`);

--
-- Indeks untuk tabel `pembeli`
--
ALTER TABLE `pembeli`
  ADD PRIMARY KEY (`nikPembeli`);

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`kodeTransaksi`),
  ADD KEY `nikPembeli` (`nikPembeli`),
  ADD KEY `kodeMobil` (`kodeMobil`),
  ADD KEY `kodeAdmin` (`kodeAdmin`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `admin`
--
ALTER TABLE `admin`
  MODIFY `kodeAdmin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT untuk tabel `mobil`
--
ALTER TABLE `mobil`
  MODIFY `kodeMobil` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `kodeTransaksi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
