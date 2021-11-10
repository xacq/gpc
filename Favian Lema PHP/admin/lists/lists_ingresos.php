<?php include("./template/head.php"); ?>

      <div class="container ">
        <form class="normal_form" action="./lists_agenda.php" method="POST">
        <p class="normal_linea"><br>Lista de Registros</p>
         <fieldset>
            <legend class="form_title maximus" style="text-align: right;">Registro de Ingresos de usuarios</legend>
              <div class="table-responsive">
              <table class="table table-hover">
                <thead class="text-center maximus">
                  <tr>
                    <th scope="col" class="marca">Fecha</th>
                    <th scope="col">Usuario</th>
                  </tr>
                </thead>
                <tbody>
                  <?php
                  include("../config/db.php");
                  $query = "SELECT * FROM fav_reg_ingreso ORDER BY fav_reg_fecha_creacion desc";
                  $resultado = mysqli_query($conexion, $query);
                  while ($row = mysqli_fetch_array($resultado)){?>
                    <tr>
                      <td class="text-center"><?php echo $row['fav_reg_fecha_creacion']?></td>
                      <td><?php echo $row['fav_reg_user']?></td>
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
