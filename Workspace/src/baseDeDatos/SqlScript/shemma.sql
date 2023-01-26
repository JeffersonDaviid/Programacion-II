-- Active: 1674251157284@@127.0.0.1@3306
.version 
.database
.show
.tables


-- ELIMINAR TABLA, no hacer 
DROP TABLE PERSONA;

CREATE TABLE MascotaTipo (
    idMascotaTipo   INTEGER PRIMARY KEY AUTOINCREMENT
    ,Nombre          VARCHAR(10) NOT NULL
    ,Estado          VARCHAR(1) NOT NULL DEFAULT('A')
);
-- MOSTRAR LOS DATOS DE LAS TABLAS
SELECT * FROM MascotaTipo;
DROP TABLE MascotaTipo;

-- INSERTAR DATOS EN LA TABLA
-- Linea para enviar todos los datos
INSERT INTO MascotaTipo ( idMascotaTipo , Nombre , Estado ) VALUES ( 1 , "Perros" , "A" );

-- Si tiene el AUTOINCREMENTADO podemos saltarlo, y la BD lo coloca automaticamente
INSERT INTO MascotaTipo ( Nombre , Estado ) VALUES ( "Gatos" , "A" );

-- Si tiene un dato DEFAULT entonces podemos saltar, y la BD lo coloca automaticamente
INSERT INTO MascotaTipo ( Nombre ) VALUES ( "Peces" );
INSERT INTO MascotaTipo ( Nombre ) VALUES ( "Cuyes" );
INSERT INTO MascotaTipo ( Nombre ) VALUES ( "León" );



CREATE TABLE Sexo (
    IdSexo          INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT
    ,Nombre          VARCHAR (100)
    ,Estado          VARCHAR(1) NOT NULL DEFAULT('A')
);
-- MOSTRAR LOS DATOS DE LA TABLA
SELECT * FROM Sexo;

INSERT INTO Sexo ( Nombre ) VALUES  ( "HEMBRA" );
INSERT INTO Sexo ( Nombre ) VALUES  ( "MACHO" );
INSERT INTO Sexo ( Nombre ) VALUES  ( "SIN SEXO" );

CREATE TABLE Mascota (
    idMascota       INTEGER PRIMARY KEY AUTOINCREMENT
    ,idMascotaTipo   INTEGER NOT NULL
    ,idSexo          INTEGER NOT NULL
    ,Nombre          VARCHAR (100) NOT NULL
    ,Edad            INTEGER NOT NULL
    ,Estado          VARCHAR(1) NOT NULL DEFAULT('A')
);
-- MOSTRAR LOS DATOS DE LA TABLA
SELECT * FROM Mascota;
DROP TABLE Mascota;


INSERT INTO Mascota ( idMascota , idMascotaTipo, idSexo , Nombre , Edad ) VALUES ( 1 , 1 , 2 , "Jack", 2);





-- TABLA CON REFERENCIA

CREATE TABLE Mascota1 (
    idMascota       INTEGER PRIMARY KEY AUTOINCREMENT
    ,idMascotaTipo   INTEGER NOT NULL
    ,idSexo          INTEGER NOT NULL REFERENCES Sexo
    ,Nombre          VARCHAR (100) NOT NULL
    ,Edad            INTEGER NOT NULL
    ,Estado          VARCHAR(1) NOT NULL DEFAULT('A'),
    FOREIGN KEY (idMascotaTipo) REFERENCES MascotaTipo(idMascotaTipo)
);
-- MOSTRAR LOS DATOS DE LA TABLA
SELECT * FROM Mascota1;

INSERT INTO Mascota1 ( idMascota , idMascotaTipo, idSexo , Nombre , Edad ) VALUES ( 1 , 1 , 2 , "Jack", 2);
INSERT INTO Mascota1 ( idMascota , idMascotaTipo, idSexo , Nombre , Edad ) VALUES ( 2 , 51 , 1 , "Emilio", 2);
INSERT INTO Mascota1 ( idMascotaTipo, idSexo , Nombre , Edad ) VALUES ( 51 , 7 , "Amigo", 4 );
