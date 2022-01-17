<?php include("../templates/head.php");

session_start();
if (isset($_SESSION['login']) != true){
    session_destroy();
    header("location:../index.php");
}

?>

    <div class="container ">
        <form class="normal_form">
            <p class="normal_linea"><br>SECCION ANIMALES</p>
            <legend style="text-align: right;background-color:orange;">LISTA DE ANIMALES</legend>
              <div class="table-responsive">
              <table class="table table-hover">

                <thead class="text-center">
                    <tr>
                        <th scope="col">ACCION</th>
                        <th scope="col">NOMBRE</th>
                        <th scope="col">EDAD</th>
                        <th scope="col">PESO</th>
                        <th scope="col">COLOR</th>                    
                    </tr>
                </thead>

                <tbody>
                  <?php include("../admin/db.php");
                  
                  $query = "SELECT * FROM zoo_animales ORDER BY zoo_ani_edad";
                  $resultado = mysqli_query($conexion, $query);
                  
                  while ($row = mysqli_fetch_array($resultado)){?>
                     <tr>
                        <td class="text-center"><a href="../update/upd_ani.php?id=<?php echo $row['zoo_ani_id']?>" style="background:pink"  onclick="return confirmar('¿Está seguro que desea editar el registro?')"><i class="tf-ion-ios-compose-outline"> </i> EDITAR </a><a href="../delete/del_ani.php?id=<?php echo $row['zoo_ani_id']?>" style="background:orange"  onclick="return confirmar('¿Está seguro que desea eliminar el registro?')">BORRAR </a></td>
                        <td class="text-center"><?php echo $row['zoo_ani_nombre']?></td>
                        <td class="text-center"><?php echo $row['zoo_ani_edad']?></td>
                        <td class="text-center"><?php echo $row['zoo_ani_peso']?></td>
                        <?php 
                            if ($row['zoo_ani_color'] == 1){?>
                                <td class="text-center" style="background-color: black;"></td>          
                            <?php } 
                            else if ($row['zoo_ani_color'] == 2){?>
                                <td class="text-center">BLANCO</td>  
                            <?php } 
                            else if ($row['zoo_ani_color'] == 3){?>
                                <td class="text-center">MARRON</td> 
                            <?php } 
                            else if ($row['zoo_ani_color'] == 4){?>
                                <td class="text-center">OTROS</td> 
                                <?php } ?>   
                      </tr>
                  <?php  
                  }
                  ?>
                </tbody>
              </table>
            </div> 
          </fieldset> 
        </form>
      </div>

<?php include("../templates/foot.php"); ?>