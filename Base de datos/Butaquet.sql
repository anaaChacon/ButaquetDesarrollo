-- MySQL dump 10.13  Distrib 5.7.12, for Win32 (AMD64)
--
-- Host: localhost    Database: butaquet
-- ------------------------------------------------------
-- Server version	5.6.34-log

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
-- Table structure for table `cines`
--

DROP TABLE IF EXISTS `cines`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cines` (
  `id_cine` int(3) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) DEFAULT NULL,
  `cif` varchar(9) DEFAULT NULL,
  `telefono` int(9) DEFAULT NULL,
  `direccion` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id_cine`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cines`
--

LOCK TABLES `cines` WRITE;
/*!40000 ALTER TABLE `cines` DISABLE KEYS */;
INSERT INTO `cines` VALUES (1,'Aragó Cinema','A85261457',961361505,'Avinguda del Port 1'),(2,'Cine Lys','A36587123',963511766,'Passeig de Russafa 3'),(3,'Kinepolis València','A85630145',961587423,'Av. Francesc Tomñas i Valiente s/n (CC Heron City)'),(4,'ABC El Saler','A32478965',961478623,'Av. Profesor Lopez Piñero 16 (CC El Saler)'),(5,'Ocine Aqua','A12874698',961358745,'Carrer de Menorca 19 (CC Aqua)');
/*!40000 ALTER TABLE `cines` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleados`
--

DROP TABLE IF EXISTS `empleados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `empleados` (
  `id_empleado` int(3) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) DEFAULT NULL,
  `apellidos` varchar(60) DEFAULT NULL,
  `telefono` int(9) DEFAULT NULL,
  `dni` varchar(9) DEFAULT NULL,
  `direccion_empleado` varchar(60) DEFAULT NULL,
  `acceso_usuario` int(6) NOT NULL,
  `acceso_contrasenya` int(8) NOT NULL,
  `tipo_empleado` tinyint(4) DEFAULT NULL,
  `cine_id` int(3) NOT NULL,
  PRIMARY KEY (`id_empleado`),
  KEY `cine_id` (`cine_id`),
  CONSTRAINT `empleados_ibfk_1` FOREIGN KEY (`cine_id`) REFERENCES `cines` (`id_cine`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleados`
--

LOCK TABLES `empleados` WRITE;
/*!40000 ALTER TABLE `empleados` DISABLE KEYS */;
INSERT INTO `empleados` VALUES (1,'Maria','López Gómez',658745324,'23547856V','Carrer de Burjassot 5',526874,11111111,0,1),(2,'Antonio','Pérez Galdos',963478596,'19754485M','Carrer de Marí Blas de Lezo 53',574326,11111111,0,1),(3,'Carmen','Machi Terol',961458765,'26478596Z','Travesia de les Flors',574236,11111111,0,3),(4,'TPV','Venta Pública',NULL,NULL,NULL,587456,11111111,1,1),(5,'Daniel','Marí Fortea',961584655,'56842362T','Carrer de Pintor Ferrandis 45',581235,11111111,0,2);
/*!40000 ALTER TABLE `empleados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `peliculas`
--

DROP TABLE IF EXISTS `peliculas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `peliculas` (
  `id_pelicula` int(4) NOT NULL AUTO_INCREMENT,
  `nombre_pelicula` varchar(60) DEFAULT NULL,
  `categoria` varchar(30) DEFAULT NULL,
  `director` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id_pelicula`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `peliculas`
--

LOCK TABLES `peliculas` WRITE;
/*!40000 ALTER TABLE `peliculas` DISABLE KEYS */;
INSERT INTO `peliculas` VALUES (1,'Frozen','Fantasía/Comedia','Charles Vidor'),(2,'Underworld 5','Acción-Ciencia Ficción','Len Wiselman'),(3,'Infierno azul','Ciencia Ficción','Jaume Collet-Serra'),(4,'La llegada','Drama','Denis Villeneuve'),(5,'Contratiempo','Thriller','Oriol Paulo');
/*!40000 ALTER TABLE `peliculas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proyeccion`
--

DROP TABLE IF EXISTS `proyeccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `proyeccion` (
  `id_proyeccion` int(6) NOT NULL AUTO_INCREMENT,
  `sala_id` int(3) NOT NULL,
  `pelicula_id` int(4) NOT NULL,
  `hora` time DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  PRIMARY KEY (`id_proyeccion`),
  KEY `sala_id` (`sala_id`),
  KEY `pelicula_id` (`pelicula_id`),
  CONSTRAINT `proyeccion_ibfk_1` FOREIGN KEY (`sala_id`) REFERENCES `salas` (`id_sala`),
  CONSTRAINT `proyeccion_ibfk_2` FOREIGN KEY (`pelicula_id`) REFERENCES `peliculas` (`id_pelicula`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proyeccion`
--

LOCK TABLES `proyeccion` WRITE;
/*!40000 ALTER TABLE `proyeccion` DISABLE KEYS */;
INSERT INTO `proyeccion` VALUES (1,1,1,'17:00:00','2017-02-14'),(2,4,1,'19:00:00','2017-02-21'),(3,1,1,'21:00:00','2017-02-14'),(4,2,2,'16:30:00','2017-02-14'),(5,3,2,'20:40:00','2017-02-14'),(6,2,3,'22:30:00','2017-02-14'),(7,4,1,'17:00:00','2017-02-14');
/*!40000 ALTER TABLE `proyeccion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salas`
--

DROP TABLE IF EXISTS `salas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `salas` (
  `id_sala` int(3) NOT NULL AUTO_INCREMENT,
  `num_sala` int(3) DEFAULT NULL,
  `filas` int(3) DEFAULT NULL,
  `columnas` int(2) NOT NULL,
  `cine_id` int(3) NOT NULL,
  PRIMARY KEY (`id_sala`),
  KEY `cine_id` (`cine_id`),
  CONSTRAINT `salas_ibfk_1` FOREIGN KEY (`cine_id`) REFERENCES `cines` (`id_cine`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salas`
--

LOCK TABLES `salas` WRITE;
/*!40000 ALTER TABLE `salas` DISABLE KEYS */;
INSERT INTO `salas` VALUES (1,1,10,12,1),(2,2,10,12,1),(3,3,10,8,1),(4,4,10,12,1),(5,5,10,10,1);
/*!40000 ALTER TABLE `salas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-02-09 23:04:28
