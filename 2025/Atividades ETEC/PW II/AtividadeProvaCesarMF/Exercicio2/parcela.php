<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculador de Parcela</title>
</head>
<body>
    <?php
        $v = $_POST['valor'];
    ?>
    <h1>Calculador de Parcela</h1>
    <fieldset style="width: 30%">
        <form name="form1" method="post">
            Insira o valor inicial, em reais<br>
            R$<input type="text" name="valor" size="5" value="<?php echo $v ?>" readonly><br><br>
            <input type="submit" value="CALCULAR">
        </form>
    </fieldset><br>
    <fieldset style="width: 30%">
        <?php
            if($v > 0){
                $vf = $v * 1.16;
                $p = $vf / 10;
                echo "O valor final é R$".number_format($vf, 2)." dividido em 10 parcelas de R$".number_format($p, 2)." cada.";
                echo "<form name='form2' action='..'>";
            }
            else{
                echo "Erro: volte e insira um valor válido";
                echo "<form name='form2' action='index.html'>";
            }
            echo "<br>"
        ?>
                <input type="submit" value="VOLTAR">
            </form>
    </fieldset>
</body>
</html>