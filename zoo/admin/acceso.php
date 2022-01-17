<?php

include("./db.php");

if (isset($_POST['acceder'])){

    $email = $_POST['email'];
    $pass = $_POST['pass'];

    //Hay que verificar la existencia de estos datos en la base de datos

    $datos = "SELECT * FROM zoo_login WHERE zoo_log_correo = '$email' AND zoo_log_pass = '$pass'";
    
    if ($consulta = $conexion->query($datos)){
        $row = mysqli_num_rows($consulta);
        if ($row>0){
            $row_rec = mysqli_fetch_array($consulta);
            //echo("TODO VA BIEN");
            session_start();//iniciamos el session
            $_SESSION['login'] = true;
            $_SESSION['login_name'] = $row_rec['zoo_log_nombre'];
            header('location:../login/index.php'); // Si está todo correcto redirigimos a otra página
        
        }
        else{
            session_start();
            session_destroy();
            echo("REGISTRO NO ENCONTRADO");
            header('location:../index.php');
        }
    }
    else{
        session_start();
        session_destroy();
        echo("REGISTRO NO ENCONTRADO");
        header('location:../index.php');
    }
}
else {
    session_start();
    session_destroy();
    echo("No es el metodo indicado");
    header('location:../index.php');
}
?>