-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Dim 30 Janvier 2022 à 19:50
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `kay_ndougou`
--

-- --------------------------------------------------------

--
-- Structure de la table `adresse`
--

CREATE TABLE IF NOT EXISTS `adresse` (
  `idadr` int(11) NOT NULL,
  `ville` varchar(80) DEFAULT NULL,
  `numero` int(11) DEFAULT NULL,
  PRIMARY KEY (`idadr`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `adresse`
--

INSERT INTO `adresse` (`idadr`, `ville`, `numero`) VALUES
(1, 'saint_louis', 42),
(2, 'dakar', 62),
(3, 'dakar', 75),
(4, 'saint_louis', 44),
(5, 'saint_louis', 67),
(6, 'saint_louis', 68),
(7, 'saint_louis', 28),
(8, 'thies', 30),
(9, 'dakar', 47),
(10, 'dakar', 47);

-- --------------------------------------------------------

--
-- Structure de la table `article`
--

CREATE TABLE IF NOT EXISTS `article` (
  `idart` int(11) NOT NULL,
  `nomart` varchar(80) DEFAULT NULL,
  `typeart` varchar(80) DEFAULT NULL,
  `categorieart` varchar(30) DEFAULT NULL,
  `idpers` int(11) DEFAULT NULL,
  PRIMARY KEY (`idart`),
  KEY `fk_fil_idpers_article` (`idpers`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `article`
--

INSERT INTO `article` (`idart`, `nomart`, `typeart`, `categorieart`, `idpers`) VALUES
(1, 'guott', 'poisson', 'frais', 4),
(2, 'yaboy', 'poisson', 'frais', 5),
(3, 'kibaro', 'poisson', 'frais', 4),
(4, 'kéthiakh', 'poisson ', 'sec', 10),
(5, 'carrotte', 'legume', 'frais', 9),
(6, 'navet', 'legume', 'frais', 6),
(7, 'chou', 'legume', 'frais', 9),
(8, 'famille vert', 'legume', 'frais', 7);

-- --------------------------------------------------------

--
-- Structure de la table `caissier`
--

CREATE TABLE IF NOT EXISTS `caissier` (
  `idcais` int(11) NOT NULL,
  `idpers` int(11) DEFAULT NULL,
  PRIMARY KEY (`idcais`),
  KEY `FK_fil_idpers_caissier` (`idpers`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `caissier`
--

INSERT INTO `caissier` (`idcais`, `idpers`) VALUES
(1, 3),
(2, 7);

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE IF NOT EXISTS `client` (
  `idclient` int(11) NOT NULL,
  `idpers` int(11) DEFAULT NULL,
  PRIMARY KEY (`idclient`),
  KEY `FK_fil_idpers_client` (`idpers`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `client`
--

INSERT INTO `client` (`idclient`, `idpers`) VALUES
(1, 4),
(2, 5),
(3, 6),
(4, 8),
(5, 9),
(6, 10);

-- --------------------------------------------------------

--
-- Structure de la table `dg`
--

CREATE TABLE IF NOT EXISTS `dg` (
  `iddg` int(11) NOT NULL,
  `idpers` int(11) DEFAULT NULL,
  PRIMARY KEY (`iddg`),
  KEY `FK_fil_idpers_dg` (`idpers`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `dg`
--

INSERT INTO `dg` (`iddg`, `idpers`) VALUES
(1, 1);

-- --------------------------------------------------------

--
-- Structure de la table `facture`
--

CREATE TABLE IF NOT EXISTS `facture` (
  `idfact` int(11) NOT NULL,
  `nomart` varchar(80) NOT NULL,
  `prixart` int(11) NOT NULL,
  `nbrart` int(11) NOT NULL,
  `date` date NOT NULL,
  `idpers` int(11) DEFAULT NULL,
  PRIMARY KEY (`idfact`),
  KEY `fk_fil_idpers` (`idpers`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `facture`
--

INSERT INTO `facture` (`idfact`, `nomart`, `prixart`, `nbrart`, `date`, `idpers`) VALUES
(1, 'guott', 500, 5, '2021-12-14', 4),
(2, 'yaboy', 200, 10, '2021-12-17', 5),
(3, 'kéthiakh', 1300, 9, '2021-12-04', 6),
(4, 'carotte', 400, 23, '2021-12-14', 10),
(5, 'chou', 250, 12, '2021-12-04', 9),
(6, 'chou', 250, 16, '0000-00-00', 4);

-- --------------------------------------------------------

--
-- Structure de la table `fournisseur`
--

CREATE TABLE IF NOT EXISTS `fournisseur` (
  `idfour` int(11) NOT NULL,
  `idpers` int(11) DEFAULT NULL,
  PRIMARY KEY (`idfour`),
  KEY `FK_fil_idpers_fournisseur` (`idpers`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `fournisseur`
--

INSERT INTO `fournisseur` (`idfour`, `idpers`) VALUES
(1, 2);

-- --------------------------------------------------------

--
-- Structure de la table `legume`
--

CREATE TABLE IF NOT EXISTS `legume` (
  `idleg` int(11) NOT NULL,
  `idart` int(11) DEFAULT NULL,
  PRIMARY KEY (`idleg`),
  KEY `FK_fil_idart_legume` (`idart`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `legume`
--

INSERT INTO `legume` (`idleg`, `idart`) VALUES
(1, 5),
(2, 6),
(3, 7),
(4, 8);

-- --------------------------------------------------------

--
-- Structure de la table `personne`
--

CREATE TABLE IF NOT EXISTS `personne` (
  `idpers` int(11) NOT NULL,
  `nompers` varchar(80) DEFAULT NULL,
  `prenompers` varchar(80) DEFAULT NULL,
  `sexe` varchar(80) DEFAULT NULL,
  `idadr` int(11) DEFAULT NULL,
  PRIMARY KEY (`idpers`),
  KEY `FK_fil_idadr_personne` (`idadr`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `personne`
--

INSERT INTO `personne` (`idpers`, `nompers`, `prenompers`, `sexe`, `idadr`) VALUES
(1, 'guene', 'soda', 'feminin', 1),
(2, 'guene', 'bole', 'masculin', 1),
(3, 'guene', 'abdou', 'masculin', 2),
(4, 'guene', 'khady', 'feminin', 3),
(5, 'guene', 'oumou', 'feminin', 4),
(6, 'guene', 'amy', 'feminin', 5),
(7, 'guene', 'fatou', 'feminin', 6),
(8, 'guene', 'aida', 'feminin', 7),
(9, 'guene', 'modou', 'feminin', 8),
(10, 'guene', 'ousmane', 'masculin', 9);

-- --------------------------------------------------------

--
-- Structure de la table `poisson`
--

CREATE TABLE IF NOT EXISTS `poisson` (
  `idpois` int(11) NOT NULL,
  `idart` int(11) DEFAULT NULL,
  PRIMARY KEY (`idpois`),
  KEY `FK_fil_idart_poisson` (`idart`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `poisson`
--

INSERT INTO `poisson` (`idpois`, `idart`) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4);

-- --------------------------------------------------------

--
-- Structure de la table `stock`
--

CREATE TABLE IF NOT EXISTS `stock` (
  `idstock` int(11) NOT NULL,
  `nbreart_present` int(11) NOT NULL,
  `idpers` int(11) DEFAULT NULL,
  `idart` int(11) DEFAULT NULL,
  PRIMARY KEY (`idstock`),
  KEY `fk_fil_idpersstoc` (`idpers`),
  KEY `fk_fil_idart` (`idart`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `stock`
--

INSERT INTO `stock` (`idstock`, `nbreart_present`, `idpers`, `idart`) VALUES
(1, 23, 1, 1),
(2, 5, 1, 2),
(3, 6, 1, 3),
(4, 11, 1, 5),
(5, 3, 1, 6),
(6, 9, 1, 7);

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `article`
--
ALTER TABLE `article`
  ADD CONSTRAINT `fk_fil_idpers_article` FOREIGN KEY (`idpers`) REFERENCES `personne` (`idpers`);

--
-- Contraintes pour la table `caissier`
--
ALTER TABLE `caissier`
  ADD CONSTRAINT `FK_fil_idpers_caissier` FOREIGN KEY (`idpers`) REFERENCES `personne` (`idpers`);

--
-- Contraintes pour la table `client`
--
ALTER TABLE `client`
  ADD CONSTRAINT `FK_fil_idpers_client` FOREIGN KEY (`idpers`) REFERENCES `personne` (`idpers`);

--
-- Contraintes pour la table `dg`
--
ALTER TABLE `dg`
  ADD CONSTRAINT `FK_fil_idpers_dg` FOREIGN KEY (`idpers`) REFERENCES `personne` (`idpers`);

--
-- Contraintes pour la table `facture`
--
ALTER TABLE `facture`
  ADD CONSTRAINT `fk_fil_idpers` FOREIGN KEY (`idpers`) REFERENCES `personne` (`idpers`);

--
-- Contraintes pour la table `fournisseur`
--
ALTER TABLE `fournisseur`
  ADD CONSTRAINT `FK_fil_idpers_fournisseur` FOREIGN KEY (`idpers`) REFERENCES `personne` (`idpers`);

--
-- Contraintes pour la table `legume`
--
ALTER TABLE `legume`
  ADD CONSTRAINT `FK_fil_idart_legume` FOREIGN KEY (`idart`) REFERENCES `article` (`idart`);

--
-- Contraintes pour la table `personne`
--
ALTER TABLE `personne`
  ADD CONSTRAINT `FK_fil_idadr_personne` FOREIGN KEY (`idadr`) REFERENCES `adresse` (`idadr`);

--
-- Contraintes pour la table `poisson`
--
ALTER TABLE `poisson`
  ADD CONSTRAINT `FK_fil_idart_poisson` FOREIGN KEY (`idart`) REFERENCES `article` (`idart`);

--
-- Contraintes pour la table `stock`
--
ALTER TABLE `stock`
  ADD CONSTRAINT `fk_fil_idart` FOREIGN KEY (`idart`) REFERENCES `article` (`idart`),
  ADD CONSTRAINT `fk_fil_idpersstoc` FOREIGN KEY (`idpers`) REFERENCES `personne` (`idpers`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
