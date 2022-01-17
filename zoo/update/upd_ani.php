<?php
    include("../admin/db.php");

    $id = $_GET['id']; 

    $consulta ="SELECT * FROM zoo_animales WHERE zoo_ani_id = $id";
    $respuesta = mysqli_query($conexion,$consulta);
    $row = mysqli_fetch_array($respuesta);

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>FORMULARIO ZOO ANIMALES</title>
</head>
<body style="background-color:gray;">
    
    <header>
        <nav class="navbar navbar-expand-lg navbar-dark bg-success">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">ZOO ANIMAL</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="#">Home</a>
                </li>
                <li class="nav-item">
                <a class="nav-link" href="./listas/lista_ani.php">Listas</a>
                </li>
                <li class="nav-item">
                <a class="nav-link" href="#">Pricing</a>
                </li>
                <li class="nav-item">
                <a class="nav-link disabled">Disabled</a>
                </li>
            </ul>
            </div>
        </div>
        </nav>

    </header>

    <div class="container" style="margin-top:50px" >

        <form method="POST" action="./actualizar_animal.php?id=<?php echo $row['zoo_ani_id'];?>" class="normal_form">

            <div class="input-group mb-3">
                <span class="input-group-text" id="basic-addon2">CODIGO</span>
                <input value="<?php echo $row['zoo_ani_codigo']?>" required name="zooanicodigo" type="text" class="form-control" placeholder="Ingrese el codigo del Animal..." aria-label="Recipient's username" aria-describedby="basic-addon2">
            </div>

            <div class="input-group mb-3">
                <span class="input-group-text" id="basic-addon2">NOMBRE</span>
                <input value="<?php echo $row['zoo_ani_nombre']?>" required name="zooaninombre" type="text" class="form-control" placeholder="Ingrese el nombre del animal..." aria-label="Recipient's username" aria-describedby="basic-addon2">
            </div>
            
            <div class="input-group mb-3">
                <span class="input-group-text" id="basic-addon2">EDAD</span>
                <input value="<?php echo $row['zoo_ani_edad']?>" required name="zooaniedad" onkeypress="return valideKey(event);" class="form-control" placeholder="Ingrese la edad en meses..." aria-label="Recipient's username" aria-describedby="basic-addon2">
            </div>

            <div class="input-group mb-3">
                <span class="input-group-text" id="basic-addon2">PESO</span>
                <input value="<?php echo $row['zoo_ani_peso']?>" required name="zooanipeso" onkeypress="return valideKey(event);" class="form-control" placeholder="Ingrese el peso en KG..." aria-label="Recipient's username" aria-describedby="basic-addon2">
            </div>

            <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon2">COLOR</span>
                  <select name="zooanicolor" required> 
                    <option value="<?php echo $row['zoo_ani_color']?>"><?php echo $row['zoo_ani_color']?></option>
                    <option value="1">NEGRO</option>
                    <option value="2">BLANCO</option>
                    <option value="3">MARRON</option>
                    <option value="4">Otros</option></select>
            </div>

            <input type="submit" name="actualizaranimal" class="btn btn-main" value="Actualizar">
            <input type="submit" name="cancelar" class="btn btn-main" value="Cancelar">
        </div>
    </div>
    
    <script src="./js/script.js"></script>
    
</body>
</html>