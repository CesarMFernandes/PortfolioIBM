<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Intervalo</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <div class="tab">
        <div class="voltar">
            <?php
                $in=$_POST['inicial'];
                $fi=$_POST['final'];
                if($in==$fi){
                    echo "<form name='form2' action='index.html'>";
                }
                else{
                    echo "<form name='form2' action='..'>";
                }
            ?>
                <input type="submit" value="VOLTAR" class="btn">
            </form>
        </div>
            <?php
                $isoma=0;
                if($in==$fi){
                    echo "Não há um intervalo pois o valor inicial e final são iguais";
                }
                else if($fi>$in){
                    echo "<h1 class='h1form'>Abaixo está o intervalo</h1>";
                    for($i=$in; $i<=$fi; $i++){
                        if($i%2==0){
                            echo $i."<br>";
                        }
                        else{
                            echo "<span class='imp'>".$i."</span><br>";
                            $isoma=$isoma+$i;
                        }
                    }
                }
                else if($in>$fi){
                    echo "Abaixo está o intervalo<br>";
                    for($i=$in; $i>=$fi; $i--){
                        if($i%2==0){
                            echo $i."<br>";
                        }
                        else{
                            echo "<span class='imp'>".$i."</span><br>";
                            $isoma=$isoma+$i;
                        }
                    }
                }
                echo "<p class='soma'>A soma dos números impares deste intervalo é:</p>";
                echo "<span class='soma2'>".$isoma."</span>";
            ?>
    </div>
</body>
</html>