DROP TABLE IF EXISTS `object`;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `object`
(
    `id`             int NOT NULL AUTO_INCREMENT,
    `name`           varchar(100) DEFAULT NULL,
    `type`           varchar(500) DEFAULT NULL,
    `discoverer`     varchar(100) DEFAULT NULL,
    `discovery_date` date         DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 25
  DEFAULT CHARSET = utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;