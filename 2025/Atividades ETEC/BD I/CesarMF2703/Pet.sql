-- criação do BD
create database ExercBD01

-- usar o BD
use ExercBD01

-- criação da tabela
create table pet
(
	NumRegistro int IDENTITY, --Número de Registro
	Nome varchar(80),
	Especie varchar(25),
	Raca varchar(30),
	Cor varchar(40),
	Nascimento datetime,
	Sexo varchar(9),
);

--Analizar a tabela pet
Select * from pet

--Inserir informações na tabela pet
INSERT INTO pet (Nome, Especie, Raca, Cor, Nascimento, Sexo)
VALUES ('Thor', 'cachorro', 'pinscher', 'preto', '04/12/2020', 'masculino');

INSERT INTO pet (Nome, Especie, Raca, Cor, Nascimento, Sexo)
VALUES ('Cupcake', 'cachorro', 'pitbull', 'marrom', '15/01/2018', 'feminino');

INSERT INTO pet (Nome, Especie, Raca, Cor, Nascimento, Sexo)
VALUES ('Melissa', 'gato', 'mestiço', 'branco e laranja', '11/06/2010', 'feminino');

INSERT INTO pet (Nome, Especie, Cor, Nascimento, Sexo)
VALUES ('Paco', 'papagaio', 'verde e vermelho', '29/02/2000', 'masculino');

INSERT INTO pet (Nome, Especie, Raca, Cor, Nascimento, Sexo)
VALUES ('Princesa', 'cachorro', 'pitbull', 'branco', '12/08/2022', 'feminino');

INSERT INTO pet (Nome, Especie, Cor, Nascimento, Sexo)
VALUES ('Linda', 'coelho', 'marrom', '09/09/2023', 'feminino');

INSERT INTO pet (Nome, Especie, Raca, Cor, Nascimento, Sexo)
VALUES ('João', 'gato', 'Bobtail Americano', 'laranja', '14/01/2009', 'masculino');

INSERT INTO pet (Nome, Especie, Cor, Nascimento, Sexo)
VALUES ('Milton', 'jabuti', 'verde e marrom', '27/07/1942', 'masculino');

INSERT INTO pet (Nome, Especie, Raca, Cor, Nascimento, Sexo)
VALUES ('Floppa', 'gato', 'caracal', 'acinzentada', '21/12/2017', 'masculino');

INSERT INTO pet (Nome, Especie, Raca, Cor, Nascimento, Sexo)
VALUES ('Bingus', 'gato', 'Sphynx', 'rosado', '30/12/2021', 'masculino');