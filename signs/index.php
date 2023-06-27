<?php
    require_once("./config/link.php");
    $update_expresion = 0;
    if (isset($_POST['newone'])) {
        $name = $_POST['word'];
        $description = $_POST['description'];
        $opcion = $_POST['opcion'];
        $nombre = $_FILES['foto']['name'];
        $tamanio = $_FILES['foto']['size'];
        $dir = "./signs/";
        $tamano = 4000; 
        $permitidos = array('gif');
        $ruta_carga= $dir.$_FILES['foto']['name'];
        $arregloArchivo = explode(".",$_FILES['foto']['name']);
        $extension = strtolower(end($arregloArchivo)); //extensiones
        $mensaje="El gif ya existe en la base de datos";
        if (!file_exists($dir)){ 
            mkdir($dir,0777);    
            }
        else{
            if ($tamanio < ($tamano*1024)){
                if (move_uploaded_file($_FILES['foto']['tmp_name'],$ruta_carga)){
                    $sql = "INSERT INTO gifs (name, descripcion, opcion, path) VALUES ('$name','$description','$opcion','$ruta_carga')";
                    $resultado = mysqli_query($conectar, $sql);    
                    echo "<script> alert('Fotografía guardada');</script>";
                }else{
                    echo "<script> alert('Fotografía no guardada');</script>";
                }
            }else{
                echo "<script> alert('Fotografía no guardada');</script>";
            }  
        }
    }
    elseif (isset($_POST['lookfor'])) {
        $buscar = $_POST['buscar'];
        if ($buscar != ''){
            $sql = "SELECT * FROM gifs WHERE name = '$buscar'";
            $result = mysqli_query($conectar, $sql);
            if (mysqli_num_rows($result) > 0) {
                $update_expresion = 1;
                $row = mysqli_fetch_array($result);
            }       
        }
        else{
            echo "<script> alert('Fotografía no encontrada');</script>";
        }
    }
    elseif (isset($_POST['actualizar'])) {
        $id = $_GET['id'];
        $name = $_POST['word'];
        $description = $_POST['description'];
        $opcion = $_POST['opcion'];

        $nombre = $_FILES['foto']['name'];
        $tamanio = $_FILES['foto']['size'];
        $dir = "./signs/";
        $tamano = 4000; 
        $permitidos = array('gif');
        $ruta_carga= $dir.$_FILES['foto']['name'];
        $arregloArchivo = explode(".",$_FILES['foto']['name']);
        $extension = strtolower(end($arregloArchivo)); //extensiones
        $mensaje="El gif ya existe en la base de datos";
        if (!file_exists($dir)){ 
            mkdir($dir,0777);    
            }
        else{
            if ($tamanio < ($tamano*1024)){
                if (move_uploaded_file($_FILES['foto']['tmp_name'],$ruta_carga)){
                    $sql = "UPDATE gifs SET 
                            name='$name',
                            descripcion='$description',
                            opcion='$opcion',
                            path='$ruta_carga' 
                            WHERE  id = $id";
                    $resultado = mysqli_query($conectar, $sql);    
                    echo "<script> alert('Fotografía guardada');</script>";
                    $update_expresion = 0;
                }else{
                    echo "<script> alert('Fotografía no guardada 1');</script>";
                }
            }else{
                echo "<script> alert('Fotografía no guardada 2 ');</script>";
            }  
        }
    }
    elseif (isset($_POST['update_db'])) {
        $db = $_POST['newdb'];
    }
    elseif (isset($_POST['traducir'])){
        $frase = $_POST['frase'];
        $array = explode (" ", $frase );
        $update_expresion=2;
    }
?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="LSEC Lenguaje de Señas Ecuatoriano">
    <meta name="author" content="UPS">   
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
    <link rel="stylesheet" href="./css/sso.css">
    <link rel="stylesheet" href="./css/materialize.css">
    <link rel="icon" href="./img/icono.png" type="image/x-icon">
    <title>LSEC</title>
</head>
<body>

<ul id="slide-left" class="sidenav purple darken-4" style="transform: translateX(0px);">
    <li>
        <div class="user-view center">
            <div>
            <img src="./img/icono.png" width="130px">
            <a style="color:#e8eaf6 ;font-size:50px;" href="#">EcuSign</a>
            </div>    
        </div>
    </li>
    <br>
    <li><div style="color:#e8eaf6;" class="divider"></div></li>
    <li class="deep-purple lighten-2">
        <a style="color:#e8eaf6 ;font-size:20px;" href="./index.html" class="modal-trigger">
        <i class="material-icons deep-purple-text text-lighten-5 small">home</i>Home</a></li>
    <li class="deep-purple lighten-2">
        <a style="color:#e8eaf6 ;font-size:20px;" href="#modal1" class="modal-trigger">
        <i class="material-icons deep-purple-text text-lighten-5 small">add_circle_outline</i>Add Gif</a></li>
    <?php if ($update_expresion == 0 ) {?>
        <li class="deep-purple lighten-2">
            <a style="color:#e8eaf6 ;font-size:20px;" href="#modal2" data-target="modal2" class="modal-trigger">
            <i class="material-icons deep-purple-text text-lighten-5 small">upgrade</i>Update Gif</a></li>
    <?php } elseif ($update_expresion == 1){?>
        <li class="deep-purple lighten-4">
            <a style="font-size:20px;" href="#modal2" class="modal-trigger purple-text text-lighten-1 small">
            <i class="material-icons purple-text text-lighten-1 small">upgrade</i>Ready to Update</a></li>
    <?php } elseif ($update_expresion == 2){?>
        <li class="deep-purple lighten-2">
            <a style="color:#e8eaf6 ;font-size:20px;" href="#modal2" class="modal-trigger">
            <i class="material-icons deep-purple-text text-lighten-5 small">upgrade</i>Update Gif</a></li>
    <?php }?>
    <li class="deep-purple lighten-2">
        <a style="color:#e8eaf6 ;font-size:20px;" href="#modal3" class="modal-trigger">
        <i class="material-icons deep-purple-text text-lighten-5 small">list</i>Lists of expressions</a></li>
    <li class="deep-purple lighten-2">
        <a style="color:#e8eaf6 ;font-size:20px;" href="#modal4" class="modal-trigger">
        <i class="material-icons deep-purple-text text-lighten-5 small">account_tree</i>Database</a></li>
</ul>

  <!-- Modal Structure -->
  <div id="modal1" class="modal ">
    <div class="modal-content  deep-purple lighten-2">
    <img src="./img/icono.png" width="100px"><h4 style="color:#e8eaf6 ;">ADD GIF</h4>
    </div>
    <div class="row">
        <form action="./index.php" method="post" enctype="multipart/form-data">
            <div class="input-field col s12 l12 m12">
                <i class="material-icons prefix">translate</i>
                <input id="icon" type="text" class="validate lower" name="word">
                <label for="icon">Word</label>
            </div>
            <div class="input-field col s12 l12 m12">
                <i class="material-icons prefix">description</i>
                <input id="prefix" type="text" class="validate" name="description">
                <label for="prefix">Description</label>
            </div>
            <div class="input-field col s12 l12 m12">
                <select name="opcion">
                <option value="" disabled selected>Choose an option</option>
                <option value="1">Char</option>
                <option value="2">Word</option>
                <option value="3">Sentence</option>
                </select>
                <label>Type of input</label>
            </div>
            <div class="file-field input-field col s6 l6 m6">
                <div class="btn  purple darken-4">
                    <span>GIF</span>
                    <input type="file" name="foto" id="seleccionArchivos">
                </div>
                <div class="file-path-wrapper">
                    <input class="file-path validate" type="text" name="foto">
                </div>
            </div>
            <div class="col s12 m12 l6">
                <div class="card">
                    <div class="card-image">
                        <img id="imagenPrevisualizacion" alt="Gif" width="100px">
                    </div>
                </div>
            </div>
            
            <div class="col s12 m12 l12 center">
                <button class="btn waves-effect waves-light purple darken-4 btn-large pulse" type="submit" name="newone">Save
                    <i class="material-icons small right indigo-text text-lighten-5">save</i>
                </button>
            </div>   
        </form>
    </div>
    <div class="modal-footer deep-purple lighten-2">
      <a href="#!" class="modal-close waves-effect waves-green btn purple darken-4">EXIT</a>
    </div>
  </div>


    <!-- Modal Structure -->
    <div id="modal2" class="modal">
        <div class="modal-content  deep-purple lighten-2">
            <img src="./img/icono.png" width="100px"><h4 style="color:#e8eaf6 ;">UPDATE GIF</h4>
        </div><br>
        <div class="row">
            <form action="./index.php" method="post">
                <div class="input-field col s6 l6 m6">
                    <i class="material-icons prefix">translate</i>
                    <input id="icon_prefix" type="text" class="validate lower" name="buscar">
                    <label for="icon_prefix">Word</label>
                </div>
                <div class="col s6 m6 l6 center">
                    <button class="btn waves-effect waves-light purple darken-4 btn-large pulse" type="submit" name="lookfor">Look for
                        <i class="material-icons small right indigo-text text-lighten-5">search</i>
                    </button>
                </div>   
            </form>
        </div> 
        <?php if ($update_expresion == 1 ) {?>
        <div class="row">
            <form action="./index.php?id=<?php echo $row['id'];?>" method="post" enctype="multipart/form-data">
                <div class="input-field col s12 l12 m12">
                    <i class="material-icons prefix">translate</i>
                    <input id="icon" type="text" class="validate lower" name="word" value="<?php echo $row['name'] ?>">
                    <label for="icon">Word</label>
                </div>
                <div class="input-field col s12 l12 m12">
                    <i class="material-icons prefix">description</i>
                    <input id="prefix" type="text" class="validate" name="description"value="<?php echo $row['descripcion'] ?>">
                    <label for="prefix">Description</label>
                </div>
                <div class="input-field col s12 l12 m12">
                    <select name="opcion">
                    <option value="<?php echo $row['opcion'] ?>" disabled selected><?php echo $row['opcion'] ?></option>
                    <option value="1">Char</option>
                    <option value="2">Word</option>
                    <option value="3">Sentence</option>
                    </select>
                    <label>Type of input</label>
                </div>
                <div class="file-field input-field col s6 l6 m6">
                    <div class="btn  purple darken-4">
                        <span>GIF</span>
                        <input type="file" id="seleccionArchivos" name="foto" >
                    </div>
                    <div class="file-path-wrapper">
                        <input class="file-path validate" type="text" name="foto" >
                    </div>
                </div>
                <div class="col s6 m6 l6">
                    <div class="card">
                        <div class="card-image">
                            <img src="<?php echo $row['path'] ?>" alt="Gif" id="imagenPrevisualizacion">
                        </div>
                    </div>
                </div>
                
                <div class="col s12 m12 l12 center">
                    <button class="btn waves-effect waves-light purple darken-4 btn-large pulse" type="submit" name="actualizar">Update
                        <i class="material-icons small right indigo-text text-lighten-5">save</i>
                    </button>
                </div>   
            </form>
        </div>
        <?php }?>
        <div class="modal-footer deep-purple lighten-2">
            <a href="#!" class="modal-close waves-effect waves-green btn purple darken-4">EXIT</a>
        </div>
    </div>


    <!-- Modal Structure -->
    <div id="modal3" class="modal">
        <div class="modal-content deep-purple lighten-2">
        <img src="./img/icono.png" width="100px">
        <h4 style="color:#e8eaf6 ;">LIST OF EXPRESSIONS</h4>
        </div>
        <div class="row">
            <div class="row">
                <div class="col m12 s12 ">
                    <h4 class="form_title center colver">List of Expresions</h4>
                </div>    
            </div>

            <table class="highlight centered responsive-table">
                <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Categoria</th>
                    <th>Descripcion</th>
                    <th>Foto</th>
                </tr>
                </thead>
                <tbody>
                <?php 
                    $query = "SELECT * FROM gifs";
                    $resultado = mysqli_query($conectar, $query);
                    while ($row1 = mysqli_fetch_array($resultado) ) { 
                ?>   
                    <tr>
                        <td><?php echo $row1['name'];?></td>
                        <td><?php 
                                if ($row1['opcion'] == '1'){
                                    echo 'Char';
                                    }
                                if ($row1['opcion'] == '2'){
                                    echo 'Word';
                                    }
                                if ($row1['opcion'] == '3'){
                                    echo 'Sentence';
                                }
                                ?></td>
                        <td><?php echo $row1['descripcion'];?></td>
                        <td><img src="<?php echo $row1['path']?>" alt="" width="50px"></td>
                    </tr>
                    <?php }?>
                </tbody>
            </table>
            </div>
        <div class="modal-footer deep-purple lighten-2">
        <a href="#!" class="modal-close waves-effect waves-green btn purple darken-4">EXIT</a>
        </div>
    </div>

    </div>


  <!-- Modal Structure -->
  <div id="modal4" class="modal ">
    <div class="modal-content deep-purple lighten-2">
    <img src="./img/icono.png" width="100px">
      <h4 style="color:#e8eaf6 ;">DATABASE</h4>
    </div>
    <div class="row">
            <div class="input-field col s12 l12 m12">
                <i class="material-icons prefix">account_tree</i>
                <input id="prefix" type="text" class="validate" value="<?php echo $bd?>" readonly>
                <label for="prefix">DataBase</label>
            </div>
    </div>
    <div class="modal-footer deep-purple lighten-2">
      <a href="#!" class="modal-close waves-effect waves-green btn purple darken-4">EXIT</a>
    </div>
  </div>


<div class="container left" style="margin-left:150px;margin-top:20px;padding-left:150px; width:80%;">
    <div class="row">
        <div class="deep-purple lighten-2">
            <h5 class="indigo-text text-lighten-5">Text Translator to Ecuadorian Sign Language.</h5>
            <h3 class="indigo-text text-lighten-5">Let's work together for a more inclusive world.</h3>
        </div>
    </div>
    <form action="./index.php" method="post">
        <div class="row">
            <div class="input-field col s6 m6 l6">
                <textarea id="textarea1" class="materialize-textarea upper" name="frase" ></textarea>
                <label for="textarea1">Write words</label>
            </div>
            <div class="col s6 m6 l6">
                <button class="btn waves-effect waves-light purple darken-4 btn-large pulse" type="submit" name="traducir">Translate
                    <i class="material-icons small right indigo-text text-lighten-5">send</i>
                </button>
            </div>  
        </div>
    </form>
    <div class="row center">
        <div class="col s10 m8 l6 center">
        <div class="carousel carousel-slider">            
                    <?php if ($update_expresion == 2) {
                        $update_expresion = 0;
                        foreach ( $array as $palabra ) {
                            $sql = "SELECT * FROM gifs WHERE name = '$palabra'";
                            $result = mysqli_query($conectar, $sql);
                            if (mysqli_num_rows($result) > 0) {
                                $update_expresion = 2;
                                $row = mysqli_fetch_array($result);
                                ?>                                  
                                <a class="carousel-item" href="#<?php echo $row['id']?>!">
                                    <img src="<?php echo $row['path']?>"><?php echo $row['name']?>
                                </a><?php
                            }
                            else{
                                $arreglo = str_split($palabra);
                                foreach ($arreglo as $reg) {
                                    $sql = "SELECT * FROM gifs WHERE name = '$reg'";
                                    $result = mysqli_query($conectar, $sql);
                                    if (mysqli_num_rows($result) > 0) {
                                        $update_expresion = 1;
                                        $row = mysqli_fetch_array($result);
                                        ?>                                  
                                        <a class="carousel-item upper" href="#<?php echo $row['id']?>!">
                                            <img src="<?php echo $row['path']?>"><?php echo $row['name']?>
                                        </a><?php
                                    }
                                }
                            }                        
                        }
                    } ?>    
            </div>
        </div>

    </div> 
        <br>
      <div class="row center">
        
        <div class="col s6 m6 l6 center">
          <div class="btn green prev waves-effect">Anterior</div>          
		</div>
        
        <div class="col s6 m6 l6 center">          
          <div class="btn green next waves-effect">Siguiente</div>
		</div>
      </div>

</div> 


<script type="text/javascript" src="./js/materialize.js"></script>

<script>
    document.addEventListener('DOMContentLoaded', function() {
        M.AutoInit();
        var instance = M.Tabs.init(elems);
    });
</script> 

<script>
    $('#textarea1').val('');
    M.textareaAutoResize($('#textarea1'));
</script>

<script>
 $(document).ready(function(){
    $('.carousel').carousel({
        noWrap : true,
        dist: 0,
        numVisible : 20,
      	indicators : true,
      	padding : 230
    });
    $('.next').click(function() {
        $('.carousel').carousel('next');    });
    $('.prev').click(function() {
        $('.carousel').carousel('prev');    });
  });
</script>

<script>
  $(document).ready(function(){
    $('.modal').modal();
  });
</script>

  <script>
    $(document).ready(function(){
    $('select').formSelect();
  });
    </script>
  
<script>
    //CODIGO PARA PREVISUALIZAR IMAGEN GIF EN LA PANTALLA
    const $seleccionArchivos = document.querySelector("#seleccionArchivos"),
    $imagenPrevisualizacion = document.querySelector("#imagenPrevisualizacion");// Escuchar cuando cambie
    $seleccionArchivos.addEventListener("change", () => {  // Los archivos seleccionados, pueden ser muchos o uno
    const archivos = $seleccionArchivos.files;  // Si no hay archivos salimos de la función y quitamos la imagen
    if (!archivos || !archivos.length) {
        $imagenPrevisualizacion.src = "";
        return;
    }  // Ahora tomamos el primer archivo, el cual vamos a previsualizar
    const primerArchivo = archivos[0];  // Lo convertimos a un objeto de tipo objectURL
    const objectURL = URL.createObjectURL(primerArchivo);  // Y a la fuente de la imagen le ponemos el objectURL
    $imagenPrevisualizacion.src = objectURL;
});
</script>

</body>
</html>