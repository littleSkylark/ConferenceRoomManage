/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50715
Source Host           : localhost:3306
Source Database       : conferenceroommanage

Target Server Type    : MYSQL
Target Server Version : 50715
File Encoding         : 65001

Date: 2017-02-16 10:04:53
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
  `status` tinyint(1) NOT NULL DEFAULT '1' COMMENT '0为取消',
  PRIMARY KEY (`id`),
  KEY `企业id` (`companyId`) USING HASH,
  KEY `预订人id` (`userId`) USING HASH,
  KEY `会议室id` (`roomId`) USING HASH
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of booking
-- ----------------------------
INSERT INTO `booking` VALUES ('1', '2', '2', '1', '嗨起来', '2017-01-21', '09:00:00', '12:00:00', '黑板，白板', '2017-01-20 17:22:54', '1');
INSERT INTO `booking` VALUES ('2', '2', '3', '4', '默哀', '2017-01-21', '12:00:00', '15:00:00', '投影仪', '2017-01-20 17:24:32', '1');

-- ----------------------------
-- Table structure for device
-- ----------------------------
DROP TABLE IF EXISTS `device`;
CREATE TABLE `device` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`),
  UNIQUE KEY `设备名称` (`name`) USING HASH
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of device
-- ----------------------------
INSERT INTO `device` VALUES ('5', '投影仪');
INSERT INTO `device` VALUES ('4', '激光笔');
INSERT INTO `device` VALUES ('2', '电子板');
INSERT INTO `device` VALUES ('3', '粉笔');
INSERT INTO `device` VALUES ('1', '黑板');

-- ----------------------------
-- Table structure for futurebooking
-- ----------------------------
DROP TABLE IF EXISTS `futurebooking`;
CREATE TABLE `futurebooking` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bookingId` int(11) NOT NULL,
  `companyId` int(11) NOT NULL,
  `roomId` int(11) DEFAULT NULL,
  `date` date NOT NULL,
  `startTime` time DEFAULT NULL,
  `endTime` time DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `企业id` (`companyId`) USING HASH,
  KEY `预定日期` (`date`) USING HASH
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of futurebooking
-- ----------------------------
INSERT INTO `futurebooking` VALUES ('1', '1', '2', null, '2017-01-21', null, null);
INSERT INTO `futurebooking` VALUES ('2', '2', '2', null, '2017-01-21', null, null);

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
  `beginTime` time NOT NULL,
  `endTime` time NOT NULL,
  `reg_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `remarks` varchar(50) DEFAULT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `企业id` (`companyId`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of room
-- ----------------------------
INSERT INTO `room` VALUES ('1', '2', '1', '10', '主楼304', '08:30:00', '22:00:00', '2017-01-20 17:19:18', null, '1');
INSERT INTO `room` VALUES ('3', '2', '3', '15', '活动楼401', '08:00:00', '22:00:00', '2017-01-20 17:20:00', null, '1');
INSERT INTO `room` VALUES ('4', '2', '5', '23', '活动楼512', '08:30:00', '20:00:00', '2017-02-12 21:42:13', null, '1');

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
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of room_device
-- ----------------------------
INSERT INTO `room_device` VALUES ('1', '1', '1');
INSERT INTO `room_device` VALUES ('2', '1', '3');
INSERT INTO `room_device` VALUES ('3', '1', '5');
INSERT INTO `room_device` VALUES ('4', '4', '4');
INSERT INTO `room_device` VALUES ('5', '4', '5');
INSERT INTO `room_device` VALUES ('6', '3', '1');
INSERT INTO `room_device` VALUES ('7', '3', '2');
INSERT INTO `room_device` VALUES ('8', '3', '3');

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
  `role` smallint(6) NOT NULL DEFAULT '1' COMMENT '0:企业，1:个人',
  `isAdmin` tinyint(1) NOT NULL DEFAULT '0' COMMENT '0为普通员工，1为管理员',
  `companyId` int(11) DEFAULT NULL,
  `registration` bigint(20) DEFAULT NULL,
  `auth` varchar(30) DEFAULT '',
  PRIMARY KEY (`id`),
  KEY `手机号码` (`phoneNum`) USING BTREE,
  KEY `邮箱` (`email`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('2', '13136825652', '13136825652@163.com', '123', 'lark', '2017-01-20 17:14:01', '0', '1', null, '2340923581293', 'aslfmajeifsl');
INSERT INTO `user` VALUES ('3', '17192173500', '2397@qq.com', '234', 'lark_sky', '2017-01-20 17:17:34', '1', '0', '2', null, '');
