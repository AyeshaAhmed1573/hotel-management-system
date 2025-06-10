-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: hotelms
-- ------------------------------------------------------
-- Server version	8.0.37

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `document` varchar(30) DEFAULT NULL,
  `number` varchar(30) DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  `gender` varchar(30) DEFAULT NULL,
  `country` varchar(30) DEFAULT NULL,
  `room` varchar(30) DEFAULT NULL,
  `checkintime` varchar(80) DEFAULT NULL,
  `deposit` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES ('Passport','8724832789','laiba','Female','indonesia','301','Sat Jun 22 00:06:01 PKT 2024','2000'),('Cnic','7348746874','ahmed','Male','pakistan','302','Sat Jun 22 00:06:34 PKT 2024','3000');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `department` (
  `department` varchar(50) DEFAULT NULL,
  `budget` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES ('office','50000'),('kitchen','80000'),('security','100000');
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `driver`
--

DROP TABLE IF EXISTS `driver`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `driver` (
  `name` varchar(20) DEFAULT NULL,
  `age` varchar(20) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `carcompany` varchar(20) DEFAULT NULL,
  `caravaibility` varchar(20) DEFAULT NULL,
  `carname` varchar(20) DEFAULT NULL,
  `location` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driver`
--

LOCK TABLES `driver` WRITE;
/*!40000 ALTER TABLE `driver` DISABLE KEYS */;
INSERT INTO `driver` VALUES ('asif','30','MALE','toyata','YES','corolla','bahadurabad,karach'),('saleem','30','MALE','mercedes','YES','mercedes clr gtr','clifton'),('ali','25','MALE','porsche','YES','porsche 718 cayman','defence'),('ducky','50','MALE','lamborghini','YES','revuelto','disneyland');
/*!40000 ALTER TABLE `driver` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `name` varchar(20) DEFAULT NULL,
  `age` varchar(20) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `job` varchar(20) DEFAULT NULL,
  `salary` varchar(20) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `cnic` varchar(20) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES ('sara','20','FEMALE','Housekeeping','20000','0978734874','0978734874','abc@gmail.com'),('atif','40','MALE','Manager','100000','9298761234','9298761234','123@hotmail.com'),('shariq','25','MALE','Front Desk','50000','9256326886','9256326886','xyz@gmail.com'),('sidra','30','FEMALE','Accountant','40000','92657668987','92657668987','gui@gmail.com'),('hassan','36','MALE','Chef','600000','92657657645','92657657645','obs@gmail.com'),('kainat','28','MALE','Housekeeping','20000','927868736472','927868736472','efg@gmail.com'),('shakeel','29','MALE','Housekeeping','200000','9286748745','9286748745','fty@hotmail.com'),('anna','20','FEMALE','Housekeeping','20000','546572352','546572352','abd@gmail.com');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login` (
  `username` varchar(25) DEFAULT NULL,
  `password` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES ('ayesha','1234'),('ayesha','1234'),('anna','anna'),('khola','khola'),('pooja','pooja');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login2`
--

DROP TABLE IF EXISTS `login2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login2` (
  `username` varchar(35) DEFAULT NULL,
  `password` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login2`
--

LOCK TABLES `login2` WRITE;
/*!40000 ALTER TABLE `login2` DISABLE KEYS */;
INSERT INTO `login2` VALUES ('sultan','sult'),('moiez','moie'),('kishore','kish'),('ahmed','ahme');
/*!40000 ALTER TABLE `login2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `room` (
  `roomnumber` varchar(20) DEFAULT NULL,
  `avaibility` varchar(20) DEFAULT NULL,
  `cleaning_status` varchar(30) DEFAULT NULL,
  `price` varchar(30) DEFAULT NULL,
  `bedtype` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room`
--

LOCK TABLES `room` WRITE;
/*!40000 ALTER TABLE `room` DISABLE KEYS */;
INSERT INTO `room` VALUES ('302','occupied','cleaned','5000','Double Bed'),('124','Available','Cleaned','5000','Double Bed'),('201','Available','Dirty','2500','Single Bed'),('666','occupied','Cleaned','2500','Single Bed'),('403','Available','Dirty','5000','Double Bed'),('431','Occupied','Cleaned','2500','Single Bed');
/*!40000 ALTER TABLE `room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'hotelms'
--

--
-- Dumping routines for database 'hotelms'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-23  1:24:45
