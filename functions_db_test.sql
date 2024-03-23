--obtener departamentos
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


-- obtener provincias
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

-- obtener distritos

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


--obtener provincia por departamento codigo
CREATE OR REPLACE FUNCTION obtenerProvinciaPorCodigoDpto(
	departamento_code character varying(2)
)
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
    SELECT DISTINCT ON (ubi.codigo_provincia) * FROM "Admision".tc_ubigeo ubi 
WHERE ubi.codigo_departamento=departamento_code;
END;
$$ LANGUAGE plpgsql;


--obtener distrito por provincia codigo y departamento codigo
CREATE OR REPLACE FUNCTION obtenerProvinciaPorCodigoDptoAndCodigoProvincia(
	provincia_code character varying(2),
	departamento_code character varying(2)
)
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
    SELECT DISTINCT ON (ubi.codigo_distrito) * FROM "Admision".tc_ubigeo ubi 
WHERE ubi.codigo_provincia=provincia_code AND ubi.codigo_departamento=departamento_code;
END;
$$ LANGUAGE plpgsql;
