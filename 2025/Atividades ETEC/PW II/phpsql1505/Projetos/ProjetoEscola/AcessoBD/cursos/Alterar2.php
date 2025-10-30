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
        include_once '../disciplinas/Disciplinas.php';
        $p2 = new Disciplinas();
        $pro_bd2=$p2->listar();
    ?>
    <?php
        @$txtcodcurso = $_POST["txtcodcurso"];
        include_once 'cursos.php';
        $p = new Cursos();
        $p->setCodcurso($txtcodcurso);
        $pro_bd = $p->alterar();
    ?>
        <form name="cliente" method="POST" action="" class="form">
            <h1>Alterar</h1>
            <?php
                foreach($pro_bd as $pro_mostrar){
            ?>
            <input type="hidden" name="txtcodcurso" size="5" value='<?php echo $pro_mostrar[0]; ?>'>
            <?php echo "<p class='id'>Código do Curso: " . $pro_mostrar[0] . "</p>";?>
            <div class="txts">
                Nome do Curso: <br><input name="txtnomecurso" type="text" placeholder="Curso" class="txt" value="<?php echo $pro_mostrar[1]; ?>" required ><br>
            </div>
            <p class="subt">Disciplinas:</p>
            <div class="selects">
                <select name="selcoddisc1">
                    <option value="<?php echo $pro_mostrar[2] ?>" selected>Sem Alteração</option>
                    <?php
                        foreach($pro_bd2 as $pro_mostrar2)
                        {              
                            echo "<option value='$pro_mostrar2[0]'>$pro_mostrar2[1]</option>";
                        }
                    ?>
                </select>
                <select name="selcoddisc2">
                    <option value="<?php echo $pro_mostrar[3] ?>" selected>Sem Alteração</option>
                    <?php
                        foreach($pro_bd2 as $pro_mostrar2)
                        {              
                            echo "<option value='$pro_mostrar2[0]'>$pro_mostrar2[1]</option>";
                        }
                    ?>
                </select>
                <select name="selcoddisc3">
                    <option value="<?php echo $pro_mostrar[4] ?>" selected>Sem Alteração</option>
                    <?php
                        foreach($pro_bd2 as $pro_mostrar2)
                        {              
                            echo "<option value='$pro_mostrar2[0]'>$pro_mostrar2[1]</option>";
                        }
                    ?>
                </select>
            </div>
            <div class="btns">
                <input name="btnalterar" type="submit" value="Alterar">
                <input name="btnreset" type="reset" value="Resetar">
                <input type="button" onclick="location.href='alterar.php';" value="Voltar" />
            </div>
            <?php
                extract($_POST, EXTR_OVERWRITE);
                if(isset($btnalterar)){
                    include_once 'Cursos.php';
                    $pro = new Cursos();
                    $pro->setNome($txtnomecurso);
                    $pro->setCodcurso($txtcodcurso);
                    $pro->setCoddisc1($selcoddisc1);
                    $pro->setCoddisc2($selcoddisc2);
                    $pro->setCoddisc3($selcoddisc3);
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