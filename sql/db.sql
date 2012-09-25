SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`RegistredUser`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`RegistredUser` ;

CREATE  TABLE IF NOT EXISTS `mydb`.`RegistredUser` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `FIO` VARCHAR(45) NULL ,
  `telephone` VARCHAR(45) NULL ,
  `dateOfBirth` DATE NULL ,
  `dateOfRegistration` DATE NULL ,
  `secondMailAdress` VARCHAR(45) NULL ,
  PRIMARY KEY (`id`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Administrator`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Administrator` ;

CREATE  TABLE IF NOT EXISTS `mydb`.`Administrator` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `RegistredUser_id` INT NOT NULL ,
  PRIMARY KEY (`id`) ,
  INDEX `fk_Administrator_RegistredUser1_idx` (`RegistredUser_id` ASC) ,
  CONSTRAINT `fk_Administrator_RegistredUser1`
    FOREIGN KEY (`RegistredUser_id` )
    REFERENCES `mydb`.`RegistredUser` (`id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Letter`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Letter` ;

CREATE  TABLE IF NOT EXISTS `mydb`.`Letter` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `receiverEmail` VARCHAR(45) NULL ,
  `senderEmail` VARCHAR(45) NULL ,
  `content` LONGTEXT NULL ,
  `theme` VARCHAR(45) NULL ,
  `date&time` DATETIME NULL ,
  PRIMARY KEY (`id`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Letter_Sender_Receiver`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Letter_Sender_Receiver` ;

CREATE  TABLE IF NOT EXISTS `mydb`.`Letter_Sender_Receiver` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `isRead` BIT NULL DEFAULT 0 ,
  `idSender` INT NOT NULL ,
  `idLetter` INT NOT NULL ,
  `idReceiver` INT NOT NULL ,
  `isSenderTrash` BIT NULL DEFAULT 0 ,
  `isRecTrash` BIT NULL DEFAULT 0 ,
  PRIMARY KEY (`id`) ,
  INDEX `fk_Letter_Sender_Receiver_RegistredUser1_idx` (`idSender` ASC) ,
  INDEX `fk_Letter_Sender_Receiver_Letter1_idx` (`idLetter` ASC) ,
  INDEX `fk_Letter_Sender_Receiver_RegistredUser2_idx` (`idReceiver` ASC) ,
  CONSTRAINT `fk_Letter_Sender_Receiver_RegistredUser1`
    FOREIGN KEY (`idSender` )
    REFERENCES `mydb`.`RegistredUser` (`id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Letter_Sender_Receiver_Letter1`
    FOREIGN KEY (`idLetter` )
    REFERENCES `mydb`.`Letter` (`id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Letter_Sender_Receiver_RegistredUser2`
    FOREIGN KEY (`idReceiver` )
    REFERENCES `mydb`.`RegistredUser` (`id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Contact`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Contact` ;

CREATE  TABLE IF NOT EXISTS `mydb`.`Contact` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `idContactHolder` INT NOT NULL ,
  `idContactPerson` INT NOT NULL ,
  PRIMARY KEY (`id`) ,
  INDEX `fk_Contact_RegistredUser_idx` (`idContactHolder` ASC) ,
  INDEX `fk_Contact_RegistredUser1_idx` (`idContactPerson` ASC) ,
  CONSTRAINT `fk_Contact_RegistredUser`
    FOREIGN KEY (`idContactHolder` )
    REFERENCES `mydb`.`RegistredUser` (`id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Contact_RegistredUser1`
    FOREIGN KEY (`idContactPerson` )
    REFERENCES `mydb`.`RegistredUser` (`id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
