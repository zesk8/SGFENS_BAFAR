
CREATE TABLE GEOCERCAS_NOTIFICACIONES(
    ID_GEO_NOTIFICACION INT(10) NOT NULL AUTO_INCREMENT,
    ID_EMPRESA INT(10) COMMENT 'ID DE LA EMPRESA O SUCURSAL A LA CUAL SE LE ENVIARAN LAS NOTIFICACIONES',
    CORREOS TEXT COMMENT 'CADENA CON LOS CORREOS A LOS CUALES SE LE ENVIARAN LAS NOTIFICACIONES, SEPARADOS POR COMAS',
    ID_ESTATUS INT(1) DEFAULT 1 COMMENT '1 SI ESTAN ACTIVAS LAS NOTIFICACIONES POR CORREO, 2 SI ESTAN DESACTIVADAS',
    PRIMARY KEY (ID_GEO_NOTIFICACION)    
);