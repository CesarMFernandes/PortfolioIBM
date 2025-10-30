<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Alterar</title>
    <link rel="stylesheet" type="text/CSS" href="CSS/Alterar2.css">
</head>
<body>
    <?php
        @$txtcoddisc = $_POST["txtcoddisc"];
        include_once 'Disciplinas.php';
        $p = new Disciplinas();
        $p->setCodDisciplina($txtcoddisc);
        $pro_bd = $p->alterar();
    ?>
        <form name="cliente" method="POST" action="alterar2.php" class="form">
            <h1>Alterar</h1>
            <?php
                foreach($pro_bd as $pro_mostrar){
            ?>
            <input type="hidden" name="txtcoddisc" size="5" value='<?php echo $pro_mostrar[0]; ?>'>
            <?php echo "<p class='id'>Código da Disciplina: " . $pro_mostrar[0] . "</p>";?>
            <div class="txts">               
                Nome da Disciplina: <br><input name="txtnomedisc" type="text" placeholder="Disciplina" class="txt" value="<?php echo $pro_mostrar[1]; ?>" required><br>
            </div>
            <div class="btns">
                <input name="btnalterar" type="submit" value="Alterar">
                <input name="btnreset" type="reset" value="Resetar">
                <input type="button" onclick="location.href='../../menu/index.htm';" value="Voltar" />
            </div>
            <?php
                extract($_POST, EXTR_OVERWRITE);
                if(isset($btnalterar)){
                    include_once 'Disciplinas.php';
                    $pro = new Disciplinas();
                    $pro->setNomeDisciplina($txtnomedisc);
                    $pro->setCodDisciplina($txtcoddisc);
                    echo "<p class='msg'> " . $pro->alterar2() . "</p>";
                    header("location:alterar.php");
                }
            ?>
            <?php
                }
            ?> 
        </form>
    
    <div class="fundo"></div>
</body>
</html>