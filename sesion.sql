--Catalogo de roles para el inicio de sesion
CREATE TABLE roles(
       id SERIAL PRIMARY KEY,
       nombre VARCHAR(10) NOT NULL
);

--Contiene informacion del usuario 
CREATE TABLE usuario(
       id SERIAL PRIMARY KEY,
       username VARCHAR(10) NOT NULL,
       password TEXT NOT NULL,
       rol INTEGER REFERENCES roles(id)
);
