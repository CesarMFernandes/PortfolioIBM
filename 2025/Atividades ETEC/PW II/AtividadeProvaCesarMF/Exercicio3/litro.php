<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculador de Consumo de Combustivel</title>
</head>
<body>
    <?php
        $km = $_POST['dist'];
        $L = $_POST['cons'];
    ?>
    <h1>Calculador de Consumo de Combustivel</h1>
    <fieldset style="width: 30%">
        <form name="form1" action="litro.php" method="POST">
            Distância total percorrida (kilômetros): <input type="text" name="dist" size="5" value="<?php echo $km ?>" readonly>KM<br><br>
            Consumo total de combustivel (litros): <input type="text" name="cons" size="5" value="<?php echo $L ?>" readonly>L<br><br><br>
            <input type="submit" value="CALCULAR">
        </form>
    </fieldset><br>
    <fieldset style="width: 30%">
        <?php
            if($km>0 && $L>0){
                $c = $km / $L;
                $cr = round($c, 2);
                echo "O consumo médio do veículo é de ".$cr."km/L";
                echo "<form name='form2' action='..'>";
            }
            else{
                echo "Erro: volte e insira valores válidos";
                echo "<form name='form2' action='index.html'>";
            }
            echo "<br>";
        ?>
                <input type="submit" value="VOLTAR">
            </form>
    </fieldset>
</body>
</html>