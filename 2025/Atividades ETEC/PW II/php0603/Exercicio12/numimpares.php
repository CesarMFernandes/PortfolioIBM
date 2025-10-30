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
            if($in==$fi){
                echo "Não há um intervalo pois o valor inicial e final são iguais";
            }
            else if($fi>$in){
                echo "<h1>Abaixo está o intervalo</h1>";
                for($i=$in; $i<=$fi; $i++){
                    if($i%2!=0){
                        echo $i."<br>";
                    }
                }
            }
            else if($in>$fi){
                echo "<h1>Abaixo está o intervalo</h1>";
                for($i=$in; $i>=$fi; $i--){
                    if($i%2!=0){
                        echo $i."<br>";
                    }
                }
            }
        ?>
    </div>
</body>
</html>