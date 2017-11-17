/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50718
 Source Host           : localhost
 Source Database       : alumnus

 Target Server Type    : MySQL
 Target Server Version : 50718
 File Encoding         : utf-8

 Date: 11/17/2017 17:11:38 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `label`
-- ----------------------------
DROP TABLE IF EXISTS `label`;
CREATE TABLE `label` (
  `id` bigint(19) NOT NULL,
  `name` varchar(64) COLLATE utf8mb4_bin NOT NULL COMMENT '行业名称',
  `label_type` int(2) NOT NULL COMMENT '兴趣分类   1:生活  2:工作  3:校园  4:行业',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='校友标签表';

SET FOREIGN_KEY_CHECKS = 1;
