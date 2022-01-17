
<?php

include('../admin/db.php');

if (isset($_POST['guardaranimal'])){

    $codigo = $_POST['zooanicodigo'];
    $nombre = $_POST['zooaninombre'];
    $edad = $_POST['zooaniedad'];
    $peso = $_POST['zooanipeso'];
    $color = $_POST['zooanicolor'];

    $consulta="INSERT INTO 
    zoo_animales(zoo_ani_id, zoo_ani_codigo, zoo_ani_nombre, zoo_ani_edad, zoo_ani_peso, zoo_ani_color, zoo_ani_fecha)
    VALUES ('','$codigo','$nombre','$edad','$peso','$color',current_timestamp())";

    $res= mysqli_query($conexion,$consulta);

    if ($res == 1){
        header('location:../listas/lista_ani.php');
    }else{
        echo("NO SE GUARDO EL REGISTRO");
    }   
}
else{
    echo('NO ES EL BOTON INDICADO');
}
?>
