SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `clubs` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `clubs` ;

-- -----------------------------------------------------
-- Table `clubs`.`student`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clubs`.`student` (
  `student_id` CHAR(8) NOT NULL,
  `student_name` VARCHAR(45) NOT NULL,
  `student_password` VARCHAR(45) NOT NULL,
  `sex` VARCHAR(45) NULL,
  `school` VARCHAR(45) NULL,
  `class` VARCHAR(45) NULL,
  `tel` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`student_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `clubs`.`activity`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clubs`.`activity` (
  `activity_id` INT NOT NULL AUTO_INCREMENT,
  `club_id` INT NOT NULL,
  `actname` VARCHAR(45) NOT NULL,
  `acttime` VARCHAR(45) NULL,
  `actdesc` VARCHAR(200) NULL,
  `actlocation` VARCHAR(45) NULL,
  PRIMARY KEY (`activity_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `clubs`.`joinact`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clubs`.`joinact` (
  `joinact_id` INT NOT NULL AUTO_INCREMENT,
  `student_id` CHAR(8) NOT NULL,
  `activity_id` INT NOT NULL,
  `joinstatus` VARCHAR(45) NULL,
  PRIMARY KEY (`joinact_id`),
  INDEX `sjoinact_idx` (`student_id` ASC),
  INDEX `ajoinact_idx` (`activity_id` ASC),
  CONSTRAINT `sjoinact`
    FOREIGN KEY (`student_id`)
    REFERENCES `clubs`.`student` (`student_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `ajoinact`
    FOREIGN KEY (`activity_id`)
    REFERENCES `clubs`.`activity` (`activity_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `clubs`.`club`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clubs`.`club` (
  `club_id` INT NOT NULL AUTO_INCREMENT,
  `club_name` VARCHAR(45) NOT NULL,
  `settime` VARCHAR(45) NULL,
  `clubdesc` VARCHAR(200) NULL,
  `clubimage` VARCHAR(200) NULL,
  `clubrule` VARCHAR(200) NULL,
  PRIMARY KEY (`club_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `clubs`.`check`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clubs`.`check` (
  `check_id` INT NOT NULL,
  `activity_id` INT NOT NULL,
  `club_id` INT NOT NULL,
  `checkstatus` VARCHAR(45) NULL,
  PRIMARY KEY (`check_id`),
  INDEX `acheck_idx` (`activity_id` ASC),
  INDEX `ccheck_idx` (`club_id` ASC),
  CONSTRAINT `acheck`
    FOREIGN KEY (`activity_id`)
    REFERENCES `clubs`.`activity` (`activity_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `ccheck`
    FOREIGN KEY (`club_id`)
    REFERENCES `clubs`.`club` (`club_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `clubs`.`admin`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clubs`.`admin` (
  `admin_id` INT NOT NULL AUTO_INCREMENT,
  `club_id` INT NOT NULL,
  `admin_password` VARCHAR(45) NOT NULL,
  `admin_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`admin_id`),
  INDEX `adclub_idx` (`club_id` ASC),
  CONSTRAINT `adclub`
    FOREIGN KEY (`club_id`)
    REFERENCES `clubs`.`club` (`club_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `clubs`.`apply`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clubs`.`apply` (
  `apply_id` INT NOT NULL AUTO_INCREMENT,
  `club_id` INT NOT NULL,
  `student_id` CHAR(8) NOT NULL,
  `applytime` VARCHAR(45) NULL,
  PRIMARY KEY (`apply_id`),
  INDEX `astudent_idx` (`student_id` ASC),
  INDEX `aclub_idx` (`club_id` ASC),
  CONSTRAINT `astudent`
    FOREIGN KEY (`student_id`)
    REFERENCES `clubs`.`student` (`student_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `aclub`
    FOREIGN KEY (`club_id`)
    REFERENCES `clubs`.`club` (`club_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
