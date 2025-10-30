<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tabuada-Resultado</title>
    <link rel="stylesheet" type="text/CSS" href="style.css">
</head>
<body>
    <div class="form">
        <h1 class="h1tab">Resultados</h1>
    <?php
        $n1 = $_POST["num"];
        $n2 = 0;
        echo "<div class='table'>";
        for($n2=0; $n2<=10; $n2++){
            $mult = $n1 * $n2;
            echo "<span class='n1'>".$n1."</span>"." * "."<span class='n2'>".$n2."</span>"." = "."<span class='mult'>".$mult."</span>"."<br />";
        }
        echo "</div>";
    ?>
    <form name="form1" action="..">
        <input type="submit" value="VOLTAR" class="btn">
    </form>
    <div>
</body>
</html>