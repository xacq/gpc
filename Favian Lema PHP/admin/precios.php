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

    <div class="container">
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
                 <li class="nav-item "><a class="nav-link" href="./sistema.php">inicio</a></li>
              </ul>
            </div>
          </nav>
        </div>
      </header>

      <div class="container">

        <form class="normal_form" action="./actions/calculo_honorarios.php" method="POST">
          <p class="normal_linea"><br>SECCION HONORARIOS</p>
          <legend class="form_title maximus" style="background-color: orange; color:black;">ACTUALIZACION</legend>
          <fieldset>
            <legend class="form_title maximus" style="text-align: right;">Ingrese el codigo del cliente</legend>
            <div class="row">
              <div class="col-md-3 col-sm-1 col-xs-1"></div>
              <div class="col-md-6 col-sm-10 col-xs-10">
                  <label >CODIGO</label> 
                  <input name="codigo" class="normal_input_little" style="text-transform: uppercase;" required></div>
              <div class="col-md-12 col-sm-12 col-xs-12 text-center">  
              <input name="buscar_honorarios" type="submit" class="btn btn-main" value="Buscar"></div>  
            </div>  
          </fieldset>            
          </form>
          </div>
 
<?php include("./template/foot.php"); ?>
