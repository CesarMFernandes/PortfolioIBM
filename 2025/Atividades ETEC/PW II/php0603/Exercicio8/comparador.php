<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Maior e Menor Numero</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <?php
        $n1=$_POST["num1"];
        $n2=$_POST["num2"];
        $n3=$_POST["num3"];
        if($n1>=$n2 && $n1>=$n3){
            $maior=$n1;
        }
        else if($n2>$n1 && $n2>=$n3){
            $maior=$n2;
        }
        else if($n3>$n1 && $n3>$n2){
            $maior=$n3;
        }
        if($n3<=$n2 && $n3<=$n1){
            $menor=$n3;
        }
        else if($n2<$n3 && $n2<=$n1){
            $menor=$n2;
        }
        else if($n1<$n3 && $n1<$n2){
            $menor=$n1;
        }
    ?>
    <div class="form">
        <h1 class="h1form">Digite 3 números</h1>
        <form name="form1" action="comparador.php" method="POST">
            1º Número<br>
            <input type="text" name="num1" size="4" readonly class="text" value="<?php echo $n1 ?>"><br>
            2º Número<br>
            <input type="text" name="num2" size="4" readonly class="text" value="<?php echo $n2 ?>"><br>
            3º Número<br>
            <input type="text" name="num3" size="4" readonly class="text" value="<?php echo $n3 ?>"><br>
        </form>
        <form name="form1" action="..">
            <input type="submit" value="VOLTAR" class="btn">
        </form>
        <div class="resp">
            <?php
                echo "<p>"."Maior Número: ".$maior."</p>";
                echo "<p>"."Menor Número: ".$menor."</p>";
            ?>
        </div>
    </div>
</body>
</html>