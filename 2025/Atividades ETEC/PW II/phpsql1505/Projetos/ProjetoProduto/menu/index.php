<?php
    session_start();
    
    if(!isset($_SESSION['id_user'])){
        header('location:../../../login/index.php');
    }
?>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Menu de Navegação</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <header>
        <div class="headerb">
            <form>
                <input type="button" value="Cadastrar" id="cad" onclick="cadastrar()" class="selected">
            </form>

            <form>
                <input type="button" value="Excluir" id="exc" onclick="excluir()">
            </form>

            <form>
                <input type="button" value="Pesquisar" id="pes" onclick="pesquisar()">
            </form>

            <form>
                <input type="button" value="Listar" id="lis" onclick="listar()">
            </form>

            <form>
                <input type="button" value="Alterar" id="alt" onclick="alterar()">
            </form>
            <form class="proj" action="../../ProjetoEscola/menu/index.php">
                <input type="submit" value="Escola">
            </form>
            <form class="conta" method="POST">
                <input type="submit" class="sairconta" name="sairconta" value="Sair">
            </div>
    </header>
    <main>
        <div class="conteudo" id="formulario">
            <p class="tit" id="titulo">Cadastrar</p>
            <div class="link">
                <div class="a"><a href="../AcessoBD/Cadastrar.php" id="link">Produtos</a></div><br>
            </div>
        </div>
    </main>
    <footer>
        <?php
            if($_SESSION['admin_user'] == 0){
                echo "<p class='autor'>Não administradores apenas podem acessar as páginas de listar e pesquisar</p>";
            }
        ?>
    </footer>
    <script src="script.js"></script>
    <?php
        extract($_POST, EXTR_OVERWRITE);
        if(isset($sairconta)){
            session_unset();
            session_destroy();
            header('location:../../../login/index.php');
        }
    ?>
</body>
</html>