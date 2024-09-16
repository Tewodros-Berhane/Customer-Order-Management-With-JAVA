-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 21, 2024 at 03:56 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ecommerce`
--

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE `customers` (
  `CUSTOMER_ID` int(11) NOT NULL,
  `customer_name` varchar(50) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `shipping_addres` varchar(80) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`CUSTOMER_ID`, `customer_name`, `email`, `shipping_addres`) VALUES
(1, 'Tewodros Berhane', 'tewodros@gmail.com', 'Mekelle'),
(2, 'Bethelhem Molla', 'bethelhem@gmail.com', 'Mekelle'),
(3, 'Nahom Teklu', 'nahom@gmail.com', 'Mekelle'),
(5, 'Nahom Tadesse', 'nahom@gmail.com', 'Mekelle'),
(8, 'Tesfay Mulaw', 'tesfay@gmail.com', 'Mekelle'),
(9, 'Meron Abrha', 'meron@gmail.com', 'Mekelle');

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `ORDER_ID` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `order_date` date NOT NULL,
  `total_amount` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`ORDER_ID`, `customer_id`, `order_date`, `total_amount`) VALUES
(1, 1, '2024-04-21', 270),
(2, 2, '2024-04-21', 100),
(3, 1, '2024-04-21', 300),
(4, 8, '2024-04-21', 450),
(5, 8, '2024-04-21', 240),
(6, 3, '2024-04-21', 200),
(7, 5, '2024-04-21', 50),
(8, 1, '2024-04-21', 240),
(9, 1, '2024-04-21', 100);

-- --------------------------------------------------------

--
-- Table structure for table `orders_details`
--

CREATE TABLE `orders_details` (
  `ORDER_DETAIL_ID` int(11) NOT NULL,
  `order_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `qty` int(11) NOT NULL,
  `order_price` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `PRODUCT_ID` int(11) NOT NULL,
  `product_name` varchar(50) NOT NULL,
  `description` varchar(80) DEFAULT NULL,
  `price` decimal(10,0) NOT NULL,
  `stock_quantity` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`PRODUCT_ID`, `product_name`, `description`, `price`, `stock_quantity`) VALUES
(1, 'Adidas Running Shoes', 'Lightweight running shoes', 80, 100),
(2, 'Nike Air Max Sneakers', 'Classic sneakers with air cushioning', 90, 115),
(3, 'Puma Basketball Shoes', 'Stylish basketball shoes', 100, 75),
(4, 'Reebok Leather Shoes', 'Iconic leather shoes', 70, 90),
(5, 'New Balance Trail Shoes', 'Trail running shoes', 90, 150),
(6, 'Under Armour Training Shoes', 'Breathable gym shoes', 60, 66),
(7, 'Vans Skateboarding Shoes', 'Durable skateboarding shoes', 50, 97),
(8, 'Converse Chuck Taylor', 'Canvas sneakers for casual wear', 55, 60),
(9, 'Skechers Slip-ons', 'Comfortable slip-on shoes', 40, 194),
(10, 'ASICS Gel-Nimbus Running Shoes', 'High-performance running shoes', 130, 110),
(11, 'Adidas Superstar Sneakers', 'Iconic sneakers with classic design', 70, 80),
(12, 'Nike React Running Shoes', 'Responsive running shoes with React foam', 110, 120),
(13, 'Puma Suede Classic Shoes', 'Timeless suede shoes for everyday style', 80, 90),
(14, 'Reebok CrossFit Training Shoes', 'Versatile shoes for CrossFit workouts', 80, 110),
(15, 'New Balance Fresh Foam Running Shoes', 'Plush cushioning for a smooth run', 100, 100);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`CUSTOMER_ID`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`ORDER_ID`);

--
-- Indexes for table `orders_details`
--
ALTER TABLE `orders_details`
  ADD PRIMARY KEY (`ORDER_DETAIL_ID`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`PRODUCT_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customers`
--
ALTER TABLE `customers`
  MODIFY `CUSTOMER_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `ORDER_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `orders_details`
--
ALTER TABLE `orders_details`
  MODIFY `ORDER_DETAIL_ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `PRODUCT_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
