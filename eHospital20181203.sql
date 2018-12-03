-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: ehospital
-- ------------------------------------------------------
-- Server version	5.7.21-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `analize`
--

DROP TABLE IF EXISTS `analize`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `analize` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `an_name` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `an_description` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `an_type` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `an_price` double NOT NULL,
  `an_date_in` datetime NOT NULL,
  `an_date_out` datetime NOT NULL,
  `data_date` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT 'CURRENT_TIMESTAMP',
  `IsActive` int(11) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `analize`
--

LOCK TABLES `analize` WRITE;
/*!40000 ALTER TABLE `analize` DISABLE KEYS */;
INSERT INTO `analize` VALUES (1,'qan analiz','qanin umumi analizi','suretli',10,'2018-01-25 00:00:00','2018-01-25 00:00:00','CURRENT_TIMESTAMP',1);
/*!40000 ALTER TABLE `analize` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bill`
--

DROP TABLE IF EXISTS `bill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bill` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bill_total` double NOT NULL,
  `bill_status` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `bill_type` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `data_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `IsActive` int(11) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill`
--

LOCK TABLES `bill` WRITE;
/*!40000 ALTER TABLE `bill` DISABLE KEYS */;
INSERT INTO `bill` VALUES (1,25,'odenilib','kart','2018-02-16 09:42:01',1);
/*!40000 ALTER TABLE `bill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `dept_description` varchar(250) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `data_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `IsActive` int(11) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES (1,'Cerrahiyye','emeliyyatlar, analizler','2018-02-07 10:19:39',1),(2,'Terrapevtik Sobe','analizler, emeliyyatlar','2018-02-13 12:43:34',1);
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `emp_surname` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `emp_gender` varchar(15) COLLATE utf8mb4_unicode_ci DEFAULT 'not_specified',
  `emp_DOB` date DEFAULT NULL,
  `emp_phone` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `emp_email` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `emp_address` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `emp_salary` double NOT NULL,
  `emp_bonus` double NOT NULL,
  `emp_category` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `dept_id` int(11) NOT NULL,
  `emp_hire_date` date NOT NULL,
  `emp_fire_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `data_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `IsActive` int(11) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'Elvin','Abduyev','male','1989-07-09','+994552023549','abduyev.elvin@gmail.com','Khirdalan',2000,15,'doctor',2,'2017-01-12','2018-02-07 00:00:00','2018-02-07 10:18:59',1),(2,'test','test','female','1980-03-08','9955465656','aa@aa.com','test evinde',2250,25,'head doctor',2,'2014-07-09','2018-02-13 12:44:49','2018-02-13 12:44:49',1);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicine`
--

DROP TABLE IF EXISTS `medicine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medicine` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `med_name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `med_description` varchar(250) COLLATE utf8mb4_unicode_ci NOT NULL,
  `med_price` double NOT NULL,
  `med_type` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `med_quantity` int(11) NOT NULL,
  `med_status` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `med_date_in` datetime NOT NULL,
  `med_date_out` datetime DEFAULT CURRENT_TIMESTAMP,
  `data_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `IsActive` int(11) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicine`
--

LOCK TABLES `medicine` WRITE;
/*!40000 ALTER TABLE `medicine` DISABLE KEYS */;
INSERT INTO `medicine` VALUES (1,'ingalip','bogaz agrisi ucun',1.9,'spray',25,'stokda var','2018-01-01 00:00:00','2018-02-16 09:44:30','2018-02-16 09:44:30',1);
/*!40000 ALTER TABLE `medicine` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `operation`
--

DROP TABLE IF EXISTS `operation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `operation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `oper_name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `oper_type` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `oper_price` double NOT NULL,
  `oper_date_in` datetime NOT NULL,
  `oper_date_out` datetime NOT NULL,
  `data_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `IsActive` int(11) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operation`
--

LOCK TABLES `operation` WRITE;
/*!40000 ALTER TABLE `operation` DISABLE KEYS */;
INSERT INTO `operation` VALUES (1,'mede emeliyyati','orta uzun',1000,'2018-02-05 12:20:00','2018-02-05 15:30:00','2018-02-16 09:46:02',1);
/*!40000 ALTER TABLE `operation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patient` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pat_name` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `pat_surname` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `pat_gender` varchar(15) COLLATE utf8mb4_unicode_ci DEFAULT 'not_specified',
  `pat_DOB` date DEFAULT NULL,
  `pat_phone` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `pat_email` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `pat_address` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `data_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `IsActive` int(11) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient`
--

LOCK TABLES `patient` WRITE;
/*!40000 ALTER TABLE `patient` DISABLE KEYS */;
INSERT INTO `patient` VALUES (1,'Elvin','Abduyev','male','1989-07-09','+994552023549','abduyev.elvin@gmail.com','Khirdalan','2018-02-05 15:41:38',1),(2,'Mehman','Almardanov','male','1989-04-15','+994552515869','mehman212@gmail.com','Yasamal','2018-02-05 18:10:26',1),(3,'test','etsaa','female','1996-08-06','9945566633','aa@aa.com','salamjhaas','2018-02-13 11:09:53',1),(4,'el','eeea','female','2018-03-05','556565656','aa@aa.com','assasaasas','2018-02-13 11:12:12',0);
/*!40000 ALTER TABLE `patient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient_history`
--

DROP TABLE IF EXISTS `patient_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patient_history` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pat_id` int(11) NOT NULL,
  `emp_id` int(11) NOT NULL,
  `room_id` int(11) NOT NULL,
  `oper_id` int(11) NOT NULL,
  `an_id` int(11) NOT NULL,
  `med_id` int(11) NOT NULL,
  `bill_id` int(11) NOT NULL,
  `ph_disease` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ph_disease_description` varchar(250) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ph_disease_status` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ph_date_in` datetime NOT NULL,
  `ph_date_out` datetime DEFAULT CURRENT_TIMESTAMP,
  `data_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `IsActive` int(11) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient_history`
--

LOCK TABLES `patient_history` WRITE;
/*!40000 ALTER TABLE `patient_history` DISABLE KEYS */;
INSERT INTO `patient_history` VALUES (1,2,1,1,1,1,1,1,'umumi','umumi muayine ve emeliyyat','normal','2018-01-01 00:00:00','2018-01-05 00:00:00','2018-02-16 09:50:29',1);
/*!40000 ALTER TABLE `patient_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `room` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `room_type` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `room_status` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `room_price` double NOT NULL,
  `room_date_in` date NOT NULL,
  `room_date_out` datetime DEFAULT CURRENT_TIMESTAMP,
  `data_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `IsActive` int(11) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room`
--

LOCK TABLES `room` WRITE;
/*!40000 ALTER TABLE `room` DISABLE KEYS */;
INSERT INTO `room` VALUES (1,'vip','bos',150,'2017-01-01','2018-02-16 09:47:59','2018-02-16 09:47:59',1);
/*!40000 ALTER TABLE `room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(25) COLLATE utf8mb4_unicode_ci NOT NULL,
  `surname` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `username` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `gender` varchar(15) COLLATE utf8mb4_unicode_ci DEFAULT 'not_specified',
  `email` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `password` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `confirm_password` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `role` varchar(10) COLLATE utf8mb4_unicode_ci DEFAULT 'user',
  `IsAdmin` int(11) DEFAULT '0',
  `data_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `IsActive` int(11) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Elvin','Abduyev','el','male','abduyev.elvin@gmail.com','12','12','admin',112233,'2018-02-08 09:36:59',1),(3,'Mehman','Almardanov','meh','male','mehman212@gmail.com','12','12','user',0,'2018-02-12 10:55:32',1),(10,'Test','Test','test','male','a@c.co','11','11','admin',112233,'2018-02-14 10:20:19',0),(11,'Test1','Test1','test1','female','t@t.to','12','12','user',0,'2018-02-14 10:22:28',0);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'ehospital'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-03 16:18:08
