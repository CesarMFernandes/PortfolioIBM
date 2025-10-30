<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Trocador de Variavel</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <?php
        $v1=$_POST["var1"];
        $v2=$_POST["var2"];
        $troca=$v1;
        $v1=$v2;
        $v2=$troca;
    ?>
    <div class="form">
        <h2>Variáveis trocadas</h2>
        <form name="form1" action="troca.php" method="POST">
            <table class="table">
                <tr>
                    <td>
                        Variável 1:<br>
                        <input type="number" size="5" name="var1" readonly value="<?php echo $v1 ?>"><br>
                    </td>
                    <td>
                        Variável 2:<br>
                        <input type="number" size="5" name="var2" readonly value="<?php echo $v2 ?>"><br>
                    </td>
                </tr>
            </table>
        </form>
        <form name="form1" action="..">
            <input type="submit" value="VOLTAR" class="btn">
        </form>
    </div>
</body>
</html>