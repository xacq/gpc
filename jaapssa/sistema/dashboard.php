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
        <i class="material-icons left medium">dashboard</i><h4>DASHBOARD</h4>
      </div>
    </div>
  </main>    

<?php
require_once("./templates/foot.php");
?>
