<?php
  session_start();
  $_SESSION['login']=false;

  include("./config/link.php");
  if (isset($_POST['login'])){
      $email = $_POST['email'];
      $pass = $_POST['password'];

      //$pass = hash('sha512',$pass);
      
      $datos = "SELECT * FROM usuarios WHERE usuario = '$email' AND contrasenia = '$pass'";
      $consulta = $conectar->query($datos);
      if ($consulta){
        $row_rec = mysqli_fetch_array($consulta);
        if ($row_rec){
            $_SESSION['login'] = true;
            $_SESSION['login_name'] = $row_rec['nombres'];
            $_SESSION['login_lastname'] = $row_rec['apellidos'];
            $_SESSION['login_rol'] = $row_rec['rol'];
            $_SESSION['login_id'] = $row_rec['id_usuario'];
            $_SESSION['login_correo'] = $row_rec['email'];
            $correo = $row_rec['email'];
            $sql ="INSERT INTO registro (id,correo,fecha) VALUES ('','$correo', current_timestamp())";
            if ($conectar->query($sql)){
              mysqli_close($conectar);
              echo '<script>window.location="./dashboard.php"</script>';
            }
        }
        else {
          echo '<script>alert("USUARIO NO REGISTRADO")</script>';
          unset($_POST);
          mysqli_close($conectar);
          //echo '<script>window.location="./login.php"</script>';
        }
      }
      else {
        echo '<script>alert("USUARIO NO REGISTRADO")</script>';
        mysqli_close($conectar);
        unset($_POST);
        //echo '<script>window.location="./login.php"</script>';
      }
  } 
  else {
    require_once("./templates/head_login.php")
?>

<body>
<video src="../sistema/assets/img/VT1.mp4" autoplay="true" muted="true" loop="true"></video>

    <main>

   <div class="container">
      <div class="row">
      <form class="form right login" action="./login.php" method="POST">
            <div class="form_container center"> 
                <h4 class="form_title">Ingreso al sistema JAAPSSA</h4>

                <div class="row">
                  <div class="input-field col s8 offset-s2">
                    <i class="material-icons prefix ">alternate_email</i>
                    <input id="email" type="text" class="validate" required name="email">
                    <label for="email">Nombre</label>
                    <span class="helper-text " data-error="wrong" data-success="right">INGRESE NOMBRE DE USUARIO</span>
                  </div>
                </div>  
                <div class="row">
                  <div class="input-field col s8 offset-s2">
                    <i class="material-icons prefix ">password</i>
                    <input id="password" type="password" class="validate" required name="password">
                    <label for="password" >Password</label>
                    <span class="helper-text " data-error="wrong" data-success="right">INGRESE CONTRASEÑA DE USUARIO</span>
                  </div>
                </div>

                <div class="row">
                  <button class="btn waves-effect waves-light grey darken-3" 
                    type="submit" name="login">Ingresar
                    <i class="material-icons right">send</i></button>
                </div>
            </div>
        </form>
      </div>
        
    </div>
    </main>
<?php
require_once("./templates/foot.php");
}
?>


