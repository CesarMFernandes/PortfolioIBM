<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulario</title>
</head>
<body>
    <h1>Informações Inseridas no Formulário</h1>
    <?php
        $n = $_POST['nome'];
        $e = $_POST['email'];
        $d = $_POST['data'];
        $g = $_POST['genero'];
        $c = $_POST['com'];
        echo "Seu nome é ".$n.", seu email é ".$e.", sua data de nascimento é ".$d." e seu gênero é ".$g."<br><br>";
        if($c == null){
            echo "Você não adicionou comentários.";
        }
        else{
            echo "Você adicionou comentários<br>";
            echo "<textarea rows='5' cols='30' readonly>$c</textarea>";
        }
    ?>
    <br><br>
    <form name="form2" action="..">
        <input type="submit" value="VOLTAR">
    </form>
</body>
</html>