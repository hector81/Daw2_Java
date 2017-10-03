CREATE DATABASE Barcos;
USE Barcos;

CREATE TABLE Veleros(
	matricula VARCHAR(20), 
    materialConstruccion VARCHAR(20), 
    descripcion VARCHAR(20),
    eslora INTEGER,
    manga INTEGER,
    puntal INTEGER,
    maxTripulacion INTEGER,
    año INTEGER,
    numMas INTEGER,
    claseVelero VARCHAR(20),
    PRIMARY KEY(matricula)
);

INSERT INTO Veleros (matricula,materialConstruccion,descripcion,eslora,manga,puntal,maxTripulacion,año,
numMas,claseVelero) 
VALUES ('8567','Aluminio','malu',20,3,5,5,1984,2,'primero');
INSERT INTO Veleros (matricula,materialConstruccion,descripcion,eslora,manga,puntal,maxTripulacion,año,
numMas,claseVelero) 
VALUES ('1403','Madera','isab',22,3,4,5,1985,3,'segundo');
INSERT INTO Veleros (matricula,materialConstruccion,descripcion,eslora,manga,puntal,maxTripulacion,año,
numMas,claseVelero) 
VALUES ('6576','Acero','oche',21,5,5,5,1981,3,'tercero');
INSERT INTO Veleros (matricula,materialConstruccion,descripcion,eslora,manga,puntal,maxTripulacion,año,
numMas,claseVelero) 
VALUES ('1111','hierro','nove',21,5,5,5,1981,3,'cuarto');