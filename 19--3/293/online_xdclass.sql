# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.7.12)
# Database: online_xdclass
# Generation Time: 2020-05-08 15:22:25 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table chapter
# ------------------------------------------------------------

DROP TABLE IF EXISTS `chapter`;

CREATE TABLE `chapter` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `video_id` int(11) DEFAULT NULL COMMENT '视频主键',
  `title` varchar(128) DEFAULT NULL COMMENT '章节名称',
  `ordered` int(11) DEFAULT NULL COMMENT '章节顺序',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table episode
# ------------------------------------------------------------

DROP TABLE IF EXISTS `episode`;

CREATE TABLE `episode` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(524) DEFAULT NULL COMMENT '集标题',
  `num` int(10) DEFAULT NULL COMMENT '第几集,全局顺序',
  `ordered` int(11) DEFAULT NULL COMMENT '顺序，章里面的顺序',
  `play_url` varchar(256) DEFAULT NULL COMMENT '播放地址',
  `chapter_id` int(11) DEFAULT NULL COMMENT '章节主键id',
  `free` tinyint(2) DEFAULT '0' COMMENT '0表示免费，1表示首付',
  `video_id` int(10) DEFAULT NULL COMMENT '视频id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table play_record
# ------------------------------------------------------------

DROP TABLE IF EXISTS `play_record`;

CREATE TABLE `play_record` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `video_id` int(11) DEFAULT NULL,
  `current_num` int(11) DEFAULT NULL COMMENT '当前播放第几集',
  `episode_id` int(11) DEFAULT NULL COMMENT '当前播放第几集视频id',
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



# Dump of table user
# ------------------------------------------------------------

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(128) DEFAULT NULL COMMENT '昵称',
  `pwd` varchar(124) DEFAULT NULL COMMENT '密码',
  `head_img` varchar(524) DEFAULT NULL COMMENT '头像',
  `phone` varchar(64) DEFAULT '' COMMENT '手机号',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `phone` (`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table video
# ------------------------------------------------------------

DROP TABLE IF EXISTS `video`;

CREATE TABLE `video` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(524) DEFAULT NULL COMMENT '视频标题',
  `summary` varchar(1026) DEFAULT NULL COMMENT '概述',
  `cover_img` varchar(524) DEFAULT NULL COMMENT '封面图',
  `price` int(11) DEFAULT NULL COMMENT '价格,分',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `point` double(11,2) DEFAULT '8.70' COMMENT '默认8.7，最高10分',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table video_banner
# ------------------------------------------------------------

DROP TABLE IF EXISTS `video_banner`;

CREATE TABLE `video_banner` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `url` varchar(256) DEFAULT NULL COMMENT '跳转地址',
  `img` varchar(256) DEFAULT NULL COMMENT '图片地址',
  `create_time` datetime DEFAULT NULL,
  `weight` int(11) DEFAULT NULL COMMENT '数字越小排越前',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



# Dump of table video_order
# ------------------------------------------------------------

DROP TABLE IF EXISTS `video_order`;

CREATE TABLE `video_order` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `out_trade_no` varchar(64) DEFAULT NULL COMMENT '订单唯一标识',
  `state` int(11) DEFAULT NULL COMMENT '0表示未支付，1表示已支付',
  `create_time` datetime DEFAULT NULL COMMENT '订单生成时间',
  `total_fee` int(11) DEFAULT NULL COMMENT '支付金额，单位分',
  `video_id` int(11) DEFAULT NULL COMMENT '视频主键',
  `video_title` varchar(256) DEFAULT NULL COMMENT '视频标题',
  `video_img` varchar(256) DEFAULT NULL COMMENT '视频图片',
  `user_id` int(12) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
