<?php include("./template/head.php"); ?>


      <div class="container"> 
        <form class="normal_form" method="POST" action="./actions/buscar_cliente.php">
          <p class="normal_linea"><br>SECCION CLIENTES</p>
          <fieldset>
            <legend class="form_title maximus" style="text-align: right;">Ingrese el codigo del cliente</legend>
            <div class="row">
            <div class="col-md-3 col-sm-3 col-xs-1"></div>
              <div class="col-md-6 col-sm-6 col-xs-10">
                  <label >CODIGO</label> 
                  <input name="codigo" class="normal_input_little maximus" ></div>
            </div>
          </fieldset>       
          <div class="col-md-12 col-sm-12 col-xs-12 text-center">  
            <input name="buscar_cliente" type="submit" class="btn btn-main" value="BUSCAR"></div>  
          </form>

        <form class="normal_form" method="POST" action="./actions/buscar_nombre.php">
          <p class="normal_linea"><br>SECCION CLIENTES</p>
          <fieldset>
            <legend class="form_title maximus" style="text-align: right;">Ingreso el nombre del cliente</legend>
            <div class="row">
            <div class="col-md-3 col-sm-3 col-xs-1"></div>
              <div class="col-md-6 col-sm-6 col-xs-10">
                  <label >NOMBRE</label> 
                  <input name="nombre" class="normal_input_little maximus" ></div>
            </div>
          </fieldset>       
          <div class="col-md-12 col-sm-12 col-xs-12 text-center">  
            <input name="buscar_nombre" type="submit" class="btn btn-main" value="BUSCAR"></div>  
          </form>
      </div>
<?php include("./template/foot.php"); ?>
