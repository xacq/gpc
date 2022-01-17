<?php

include('../admin/db.php');

if (isset($_POST['registro'])){

    $nombre = $_POST['nombre'];
    $email = $_POST['email'];
    $pass = $_POST['pass'];

    $consulta="INSERT INTO 
    zoo_login(zoo_log_id, zoo_log_nombre, zoo_log_correo, zoo_log_pass, zoo_log_fecha_creacion)
    VALUES ('','$nombre','$email','$pass',current_timestamp())";

    $res= mysqli_query($conexion,$consulta);

    if ($res == 1){
        header('location:../login/login.php');
    }else{
        echo("NO SE GUARDO EL REGISTRO");
    }   
}
else{
    echo('NO ES EL BOTON INDICADO');
}
?>