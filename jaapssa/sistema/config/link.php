<?php
function saber_dia($fecha){
    $fechats = strtotime($fecha); //pasamos a timestamp
    switch (date('w', $fechats)){
      case 0: return "Domingo"; break;
      case 1: return "Lunes"; break;
      case 2: return "Martes"; break;
      case 3: return "Miercoles"; break;
      case 4: return "Jueves"; break;
      case 5: return "Viernes"; break;
      case 6: return "Sabado"; break;
    } 
  }
date_default_timezone_set('America/Bogota');  
$host = "localhost";
$user = "root";
$clave = "";
$bd = "jaapssa_contable";

$conectar = mysqli_connect($host, $user, $clave, $bd);
?>