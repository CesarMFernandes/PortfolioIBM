<?php
    session_start();
    
    if($_SESSION['admin_user'] == 0){
        header('location:../../menu/index.php');
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
            <h1>Dados da Disciplina:</h1>
            <div class="txts">
                Código da Disciplina: <br><input name="txtcoddisc" type="text" maxlength="2" minlength="2" placeholder="00" class="txt" required><br>
                Nome da Disciplina: <br><input name="txtnomedisc" type="text" placeholder="Disciplina" class="txt" required><br>
            </div>
            <div class="btns">
                <input name="btnenviar" type="submit" value="Cadastrar">
                <input name="btnreset" type="reset" value="Apagar">
                <input type="button" onclick="location.href='../../menu/index.php';" value="Voltar" />
            </div>
            <?php
                extract($_POST, EXTR_OVERWRITE);
                if(isset($btnenviar))
                {
                    include_once 'Disciplinas.php';
                    $pro=new Disciplinas();
                    $pro->setCodDisciplina($txtcoddisc);
                    $pro->setNomeDisciplina($txtnomedisc);
                    echo "<p class='msg'>" . $pro->salvar() . "</p>";
                }
            ?>
        </form>
    
    <div class="fundo"></div>
</body>
</html>