CREATE DATABASE fornecedor;
USE fornecedores;
CREATE TABLE fornecedor (
	codigo int NOT NULL AUTO_INCREMENT,
	nome varchar(255),
	email varchar(255),
	telefone varchar(255),
PRIMARY KEY (codigo)
);