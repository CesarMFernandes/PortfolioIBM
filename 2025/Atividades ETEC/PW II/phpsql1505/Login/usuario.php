<?php
    include_once 'Conectar.php';

    class Usuario
    {
        private $id;
        private $login;
        private $senhauser;
        private $admin;
        private $conn;
        

        public function getId() {
            return $this->id;
        }

        public function setId($iid) {
            $this->id = $iid;
        }

        public function getLogin() {
            return $this->login;
        }

        public function setLogin($log) {
            $this->login = $log;
        }

        public function getSenhauser() {
            return $this->senhauser;
        }

        public function setSenhauser($sen) {
            $this->senhauser = $sen;
        }

        public function getAdmin() {
            return $this->admin;
        }

        public function setAdmin($adm) {
            $this->admin = $adm;
        }


        function logar()
        {
            try
            {
                $this->conn = new Conectar();
                $sql = $this->conn->prepare("select * from usuario where login like ? and senhauser = ?");
                @$sql->bindParam(1, $this->getLogin(), PDO::PARAM_STR);
                @$sql->bindParam(2, $this->getSenhauser(), PDO::PARAM_STR);
                $sql->execute();
                return $sql->fetchAll();
                $this->conn = null;
            }
            catch(PDOException $exc)
            {
                echo "Erro ao executar consulta. " . $exc->getMessage();
            }
        }
    }
?>