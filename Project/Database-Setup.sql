/*
	Rayman Jamal
    PROG 32758
    
    December 12, 2018
    
    This SQL page is to be used prior to running RJ-FinalProject.
*/

-- Create Database:

DROP DATABASE IF EXISTS dogs;
CREATE DATABASE dogs;
USE dogs;

-- Create Tables:

CREATE TABLE Dogs(

	ID int AUTO_INCREMENT PRIMARY KEY,

	DogName varchar(50) NOT NULL,

	OwnerName varchar(50) NOT NULL,

	DogBreed varchar(25) NOT NULL,

	DogGroup varchar(25) NOT NULL,

	DogGender varchar (6) NOT NULL,

	DogClassSpeciality varchar(10) NOT NULL,
    	
	OwnerEmail varchar(50) NOT NULL,
    	
	Friday boolean NOT NULL,
    	
	Saturday boolean NOT NULL,
    	
	Sunday boolean NOT NULL

);

ALTER TABLE dogs AUTO_INCREMENT = 100;

CREATE TABLE doghandlerlist(
	ID int PRIMARY KEY,
    doghandler varchar(25)
);

COMMIT;