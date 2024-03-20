CREATE OR REPLACE FUNCTION obtener_departamentos()
RETURNS TABLE (
	descripcion_departamento character varying(200),
	descripcion_provincia character varying(200),
    descripcion_distrito character varying(200),
	fl_estado bit(1),
    codigo_ubigeo character(6),
    codigo_departamento character varying(2),
    codigo_provincia character varying(2),
    codigo_distrito character varying(2)
) AS $$
BEGIN
    RETURN QUERY 
    SELECT DISTINCT ON (ubi.codigo_departamento) 
       ubi.*
FROM "Admision".tc_ubigeo ubi;
END;
$$ LANGUAGE plpgsql;


select * from obtener_departamentos()
--select * from "Admision".tc_ubigeo
CREATE OR REPLACE FUNCTION obtener_provincias()
RETURNS TABLE (
	descripcion_departamento character varying(200),
	descripcion_provincia character varying(200),
    descripcion_distrito character varying(200),
	fl_estado bit(1),
    codigo_ubigeo character(6),
    codigo_departamento character varying(2),
    codigo_provincia character varying(2),
    codigo_distrito character varying(2)
) AS $$
BEGIN
    RETURN QUERY 
    SELECT DISTINCT ON (ubi.codigo_provincia) 
       ubi.*
FROM "Admision".tc_ubigeo ubi;
END;
$$ LANGUAGE plpgsql;

select * from obtener_provincias();

CREATE OR REPLACE FUNCTION obtener_distritos()
RETURNS TABLE (
	descripcion_departamento character varying(200),
	descripcion_provincia character varying(200),
    descripcion_distrito character varying(200),
	fl_estado bit(1),
    codigo_ubigeo character(6),
    codigo_departamento character varying(2),
    codigo_provincia character varying(2),
    codigo_distrito character varying(2)
) AS $$
BEGIN
    RETURN QUERY 
    SELECT DISTINCT ON (ubi.codigo_distrito) 
       ubi.*
FROM "Admision".tc_ubigeo ubi;
END;
$$ LANGUAGE plpgsql;

select * from obtener_distritos();
