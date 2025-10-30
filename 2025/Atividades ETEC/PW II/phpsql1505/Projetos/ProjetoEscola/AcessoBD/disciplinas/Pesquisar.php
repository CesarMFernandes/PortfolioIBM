<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pesquisar</title>
    <link rel="stylesheet" type="text/css" href="CSS/Pesquisar.css">
</head>
<body>    
    <form name="cliente" method="POST" action="" class="form">
        <h1>Consulta de Disciplinas Cadastradas</h1>
        <div class="txts">
            Nome:<br>
            <input name="txtnome" type="text" size="40" maxlength="40" placeholder="Nome da Disciplina">
        </div>
        <div class="btns">
            <input name="btnenviar" type="submit" value="Consultar"><br>
            <input name="limpar" type="submit" value="Limpar"><br>
            <input type="button" onclick="location.href='../../menu/index.php';" value="Voltar">
        </div>
    </form>
    <br>
    <table>
        <tr class="cap">
            <th>CodDisciplina</th>
            <th>NomeDisciplina</th>
        </tr>
        <?php
            extract($_POST, EXTR_OVERWRITE);
            if(isset($btnenviar)){
                $pos = 0;
                include_once 'Disciplinas.php';
                $p = new Disciplinas();
                $p->setNomeDisciplina($txtnome.'%');
                $pro_bd=$p->consultar();
                foreach($pro_bd as $pro_mostrar){
                    $pos = $pos + 1;
                    if($pos % 2 == 1){
                        echo "<tr class='par'>"; 
                    }
                    else{
                        echo "<tr class='impar'>"; 
                    }
                                
                    echo "<td> $pro_mostrar[0] </td>"; 
                    echo "<td> $pro_mostrar[1] </td>"; 
                    echo "</tr>";
                }
            }
        ?>
    </table>
    <div class="fundo"></div>
</body>
</html>