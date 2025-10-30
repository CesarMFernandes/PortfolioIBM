-- criação do BD
create database ExercBD03

-- usar o BD
use ExercBD03

-- Armazena as informações dos produtos
create table Produto (
	Codigo INT PRIMARY KEY IDENTITY, -- Código de registro da tabela
	CodBarras INT UNIQUE, -- Código de Barras
	Preco FLOAT NOT NULL, -- Preço do produto
	Altura FLOAT, -- Altura da folha
	Largura FLOAT, -- Largura da folha
	Expessura FLOAT -- Expessura da folha
);

-- Armazena as informações dos funcionários
create table Funcionarios (
	Nome VARCHAR(50) NOT NULL, -- Nome completo do funcionário
	Registro INT PRIMARY KEY, -- Código de registro dos funcionários
	Salario FLOAT, -- Salário do funcionário
	DataNasc DATE NOT NULL, -- Data de Nascimento
	Horas INT, -- Horas semanais de trabalho
	CPF VARCHAR(14) NOT NULL UNIQUE, -- CPF do funcionário
	RG VARCHAR(14) NOT NULL UNIQUE, -- RG do funcionário
	CNPJ VARCHAR(18) NOT NULL UNIQUE, -- CNPJ do funcionário
	Cargo VARCHAR(20) NOT NULL, -- Cargo do funcionário
	Genero CHAR(1) NOT NULL -- M- Masculino / F- Feminino / O- Outro
);

-- Armazena as informações dos fornecedores
create table Fornecedor (
	NomFornecedor VARCHAR(50) NOT NULL, -- Nome da entidade fornecedora
	Codigo INT PRIMARY KEY IDENTITY, -- Código de registro da tabela
	Preco FLOAT NOT NULL, -- Preço por metro quadrado
	Endereco VARCHAR(40) NOT NULL, -- Endereço do fornecedor
	CEP VARCHAR(9) NOT NULL, -- CEP do fornecedor
	CNPJ VARCHAR(18) NOT NULL UNIQUE -- CNPJ do fornecedor
);

-- Armazena as informações dos departamentos da empresa
create table Departamento (
	NomDepart VARCHAR(30) NOT NULL UNIQUE, -- Nome do departamento
	Codigo INT PRIMARY KEY IDENTITY, -- Código de registro da tabela
	Localizacao VARCHAR(50) NOT NULL, -- Localização/Endereço do departamento
	Descricao VARCHAR(50), -- Descrição e funcionalidade do departamento
	NumFunc INT NOT NULL, -- Número de funcionários no departamento
);
