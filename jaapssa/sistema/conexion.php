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
        <i class="material-icons left medium">handyman</i><h4>SECCION CONEXIÓN / MULTAS / MATERIALES</h4>
        <ul class="tabs tabs-fixed-width tab-demo">
        <li class="tab"><a class="active black-text grey lighten-4" href="#test1">Multas</a></li>
        <li class="tab"><a class="black-text grey lighten-4" href="#test2">Nueva Conexión</a></li>
        <li class="tab"><a class="black-text grey lighten-4" href="#test3">Reporte</a></li>
        </ul>
        
        <div id="test1" class="col s12">

          <div class="row center">

            <div class="col s12 m3 l3 center"> <br>
              <a href="#modal1" class="waves-effect btn modal-trigger grey darken-4"><i class="material-icons left">add_circle</i>Agregar Multa</a>
            </div>

                          <!-- Modal Structure -->
              <div id="modal1" class="modal modal-fixed-footer">
                <div class="modal-content">
                  <i class="material-icons left medium">handyman</i><h4>NUEVO REGISTRO</h4>
                  <p>Formulario para ingresar un nuevo registro de multas</p>
                  <form action="./crearempleado.php" method="POST">

                    <div class="row center">  

                      <div class="input-field col l12 m12 s12">
                        <i class="material-icons prefix">person_add</i>
                        <input id="names" type="text" class="validate" name="nombre">
                        <label class="active" for="names">Número del Socio</label>
                      </div>

                      <div class="input-field col l12 m12 s12">
                      </i><select id="ro" required  name="rol">
                            <option value="" selected disabled>Tipo de Registro</option>
                            <?php
                              $consulta="SELECT * FROM tiporeportemultas";  
                              $res = mysqli_query($conectar, $consulta);
                              while ($row = mysqli_fetch_array($res)) {
                                echo '<option value="'.$row['id'].'">'.$row['descripcion'].'</option>';
                              }
                            ?>
                          </select>
                      </div>

                      <div class="input-field col l12 m12 s12">
                        <i class="material-icons prefix">price_check</i>
                        <input id="valor" type="number" class="validate" name="valor">
                        <label class="active" for="valor">Valor</label>
                      </div>

                      <div class="input-field col l12 m12 s12">
                        <i class="material-icons prefix">edit_note</i>
                        <input id="descripcion" type="text" class="validate" name="descripcion" >
                        <label class="active" for="descripcion">Descripción</label>
                      </div>
                  
                    </div>
                      
                  <div class="row center col m12 s12  ">
                    <button class="btn waves-effect grey darken-4" type="submit" name="crear_multa">GUARDAR<i class="material-icons right">save</i></button>
                  </div>
                </form>
                </div>
                <div class="modal-footer">
                <a href="#!" class="modal-close waves-effect btn red">CERRAR</a>        
                </div>
              </div>


            <form action="">
              <div class="input-field col s12 m5 l5">
                <i class="material-icons prefix">person_search</i><input id="multa" type="text" name="busca_multa" class="validate">
              </div>
              <div class="input-field col s12 m2 l2">
                <a class="waves-effect  btn grey darken-4"><i class="material-icons left">send</i>Buscar</a>
              </div>    
            </form>

            <form action="">
              <div class="input-field col s12 m2 l2">
                <a class="waves-effect btn green darken-5"><i class="material-icons right">file_copy</i>Cargar Todo</a>
              </div>    
            </form>

            <div class="row">
              <div class="col s12 m12 l12">   
                <table class=" centered responsive-table">
                  <thead class="black white-text">
                    <tr>
                        <th>Nombres</th>
                        <th>Descripción</th>
                        <th>Ultimo Pago</th>
                        <th>Estado</th>
                        <th>Valor</th>
                        <th>Saldo</th>
                        <th>Acciones</th>
                    </tr>
                  </thead class="highlight">
                    <td>Alvin</td>
                    <td>Eclair</td>
                    <td>$0.87</td>
                  <tbody>
                    <tr>
                      
                    </tr>
                  </tbody>
                </table>
              </div> 
            </div>              
            

          </div>

        </div>

        <div id="test2" class="col s12">
          <div class="row ">
            <form action="">
                <div class="input-field col s12 m6 l6 offset-l2 offset-m2">
                  <i class="material-icons prefix">person_search</i><input id="icon_prefix" type="text" name="busca_empleado" class="validate">
                </div>
                <div class="input-field col s12 m2 l2 center">
                  <a class="waves-effect waves-light btn grey darken-4"><i class="material-icons left">send</i>Buscar</a>
                </div>    
              </form>
          </div>
          
          
        <form action="" method="post">

          <div class="row grey lighten-4" style="border-radius: 10px;box-shadow: 5px 5px 10px black;margin:0px!important">
            
            <div class="col s12 m12 l12" style="background-color: black;color: whitesmoke;height: 60px;margin:0px!important; border-radius: 10px;">
              <h5>Nueva Conexión</h5>
            </div>

            <div class="row">
              <div class="input-field col s12 m3 l3">
                <i class="material-icons prefix">verified</i><textarea id="codigo" class="materialize-textarea"></textarea><label for="codigo">Código</label>
              </div>
              <div class="input-field col s12 m3 l3">
                  <i class="material-icons prefix">person</i><textarea id="cliente" class="materialize-textarea"></textarea><label for="cliente">Cliente</label>
              </div>              
              <div class="input-field col s12 m3 l3">
                <i class="material-icons prefix">fingerprint</i><textarea id="cedula" class="materialize-textarea"></textarea><label for="cedula">Cédula</label>
              </div>
              <div class="input-field col s12 m3 l3">
                <i class="material-icons prefix">location_city</i><textarea id="barrio" class="materialize-textarea"></textarea><label for="barrio">Barrio</label>  
              </div>
            </div>

            <div class="row">
              <div class="input-field col l8 m8 s8 offset-l2 offset-m2 offset-s2" >
                </i><select id="ro" required  name="rol">
                      <option value="" selected disabled>Tipo de conexion</option>
                      <?php
                        $consulta="SELECT * FROM opcion_conexion";  
                        $res = mysqli_query($conectar, $consulta);
                        while ($row = mysqli_fetch_array($res)) {
                          echo '<option value="'.$row['id'].'">'.$row['name'].'</option>';
                        }
                      ?>
                    </select>
              </div>
            </div>


            <div class="row">


              <div class="input-field col s12 m2 l2">                  
                <i class="material-icons prefix">wb_iridescent</i><input id="descripcion" type="text" class="validate" readonly><label for="descripcion">Descripcion</label>                  
              </div>
              <div class="input-field col s12 m2 l2">                  
                <i class="material-icons prefix">inventory</i><input id="stock" type="number" class="validate" readonly><label for="stock">Stock</label>                  
              </div>
              <div class="input-field col s12 m2 l2">                  
                <i class="material-icons prefix">price_check</i><input id="precio" type="number" class="validate" readonly><label for="precio">Precio</label>                  
              </div>
              <div class="input-field col s12 m2 l2">                  
                <i class="material-icons prefix">functions</i><input id="cantidad" type="number" class="validate"><label for="cantidad">Cantidad</label>                  
              </div>
              <div class="input-field col s12 m2 l2">                  
                <i class="material-icons prefix">attach_money</i><input id="total" type="number" class="validate" readonlyº><label for="total">Total</label>                  
              </div>
              <div class="input-field col s12 m1 l1">
                <button class="btn  green darken-5" type="submit" name="buscacliente">Añadir<i class="material-icons right white-text">calculate</i></button>
              </div>  
            </div>

            <div class="container">
              <div class="row">
                <div class="col s12 m12 l12">   
                  <table class=" centered responsive-table">
                    <thead class="black white-text">
                      <tr>
                          <th>Descripción</th>
                          <th>Cantidad</th>
                          <th>Subtotal</th>
                          <th>Acciones</th>
                      </tr>
                    </thead class="highlight">
                      <td>Alvin</td>
                      <td>Eclair</td>
                      <td>$0.87</td>
                    <tbody>
                      <tr>
                        
                      </tr>
                    </tbody>
                  </table>
                </div> 
              </div>
            </div>                  
          </div>
          </form>
          
          <div class="row">
            <div class="input-field col s12 m2 l2 offset-l2 offset-m2">                  
                <i class="material-icons prefix blue-text">shopping_cart</i><input id="descripcion" type="text" class="validate" readonly><label for="descripcion">Subtotal</label>                  
              </div>
              <div class="input-field col s12 m2 l2">                  
                <i class="material-icons prefix  green-text">tune</i><input id="stock" type="number" class="validate" readonly><label for="stock">Subtotal 0%</label>                  
              </div>
              <div class="input-field col s12 m2 l2">                  
                <i class="material-icons prefix green-text">tune</i><input id="precio" type="number" class="validate" readonly><label for="precio">IVA 12%</label>                  
              </div>
              <div class="input-field col s12 m2 l2">                  
                <i class="material-icons prefix red-text">paid</i><input id="cantidad" type="number" class="validate"><label for="cantidad">TOTAL</label>                  
              </div>              
          </div>        
        </div>


        <div id="test3" class="col s12">
        <div class="row">

          <div class="input-field col s12 m3 l3 center">
            <i class="material-icons prefix">edit_calendar</i><input type="text" class="datepicker" id="inicio">
            <label for="inicio">Fecha inicio</label>
          </div>

          <div class="input-field col s12 m3 l3 center">
            <i class="material-icons prefix">edit_calendar</i><input type="text" class="datepicker" id="final">
            <label for="final">Fecha final</label>
          </div>

          <div class="input-field col s12 m3 l3 center">
            <button class="btn  grey darken-4" type="submit" name="cargar">Cargar Información<i class="material-icons right white-text">publish</i></button>
          </div>

          <div class="input-field col s12 m3 l3 center">
            <button class="btn  red darken-5" type="submit" name="atrasados">Valores Pendientes<i class="material-icons right white-text">assignment_late</i></button>
          </div>

          </div>      
        </div>
      </div>
    </div>
  </main>

<?php
require_once("./templates/foot.php");
?>
