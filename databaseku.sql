/*
SQLyog Community v13.1.9 (64 bit)
MySQL - 10.1.48-MariaDB : Database - a112113379
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`a112113379` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `a112113379`;

/*Table structure for table `barang` */

DROP TABLE IF EXISTS `barang`;

CREATE TABLE `barang` (
  `kode` char(10) NOT NULL,
  `nama_barang` varchar(40) DEFAULT NULL,
  `satuan` char(10) DEFAULT NULL,
  `jumlah` int(5) DEFAULT NULL,
  `harga` int(12) DEFAULT NULL,
  PRIMARY KEY (`kode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `barang` */

insert  into `barang`(`kode`,`nama_barang`,`satuan`,`jumlah`,`harga`) values 
('brg0001','Televisi','unit',23,500000),
('brg0002','Lemari Es','unit',10,200000),
('brg0003','Lampu','unit',6,20000),
('brg0004','lampu','unit',5,78000),
('brg0005','KOMPUTER','PCS',6,232000),
('brg0006','Sepatu Kaca','unit',12,2000000),
('brg0007','Sepatu Pantofwel','unit',12,20000),
('COBA001','TELEVISI LED 50 INCHU','UNIT',20,54000000);

/*Table structure for table `barang01` */

DROP TABLE IF EXISTS `barang01`;

CREATE TABLE `barang01` (
  `id_barang` int(11) NOT NULL,
  `nama_barang` varchar(255) NOT NULL,
  `qty` int(11) NOT NULL,
  `harga_beli` int(11) NOT NULL,
  `harga_jual` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `barang01` */

insert  into `barang01`(`id_barang`,`nama_barang`,`qty`,`harga_beli`,`harga_jual`) values 
(1,'Bola Kaki',12,80000,120000);

/*Table structure for table `biodata` */

DROP TABLE IF EXISTS `biodata`;

CREATE TABLE `biodata` (
  `nik` int(12) DEFAULT NULL,
  `nama` varchar(150) DEFAULT NULL,
  `alamat` varchar(450) DEFAULT NULL,
  `no_telp` int(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `biodata` */

insert  into `biodata`(`nik`,`nama`,`alamat`,`no_telp`) values 
(10108823,'Firdan Ardiansyah','Potlot',2147483647),
(10108824,'Kaka','BTN. Palaton',2147483647),
(10108825,'Ridho','Kuningan',2147483647),
(10108826,'Abdee','Mampang Prapatan',2147483647),
(10108827,'Bimbim','Thamrin',2147483647),
(10108823,'Firdan Ardiansyah','Potlot',2147483647),
(10108824,'Kaka','BTN. Palaton',2147483647),
(10108825,'Ridho','Kuningan',2147483647),
(10108826,'Abdee','Mampang Prapatan',2147483647),
(10108827,'Bimbim','Thamrin',2147483647);

/*Table structure for table `guru` */

DROP TABLE IF EXISTS `guru`;

CREATE TABLE `guru` (
  `nip` char(15) NOT NULL,
  `nama_guru` varchar(45) DEFAULT NULL,
  `status` char(10) DEFAULT NULL,
  PRIMARY KEY (`nip`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `guru` */

insert  into `guru`(`nip`,`nama_guru`,`status`) values 
('gr00010','Tiurmina','baik'),
('gr00011','Yunita olga','baik'),
('gr231111','Oemar','tetep'),
('P00001','MARDIANTO','TETAP'),
('P00002','JOKO SULITYONO','TETAP'),
('P00003','MARIATI','TETAP'),
('P00004','LUKMAN','TETAP'),
('p112233','OlaOle','oklah'),
('p12345','Simbah','keren');

/*Table structure for table `mahasiswa` */

DROP TABLE IF EXISTS `mahasiswa`;

CREATE TABLE `mahasiswa` (
  `nim` char(14) NOT NULL,
  `nama_mhs` varchar(45) DEFAULT NULL,
  `jurusan` char(15) DEFAULT NULL,
  PRIMARY KEY (`nim`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `mahasiswa` */

insert  into `mahasiswa`(`nim`,`nama_mhs`,`jurusan`) values 
('a11.2020.21345','Lusiana','Sistim Informas'),
('a11.2021.01345','Putranto','Teknik Informat'),
('a11.2021.02345','Lukman','Teknik Informat'),
('a11.2021.12345','Maharani','Teknik Informat'),
('a12.2020.21345','Lena','Sistim Informas'),
('b12345','Rinto','Teknik'),
('b12346','Ririn','Teknik informat');

/*Table structure for table `matakul` */

DROP TABLE IF EXISTS `matakul`;

CREATE TABLE `matakul` (
  `kode` char(10) NOT NULL,
  `nama_mtkl` varchar(40) DEFAULT NULL,
  `sks` char(2) DEFAULT NULL,
  PRIMARY KEY (`kode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `matakul` */

insert  into `matakul`(`kode`,`nama_mtkl`,`sks`) values 
('mt0001','Pancasila','2'),
('mt0002','Pemrograman','3'),
('mt0003','Kalkulus','3');

/*Table structure for table `matakuliah` */

DROP TABLE IF EXISTS `matakuliah`;

CREATE TABLE `matakuliah` (
  `kode` char(10) NOT NULL,
  `nama_mtkl` varchar(40) DEFAULT NULL,
  `sks` char(1) DEFAULT NULL,
  PRIMARY KEY (`kode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `matakuliah` */

insert  into `matakuliah`(`kode`,`nama_mtkl`,`sks`) values 
('Mt0001','Pancasila','2'),
('mt0002','Pemrograman','3'),
('mt0003','Database','3'),
('mt0004','PBO','3'),
('mt0005','Sejarah','3'),
('mt0007','IPA','2');

/*Table structure for table `matakuliah2` */

DROP TABLE IF EXISTS `matakuliah2`;

CREATE TABLE `matakuliah2` (
  `kode` char(10) NOT NULL,
  `nama_mtkl` varchar(40) DEFAULT NULL,
  `sks` char(1) DEFAULT NULL,
  PRIMARY KEY (`kode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `matakuliah2` */

insert  into `matakuliah2`(`kode`,`nama_mtkl`,`sks`) values 
('mt0001','Pancasila','1');

/*Table structure for table `obat` */

DROP TABLE IF EXISTS `obat`;

CREATE TABLE `obat` (
  `kode_obat` char(10) DEFAULT NULL,
  `nama_obat` varchar(50) DEFAULT NULL,
  `satuan_obat` char(10) DEFAULT NULL,
  `jenis_obat` char(10) DEFAULT NULL,
  `jumlah` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `obat` */

/*Table structure for table `obat1` */

DROP TABLE IF EXISTS `obat1`;

CREATE TABLE `obat1` (
  `kode` char(10) NOT NULL,
  `nama_obat` varchar(40) DEFAULT NULL,
  `harga` char(12) DEFAULT NULL,
  PRIMARY KEY (`kode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `obat1` */

insert  into `obat1`(`kode`,`nama_obat`,`harga`) values 
('OB00010','Insto','15000'),
('ob00011','OBAT BATUK','670000'),
('ob0002','Salonpas','2000'),
('ob0003','Minyak Urut','12000'),
('ob0004','Panadol','4000'),
('ob0005','Bodrex','4000'),
('ob0006','GPU','4000'),
('ob0009','Obat Batuk','434300');

/*Table structure for table `pegwai` */

DROP TABLE IF EXISTS `pegwai`;

CREATE TABLE `pegwai` (
  `nip` char(10) NOT NULL,
  `nama_peg` varchar(45) DEFAULT NULL,
  `gaji` char(12) DEFAULT NULL,
  PRIMARY KEY (`nip`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `pegwai` */

insert  into `pegwai`(`nip`,`nama_peg`,`gaji`) values 
('P','Sukandar','5604000'),
('P00001','Joko Lukman','4300000'),
('P00002','Purnama','2300000'),
('P00003','Lukman','4300000'),
('P00004','Herman','6300000'),
('p12345','Kurniawan','50000');

/*Table structure for table `pelanggan` */

DROP TABLE IF EXISTS `pelanggan`;

CREATE TABLE `pelanggan` (
  `kode_pel` char(12) NOT NULL,
  `nama_pel` varchar(50) DEFAULT NULL,
  `alamat_pel` varchar(50) DEFAULT NULL,
  `wa_pel` char(15) DEFAULT NULL,
  `kota_pel` char(20) DEFAULT NULL,
  PRIMARY KEY (`kode_pel`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `pelanggan` */

insert  into `pelanggan`(`kode_pel`,`nama_pel`,`alamat_pel`,`wa_pel`,`kota_pel`) values 
('pel0001','CV. BINTANG TERANG','JL. BANYAK KENANGAN','034232434','SEMARANG'),
('pel0002','PT. SIDO SUGEH ANTI MLARAT','JL. BANYAK ANAK-ANAK','054354545','JAKARTA'),
('pel0003','CV. INTAN PERMATA EMAS','JL. SANGAT BESAR SEKALI','05345435454','SEMARANG');

/*Table structure for table `polisi` */

DROP TABLE IF EXISTS `polisi`;

CREATE TABLE `polisi` (
  `nip` char(12) NOT NULL,
  `nama_pol` varchar(45) DEFAULT NULL,
  `pangkat` char(20) DEFAULT NULL,
  PRIMARY KEY (`nip`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `polisi` */

insert  into `polisi`(`nip`,`nama_pol`,`pangkat`) values 
('2000','dwwdfd','ehfuhe'),
('pol0001','Rudi Utomo','Kombes'),
('pol0002','Suryanto','Bripda'),
('pol0003','Hartini','Kompol'),
('pol0004','Yohanes','Bripka'),
('pol0005','Fery Zambo','Komjen'),
('pol0006','Krisneo','akbp'),
('pol0007','Rinto','Bripka'),
('pol0009','Ojak','polri'),
('polisi001','Totok','polri'),
('polisi02','Luarbiasa','polri');

/*Table structure for table `sparepat` */

DROP TABLE IF EXISTS `sparepat`;

CREATE TABLE `sparepat` (
  `kode` char(10) NOT NULL,
  `harga` char(12) DEFAULT NULL,
  PRIMARY KEY (`kode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sparepat` */

/*Table structure for table `sparepat1` */

DROP TABLE IF EXISTS `sparepat1`;

CREATE TABLE `sparepat1` (
  `kode` char(10) NOT NULL,
  `nama_sparepat` varchar(40) DEFAULT NULL,
  `harga` char(12) DEFAULT NULL,
  PRIMARY KEY (`kode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sparepat1` */

insert  into `sparepat1`(`kode`,`nama_sparepat`,`harga`) values 
('mt0001','Lampu Depan','300000'),
('mt0002','Stang Depan','300000'),
('mt0003','Ban Dalam','110000'),
('mt0005','Kaca Spion','50000'),
('mt0006','Kampas Rem','1230000'),
('mt0007',NULL,NULL),
('mt0012','aaaaaaa','430000');

/*Table structure for table `sparepath` */

DROP TABLE IF EXISTS `sparepath`;

CREATE TABLE `sparepath` (
  `kode` char(10) NOT NULL,
  `nama_sparepath` varchar(45) DEFAULT NULL,
  `harga` char(12) DEFAULT NULL,
  PRIMARY KEY (`kode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sparepath` */

/*Table structure for table `stokbarang` */

DROP TABLE IF EXISTS `stokbarang`;

CREATE TABLE `stokbarang` (
  `kd_brg` char(10) NOT NULL,
  `nm_brg` varchar(40) DEFAULT NULL,
  `satuan` char(10) DEFAULT NULL,
  `jumlah` int(3) DEFAULT NULL,
  `harga` int(12) DEFAULT NULL,
  PRIMARY KEY (`kd_brg`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `stokbarang` */

insert  into `stokbarang`(`kd_brg`,`nm_brg`,`satuan`,`jumlah`,`harga`) values 
('Brg0001','Komputer','Unit',10,1200000),
('Brg0002','Lampu Led','Pcs',21,45000),
('Brg0003','Televisi Android','Pcs',2,5000000);

/*Table structure for table `temporary_jual` */

DROP TABLE IF EXISTS `temporary_jual`;

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

/*Data for the table `temporary_jual` */

insert  into `temporary_jual`(`kode_barang`,`nama_barang`,`satuan_barang`,`jumlah_barang`,`harga_barang`,`total_barang`,`kode_pel`,`nomor_faktur`,`tanggal_faktur`,`nama_pel`,`alamat_pel`,`total_faktur`) values 
('brg0001','Televisi','unit',5,500000,2500000,NULL,NULL,NULL,NULL,NULL,NULL),
('brg0002','Lemari Es','unit',7,200000,1400000,NULL,NULL,NULL,NULL,NULL,NULL),
('brg0003','Lampu','unit',7,20000,140000,NULL,NULL,NULL,NULL,NULL,NULL),
('brg0001','Televisi','unit',5,500000,2500000,NULL,NULL,NULL,NULL,NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
