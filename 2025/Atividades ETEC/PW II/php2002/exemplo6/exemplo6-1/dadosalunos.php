<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Página dadosalunos.php</title>
</head>
<body>
    <?php
    $nome=$_POST["txtnome"];
    $telefone=$_POST["txttelefone"];
    $curso=$_POST["cbocursos"];
    $RG=$_POST["txtRG"];
    $modulo=$_POST["txtmodulo"];
    echo "Segue abaixo as informações digitadas na página anterior" . '<br />';
    echo "Nome: " . $nome . '<br />';
    echo "Telefone: " . $telefone . '<br />';
    echo "Curso: " . $curso . '<br />';
    echo "RG: " . $RG . '<br />';
    echo "Modulo: " . $modulo . '<br />';
    ?>
</body>
</html>