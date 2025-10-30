<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculador Preço Tinta</title>
</head>
<body>
    <?php
        $m = $_POST['metros'];
    ?>
    <h1>Calculador de Preço de Tinta</h1>
    <fieldset style="width: 30%;">
        <form name="form1" method="POST">
            Informe, em metros quadrados, a área que deverá ser pintada<br>
            <input type="text" name="metros" size="5" value="<?php echo $m ?>" readonly>m^2<br><br>
            <input type="submit" value="CALCULAR">
        </form>
    </fieldset><br>
    <fieldset style="width: 30%;">
        <?php
            $L = $m / 6;
            if($L>=18){
                $b = $L / 18;
                if($b > round($b, 0)){
                    $br = (round($b, 0) + 1);
                }
                else{
                    $br = round($b, 0);
                }
                $p = $br * 80;
                echo "Você terá que comprar $br balde(s) de tinta de 18 litros, o que irá custar R$$p,00";
                echo "<form name='form2' action='..'>";
            }
            else if($L > 0){
                $b = $L / 3.6;
                if($b > round($b, 0)){
                    $br = (round($b, 0) + 1);
                }
                else{
                    $br = round($b, 0);
                }
                $p = $br * 25;
                echo "Você terá que comprar $br galão(ões) de tinta de 3,6 litros, o que irá custar R$$p,00";
                echo "<form name='form2' action='..'>";
            }
            else{
                echo "Erro: volte e insira um número válido";
                echo "<form name='form2' action='index.html'>";
            }
            echo "<br>"
        ?>
                <input type="submit" value="VOLTAR">
            </form>
    </fieldset>    
</body>
</html>