/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50718
 Source Host           : localhost
 Source Database       : auth

 Target Server Type    : MySQL
 Target Server Version : 50718
 File Encoding         : utf-8

 Date: 11/17/2017 17:11:31 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `account`
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `uid` bigint(19) NOT NULL,
  `login_name` varchar(32) NOT NULL COMMENT '登录名',
  `status` tinyint(1) NOT NULL COMMENT '状态:1禁用 2正常',
  `source_type` varchar(1) NOT NULL COMMENT '注册来源:A,Android;I,IOS;P,PC',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='账号表';

SET FOREIGN_KEY_CHECKS = 1;
