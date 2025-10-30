<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Soma dos Quadrados</title>
    <link rel="stylesheet" type="text/CSS" href="style.css">
</head>
<body>
    <?php
        $n1=$_POST["num1"];
        $n2=$_POST["num2"];
        $n3=$_POST["num3"];
    ?>
    <div class="form">
        <h1 class="h1form">Insira 3 números</h1>
        <form name="form1" action="soma.php" method="POST">
            Número 1: <input type="text" size="5" name="num1" readonly class="text" value="<?php echo $n1 ?>"><br>
            Número 2: <input type="text" size="5" name="num2" readonly class="text" value="<?php echo $n2 ?>"><br>
            Número 3: <input type="text" size="5" name="num3" readonly class="text" value="<?php echo $n3 ?>"><br>
        </form>
        <form name="form1" action="..">
            <input type="submit" value="VOLTAR" class="btn">
        </form>
        <div class="resp">
            <p>A soma dos quadrados dos três números é:</p>
            <?php
                $s = pow($n1, 2) + pow($n2, 2) + pow($n3, 2);
                echo "<span class='soma'>".$s."</span>";
            ?>
        </div>
    </div>
</body>
</html>