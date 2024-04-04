DROP DATABASE ganaderia990;
CREATE DATABASE ganaderia990;
USE ganaderia990;

CREATE TABLE Animal(
	crotal int PRIMARY KEY,
    edad int,
    produccion int
);

INSERT INTO Animal VALUES 
(1, 8,300),
(2, 13, 170),
(3, 3, 0);

SELECT * FROM Animal;