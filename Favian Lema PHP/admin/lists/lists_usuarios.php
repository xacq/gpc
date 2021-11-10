<?php include("./template/head.php"); ?>

      <div class="container ">
        <form class="normal_form" action="./lists_agenda.php" method="POST">
        <p class="normal_linea maximus"><br>Seccion Usuarios</p>
         <fieldset>
            <legend class="form_title maximus" style="text-align: right;">Lista de Usuarios</legend>
              <div class="table-responsive">
              <table class="table table-hover">
                <thead class="text-center maximus">
                  <tr>
                    <th scope="col" class="marca">Fecha</th>
                    <th scope="col">Usuario</th>
                    <th scope="col">Correo</th>
                    <th scope="col">Tipo de Usuario</th>
                    <th scope="col">Accion</th>
                  </tr>
                </thead>
                <tbody>
                  <?php
                  include("../config/db.php");
                  $query = "SELECT * FROM fav_login ORDER BY fav_log_fecha desc";
                  $resultado = mysqli_query($conexion, $query);
                  while ($row = mysqli_fetch_array($resultado)){?>
                    <tr>
                      <td class="text-center"><?php echo $row['fav_log_fecha']?></td>
                      <td><?php echo $row['fav_log_nombre']?></td>
                      <td><?php echo $row['fav_log_correo']?></td>
                      <td><?php
                          if ($row['fav_log_user'] == 0){
                            echo "Administrador";
                          }
                          elseif ($row['fav_log_user'] == 1){
                            echo "Usuario general";
                          }
                          elseif ($row['fav_log_user'] == 2){
                            echo "Usuario especial";
                          }
                        ?>
                      </td>
                      <td><a href="../del/delete_usuario_ingreso.php?id=<?php echo $row['fav_log_id']?>"style="background:orange" onclick="return confirmar('¿Está seguro que desea eliminar el registro?')"> <i class="tf-ion-ios-trash"></i> DEL </a></td>
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

      <?php include("./template/foot.php"); ?>
