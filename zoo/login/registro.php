<?php include("../templates/head_registro.php"); ?>

<br><div class="container col-md-4 col-sm-8 col-xs-12">

        <form method="POST" action="../admin/registro.php">
            
            <label for="exampleDropdownFormEmail2">Nombre</label>
                <input name="nombre" class="form-control" id="exampleDropdownFormEmail2" placeholder="Escriba su nombre">
            
            <label for="exampleDropdownFormEmail2">Email address</label>
                <input name="email" type="email" class="form-control" id="exampleDropdownFormEmail2" placeholder="email@example.com">
            
            <label for="exampleDropdownFormPassword2">Password</label>
                <input name="pass" type="password" class="form-control" id="exampleDropdownFormPassword2" placeholder="Password">
            
            <br><button name="registro" type="submit" class="btn btn-primary">Sign in</button>
        </form>

</div>

<?php include("../templates/foot.php"); ?>