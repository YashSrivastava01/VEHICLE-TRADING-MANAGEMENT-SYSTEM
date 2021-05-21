-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 25, 2020 at 12:36 PM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbms_project`
--

-- --------------------------------------------------------

--
-- Table structure for table `car`
--

CREATE TABLE `car` (
  `company` varchar(20) NOT NULL,
  `model` varchar(20) NOT NULL,
  `version` varchar(10) NOT NULL,
  `fuel_type` varchar(10) NOT NULL,
  `category` varchar(20) NOT NULL,
  `model_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `car`
--

INSERT INTO `car` (`company`, `model`, `version`, `fuel_type`, `category`, `model_id`) VALUES
('Hyundai', 'Verna', '1.4 SX', 'Diesel', 'Sedan', 1010),
('Toyota', 'Yaris', 'J', 'Petrol', 'Sedan', 1011),
('Porche', '911', 'GT-R', 'Electric', 'Super Luxury', 1012),
('Skoda', 'Rapid', 'Onyx1.6', 'Diesel', 'Sedan', 1013),
('Volvo', 'XC40', 'D4D', 'Diesel', 'Luxury', 1014),
('Rolls Royce', 'Phantom', 'S2', 'Petrol', 'Super Luxury', 1015),
('MG', 'Hector', 'SmartAT', 'Diesel', 'SUV', 1016),
('Audi', 'A3', '35TDI', 'Petrol', 'Sedan', 1017),
('Bugatti', 'Chiron', 'Sport', 'Petrol', 'Super Luxury', 1018),
('Lamborghini', 'Aventador', 'SVI', 'Diesel', 'Super Luxury', 1019),
('Renault', 'Kwid', 'RXE1.0', 'Petrol', 'Hatchback', 1020),
('Honda', 'City', 'i-vtec', 'Petrol', 'Sedan', 1021),
('Jaguar', 'XF', '2.0 pure', 'Diesel', 'Luxury', 1022),
('Volkswagen', 'Polo', 'TL-AMT', 'Petrol', 'Hatchback', 1023),
('Land Rover', 'Velar', 'M2E', 'Petrol', 'Luxury', 1024),
('Hundai', 'i 20', '1.6 VD', 'Diesel', 'Hatchback', 1025),
('Tata', 'Harrier', 'XE 2.0', 'Petrol', 'SUV', 1026),
('Mahindra', 'Scorpio', 'S5', 'Petrol', 'SUV', 1027),
('Mahindra', 'XUV 500', 'TDI', 'Petrol', 'SUV', 1028),
('Tata', 'Tiago', 'ZE 2.0', 'Petrol', 'Hatchback', 1029),
('Rolls Royce', 'Ghost', 'M2E', 'Petrol', 'Luxury', 1030),
('Maruti Suzuki', 'Baleno', 'Sigma AMT', 'Petrol', 'Hatchback', 1031),
('Maruti Suzuki', 'Ciaz', 'Delta AMT', 'Diesel', 'Sedan', 1032),
('Tata', 'Nano', 'STD', 'Diesel', 'Hatchback', 1033),
('Maruti Suzuki', 'Alto', 'VXI', 'Petrol', 'Hatchback', 1034),
('Hyundai', 'Verna', '1.6 DX', 'Petrol', 'Sedan', 1035),
('Hyundai', 'Elentra', 'i-vtec', 'Petrol', 'Sedan', 1036),
('Skoda', 'Rapid', 'Mynx 2.0', 'Petrol', 'Sedan', 1037),
('Audi', 'R8', 'E-Tron', 'Petrol', 'Coupe', 1038),
('Lamborghini', 'Aventador', 'Sport', 'Diesel', 'Super Luxury', 1039),
('lambo', 'aventa', 'sport', 'Petrol', 'Super Luxury', 1040),
('ford', 'fiest', '7.8', 'Petrol', 'Sedan', 1041);

-- --------------------------------------------------------

--
-- Table structure for table `car_info2`
--

CREATE TABLE `car_info2` (
  `owner_id` int(11) NOT NULL,
  `model_id` int(11) NOT NULL,
  `Color` varchar(20) NOT NULL,
  `purchase_date` date NOT NULL,
  `KM_driven` int(11) NOT NULL,
  `transmission` varchar(10) NOT NULL,
  `Amount` bigint(20) NOT NULL,
  `car_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `car_info2`
--

INSERT INTO `car_info2` (`owner_id`, `model_id`, `Color`, `purchase_date`, `KM_driven`, `transmission`, `Amount`, `car_id`) VALUES
(10012, 1010, 'Black', '2018-10-10', 32000, 'Manual', 540000, 12),
(10012, 1011, 'Silver', '2017-06-02', 89000, 'Auto', 450000, 13),
(10012, 1012, 'Orange', '2019-04-30', 52000, 'Auto', 9000000, 14),
(10013, 1013, 'Black', '2019-02-07', 1000, 'Auto', 650000, 15),
(10013, 1015, 'Black', '2019-04-01', 7820, 'Auto', 10800000, 17),
(10014, 1016, 'Red', '2019-10-02', 5622, 'Auto', 750000, 18),
(10014, 1017, 'Green', '2016-06-03', 458880, 'Auto', 2000000, 19),
(10014, 1018, 'Black', '2018-07-17', 7500, 'Auto', 25000000, 20),
(10015, 1020, 'Red', '2017-06-14', 56227, 'Manual', 350000, 22),
(10022, 1021, 'Silver', '2018-07-17', 10529, 'Manual', 850000, 23),
(10022, 1022, 'Blue', '2017-12-31', 8700, 'Auto', 5220000, 24),
(10017, 1023, 'Red', '2018-08-25', 6520, 'Auto', 1050000, 25),
(10017, 1024, 'Black', '2017-02-07', 8500, 'Manual', 4500000, 26),
(10018, 1025, 'White', '2019-10-23', 1400, 'Manual', 1200000, 27),
(10018, 1026, 'Red', '2019-08-13', 4500, 'Auto', 1050000, 28),
(10019, 1027, 'White', '2019-08-16', 5248, 'Manual', 950000, 29),
(10019, 1028, 'Orange', '2015-09-05', 10000, 'Manual', 850000, 30),
(10021, 1029, 'Red', '2018-10-10', 11000, 'Manual', 450000, 31),
(10020, 1031, 'Silver', '2017-10-24', 200000, 'Auto', 350000, 33),
(10020, 1032, 'White', '2019-03-23', 25001, 'Auto', 950000, 34),
(10026, 1034, 'Orange', '2006-07-20', 150000, 'Manual', 600000, 36),
(10027, 1035, 'Blue', '2018-01-09', 12546, 'Manual', 500000, 37),
(10027, 1036, 'Brown', '2017-11-10', 80000, 'Auto', 650000, 38);

--
-- Triggers `car_info2`
--
DELIMITER $$
CREATE TRIGGER `car_info_h` BEFORE DELETE ON `car_info2` FOR EACH ROW insert into car_info2_history values(old.owner_id,old.model_id,old.color,old.purchase_date,old.KM_driven,old.transmission,old.amount,old.car_id)
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `car_info2_history`
--

CREATE TABLE `car_info2_history` (
  `owner_id` int(11) NOT NULL,
  `model_id` int(11) NOT NULL,
  `Color` varchar(20) NOT NULL,
  `purchase_date` date NOT NULL,
  `KM_driven` int(11) NOT NULL,
  `transmission` varchar(10) NOT NULL,
  `Amount` bigint(20) NOT NULL,
  `car_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `car_info2_history`
--

INSERT INTO `car_info2_history` (`owner_id`, `model_id`, `Color`, `purchase_date`, `KM_driven`, `transmission`, `Amount`, `car_id`) VALUES
(10013, 1014, 'Black', '2019-02-19', 5000, 'Auto', 4000000, 16),
(10021, 1030, 'White', '2016-07-13', 20000, 'Auto', 48000000, 32),
(10026, 1033, 'White', '2014-06-10', 90000, 'Manual', 65000, 35),
(10028, 1037, 'Brown', '2018-04-01', 63000, 'Auto', 650000, 39),
(10028, 1038, 'Pink', '2016-08-10', 35524, 'Auto', 9000000, 40),
(10015, 1039, 'Blue', '2018-10-05', 7850, 'Auto', 45000000, 41),
(10015, 1040, 'yellow', '2019-10-10', 2500, 'Auto', 14550000, 42),
(10012, 1041, 'maroon', '2018-10-10', 1200, 'Manual', 200000, 43);

-- --------------------------------------------------------

--
-- Table structure for table `personal_data`
--

CREATE TABLE `personal_data` (
  `first_name` varchar(20) NOT NULL,
  `last_name` varchar(20) NOT NULL,
  `mobile_no` bigint(11) NOT NULL,
  `city` varchar(20) NOT NULL,
  `person_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `personal_data`
--

INSERT INTO `personal_data` (`first_name`, `last_name`, `mobile_no`, `city`, `person_id`) VALUES
('Saurabh', 'Kubde', 9687918562, 'Pune', 10012),
('Rohan', 'Gosavi', 7972579294, 'Mumbai', 10013),
('Vipul', 'Pansare', 9923658745, 'Latur', 10014),
('Shreyas', 'Hingane', 9936587425, 'Delhi', 10015),
('Rudra', 'Ghodke', 88888888888, 'Thane', 10016),
('Shivani', 'Devi', 9952147896, 'Akola', 10017),
('Kshitija', 'Shinde', 9965874569, 'Beed', 10018),
('Akshata', 'Pawar', 9975684231, 'Aurangabad', 10019),
('Ajay', 'Chitikan', 9985623104, 'Amravati', 10020),
('Rutika', 'Sonavane', 9995623104, 'Nashik', 10021),
('Yash', 'Srivastava', 9999623104, 'Raigad', 10022),
('Pranjal', 'Echlawar', 9999923104, 'Solapur', 10023),
('Mayur', 'Saparia', 9998653214, 'Parbhani', 10024),
('Gaurav', 'Tahlani', 8965231047, 'Satara', 10025),
('Shubham', 'Mahajan', 8865231047, 'Sangli', 10026),
('Avinee', 'Nemade', 8765231047, 'Jalna', 10027),
('Rahul', 'Shelke', 8665237047, 'Nashik', 10028),
('Pandu', 'Sangle', 8965231236, 'Dhule', 10029),
('Rushi', 'Jadhav', 7156892342, 'Hingoli', 10030),
('Abhi', 'Shinde', 7235648910, 'Kolhapur', 10031),
('Mayank', 'Rathole', 7356248910, 'Ratnagari', 10032),
('Ajay', 'Soni', 7523123210, 'Dhule', 10033),
('Shiv', 'Mudvar', 7632569840, 'Gondia', 10034),
('Smith', 'J', 5863247820, 'LA', 10035),
('smith', 'j', 7894563210, 'LA', 10036),
('Harshada', 'Gosavi', 7894561357, 'nandurbar', 10037);

-- --------------------------------------------------------

--
-- Table structure for table `transaction`
--

CREATE TABLE `transaction` (
  `Transaction_no` int(11) NOT NULL,
  `buyer` int(11) NOT NULL,
  `seller` int(11) NOT NULL,
  `car_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaction`
--

INSERT INTO `transaction` (`Transaction_no`, `buyer`, `seller`, `car_id`) VALUES
(6, 10014, 10027, 37);

-- --------------------------------------------------------

--
-- Table structure for table `user_info`
--

CREATE TABLE `user_info` (
  `Sr_no` int(11) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `user_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_info`
--

INSERT INTO `user_info` (`Sr_no`, `username`, `password`, `user_id`) VALUES
(16, 'Skubde', 'Skubde@12', 10012),
(17, 'Rgosavi', '123456', 10013),
(18, 'Vpansare', 'Vpansare@14', 10014),
(19, 'Shingane', 'Shingane@15', 10015),
(20, 'Rghodke', 'Rghodke@16', 10016),
(21, 'Sdevi', 'Sdevi@17', 10017),
(22, 'Kshinde', 'Kshinde@18', 10018),
(23, 'Apawar', 'Apawar@19', 10019),
(24, 'Achitikan', 'Achitikan@20', 10020),
(25, 'Rsonavane', 'Rsonavane@21', 10021),
(26, 'Ysri', 'Ysri@22', 10022),
(27, 'Pechalwar', 'Pechalwar@23', 10023),
(28, 'Msaparia', 'Msaparia@24', 10025),
(29, 'Gthlani', 'Gthlani@25', 10025),
(30, 'Smahajan', 'Smahajan@26', 10026),
(31, 'Anemade', 'Anemade@27', 10027),
(32, 'Rshelke', 'Rshelke@28', 10028),
(33, 'Psangle', 'Psangle@29', 10029),
(34, 'Rjadhav', 'Rjadhav@30', 10030),
(35, 'Ashinde', 'Ashinde@31', 10031),
(36, 'Mrathole', 'Mrathole@32', 10032),
(37, 'Asoni', 'Asoni@33', 10033),
(38, 'Smudvr', 'Smudvr@34', 10034),
(39, 'Smith_', '1234567', 10035),
(40, 'smith', 'smith@123', 10036),
(41, 'harshada', 'abcd123', 10037);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `car`
--
ALTER TABLE `car`
  ADD PRIMARY KEY (`model_id`);

--
-- Indexes for table `car_info2`
--
ALTER TABLE `car_info2`
  ADD PRIMARY KEY (`car_id`),
  ADD KEY `owner_id` (`owner_id`),
  ADD KEY `model_id` (`model_id`);

--
-- Indexes for table `car_info2_history`
--
ALTER TABLE `car_info2_history`
  ADD PRIMARY KEY (`car_id`),
  ADD KEY `owner_id` (`owner_id`),
  ADD KEY `model_id` (`model_id`);

--
-- Indexes for table `personal_data`
--
ALTER TABLE `personal_data`
  ADD PRIMARY KEY (`person_id`),
  ADD UNIQUE KEY `mobile_no` (`mobile_no`);

--
-- Indexes for table `transaction`
--
ALTER TABLE `transaction`
  ADD PRIMARY KEY (`Transaction_no`),
  ADD KEY `buyer` (`buyer`),
  ADD KEY `seller` (`seller`);

--
-- Indexes for table `user_info`
--
ALTER TABLE `user_info`
  ADD PRIMARY KEY (`Sr_no`),
  ADD KEY `user_id` (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `car`
--
ALTER TABLE `car`
  MODIFY `model_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1042;

--
-- AUTO_INCREMENT for table `car_info2`
--
ALTER TABLE `car_info2`
  MODIFY `car_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;

--
-- AUTO_INCREMENT for table `car_info2_history`
--
ALTER TABLE `car_info2_history`
  MODIFY `car_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;

--
-- AUTO_INCREMENT for table `personal_data`
--
ALTER TABLE `personal_data`
  MODIFY `person_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10038;

--
-- AUTO_INCREMENT for table `transaction`
--
ALTER TABLE `transaction`
  MODIFY `Transaction_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `user_info`
--
ALTER TABLE `user_info`
  MODIFY `Sr_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `car_info2`
--
ALTER TABLE `car_info2`
  ADD CONSTRAINT `car_info2_ibfk_1` FOREIGN KEY (`owner_id`) REFERENCES `personal_data` (`person_id`),
  ADD CONSTRAINT `car_info2_ibfk_2` FOREIGN KEY (`model_id`) REFERENCES `car` (`model_id`);

--
-- Constraints for table `transaction`
--
ALTER TABLE `transaction`
  ADD CONSTRAINT `transaction_ibfk_1` FOREIGN KEY (`buyer`) REFERENCES `personal_data` (`person_id`),
  ADD CONSTRAINT `transaction_ibfk_2` FOREIGN KEY (`seller`) REFERENCES `personal_data` (`person_id`);

--
-- Constraints for table `user_info`
--
ALTER TABLE `user_info`
  ADD CONSTRAINT `user_info_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `personal_data` (`person_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
