<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Par ou Impar</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <?php $n=$_POST['num']; ?>
    <div class="form">
        <h1 class="h1form">Par ou Ímpar</h1>
        <h2 class="h2form">Digite um número inteiro</h2>
        <form name="form2" action="..">
            <input type="number" name="num" size="4" value="<?php echo $n; ?>" readonly class="text"><br>
            <input type="submit" value="VOLTAR" class="btn">
        </form>
            <div class="resp">
            <?php
                if($n%2==0){
                    echo "PAR";
                }
                else{
                    echo "IMPAR";
                }
            ?>
        </div>
    </div>
</body>
</html>