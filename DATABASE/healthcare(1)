-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.22-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema hasbe
--

CREATE DATABASE IF NOT EXISTS hasbe;
USE hasbe;

--
-- Definition of table `upload`
--

DROP TABLE IF EXISTS `upload`;
CREATE TABLE `upload` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `userid` varchar(45) default NULL,
  `data_` text,
  `key_` text,
  `date_` date default NULL,
  `filename` varchar(45) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `upload`
--

/*!40000 ALTER TABLE `upload` DISABLE KEYS */;
INSERT INTO `upload` (`id`,`userid`,`data_`,`key_`,`date_`,`filename`) VALUES 
 (1,'jpinfotech','ft}r|td{`xv~dtsy<:<;','010000110011101001011100010001000110111101100011011101010110110101100101011011100111010001110011001000000110000101101110011001000010000001010011011001010111010001110100011010010110111001100111011100110101110001001010010100000101110001000100011001010111001101101011011101000110111101110000010111000100101001010000001011100111010001111000011101000011010000110011','2012-10-08','C:Documents and SettingsJPDesktopJP.txt'),
 (2,'j','CT_B_CTPEP<:=:','01110011011001010110111001110011011011110111001000110001001011100111010001111000011101000011000100110001','2012-11-20','sensor1.txt'),
 (3,'phr','zaX^V_DUSY=;<;','01001010010100000010111001110100011110000111010000110110','2012-11-23','JP.txt');
/*!40000 ALTER TABLE `upload` ENABLE KEYS */;


--
-- Definition of table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` varchar(45) NOT NULL default '0',
  `password` varchar(45) default NULL,
  `sex` varchar(45) default NULL,
  `age` varchar(45) default NULL,
  `emailid` varchar(45) default NULL,
  `date_` date default NULL,
  `phone` varchar(45) default NULL,
  `role` varchar(45) default NULL,
  PRIMARY KEY  (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`userid`,`password`,`sex`,`age`,`emailid`,`date_`,`phone`,`role`) VALUES 
 ('actuary','actuary','pondy','25','jp16586@gmail.com','2012-11-23','989989898','actuary'),
 ('group1','group1','lane f, vvp nagar, pondicherry','26','group1@gmail.com','2012-10-08','9952649690','domain'),
 ('j','j','pondy','25','jp16586@gmail.com','2012-11-20','9952649690','PHR'),
 ('jp','jp','66, Golden Street, Pondicherry','26','jp16586@gmail.com','2012-10-08','9952649690','consumer'),
 ('jpinfotech','jpinfotech','45, Kamaraj Salai, Pondicherry','26','jpinfotechprojects@gmail.com','2012-10-08','9952649690','downer'),
 ('phr','phr','kamaraj','22','jp16586@gmail.com','2012-11-23','989989898','PHR');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
