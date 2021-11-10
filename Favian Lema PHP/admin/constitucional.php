<?php include("./template/head.php"); ?>

      <div class="container ">
        <form class="normal_form" method="POST" action="./actions/registrar_constitucional.php">
          <p class="normal_linea"><br>SECCION CONSTITUCIONAL</p>
          <fieldset>
            <legend class="form_title maximus" style="text-align: right;">Datos del caso</legend>
            <div class="row">
              <div class="col-md-6 col-sm-6 col-xs-12">
                  <label >CODIGO</label> 
                  <input name="codigo" class="normal_input_little"  style="text-transform: uppercase;" required></div>
            </div>
              <div class="row">
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label >Nro Proceso</label> 
                  <input name="proceso" class="normal_input_little" type="text" ></div>
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label >Nombre del Juez</label> 
                  <input name="juez" class="normal_input_little" type="text" ></div> </div>

                <div class="row">
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label class="marca1">Cliente</label> 
                  <select name="cliente" class="normal_input_little"  required> 
                    <option value="">Seleccione una opción</option>
                    <option value="Accionante">Accionante</option>
                    <option value="Accionado">Accionado</option></select></div>
                  <div class="col-md-6 col-sm-12 col-xs-12">
                  <label class="marca1">Nombre</label> 
                  <input name="cli_nombre" class="normal_input_little" type="text" required ></div>
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label >Identificación</label> 
                  <input name="cli_identificacion" class="normal_input_little" type="text"  onkeypress="return valideKey(event);"></div>  
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label >Teléfono</label> 
                  <input name="cli_telefono" class="normal_input_little" type="text"  onkeypress="return valideKey(event);"></div>    
              </div>
              <div class="row">    
              <div class="col-md-6 col-sm-12 col-xs-12">
                <label class="marca3">Contraparte</label> 
                <select name="contra" class="normal_input_little"> 
                  <option value="">Seleccione una opción</option>
                  <option value="Accionante">Accionante</option>
                  <option value="Accionado">Accionado</option></select></div>
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label class="marca3">Nombre</label> 
                  <input name="con_nombre" class="normal_input_little" type="text" ></div>
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label >Identificación</label> 
                  <input name="con_identificacion" class="normal_input_little" type="text"  onkeypress="return valideKey(event);"></div>  
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label >Teléfono</label> 
                  <input name="con_telefono" class="normal_input_little" type="text"  onkeypress="return valideKey(event);"></div>      
              </div>   
          </fieldset>

            <fieldset>
              <legend class="form_title maximus" style="text-align: right;">Datos del tramite</legend>
              <div class="row">
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Acción</label> 
                    <select name="accion" class="normal_input_little"  onchange="carga(this);"> 
                      <option value="">Seleccione una opción</option>
                      <option value="Acción de protección">Acción de protección</option>
                      <option value="Extraordinaria de protección">Extraordinaria de protección</option>
                      <option value="Habeas Corpus">Habeas Corpus</option>
                      <option value="Habeas Data">Habeas Data</option>
                      <option value="Acceso a la información Pública">Acceso a la información Pública</option>
                      <option value="Por Incumplimiento">Por Incumplimiento</option>
                      <option value="De Incumplimiento">De Incumplimiento</option>
                      <option value="Medidas Cautelares">Medidas Cautelares</option>
                      <option value="Otros">Otros</option></select></div>

                      <div class="col-md-6 col-sm-6 col-xs-12">
                  <label >Otra acción</label> 
                  <input name="acc_otros" class="normal_input_little" type="text" disabled id="inputa"> </div>
              </div>
              <div class="row">
                <div class="col-md-6 col-sm-12col-xs-12">
                  <label >Judicatura</label> 
                  <select name="judicatura" class="normal_input_little"  onchange="carge(this);"> 
                    <option value="">Seleccione una opción</option>
                    <option value="Cuenca">Cuenca</option>
                    <option value="Gualaceo">Gualaceo</option>
                    <option value="Azogues">Azogues</option>
                    <option value="Biblian">Biblian</option>
                    <option value="Cañar">Cañar</option>
                    <option value="El Tambo">El Tambo</option>
                    <option value="La Troncal">La Troncal</option>
                    <option value="Chunchi">Chunchi</option>
                    <option value="Riobamba">Riobamba</option>
                    <option value="Otros">Otros</option></select></div>
  
              <div class="col-md-6 col-sm-6 col-xs-12">
                  <label >Otro</label> 
                  <input name="jud_otros" class="normal_input_little" type="text" disabled id="inpute"> </div>
            </fieldset>

            <fieldset>
              <legend class="form_title maximus" style="text-align: right;">Fechas</legend>
            <div class="row">
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Presentación</label>
                   <input name="presentacion" class="normal_input_little" type="date" title="Click para escojer una fecha de presentacion del caso."> </div> 
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Audiencia</label> 
                  <input name="audiencia" class="normal_input_little" type="date" title="Click para escojer una fecha de audiencia del caso."> </div> 
            </div>
            
            <div class="row">    
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Sentencia</label> 
                  <input name="sentencia" class="normal_input_little" type="date" title="Click para escojer una fecha de sentencia."> </div>
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Apelación</label> 
                  <input name="apelacion" class="normal_input_little" type="date" title="Click para escojer una fecha para apelación."> </div> 
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Corte Constitu.</label> 
                  <input name="corte_cons" class="normal_input_little" type="date" title="Click para escojer una fecha para corte constitucional."> </div>   
            </div>    
            </fieldset>

          <fieldset>
            <legend class="form_title maximus" style="text-align: right;">Observaciones</legend>
              <div class="col-md-12 col-sm-12 col-xs-12">
                <textarea name="observaciones" class="normal_textarea normal_input_big" rows="40" cols="40"></textarea>
              </div>
          </fieldset>
          <div class="col-md-12 col-sm-12 col-xs-12 text-center">  
            <input type="submit" name="guardar_constitucional" class="btn btn-main" value="Guardar" onclick="return confirmar('¿Está seguro que desea guardar el registro?')"></div>  
          </form>
      </div>

<?php include("./template/foot.php"); ?>
