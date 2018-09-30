/*
Navicat MySQL Data Transfer

Source Server         : salesplaform
Source Server Version : 50539
Source Host           : localhost:3306
Source Database       : db_salesplatform

Target Server Type    : MYSQL
Target Server Version : 50539
File Encoding         : 65001

Date: 2018-09-30 16:18:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_acttip
-- ----------------------------
DROP TABLE IF EXISTS `t_acttip`;
CREATE TABLE `t_acttip` (
  `C_BH` char(32) NOT NULL COMMENT '编号',
  `C_GOODS` char(32) DEFAULT NULL COMMENT '商品编号',
  `D_STARTDATE` date DEFAULT NULL COMMENT '开始时间',
  `D_ENDDATE` date DEFAULT NULL COMMENT '结束时间',
  `C_DISCOUNT` varchar(300) DEFAULT NULL COMMENT '折扣率',
  `C_DETAILS` varchar(900) DEFAULT NULL COMMENT '详情'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='活动表';

-- ----------------------------
-- Table structure for t_car
-- ----------------------------
DROP TABLE IF EXISTS `t_car`;
CREATE TABLE `t_car` (
  `C_BH` char(32) NOT NULL COMMENT '编号',
  `N_NUM` int(11) DEFAULT NULL COMMENT '数量',
  `C_GOODS` char(32) DEFAULT NULL COMMENT '商品编号'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='购物车表';

-- ----------------------------
-- Table structure for t_collection
-- ----------------------------
DROP TABLE IF EXISTS `t_collection`;
CREATE TABLE `t_collection` (
  `C_BH` char(32) NOT NULL COMMENT '编号'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收藏表';

-- ----------------------------
-- Table structure for t_goods
-- ----------------------------
DROP TABLE IF EXISTS `t_goods`;
CREATE TABLE `t_goods` (
  `C_BH` char(32) NOT NULL COMMENT '编号',
  `C_NAME` varchar(300) DEFAULT NULL COMMENT '商品名',
  `C_PRICE` varchar(300) DEFAULT NULL COMMENT '价格',
  `C_IMAGE` varchar(300) DEFAULT NULL COMMENT '商品图片',
  `C_DESCRIBE` varchar(300) DEFAULT NULL COMMENT '商品描述'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品表';

-- ----------------------------
-- Table structure for t_message
-- ----------------------------
DROP TABLE IF EXISTS `t_message`;
CREATE TABLE `t_message` (
  `C_BH` char(32) NOT NULL COMMENT '编号',
  `C_MESSAGE` varchar(900) DEFAULT NULL COMMENT '留言内容',
  `D_ADDDATE` date DEFAULT NULL COMMENT '留言时间',
  `C_NAME` varchar(300) DEFAULT NULL COMMENT '留言人名称'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='留言表';

-- ----------------------------
-- Table structure for t_news
-- ----------------------------
DROP TABLE IF EXISTS `t_news`;
CREATE TABLE `t_news` (
  `C_BH` char(32) NOT NULL COMMENT '编号',
  `C_NEW` varchar(900) DEFAULT NULL COMMENT '新闻内容',
  `D_ADDDATE` date DEFAULT NULL COMMENT '发布时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='新闻表';

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order` (
  `C_BH` char(32) NOT NULL COMMENT '编号',
  `N_NUM` int(11) DEFAULT NULL COMMENT '数量',
  `C_GOODS` char(32) DEFAULT NULL COMMENT '商品编号',
  `C_PAY` varchar(300) DEFAULT NULL COMMENT '是否付款'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

-- ----------------------------
-- Table structure for t_right
-- ----------------------------
DROP TABLE IF EXISTS `t_right`;
CREATE TABLE `t_right` (
  `C_BH` char(32) NOT NULL COMMENT '编号',
  `C_NAME` varchar(300) DEFAULT NULL COMMENT '权限名'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限表';

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `C_BH` char(32) NOT NULL COMMENT '编号',
  `C_NAME` varchar(300) DEFAULT NULL COMMENT '角色名',
  `C_ZXTMC` varchar(300) DEFAULT NULL COMMENT '子系统名称'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Table structure for t_role_right
-- ----------------------------
DROP TABLE IF EXISTS `t_role_right`;
CREATE TABLE `t_role_right` (
  `C_BH` char(32) NOT NULL COMMENT '编号',
  `C_ROLE` char(32) DEFAULT NULL COMMENT '角色编号',
  `C_RIGHT` char(32) DEFAULT NULL COMMENT '权限编号'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色权限表';

-- ----------------------------
-- Table structure for t_tips
-- ----------------------------
DROP TABLE IF EXISTS `t_tips`;
CREATE TABLE `t_tips` (
  `C_BH` char(32) NOT NULL COMMENT '编号',
  `C_TIP` varchar(900) DEFAULT NULL COMMENT '内容',
  `C_TYPE` varchar(300) DEFAULT NULL COMMENT '类别'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='运动小贴士表';

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `C_BH` char(32) NOT NULL COMMENT '编号',
  `C_USERNAME` varchar(300) DEFAULT NULL COMMENT '用户名',
  `C_PASSWORD` varchar(300) DEFAULT NULL COMMENT '密码',
  `N_AGE` int(11) DEFAULT NULL COMMENT '年龄',
  `C_SEX` varchar(300) DEFAULT NULL COMMENT '性别',
  `C_TEL` varchar(300) DEFAULT NULL COMMENT '电话',
  `C_ADRESS` varchar(300) DEFAULT NULL COMMENT '地址',
  `C_EMAIL` varchar(300) DEFAULT NULL COMMENT '邮箱',
  `C_ORDER` char(32) DEFAULT NULL COMMENT '订单编号',
  `C_CAR` char(32) DEFAULT NULL COMMENT '购物车编号',
  `C_COLLECTRION` char(32) DEFAULT NULL COMMENT '收藏编号'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Table structure for t_user_role
-- ----------------------------
DROP TABLE IF EXISTS `t_user_role`;
CREATE TABLE `t_user_role` (
  `C_BH` char(32) NOT NULL COMMENT '编号',
  `C_USER` char(32) DEFAULT NULL COMMENT '用户编号',
  `C_ROLE` char(32) DEFAULT NULL COMMENT '角色编号'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色表';

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `c_bh` char(32) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`c_bh`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
