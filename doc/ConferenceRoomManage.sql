/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50715
Source Host           : localhost:3306
Source Database       : conferenceroommanage

Target Server Type    : MYSQL
Target Server Version : 50715
File Encoding         : 65001

Date: 2017-01-19 11:06:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for booking
-- ----------------------------
DROP TABLE IF EXISTS `booking`;
CREATE TABLE `booking` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `companyId` int(11) NOT NULL,
  `userId` int(11) NOT NULL,
  `roomId` int(11) NOT NULL,
  `topic` varchar(20) NOT NULL DEFAULT '',
  `date` date NOT NULL,
  `startTime` time NOT NULL,
  `endTime` time NOT NULL,
  `device` varchar(50) NOT NULL DEFAULT '',
  `bookTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `企业id` (`companyId`) USING HASH,
  KEY `预订人id` (`userId`) USING HASH,
  KEY `会议室id` (`roomId`) USING HASH
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for device
-- ----------------------------
DROP TABLE IF EXISTS `device`;
CREATE TABLE `device` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`),
  UNIQUE KEY `设备名称` (`name`) USING HASH
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for futurebook
-- ----------------------------
DROP TABLE IF EXISTS `futurebook`;
CREATE TABLE `futurebook` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `companyId` int(11) NOT NULL,
  `userId` int(11) NOT NULL,
  `roomId` int(11) NOT NULL,
  `date` date NOT NULL,
  `startTime` time NOT NULL,
  `endTime` time NOT NULL,
  PRIMARY KEY (`id`),
  KEY `企业id` (`companyId`) USING HASH,
  KEY `会议室ID` (`roomId`) USING HASH,
  KEY `预定日期` (`date`) USING HASH
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for room
-- ----------------------------
DROP TABLE IF EXISTS `room`;
CREATE TABLE `room` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `companyId` int(11) NOT NULL,
  `minNum` int(11) NOT NULL,
  `maxNum` int(11) NOT NULL,
  `name` varchar(15) NOT NULL DEFAULT '',
  `beginTime` int(11) NOT NULL,
  `endTime` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `企业id` (`companyId`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for room_device
-- ----------------------------
DROP TABLE IF EXISTS `room_device`;
CREATE TABLE `room_device` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roomId` int(11) NOT NULL,
  `deviceId` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `会议室ID` (`roomId`) USING HASH,
  KEY `设备ID` (`deviceId`) USING HASH
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `phoneNum` bigint(20) NOT NULL,
  `email` varchar(48) NOT NULL DEFAULT '',
  `password` varchar(32) NOT NULL DEFAULT '',
  `name` varchar(20) NOT NULL DEFAULT '',
  `reg_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `role` smallint(6) NOT NULL,
  `isAdmin` tinyint(1) NOT NULL DEFAULT '0' COMMENT '0为普通员工，1为管理员',
  `companyId` int(11) DEFAULT NULL,
  `registration` bigint(20) DEFAULT NULL,
  `auth` varchar(30) DEFAULT '',
  PRIMARY KEY (`id`),
  KEY `手机号码` (`phoneNum`) USING BTREE,
  KEY `邮箱` (`email`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
