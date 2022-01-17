<?php include("../templates/head.php"); 

if (isset($_SESSION['login']) != true){
    session_destroy();
    header("location:../index.php");
}

?>

    <div class="container" style="margin-top:50px" >

        <form method="POST" action="./rec/guardar_animal.php" class="normal_form">

            <div class="input-group mb-3">
                <span class="input-group-text" id="basic-addon2">CODIGO</span>
                <input required name="zooanicodigo" type="text" class="form-control" placeholder="Ingrese el codigo del Animal..." aria-label="Recipient's username" aria-describedby="basic-addon2">
            </div>

            <div class="input-group mb-3">
                <span class="input-group-text" id="basic-addon2">NOMBRE</span>
                <input required name="zooaninombre" type="text" class="form-control" placeholder="Ingrese el nombre del animal..." aria-label="Recipient's username" aria-describedby="basic-addon2">
            </div>
            
            <div class="input-group mb-3">
                <span class="input-group-text" id="basic-addon2">EDAD</span>
                <input required name="zooaniedad" onkeypress="return valideKey(event);" class="form-control" placeholder="Ingrese la edad en meses..." aria-label="Recipient's username" aria-describedby="basic-addon2">
            </div>

            <div class="input-group mb-3">
                <span class="input-group-text" id="basic-addon2">PESO</span>
                <input required name="zooanipeso" onkeypress="return valideKey(event);" class="form-control" placeholder="Ingrese el peso en KG..." aria-label="Recipient's username" aria-describedby="basic-addon2">
            </div>

            <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon2">COLOR</span>
                  <select name="zooanicolor" required> 
                    <option value="">Seleccione un opción</option>
                    <option value="1">NEGRO</option>
                    <option value="2">BLANCO</option>
                    <option value="3">MARRON</option>
                    <option value="4">Otros</option></select>
            </div>

            <input type="submit" name="guardaranimal" class="btn btn-main" value="Ingresar">
            <input type="submit" name="cancelar" class="btn btn-main" value="Cancelar">
        </div>
    </div>
    <?php include("../templates/foot.php"); ?>