<?php include("./template/head.php"); ?>

      <div class="container ">
        <form class="normal_form">
        <p class="normal_linea maximus"><br>SECCION HONORARIOS</p>
         <fieldset>
         <legend class="form_title maximus" style="text-align:right;">lista de honorarios por codigo de cliente</legend>
              <div class="table-responsive">
              <table class="table table-hover">
                <thead class="text-center maximus">
                  <tr>
                    <th scope="col" class="marca">Fecha</th>
                    <th scope="col">CODIGO</th>
                    <th scope="col">TOTAL</th>
                    <th scope="col">Abono1</th>
                    <th scope="col">Abono2</th>
                    <th scope="col">Abono3</th>
                  </tr>
                </thead>
                <tbody>
                  <?php
                  include("../config/db.php");
                  $query = "SELECT * FROM fav_honorarios ORDER BY fav_hon_fecha_creacion desc";
                  $resultado = mysqli_query($conexion, $query);
                  while ($row = mysqli_fetch_array($resultado)){?>
                    <tr>
                      <td class="text-center" style="font-size: 12px;"><?php echo $row['fav_hon_fecha_creacion']?></td>
                      <td class="text-center maximus" ><?php echo $row['fav_hon_codigo']?></td>
                      <td class="text-center maximus"><?php echo $row['fav_hon_total']?></td>
                      <td class="text-center" ><?php echo $row['fav_hon_abo_1']?></td>
                      <td class="text-center" ><?php echo $row['fav_hon_abo_2']?></td>
                      <td class="text-center" ><?php echo $row['fav_hon_abo_3']?></td>
                      
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
