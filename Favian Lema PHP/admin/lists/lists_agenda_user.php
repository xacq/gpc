<?php include("./template/head_user.php"); ?>


      <div class="container ">
        <form class="normal_form" action="./lists_agenda.php" method="POST">
        <p class="normal_linea maximus"><br>SECCION AGENDA</p>
         <fieldset>
            <legend class="form_title maximus" style="text-align: right;">Fechas agendadas</legend>
              <div class="table-responsive">
              <table class="table table-hover">
                <thead class="text-center maximus">
                  <tr>
                    <th scope="col" class="marca">Fecha</th>
                    <th scope="col">Tarea</th>
                    <th scope="col">Descripcion</th>
                  </tr>
                </thead>
                <tbody>
                  <?php
                  include("../config/db.php");
                  $query = "SELECT * FROM fav_agenda ORDER BY fav_age_fecha desc";
                  $resultado = mysqli_query($conexion, $query);
                  while ($row = mysqli_fetch_array($resultado)){?>
                    <tr>
                      <td class="text-center"><?php echo $row['fav_age_fecha']?></td>
                      <td
                        <?php if($row['fav_age_tareas']=="Audiencia")
                                print('class="text-center maximus" style="background:orange;"');
                              elseif ($row['fav_age_tareas']=="Inspección")   
                                print('class="text-center maximus" style="background:orangered; color:white;"');
                              else print('class="text-center maximus"');?>><?php echo $row['fav_age_tareas']?></td>
                      <td><?php echo $row['fav_age_descripcion']?></td>
                      <td class="text-center"><a href="../edit/edit_agenda_user.php?id=<?php echo $row['fav_age_id']?>" class="marca4"  onclick="return confirmar('¿Está seguro que desea editar el registro?')">  <i class="tf-ion-ios-compose-outline"></i> EDIT </a></td>
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
