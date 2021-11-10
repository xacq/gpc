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
                 <li class="nav-item "><a class="nav-link" href="./sistema.php">inicio</a></li>
              </ul>
            </div>
          </nav>
          <!-- /main nav -->
        </div>
      </header>

      <div class="container ">
        <form class="normal_form" action="./actions/registrar_agenda.php" method="POST">
          <p class="normal_linea"><br>AGENDA</p>
          <fieldset>
            <legend class="form_title maximus" style="text-align: right;">fecha a recordar</legend>
            <div class="row">
              <div class="col-md-6 col-sm-12 col-xs-12">
                <label >Fecha</label> 
                  <input id="date" name="fav_age_fecha" class="normal_input_little" type="date" required> </div>
                <div class="col-md-6 col-sm-12 col-xs-12">  
                  <label for="agenda">Tareas</label> 
                  <select name="fav_age_tareas" class="normal_input_little" required> 
                    <option value="">Seleccione una opción</option>
                    <option value="Gestión de despacho">Gestión de despacho</option>
                    <option value="Tareas">Tareas</option>
                    <option value="Recordar Diligencias">Recordar Diligencias</option>
                    <option value="Citaciones">Citaciones</option>
                    <option value="Carteles">Carteles</option>
                    <option value="Extractos">Extractos</option>
                    <option value="Solicitar Audiencia">Solicitar Audiencia</option>
                    <option value="Solicitar Inspección">Solicitar Inspección</option>
                    <option value="Audiencia" style="background:orange">Audiencia</option>
                    <option value="Inspección" style="background:orangered">Inspección</option>
                    <option value="Apelación">Apelación</option>
                    <option value="Casación">Casación</option>
                    <option value="Otros">Otros</option></select></div>              
                <div class="col-md-12 col-sm-12 col-xs-12">  
                <label >Detalle</label> 
                  <input name="fav_age_descripcion" class="normal_input_big" type="text" maxlength="150" required> </div>              
              <div class="col-md-12 col-sm-12 col-xs-12 text-center">  
                <input name="guardar_agenda" type="submit" class="btn" value="Guardar" onclick="return confirmar('¿Está seguro que desea guardar esta agenda?')"></div>
            </div>
          </fieldset>            
        </form>
      </div>

      <?php include("./template/foot.php"); ?>
