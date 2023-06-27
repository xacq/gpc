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
      <div class="col s9 offset-s3">
      <i class="material-icons left medium">inventory</i><h4>SECCION INVENTARIO</h4>
        <ul class="tabs tabs-fixed-width tab-demo">
          <li class="tab"><a class="active black-text grey lighten-4" href="#test1">Inventario Suministros</a></li>
          <li class="tab"><a class="black-text grey lighten-4" href="#test2">Inventario Asignado</a></li>
        
          
        </ul>
        <div id="test1" class="col s12">
        <div class="row">
            <div class="col s3 m3 l3 center"> <br>
              <a href="#modal1" class="waves-effect waves-light btn black modal-trigger"><i class="material-icons left">inventory</i>Nuevo Item</a>
            </div>

              <!-- Modal Structure -->
              <div id="modal1" class="modal modal-fixed-footer">
                <div class="modal-content">
                  <i class="material-icons left medium">inventory</i><h4>NUEVO ITEM</h4>
                  <p>Formulario para ingresar un nuevo item</p>
                  <form action="./crearempleado.php" method="POST">

                    <div class="row center">  
                      <h5 class="form_title  colver center">DATOS DEL ITEM</h5>

                      <div class="input-field col l12 m12 s12"> 
                      <select id="cat" required  name="categoria">
                            <option value="" selected disabled>CATEGORIA DEL ITEM</option>
                            <?php
                              $consulta="SELECT * FROM categoria";  
                              $res = mysqli_query($conectar, $consulta);
                              while ($row = mysqli_fetch_array($res)) {
                                echo '<option value="'.$row['id'].'">'.$row['descripcion'].'</option>';
                              }
                            ?>
                          </select>
                      </div>

                      <div class="input-field col l12 m12 s12">
                        <i class="material-icons prefix">qr_code_scanner</i>
                        <input id="cod" type="text" class="validate" name="codigo">
                        <label class="active" for="cod">CODIGO</label>
                      </div>

                      <div class="input-field col l12 m12 s12">
                        <i class="material-icons prefix">shelves</i>
                        <input id="it" type="text" class="validate" name="item">
                        <label class="active" for="it">ITEM</label>
                      </div>

                      <div class="input-field col l12 m12 s12">
                        <i class="material-icons prefix">preview</i>
                        <input id="des" type="text" class="validate" name="descripcion" >
                        <label class="active" for="des">DESCRIPCION</label>
                      </div>

                      <div class="input-field col l6 m6 s6">
                        <i class="material-icons prefix">paid</i>
                        <input id="pre" type="number" class="validate" name="precio">
                        <label class="active" for="pre">PRECIO</label>
                      </div>

                      <div class="input-field col l6 m6 s6"> 
                      <select id="cat" required  name="iva">
                            <option value="" selected disabled>IVA SOBRE PRECIO</option>
                            <?php
                              $consulta="SELECT * FROM iva";  
                              $res = mysqli_query($conectar, $consulta);
                              while ($row = mysqli_fetch_array($res)) {
                                echo '<option value="'.$row['id'].'">'.$row['valor'].' %'.'</option>';
                              }
                            ?>
                          </select>
                      </div>

                      <div class="input-field col l6 m6 s12"> 
                      <i class="material-icons prefix">view_in_ar</i>
                        <input id="cant" type="number" class="validate" name="cantidad">
                        <label class="active" for="cant">CANTIDAD DEL ITEM</label>
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
                <a class="waves-effect waves-light btn black"><i class="material-icons left">send</i>Buscar</a>
              </div>    
            </form>
          </div>  

          <div class="row"> <br>

            <table class="highlight centered responsive-table">
              <thead class="black white-text">
                <tr>
                  <th>ACCION</th>  
                  <th>CODE</th>
                  <th>CATEGORIA</th>
                  <th>ITEM</th>
                  <th>STOCK</th>
                  <th>PRECIO</th>  
                  <th>REFERENCIA</th>  
                  <th>DESCRIPCION</th>
                </tr>
              </thead>

              <tbody>
                  <?php
                    $query = "SELECT * FROM productos_servicios ORDER BY id_proser";
                    $res = mysqli_query($conectar, $query);
                    while ($row = mysqli_fetch_array($res)){?>
                    <tr>
                        <td><a class="edit" href="?id=<?php echo $row['id_proser']?>" onclick="return confirmar('¿Está seguro que desea editar el registro?')">
                                <i class="material-icons tiny edit">edit</i>EDIT</a></td>                                                   
                        <td><?php echo $row['codigo_proser']?></td>
                        <td><?php echo $row['categoria_proser']?></td>
                        <td><?php echo $row['nombre_proser']?></td>
                        <td><?php echo $row['cantidad_proser']?></td>
                        <td><?php echo $row['precio_proser']?></td>
                        <td><img class="materialboxed" src="<?php echo $row['foto']?>" alt="No habilitada" width="100px"></td>
                        <td><?php echo $row['descripcion_proser']?></td>
                    </tr>
                  <?php  
                  }
                  ?>
              </tbody>
            </table>
          </div>
        </div>
        
        <div id="test2" class="col s12">
          <p>Test 2</p>
        </div>
      </div>
    </div>
  </main>      

<?php
require_once("./templates/foot.php");
?>