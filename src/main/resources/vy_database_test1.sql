-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 15, 2020 at 07:13 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `vy_database_test1`
--

-- --------------------------------------------------------

--
-- Table structure for table `vy_address`
--

CREATE TABLE `vy_address` (
  `address_id` bigint(20) NOT NULL,
  `address` varchar(2000) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `postal_code` int(11) DEFAULT NULL,
  `country` varchar(100) DEFAULT NULL,
  `state` varchar(100) DEFAULT NULL,
  `landmark` varchar(2000) DEFAULT NULL,
  `alternate_address` varchar(2000) DEFAULT NULL,
  `alternate_city` varchar(100) DEFAULT NULL,
  `alternate_postal_code` int(11) DEFAULT NULL,
  `alternate_country` varchar(100) DEFAULT NULL,
  `alternate_state` varchar(100) DEFAULT NULL,
  `alternate_landmark` varchar(2000) DEFAULT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '1',
  `trash` tinyint(1) NOT NULL DEFAULT '0',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `vy_address`
--

INSERT INTO `vy_address` (`address_id`, `address`, `city`, `postal_code`, `country`, `state`, `landmark`, `alternate_address`, `alternate_city`, `alternate_postal_code`, `alternate_country`, `alternate_state`, `alternate_landmark`, `status`, `trash`, `created_at`, `updated_at`) VALUES
(1, 'white filed bangalore', 'Bamgalore', 560012, 'Inida', 'Karnataka', 'big tree', NULL, NULL, 0, NULL, NULL, NULL, 0, 0, '2020-06-04 18:30:00', '2020-06-04 18:30:00'),
(14, 'white filed bangalore', 'Bamgalore', 560012, 'Inida', 'Karnataka', 'big tree', NULL, NULL, 0, NULL, NULL, NULL, 0, 0, '2020-06-04 18:30:00', '2020-06-04 18:30:00'),
(16, 'white filed bangalore', 'Bamgalore', 560012, 'Inida', 'Karnataka', 'big tree', NULL, NULL, 0, NULL, NULL, NULL, 0, 0, '2020-06-04 18:30:00', '2020-06-04 18:30:00'),
(18, 'white filed bangalore', 'Bamgalore', 560012, 'Inida', 'Karnataka', 'big tree', NULL, NULL, 0, NULL, NULL, NULL, 0, 0, '2020-06-04 18:30:00', '2020-06-04 18:30:00'),
(19, 'white filed bangalore', 'Bamgalore', 560012, 'Inida', 'Karnataka', 'big tree', NULL, NULL, 0, NULL, NULL, NULL, 0, 0, '2020-06-04 18:30:00', '2020-06-04 18:30:00'),
(20, 'white filed bangalore', 'Bamgalore', 560012, 'Inida', 'Karnataka', 'big tree', NULL, NULL, 0, NULL, NULL, NULL, 0, 0, '2020-06-03 18:30:00', '2020-06-03 18:30:00'),
(21, 'white filed bangalore', 'Bamgalore', 560012, 'Inida', 'Karnataka', 'big tree', NULL, NULL, 0, NULL, NULL, NULL, 0, 0, '2020-07-08 16:48:40', '2020-06-03 18:30:00'),
(22, 'white filed bangalore', 'Bamgalore', 560012, 'Inida', 'Karnataka', 'big tree', NULL, NULL, 0, NULL, NULL, NULL, 0, 0, '2020-07-08 16:48:40', '2020-06-03 18:30:00'),
(23, 'white filed bangalore', 'Bamgalore', 560012, 'Inida', 'Karnataka', 'big tree', NULL, NULL, 0, NULL, NULL, NULL, 0, 0, '2020-07-08 16:48:40', '2020-06-03 18:30:00'),
(24, 'white filed bangalore', 'Bamgalore', 560012, 'Inida', 'Karnataka', 'big tree', NULL, NULL, 0, NULL, NULL, NULL, 0, 0, '2020-07-08 16:48:40', '2020-06-03 18:30:00'),
(25, 'white filed bangalore', 'Bamgalore', 560012, 'Inida', 'Karnataka', 'big tree', NULL, NULL, 0, NULL, NULL, NULL, 0, 0, '2020-07-08 16:48:40', '2020-06-03 18:30:00'),
(26, 'white filed bangalore', 'Bamgalore', 560012, 'Inida', 'Karnataka', 'big tree', NULL, NULL, 0, NULL, NULL, NULL, 0, 0, '2020-07-08 16:48:40', '2020-06-03 18:30:00'),
(27, 'white filed bangalore', 'Bamgalore', 560012, 'Inida', 'Karnataka', 'big tree', NULL, NULL, 0, NULL, NULL, NULL, 0, 0, '2020-07-08 16:48:40', '2020-06-03 18:30:00'),
(28, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', '', 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', '', 0, 0, '2020-07-08 16:48:40', NULL),
(29, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', '', 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', '', 0, 0, '2020-07-08 16:48:40', NULL),
(30, 'white filed bangalore', 'Bamgalore', 560012, 'Inida', 'Karnataka', 'big tree', NULL, NULL, 0, NULL, NULL, NULL, 0, 0, '2020-07-08 16:48:40', '2020-06-03 18:30:00'),
(31, 'white filed bangalore', 'Bamgalore', 560012, 'Inida', 'Karnataka', 'big tree', NULL, NULL, 0, NULL, NULL, NULL, 0, 0, '2020-07-08 16:48:40', '2020-06-03 18:30:00'),
(32, 'white filed bangalore', 'Bamgalore', 560012, 'Inida', 'Karnataka', 'big tree', NULL, NULL, 0, NULL, NULL, NULL, 0, 0, '2020-07-08 16:48:40', '2020-06-03 18:30:00'),
(33, 'white filed bangalore', 'Bamgalore', 560012, 'Inida', 'Karnataka', 'big tree', NULL, NULL, 0, NULL, NULL, NULL, 0, 0, '2020-07-08 16:48:40', '2020-06-03 18:30:00'),
(34, 'white filed bangalore', 'Bamgalore', 560012, 'Inida', 'Karnataka', 'big tree', NULL, NULL, 0, NULL, NULL, NULL, 0, 0, '2020-07-08 16:48:40', '2020-06-03 18:30:00'),
(35, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', '', 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', '', 0, 0, '2020-07-08 16:48:40', NULL),
(38, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', '', 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', '', 0, 0, '2020-07-08 16:48:40', NULL),
(39, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', '', 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', '', 0, 0, '2020-07-08 16:48:40', NULL),
(40, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', '', 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', '', 0, 0, '2020-07-08 16:48:40', NULL),
(41, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', '', 'Fatima Block, 58, Palace Rd, Abshot Layout ', 'Bangalore', 560052, '', 'Assam', '', 0, 0, '2020-07-08 16:48:40', NULL),
(42, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', 'f', ' ', '', 0, '', '', '', 0, 0, '2020-07-08 16:48:40', NULL),
(43, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', 'ghj', 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Arunachal Pradesh', 'kj', 0, 0, '2020-07-08 16:48:40', NULL),
(44, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', 'ghj', 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Arunachal Pradesh', 'kj', 0, 0, '2020-07-08 16:48:40', NULL),
(45, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', 'ghj', 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Arunachal Pradesh', 'kj', 0, 0, '2020-07-08 16:48:40', NULL),
(46, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', 'ghj', 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Arunachal Pradesh', 'kj', 0, 0, '2020-07-08 16:48:40', NULL),
(47, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', 'ghj', 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Arunachal Pradesh', 'kj', 0, 0, '2020-07-08 16:48:40', NULL),
(48, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', 'ghj', 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Arunachal Pradesh', 'kj', 0, 0, '2020-07-08 16:48:40', NULL),
(49, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', 'ghj', 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Arunachal Pradesh', 'kj', 0, 0, '2020-07-08 17:06:44', NULL),
(50, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', 'ghj', 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Arunachal Pradesh', 'kj', 0, 0, '2020-07-08 17:07:58', NULL),
(51, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', 'ghj', 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Arunachal Pradesh', 'kj', 1, 0, '2020-07-08 17:33:38', NULL),
(52, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', 'ghj', 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Arunachal Pradesh', 'kj', 1, 0, '2020-07-08 17:34:03', NULL),
(53, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', 'ghj', 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Arunachal Pradesh', 'kj', 1, 0, '2020-07-08 17:36:34', NULL),
(54, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', 'ghj', 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Arunachal Pradesh', 'kj', 1, 0, '2020-07-08 17:37:26', NULL),
(55, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', 'ghj', 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Arunachal Pradesh', 'kj', 1, 0, '2020-07-08 17:42:02', NULL),
(56, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', 'ghj', 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Arunachal Pradesh', 'kj', 1, 0, '2020-07-08 17:59:59', NULL),
(57, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', 'ghj', 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Arunachal Pradesh', 'kj', 1, 0, '2020-07-08 18:01:31', NULL),
(58, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', 'ghj', 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Arunachal Pradesh', 'kj', 1, 0, '2020-07-08 18:05:21', NULL),
(59, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', 'ghj', 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Arunachal Pradesh', 'kj', 1, 0, '2020-07-08 18:11:52', NULL),
(60, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', 'ghj', 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Arunachal Pradesh', 'kj', 0, 0, '2020-07-08 18:55:12', '2020-07-08 18:55:12'),
(61, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', 'ghj', 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Arunachal Pradesh', 'kj', 0, 0, '2020-07-08 19:02:45', '2020-07-08 19:02:45'),
(62, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', 'ghj', 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Arunachal Pradesh', 'kj', 0, 0, '2020-07-08 19:03:17', '2020-07-08 19:03:17'),
(63, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', 'ghj', 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Arunachal Pradesh', 'kj', 0, 0, '2020-07-09 07:11:37', '2020-07-09 07:11:37'),
(64, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', 'ghj', 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Arunachal Pradesh', 'kj', 0, 0, '2020-07-09 07:12:14', '2020-07-09 07:12:14'),
(65, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', 'ghj', 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Arunachal Pradesh', 'kj', 0, 0, '2020-07-09 07:13:23', '2020-07-09 07:13:23'),
(66, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', 'ghj', 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Arunachal Pradesh', 'kj', 0, 0, '2020-07-09 07:13:53', '2020-07-09 07:13:53'),
(67, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', 'ghj', 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Arunachal Pradesh', 'kj', 0, 0, '2020-07-09 10:52:50', '2020-07-09 10:52:50'),
(68, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', 'ghj', 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Arunachal Pradesh', 'kj', 0, 0, '2020-07-11 18:21:50', '2020-07-11 18:21:50'),
(69, 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Bihar', 'ghj', 'Manpur Pehani, Purani Mandarsa P.O. - Buniyadganj', 'GAYA', 823003, 'India', 'Arunachal Pradesh', 'kj', 0, 0, '2020-07-11 18:29:17', '2020-07-11 18:29:17'),
(72, ' ', '', 0, '', '', '', ' ', '', 0, '', '', '', 0, 0, '2020-07-15 15:32:59', '2020-07-15 15:32:59');

-- --------------------------------------------------------

--
-- Table structure for table `vy_akshay_patra`
--

CREATE TABLE `vy_akshay_patra` (
  `akshay_patra_id` bigint(20) NOT NULL,
  `akshay_patra_num` varchar(60) NOT NULL,
  `patra_allocation_date` date NOT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '1',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `trash` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vy_akshay_patra`
--

INSERT INTO `vy_akshay_patra` (`akshay_patra_id`, `akshay_patra_num`, `patra_allocation_date`, `status`, `created_at`, `updated_at`, `trash`) VALUES
(1, 'fbjdsf', '2020-06-01', 1, '2020-05-31 18:30:00', NULL, 0),
(2, 'djkf', '2020-05-31', 1, '2020-05-31 18:30:00', NULL, 0);

-- --------------------------------------------------------

--
-- Table structure for table `vy_designation`
--

CREATE TABLE `vy_designation` (
  `designation_id` bigint(20) NOT NULL,
  `designation_name` varchar(100) DEFAULT NULL,
  `status` varchar(1) DEFAULT NULL,
  `trash` tinyint(1) NOT NULL DEFAULT '0',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `vy_designation`
--

INSERT INTO `vy_designation` (`designation_id`, `designation_name`, `status`, `trash`, `created_at`, `updated_at`) VALUES
(1, NULL, '0', 0, '2020-07-15 11:27:54', NULL),
(3, NULL, '0', 0, '2020-07-08 16:49:13', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `vy_email`
--

CREATE TABLE `vy_email` (
  `email_id` bigint(20) NOT NULL,
  `email_address_1` varchar(100) DEFAULT NULL,
  `email_address_2` varchar(100) DEFAULT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '1',
  `trash` tinyint(1) NOT NULL DEFAULT '0',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `vy_email`
--

INSERT INTO `vy_email` (`email_id`, `email_address_1`, `email_address_2`, `status`, `trash`, `created_at`, `updated_at`) VALUES
(1, 'Anur5ag_email_id@gmail.com', 'alternate_anurag_@gmaill.com', 0, 0, '2020-06-05 18:30:00', NULL),
(19, 'Anur5ag_email_id@gmail.com', 'alternate_anurag_@gmaill.com', 0, 0, '2020-06-04 18:30:00', NULL),
(20, 'Anur5ag_email_id@gmail.com', 'alternate_anurag_@gmaill.com', 0, 0, '2020-07-08 16:49:13', NULL),
(21, 'Anur5ag_email_id@gmail.com', 'alternate_anurag_@gmaill.com', 0, 0, '2020-07-08 16:49:13', NULL),
(22, 'Anur5ag_email_id@gmail.com', 'alternate_anurag_@gmaill.com', 0, 0, '2020-07-08 16:49:13', NULL),
(23, 'Anur5ag_email_id@gmail.com', 'alternate_anurag_@gmaill.com', 0, 0, '2020-07-08 16:49:13', NULL),
(24, 'Anur5ag_email_id@gmail.com', 'alternate_anurag_@gmaill.com', 0, 0, '2020-07-08 16:49:13', NULL),
(25, 'Anur5ag_email_id@gmail.com', 'alternate_anurag_@gmaill.com', 0, 0, '2020-07-08 16:49:13', NULL),
(26, 'Anur5ag_email_id@gmail.com', 'alternate_anurag_@gmaill.com', 0, 0, '2020-07-08 16:49:13', NULL),
(27, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-08 16:49:13', NULL),
(28, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-08 16:49:13', NULL),
(29, 'Anur5ag_email_id@gmail.com', 'alternate_anurag_@gmaill.com', 0, 0, '2020-07-08 16:49:13', NULL),
(30, 'Anur5ag_email_id@gmail.com', 'alternate_anurag_@gmaill.com', 0, 0, '2020-07-08 16:49:13', NULL),
(31, 'Anur5ag_email_id@gmail.com', 'alternate_anurag_@gmaill.com', 0, 0, '2020-07-08 16:49:13', NULL),
(32, 'Anur5ag_email_id@gmail.com', 'alternate_anurag_@gmaill.com', 0, 0, '2020-07-08 16:49:13', NULL),
(33, 'Anur5ag_email_id@gmail.com', 'alternate_anurag_@gmaill.com', 0, 0, '2020-07-08 16:49:13', NULL),
(34, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-08 16:49:13', NULL),
(37, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-08 16:49:13', NULL),
(38, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-08 16:49:13', NULL),
(39, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-08 16:49:13', NULL),
(40, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-08 16:49:13', NULL),
(41, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-08 16:49:13', NULL),
(42, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-08 16:49:13', NULL),
(43, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-08 16:49:13', NULL),
(44, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-08 16:49:13', NULL),
(45, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-08 16:49:13', NULL),
(46, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-08 16:49:13', NULL),
(47, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-08 16:49:13', NULL),
(48, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-08 17:06:44', NULL),
(49, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-08 17:07:58', NULL),
(50, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-08 17:33:38', NULL),
(51, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-08 17:34:03', NULL),
(52, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-08 17:36:34', NULL),
(53, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-08 17:37:26', NULL),
(54, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-08 17:42:02', NULL),
(55, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-08 17:59:59', NULL),
(56, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-08 18:01:31', NULL),
(57, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-08 18:05:21', NULL),
(58, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-08 18:11:52', NULL),
(59, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-08 18:55:12', NULL),
(60, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-08 19:02:45', NULL),
(61, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-08 19:03:17', NULL),
(62, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-09 07:11:37', NULL),
(63, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-09 07:12:14', NULL),
(64, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-09 07:13:23', NULL),
(65, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-09 07:13:53', NULL),
(66, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-09 10:52:50', NULL),
(67, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-11 18:21:50', NULL),
(68, 'sunnykumar424@gmail.com', 'sunnykumar424@gmail.com', 0, 0, '2020-07-11 18:29:17', NULL),
(69, '', '', 0, 0, '2020-07-15 15:32:59', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `vy_member`
--

CREATE TABLE `vy_member` (
  `member_id` bigint(20) NOT NULL,
  `first_name` varchar(60) DEFAULT NULL,
  `middle_name` varchar(60) DEFAULT NULL,
  `last_name` varchar(60) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `gender` varchar(1) DEFAULT NULL,
  `mother_name` varchar(120) DEFAULT NULL,
  `father_name` varchar(120) DEFAULT NULL,
  `phone_no` varchar(20) DEFAULT NULL,
  `alternate_phone_no` varchar(20) DEFAULT NULL,
  `address_id` bigint(20) DEFAULT NULL,
  `email_id` bigint(20) DEFAULT NULL,
  `akshay_patra_id` bigint(20) DEFAULT NULL,
  `government_id` varchar(20) DEFAULT NULL,
  `government_id_type` varchar(60) DEFAULT NULL,
  `nationality` varchar(60) DEFAULT NULL,
  `member_photo_path` varchar(500) DEFAULT NULL,
  `govt_id_photo_path` varchar(500) DEFAULT NULL,
  `associated_since` date DEFAULT NULL,
  `profession` varchar(60) DEFAULT NULL,
  `practice_level` int(11) DEFAULT NULL,
  `send_email` tinyint(1) NOT NULL DEFAULT '0',
  `call_flag` tinyint(1) NOT NULL DEFAULT '0',
  `sms` tinyint(1) NOT NULL DEFAULT '0',
  `patrika_subscribed` tinyint(1) NOT NULL DEFAULT '0',
  `has_swarved` tinyint(1) NOT NULL DEFAULT '0',
  `updeshta_member_id` bigint(20) DEFAULT NULL,
  `updeshta_name` varchar(240) DEFAULT NULL,
  `updesh_venue` varchar(120) DEFAULT NULL,
  `photo` longblob,
  `status` tinyint(1) NOT NULL DEFAULT '1',
  `trash` tinyint(1) NOT NULL DEFAULT '0',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `create_source` varchar(60) DEFAULT NULL,
  `update_source` varchar(60) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `vy_member`
--

INSERT INTO `vy_member` (`member_id`, `first_name`, `middle_name`, `last_name`, `dob`, `gender`, `mother_name`, `father_name`, `phone_no`, `alternate_phone_no`, `address_id`, `email_id`, `akshay_patra_id`, `government_id`, `government_id_type`, `nationality`, `member_photo_path`, `govt_id_photo_path`, `associated_since`, `profession`, `practice_level`, `send_email`, `call_flag`, `sms`, `patrika_subscribed`, `has_swarved`, `updeshta_member_id`, `updeshta_name`, `updesh_venue`, `photo`, `status`, `trash`, `created_at`, `updated_at`, `create_source`, `update_source`) VALUES
(6, 'Sunny', NULL, 'Narayan', '1988-05-04', 'M', NULL, NULL, '+919632330839', '9632330839', 1, 1, NULL, 'Anyrag_giv_id1234', 'PAN', 'Indian', 'memberphoto: path\\', 'gove_id photo :\\ path', '1990-05-04', 'IT Manager', 1, 0, 0, 0, 0, 0, NULL, NULL, NULL, NULL, 0, 0, '2020-06-03 18:30:00', '2020-06-03 18:30:00', 'Bangalore', 'Bangalore'),
(7, 'Anurag', NULL, 'Deo', '1988-05-05', 'M', NULL, NULL, '9632330839', '9632330839', 1, 1, NULL, 'Anyrag_giv_id1234', 'PAN', 'Indian', 'memberphoto: path\\', 'gove_id photo :\\ path', '1990-05-05', 'IT Manager', 1, 0, 0, 0, 0, 0, 6, NULL, NULL, NULL, 0, 0, '2020-06-04 18:30:00', '2020-06-04 18:30:00', 'Bangalore', 'Bangalore'),
(8, 'Shashi', NULL, 'Kumar', '1988-05-05', 'M', NULL, NULL, '9632330839', '9632330839', 1, 1, NULL, 'Anyrag_giv_id1234', 'PAN', 'Indian', 'memberphoto: path\\', 'gove_id photo :\\ path', '1990-05-05', 'IT Manager', 1, 0, 0, 0, 0, 0, 6, NULL, NULL, NULL, 0, 0, '2020-06-04 18:30:00', '2020-06-04 18:30:00', 'Bangalore', 'Bangalore'),
(9, 'Abhishek', NULL, 'Singh', '1988-05-05', 'M', NULL, NULL, '9632330839', '9632330839', 1, 1, NULL, 'Anyrag_giv_id1234', 'PAN', 'Indian', 'memberphoto: path\\', 'gove_id photo :\\ path', '1990-05-05', 'IT Manager', 1, 0, 0, 0, 0, 0, 6, NULL, NULL, NULL, 0, 0, '2020-06-04 18:30:00', '2020-06-04 18:30:00', 'Bangalore', 'Bangalore'),
(10, 'Abhishek', NULL, 'Singh', '1988-05-05', 'M', NULL, NULL, '9632330839', '9632330839', 1, 1, NULL, 'Anyrag_giv_id1234', 'PAN', 'Indian', 'memberphoto: path\\', 'gove_id photo :\\ path', '1990-05-05', 'IT Manager', 1, 0, 0, 0, 0, 0, 6, NULL, NULL, NULL, 0, 0, '2020-06-04 18:30:00', '2020-06-04 18:30:00', 'Bangalore', 'Bangalore'),
(11, 'test', NULL, '1', '1988-05-05', 'M', NULL, NULL, '9632330839', '9632330839', 1, 1, NULL, 'Anyrag_giv_id1234', 'PAN', 'Indian', NULL, NULL, NULL, NULL, 0, 0, 0, 0, 0, 0, 6, NULL, NULL, NULL, 0, 0, '2020-06-04 18:30:00', '2020-06-04 18:30:00', 'Bangalore', 'Bangalore'),
(12, 'test', NULL, '2', '1988-05-05', 'M', NULL, NULL, '9632330839', '9632330839', 1, 1, NULL, 'Anyrag_giv_id1234', 'PAN', 'Indian', NULL, NULL, NULL, NULL, 0, 0, 0, 0, 0, 0, NULL, NULL, NULL, NULL, 0, 0, '2020-07-08 16:49:13', NULL, NULL, NULL),
(13, 'Sunny', NULL, 'Narayan', '1988-05-04', 'M', NULL, NULL, '9632330839', '9632330839', 14, 1, NULL, 'Anyrag_giv_id1234', 'PAN', 'Indian', 'memberphoto: path\\', 'gove_id photo :\\ path', '1990-05-04', 'IT Manager', 1, 0, 0, 0, 0, 0, NULL, NULL, NULL, NULL, 0, 0, '2020-06-03 18:30:00', '2020-07-15 11:27:54', 'Bangalore', 'Bangalore'),
(15, 'test', NULL, '3', '1988-05-04', 'M', NULL, NULL, '9632330839', '9632330839', 16, 1, NULL, 'Anyrag_giv_id1234', 'PAN', 'Indian', 'memberphoto: path\\', 'gove_id photo :\\ path', '1990-05-04', 'IT Manager', 1, 0, 0, 0, 0, 0, NULL, NULL, NULL, NULL, 0, 0, '2020-06-03 18:30:00', '2020-06-03 18:30:00', 'Bangalore', 'Bangalore'),
(17, 'test', NULL, '4', '1988-05-04', 'M', NULL, NULL, '9632330839', '9632330839', 18, 1, NULL, 'Anyrag_giv_id1234', 'PAN', 'Indian', 'memberphoto: path\\', 'gove_id photo :\\ path', '1990-05-04', 'IT Manager', 1, 0, 0, 0, 0, 0, NULL, NULL, NULL, NULL, 0, 0, '2020-06-03 18:30:00', '2020-06-03 18:30:00', 'Bangalore', 'Bangalore'),
(18, 'test', NULL, '5', '1988-05-04', 'M', NULL, NULL, '9632330839', '9632330839', 19, 1, NULL, 'Anyrag_giv_id1234', 'PAN', 'Indian', 'memberphoto: path\\', 'gove_id photo :\\ path', '1990-05-04', 'IT Manager', 1, 0, 0, 0, 0, 0, NULL, NULL, NULL, NULL, 0, 0, '2020-06-03 18:30:00', '2020-06-03 18:30:00', 'Bangalore', 'Bangalore'),
(27, 'sunny', '', 'Na', '2020-06-24', 'F', 'sdbf', 'sjgfb', '9879899879', '7879987797', 28, 27, NULL, 'hjdf', 'PAN', 'hjs', 'other', 'other', '6566-01-01', 'ksjdd', 2, 0, 0, 0, 0, 0, 6, NULL, 'jgew', NULL, 0, 0, '2020-07-08 16:49:13', NULL, 'Member Form', NULL),
(28, 'sunny', '', 'Na2', '2020-06-24', 'F', 'sdbf', 'sjgfb', '9879899879', '7879987797', 29, 28, NULL, 'hjdf', 'PAN', 'hjs', 'other', 'other', '6566-01-01', 'ksjdd', 2, 0, 0, 0, 0, 0, 6, NULL, 'jgew', NULL, 0, 0, '2020-07-08 16:49:13', NULL, 'Member Form', NULL),
(52, 'kjdsfs', 'n', '2222', '2020-06-14', 'M', 'jsdfd', 's', '645863487', '746837658', 60, 59, NULL, 'hj', 'Passport', 'indian', 'other', 'other', '2020-06-07', 'm', 3, 0, 0, 0, 0, 0, NULL, NULL, NULL, NULL, 0, 0, '2020-07-08 18:55:12', '2020-07-08 18:55:12', 'Member Form', NULL),
(53, 'kjdsfs', 'n', 'jsfkdf', '2020-06-14', 'M', 'jsdfd', 's', '645863487', '746837658', 56, 55, NULL, 'hj', 'Passport', 'indian', 'other', 'other', '2020-06-07', 'm', 3, 0, 0, 0, 0, 0, NULL, NULL, NULL, NULL, 1, 0, '2020-07-08 17:59:59', NULL, 'Member Form', NULL),
(60, 'fdsf', '', 'fdf', '2020-07-08', 'M', '', '', NULL, NULL, 72, 69, NULL, NULL, NULL, '', NULL, NULL, NULL, '', 4, 0, 0, 0, 0, 1, NULL, '', '', NULL, 0, 0, '2020-07-15 15:32:59', '2020-07-15 15:32:59', 'Member Form', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `vy_member_designation`
--

CREATE TABLE `vy_member_designation` (
  `member_designation_id` bigint(20) NOT NULL,
  `member_id` bigint(20) NOT NULL,
  `designation_id` bigint(20) NOT NULL,
  `honour_date` date DEFAULT NULL,
  `is_global` tinyint(1) DEFAULT '0',
  `dismiss_date` date DEFAULT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '1',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `trash` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vy_member_designation`
--

INSERT INTO `vy_member_designation` (`member_designation_id`, `member_id`, `designation_id`, `honour_date`, `is_global`, `dismiss_date`, `status`, `created_at`, `updated_at`, `trash`) VALUES
(6, 6, 3, NULL, 0, NULL, 1, '2020-07-08 16:49:13', NULL, 0),
(7, 13, 1, NULL, 0, NULL, 1, '2020-07-15 11:27:54', NULL, 0);

-- --------------------------------------------------------

--
-- Table structure for table `vy_permission`
--

CREATE TABLE `vy_permission` (
  `permission_id` bigint(20) NOT NULL,
  `permission_name` varchar(100) DEFAULT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '1',
  `trash` tinyint(1) NOT NULL DEFAULT '0',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `permisison_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `vy_permission`
--

INSERT INTO `vy_permission` (`permission_id`, `permission_name`, `status`, `trash`, `created_at`, `updated_at`, `permisison_id`) VALUES
(1, 'MEMBER_WRITE', 0, 0, '2020-06-05 18:30:00', NULL, 0),
(2, 'MEMBER_READ', 0, 0, '2020-06-05 18:30:00', NULL, 0);

-- --------------------------------------------------------

--
-- Table structure for table `vy_role`
--

CREATE TABLE `vy_role` (
  `role_id` bigint(20) NOT NULL,
  `role_name` varchar(100) DEFAULT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '1',
  `trash` tinyint(1) NOT NULL DEFAULT '0',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `vy_role`
--

INSERT INTO `vy_role` (`role_id`, `role_name`, `status`, `trash`, `created_at`, `updated_at`) VALUES
(1, 'SUPER_ADMIN', 1, 0, '2020-06-05 18:30:00', NULL),
(2, 'ADMIN', 1, 0, '2020-07-08 16:49:13', NULL),
(3, 'STANDARD', 1, 0, '2020-07-08 16:49:13', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `vy_role_permission`
--

CREATE TABLE `vy_role_permission` (
  `role_permission_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL,
  `permission_id` bigint(20) NOT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '1',
  `trash` tinyint(1) NOT NULL DEFAULT '0',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `vy_role_permission`
--

INSERT INTO `vy_role_permission` (`role_permission_id`, `role_id`, `permission_id`, `status`, `trash`, `created_at`, `updated_at`) VALUES
(1, 1, 1, 0, 0, '2020-06-05 18:30:00', NULL),
(2, 1, 2, 0, 0, '2020-06-05 18:30:00', NULL),
(3, 3, 1, 1, 0, '2020-06-05 18:30:00', NULL),
(4, 3, 2, 1, 0, '2020-06-05 18:30:00', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `vy_user`
--

CREATE TABLE `vy_user` (
  `user_id` bigint(20) NOT NULL,
  `member_id` bigint(20) NOT NULL,
  `username` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '1',
  `trash` tinyint(1) NOT NULL DEFAULT '0',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `vy_user`
--

INSERT INTO `vy_user` (`user_id`, `member_id`, `username`, `password`, `status`, `trash`, `created_at`, `updated_at`) VALUES
(1, 6, 'sunnykumar424@gmail.com', '$2a$10$CvWTw6MgUePbsD64kVTGcegIx4ncvZvXSLWN/22ClpOarJbclehRG', 1, 0, '2020-06-05 18:30:00', '2020-07-09 17:27:47'),
(5, 7, '7', 'password', 0, 0, '2020-07-08 16:49:13', NULL),
(6, 8, '8', 'password', 0, 0, '2020-07-08 16:49:13', NULL),
(8, 9, '9', 'password', 0, 0, '2020-07-08 16:49:13', NULL),
(10, 10, '10', 'password', 0, 0, '2020-07-08 16:49:13', NULL),
(11, 11, '11', 'password', 0, 0, '2020-07-14 19:07:49', NULL),
(12, 6, '6', 'password', 0, 0, '2020-07-14 19:09:27', NULL),
(13, 53, '53', 'password', 0, 0, '2020-07-15 04:14:27', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `vy_user_role`
--

CREATE TABLE `vy_user_role` (
  `user_role_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '1',
  `trash` tinyint(1) NOT NULL DEFAULT '0',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `vy_user_role`
--

INSERT INTO `vy_user_role` (`user_role_id`, `role_id`, `user_id`, `status`, `trash`, `created_at`, `updated_at`) VALUES
(1, 1, 1, 1, 0, '2020-06-05 18:30:00', NULL),
(4, 3, 5, 1, 0, '2020-07-08 16:49:14', NULL),
(5, 3, 6, 1, 0, '2020-07-08 16:49:14', NULL),
(6, 3, 8, 1, 0, '2020-07-08 16:49:14', NULL),
(7, 3, 10, 1, 0, '2020-07-08 16:49:14', NULL),
(8, 3, 11, 1, 0, '2020-07-14 19:07:49', NULL),
(9, 3, 12, 1, 0, '2020-07-14 19:09:27', NULL),
(10, 3, 13, 1, 0, '2020-07-15 04:14:27', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `vy_address`
--
ALTER TABLE `vy_address`
  ADD PRIMARY KEY (`address_id`);

--
-- Indexes for table `vy_akshay_patra`
--
ALTER TABLE `vy_akshay_patra`
  ADD PRIMARY KEY (`akshay_patra_id`),
  ADD UNIQUE KEY `akshay_patra_num` (`akshay_patra_num`);

--
-- Indexes for table `vy_designation`
--
ALTER TABLE `vy_designation`
  ADD PRIMARY KEY (`designation_id`),
  ADD UNIQUE KEY `designation_name` (`designation_name`);

--
-- Indexes for table `vy_email`
--
ALTER TABLE `vy_email`
  ADD PRIMARY KEY (`email_id`);

--
-- Indexes for table `vy_member`
--
ALTER TABLE `vy_member`
  ADD PRIMARY KEY (`member_id`),
  ADD KEY `updeshta_member_id` (`updeshta_member_id`),
  ADD KEY `address_id` (`address_id`),
  ADD KEY `akshay_patra_id` (`akshay_patra_id`),
  ADD KEY `email_id` (`email_id`);

--
-- Indexes for table `vy_member_designation`
--
ALTER TABLE `vy_member_designation`
  ADD PRIMARY KEY (`member_designation_id`),
  ADD KEY `member_id` (`member_id`),
  ADD KEY `designation_id` (`designation_id`);

--
-- Indexes for table `vy_permission`
--
ALTER TABLE `vy_permission`
  ADD PRIMARY KEY (`permission_id`),
  ADD UNIQUE KEY `permission_name` (`permission_name`);

--
-- Indexes for table `vy_role`
--
ALTER TABLE `vy_role`
  ADD PRIMARY KEY (`role_id`),
  ADD UNIQUE KEY `role_name` (`role_name`);

--
-- Indexes for table `vy_role_permission`
--
ALTER TABLE `vy_role_permission`
  ADD PRIMARY KEY (`role_permission_id`),
  ADD KEY `role_id` (`role_id`),
  ADD KEY `permission_id` (`permission_id`);

--
-- Indexes for table `vy_user`
--
ALTER TABLE `vy_user`
  ADD PRIMARY KEY (`user_id`),
  ADD UNIQUE KEY `username` (`username`),
  ADD KEY `member_id` (`member_id`);

--
-- Indexes for table `vy_user_role`
--
ALTER TABLE `vy_user_role`
  ADD PRIMARY KEY (`user_role_id`),
  ADD KEY `user_id` (`user_id`),
  ADD KEY `role_id` (`role_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `vy_address`
--
ALTER TABLE `vy_address`
  MODIFY `address_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=73;

--
-- AUTO_INCREMENT for table `vy_akshay_patra`
--
ALTER TABLE `vy_akshay_patra`
  MODIFY `akshay_patra_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `vy_designation`
--
ALTER TABLE `vy_designation`
  MODIFY `designation_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `vy_email`
--
ALTER TABLE `vy_email`
  MODIFY `email_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=70;

--
-- AUTO_INCREMENT for table `vy_member`
--
ALTER TABLE `vy_member`
  MODIFY `member_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=61;

--
-- AUTO_INCREMENT for table `vy_member_designation`
--
ALTER TABLE `vy_member_designation`
  MODIFY `member_designation_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `vy_permission`
--
ALTER TABLE `vy_permission`
  MODIFY `permission_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `vy_role`
--
ALTER TABLE `vy_role`
  MODIFY `role_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `vy_role_permission`
--
ALTER TABLE `vy_role_permission`
  MODIFY `role_permission_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `vy_user`
--
ALTER TABLE `vy_user`
  MODIFY `user_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `vy_user_role`
--
ALTER TABLE `vy_user_role`
  MODIFY `user_role_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `vy_member`
--
ALTER TABLE `vy_member`
  ADD CONSTRAINT `vy_member_ibfk_1` FOREIGN KEY (`address_id`) REFERENCES `vy_address` (`address_id`),
  ADD CONSTRAINT `vy_member_ibfk_2` FOREIGN KEY (`akshay_patra_id`) REFERENCES `vy_akshay_patra` (`akshay_patra_id`),
  ADD CONSTRAINT `vy_member_ibfk_3` FOREIGN KEY (`email_id`) REFERENCES `vy_email` (`email_id`);

--
-- Constraints for table `vy_member_designation`
--
ALTER TABLE `vy_member_designation`
  ADD CONSTRAINT `vy_member_designation_ibfk_1` FOREIGN KEY (`member_id`) REFERENCES `vy_member` (`member_id`),
  ADD CONSTRAINT `vy_member_designation_ibfk_2` FOREIGN KEY (`designation_id`) REFERENCES `vy_designation` (`designation_id`);

--
-- Constraints for table `vy_role_permission`
--
ALTER TABLE `vy_role_permission`
  ADD CONSTRAINT `vy_role_permission_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `vy_role` (`role_id`),
  ADD CONSTRAINT `vy_role_permission_ibfk_2` FOREIGN KEY (`permission_id`) REFERENCES `vy_permission` (`permission_id`);

--
-- Constraints for table `vy_user`
--
ALTER TABLE `vy_user`
  ADD CONSTRAINT `vy_user_ibfk_1` FOREIGN KEY (`member_id`) REFERENCES `vy_member` (`member_id`);

--
-- Constraints for table `vy_user_role`
--
ALTER TABLE `vy_user_role`
  ADD CONSTRAINT `vy_user_role_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `vy_user` (`user_id`),
  ADD CONSTRAINT `vy_user_role_ibfk_2` FOREIGN KEY (`role_id`) REFERENCES `vy_role` (`role_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
