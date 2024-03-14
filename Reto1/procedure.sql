CREATE  SEQUENCE hospital_seq START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE PACKAGE HospitalPackage AS
    PROCEDURE SP_HOSPITAL_REGISTRAR (
        nombre_hospital IN VARCHAR,
        antiguedad IN INTEGER,
        area IN DECIMAL,
        idDistrito IN INTEGER,
        idSede IN INTEGER,
        idGerente IN INTEGER,
        idCondicion IN INTEGER
    );

    PROCEDURE SP_HOSPITAL_ACTUALIZAR (
        idHospital IN INTEGER,
        nombre_hospital IN VARCHAR,
        antiguedad IN INTEGER,
        area IN DECIMAL,
        idDistrito IN INTEGER,
        idSede IN INTEGER,
        idGerente IN INTEGER,
        idCondicion IN INTEGER
    );

    PROCEDURE SP_HOSPITAL_ELIMINAR (
        idHospital IN INTEGER
    );

    PROCEDURE SP_HOSPITAL_LISTAR;

END HospitalPackage;
CREATE OR REPLACE PACKAGE BODY HospitalPackage AS

    PROCEDURE SP_HOSPITAL_REGISTRAR (
        nombre_hospital IN VARCHAR,
        antiguedad IN INTEGER,
        area IN DECIMAL,
        idDistrito IN INTEGER,
        idSede IN INTEGER,
        idGerente IN INTEGER,
        idCondicion IN INTEGER
    ) IS
        
        district_count INTEGER;
        sede_count INTEGER;
        gerente_count INTEGER;
        condicion_count INTEGER;

        CURSOR district_cursor IS
            SELECT COUNT(*) FROM Distrito WHERE idDistrito = idDistrito;

        CURSOR sede_cursor IS
            SELECT COUNT(*) FROM Sede WHERE idSede = idSede;

        CURSOR gerente_cursor IS
            SELECT COUNT(*) FROM Gerente WHERE idGerente = idGerente;

        CURSOR condicion_cursor IS
            SELECT COUNT(*) FROM Condicion WHERE idCondicion = idCondicion;
    BEGIN
        IF REGEXP_LIKE(nombre_hospital, '^[A-Za-z\sáéíóúÁÉÍÓÚäëïöüÄËÏÖÜñÑ,.?!¡¿]+$') = TRUE THEN
            DBMS_OUTPUT.PUT_LINE('El nombre del hospital no cumple con el patrón.');
        ELSE
            DBMS_OUTPUT.PUT_LINE('El nombre del hospital cumple con el patrón.');
        END IF;

        OPEN district_cursor;
        FETCH district_cursor INTO district_count;
        CLOSE district_cursor;

        IF district_count = 0 THEN
            RAISE_APPLICATION_ERROR(-20001, 'El distrito no existe');
        END IF;

        OPEN sede_cursor;
        FETCH sede_cursor INTO sede_count;
        CLOSE sede_cursor;

        IF sede_count = 0 THEN
            RAISE_APPLICATION_ERROR(-20002, 'La sede no existe');
        END IF;

        OPEN gerente_cursor;
        FETCH gerente_cursor INTO gerente_count;
        CLOSE gerente_cursor;

        IF gerente_count = 0 THEN
            RAISE_APPLICATION_ERROR(-20003, 'El gerente no existe');
        END IF;

        OPEN condicion_cursor;
        FETCH condicion_cursor INTO condicion_count;
        CLOSE condicion_cursor;

        IF condicion_count = 0 THEN
            RAISE_APPLICATION_ERROR(-20004, 'La condición no existe');
        END IF;

        INSERT INTO Hospital (idHospital, nombre, Antiguedad, Area, idSede, idGerente, idCondicion, idDistrito, FechaRegistro)
        VALUES (hospital_seq.NEXTVAL, nombre_hospital, antiguedad, area, idSede, idGerente, idCondicion, idDistrito, SYSDATE);

        COMMIT;
    EXCEPTION
        WHEN OTHERS THEN
            ROLLBACK;
            DBMS_OUTPUT.PUT_LINE('Ocurrió un error: ' || SQLERRM);
    END SP_HOSPITAL_REGISTRAR;

    PROCEDURE SP_HOSPITAL_ACTUALIZAR (
        idHospital IN INTEGER,
        nombre_hospital IN VARCHAR,
        antiguedad IN INTEGER,
        area IN DECIMAL,
        idDistrito IN INTEGER,
        idSede IN INTEGER,
        idGerente IN INTEGER,
        idCondicion IN INTEGER
    ) IS
    BEGIN
        IF REGEXP_LIKE(nombre_hospital, '^[A-Za-z\sáéíóúÁÉÍÓÚäëïöüÄËÏÖÜñÑ,.?!¡¿]+$') = TRUE THEN
            DBMS_OUTPUT.PUT_LINE('El nombre del hospital no cumple con el patrón.');
        ELSE
            DBMS_OUTPUT.PUT_LINE('El nombre del hospital cumple con el patrón.');
        END IF;

        UPDATE Hospital
        SET nombre = nombre_hospital, 
            Antiguedad = antiguedad, 
            Area = area, 
            idSede = idSede, 
            idGerente = idGerente, 
            idCondicion = idCondicion, 
            idDistrito = idDistrito, 
            FechaRegistro = SYSDATE
        WHERE idHospital = idHospital;

        COMMIT;
    EXCEPTION
        WHEN OTHERS THEN
            ROLLBACK;
            DBMS_OUTPUT.PUT_LINE('Ocurrió un error: ' || SQLERRM);
    END SP_HOSPITAL_ACTUALIZAR;

    PROCEDURE SP_HOSPITAL_ELIMINAR (
        idHospital IN INTEGER
    ) IS
        hospital_count INTEGER;

        CURSOR hospital_cursor IS
            SELECT COUNT(*) FROM Hospital WHERE idHospital = idHospital;
    BEGIN
        OPEN hospital_cursor;
        FETCH hospital_cursor INTO hospital_count;
        CLOSE hospital_cursor;

        IF hospital_count = 0 THEN
            RAISE_APPLICATION_ERROR(-20000, 'El hospital no existe');
        END IF;

        DELETE FROM Hospital 
        WHERE idHospital = idHospital;

        COMMIT;
    EXCEPTION
        WHEN OTHERS THEN
            ROLLBACK;
            DBMS_OUTPUT.PUT_LINE('Ocurrió un error: ' || SQLERRM);
    END SP_HOSPITAL_ELIMINAR;

    PROCEDURE SP_HOSPITAL_LISTAR IS
        CURSOR hospital_cursor IS
            SELECT H.* FROM Hospital H ORDER BY H.Antiguedad DESC;
        hospital_record Hospital%ROWTYPE;
    BEGIN
        OPEN hospital_cursor;
        LOOP
            FETCH hospital_cursor INTO hospital_record;
            EXIT WHEN hospital_cursor%NOTFOUND;
            DBMS_OUTPUT.PUT_LINE('ID: ' || hospital_record.idHospital || ', Nombre: ' || hospital_record.nombre || ', Antigüedad: ' || hospital_record.Antiguedad);
        END LOOP;
        CLOSE hospital_cursor;
    EXCEPTION
        WHEN OTHERS THEN
            DBMS_OUTPUT.PUT_LINE('Ocurrió un error: ' || SQLERRM);
    END SP_HOSPITAL_LISTAR;

END HospitalPackage;