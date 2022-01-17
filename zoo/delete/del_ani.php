<?php

include("../admin/db.php");

if (isset($_GET['id'])){

        $id = $_GET['id'];
        $query = "DELETE FROM zoo_animales WHERE zoo_ani_id = $id";
        $result = mysqli_query($conexion, $query);
        header ("Location:../listas/lista_ani.php");
    } 
?>