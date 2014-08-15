/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50510
Source Host           : 127.0.0.1:3306
Source Database       : msm

Target Server Type    : MYSQL
Target Server Version : 50510
File Encoding         : 65001

Date: 2014-08-15 16:02:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_user`
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('1', '张三');
INSERT INTO `tb_user` VALUES ('2', '里斯');
INSERT INTO `tb_user` VALUES ('3', 'tony');
INSERT INTO `tb_user` VALUES ('4', 'jack');
