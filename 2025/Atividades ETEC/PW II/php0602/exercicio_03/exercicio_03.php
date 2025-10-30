<html>
    <head>
        <title>Terceiro exemplo</title>
        <link rel="stylesheet" type="text/CSS" href="style.css">
    </head>
    <body>
        <?php
        // Declarando Variáveis
        $var1 = 1;
        $varX = 9.50;
        $varY = 9.50;
        $var2 = $varX + $varY;
        $varSTR = "Atribui string";
        $varletra = "a";
        $varbool = true;

        echo "<span class='b'>*--------------------*</span>";
        print "<P>";

        echo"<span class='b'>Exemplo de uma aplicação em PHP</span>";
        print"<P>";

        echo"<span class='p'>Conteúdo do var1: </span>";
        echo "<span class='p'>$var1</span>";
        print "<P>";

        echo"<span class='p'>Conteúdo do varX: </span>";
        echo "<span class='p'>$varX</span>";
        print "<P>";

        echo"<span class='w'>Conteúdo do varY: </span>";
        echo "<span class='w'>$varY</span>";
        print "<P>";

        echo"<span class='w'>Conteúdo do var2: </span>";
        echo "<span class='w'>$var2</span>";
        print "<P>";

        echo"<span class='p'>Conteúdo do varSTR: </span>";
        echo "<span class='p'>$varSTR</span>";
        print "<P>";

        echo"<span class='p'>Conteúdo do varletra: </span>";
        echo "<span class='p'>$varletra</span>";
        print "<P>";
        echo "<span class='b'>Conteúdo do varbool: </span>";
        echo "<span class='b'>$varbool</span>";
        print "<P>";

        echo "<span class='b'>*--------------------*</span>";
        ?>
    </body>
</html>