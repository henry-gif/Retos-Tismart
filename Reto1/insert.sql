-- Insertar valores en la tabla Gerente
INSERT INTO Gerente (idGerente, descGerente, fechaRegistro) VALUES (1, 'Gerente 1', SYSDATE);
INSERT INTO Gerente (idGerente, descGerente, fechaRegistro) VALUES (2, 'Gerente 2', SYSDATE);

-- Insertar valores en la tabla Condicion
INSERT INTO Condicion (idCondicion, descCondicion, fechaRegistro) VALUES (1, 'Condicion 1', SYSDATE);
INSERT INTO Condicion (idCondicion, descCondicion, fechaRegistro) VALUES (2, 'Condicion 2', SYSDATE);

-- Insertar valores en la tabla Provincia
INSERT INTO Provincia (idProvincia, descProvincia, fechaRegistro) VALUES (1, 'Provincia 1', SYSDATE);
INSERT INTO Provincia (idProvincia, descProvincia, fechaRegistro) VALUES (2, 'Provincia 2', SYSDATE);

-- Insertar valores en la tabla Sede
INSERT INTO Sede (idSede, descSede, fechaRegistro) VALUES (1, 'Sede 1', SYSDATE);
INSERT INTO Sede (idSede, descSede, fechaRegistro) VALUES (2, 'Sede 2', SYSDATE);

-- Insertar valores en la tabla Distrito
INSERT INTO Distrito (idDistrito, descDistrito, idProvincia, fechaRegistro) VALUES (1, 'Distrito 1', 1, SYSDATE);
INSERT INTO Distrito (idDistrito, descDistrito, idProvincia, fechaRegistro) VALUES (2, 'Distrito 2', 2, SYSDATE);

-- Insertar valores en la tabla Hospital
INSERT INTO Hospital (idHospital, idDistrito, nombre, Antiguedad, Area, idSede, idGerente, idCondicion, FechaRegistro)
VALUES (1, 1, 'Hospital 1', 10, 100.5, 1, 1, 1, SYSDATE);

INSERT INTO Hospital (idHospital, idDistrito, nombre, Antiguedad, Area, idSede, idGerente, idCondicion, FechaRegistro)
VALUES (2, 2, 'Hospital 2', 5, 50.25, 2, 2, 2, SYSDATE);





select * from sede;
select * from distrito;
select * from hospital;
select * from provincia;
select * from condicion;
select * from gerente;