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
    <title>Consultar</title>
    <link rel="stylesheet" type="text/css" href="CSS/Alterar.css">
</head>
<body>
    
    <form name="cliente" method="POST" action="Alterar2.php" class="form">
        <h1>Alteração de Produtos Cadastrados</h1>
        <div class="txts">
        ID: <br><input name="txtid" type="text" maxlength="5" placeholder="Id do Produto">
    </div>
        <div class="btns">
            <input name="btnenviar" type="submit" value="Consultar">
            <input name="limpar" type="reset" value="Limpar">
            <input type="button" onclick="location.href='../menu/index.php';" value="Voltar" />
            
        </div>
    </form>  
    <div class="fundo"></div>
</body>
</html>