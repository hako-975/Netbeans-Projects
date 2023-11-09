-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 12 Okt 2023 pada 09.05
-- Versi server: 10.4.28-MariaDB
-- Versi PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `churul_05tplp005`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang`
--

CREATE TABLE `barang` (
  `kodebar` varchar(10) NOT NULL,
  `namabar` varchar(30) NOT NULL,
  `hargabeli` int(11) NOT NULL,
  `hargajual` int(11) NOT NULL,
  `stok` int(11) NOT NULL,
  `saham` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `barang`
--

INSERT INTO `barang` (`kodebar`, `namabar`, `hargabeli`, `hargajual`, `stok`, `saham`) VALUES
('1', 'kulkas', 2000000, 2500000, 2, 4000000),
('2', 'komputer', 1000000, 2500000, 2, 2000000),
('3', 'sofa', 3000000, 3500000, 1, 3000000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `login`
--

CREATE TABLE `login` (
  `id_login` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `login`
--

INSERT INTO `login` (`id_login`, `username`, `password`) VALUES
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pembelian`
--

CREATE TABLE `pembelian` (
  `kodepem` varchar(10) NOT NULL,
  `kodebar` varchar(10) NOT NULL,
  `jumlahbeli` int(11) NOT NULL,
  `totalhargabeli` int(11) NOT NULL,
  `tanggalbeli` date NOT NULL,
  `kodesup` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `pembelian`
--

INSERT INTO `pembelian` (`kodepem`, `kodebar`, `jumlahbeli`, `totalhargabeli`, `tanggalbeli`, `kodesup`) VALUES
('1', '3', 1, 3000000, '2023-10-12', '1');

-- --------------------------------------------------------

--
-- Struktur dari tabel `penjualan`
--

CREATE TABLE `penjualan` (
  `kodepenjualan` varchar(10) NOT NULL,
  `kodebar` varchar(10) NOT NULL,
  `jumlahjual` int(11) NOT NULL,
  `tanggaljual` date NOT NULL,
  `diskon` int(11) NOT NULL,
  `totalhargajual` int(11) NOT NULL,
  `profit` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `penjualan`
--

INSERT INTO `penjualan` (`kodepenjualan`, `kodebar`, `jumlahjual`, `tanggaljual`, `diskon`, `totalhargajual`, `profit`) VALUES
('1', '3', 2, '2023-10-11', 10, 6300000, 300000),
('2', '1', 3, '2023-10-11', 5, 7125000, 1125000),
('3', '2', 4, '2023-10-11', 25, 7500000, 3500000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `supplier`
--

CREATE TABLE `supplier` (
  `kodesup` varchar(10) NOT NULL,
  `namasup` varchar(30) NOT NULL,
  `alamatsup` varchar(50) NOT NULL,
  `notelpsup` varchar(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `supplier`
--

INSERT INTO `supplier` (`kodesup`, `namasup`, `alamatsup`, `notelpsup`) VALUES
('1', 'churul', 'bogor', '1239344'),
('2', 'ain', 'jakarta', '138394892');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`kodebar`);

--
-- Indeks untuk tabel `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id_login`);

--
-- Indeks untuk tabel `pembelian`
--
ALTER TABLE `pembelian`
  ADD PRIMARY KEY (`kodepem`),
  ADD KEY `kodebar` (`kodebar`),
  ADD KEY `kodesup` (`kodesup`);

--
-- Indeks untuk tabel `penjualan`
--
ALTER TABLE `penjualan`
  ADD PRIMARY KEY (`kodepenjualan`);

--
-- Indeks untuk tabel `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`kodesup`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `login`
--
ALTER TABLE `login`
  MODIFY `id_login` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
