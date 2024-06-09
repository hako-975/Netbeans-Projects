-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 09 Jun 2024 pada 17.28
-- Versi server: 10.4.27-MariaDB
-- Versi PHP: 7.4.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `aplikasidatabasefutsal`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `member`
--

CREATE TABLE `member` (
  `id` varchar(30) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `team` varchar(50) NOT NULL,
  `jk` varchar(30) NOT NULL,
  `no_hp` varchar(30) NOT NULL,
  `tgl_lahir` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `member`
--

INSERT INTO `member` (`id`, `nama`, `team`, `jk`, `no_hp`, `tgl_lahir`) VALUES
('10084567890122000', 'Dewi Kartika', 'Hiu Putih', 'Perempuan', '08456789012', '10-Mei-2000'),
('11081234562001', 'Tifanny Patriane Andari', 'Fanny Team', 'Perempuan', '08123456', '11-November-2001'),
('15086789012341999', 'Fajar Nugroho', 'Naga Ijo', 'Laki-laki', '08678901234', '15-Juli-1999'),
('20089012345672000', 'Intan Sari', 'King Lions', 'Perempuan', '08901234567', '20-Oktober-2000');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
