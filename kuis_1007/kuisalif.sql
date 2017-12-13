-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 13 Des 2017 pada 16.37
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuisalif`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `identitas_1007`
--

CREATE TABLE `identitas_1007` (
  `id` bigint(20) NOT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `kelas` varchar(255) DEFAULT NULL,
  `name` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `identitas_1007`
--

INSERT INTO `identitas_1007` (`id`, `alamat`, `kelas`, `name`) VALUES
(1, 'rumbai', '3 TIA', 'alif satria');

-- --------------------------------------------------------

--
-- Struktur dari tabel `ipk_1007`
--

CREATE TABLE `ipk_1007` (
  `id` bigint(20) NOT NULL,
  `ipk` varchar(255) DEFAULT NULL,
  `jurusan` varchar(255) DEFAULT NULL,
  `name` varchar(100) NOT NULL,
  `prodi` varchar(255) DEFAULT NULL,
  `identitas_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `ipk_1007`
--

INSERT INTO `ipk_1007` (`id`, `ipk`, `jurusan`, `name`, `prodi`, `identitas_id`) VALUES
(1, '3', 'Teknik komputer', 'alifsatria', 'Teknik informatika', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `identitas_1007`
--
ALTER TABLE `identitas_1007`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_93b381bmlug3k84a7p1nbfdrw` (`name`);

--
-- Indexes for table `ipk_1007`
--
ALTER TABLE `ipk_1007`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_btjhhk5hs56o01cg42pf2aivj` (`name`),
  ADD KEY `FKqypbha5ni30i1podh7q7i1yr2` (`identitas_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `identitas_1007`
--
ALTER TABLE `identitas_1007`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `ipk_1007`
--
ALTER TABLE `ipk_1007`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `ipk_1007`
--
ALTER TABLE `ipk_1007`
  ADD CONSTRAINT `FKqypbha5ni30i1podh7q7i1yr2` FOREIGN KEY (`identitas_id`) REFERENCES `identitas_1007` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
