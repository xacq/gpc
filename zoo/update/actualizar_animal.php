<?php

include("../admin/db.php");

if (isset($_POST['actualizaranimal'])){
    
    $id = $_GET['id'];

    $codigo = $_POST['zooanicodigo'];
    $nombre = $_POST['zooaninombre'];
    $edad = $_POST['zooaniedad'];
    $peso = $_POST['zooanipeso'];
    $color = $_POST['zooanicolor'];

    $consulta = "UPDATE zoo_animales 
                        SET 
                        zoo_ani_codigo ='$codigo',
                        zoo_ani_nombre ='$nombre',
                        zoo_ani_edad ='$edad',
                        zoo_ani_peso = '$peso',
                        zoo_ani_color = '$color'
                        WHERE zoo_ani_id = '$id'";

        $resultado = mysqli_query($conexion,$consulta);

        header('location:../listas/lista_ani.php');
}



?>