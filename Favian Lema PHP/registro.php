<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Login - Registro</title>
  <link rel="shortcut icon" type="image/x-icon" href="./images/favicon.png" />
  <!-- CSS  ================================================== -->
  <!-- Themefisher Icon font -->
  <link rel="stylesheet" href="./admin/plugins/themefisher-font/style.css">
  <!-- bootstrap.min css -->
  <link rel="stylesheet" href="./admin/plugins/bootstrap/css/bootstrap.min.css">
  <!-- Lightbox.min css -->
  <link rel="stylesheet" href="./admin/plugins/lightbox2/dist/css/lightbox.min.css">
  <!-- animation css -->
  <link rel="stylesheet" href="./admin/plugins/animate/animate.css">
  <!-- Slick Carousel -->
  <link rel="stylesheet" href="./admin/plugins/slick/slick.css">
  <!-- Main Stylesheet -->
  <link rel="stylesheet" href="./admin/css/style.css">  
</head>
<body>

<header class="navigation fixed-top">
  <div class="container ">
  <!-- main nav -->
    <nav class="navbar navbar-expand-lg navbar-light">
    <!-- logo -->
      <a class="navbar-brand logo special">
      <img class="logo-default" src="./admin/images/logo_new.jpg" alt="logo" width="250px"/>
      <img class="logo-white" src="./admin/images/logo_new.jpg" alt="logo" width="250px"/></a>
    <!-- /logo -->
    <!--boton-->
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navigation"
      aria-controls="navigation" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
      </button>
    <!--/boton-->
    <div class="collapse navbar-collapse" id="navigation">
      <ul class="navbar-nav ml-auto text-center">
      <li class="nav-item "><a class="nav-link" href="./index.php">Inicio</a></li>
        <li class="nav-item "><a class="nav-link" href="./login.php">Regresar</a></li>
      </ul>
    </div>
    </nav>
  <!-- /main nav -->
  </div>
</header>

<section class="call-to-action">
  <div class="container col-md-6 col-sm-8 col-xs-12">
    <div class="row text-center">
        <form class="normal_form" method="POST" action="./admin/config/login_registrar.php"><br>
          <fieldset>
            <legend name="f1" class="form_title maximus" style="text-align: right;">actualice su contraseña</legend>
            <div class="row">
              <div class="col-md-12 col-sm-12 col-xs-12">
                  <label class="form_log_title">Ingrese su correo</label></div>
              <div class="col-md-12 col-sm-12 col-xs-12">    
                  <input name="correo" type="email" class="form_input" required placeholder="Ingrese su correo"> </div>
              <div class="col-md-12 col-sm-12 col-xs-12">  
                  <label class="form_log_title">Ingrese su ACTUAL contraseña</label></div>
              <div class="col-md-12 col-sm-12 col-xs-12">
                  <input name="contrasena"  type="password" class="form_input" required placeholder="Ingrese su actual contraseña"> </div>
              <div class="col-md-12 col-sm-12 col-xs-12"> 
                  <label class="form_log_title">Ingrese su NUEVA contraseña</label></div>
              <div class="col-md-12 col-sm-12 col-xs-12">    
                  <input name="new_contrasena" type="password" class="form_input" required placeholder="Ingrese su nueva contraseña"> </div>
              <div class="col-md-12 col-sm-12 col-xs-12">  
                  <label class="form_log_title">Ingrese otra vez su NUEVA contraseña</label></div>
              <div class="col-md-12 col-sm-12 col-xs-12">
                  <input name="repetir"  type="password" class="form_input" required placeholder="Ingrese otra vez su nueva contraseña"> </div>
              <div class="col-md-12 col-sm-12 col-xs-12 text-center">  
                <input name="guardar_contrasena" type="submit" class="btn" value="Guardar"></div>
            </div>
          </fieldset>            
        </form>

      </div>  
</section>

  <div class="footer-bottom">
    <h5>Copyright 2021. All rights reserved. Favian & Lema.</h5>
    <h5>Design and Developed by <a href="https://xacq.github.io">Green PC - 2022</a></h5>
  </div>
</footer> 

<!-- end footer -->
    <!-- end Footer Area
    ========================================== -->
    
    <!--Essential Scripts=====================================-->
    <!-- Main jQuery -->     <script src="./admin/plugins/jquery/jquery.min.js"></script>
    <!-- Form Validation --> <script src="./admin/plugins/form-validation/jquery.form.js"></script> 
    			     <script src="./admin/plugins/form-validation/jquery.validate.min.js"></script>
    <!-- Bootstrap4 -->      <script src="./admin/plugins/bootstrap/js/bootstrap.min.js"></script>
    <!-- Parallax -->        <script src="./admin/plugins/parallax/jquery.parallax-1.1.3.js"></script>
    <!-- lightbox -->        <script src="./admin/plugins/lightbox2/dist/js/lightbox.min.js"></script>
    <!-- Owl Carousel -->    <script src="./admin/plugins/slick/slick.min.js"></script>
    <!-- filter -->          <script src="./admin/plugins/filterizr/jquery.filterizr.min.js"></script>
    <!-- Smooth Scroll js --><script src="./admin/plugins/smooth-scroll/smooth-scroll.min.js"></script>
    			     <script src="https://kit.fontawesome.com/d75b2af698.js" crossorigin="anonymous"></script>
    <!-- Custom js -->	     <script src="./admin/js/script.js"></script>

  </body>
  </html>

