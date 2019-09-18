/*
 Navicat Premium Data Transfer

 Source Server         : localdb
 Source Server Type    : MySQL
 Source Server Version : 50723
 Source Host           : localhost:3306
 Source Schema         : ProyectoProgramacion

 Target Server Type    : MySQL
 Target Server Version : 50723
 File Encoding         : 65001

 Date: 20/11/2018 12:22:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for Clientes
-- ----------------------------
DROP TABLE IF EXISTS `Clientes`;
CREATE TABLE `Clientes` (
  `id` int(6) NOT NULL AUTO_INCREMENT,
  `nombreCliente` varchar(40) NOT NULL,
  `correo` text,
  `telefono` varchar(15) DEFAULT NULL,
  `direccion` text,
  `rfc` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of Clientes
-- ----------------------------
BEGIN;
INSERT INTO `Clientes` VALUES (1, 'jesús', 'jblanco@udem.edu', '328742382', 'Morones', 'JBC32198943');
COMMIT;

-- ----------------------------
-- Table structure for Productos
-- ----------------------------
DROP TABLE IF EXISTS `Productos`;
CREATE TABLE `Productos` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT,
  `nombreProducto` varchar(40) NOT NULL,
  `precioVenta` float(20,2) DEFAULT NULL,
  `precioCompra` float(20,2) DEFAULT NULL,
  `fechaCaducidad` date DEFAULT NULL,
  `fechaEntrada` date DEFAULT NULL,
  `fechaSalida` date DEFAULT NULL,
  `codigoBarras` int(15) DEFAULT NULL,
  `unidades` int(11) DEFAULT NULL,
  `idTipo` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of Productos
-- ----------------------------
BEGIN;
INSERT INTO `Productos` VALUES (1, 'celular', 5000.00, 4000.00, '2020-11-19', '2018-11-19', '2018-11-22', 1234, 40, 1);
INSERT INTO `Productos` VALUES (2, 'laptop', 7000.00, 5600.00, NULL, '2018-11-19', '2018-11-30', 32321, 56, 1);
COMMIT;

-- ----------------------------
-- Table structure for tipo_producto
-- ----------------------------
DROP TABLE IF EXISTS `tipo_producto`;
CREATE TABLE `tipo_producto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tipo_producto
-- ----------------------------
BEGIN;
INSERT INTO `tipo_producto` VALUES (1, 'Fisico');
INSERT INTO `tipo_producto` VALUES (2, 'Digital');
COMMIT;

-- ----------------------------
-- Table structure for tipo_usuario
-- ----------------------------
DROP TABLE IF EXISTS `tipo_usuario`;
CREATE TABLE `tipo_usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tipo_usuario
-- ----------------------------
BEGIN;
INSERT INTO `tipo_usuario` VALUES (1, 'Administrador');
INSERT INTO `tipo_usuario` VALUES (2, 'Usuario');
COMMIT;

-- ----------------------------
-- Table structure for usuarios
-- ----------------------------
DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `nombre` varchar(80) NOT NULL,
  `correo` varchar(45) NOT NULL,
  `last_session` datetime DEFAULT NULL,
  `idTipo` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of usuarios
-- ----------------------------
BEGIN;
INSERT INTO `usuarios` VALUES (1, 'admin', 'd033e22ae348aeb5660fc2140aec35850c4da997', 'admin', 'admin@mail.com', '2017-08-08 20:54:26', 1);
INSERT INTO `usuarios` VALUES (2, 'usuario', 'e6c6f0bd956e9147cc453a9708f4926f8e60e477', 'usuario', 'usuario@mail.com', '2017-08-08 20:58:31', 2);
INSERT INTO `usuarios` VALUES (5, 'itcAdmin', 'd05bd685f05a743a9c6ce5771f6120fc313f43c5', 'ItcMaster', 'ItcMaster@me.com', NULL, 1);
INSERT INTO `usuarios` VALUES (6, 'roberto', '9d500263e1a3252bc63faaca4e2bd9b72da439c3', 'roberto', 'roberto@u.com', NULL, 1);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
