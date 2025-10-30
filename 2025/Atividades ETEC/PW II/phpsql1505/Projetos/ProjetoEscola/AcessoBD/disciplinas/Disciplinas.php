<?php
    include_once '../Conectar.php';

    class Disciplinas
    {
        private $CodDisciplina;
        private $nomeDisciplina;  

        public function getCodDisciplina() {
            return $this->CodDisciplina;
        }

        public function setCodDisciplina($CodDisciplina1) {
            $this->CodDisciplina = $CodDisciplina1;
        }

        public function getNomeDisciplina() {
            return $this->nomeDisciplina;
        }

        public function setNomeDisciplina($name) {
            $this->nomeDisciplina = $name;
        }

        function listar()
        {
            try
            {
                $this->conn = new Conectar();
                $sql = $this->conn->query("select * from disciplinas order by CodDisciplina");
                $sql->execute();
                return $sql->fetchAll();
                $this->conn = null;
            }
            catch(PDOException $exc)
            {
                echo "Erro ao executar consulta. " . $exc->getMessage();
            }
        }

        function salvar()
        {
            try
            {
                $this-> conn = new Conectar();
                $sql = $this->conn->prepare("insert into disciplinas values (?, ?)");
                @$sql-> bindParam(1, $this->getCodDisciplina(), PDO::PARAM_STR);
                @$sql-> bindParam(2, $this->getNomeDisciplina(), PDO::PARAM_STR);
                if($sql->execute() == 1)
                {
                    return "Registro salvo com sucesso!";
                }
                $this->conn = null;
            }
            catch(PDOException $exc)
            {
                echo "Erro ao salvar o registro. " . $exc->getMessage();
            }
        }

        function consultar(){
            try{
                $this-> conn = new Conectar();
                $sql = $this->conn->prepare("select * from disciplinas where nomedisciplina like ?");
                @$sql-> bindParam(1, $this->getNomeDisciplina(), PDO::PARAM_STR);
                $sql->execute();
                return $sql->fetchAll();
                $this->conn = null;
            }catch(PDOException $exc){
                echo "Erro ao executar consulta. " . $exc->getMessage();
            }
        }

        function exclusao(){
            try{
                $this-> conn = new Conectar();
                $sql = $this->conn->prepare("delete from disciplinas where coddisciplina = ?");
                @$sql-> bindParam(1, $this->getCodDisciplina(), PDO::PARAM_STR);
                if($sql->execute() == 1){
                    return "Excluido com sucesso!";
                }
                else{
                    return "Erro na exclusão!";
                }
                $this->conn = null;
            }
            catch(PDOException $exc){
                echo "Erro ao excluir. " . $exc->getMessage();
            }
        }

        function alterar(){
            try{
                $this->conn = new Conectar();
                $sql = $this->conn->prepare("select * from disciplinas where coddisciplina = ?");
                @$sql-> bindParam(1, $this->getCodDisciplina(), PDO::PARAM_STR);
                $sql->execute();
                return $sql->fetchAll();
                $this->conn = null;
            }
            catch(PDOException $exc){
                echo "Erro ao alterar. " . $exc->getMessage();
            }
        }
        function alterar2(){
            try{
                $this->conn = new Conectar();
                $sql = $this->conn->prepare("update disciplinas set nomedisciplina = ? where coddisciplina = ?");
                @$sql->bindParam(1, $this->getNomeDisciplina(), PDO::PARAM_STR);
                @$sql->bindParam(2, $this->getCodDisciplina(), PDO::PARAM_STR);
                if($sql->execute() == 1){
                    return "Registro alterado com sucesso!";
                }
                $this->conn = null;
            }
            catch(PDOException $exc){
                echo "Erro ao salvar o registro. " . $exc->getMessage();
            }
        }
    }
?>