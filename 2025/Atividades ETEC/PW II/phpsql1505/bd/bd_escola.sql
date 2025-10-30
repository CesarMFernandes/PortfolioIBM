-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 22/10/2025 às 18:46
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `bd_escola`
--
CREATE DATABASE IF NOT EXISTS `bd_escola` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `bd_escola`;

-- --------------------------------------------------------

--
-- Estrutura para tabela `alunos`
--

CREATE TABLE `alunos` (
  `matricula` varchar(5) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `endereco` varchar(50) NOT NULL,
  `cidade` varchar(30) NOT NULL,
  `codcurso` char(2) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `alunos`
--

INSERT INTO `alunos` (`matricula`, `nome`, `endereco`, `cidade`, `codcurso`) VALUES
('10001', 'Mark Grayson', '900 Prince Crossing Rd, 60185', 'Chicago', '03'),
('10002', 'Fernanda Araujo', 'Rua Vittório Giannini, 150', 'São Paulo', '01'),
('10003', 'Leonor Almeida', 'Rua da Praia de Francelos, 778', 'São Paulo', '04'),
('10004', 'Ágatha Alves', 'Travessa Curvelo, 67', 'Santo André', '01'),
('10005', 'Nicole Araujo', 'Rua Doutor Theodoro Rosa de Siqueira, 451', 'Capão Bonito', '04'),
('10006', 'Matheus Costa', 'Rua Antônia Cáceres Munhoz, 1582', 'Franca', '04'),
('10007', 'Ayumu Kasuga', '354-1146, Ayaha, Ikeda-shi', 'Osaka', '02'),
('10008', 'Carolina Martins', 'Praça Francisco de Assis, 753', 'Ribeirão Preto', '02'),
('10009', 'Luis Alves', 'Rua Antônio Rossi, 910', 'Sumaré', '03'),
('10010', 'Julia Fernandes', 'Rua Padre Damião, 884', 'Campinas', '01'),
('10011', 'Guilherme Carvalho', 'Rua Professora Julieta da S. Barreto, 1795', 'São João da Boa Vista', '01'),
('10012', 'Isabelle Barbosa', 'Rua Cantídia Olympia Santana, 519', 'Caraguatatuba', '04'),
('10013', 'Marcos Carvalho', 'Avenida Jorge Abrão, 1382', 'Sertãozinho', '02'),
('10014', 'Nicolash Souza', 'Rua Particular, 179', 'São Paulo', '03'),
('10015', 'Igor Melo', 'Rua São Bartolomeu, 1799', 'Salto', '01'),
('10016', 'Ágatha Castro', 'Travessa 102, 749', 'Guarujá', '02'),
('10017', 'Carla Almeida', 'Rua Lázaro José Pereira, 1443', 'Ourinhos', '03'),
('10018', 'Kaori Gay', '202-1199, Nishishinjuku Shinjuku Mitsuibiru', 'Tokyo', '04'),
('10019', 'Otávio Fernandes', 'Rua João Musselli', 'Várzea Paulista', '03'),
('10020', 'Camila Santos', 'Rua Itambacuri, 766', 'São Paulo', '02');

-- --------------------------------------------------------

--
-- Estrutura para tabela `cursos`
--

CREATE TABLE `cursos` (
  `codcurso` char(2) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `coddisc1` char(2) NOT NULL,
  `coddisc2` char(2) NOT NULL,
  `coddisc3` char(2) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `cursos`
--

INSERT INTO `cursos` (`codcurso`, `nome`, `coddisc1`, `coddisc2`, `coddisc3`) VALUES
('01', 'Desenvolvimento de Sistemas', '11', '12', '13'),
('02', 'Educação Física', '21', '22', '23'),
('03', 'Administração', '31', '32', '33'),
('04', 'Astronomia', '41', '42', '');

-- --------------------------------------------------------

--
-- Estrutura para tabela `disciplinas`
--

CREATE TABLE `disciplinas` (
  `CodDisciplina` char(2) NOT NULL,
  `NomeDisciplina` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `disciplinas`
--

INSERT INTO `disciplinas` (`CodDisciplina`, `NomeDisciplina`) VALUES
('11', 'Sistemas Embarcados'),
('12', 'Banco de Dados'),
('13', 'Programação Web'),
('23', 'Fisiologia do exercício'),
('21', 'Biomecânica'),
('31', 'Planejamento de Marketing Inst'),
('32', 'Legislação Empresarial'),
('33', 'Adm de Recursos Humanos'),
('41', 'Astrofísica estelar'),
('42', 'Física aplicada'),
('22', 'Desenvolvimento motor');

-- --------------------------------------------------------

--
-- Estrutura para tabela `usuarios`
--

CREATE TABLE `usuarios` (
  `Id_Login` int(11) NOT NULL,
  `Login` varchar(5) NOT NULL,
  `Senha` int(11) NOT NULL,
  `Administrador` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `alunos`
--
ALTER TABLE `alunos`
  ADD PRIMARY KEY (`matricula`);

--
-- Índices de tabela `cursos`
--
ALTER TABLE `cursos`
  ADD PRIMARY KEY (`codcurso`);

--
-- Índices de tabela `disciplinas`
--
ALTER TABLE `disciplinas`
  ADD PRIMARY KEY (`CodDisciplina`);

--
-- Índices de tabela `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`Id_Login`),
  ADD UNIQUE KEY `Login` (`Login`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `Id_Login` int(11) NOT NULL AUTO_INCREMENT;