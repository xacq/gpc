<?php
include("../config/db.php");

if (isset($_POST['guardar_contrasena']))
{
        $vara = $_POST['correo'];
        $varb = $_POST['contrasena'];
        $varc = $_POST['new_contrasena'];
        $vard = $_POST['repetir'];
        
        $consulta = "SELECT * FROM fav_login WHERE fav_log_correo = '$vara'";
        $res_consulta = mysqli_query($conexion, $consulta);
        $correo = mysqli_fetch_array($res_consulta);

        if ($correo['fav_log_correo'] == $vara && $correo['fav_log_contrasenia'] == $varb ){
                if ($varc == $vard){
                        $consulta = "UPDATE fav_login
                        SET fav_log_contrasenia='$varc'
                        WHERE fav_log_correo = '$vara'";

                        $resultado = mysqli_query($conexion, $consulta);

                        header('location:../../exito_contrasena.php');
                }
                else{
                        header('location:../../error_contrasena.php');
                }
        }
        else{

                header('location:../../error_contrasena.php');
        }
        $resultado = mysqli_query($conexion, $consulta);

 
}
?>