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
      <i class="material-icons left medium">shopping_bag</i><h4>SECCION COMPRAS</h4>

        <ul class="tabs tabs-fixed-width tab-demo">
            <li class="tab"><a class="active black-text grey lighten-4" href="#test1">Compras</a></li>
            <li class="tab"><a class="black-text grey lighten-4" href="#test2">Compras Registradas</a></li>
            
          </ul>
          <div id="test1" class="col s12"><p>PANTALLA PARA COMPRAS</p></div>
          <div id="test2" class="col s12">
          <div class="row"> <br>
            <form action="">
              <div class="input-field col s10 m10 l10">
                <i class="material-icons prefix">shopping_bag</i><input id="icon_prefix" type="text" name="busca_empleado" class="validate">
              </div>
              <div class="input-field col s2 m2 l2">
                <a class="waves-effect btn black"><i class="material-icons left">send</i>Buscar</a>
              </div>    
            </form>
            <table class="highlight centered responsive-table">
              <thead class="grey darken-4 white-text">
                <tr>
                  <th>ACCION</th>
                  <th>FACTURA</th>  
                  <th>PROVEEDOR</th>
                  <th>DOCUMENTO</th>
                  <th>TIPO</th>
                  <th>FECHA</th>
                </tr>
              </thead>

              <tbody>
                  <?php
                    $query = "SELECT * FROM compras ORDER BY id_com";
                    $res = mysqli_query($conectar, $query);
                    while ($row = mysqli_fetch_array($res)){?>
                    <tr>
                        <td><a class="edit" href="?id=<?php echo $row['id_com']?>" onclick="return confirmar('¿Está seguro que desea editar el registro?')">
                                <i class="material-icons small green-text">edit</i></a></td>    
                        <td><?php echo $row['id_com']?></td>                                                
                        <td><?php echo $row['proveedor_com']?></td>
                        <td><?php echo $row['tipocomprobante_com']?></td>
                        <td><?php echo $row['costogasto_com']?></td>
                        <td><?php echo $row['create_at']?></td>
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
  </main> 




<?php
require_once("./templates/foot.php");
?>
