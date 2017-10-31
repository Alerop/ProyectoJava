/*Para crear la base de datos con el nombre que quieras añadir las siguientes filas sql.
En mi caso la base de datos se llama hdigicitas.

DROP DATABASE IF EXISTS nombre;

CREATE DATABASE nombre;
USE DATABASE nombre;

*/

CREATE TABLE Citas (
  id_fechaHora DATETIME NOT NULL,
  Paciente_id_paciente INTEGER(8) UNSIGNED NOT NULL,
  Profesional_id_profesional INTEGER(8) UNSIGNED NOT NULL,
  PRIMARY KEY(id_fechaHora),
  INDEX FK_Profesional(Profesional_id_profesional),
  INDEX FK_Paciente(Paciente_id_paciente)
);

CREATE TABLE Datos (
    /*Se creó un error automatico al no definir desde un inicio que se trataba de un varchar, antes era integer y en este caso el programa
    te lo pone como autoincremental porque asi cada numero es mas sencillo hacerlo id, con borrar AUTO_INCREMENT, el error queda 
    subsanado y la BD se puede importar sin problemas*/
  id_nif VARCHAR(9) NOT NULL AUTO_INCREMENT,/*Se requiere eliminar AUTO_INCREMENT para ser importada*/
  dat_nombre VARCHAR(20) NULL,
  dat_apellido VARCHAR(20) NULL,
  dat_telefono VARCHAR(9) NULL,
  dat_CP INTEGER(5) UNSIGNED NULL,
  dat_domicilio VARCHAR(60) NULL,
  dat_Ciudad VARCHAR(20) NULL,
  dat_Provincia VARCHAR(20) NULL,
  dat_País VARCHAR(20) NULL,
  dat_imagen_usuario VARCHAR(20) NULL,
  PRIMARY KEY(id_nif)
);

CREATE TABLE Diagnostico (
  id_diagnostico INTEGER(8) UNSIGNED NOT NULL AUTO_INCREMENT,
  Paciente_id_paciente INTEGER(8) UNSIGNED NOT NULL,
  Profesional_id_profesional INTEGER(8) UNSIGNED NOT NULL,
  dia_descripcion VARCHAR(60) NULL,
  dia_alergias VARCHAR(60) NULL,
  dia_cantidad INTEGER(3) UNSIGNED NULL,
  dia_prescripcion VARCHAR(60) NULL,
  dia_instrucciones VARCHAR(60) NULL,
  dia_duraccion INTEGER(3) UNSIGNED NULL,
  dia_precio INTEGER(3) UNSIGNED NULL,
  dia_observaciones VARCHAR(60) NULL,
  PRIMARY KEY(id_diagnostico),
  INDEX FK_Profesional(Profesional_id_profesional),
  INDEX FK_Paciente(Paciente_id_paciente)
);

CREATE TABLE Paciente (
  id_paciente INTEGER(8) UNSIGNED NOT NULL AUTO_INCREMENT,
  Usuarios_usu_nombre_usuario VARCHAR(20) NOT NULL,
  Profesional_id_profesional INTEGER(8) UNSIGNED NOT NULL,
  PRIMARY KEY(id_paciente),
  INDEX FK_Profesional(Profesional_id_profesional),
  INDEX FK_Usuarios(Usuarios_usu_nombre_usuario)
);

CREATE TABLE Profesional (
  id_profesional INTEGER(8) UNSIGNED NOT NULL AUTO_INCREMENT,
  Usuarios_usu_nombre_usuario VARCHAR(20) NOT NULL,
  pro_fechaContratacion DATE NULL,
  pro_posicion VARCHAR(20) NULL,
  PRIMARY KEY(id_profesional),
  INDEX FK_Usuarios(Usuarios_usu_nombre_usuario)
);

CREATE TABLE Usuarios (
  usu_nombre_usuario VARCHAR(20) NOT NULL,
  Datos_id_nif VARCHAR(9) NOT NULL,
  usu_contraseña VARCHAR(20) NULL,
  usu_tipo VARCHAR(20) NULL,
  PRIMARY KEY(usu_nombre_usuario),
  INDEX FK_Datos(Datos_id_nif)
);


