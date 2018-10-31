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
(1,'AMAN','MALE','MCA','AMANVER16@GMAIL.COM',8084528590),
(2,'RAVI','MALE','MCA','RAVI@GMAIL.COM',5451117878),
(3,'Manish','MALE','bCA','manish@GMAIL.COM',5463645456),
(4,'Arjun','MALE','bba','arjun@GMAIL.COM',9565631351),
(5,'Akash','MALE','mba','akash@GMAIL.COM',76543135841),
(6,'Anjali','FEMALE','mcom','anjali@GMAIL.COM',5465487646),
(7,'Sahara','FEMALE','bcom','sahara@GMAIL.COM',6864531753),
(8,'Rohit','MALE','bsc','rohit@GMAIL.COM',2424663565),
(9,'Virat','MALE','BCA','virat@GMAIL.COM',6876453216),
(10,'John','MALE','MCA','john@GMAIL.COM',7865413136),
(11,'Alice','feMALE','MCA','alice@GMAIL.COM',8461615531)

--VIEW DATA
SELECT *FROM STUDENT