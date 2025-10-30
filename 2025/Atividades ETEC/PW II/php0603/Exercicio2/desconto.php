<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Desconto</title>
    <link rel="stylesheet" type="text/CSS" href="style.css">
</head>
<body>
    <?php
        $p = $_POST["preco"];
        $d = $_POST["desc"];
        $pd = $p * ($d/100);
        $pf = $p - $pd;
    ?>
    <div class="form">
        <h1 class="h1form">Calculador de Desconto</h1>
        <form name="form1" action="desconto.php" method="POST">
            <div class="texts">
                Preço da compra(R$): <input type="text" name="preco" size="7" readonly class="text" value="<?php echo $p ?>"><br>
                Desconto(%): <input type="text" name="desc" size="3" readonly class="text" value="<?php echo $d ?>"><br>
            </div>
            <div class="desconto">
                <?php
                    if($p>0){
                        echo "O preço final da compra é:<br>";
                        if($pf>=0){
                            echo "R$".number_format($pf, 2, ',', '.')."<br>";
                        }
                        else if($pf<0){
                            echo "-R$".number_format($pf*(-1), 2, ',', '.')."<br>";
                        }
                        if($pd>0){
                            echo "<span class='good'>"."- R$".number_format($pd, 2, ',', '.')."<br>"."</span>";
                        }
                        else if($pd<0){
                            echo "<span class='evil'>"."+ R$".number_format($pd*(-1), 2, ',', '.');
                        }
                    }
                    else{
                        echo "Preço deve ser maior que 0. Volte e tente novamente";
                    }
                ?>
            </div>
        </form>
        <?php
            if($p>0){
                echo "<form name='form2' action='..'>";
            }
            else{
                echo "<form name='form2' action='index.html'>";
            }
        ?>
            <input type="submit" value="VOLTAR" class="btn">
        </form>
    </div>
</body>
</html>