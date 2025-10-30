<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Página calcularsalario.php</title>
</head>
<body>
    <?php
    $horas=$_POST["txthoras"];
    $valor=$_POST["txtvalor"];
    $salario=$horas*$valor;
    echo "De acordo com as informações digitadas na página anterior, o salário é R$" . $salario;
    ?>
</body>
</html>