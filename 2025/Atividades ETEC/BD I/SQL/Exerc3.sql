-- cria��o do BD
create database ExercBD03

-- usar o BD
use ExercBD03

-- Armazena as informa��es dos produtos
create table Produto (
	Codigo INT PRIMARY KEY IDENTITY, -- C�digo de registro da tabela
	CodBarras INT UNIQUE, -- C�digo de Barras
	Preco FLOAT NOT NULL, -- Pre�o do produto
	Altura FLOAT, -- Altura da folha
	Largura FLOAT, -- Largura da folha
	Expessura FLOAT -- Expessura da folha
);

-- Armazena as informa��es dos funcion�rios
create table Funcionarios (
	Nome VARCHAR(50) NOT NULL, -- Nome completo do funcion�rio
	Registro INT PRIMARY KEY, -- C�digo de registro dos funcion�rios
	Salario FLOAT, -- Sal�rio do funcion�rio
	DataNasc DATE NOT NULL, -- Data de Nascimento
	Horas INT, -- Horas semanais de trabalho
	CPF VARCHAR(14) NOT NULL UNIQUE, -- CPF do funcion�rio
	RG VARCHAR(14) NOT NULL UNIQUE, -- RG do funcion�rio
	CNPJ VARCHAR(18) NOT NULL UNIQUE, -- CNPJ do funcion�rio
	Cargo VARCHAR(20) NOT NULL, -- Cargo do funcion�rio
	Genero CHAR(1) NOT NULL -- M- Masculino / F- Feminino / O- Outro
);

-- Armazena as informa��es dos fornecedores
create table Fornecedor (
	NomFornecedor VARCHAR(50) NOT NULL, -- Nome da entidade fornecedora
	Codigo INT PRIMARY KEY IDENTITY, -- C�digo de registro da tabela
	Preco FLOAT NOT NULL, -- Pre�o por metro quadrado
	Endereco VARCHAR(40) NOT NULL, -- Endere�o do fornecedor
	CEP VARCHAR(9) NOT NULL, -- CEP do fornecedor
	CNPJ VARCHAR(18) NOT NULL UNIQUE -- CNPJ do fornecedor
);

-- Armazena as informa��es dos departamentos da empresa
create table Departamento (
	NomDepart VARCHAR(30) NOT NULL UNIQUE, -- Nome do departamento
	Codigo INT PRIMARY KEY IDENTITY, -- C�digo de registro da tabela
	Localizacao VARCHAR(50) NOT NULL, -- Localiza��o/Endere�o do departamento
	Descricao VARCHAR(50), -- Descri��o e funcionalidade do departamento
	NumFunc INT NOT NULL, -- N�mero de funcion�rios no departamento
);
