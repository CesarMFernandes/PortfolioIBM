-- criação do BD
create database ExercBD02

-- usar o BD
use ExercBD02

-- criação de tabelas
--Departamento
create table Departamento (
CodFunc int, -- Código do Funcionário
NomeDepto varchar(50) -- Nome do Departamento
);

--Funcionario
create table Funcionario (
CodFunc int IDENTITY, -- Código do Funcionário
NomeFunc varchar(50), -- Nome de Funcionário
CodDepto int, -- Código do Departamento
Ramal int NULL, 
Salario float,
DataAdmissao datetime, -- Data de Admissão
DataCadastro datetime, -- Data de Cadastro
Sexo char(1)
);

Select * from Departamento
Select * from Funcionario

INSERT INTO Departamento (CodFunc, NomeDepto)
VALUES (101, 'Departamento de Tutoria');

INSERT INTO Departamento (CodFunc, NomeDepto)
VALUES (102, 'Departamento de Segurança');

INSERT INTO Departamento (CodFunc, NomeDepto)
VALUES (103, 'Departamento de Limpeza');

INSERT INTO Departamento (CodFunc, NomeDepto)
VALUES (104, 'Departamento de Diretoria');

INSERT INTO Departamento (CodFunc, NomeDepto)
VALUES (105, 'Departamento de Orientação');

INSERT INTO Funcionario (NomeFunc, CodDepto, Salario, DataAdmissao, DataCadastro, Sexo)
VALUES ('Tânia Cavalcanti', 101, 3000.00, 26/03/2007, 11/12/2015, 'f');

INSERT INTO Funcionario (NomeFunc, CodDepto, Salario, DataAdmissao, DataCadastro, Sexo)
VALUES ('Pedro Barros', 101, 3000.00, 07/07/2019, 07/07/2019, 'm');

INSERT INTO Funcionario (NomeFunc, CodDepto, Salario, DataAdmissao, DataCadastro, Sexo)
VALUES ('Victor Sousa', 101, 3000.00, 12/01/2018, 12/01/2018, 'm');

INSERT INTO Funcionario (NomeFunc, CodDepto, Salario, DataAdmissao, DataCadastro, Sexo)
VALUES ('Beatriz Martins', 101, 3000.00, 04/11/2012, 11/12/2015, 'f');

INSERT INTO Funcionario (NomeFunc, CodDepto, Salario, DataAdmissao, DataCadastro, Sexo)
VALUES ('Luiz Ribeiro', 102, 2000.00, 30/04/2023, 30/04/2023, 'm');

INSERT INTO Funcionario (NomeFunc, CodDepto, Salario, DataAdmissao, DataCadastro, Sexo)
VALUES ('Davi Araujo', 102, 2000.00, 17/03/2024, 17/03/2024, 'm');

INSERT INTO Funcionario (NomeFunc, CodDepto, Salario, DataAdmissao, DataCadastro, Sexo)
VALUES ('Leonor Dias', 103, 1800.00, 22/05/2010, 11/12/2015, 'f');

INSERT INTO Funcionario (NomeFunc, CodDepto, Salario, DataAdmissao, DataCadastro, Sexo)
VALUES ('Júlia Cardoso', 103, 1800.00, 03/02/2013, 11/12/2015, 'f');

INSERT INTO Funcionario (NomeFunc, CodDepto, Salario, DataAdmissao, DataCadastro, Sexo)
VALUES ('Anna Barbosa', 104, 6000.00, 15/05/1998, 11/12/2015, 'f');

INSERT INTO Funcionario (NomeFunc, CodDepto, Salario, DataAdmissao, DataCadastro, Sexo)
VALUES ('Clayton Lima', 105, 3500.00, 27/10/2024, 27/10/2024, 'm');
