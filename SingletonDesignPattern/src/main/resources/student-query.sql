-- Create a new database called 'StudentDb'
-- Connect to the 'master' database to run this snippet
USE master
GO
-- Create the new database if it does not exist already
IF NOT EXISTS (
    SELECT name
        FROM sys.databases
        WHERE name = N'StudentDb'
)
CREATE DATABASE StudentDb
GO



-- CREATE STUDENT TABLE
CREATE TABLE STUDENT 
(
    ID INT PRIMARY KEY NOT NULL,
    NAME VARCHAR(20),
    GENDER VARCHAR(10),
    COURSE VARCHAR(10),
    EMAIL VARCHAR(25),
    PHONE NUMERIC
)

--DROP TABLE
DROP TABLE STUDENT

--INSERT DATA
INSERT INTO STUDENT
VALUES
(1,'AMAN','MALE','MCA','AMANVER16@GMAIL.COM',8084528590)

--VIEW DATA
SELECT *FROM STUDENT