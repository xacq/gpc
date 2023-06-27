<?php 
    require_once("./config/verificacion.php");
    require_once("./config/link.php");
    require_once("./templates/head_menu.php");

  if (isset($_POST['crear_empleado'])){
    $nombre = htmlspecialchars($_POST['nombre']);
    $apellido = htmlspecialchars($_POST['apellido']);
    $cedula = htmlspecialchars($_POST['cedula']);
    $telefono = htmlspecialchars($_POST['telefono']);
    $direccion = htmlspecialchars($_POST['direccion']);
    $correo = htmlspecialchars($_POST['correo']);
    $sueldo = htmlspecialchars($_POST['sueldo']);
    $rol = htmlspecialchars($_POST['rol']);
    $contrato = htmlspecialchars($_POST['contrato']);

    $sql = "INSERT INTO usuarios(fotoperfil, usuario, contrasenia, rol, sueldo, nombres, apellidos, ciruc, direccion, email, telefono, tipocontrato, create_at) 
            VALUES ('','user','987654321','$rol','','$nombre','$apellido','$cedula','$direccion','$correo','$telefono','$contrato',current_time())";
            
    $result = mysqli_query($conectar, $sql);
    if ($result) {
      echo "<script>alert('USUARIO REGISTRADO');</script>";
      echo "<script>window.location.href='./empleados.php';</script>";
      } else {
        echo "<script>alert('USUARIO NO REGISTRADO');</script>";
        echo "<script>window.location.href='./empleados.php';</script>";
      }
  }
?>


<body class="has-fixed-sidenav">
  <header>
    <?php require_once("./templates/nav.php"); ?>    
  </header>

  <main>
    <div class="row">
      <div class="col s9 offset-s3">
        <i class="material-icons left medium">engineering</i><h4>SECCION EMPLEADOS</h4>
        <ul class="tabs tabs-fixed-width tab-demo">
        <li class="tab"><a class="active black-text grey lighten-4" href="#test1">Empleados</a></li>
        <li class="tab"><a class="black-text grey lighten-4" href="#test2">Sueldo</a></li>
        <li class="tab"><a class="black-text grey lighten-4" href="#test3">Rol de pagos</a></li>
        </ul>
        
        <div id="test1" class="col s12">
          <div class="row">
            <div class="col s3 m3 l3 center"> <br>
              <a href="#modal1" class="waves-effect waves-light btn modal-trigger grey darken-4"><i class="material-icons left">engineering</i>Nuevo Empleado</a>
            </div>

              <!-- Modal Structure -->
              <div id="modal1" class="modal modal-fixed-footer">
                <div class="modal-content">
                  <i class="material-icons left medium">engineering</i><h4>NUEVO EMPLEADO</h4>
                  <p>Formulario para ingresar un nuevo empleado</p>
                  <form action="./empleados.php" method="POST">

                    <div class="row center">  
                      <h5 class="form_title  colver center">DATOS PERSONALES DEL EMPLEADO</h5>

                      <div class="input-field col l6 m6 s12">
                        <i class="material-icons prefix">person_add</i>
                        <input id="names" type="text" class="validate" name="nombre" required>
                        <label class="active" for="names">NOMBRES</label>
                      </div>

                      <div class="input-field col l6 m6 s12">
                        <i class="material-icons prefix">perm_identity</i>
                        <input id="lasts" type="text" class="validate" name="apellido" required>
                        <label class="active" for="lasts">APELLIDOS</label>
                      </div>

                      <div class="input-field col l6 m6 s12">
                        <i class="material-icons prefix">fingerprint</i>
                        <input id="finger" type="text" class="validate" name="cedula" required minlenght="10" maxlength="10" onkeypress="return valideKey(event);">
                        <label class="active" for="finger">RUC / ID</label>
                      </div>

                      <div class="input-field col l6 m6 s12">
                        <i class="material-icons prefix">phone</i>
                        <input id="fono" type="text" class="validate" name="telefono" required minlenght="10" maxlength="10" onkeypress="return valideKey(event);">
                        <label class="active" for="fono">TELEFONO</label>
                      </div>

                      <div class="input-field col l6 m6 s12"> 
                      <i class="material-icons prefix">location_city</i>
                        <input id="direcc" type="text" class="validate" name="direccion" required>
                        <label class="active" for="direcc">DIRECCION</label>
                      </div>

                      <div class="input-field col l6 m6 s12"> 
                      <i class="material-icons prefix">alternate_email</i>
                        <input id="corr" type="email" class="validate" name="correo" required>
                        <label class="active" for="corr">EMAIL</label>
                      </div>

                      <div class="input-field col l6 m6 s12"> 
                      <i class="material-icons prefix">money</i>
                        <input id="suel" type="number" class="validate" name="sueldo" required onkeypress="return valideKey(event);">
                        <label class="active" for="suel">SUELDO</label>
                      </div>                    
                    </div>

                    <div class="row">
                      <div class="input-field col l6 m6 s12">
                      </i><select id="rol" required  name="rol">
                            <option value="" selected disabled>ROL DEL EMPLEADO</option>
                            <?php
                              $consulta="SELECT * FROM tipousuario";  
                              $res = mysqli_query($conectar, $consulta);
                              while ($row = mysqli_fetch_array($res)) {
                                echo '<option value="'.$row['id'].'">'.$row['descripcion'].'</option>';
                              }
                            ?>
                          </select>
                      </div>
                      <div class="input-field col l6 m6 s12">
                          <select id="contrato" required  name="contrato">
                            <option value="" selected disabled>TIPO DE CONTRATO</option>
                            <?php
                              $consulta="SELECT * FROM tipocontrato";  
                              $res = mysqli_query($conectar, $consulta);
                              while ($row = mysqli_fetch_array($res)) {
                                echo '<option value="'.$row['id'].'">'.$row['descripcion'].'</option>';
                              }
                            ?>
                          </select>
                      </div>
                    </div>
                      
                  <div class="row center col m12 s12  ">
                    <button class="btn waves-effect waves-light grey darken-4" type="submit" name="crear_empleado">GUARDAR<i class="material-icons right">save</i></button>
                  </div>
                </form>
                </div>
                <div class="modal-footer">
                <a href="#!" class="modal-close waves-effect waves-light btn red">CERRAR</a>        
                </div>
              </div>

            <form action="">
              <div class="input-field col s7 m7 l7">
                <i class="material-icons prefix">person_search</i><input id="icon_prefix" type="text" name="busca_empleado" class="validate">
                <label for="icon_prefix">Escriba el apellido del empleado</label>
              </div>
              <div class="input-field col s2 m2 l2">
                <a class="waves-effect waves-light btn grey darken-4"><i class="material-icons left">send</i>Buscar</a>
              </div>    
            </form>
          </div>  
          <div class="row"> <br>

            <table class="highlight centered responsive-table">
              <thead class="grey darken-4 white-text">
                <tr>
                  <th>ACCION</th>
                  <th>USUARIO</th>  
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
                    $query = "SELECT * FROM usuarios ORDER BY id_usuario";
                    $res = mysqli_query($conectar, $query);
                    while ($row = mysqli_fetch_array($res)){?>
                    <tr>
                        <td><a class="edit" href="?id=<?php echo $row['id_usuario']?>" onclick="return confirmar('¿Está seguro que desea editar el registro?')">
                                <i class="material-icons tiny edit">edit</i>EDIT</a></td>    
                        <td><?php echo $row['rol']?></td>                                                
                        <td><?php echo $row['nombres']?></td>
                        <td><?php echo $row['apellidos']?></td>
                        <td><?php echo $row['ciruc']?></td>
                        <td><?php echo $row['direccion']?></td>
                        <td><?php echo $row['telefono']?></td>
                        <td><?php echo $row['email']?></td>
                    </tr>
                  <?php  
                  }
                  ?>
              </tbody>
            </table>
          </div>
        </div>
        <div id="test2" class="col s12">
            <form action="">
              <div class="input-field col s12 m6 l6 offset-m2 offset-l2 center">
                <i class="material-icons prefix">person_search</i><input id="icon_prefix" type="text" name="busca_empleado" class="validate">
              </div>
              <div class="input-field col s12 m2 l2 center">
                <a class="waves-effect waves-light btn grey darken-4"><i class="material-icons left">send</i>Buscar</a>
              </div>    
            </form>

            <div class="row"> <br>
              <table class="highlight centered responsive-table">
                <thead class="grey darken-4 white-text">
                  <tr>
                    <th>NOMBRES</th>
                    <th>APELLIDOS</th>
                    <th>RUC/ID</th>
                    <th>DIRECCION</th>
                    <th>TELEFONO</th>  
                    <th>EMAIL</th>  
                    <th>SUELDO</th>  
                  </tr>
                </thead>

                <tbody>
                      <tr>

                      </tr>
                </tbody>
              </table>
            </div> 
        </div>
        <div id="test3" class="col s12">
            <div class="row">
              <form action="">
                <div class="input-field col s12 m6 l6 offset-m2 offset-l2 center">
                  <i class="material-icons prefix">person_search</i><input id="icon_prefix" type="text" name="busca_empleado" class="validate">
                </div>
                <div class="input-field col s12 m2 l2 center">
                  <a class="waves-effect waves-light btn grey darken-4"><i class="material-icons left">send</i>Buscar</a>
                </div>    
              </form>
            </div>
            

            <div class="row">
              <div class="input-field col l6 m6 s12"> 
                <select id="ro" required  name="rol">
                  <option value="" selected disabled>MES A SELECCIONAR</option>
                  <?php
                    $consulta="SELECT * FROM meses";  
                    $res = mysqli_query($conectar, $consulta);
                    while ($row = mysqli_fetch_array($res)) {
                      echo '<option value="'.$row['id'].'">'.$row['id']." > ".$row['name'].'</option>';
                    }
                  ?>
                </select>
              </div>

              <div class="input-field col s12 m6 l6 center">
                <button class="btn  green darken-5  btn-small" type="submit" name="atrasados">DESCARGAR REPORTE<i class="material-icons right white-text">summarize</i></button>
              </div>
            </div>
            
            <div class="row"> <br>
              <table class="highlight centered responsive-table">
                <thead class="grey darken-4 white-text">
                  <tr>
                    <th>EMPLEADO</th>
                    <th>INGRESOS</th>
                    <th>EGRESOS</th>
                    <th>OTROS VALORES</th>
                    <th>NETO RECIBIDO</th>  
                    <th>APROBAR</th>                      
                  </tr>
                </thead>

                <tbody>
                      <tr>

                      </tr>
                </tbody>
              </table>
            </div> 

        </div>
      </div>
    </div>
  </main>

<?php
require_once("./templates/foot.php");
?>