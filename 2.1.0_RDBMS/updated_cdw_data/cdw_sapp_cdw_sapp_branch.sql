-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: cdw_sapp
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
-- Table structure for table `cdw_sapp_branch`
--

DROP TABLE IF EXISTS `cdw_sapp_branch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cdw_sapp_branch` (
  `BRANCH_CODE` int(9) NOT NULL,
  `BRANCH_NAME` varchar(25) DEFAULT NULL,
  `BRANCH_STREET` varchar(30) DEFAULT NULL,
  `BRANCH_CITY` varchar(30) NOT NULL,
  `BRANCH_STATE` varchar(30) DEFAULT NULL,
  `BRANCH_ZIP` int(7) DEFAULT NULL,
  `BRANCH_PHONE` varchar(10) DEFAULT NULL,
  `LAST_UPDATED` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`BRANCH_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cdw_sapp_branch`
--

LOCK TABLES `cdw_sapp_branch` WRITE;
/*!40000 ALTER TABLE `cdw_sapp_branch` DISABLE KEYS */;
INSERT INTO `cdw_sapp_branch` VALUES (1,'Example Bank','Bridle Court','Lakeville','MN',55044,'1234565276','2018-04-25 15:05:10'),(2,'Example Bank','Washington Street','Huntley','IL',60142,'1234618993','2018-04-25 15:04:31'),(3,'Example Bank','Warren Street','SouthRichmondHill','NY',11419,'1234985926','2018-04-25 15:04:31'),(4,'Example Bank','Cleveland Street','Middleburg','FL',32068,'1234663064','2018-04-25 15:04:31'),(5,'Example Bank','14th Street','KingOfPrussia','PA',19406,'1234849701','2018-04-25 15:04:31'),(7,'Example Bank','Jefferson Street','Paterson','NJ',7501,'1234144890','2018-04-25 15:04:31'),(8,'Example Bank','B Street','Pittsford','NY',14534,'1234678272','2018-04-25 15:04:31'),(9,'Example Bank','Jefferson Court','Wethersfield','CT',6109,'1234675219','2018-04-25 15:04:31'),(10,'Example Bank','Cambridge Road','NorthOlmsted','OH',44070,'1234145047','2018-04-25 15:04:31'),(11,'Example Bank','3rd Street West','Hillsborough','NJ',8844,'1234366354','2018-04-25 15:04:31'),(12,'Example Bank','Mill Road','MadisonHeights','MI',48071,'1234867175','2018-04-25 15:04:31'),(14,'Example Bank','Washington Street','Oviedo','FL',32765,'1234938460','2018-04-25 15:04:31'),(15,'Example Bank','Chestnut Street','Mechanicsburg','PA',17050,'1234462043','2018-04-25 15:04:31'),(16,'Example Bank','Monroe Drive','Plainview','NY',11803,'1234857525','2018-04-25 15:04:31'),(17,'Example Bank','Railroad Street','Paducah','KY',42001,'1234546360','2018-04-25 15:04:31'),(18,'Example Bank','Church Street South','Harleysville','PA',19438,'1234824455','2018-04-25 15:04:31'),(19,'Example Bank','King Street','SilverSpring','MD',20901,'1234484380','2018-04-25 15:04:31'),(20,'Example Bank','Canterbury Drive','Burnsville','MN',55337,'1234840138','2018-04-25 15:04:31'),(21,'Example Bank','2nd Avenue','Tacoma','WA',98444,'1234362433','2018-04-25 15:04:31'),(22,'Example Bank','Front Street South','Carlisle','PA',17013,'1234922492','2018-04-25 15:04:31'),(23,'Example Bank','Highland Avenue','Duarte','CA',91010,'1234460645','2018-04-25 15:04:31'),(24,'Example Bank','Grove Street','Redford','MI',48239,'1234617414','2018-04-25 15:04:31'),(25,'Example Bank','Park Avenue','NewBaltimore','MI',48047,'1234525844','2018-04-25 15:04:31'),(26,'Example Bank','Chestnut Avenue','LakeJackson','TX',77566,'1234356462','2018-04-25 15:04:31'),(27,'Example Bank','Pin Oak Drive','WinstonSalem','NC',27103,'1234836200','2018-04-25 15:04:31'),(28,'Example Bank','3rd Street West','Midlothian','VA',23112,'1234416595','2018-04-25 15:04:31'),(29,'Example Bank','School Street','Glendora','CA',91740,'1234785605','2018-04-25 15:04:31'),(30,'Example Bank','Shady Lane','SouthLyon','MI',48178,'1234915717','2018-04-25 15:04:31'),(31,'Example Bank','Queen Street','Carrollton','GA',30117,'1234148639','2018-04-25 15:04:31'),(32,'Example Bank','Aspen Court','Helena','MT',59601,'1234302170','2018-04-25 15:04:31'),(35,'Example Bank','Durham Road','Loganville','GA',30052,'1234316769','2018-04-25 15:04:31'),(36,'Example Bank','Spruce Avenue','ElDorado','AR',71730,'1234685988','2018-04-25 15:04:31'),(37,'Example Bank','Lawrence Street','CapeCoral','FL',33904,'1234771676','2018-04-25 15:04:31'),(38,'Example Bank','7th Street','Starkville','MS',39759,'1234810167','2018-04-25 15:04:31'),(39,'Example Bank','Devonshire Drive','Grandville','MI',49418,'1234209297','2018-04-25 15:04:31'),(40,'Example Bank','Franklin Avenue','Jonesboro','GA',30236,'1234295270','2018-04-25 15:04:31'),(42,'Example Bank','Elmwood Avenue','Youngstown','OH',44512,'1234237878','2018-04-25 15:04:31'),(43,'Example Bank','Ashley Court','Houston','TX',77016,'1234755992','2018-04-25 15:04:31'),(44,'Example Bank','12th Street East','Greenville','NC',27834,'1234736019','2018-04-25 15:04:31'),(45,'Example Bank','Bayberry Drive','Wilmette','IL',60091,'1234453475','2018-04-25 15:04:31'),(46,'Example Bank','Jones Street','Levittown','NY',11756,'1234947541','2018-04-25 15:04:31'),(47,'Example Bank','Route 10','NewBerlin','WI',53151,'1234873625','2018-04-25 15:04:31'),(48,'Example Bank','Cedar Avenue','Bartlett','IL',60103,'1234105725','2018-04-25 15:04:31'),(49,'Example Bank','11th Street','Chambersburg','PA',17201,'1234156589','2018-04-25 15:04:31'),(50,'Example Bank','Fairway Drive','Granger','IN',46530,'1234115442','2018-04-25 15:04:31'),(51,'Example Bank','Route 20','Lombard','IL',60148,'1234132382','2018-04-25 15:04:31'),(52,'Example Bank','Fulton Street','ElPaso','TX',79930,'1234245465','2018-04-25 15:04:31'),(53,'Example Bank','Manor Drive','Dundalk','MD',21222,'1234323802','2018-04-25 15:04:31'),(54,'Example Bank','Oak Lane','RedondoBeach','CA',90278,'1234452537','2018-04-25 15:04:31'),(56,'Example Bank','State Street East','Rowlett','TX',75088,'1234852596','2018-04-25 15:04:31'),(57,'Example Bank','New Street','Hartsville','SC',29550,'1234773812','2018-04-25 15:04:31'),(58,'Example Bank','Hickory Street','Rossville','GA',30741,'1234335491','2018-04-25 15:04:31'),(59,'Example Bank','Country Lane','Waxhaw','NC',28173,'1234841134','2018-04-25 15:04:31'),(60,'Example Bank','Front Street','Richmond','VA',23223,'1234524034','2018-04-25 15:04:31'),(63,'Example Bank','York Street','Oxford','MS',38655,'1234372027','2018-04-25 15:04:31'),(66,'Example Bank','Winding Way','Syosset','NY',11791,'1234656568','2018-04-25 15:04:31'),(67,'Example Bank','Jackson Avenue','Baltimore','MD',21206,'1234432768','2018-04-25 15:04:31'),(69,'Example Bank','Amherst Street','Fenton','MI',48430,'1234670647','2018-04-25 15:04:31'),(70,'Example Bank','Briarwood Court','Medford','MA',2155,'1234982393','2018-04-25 15:04:31'),(72,'Example Bank','Essex Court','Stow','OH',44224,'1234445988','2018-04-25 15:04:31'),(73,'Example Bank','Maple Lane','Oconomowoc','WI',53066,'1234845883','2018-04-25 15:04:31'),(74,'Example Bank','Evergreen Drive','Dearborn','MI',48124,'1234273715','2018-04-25 15:04:31'),(75,'Example Bank','9th Street','Rockaway','NJ',7866,'1234204383','2018-04-25 15:04:31'),(76,'Example Bank','8th Avenue','WinterSprings','FL',32708,'1234513234','2018-04-25 15:04:31'),(77,'Example Bank','Grant Avenue','UpperMarlboro','MD',20772,'1234489272','2018-04-25 15:04:31'),(78,'Example Bank','Heather Court','Mundelein','IL',60060,'1234164452','2018-04-25 15:04:31'),(79,'Example Bank','George Street','Bettendorf','IA',52722,'1234394450','2018-04-25 15:04:31'),(80,'Example Bank','Court Street','Enterprise','AL',36330,'1234228258','2018-04-25 15:04:31'),(81,'Example Bank','Summer Street','Simpsonville','SC',29680,'1234583583','2018-04-25 15:04:31'),(83,'Example Bank','Creekside Drive','Brookfield','WI',53045,'1234242554','2018-04-25 15:04:31'),(85,'Example Bank','Brown Street','LaCrosse','WI',54601,'1234785116','2018-04-25 15:04:31'),(89,'Example Bank','Chapel Street','BuffaloGrove','IL',60089,'1234750836','2018-04-25 15:04:31'),(90,'Example Bank','Tanglewood Drive','Chillicothe','OH',45601,'1234890424','2018-04-25 15:04:31'),(91,'Example Bank','Lafayette Avenue','Davenport','IA',52804,'1234759319','2018-04-25 15:04:31'),(93,'Example Bank','Harrison Street','Poughkeepsie','NY',12601,'1234885339','2018-04-25 15:04:31'),(95,'Example Bank','Madison Street','Apopka','FL',32703,'1234667289','2018-04-25 15:04:31'),(99,'Example Bank','Bridge Street','Seymour','IN',47274,'1234164581','2018-04-25 15:04:31'),(100,'Example Bank','New Street','Wellington','FL',33414,'1234809695','2018-04-25 15:04:31'),(103,'Example Bank','Grant Street','SiouxCity','IA',51106,'1234483865','2018-04-25 15:04:31'),(104,'Example Bank','Cambridge Court','Owosso','MI',48867,'1234909907','2018-04-25 15:04:31'),(105,'Example Bank','Virginia Avenue','LongBranch','NJ',7740,'1234723165','2018-04-25 15:04:31'),(107,'Example Bank','Delaware Avenue','Defiance','OH',43512,'1234464046','2018-04-25 15:04:31'),(109,'Example Bank','Edgewood Drive','Ames','IA',50010,'1234474482','2018-04-25 15:04:31'),(111,'Example Bank','River Street','Kernersville','NC',27284,'1234369108','2018-04-25 15:04:31'),(114,'Example Bank','Madison Street','PalmCity','FL',34990,'1234172062','2018-04-25 15:04:31'),(115,'Example Bank','Jefferson Street','MurrellsInlet','SC',29576,'1234908194','2018-04-25 15:04:31'),(117,'Example Bank','Route 64','Canonsburg','PA',15317,'1234197777','2018-04-25 15:04:31'),(118,'Example Bank','Henry Street','Hanover','PA',17331,'1234498005','2018-04-25 15:04:31'),(119,'Example Bank','Fulton Street','Ashland','OH',44805,'1234121204','2018-04-25 15:04:31'),(121,'Example Bank','Warren Street','Oxnard','CA',93035,'1234368280','2018-04-25 15:04:31'),(123,'Example Bank','Willow Avenue','DeerfieldBeach','FL',33442,'1234365113','2018-04-25 15:04:31'),(124,'Example Bank','Bay Street','Osseo','MN',55311,'1234134552','2018-04-25 15:04:31'),(125,'Example Bank','Cambridge Court','AllisonPark','PA',15101,'1234699441','2018-04-25 15:04:31'),(126,'Example Bank','Route 10','Bethesda','MD',20814,'1234723287','2018-04-25 15:04:31'),(131,'Example Bank','Orchard Lane','Valrico','FL',33594,'1234880523','2018-04-25 15:04:31'),(135,'Example Bank','Canterbury Road','Nanuet','NY',10954,'1234831678','2018-04-25 15:04:31'),(136,'Example Bank','Route 11','Independence','KY',41051,'1234601062','2018-04-25 15:04:31'),(139,'Example Bank','Jefferson Street','SanLorenzo','CA',94580,'1234547241','2018-04-25 15:04:31'),(144,'Example Bank','Chestnut Avenue','NewPhiladelphia','OH',44663,'1234636138','2018-04-25 15:04:31'),(145,'Example Bank','6th Street West','Clermont','FL',34711,'1234292781','2018-04-25 15:04:31'),(149,'Example Bank','Route 27','Gettysburg','PA',17325,'1234507741','2018-04-25 15:04:31'),(156,'Example Bank','Adams Street','WestChester','PA',19380,'1234548652','2018-04-25 15:04:31'),(158,'Example Bank','Chestnut Avenue','Natchez','MS',39120,'1234293585','2018-04-25 15:04:31'),(160,'Example Bank','Beechwood Drive','GardenCity','NY',11530,'1234696702','2018-04-25 15:04:31'),(164,'Example Bank','Route 30','Yakima','WA',98908,'1234540280','2018-04-25 15:04:31'),(166,'Example Bank','Route 41','Conyers','GA',30012,'1234935053','2018-04-25 15:04:31'),(168,'Example Bank','Williams Street','YubaCity','CA',95993,'1234317447','2018-04-25 15:04:31'),(170,'Example Bank','Broadway','Irvington','NJ',7111,'1234419610','2018-04-25 15:04:31'),(173,'Example Bank','Victoria Court','Victoria','TX',77904,'1234337068','2018-04-25 15:04:31'),(175,'Example Bank','Garfield Avenue','FloralPark','NY',11001,'1234842967','2018-04-25 15:04:31'),(178,'Example Bank','8th Street West','Baldwin','NY',11510,'1234612707','2018-04-25 15:04:31'),(180,'Example Bank','Meadow Street','NewHaven','CT',6511,'1234347181','2018-04-25 15:04:31'),(188,'Example Bank','Lincoln Avenue','Quincy','MA',2169,'1234259065','2018-04-25 15:04:31'),(192,'Example Bank','Glenwood Drive','Lititz','PA',17543,'1234937904','2018-04-25 15:04:31'),(197,'Example Bank','Briarwood Drive','Acworth','GA',30101,'1234914637','2018-04-25 15:04:31');
/*!40000 ALTER TABLE `cdw_sapp_branch` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-04-27 10:15:14
