  <?php
  require_once("./config/verificacion.php");
  require_once("./config/link.php");
  require_once("./templates/head_menu.php");
  $GUI = 0;

  if (isset($_POST['buscar'])) {
    $user = $_POST['cliente'];
    $sql = "SELECT * FROM clientes WHERE id_cli = $user";
    $result = mysqli_query($conectar, $sql);
    if (mysqli_num_rows($result) > 0) {
      $cliente = mysqli_fetch_array($result);
      $GUI = 1;
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
          <i class="material-icons left medium">description</i>
          <h4>SECCION VENTAS</h4>
          <ul class="tabs tabs-fixed-width tab-demo">
            <li class="tab"><a class="active black-text grey lighten-4" href="#test1">Crear Factura</a></li>
            <li class="tab"><a class="black-text grey lighten-4" href="#test2">Facturas por Cobrar</a></li>
            <li class="tab"><a class="black-text grey lighten-4" href="#test3">Facturas Cobradas</a></li>
            <li class="tab"><a class="black-text grey lighten-4" href="#test4">Reportes</a></li>
          </ul>
          <div id="test1" class="col s12">
            <div class="row">
              <form action="./ventas.php" method="post">
                <div class="input-field col s4 m4 l4 center" style="background-color: black;color: whitesmoke;height: 60px;margin:0px!important;">
                  <h5>Creación de Facturas</h5>
                </div>
                <div class="input-field col s6 m6 l6">
                  <i class="material-icons prefix">person_search</i><input id="icon_prefix" type="text" name="cliente" class="validate"><label for="icon_prefix">Código / Apellido</label>
                </div>
                <div class="input-field col s2 m2 l2">
                  <button class="btn waves-effect grey darken-4" type="submit" name="buscar">Buscar<i class="material-icons right">send</i></button>
                </div>
              </form>
            </div>
            <?php if ($GUI == 1) {          ?>
              <form action="./ventas.php" method="post">

                <div class="row grey lighten-4" style="border-radius: 10px;box-shadow: 5px 5px 10px black;margin:0px!important">

                  <div class="col s12 m12 l12" style="background-color: black;color: whitesmoke;height: 60px;margin:0px!important; border-radius: 10px;">
                    <h5>Datos del Cliente</h5>
                  </div>

                  <div class="row">
                    <div class="input-field col s12 m4 l4">
                      <i class="material-icons prefix">person</i><textarea id="cliente" class="materialize-textarea" readonly><?php echo $cliente['apellidos_cli'] . " " . $cliente['nombres_cli']  ?></textarea><label for="cliente">Cliente</label>
                    </div>
                    <div class="input-field col s12 m4 l4">
                      <i class="material-icons prefix">fingerprint</i><textarea id="cedula" class="materialize-textarea" readonly><?php echo $cliente['ciruc_cli'] ?></textarea><label for="cedula">Cédula</label>
                    </div>
                    <div class="input-field col s12 m4 l4">
                      <i class="material-icons prefix">location_city</i><textarea id="barrio" class="materialize-textarea" readonly><?php echo $cliente['direccion_cli'] ?></textarea><label for="barrio">Barrio</label>
                    </div>
                  </div>

                  <div class="row">
                    <div class="input-field col s12 m3 l3">
                      <i class="material-icons prefix">local_drink</i><input id="consumo" type="number" class="validate"><label for="consumo">Consumo de agua</label>
                    </div>
                    <div class="input-field col s12 m3 l3">
                      <i class="material-icons prefix">calendar_month</i>
                      <select>
                        <option value="0">Mes:</option>
                        <?php
                        $query = ("SELECT * FROM meses");
                        $run = mysqli_query($conectar, $query);
                        if (mysqli_num_rows($run) > 0) {
                          while ($valores = mysqli_fetch_array($run)) {
                            echo "<option value='" . mysqli_real_escape_string($conectar, $valores['id']) . "'>" . mysqli_real_escape_string($conectar, $valores['name']) . "</option>\n";
                          }
                        }

                        ?>
                      </select>
                      <label for="mes">Mes prefactura</label>
                    </div>
                    <div class="input-field col s12 m3 l3">
                      <button class="btn waves-effect green darken-5" type="submit" name="buscacliente">Calcular Valores<i class="material-icons right white-text">calculate</i></button>
                    </div>
                    <div class="input-field col s12 m3 l3">
                      <button class="btn waves-effect red darken-5" name="buscacliente">Borrar Prefactura<i class="material-icons right white-text">delete_outline</i></button>
                    </div>
                  </div>

                  <div class="container">
                    <div class="row">
                      <div class="col s12 m12 l12">
                        <table class=" centered responsive-table">
                          <thead class="black white-text">
                            <tr>
                              <th>Descripción</th>
                              <th>Valor por Facturar</th>
                              <th>Fondo Social</th>
                              <th>Cancelado</th>
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
            <?php } ?>

          </div>

          <div id="test2" class="col s12">
            <div class="row">
              <form action="./ventas.php" method="post">
                <div class="input-field col s4 m4 l4 center" style="background-color: black;color: whitesmoke;height: 60px;margin:0px!important;">
                  <h5>Cobro de Facturas</h5>
                </div>
                <div class="input-field col s6 m6 l6">
                  <i class="material-icons prefix">person_search</i><input id="icon_prefix" type="text" name="cliente" class="validate">
                </div>
                <div class="input-field col s2 m2 l2">
                  <button class="btn waves-effect grey darken-4" type="submit" name="buscacliente">Buscar<i class="material-icons right">send</i></button>
                </div>
              </form>
            </div>
          </div>

          <div id="test3" class="col s12">
            <div class="row">
              <form action="./ventas.php" method="post">
                <div class="input-field col s4 m4 l4 center" style="background-color: black;color: whitesmoke;height: 60px;margin:0px!important;">
                  <h5>Impresión de Facturas</h5>
                </div>
                <div class="input-field col s6 m6 l6">
                  <i class="material-icons prefix">person_search</i><input id="icon_prefix" type="text" name="cliente" class="validate">
                </div>
                <div class="input-field col s2 m2 l2">
                  <button class="btn waves-effect grey darken-4" type="submit" name="buscacliente">Buscar<i class="material-icons right">send</i></button>
                </div>
              </form>
            </div>
          </div>

          <div id="test4" class="col s12">
            <div class="row">

              <div class="input-field col s12 m2 l2 center">
                <i class="material-icons prefix">edit_calendar</i><input type="text" class="datepicker" id="inicio">
                <label for="inicio">Fecha inicio</label>
              </div>

              <div class="input-field col s12 m2 l2 center">
                <i class="material-icons prefix">edit_calendar</i><input type="text" class="datepicker" id="final">
                <label for="final">Fecha final</label>
              </div>

              <div class="input-field col s12 m2 l2 center">
                <button class="btn  grey darken-4  btn-small" type="submit" name="cargar">Cargar<i class="material-icons right white-text">publish</i></button>
              </div>

              <div class="input-field col s12 m2 l2 center">
                <button class="btn  green darken-5  btn-small" type="submit" name="descargar">Descargar<i class="material-icons right white-text">download</i></button>
              </div>

              <div class="input-field col s12 m2 l2 center">
                <button class="btn  red darken-5  btn-small" type="submit" name="atrasados">Atrasados<i class="material-icons right white-text">assignment_late</i></button>
              </div>

              <div class="input-field col s12 m2 l2 center">
                <button class="btn  orange darken-5  btn-small" type="submit" name="atrasados">Generados<i class="material-icons right white-text">print</i></button>
              </div>

            </div>
          </div>
        </div>
      </div>
    </main>

    <?php
    require_once("./templates/foot.php");
    ?>