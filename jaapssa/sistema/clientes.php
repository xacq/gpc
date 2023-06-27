<?php 
    require_once("./config/verificacion.php");
    require_once("./config/link.php");
    require_once("./templates/head_menu.php");
?>
  <body class="has-fixed-sidenav">
  <header>
    <?php require_once("./templates/nav.php"); ?>    
  </header>

  <main>
    <div class="row">
      <div class="col s12 m9 l9 offset-m3 offset-l3 ">
        <i class="material-icons left medium">assignment_ind</i><h4>SECCION CLIENTES</h4>
        <ul class="tabs tabs-fixed-width tab-demo">
          <li class="tab"><a class="active black-text grey lighten-4" href="#test1">Clientes</a></li>
          <li class="tab"><a class="black-text grey lighten-4" href="#test2">Reporte de Clientes</a></li>    
        </ul>
        <div id="test1" class="col s12">
          <div class="row">
            <div class="col s3 m3 l3 center"> <br>
              <a  href="#modal1" class="waves-effect btn modal-trigger black"><i class="material-icons left">assignment_ind</i>Nuevo Cliente</a>
            </div>

              <!-- Modal Structure -->
              <div id="modal1" class="modal modal-fixed-footer">
                <div class="modal-content">
                  <i class="material-icons left medium">assignment_ind</i><h4>NUEVO CLIENTE</h4>
                  <p>Formulario para ingresar un nuevo cliente</p>
                  <form action="./crearempleado.php" method="POST">

                    <div class="row center">  
                      <h5 class="form_title  colver center">DATOS PERSONALES DEL CLIENTE</h5>

                      <div class="input-field col l6 m6 s12">
                        <i class="material-icons prefix">person_add</i>
                        <input id="names" type="text" class="validate" name="nombre">
                        <label class="active" for="names">NOMBRES</label>
                      </div>

                      <div class="input-field col l6 m6 s12">
                        <i class="material-icons prefix">perm_identity</i>
                        <input id="lasts" type="text" class="validate" name="apellido">
                        <label class="active" for="lasts">APELLIDOS</label>
                      </div>

                      <div class="input-field col l6 m6 s12">
                        <i class="material-icons prefix">fingerprint</i>
                        <input id="finger" type="text" class="validate" name="cedula" >
                        <label class="active" for="finger">RUC / ID</label>
                      </div>

                      <div class="input-field col l6 m6 s12">
                        <i class="material-icons prefix">phone</i>
                        <input id="fono" type="text" class="validate" name="telefono">
                        <label class="active" for="fono">TELEFONO</label>
                      </div>

                      <div class="input-field col l6 m6 s12"> 
                      <i class="material-icons prefix">alternate_email</i>
                        <input id="corr" type="email" class="validate" name="correo">
                        <label class="active" for="corr">EMAIL</label>
                      </div>   
                      
                      <div class="input-field col l6 m6 s12"> 
                      <select id="ro" required  name="rol">
                            <option value="" selected disabled>DIRECCION DEL CLIENTE</option>
                            <?php
                              $consulta="SELECT * FROM direccion";  
                              $res = mysqli_query($conectar, $consulta);
                              while ($row = mysqli_fetch_array($res)) {
                                echo '<option value="'.$row['id'].'">'.$row['zona'].'</option>';
                              }
                            ?>
                          </select>
                      </div>

                    </div>

                  <div class="row center col m12 s12  ">
                    <button class="btn waves-effect black" type="submit" name="crear_cliente"><i class="material-icons right">save</i>GUARDAR</button>
                  </div>
                </form>
                </div>
                <div class="modal-footer">
                <a href="#!" class="modal-close waves-effect btn red">CERRAR</a>        
                </div>
              </div>

            <form action="">
              <div class="input-field col s7 m7 l7">
                <i class="material-icons prefix">person_search</i><input id="icon_prefix" type="text" name="busca_empleado" class="validate">
              </div>
              <div class="input-field col s2 m2 l2">
                <a class="waves-effect btn black"><i class="material-icons left">send</i>Buscar</a>
              </div>    
            </form>
          </div>  
          <div class="row"> <br>

            <table class="highlight centered responsive-table">
              <thead class="grey darken-4 white-text">
                <tr>
                  <th>ACCION</th>
                  <th>SOCIO</th>  
                  <th>NOMBRES</th>
                  <th>APELLIDOS</th>
                  <th>RUC/ID</th>
                  <th>DIRECCION</th>
                  <th>TELEFONO</th> 
                  <th>EMAIL</th> 
                </tr>
              </thead>

              <tbody>
                  <?php
                    $query = "SELECT * FROM clientes ORDER BY id_cli";
                    $res = mysqli_query($conectar, $query);
                    $i = 0;
                    while ($row = mysqli_fetch_array($res)){?>
                    <tr>                       
                        <td><a class="edit" href="?id=<?php echo $row['id_cli']?>" onclick="return confirmar('¿Está seguro que desea editar el registro?')"><i class="material-icons small green-text">edit</i></a></td>                                                   
                        <td><?php echo $row['id_cli']?></td>
                        <td><?php echo $row['nombres_cli']?></td>
                        <td><?php echo $row['apellidos_cli']?></td>
                        <td><?php echo $row['ciruc_cli']?></td>
                        <td><?php echo $row['direccion_cli']?></td>
                        <td><?php echo $row['telefono_cli']?></td>
                        <td><?php echo $row['email_cli']?></td> 
                        <?php  
                          $i++;
                          if ($i == 10) {
                            break;
                          } 
                        ?>  
                    </tr>
                  <?php  
                  }
                  ?>
              </tbody>
            </table>
          </div>
        </div>

        <div id="test2" class="col s12">

          <div class="row">
            <div class="input-field col s12 m12 l12 center">
              <button class="btn  grey darken-4  btn-small" type="submit" name="cargar">Reporte General<i class="material-icons right white-text">summarize</i></button>
            </div>
          </div>

          <div class="row">

          <div class="input-field col s12 m2 l2 center">
            <button class="btn  green darken-5  btn-small" type="submit" name="cargar">Cuendina Chico<i class="material-icons right white-text">summarize</i></button>
          </div>

          <div class="input-field col s12 m2 l2 center">
            <button class="btn  green darken-5  btn-small" type="submit" name="descargar">El Rosario<i class="material-icons right white-text">summarize</i></button>
          </div>

          <div class="input-field col s12 m2 l2 center">
            <button class="btn  green darken-5  btn-small" type="submit" name="atrasados">Guamba<i class="material-icons right white-text">summarize</i></button>
          </div>

          <div class="input-field col s12 m2 l2 center">
            <button class="btn  green darken-5  btn-small" type="submit" name="atrasados">San Juan<i class="material-icons right white-text">summarize</i></button>
          </div>

          <div class="input-field col s12 m2 l2 center">
            <button class="btn  green darken-5  btn-small" type="submit" name="atrasados">San Luis<i class="material-icons right white-text">summarize</i></button>
          </div>

          <div class="input-field col s12 m2 l2 center">
            <button class="btn  green darken-5  btn-small" type="submit" name="atrasados">Santa Rosa<i class="material-icons right white-text">summarize</i></button>
          </div>

          </div>        
        </div>
        
      </div>
    </div>
  </main>    
<?php
require_once("./templates/foot.php");
?>
