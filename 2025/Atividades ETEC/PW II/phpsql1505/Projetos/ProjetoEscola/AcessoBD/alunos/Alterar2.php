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
        include_once '../cursos/Cursos.php';
        $p2 = new Cursos();
        $pro_bd2=$p2->listar();
    ?>
    <?php
        @$txtmat = $_POST["txtmat"];
        include_once 'Alunos.php';
        $p = new Alunos();
        $p->setMatricula($txtmat);
        $pro_bd = $p->alterar();
    ?>
        <form name="cliente" method="POST" action="" class="form">
            <h1>Dados do Aluno:</h1>
            <?php
                foreach($pro_bd as $pro_mostrar){
            ?>
            <input type="hidden" name="txtmat" size="5" value='<?php echo $pro_mostrar[0]; ?>'>
            <?php echo "<p class='id'>Matrícula: " . $pro_mostrar[0] . "</p>";?>
            <div class="txts">
                Nome: <br><input name="txtnome" type="text" placeholder="Aluno" class="txt" value="<?php echo $pro_mostrar[1]; ?>" required><br>
                Endereço: <br><input name="txtend" type="text" placeholder="Rua, Número" class="txt" value="<?php echo $pro_mostrar[2]; ?>" required><br>
                Cidade: <br><input name="txtcid" type="text" placeholder="Cidade" class="txt" value="<?php echo $pro_mostrar[3]; ?>" required><br>
                Disciplinas:<br>
                <select name="selcodcurso" required>
                    <option value="<?php echo $pro_mostrar[4] ?>" selected>Sem alteração</option>
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
                    include_once 'Alunos.php';
                    $pro = new Alunos();
                    $pro->setNome($txtnome);
                    $pro->setEndereco($txtend);
                    $pro->setCidade($txtcid);
                    $pro->setCodcurso($selcodcurso);
                    $pro->setMatricula($txtmat);
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