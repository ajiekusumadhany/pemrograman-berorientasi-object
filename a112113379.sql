-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 02, 2023 at 07:37 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `a112113379`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `kode` char(10) NOT NULL,
  `nama_barang` varchar(40) DEFAULT NULL,
  `satuan` char(10) DEFAULT NULL,
  `jumlah` int(5) DEFAULT NULL,
  `harga` int(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`kode`, `nama_barang`, `satuan`, `jumlah`, `harga`) VALUES
('brg0001', 'Televisi', 'unit', 23, 500000),
('brg0002', 'Lemari Es', 'unit', 10, 200000),
('brg0003', 'Lampu', 'unit', 6, 20000),
('brg0004', 'lampu', 'unit', 5, 78000),
('brg0005', 'KOMPUTER', 'pcs', 6, 232000),
('brg0006', 'Sepatu Kaca', 'unit', 12, 2000000),
('brg0007', 'Sepatu Pantofwel', 'unit', 12, 20000),
('brg0008', 'Laptop', 'unit', 2, 30000000);

-- --------------------------------------------------------

--
-- Table structure for table `barang01`
--

CREATE TABLE `barang01` (
  `id_barang` int(11) NOT NULL,
  `nama_barang` varchar(255) NOT NULL,
  `qty` int(11) NOT NULL,
  `harga_beli` int(11) NOT NULL,
  `harga_jual` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `barang01`
--

INSERT INTO `barang01` (`id_barang`, `nama_barang`, `qty`, `harga_beli`, `harga_jual`) VALUES
(1, 'Bola Kaki', 12, 80000, 120000);

-- --------------------------------------------------------

--
-- Table structure for table `biodata`
--

CREATE TABLE `biodata` (
  `nik` int(12) DEFAULT NULL,
  `nama` varchar(150) DEFAULT NULL,
  `alamat` varchar(450) DEFAULT NULL,
  `no_telp` int(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `biodata`
--

INSERT INTO `biodata` (`nik`, `nama`, `alamat`, `no_telp`) VALUES
(10108823, 'Firdan Ardiansyah', 'Potlot', 2147483647),
(10108824, 'Kaka', 'BTN. Palaton', 2147483647),
(10108825, 'Ridho', 'Kuningan', 2147483647),
(10108826, 'Abdee', 'Mampang Prapatan', 2147483647),
(10108827, 'Bimbim', 'Thamrin', 2147483647),
(10108823, 'Firdan Ardiansyah', 'Potlot', 2147483647),
(10108824, 'Kaka', 'BTN. Palaton', 2147483647),
(10108825, 'Ridho', 'Kuningan', 2147483647),
(10108826, 'Abdee', 'Mampang Prapatan', 2147483647),
(10108827, 'Bimbim', 'Thamrin', 2147483647);

-- --------------------------------------------------------

--
-- Table structure for table `guru`
--

CREATE TABLE `guru` (
  `nip` char(15) NOT NULL,
  `nama_guru` varchar(45) DEFAULT NULL,
  `status` char(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `guru`
--

INSERT INTO `guru` (`nip`, `nama_guru`, `status`) VALUES
('gr00010', 'Tiurmina', 'baik'),
('gr00011', 'Yunita olga', 'baik'),
('gr231111', 'Oemar', 'tetep'),
('P00001', 'MARDIANTO', 'TETAP'),
('P00002', 'JOKO SULITYONO', 'TETAP'),
('P00003', 'MARIATI', 'TETAP'),
('P00004', 'LUKMAN', 'TETAP'),
('p112233', 'OlaOle', 'oklah'),
('p12345', 'Simbah', 'keren');

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `nim` char(14) NOT NULL,
  `nama_mhs` varchar(45) DEFAULT NULL,
  `jurusan` char(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`nim`, `nama_mhs`, `jurusan`) VALUES
('a11.2020.21345', 'Lusiana', 'Sistim Informas'),
('a11.2021.01345', 'Putranto', 'Teknik Informat'),
('a11.2021.02345', 'Lukman', 'Teknik Informat'),
('a11.2021.12345', 'Maharani', 'Teknik Informat'),
('a12.2020.21345', 'Lena', 'Sistim Informas'),
('b12345', 'Rinto', 'Teknik'),
('b12346', 'Ririn', 'Teknik informat');

-- --------------------------------------------------------

--
-- Table structure for table `matakul`
--

CREATE TABLE `matakul` (
  `kode` char(10) NOT NULL,
  `nama_mtkl` varchar(40) DEFAULT NULL,
  `sks` char(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `matakul`
--

INSERT INTO `matakul` (`kode`, `nama_mtkl`, `sks`) VALUES
('mt0001', 'Pancasila', '2'),
('mt0002', 'Pemrograman', '3'),
('mt0003', 'Kalkulus', '3');

-- --------------------------------------------------------

--
-- Table structure for table `matakuliah`
--

CREATE TABLE `matakuliah` (
  `kode` char(10) NOT NULL,
  `nama_mtkl` varchar(40) DEFAULT NULL,
  `sks` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `matakuliah`
--

INSERT INTO `matakuliah` (`kode`, `nama_mtkl`, `sks`) VALUES
('Mt0001', 'Pancasila', '2'),
('mt0002', 'Pemrograman', '3'),
('mt0003', 'Database', '3'),
('mt0004', 'PBO', '3'),
('mt0005', 'Sejarah', '3'),
('mt0007', 'IPA', '2');

-- --------------------------------------------------------

--
-- Table structure for table `matakuliah2`
--

CREATE TABLE `matakuliah2` (
  `kode` char(10) NOT NULL,
  `nama_mtkl` varchar(40) DEFAULT NULL,
  `sks` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `matakuliah2`
--

INSERT INTO `matakuliah2` (`kode`, `nama_mtkl`, `sks`) VALUES
('mt0001', 'Pancasila', '1');

-- --------------------------------------------------------

--
-- Table structure for table `obat`
--

CREATE TABLE `obat` (
  `kode_obat` char(10) DEFAULT NULL,
  `nama_obat` varchar(50) DEFAULT NULL,
  `satuan_obat` char(10) DEFAULT NULL,
  `jenis_obat` char(10) DEFAULT NULL,
  `jumlah` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `obat1`
--

CREATE TABLE `obat1` (
  `kode` char(10) NOT NULL,
  `nama_obat` varchar(40) DEFAULT NULL,
  `harga` char(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `obat1`
--

INSERT INTO `obat1` (`kode`, `nama_obat`, `harga`) VALUES
('OB00010', 'Insto', '15000'),
('ob00011', 'OBAT BATUK', '670000'),
('ob0002', 'Salonpas', '2000'),
('ob0003', 'Minyak Urut', '12000'),
('ob0004', 'Panadol', '4000'),
('ob0005', 'Bodrex', '4000'),
('ob0006', 'GPU', '4000'),
('ob0009', 'Obat Batuk', '434300');

-- --------------------------------------------------------

--
-- Table structure for table `pegwai`
--

CREATE TABLE `pegwai` (
  `nip` char(10) NOT NULL,
  `nama_peg` varchar(45) DEFAULT NULL,
  `gaji` char(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pegwai`
--

INSERT INTO `pegwai` (`nip`, `nama_peg`, `gaji`) VALUES
('P', 'Sukandar', '5604000'),
('P00001', 'Joko Lukman', '4300000'),
('P00002', 'Purnama', '2300000'),
('P00003', 'Lukman', '4300000'),
('P00004', 'Herman', '6300000'),
('p12345', 'Kurniawan', '50000');

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `kode_pel` char(12) NOT NULL,
  `nama_pel` varchar(50) DEFAULT NULL,
  `alamat_pel` varchar(50) DEFAULT NULL,
  `kota_pel` char(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`kode_pel`, `nama_pel`, `alamat_pel`, `kota_pel`) VALUES
('pel0001', 'CV. BINTANG TERANG', 'JL. BANYAK KENANGAN', 'SEMARANG'),
('pel0002', 'ajie', 'gebog', 'kudus'),
('pel0003', 'kuhaku', 'Jl. Nakula', 'Semarang');

-- --------------------------------------------------------

--
-- Table structure for table `polisi`
--

CREATE TABLE `polisi` (
  `nip` char(12) NOT NULL,
  `nama_pol` varchar(45) DEFAULT NULL,
  `pangkat` char(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `polisi`
--

INSERT INTO `polisi` (`nip`, `nama_pol`, `pangkat`) VALUES
('2000', 'dwwdfd', 'ehfuhe'),
('pol0001', 'Rudi Utomo', 'Kombes'),
('pol0002', 'Suryanto', 'Bripda'),
('pol0003', 'Hartini', 'Kompol'),
('pol0004', 'Yohanes', 'Bripka'),
('pol0005', 'Fery Zambo', 'Komjen'),
('pol0006', 'Krisneo', 'akbp'),
('pol0007', 'Rinto', 'Bripka'),
('pol0009', 'Ojak', 'polri'),
('polisi001', 'Totok', 'polri'),
('polisi02', 'Luarbiasa', 'polri');

-- --------------------------------------------------------

--
-- Table structure for table `sparepat`
--

CREATE TABLE `sparepat` (
  `kode` char(10) NOT NULL,
  `harga` char(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `sparepat1`
--

CREATE TABLE `sparepat1` (
  `kode` char(10) NOT NULL,
  `nama_sparepat` varchar(40) DEFAULT NULL,
  `harga` char(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sparepat1`
--

INSERT INTO `sparepat1` (`kode`, `nama_sparepat`, `harga`) VALUES
('mt0001', 'Lampu Depan', '300000'),
('mt0002', 'Stang Depan', '300000'),
('mt0003', 'Ban Dalam', '110000'),
('mt0005', 'Kaca Spion', '50000'),
('mt0006', 'Kampas Rem', '1230000'),
('mt0007', NULL, NULL),
('mt0012', 'aaaaaaa', '430000');

-- --------------------------------------------------------

--
-- Table structure for table `sparepath`
--

CREATE TABLE `sparepath` (
  `kode` char(10) NOT NULL,
  `nama_sparepath` varchar(45) DEFAULT NULL,
  `harga` char(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `stokbarang`
--

CREATE TABLE `stokbarang` (
  `kd_brg` char(10) NOT NULL,
  `nm_brg` varchar(40) DEFAULT NULL,
  `satuan` char(10) DEFAULT NULL,
  `jumlah` int(3) DEFAULT NULL,
  `harga` int(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `stokbarang`
--

INSERT INTO `stokbarang` (`kd_brg`, `nm_brg`, `satuan`, `jumlah`, `harga`) VALUES
('Brg0001', 'Komputer', 'Unit', 10, 1200000),
('Brg0002', 'Lampu Led', 'Pcs', 21, 45000),
('Brg0003', 'Televisi Android', 'Pcs', 2, 5000000);

-- --------------------------------------------------------

--
-- Table structure for table `temporary`
--

CREATE TABLE `temporary` (
  `kode` char(15) CHARACTER SET latin1 DEFAULT NULL,
  `nama_barang` varchar(40) CHARACTER SET latin1 DEFAULT NULL,
  `satuan` char(7) CHARACTER SET latin1 DEFAULT NULL,
  `jumlah` int(5) DEFAULT NULL,
  `harga` int(12) DEFAULT NULL,
  `tot_jual` int(12) DEFAULT NULL,
  `kd_kus` varchar(12) CHARACTER SET latin1 DEFAULT NULL,
  `no_fak` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `tgl_fak` date DEFAULT NULL,
  `dis_fak` int(12) DEFAULT NULL,
  `tot_fak` int(12) DEFAULT NULL,
  `nm_kus` varchar(35) DEFAULT NULL,
  `alm_kus` varchar(35) DEFAULT NULL,
  `kota_kus` varchar(20) DEFAULT NULL,
  `tot_dis_fak` int(13) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `temporary`
--

INSERT INTO `temporary` (`kode`, `nama_barang`, `satuan`, `jumlah`, `harga`, `tot_jual`, `kd_kus`, `no_fak`, `tgl_fak`, `dis_fak`, `tot_fak`, `nm_kus`, `alm_kus`, `kota_kus`, `tot_dis_fak`) VALUES
('brg0002', 'Lemari Es', 'unit', 7, 200000, 1400000, NULL, NULL, NULL, NULL, NULL, NULL, '', '', 0),
('brg0008', 'Laptop', 'unit', 2, 30000000, 60000000, 'pel0003', 'fak0003', '2023-07-02', 0, 0, 'kuhaku', 'kuhaku', 'Semarang', 0),
('brg0008', 'Laptop', 'unit', 2, 30000000, 60000000, 'pel0002', 'fak0004', '2023-07-02', 0, 0, 'ajie', 'ajie', 'kudus', 61780000),
('brg0001', 'Televisi', 'unit', 23, 500000, 11500000, 'pel0001', 'fak0004', '2023-07-02', 0, 0, 'CV. BINTANG TERANG', 'CV. BINTANG TERANG', 'SEMARANG', 0),
('brg0001', 'Televisi', 'unit', 5, 500000, 2500000, 'pel0001', 'fak0004', '2023-07-02', 0, 0, 'CV. BINTANG TERANG', 'CV. BINTANG TERANG', 'SEMARANG', 132900000),
('brg0001', 'Televisi', 'unit', 7, 500000, 3500000, 'pel0001', 'fak0004', '2023-07-02', 0, 0, 'CV. BINTANG TERANG', 'CV. BINTANG TERANG', 'SEMARANG', 135400000),
('brg0001', 'Televisi', 'unit', 23, 500000, 11500000, 'pel0003', 'fak0005', '2023-07-02', 0, 0, 'kuhaku', 'kuhaku', 'Semarang', 0);

-- --------------------------------------------------------

--
-- Table structure for table `temporary_jual`
--

CREATE TABLE `temporary_jual` (
  `kode_barang` char(10) DEFAULT NULL,
  `nama_barang` varchar(40) DEFAULT NULL,
  `satuan_barang` char(10) DEFAULT NULL,
  `jumlah_barang` int(10) DEFAULT NULL,
  `harga_barang` double DEFAULT NULL,
  `total_barang` double DEFAULT NULL,
  `kode_pel` char(12) DEFAULT NULL,
  `nomor_faktur` char(15) DEFAULT NULL,
  `tanggal_faktur` date DEFAULT NULL,
  `nama_pel` varchar(50) DEFAULT NULL,
  `alamat_pel` varchar(50) DEFAULT NULL,
  `total_faktur` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `temporary_jual`
--

INSERT INTO `temporary_jual` (`kode_barang`, `nama_barang`, `satuan_barang`, `jumlah_barang`, `harga_barang`, `total_barang`, `kode_pel`, `nomor_faktur`, `tanggal_faktur`, `nama_pel`, `alamat_pel`, `total_faktur`) VALUES
('brg0001', 'Televisi', 'unit', 5, 500000, 2500000, NULL, NULL, NULL, NULL, NULL, NULL),
('brg0002', 'Lemari Es', 'unit', 7, 200000, 1400000, NULL, NULL, NULL, NULL, NULL, NULL),
('brg0003', 'Lampu', 'unit', 7, 20000, 140000, NULL, NULL, NULL, NULL, NULL, NULL),
('brg0001', 'Televisi', 'unit', 5, 500000, 2500000, NULL, NULL, NULL, NULL, NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`kode`);

--
-- Indexes for table `guru`
--
ALTER TABLE `guru`
  ADD PRIMARY KEY (`nip`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `matakul`
--
ALTER TABLE `matakul`
  ADD PRIMARY KEY (`kode`);

--
-- Indexes for table `matakuliah`
--
ALTER TABLE `matakuliah`
  ADD PRIMARY KEY (`kode`);

--
-- Indexes for table `matakuliah2`
--
ALTER TABLE `matakuliah2`
  ADD PRIMARY KEY (`kode`);

--
-- Indexes for table `obat1`
--
ALTER TABLE `obat1`
  ADD PRIMARY KEY (`kode`);

--
-- Indexes for table `pegwai`
--
ALTER TABLE `pegwai`
  ADD PRIMARY KEY (`nip`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`kode_pel`);

--
-- Indexes for table `polisi`
--
ALTER TABLE `polisi`
  ADD PRIMARY KEY (`nip`);

--
-- Indexes for table `sparepat`
--
ALTER TABLE `sparepat`
  ADD PRIMARY KEY (`kode`);

--
-- Indexes for table `sparepat1`
--
ALTER TABLE `sparepat1`
  ADD PRIMARY KEY (`kode`);

--
-- Indexes for table `sparepath`
--
ALTER TABLE `sparepath`
  ADD PRIMARY KEY (`kode`);

--
-- Indexes for table `stokbarang`
--
ALTER TABLE `stokbarang`
  ADD PRIMARY KEY (`kd_brg`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
