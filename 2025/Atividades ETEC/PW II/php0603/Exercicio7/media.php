<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Resultado</title>
    <link rel="stylesheet" type="text/CSS" href="style.css">
</head>
<body>
    <?php
        $n1=$_POST["nota1"];
        $n2=$_POST["nota2"];
        $n3=$_POST["nota3"];
        $n4=$_POST["nota4"];
        $MA=($n1+$n2+$n3+$n4)/4;
    ?>
    <div class="form">
        <h1 class="h1form">Média do Aluno</h1>
        <form name="form1" action="media.php" method="POST">
            <table class="table">
                <tr>
                    <td>
                        1º Bimestre<br>
                        <input type="text" name="nota1" size="4" readonly class="text" value="<?php echo $n1 ?>"><br>
                    </td>
                    <td>
                        2º Bimestre<br>
                        <input type="text" name="nota2" size="4" readonly class="text" value="<?php echo $n2 ?>"><br>
                    </td>
                </tr>
                <tr>
                    <td>
                        3º Bimestre<br>
                        <input type="text" name="nota3" size="4" readonly class="text" value="<?php echo $n3 ?>"><br>
                    </td>
                    <td>
                        4º Bimestre<br>
                        <input type="text" name="nota4" size="4" readonly class="text" value="<?php echo $n4 ?>"><br>
                    </td>
                </tr>
            </table>
        </form>
        <?php
            if($n1>=1 && $n1<=10 && $n2>=1 && $n2<=10 && $n3>=1 && $n3<=10 && $n4>=1 && $n4<=10){
                echo "<form name='form2' action='..'>";
            }
            else{
                echo "<form name='form2' action='index.html'>";
            }
        ?>
            <input type="submit" value="VOLTAR" class="btn">
        </form>
        <p class="nota">Nota Final: 
            <?php
                if($n1>=0 && $n1<=10 && $n2>=0 && $n2<=10 && $n3>=0 && $n3<=10 && $n4>=0 && $n4<=10){
                    echo "<br>".$MA."<br>";
                    if($MA>=6){
                        echo "Aprovado";
                    }
                    else if($MA<3){
                        echo "Retido";
                    }
                    else{
                        echo "Exame";
                    }
                }
                else{
                    echo "<br>ERRO! Notas devem estar entre 0 e 10. Volte e tente novamente";
                }
            ?>
        </p>
    </div>
</body>
</html>