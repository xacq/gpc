<?php

if (isset($_GET['id'])){
  $id = $_GET['id'];

?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>FAVIAN & LEMA - Sistema</title>
    <link rel="stylesheet" href="./css/style.css">
    <link rel="shortcut icon" type="image/x-icon" href="./images/favicon.png" />
 
    <!-- Themefisher Icon font --> <link rel="stylesheet" href="./plugins/themefisher-font/style.css">
    <!-- bootstrap.min css --> <link rel="stylesheet" href="./plugins/bootstrap/css/bootstrap.min.css">
    <!-- Lightbox.min css --> <link rel="stylesheet" href="./plugins/lightbox2/dist/css/lightbox.min.css">
    <!-- animation css --> <link rel="stylesheet" href="./plugins/animate/animate.css">
    <!-- Slick Carousel --> <link rel="stylesheet" href="./plugins/slick/slick.css">
</head>

<body id="bodysystem">

      <header class="navigation fixed-top">
        <div class="container">
          <!-- main nav -->
          <nav class="navbar navbar-expand-lg navbar-light">
            <!-- logo -->
            <a class="navbar-brand logo"></a>
              <img class="logo-white" src="./images/logo_new.jpg" alt="logo" width="200px"/></a>
              <img class="logo-default" src="./images/logo_new.jpg" alt="logo" width="200px"/></a>
            <!-- /logo -->
            <!--boton-->
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navigation"
              aria-controls="navigation" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>
            <!--/boton-->
            <div class="collapse navbar-collapse" id="navigation">
              <ul class="navbar-nav ml-auto text-center">
                      <li class="nav-item "><a class="nav-link" href="./sistema.php">Inicio</a></li>
              </ul>
            </div>
          </nav>
          <!-- /main nav -->
        </div>
      </header>
      <div class="container">
      <form class="normal_form" action="./actions/registrar_honorarios.php?id=<?php echo "$id"?>" method="POST">
      <p class="normal_linea"><br>SECCION HONORARIOS</p>
          <fieldset>
            <legend class="form_title maximus" style="text-align: right;">Informacion del cliente</legend>
              <div class="row">    
              <div class="col-md-6 col-sm-12 col-xs-12">
                <label >CODIGO</label> 
                <input value="<?php echo "$id"?>" name="codigo" class="normal_input_little"  disabled></div></div>
              
              <legend class="form_title maximus" style="text-align: right;">Informacion Contable</legend>
                <div class="row">
                 <div class="col-md-6 col-sm-12 col-xs-12">
                <label>VALOR TOTAL</label> 
                <input name="total" style="font-size:20px;" class="normal_input_little" placeholder="0.00" id="total" onkeypress="return valideKey(event);" ></div></div>
              
                <div class="row">
                <div class="col-md-6 col-sm-12 col-xs-12">
                <label class="marca1">ABONO 1</label> 
                <input  onChange="suma();" name="abono1" style="font-size:16px;" class="cl marca1 normal_input_little" placeholder="0.00" id="total" onkeypress="return valideKey(event);" ></div>  
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label class="marca1">Fecha</label> 
                  <input name="fecha_abono1" class=" marca1 normal_input_little" type="date"></div> 
            </div>

            <div class="row">
                <div class="col-md-6 col-sm-12 col-xs-12">
                <label class="marca2">ABONO 2</label> 
                <input  onChange="suma();" name="abono2" style="font-size:16px;" class="cl marca2 normal_input_little" placeholder="0.00" onkeypress="return valideKey(event);" ></div> 
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label class="marca2">Fecha</label> 
                  <input name="fecha_abono2" class="marca2 normal_input_little" type="date"></div> 
            </div>

            <div class="row">
                <div class="col-md-6 col-sm-12 col-xs-12">
                <label class="marca3">ABONO 3</label> 
                <input  onChange="suma();" name="abono3" style="font-size:16px;" class="cl marca3 normal_input_little" placeholder="0.00" onkeypress="return valideKey(event);"></div>
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label class="marca3">Fecha</label> 
                  <input name="fecha_abono3" class="marca3 normal_input_little" type="date"></div> 
            </div>

            <div class="row">
                <div class="col-md-6 col-sm-12 col-xs-12">
                <label class="marca4">ABONO 4</label> 
                <input  onChange="suma();" name="abono4" style="font-size:16px;" class="cl marca4 normal_input_little" placeholder="0.00" onkeypress="return valideKey(event);"></div>
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label class="marca4">Fecha</label> 
                  <input name="fecha_abono4" class="marca4 normal_input_little" type="date"></div>  
            </div>

            <div class="row">
                <div class="col-md-6 col-sm-12 col-xs-12">
                    <label class="marca">CANCELADO     </label>
                    <input  id="sumAll" style="font-size:20px; background-color:orange"  class="normal_input_little" placeholder="0.00" disabled></div> 
            <div class="col-md-12 col-sm-12 col-xs-12 text-center">  
              <input name="guardar_honorarios" onclick="return confirmar('¿Está seguro que desea guardar el registro?')"type="submit" class="btn btn-main" value="Guardar"></div>  
            </div>
          </fieldset>            
          </form>
      </div>
    </div>
<?php
}


?>


      <?php include("./template/foot.php"); ?>