<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Salario Liquido</title>
    <link rel="stylesheet" type="text/CSS" href="style.css">
</head>
<body>
    <?php
        $s=$_POST["salario"];
        $g=$s*0.1;
        $sg=$s+$g;
        $i=$sg*0.2;
        $sf=$sg-$i;
    ?>
    <fieldset>
            <legend>Salário Bruto</legend>
        <form name="form1">
            Insira o seu salário bruto<br>
            <input type="text" size="8" name="salario" readonly value="<?php echo $s ?>"><br><br>
            <button type="button">CALCULAR</button>
        </form>
    </fieldset>
    <fieldset>
            <legend>Salário Líquido</legend>
        <?php
            if($s>0){
                echo "Seu salário líquido é:<br>";
                echo "R$".number_format($sf, 2, ',', '.')."<br>";
                echo "<span class='good'>"."+ R$".number_format($g, 2, ',', '.')." (10% gratificação)"."</span><br>";
                echo "<span class='evil'>"."- R$".number_format($i, 2, ',', '.')." (20% imposto)"."</span>";
            }
            else{
                echo "Salário deve ser maior que 0. Volte e tente novamente";
            }
        ?>
        <br><br>
        <?php
            if($s>0){
                echo "<form name='form2' action='..'>";
            }
            else{
                echo "<form name='form2' action='index.html'>";
            }
        ?>
            <input type="submit" value="VOLTAR">
        </form>
    </fieldset>
</body>
</html>