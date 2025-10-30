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
        @$txtid = $_POST["txtid"];
        include_once 'Produto.php';
        $p = new Produto();
        $p->setId($txtid);
        $pro_bd = $p->alterar();
    ?>
        <form name="cliente" method="POST" action="alterar2.php" class="form">
            <h1>Alterar</h1>
            <?php
                foreach($pro_bd as $pro_mostrar){
            ?>
            <input type="hidden" name="txtid" size="5" value='<?php echo $pro_mostrar[0]; ?>'>
            <?php echo "<p class='id'>ID: " . $pro_mostrar[0] . "</p>";?>
            <div class="txts">
                Nome: <br><input name="txtnome" type="text" size="40" maxlength="40" placeholder="Nome do Produto" value="<?php echo $pro_mostrar[1]; ?>" class="txt" required><br>
                Estoque: <br><input name="txtestoq" type="text" size="10" placeholder="0" value="<?php echo $pro_mostrar[2]; ?>" class="txt" required><br>
            </div>
            <div class="btns">
                <input name="btnalterar" type="submit" value="Alterar">
                <input name="btnreset" type="reset" value="Resetar">
                <input type="button" onclick="location.href='../AcessoBD/Alterar.php';" value="Voltar" />
            </div>
            <?php
                extract($_POST, EXTR_OVERWRITE);
                if(isset($btnalterar)){
                    include_once 'Produto.php';
                    $pro = new Produto();
                    $pro->setNome($txtnome);
                    $pro->setEstoque($txtestoq);
                    $pro->setId($txtid);
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