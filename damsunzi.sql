/*
Navicat MySQL Data Transfer

Source Server         : dongfangOA
Source Server Version : 50610
Source Host           : localhost:3306
Source Database       : damsunzi

Target Server Type    : MYSQL
Target Server Version : 50610
File Encoding         : 65001

Date: 2019-04-12 19:05:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_power
-- ----------------------------
DROP TABLE IF EXISTS `tb_power`;
CREATE TABLE `tb_power` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `state` varchar(200) DEFAULT NULL,
  `iconcls` varchar(100) DEFAULT NULL,
  `url` varchar(100) DEFAULT NULL,
  `parentid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=90 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_power
-- ----------------------------
INSERT INTO `tb_power` VALUES ('4', '客户订单管理', 'open', 'icon-add', 'power/lookOrder.do', '0');
INSERT INTO `tb_power` VALUES ('5', '订单审核', 'open', 'icon-remove', 'power/checkOrder.do', '4');
INSERT INTO `tb_power` VALUES ('6', '订单管理', 'open', 'icon-remove', 'power/insertOrder.do', '4');
INSERT INTO `tb_power` VALUES ('7', '配送管理', 'open', 'icon-add', 'power/lookOrder.do', '0');
INSERT INTO `tb_power` VALUES ('8', '配送操作', 'open', 'icon-remove', 'distribute/order.do', '7');
INSERT INTO `tb_power` VALUES ('11', '门店操作', 'open', 'icon_add', 'power/lookOrder.do', '0');
INSERT INTO `tb_power` VALUES ('14', '统计', 'open', 'icon-add', 'power/lookOrder.do', '0');
INSERT INTO `tb_power` VALUES ('15', '门店订单统计图', 'open', 'icon-remove', 'power/echarts.do', '14');
INSERT INTO `tb_power` VALUES ('16', '门店订单统计表', 'open', 'icon-remove', 'power/order.do', '14');
INSERT INTO `tb_power` VALUES ('21', '车辆管理', 'open', 'icon-add', 'power/lookOrder.do', '0');
INSERT INTO `tb_power` VALUES ('23', '查看车辆', 'open', 'icon-remove', 'car/carCheck.do', '21');
INSERT INTO `tb_power` VALUES ('26', '员工管理', 'open', 'icon-add', 'power/lookOrder.do', '0');
INSERT INTO `tb_power` VALUES ('38', '门店管理', 'open', 'icon-remove', 'power/storeTree.do', '11');
INSERT INTO `tb_power` VALUES ('39', '查看订单                                                                                                ', 'open', 'icon-remove', 'power/lookOrder.do', '4');
INSERT INTO `tb_power` VALUES ('40', '订单入库', 'open', 'icon-remove', 'power/inkuOrder.do', '4');
INSERT INTO `tb_power` VALUES ('41', '装配管理', 'open', 'icon-remove', 'autoOrder/usePageUtilOrderLisst.do', '4');
INSERT INTO `tb_power` VALUES ('42', '车辆调度', 'open', 'icon-remove', 'autoOrder/backCarOrder.do', '4');
INSERT INTO `tb_power` VALUES ('49', '出库确认', 'open', 'icon-remove', 'autoOrder/outCarList.do', '4');
INSERT INTO `tb_power` VALUES ('50', '收货确认', 'open', 'icon-remove', 'distribute/take.do', '4');
INSERT INTO `tb_power` VALUES ('51', '目的地站入库', 'open', 'icon-remove', 'power/overStore.do', '4');
INSERT INTO `tb_power` VALUES ('52', '添加异常单', 'open', 'icon-remove', 'bad/toAdd.do', '57');
INSERT INTO `tb_power` VALUES ('53', '待审核异常单', 'open', 'icon-remove', 'bad/toWaitCheck.do', '57');
INSERT INTO `tb_power` VALUES ('54', '待赔付异常单', 'open', 'icon-remove', 'bad/toWaitPay.do', '57');
INSERT INTO `tb_power` VALUES ('55', '待复核异常单', 'open', 'icon-remove', 'bad/toPass.do', '57');
INSERT INTO `tb_power` VALUES ('56', '未通过异常单', 'open', 'icon-remove', 'bad/toNoPass1.do', '57');
INSERT INTO `tb_power` VALUES ('57', '异常单管理', 'open', 'icon-add', 'power/lookOrder.do', '0');
INSERT INTO `tb_power` VALUES ('58', '查看所有异常单', 'open', 'icon-remove', 'bad/toShowAll.do', '57');
INSERT INTO `tb_power` VALUES ('61', '车辆维修管理', 'open', 'icon-add', 'power/lookOrder.do', '0');
INSERT INTO `tb_power` VALUES ('62', '待维修车辆信息', 'open', 'icon-remove', 'repair/toWaitCar.do', '61');
INSERT INTO `tb_power` VALUES ('63', '选择维修人员', 'open', 'icon-remove', 'repair/toCheckMan.do', '61');
INSERT INTO `tb_power` VALUES ('64', '确认维修结果', 'open', 'icon-remove', 'repair/toAffirm.do', '61');
INSERT INTO `tb_power` VALUES ('65', '司机核实', 'open', 'icon-remove', 'repair/toDriverVerify.do', '61');
INSERT INTO `tb_power` VALUES ('73', '菜单修改与删除', 'open', 'icon_romove', 'power/update1.do', '83');
INSERT INTO `tb_power` VALUES ('74', '维修记录查询', 'open', 'icon-remove', 'repair/toRecord.do', '61');
INSERT INTO `tb_power` VALUES ('81', '维修账单查询', 'open', 'icon-remove', 'repair/toCost.do', '61');
INSERT INTO `tb_power` VALUES ('82', '维修账单支付', 'open', 'icon-remove', 'repair/toPayCost.do', '61');
INSERT INTO `tb_power` VALUES ('83', '权限管理', 'open ', 'icon_add', 'power/lookOrder.do', '0');
INSERT INTO `tb_power` VALUES ('84', '权限菜单添加', 'open', 'icon_romove', 'power/add1.do', '83');
INSERT INTO `tb_power` VALUES ('85', '前台订单', 'open', 'icon_romove', 'power/forword.do', '4');
INSERT INTO `tb_power` VALUES ('87', '角色权限管理', 'open', 'icon_romove', 'emp/role.do', '26');
INSERT INTO `tb_power` VALUES ('88', '财务管理', 'open', 'icon_add', 'power/lookOrder.do', '0');
INSERT INTO `tb_power` VALUES ('89', '财务统计', 'open', 'icon_romove', 'power/finance.do', '88');

-- ----------------------------
-- Table structure for tree
-- ----------------------------
DROP TABLE IF EXISTS `tree`;
CREATE TABLE `tree` (
  `id` int(11) NOT NULL,
  `text` varchar(32) DEFAULT NULL,
  `pid` int(11) DEFAULT NULL,
  `url` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tree
-- ----------------------------
INSERT INTO `tree` VALUES ('1', '权限管理', '0', 'toEmp');
INSERT INTO `tree` VALUES ('2', '员工管理', '1', 'toEmp');
INSERT INTO `tree` VALUES ('3', '部门管理', '1', 'toEmp');
INSERT INTO `tree` VALUES ('4', '菜单管理', '1', 'toEmp');
INSERT INTO `tree` VALUES ('5', ' 角色管理', '1', 'toEmp');
INSERT INTO `tree` VALUES ('6', '订单管理', '0', 'toEmp');
INSERT INTO `tree` VALUES ('7', '完结订单', '6', 'toEmp');
INSERT INTO `tree` VALUES ('8', '异常订单', '6', 'toEmp');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  `phone_number` varchar(32) DEFAULT NULL,
  `email` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('2', 'damsunzi', '123', '21223', '123');
