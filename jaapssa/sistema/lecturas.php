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
      <i class="material-icons left medium">receipt_long</i><h4>SECCION LECTURAS</h4>
        <ul class="tabs tabs-fixed-width tab-demo">
          <li class="tab"><a class="active black-text grey lighten-4" href="#test1">Lecturas</a></li>

        </ul>
        <div id="test1" class="col s12">

        <div class="row"> <br>
            <form action="">
            
              <div class="input-field col s7 m7 l7 center">
                <i class="material-icons prefix">receipt_long</i><input id="icon_prefix" type="text" name="busca_lectura" class="validate">
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
                  <th>SOCIO</th>
                  <th>NOMBRES</th>
                  <th>SECTOR</th>
                  <th>FECHA ANT.</th>
                  <th>LECTURA ANT.</th>  
                  <th>FECHA ACT.</th>  
                  <th>LECTURA ACT.</th>
                  <th>CONSUMO</th>
                  <th>FOTO</th>
                </tr>
              </thead>

              <tbody>
                  <?php
                    $query = "SELECT * FROM lecturas";
                    $res = mysqli_query($conectar, $query);
                    while ($row = mysqli_fetch_array($res)){?>
                    <tr>
                    </tr>
                  <?php  
                  }
                  ?>
              </tbody>
            </table>
          </div>
        </div>

        </div>
      </div>  
    </div>
  </main>  

<?php
require_once("./templates/foot.php");
?>
