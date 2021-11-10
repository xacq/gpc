<?php include("./template/head.php"); ?>

      <div class="container ">
        <form class="normal_form">
        <p class="normal_linea maximus"><br>Seccion Constitucional</p>
         <fieldset>
         <legend class="form_title maximus" style="text-align:right;">lista de clientes</legend>
              <div class="table-responsive">
              <table class="table table-hover">
                <thead class="text-center maximus">
                  <tr>
                    <th scope="col" class="marca">Fecha</th>
                    <th scope="col">CODIGO</th>
                    <th scope="col">tipo</th>
                    <th scope="col">cliente</th>
                    <th scope="col">Identificación</th>
                    <th scope="col">Telefono</th>
                    <th scope="col" class="marca">Acción</th>
                  </tr>
                </thead>
                <tbody>
                  <?php
                  include("../config/db.php");
                  $query = "SELECT * FROM fav_clientes WHERE fav_cli_tipo = 'constitucional' ORDER BY fav_cli_fecha_creacion desc";
                  $resultado = mysqli_query($conexion, $query);
                  while ($row = mysqli_fetch_array($resultado)){?>
                    <tr>
                      <td class="text-center" style="font-size: 12px;"><?php echo $row['fav_cli_fecha_creacion']?></td>
                      <td class="text-center maximus" ><?php echo $row['fav_cli_codigo']?></td>
                      <td class="text-center maximus"><?php echo $row['fav_cli_tipo']?></td>
                      <td class="text-center" ><?php echo $row['fav_cli_nombre']?></td>
                      <td class="text-center" ><?php echo $row['fav_cli_identificacion']?></td>
                      <td class="text-center" ><?php echo $row['fav_cli_telefono']?></td>
                      <td><a href="../edit/edit.php?id=<?php echo $row['fav_cli_id']?>" class="marca4" onclick="return confirmar('¿Está seguro que desea editar el registro?')">  <i class="tf-ion-ios-compose-outline"></i> EDIT </a></td>
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
