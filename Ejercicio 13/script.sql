CREATE TABLE equipos (
    id_equipo SERIAL PRIMARY KEY,
    nombre_equipo VARCHAR(100) NOT NULL,
    ip VARCHAR(45) NOT NULL
);

CREATE TABLE alertas_seguridad (
    id_alerta SERIAL PRIMARY KEY,
    id_equipo INTEGER NOT NULL,
    tipo_alerta VARCHAR(100) NOT NULL,
    severidad VARCHAR(20) NOT NULL,
    fecha_alerta DATE NOT NULL
);

INSERT INTO
    equipos (nombre_equipo, ip)
VALUES (
        'Servidor Web',
        '192.168.1.10'
    ),
    (
        'Base de Datos',
        '192.168.1.20'
    );

INSERT INTO
    alertas_seguridad (
        id_equipo,
        tipo_alerta,
        severidad,
        fecha_alerta
    )
VALUES (
        1,
        'Intento de acceso no autorizado',
        'Alta',
        '2026-06-20'
    ),
    (
        2,
        'Escaneo de puertos',
        'Media',
        '2026-06-21'
    );

SELECT e.nombre_equipo, e.ip, a.tipo_alerta, a.severidad, a.fecha_alerta
FROM
    alertas_seguridad a
    INNER JOIN equipos e ON a.id_equipo = e.id_equipo
WHERE
    a.severidad = 'Alta';