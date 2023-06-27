
<div class="navbar-fixed">
    <nav class="navbar">
        <div class="nav-wrapper  grey darken-4 navbarshadow">
            <ul id="nav-mobile" class="right hide-on-med-and-down">
                <?php
                    if ($_SESSION['login_rol'] == "ADMIN") { ?>
                        <li><a style="color:whitesmoke;font-size:20px;">
                            <i class="material-icons left">admin_panel_settings</i>Bienvenido <?php echo $_SESSION['login_name']?></a>
                        </li>
                <?php }
                    else { ?>
                        <li><a style="color:whitesmoke;font-size:20px;">
                            <i class="material-icons left">account_box</i><?php echo $_SESSION['login_name']?></a>
                        </li>
                <?php } ?>
                <li><a style="color:whitesmoke;font-size:20px;" href="./dashboard.php">
                    <i class="material-icons left">home</i>Inicio</a></li>
                <li><a style="color:whitesmoke;font-size:20px;" href="./config/exit.php">
                    <i class="material-icons left">logout</i>Cerrar Sesión</a></li>
            </ul>
        </div>
  </nav>
</div>
  
  <ul id="sidenav-left" class="sidenav sidenav-fixed grey darken-4" style="transform: translateX(0px);">
    <li>
        <div class="user-view center">
            <div>
            <img style="background-color: whitesmoke;" src="./assets/img/favicon.png" width="130px">
            <a style="color:whitesmoke;font-size:30px;" href="www.jaapssa.com">JAPPSSA </a>
            </div>    
        </div>
    </li>
    <li><div class="divider"></div></li>
    <li><a style="color:whitesmoke;font-size:20px;" class="waves-effect" href="./dashboard.php"><i class="material-icons left white-text">dashboard</i>Dashboard</a></li>
    <li><a style="color:whitesmoke;font-size:20px;" class="waves-effect" href="./ventas.php"><i class="material-icons left white-text">description</i>Ventas</a></li>
    <li><a style="color:whitesmoke;font-size:20px;" class="waves-effect" href="./conexion.php"><i class="material-icons left white-text">handyman</i>Conexión / Multas</a></li>
    <li><a style="color:whitesmoke;font-size:20px;" class="waves-effect" href="./lecturas.php"><i class="material-icons left white-text">receipt_long</i>Lecturas</a></li>
    <li><a style="color:whitesmoke;font-size:20px;" class="waves-effect" href="./compras.php"><i class="material-icons left white-text">shopping_bag</i>Compras</a></li>
    <li><a style="color:whitesmoke;font-size:20px;" class="waves-effect" href="./inventario.php"><i class="material-icons left white-text">inventory</i>Inventario</a></li>
    <li><a style="color:whitesmoke;font-size:20px;" class="waves-effect" href="./clientes.php"><i class="material-icons left white-text">assignment_ind</i>Clientes</a></li>
    <li><a style="color:whitesmoke;font-size:20px;" class="waves-effect" href="./empleados.php"><i class="material-icons left white-text">engineering</i>Empleados</a></li>
    <li><div class="divider"></div></li>
    <li><a style="color:whitesmoke;font-size:20px;" class="waves-effect" href="./config/exit.php"><i class="material-icons left white-text">logout</i>Cerrar Sesión</a></li>
  </ul>

  <!--a href="#" data-target="slide-out" class="brand-logo sidenav-trigger black-text"><i class="material-icons small">reorder</i></a-->
  