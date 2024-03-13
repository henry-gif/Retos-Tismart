
set SERVEROUTPUT on

--Registrar hospitales, con gerente, condici�n, sede y distrito.-------------------
CREATE OR REPLACE PROCEDURE SP_HOSPITAL_REGISTRAR(
   idGerente_param IN INTEGER,
    descGerente_param IN VARCHAR,
    fechaGerente_param IN DATE,
    idCondicion_param IN INTEGER,
    descCondicion_param IN VARCHAR,
    fechaCondicion_param IN DATE,
    idProvincia_param IN INTEGER,
    descProvincia_param IN VARCHAR,
    fechaProvincia_param IN DATE,
    idSede_param IN INTEGER,
    descSede_param IN VARCHAR2,
    fechaSede_param IN DATE,
    idDistrito_param IN INTEGER,
    descDistrito_param IN VARCHAR,
    fechaDistrito_param IN DATE,
    idHospital_param IN INTEGER,
    idDistritoHospital_param IN INTEGER,
    nombreHospital_param IN VARCHAR,
    antiguedadHospital_param IN INTEGER,
    areaHospital_param IN NUMBER,
    idSedeHospital_param IN INTEGER,
    idGerenteHospital_param IN INTEGER,
    idCondicionHospital_param IN INTEGER,
    fechaRegistroHospital_param IN DATE
) is

    vRowCount INTEGER;
BEGIN
    -- Insertar valores en la tabla Gerente
    INSERT INTO Gerente (idGerente, descGerente, fechaRegistro) VALUES (idGerente_param, descGerente_param, fechaGerente_param);
    vRowCount := SQL%ROWCOUNT;
    IF vRowCount = 0 THEN
        DBMS_OUTPUT.PUT_LINE('Error: No se pudo insertar en la tabla Gerente.');
        RETURN;
    END IF;

    -- Insertar valores en la tabla Condicion
    INSERT INTO Condicion (idCondicion, descCondicion, fechaRegistro) VALUES (idCondicion_param, descCondicion_param, fechaCondicion_param);
    vRowCount := SQL%ROWCOUNT;
    IF vRowCount = 0 THEN
        DBMS_OUTPUT.PUT_LINE('Error: No se pudo insertar en la tabla Condicion.');
        RETURN;
    END IF;

    -- Insertar valores en la tabla Provincia
    INSERT INTO Provincia (idProvincia, descProvincia, fechaRegistro) VALUES (idProvincia_param, descProvincia_param, fechaProvincia_param);
    vRowCount := SQL%ROWCOUNT;
    IF vRowCount = 0 THEN
        DBMS_OUTPUT.PUT_LINE('Error: No se pudo insertar en la tabla Provincia.');
        RETURN;
    END IF;

    -- Insertar valores en la tabla Sede
    INSERT INTO Sede (idSede, descSede, fechaRegistro) VALUES (idSede_param, descSede_param, fechaSede_param);
    vRowCount := SQL%ROWCOUNT;
    IF vRowCount = 0 THEN
        DBMS_OUTPUT.PUT_LINE('Error: No se pudo insertar en la tabla Sede.');
        RETURN;
    END IF;

    -- Insertar valores en la tabla Distrito
    INSERT INTO Distrito (idDistrito, descDistrito, idProvincia, fechaRegistro) VALUES (idDistrito_param, descDistrito_param, idProvincia_param, fechaDistrito_param);
    vRowCount := SQL%ROWCOUNT;
    IF vRowCount = 0 THEN
        DBMS_OUTPUT.PUT_LINE('Error: No se pudo registrar en la tabla Distrito.');
        RETURN;
    END IF;

    -- Insertar valores en la tabla Hospital
    INSERT INTO Hospital (idHospital, idDistrito, nombre, Antiguedad, Area, idSede, idGerente, idCondicion, FechaRegistro) 
    VALUES (idHospital_param, idDistritoHospital_param, nombreHospital_param, antiguedadHospital_param, areaHospital_param, idSedeHospital_param, idGerenteHospital_param, idCondicionHospital_param, fechaRegistroHospital_param);
    vRowCount := SQL%ROWCOUNT;
    IF vRowCount = 0 THEN
        DBMS_OUTPUT.PUT_LINE('Error: No se pudo registrar en la tabla Hospital.');
        
    END IF;

    -- Confirmar la transacción
    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Datos insertados correctamente en todas las tablas.');
EXCEPTION
    WHEN OTHERS THEN
        -- Si ocurre un error, hacer un rollback de la transacción
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error al insertar datos en las tablas.');
END SP_HOSPITAL_REGISTRAR;

-- b. SP_HOSPITAL_ACTUALIZAR

CREATE OR REPLACE PROCEDURE SP_HOSPITAL_ACTUALIZAR(
    idGerente_param IN INTEGER,
    descGerente_param IN VARCHAR,
    fechaGerente_param IN DATE,
    idCondicion_param IN INTEGER,
    descCondicion_param IN VARCHAR,
    fechaCondicion_param IN DATE,
    idProvincia_param IN INTEGER,
    descProvincia_param IN VARCHAR,
    fechaProvincia_param IN DATE,
    idSede_param IN INTEGER,
    descSede_param IN VARCHAR,
    fechaSede_param IN DATE,
    idDistrito_param IN INTEGER,
    descDistrito_param IN VARCHAR,
    fechaDistrito_param IN DATE,
    idHospital_param IN INTEGER,
    idDistritoHospital_param IN INTEGER,
    nombreHospital_param IN VARCHAR2,
    antiguedadHospital_param IN INTEGER,
    areaHospital_param IN NUMBER,
    idSedeHospital_param IN INTEGER,
    idGerenteHospital_param IN INTEGER,
    idCondicionHospital_param IN INTEGER,
    fechaRegistroHospital_param IN DATE,
    resultadoGerente OUT INTEGER,
    resultadoCondicion OUT INTEGER,
    resultadoProvincia OUT INTEGER,
    resultadoSede OUT INTEGER,
    resultadoDistrito OUT INTEGER,
    resultadoHospital OUT INTEGER
) IS
BEGIN
   
    IF idGerente_param IS NOT NULL THEN
        UPDATE Gerente
        SET descGerente = descGerente_param, fechaRegistro = fechaGerente_param
        WHERE idGerente = idGerente_param;
        resultadoGerente := SQL%ROWCOUNT;
    END IF;

 
    IF idCondicion_param IS NOT NULL THEN
        UPDATE Condicion
        SET descCondicion = descCondicion_param, fechaRegistro = fechaCondicion_param
        WHERE idCondicion = idCondicion_param;
        resultadoCondicion := SQL%ROWCOUNT;
    END IF;


    IF idProvincia_param IS NOT NULL THEN
        UPDATE Provincia
        SET descProvincia = descProvincia_param, fechaRegistro = fechaProvincia_param
        WHERE idProvincia = idProvincia_param;
        resultadoProvincia := SQL%ROWCOUNT;
    END IF;


    IF idSede_param IS NOT NULL THEN
        UPDATE Sede
        SET descSede = descSede_param, fechaRegistro = fechaSede_param
        WHERE idSede = idSede_param;
        resultadoSede := SQL%ROWCOUNT;
    END IF;

 
    IF idDistrito_param IS NOT NULL THEN
        UPDATE Distrito
        SET descDistrito = descDistrito_param, idProvincia = idProvincia_param, fechaRegistro = fechaDistrito_param
        WHERE idDistrito = idDistrito_param;
        resultadoDistrito := SQL%ROWCOUNT;
    END IF;

   
    IF idHospital_param IS NOT NULL THEN
        UPDATE Hospital
        SET idDistrito = idDistritoHospital_param, nombre = nombreHospital_param, Antiguedad = antiguedadHospital_param,
            Area = areaHospital_param, idSede = idSedeHospital_param, idGerente = idGerenteHospital_param,
            idCondicion = idCondicionHospital_param, FechaRegistro = fechaRegistroHospital_param
        WHERE idHospital = idHospital_param;
        resultadoHospital := SQL%ROWCOUNT;
    END IF;

   
    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Datos actualizados correctamente en todas las tablas.');
EXCEPTION
    WHEN OTHERS THEN
        -- Si ocurre un error, hacer un rollback de la transacción
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error al actualizar datos en las tablas.');
END SP_HOSPITAL_ACTUALIZAR;
----------------------------------C) ELIMINAR
CREATE OR REPLACE PROCEDURE SP_HOSPITAL_ELIMINAR(
idGerente_param IN INTEGER,
    idCondicion_param IN INTEGER,
    idProvincia_param IN INTEGER,
    idSede_param IN INTEGER,
    idDistrito_param IN INTEGER,
    idHospital_param IN INTEGER,
    resultadoGerente OUT INTEGER,
    resultadoCondicion OUT INTEGER,
    resultadoProvincia OUT INTEGER,
    resultadoSede OUT INTEGER,
    resultadoDistrito OUT INTEGER,
    resultadoHospital OUT INTEGER
) IS
BEGIN
    -- Eliminar registros en la tabla Gerente
    IF idGerente_param IS NOT NULL THEN
        DELETE FROM Gerente WHERE idGerente = idGerente_param;
        resultadoGerente := SQL%ROWCOUNT;
    END IF;

    -- Eliminar registros en la tabla Condicion
    IF idCondicion_param IS NOT NULL THEN
        DELETE FROM Condicion WHERE idCondicion = idCondicion_param;
        resultadoCondicion := SQL%ROWCOUNT;
    END IF;

    -- Eliminar registros en la tabla Provincia
    IF idProvincia_param IS NOT NULL THEN
        DELETE FROM Provincia WHERE idProvincia = idProvincia_param;
        resultadoProvincia := SQL%ROWCOUNT;
    END IF;

    -- Eliminar registros en la tabla Sede
    IF idSede_param IS NOT NULL THEN
        DELETE FROM Sede WHERE idSede = idSede_param;
        resultadoSede := SQL%ROWCOUNT;
    END IF;

    -- Eliminar registros en la tabla Distrito
    IF idDistrito_param IS NOT NULL THEN
        DELETE FROM Distrito WHERE idDistrito = idDistrito_param;
        resultadoDistrito := SQL%ROWCOUNT;
    END IF;

    -- Eliminar registros en la tabla Hospital
    IF idHospital_param IS NOT NULL THEN
        DELETE FROM Hospital WHERE idHospital = idHospital_param;
        resultadoHospital := SQL%ROWCOUNT;
    END IF;

    -- Confirmar la transacción
    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Datos eliminados correctamente en todas las tablas.');
EXCEPTION
    WHEN OTHERS THEN
        -- Si ocurre un error, hacer un rollback de la transacción
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error al eliminar datos en las tablas.');

END SP_HOSPITAL_ELIMINAR;
----------------------------c)listar hospitales
CREATE OR REPLACE PROCEDURE SP_LISTAR_HOSPITALES IS
    -- Declaración de cursores
    CURSOR curGerente IS SELECT * FROM Gerente;
    CURSOR curCondicion IS SELECT * FROM Condicion;
    CURSOR curProvincia IS SELECT * FROM Provincia;
    CURSOR curSede IS SELECT * FROM Sede;
    CURSOR curDistrito IS SELECT * FROM Distrito;
    CURSOR curHospital IS SELECT * FROM Hospital;
BEGIN
    BEGIN
        -- Listar datos de la tabla Gerente
        FOR gerente_row IN curGerente LOOP
            DBMS_OUTPUT.PUT_LINE('Gerente - ID: ' || gerente_row.idGerente || ', Descripción: ' || gerente_row.descGerente || ', Fecha de Registro: ' || TO_CHAR(gerente_row.fechaRegistro, 'DD-MM-YYYY'));
        END LOOP;

        -- Listar datos de la tabla Condicion
        FOR condicion_row IN curCondicion LOOP
            DBMS_OUTPUT.PUT_LINE('Condición - ID: ' || condicion_row.idCondicion || ', Descripción: ' || condicion_row.descCondicion || ', Fecha de Registro: ' || TO_CHAR(condicion_row.fechaRegistro, 'DD-MM-YYYY'));
        END LOOP;

        -- Listar datos de la tabla Provincia
        FOR provincia_row IN curProvincia LOOP
            DBMS_OUTPUT.PUT_LINE('Provincia - ID: ' || provincia_row.idProvincia || ', Descripción: ' || provincia_row.descProvincia || ', Fecha de Registro: ' || TO_CHAR(provincia_row.fechaRegistro, 'DD-MM-YYYY'));
        END LOOP;

        -- Listar datos de la tabla Sede
        FOR sede_row IN curSede LOOP
            DBMS_OUTPUT.PUT_LINE('Sede - ID: ' || sede_row.idSede || ', Descripción: ' || sede_row.descSede || ', Fecha de Registro: ' || TO_CHAR(sede_row.fechaRegistro, 'DD-MM-YYYY'));
        END LOOP;

        -- Listar datos de la tabla Distrito
        FOR distrito_row IN curDistrito LOOP
            DBMS_OUTPUT.PUT_LINE('Distrito - ID: ' || distrito_row.idDistrito || ', Descripción: ' || distrito_row.descDistrito || ', ID Provincia: ' || distrito_row.idProvincia || ', Fecha de Registro: ' || TO_CHAR(distrito_row.fechaRegistro, 'DD-MM-YYYY'));
        END LOOP;

        -- Listar datos de la tabla Hospital
        FOR hospital_row IN curHospital LOOP
            DBMS_OUTPUT.PUT_LINE('Hospital - ID: ' || hospital_row.idHospital || ', ID Distrito: ' || hospital_row.idDistrito || ', Nombre: ' || hospital_row.nombre || ', Antigüedad: ' || hospital_row.Antiguedad || ', Área: ' || hospital_row.Area || ', ID Sede: ' || hospital_row.idSede || ', ID Gerente: ' || hospital_row.idGerente || ', ID Condición: ' || hospital_row.idCondicion || ', Fecha de Registro: ' || TO_CHAR(hospital_row.FechaRegistro, 'DD-MM-YYYY'));
        END LOOP;

    EXCEPTION
        WHEN OTHERS THEN
            DBMS_OUTPUT.PUT_LINE('Error al listar datos de las tablas: ' || SQLERRM);
    END;
END SP_LISTAR_HOSPITALES;


 
