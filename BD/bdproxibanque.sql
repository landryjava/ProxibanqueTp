-- phpMyAdmin SQL Dump
-- version 3.3.9.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 06, 2019 at 10:35 AM
-- Server version: 5.5.10
-- PHP Version: 5.3.6

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `bdproxibanque`
--

-- --------------------------------------------------------

--
-- Table structure for table `administrateur`
--

CREATE TABLE IF NOT EXISTS `administrateur` (
  `idadm` int(11) NOT NULL AUTO_INCREMENT,
  `nomadm` varchar(25) NOT NULL,
  `preadm` varchar(25) NOT NULL,
  `emailadm` varchar(30) NOT NULL,
  `teladm` int(11) NOT NULL,
  PRIMARY KEY (`idadm`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `administrateur`
--


-- --------------------------------------------------------

--
-- Table structure for table `agence`
--

CREATE TABLE IF NOT EXISTS `agence` (
  `idage` int(11) NOT NULL AUTO_INCREMENT,
  `datecreaage` date NOT NULL,
  `libelle` varchar(50) NOT NULL,
  `idcon` int(11) NOT NULL,
  PRIMARY KEY (`idage`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `agence`
--


-- --------------------------------------------------------

--
-- Table structure for table `cartebancaire`
--

CREATE TABLE IF NOT EXISTS `cartebancaire` (
  `idcar` int(11) NOT NULL AUTO_INCREMENT,
  `libcar` varchar(25) NOT NULL,
  `idcli` int(11) NOT NULL,
  PRIMARY KEY (`idcar`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `cartebancaire`
--


-- --------------------------------------------------------

--
-- Table structure for table `client`
--

CREATE TABLE IF NOT EXISTS `client` (
  `idcli` int(11) NOT NULL AUTO_INCREMENT,
  `nomcli` varchar(25) NOT NULL,
  `precli` varchar(25) NOT NULL,
  `emailcli` varchar(30) NOT NULL,
  `telcli` int(11) NOT NULL,
  `adrcli` varchar(20) NOT NULL,
  `codposcli` varchar(20) NOT NULL,
  `proccli` varchar(20) NOT NULL,
  `vilcli` varchar(20) NOT NULL,
  `idcon` int(11) NOT NULL,
  PRIMARY KEY (`idcli`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `client`
--


-- --------------------------------------------------------

--
-- Table structure for table `comptebancaire`
--

CREATE TABLE IF NOT EXISTS `comptebancaire` (
  `idcb` int(11) NOT NULL AUTO_INCREMENT,
  `numcb` int(11) NOT NULL,
  `datouvcb` date NOT NULL,
  `solcb` float NOT NULL,
  `tauremcb` float NOT NULL,
  `autdeccb` double NOT NULL,
  `idcar` int(11) NOT NULL,
  `idcli` int(11) NOT NULL,
  PRIMARY KEY (`idcb`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `comptebancaire`
--


-- --------------------------------------------------------

--
-- Table structure for table `conseiller`
--

CREATE TABLE IF NOT EXISTS `conseiller` (
  `idcon` int(11) NOT NULL AUTO_INCREMENT,
  `nomcon` varchar(25) NOT NULL,
  `precon` varchar(25) NOT NULL,
  `emailcon` varchar(30) NOT NULL,
  `telcon` int(11) NOT NULL,
  PRIMARY KEY (`idcon`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `conseiller`
--


-- --------------------------------------------------------

--
-- Table structure for table `useraccount`
--

CREATE TABLE IF NOT EXISTS `useraccount` (
  `iduse` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(15) NOT NULL,
  `mdp` varchar(20) NOT NULL,
  `idadm` int(11) NOT NULL,
  `idcon` int(11) NOT NULL,
  PRIMARY KEY (`iduse`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `useraccount`
--

