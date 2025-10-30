<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Resultado</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <?php
        $n1=$_POST['num1'];
        $n2=$_POST['num2'];
        $op=$_POST['operacao'];
    ?>
    <div class="form">
        <h1 class="h1form">Calculadora</h1>
        <div class="resp">
            <?php
                if($op=="Soma"){
                    $res=$n1 + $n2;
                }
                else if($op=="Subtração"){
                    $res=$n1 - $n2;
                }
                else if($op=="Multiplicação"){
                    $res=$n1 * $n2;
                }
                else if($op=="Divisão"){
                    if($n2!=0){
                        $res=$n1 / $n2;
                    }
                    else{
                        $res= "INDEFINIDO";
                    }
                }
                echo $res;
            ?>
        </div>
        <form name="form1" action="..">
            Primeiro Número: <input type="text" name="num1" size="10" value="<?php echo $n1; ?>" readonly class="text"><br>
            Segundo Número: <input type="text" name="num2" size="10" value="<?php echo $n2; ?>" readonly class="text"><br>
            Operação: <select name="operacao" class="text">
                <option selected disabled hidden><?php echo $op ?></option>
            </select><br>
            <input type="submit" value="VOLTAR" class="btn">
        </form>
    </div>
</body>
</html>