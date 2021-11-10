<?php

include("../config/db.php");
if (isset($_POST['login_ingresar']))
    {
    $u = $_POST['loguser'];
    $c = $_POST['logpassword']; // La función MD5() estará encriptando lo ingresado para comparar con lo guardado
    if($u == "" || $c == "")
        { // Validamos que ningún campo quede vacío
            header('location:../../error.php'); 
        }
    else{
        // 4. Cadena de SQL
        $sql = "SELECT * FROM fav_login WHERE fav_log_correo = '$u' AND fav_log_contrasenia = '$c'";
        // 5. Ejecuto cadena query()
        if(!$consulta = $conexion->query($sql))
            {
                header('location:../../error.php'); 
            }
        else{
            // 6. Cuento registros obtenidos del select. 
            // Como el nombre de usuario en la clave primaria no debería de haber mas de un registro con el mismo nombre.
            $filas = mysqli_num_rows($consulta);
            // 7. Comparo cantidad de registros encontrados
            if($filas == 0)
                {
                    header('location:../../error.php'); 
                }
            else
                {
                    $registro_user="INSERT INTO fav_reg_ingreso(fav_reg_id, fav_reg_user, fav_reg_fecha_creacion) 
                    VALUES ('','$u',current_timestamp())";
                    $resultado = mysqli_query($conexion, $registro_user);
                    $row_user = mysqli_fetch_array($consulta);
                    if ($row_user['fav_log_user'] == 0){
                        header('location:../sistema.php'); // Si está todo correcto redirigimos a otra página
                    }   
                    elseif ($row_user['fav_log_user'] == 1){
                        header('location:../sistema_user.php'); // Si está todo correcto redirigimos a otra página
                    }
                    elseif ($row_user['fav_log_user'] == 2){
                        header('location:../sistema_user_admin.php'); // Si está todo correcto redirigimos a otra página
                    }
                }

            }
        }
    }   
?>