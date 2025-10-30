<?php
    session_start();
    
    if($_SESSION['admin_user'] == 0){
        header('location:../menu/index.php');
    }
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastrar</title>
    <link rel="stylesheet" type="text/CSS" href="CSS/Cadastrar.css">
</head>
<body>
        <form name="cliente" method="POST" action="" class="form">
            <h1>Dados do Produto:</h1>
            <div class="txts">
                Nome: <br><input name="txtnome" type="text" size="40" maxlength="40" placeholder="Nome do Produto" class="txt" required><br>
                Estoque: <br><input name="txtestoq" type="text" size="10" placeholder="0" class="txt" required><br>
            </div>
            <div class="btns">
                <input name="btnenviar" type="submit" value="Cadastrar">
                <input name="btnreset" type="reset" value="Apagar">
                <input type="button" onclick="location.href='../menu/index.php';" value="Voltar" />
            </div>
            <?php
                extract($_POST, EXTR_OVERWRITE);
                if(isset($btnenviar))
                {
                    include_once 'Produto.php';
                    $pro=new Produto();
                    $pro->setNome($txtnome);
                    $pro->setEstoque($txtestoq);
                    echo "<p class='msg'>" . $pro->salvar() . "</p>";
                }
            ?>
        </form>
    
    <div class="fundo"></div>
</body>
</html>