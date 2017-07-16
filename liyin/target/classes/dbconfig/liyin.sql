/*
Navicat MySQL Data Transfer

Source Server         : bams
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : bams

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-07-16 11:34:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE `sys_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL COMMENT 'ÓÃ»§Ãû',
  `operation` varchar(50) DEFAULT NULL COMMENT 'ÓÃ»§²Ù×÷',
  `method` varchar(200) DEFAULT NULL COMMENT 'ÇëÇó·½·¨',
  `params` varchar(5000) DEFAULT NULL COMMENT 'ÇëÇó²ÎÊý',
  `ip` varchar(64) DEFAULT NULL COMMENT 'IPµØÖ·',
  `create_date` datetime DEFAULT NULL COMMENT '´´½¨Ê±¼ä',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_log
-- ----------------------------

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `menu_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `parent_id` bigint(20) DEFAULT NULL COMMENT '¸¸²Ëµ¥ID£¬Ò»¼¶²Ëµ¥Îª0',
  `name` varchar(50) DEFAULT NULL COMMENT '²Ëµ¥Ãû³Æ',
  `url` varchar(200) DEFAULT NULL COMMENT '²Ëµ¥URL',
  `perms` varchar(500) DEFAULT NULL COMMENT '\n                ÊÚÈ¨(¶à¸öÓÃ¶ººÅ·Ö¸ô£¬Èç£ºuser:list,user:create)',
  `type` int(11) DEFAULT NULL COMMENT 'ÀàÐÍ 0£ºÄ¿Â¼ 1£º²Ëµ¥ 2£º°´Å¥',
  `icon` varchar(50) DEFAULT NULL COMMENT '²Ëµ¥Í¼±ê',
  `order_num` int(11) DEFAULT NULL COMMENT 'ÅÅÐò',
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `role_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(100) DEFAULT NULL COMMENT '½ÇÉ«Ãû³Æ',
  `remark` varchar(100) DEFAULT NULL COMMENT '±¸×¢',
  `create_user_id` bigint(20) DEFAULT NULL COMMENT '´´½¨ÕßID',
  `create_time` datetime DEFAULT NULL COMMENT '´´½¨Ê±¼ä',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------

-- ----------------------------
-- Table structure for sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(20) DEFAULT NULL COMMENT '½ÇÉ«ID',
  `menu_id` bigint(20) DEFAULT NULL COMMENT '²Ëµ¥ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL COMMENT 'ÓÃ»§Ãû',
  `password` varchar(100) DEFAULT NULL COMMENT 'ÃÜÂë',
  `email` varchar(100) DEFAULT NULL COMMENT 'ÓÊÏä',
  `mobile` varchar(100) DEFAULT NULL COMMENT 'ÊÖ»úºÅ',
  `status` tinyint(4) DEFAULT NULL COMMENT '×´Ì¬ 0£º½ûÓÃ 1£ºÕý³£',
  `create_user_id` bigint(20) DEFAULT NULL COMMENT '´´½¨ÕßID',
  `create_time` datetime DEFAULT NULL COMMENT '´´½¨Ê±¼ä',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `UK_51bvuyvihefoh4kp5syh2jpi4` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'fffvv', null, null, null, null, null, '2017-07-15 15:57:58');
INSERT INTO `sys_user` VALUES ('3', '3', '3', '3', '3', '3', '43543543', null);
INSERT INTO `sys_user` VALUES ('4', '4', '4', '4', '4', '4', null, null);
INSERT INTO `sys_user` VALUES ('5', 'dddddddddddd', null, null, null, null, null, '2017-07-15 15:54:47');
INSERT INTO `sys_user` VALUES ('7', 'fff', null, null, null, null, null, '2017-07-15 15:55:58');
INSERT INTO `sys_user` VALUES ('10', 'fffvvt', null, null, null, null, null, '2017-07-15 23:23:24');
INSERT INTO `sys_user` VALUES ('11', 'fffvvgt', null, null, null, null, null, '2017-07-16 01:10:49');
INSERT INTO `sys_user` VALUES ('13', 'f1', null, null, null, null, null, '2017-07-16 01:21:47');
INSERT INTO `sys_user` VALUES ('14', 'f11', null, null, null, null, null, '2017-07-16 10:35:06');
INSERT INTO `sys_user` VALUES ('16', 'f111', null, null, null, null, null, '2017-07-16 10:36:01');
INSERT INTO `sys_user` VALUES ('17', 'f1111', null, null, null, null, null, '2017-07-16 10:42:22');

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL COMMENT 'ÓÃ»§ID',
  `role_id` bigint(20) DEFAULT NULL COMMENT '½ÇÉ«ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
