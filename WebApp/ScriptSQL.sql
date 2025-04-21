CREATE DATABASE AppWeb

USE AppWeb

CREATE TABLE UsuariosId (
IdColumna INT PRIMARY KEY IDENTITY(1, 1),
Usuarios VARCHAR(30),
IdUsuario VARCHAR(30)
)

SELECT * FROM UsuariosId