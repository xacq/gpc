<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>FAVIAN & LEMA - Sistema</title>
    <link rel="stylesheet" href="./css/style.css">
    <link rel="shortcut icon" type="image/x-icon" href="../images/favicon.png" />

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
            <a class="navbar-brand logo" href="#footer">
              <img class="logo-default" src="./images/logo_new.jpg" alt="logo" width="200px"/>
              <img class="logo-white" src="./images/logo_new.jpg" alt="logo" width="200px"/></a>
            <!-- /logo -->
            <!--boton-->
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navigation"
              aria-controls="navigation" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>
            <!--/boton-->
            <div class="collapse navbar-collapse" id="navigation">
              <ul class="navbar-nav ml-auto text-center">s
                <li class="nav-item dropdown active">
                  <a class="nav-link dropdown-toggle" id="navbarDropdown" role="button" data-toggle="dropdown"
                    aria-haspopup="true" aria-expanded="false">Agenda</a>
                  <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item"  href="./agenda.php">Nueva</a>
                    <a class="dropdown-item" href="./lists/lists_agenda.php">Lista general</a>
                  </div>
                </li>
                <li class="nav-item dropdown active">
                  <a class="nav-link dropdown-toggle" id="navbarDropdown" role="button" data-toggle="dropdown"
                    aria-haspopup="true" aria-expanded="false">Clientes</a>
                  <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item"  href="./clientes.php">Buscar</a>
                    <a class="dropdown-item" href="./lists/lists_cliente.php">Lista general</a>
                  </div>
                </li>
                <li class="nav-item dropdown active">
                  <a class="nav-link dropdown-toggle" id="navbarDropdown" role="button" data-toggle="dropdown"
                    aria-haspopup="true" aria-expanded="false">Nuevo Cliente</a>
                  <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item"  href="./familia.php">Familia</a>
                    <a class="dropdown-item" href="./civil.php">Civil</a>
                    <a class="dropdown-item" href="./penal.php">Penal</a>
                    <a class="dropdown-item" href="./constitucional.php">Constitucional</a>
                    <a class="dropdown-item" href="./agua.php">Senagua</a>
                    <a class="dropdown-item" href="./subtierras.php">Subtierras</a>
                    <a class="dropdown-item" href="./varios.php">Varios</a>
                  </div>
                </li>
                <li class="nav-item dropdown active">
                  <a class="nav-link dropdown-toggle" id="navbarDropdown" role="button" data-toggle="dropdown"
                    aria-haspopup="true" aria-expanded="false">Honorarios</a>
                  <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" href="./honorarios_nuevo.php">Nuevo</a>
                    <a class="dropdown-item" href="./precios.php">Buscar</a>
                  </div>
                </li>
                <li class="nav-item dropdown active">
                  <a class="nav-link dropdown-toggle" id="navbarDropdown" role="button" data-toggle="dropdown"
                    aria-haspopup="true" aria-expanded="false">Listas</a>
                  <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item"  href="./lists/lists_familia.php">Familia</a>
                    <a class="dropdown-item" href="./lists/lists_civil.php">Civil</a>
                    <a class="dropdown-item" href="./lists/lists_penal.php">Penal</a>
                    <a class="dropdown-item" href="./lists/lists_constitucional.php">Constitucional</a>
                    <a class="dropdown-item" href="./lists/lists_agua.php">Senagua</a>
                    <a class="dropdown-item" href="./lists/lists_subtierras.php">Subtierras</a>
                    <a class="dropdown-item" href="./lists/lists_varios.php">Varios</a>
                  </div>
                </li>
                <li class="nav-item dropdown active">
                  <a class="nav-link dropdown-toggle" id="navbarDropdown" role="button" data-toggle="dropdown"
                    aria-haspopup="true" aria-expanded="false">Eliminar</a>
                  <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <a class="dropdown-item"  href="./clientes_eliminar.php">Buscar cliente</a>
                  </div>
                </li>
                <li class="nav-item dropdown active">
                  <a class="nav-link dropdown-toggle" id="navbarDropdown" role="button" data-toggle="dropdown"
                    aria-haspopup="true" aria-expanded="false">Usuarios</a>
                  <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <a class="dropdown-item"  href="./lists/lists_usuarios.php">Lista de Usuarios</a>
                  <a class="dropdown-item"  href="./lists/lists_ingresos.php">Registro de Ingresos</a>
                  </div>
                </li>
                <li class="nav-item "><a class="nav-link" href="./exit.php">Salir</a></li>
              </ul>
            </div>
          </nav>
          <!-- /main nav -->
        </div>     
      </header>

      

      
      <div class="container "><br>
        <form class="normal_form">
          <p class="normal_linea maximus"><br>Agenda para hoy</p>
          <legend class="form_title" style="text-align: right;">Fecha: <?php echo date("j/n/Y"); ?> </legend>
            <div class="table-responsive">
              <table class="table table-hover">
                <thead class="text-center maximus">
                  <tr>
                  <th scope="col">Tarea</th>
                  <th scope="col">Detalle</th>
                  </tr>
                </thead>
              <tbody>
                <?php
                include("./config/db.php");
                $query = "SELECT * FROM fav_agenda WHERE fav_age_fecha = CURDATE()";
                $resultado = mysqli_query($conexion, $query);
                while ($row = mysqli_fetch_array($resultado)){?>
                  <tr>
                    <td
                    <?php if($row['fav_age_tareas']=="Audiencia")
                                print('class="text-center maximus" style="background:orange;"');
                              elseif ($row['fav_age_tareas']=="Inspección")   
                                print('class="text-center maximus" style="background:orangered; color:white;"');
                          else print('class="text-center maximus"');?>><?php echo $row['fav_age_tareas']?></td>
                    <td><?php echo $row['fav_age_descripcion']?></td>
                  </tr>
                <?php  } ?>
              </tbody>
            </table>
          </div>     
        </form>
      </div>
        
      <?php include("./template/foot.php"); ?>
