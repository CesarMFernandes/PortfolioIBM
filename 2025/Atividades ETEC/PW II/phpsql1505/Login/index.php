<?php
    session_start();
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    
    <form name="formlogin" class="formlogin" method="POST">
        <h1>Login de acesso</h1>
        <div class="txts">
            Usuario<br>
            <input type="text" name="txtlogin" minlength="1" maxlength="20" required><br>
            Senha<br>
            <input type="text" name="txtsenha" maxlength="3" onkeypress="return blokletras(window.event.keyCode)" required><br>
        </div>
        <div class="btns">
            <input type="submit" name="btnsubmit" value="Entrar">
            <input type="reset" name="btnreset" value="Apagar">
        </div>
        <?php
            extract($_POST, EXTR_OVERWRITE);
            if(isset($btnsubmit)){
                include_once 'usuario.php';
                $u = new Usuario();
                $u->setLogin($txtlogin);
                $u->setSenhauser($txtsenha);
                $pro_bd = $u->logar();

                $existe = false;
                foreach($pro_bd as $pro_mostrar){
                    $existe = true;
                    echo "<p>Bem vindo!</p>";
                    echo "<p>Usuário: " . $pro_mostrar[1] . "</p>";
                    if($pro_mostrar[3] == 0){
                        echo "<p>Conta não administradora</p>";
                    }
                    else{
                        echo "<p>Conta administradora</p>";
                    }
                    if(!isset($_SESSION['id_user'])){
                        $_SESSION['id_user'] =  $pro_mostrar[0];
                        $_SESSION['login_user'] =  $pro_mostrar[1];
                        $_SESSION['admin_user'] =  $pro_mostrar[3];
                    }
                    ?>
                    <input type='button' onclick="location.href = '../projetos/projetoproduto/menu/index.php'" value='Acessar' class="btnacessar">
                    <?php                          
                }
                if($existe == false){
                    header('location:../aviso/index.htm');
                }
            }
        ?>   
    </form>
    <script language="javascript">
        function blokletras(keypress){
            if(keypress>=48 && keypress <=57){
                return true;
            }
            else{
                return false;
            }
        }
    </script>
    
</body>
</html>