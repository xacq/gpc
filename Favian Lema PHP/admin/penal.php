<?php include("./template/head.php"); ?>

      <div class="container ">
        <form class="normal_form" method="POST" action="./actions/registrar_penal.php">
          <p class="normal_linea"><br>SECCION PENAL</p>
          <fieldset>
            <legend class="form_title maximus" style="text-align: right;">Datos del caso</legend>
            <div class="row">
              <div class="col-md-6 col-sm-6 col-xs-12">
                  <label >CODIGO</label> 
                  <input name="codigo" class="normal_input_little"  style="text-transform: uppercase;" required></div>
            </div>
              <div class="row">
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label >Expediente Fiscal</label> 
                  <input name="expediente" class="normal_input_little" type="text" ></div>
                <div class="col-md-6 col-sm-12 col-xs-12">  
                  <label >Nombre del Fiscal</label> 
                  <input name="fiscal" class="normal_input_little" type="text" ></div>
                <div class="col-md-6 col-sm-12 col-xs-12">  
                  <label >Nro Proceso</label> 
                  <input name="proceso" class="normal_input_little" type="text" ></div>
                <div class="col-md-6 col-sm-12 col-xs-12">  
                  <label >Nombre del Juez</label> 
                  <input name="juez" class="normal_input_little" type="text" ></div></div>

                  <div class="row">
                  <div class="col-md-6 col-sm-12 col-xs-12">
                    <label for="lisclipenal" class="marca1">Cliente</label> 
                    <select name="cliente" class="normal_input_little"  required> 
                      <option value="">Seleccione una opción</option>
                      <option value="P. Victima">P. Victima</option>
                      <option value="P. Victimario">P. Victimario</option></select></div>
                  <div class="col-md-6 col-sm-12 col-xs-12">  
                  <label class="marca1">Nombre</label>  
                  <input name="cli_nombre" class="normal_input_little" type="text"  required></div>
                <div class="col-md-6 col-sm-12 col-xs-12">  
                  <label >Identificación</label> 
                  <input name="cli_identificacion" class="normal_input_little" type="text"   onkeypress="return valideKey(event);"></div>
                  <div class="col-md-6 col-sm-12 col-xs-12">  
                    <label >Teléfono</label> 
                    <input name="cli_telefono" class="normal_input_little" type="text"   onkeypress="return valideKey(event);"></div></div>

                    <div class="row">
                      <div class="col-md-6 col-sm-12 col-xs-12">
                        <label for="lisconpenal" class="marca3">Contraparte</label> 
                        <select name="contra" class="normal_input_little" > 
                          <option value="">Seleccione una opción</option>
                          <option value="P. Victima">P. Victima</option>
                          <option value="P. Victimario">P. Victimario</option></select></div>
                    <div class="col-md-6 col-sm-12 col-xs-12">  
                      <label class="marca3">Nombre</label>  
                      <input name="con_nombre"  class="normal_input_little" type="text" ></div>
                    <div class="col-md-6 col-sm-12 col-xs-12">  
                      <label >Identificación</label> 
                      <input name="con_identificacion" class="normal_input_little" type="text"   onkeypress="return valideKey(event);"></div>
                    <div class="col-md-6 col-sm-12 col-xs-12">  
                        <label >Teléfono</label> 
                        <input name="con_telefono" class="normal_input_little" type="text"   onkeypress="return valideKey(event);"></div></div>
              </fieldset>

            <fieldset>
              <legend class="form_title maximus" style="text-align: right;">Datos del tramite</legend>
            <div class="row">
            <div class="col-md-6 col-sm-12 col-xs-12">
                
            <label>Formulación cargos</label> 
            <input class="normal_input_little" name="formulacion" type="date" title="Click para escojer fecha de la formulación de cargos." > </div> 
            </div>
            <div class="row">
              <div class="col-md-6 col-sm-12 col-xs-12">
                <label>Delito</label> 
                  <select name="delitos" class="normal_input_little"  onchange="carga(this);"> 
                    <option value="">Seleccione una opción</option>
                    <option value="Contra la Vida">Contra la Vida</option>
                    <option value="Contra la Integridad Sexual">Contra la Integridad Sexual</option>
                    <option value="Contra Administración Pública">Contra Administración Pública</option>
                    <option value="Tráfico de Migrantes">Tráfico de Migrantes</option>
                    <option value="Extorción">Extorción</option>
                    <option value="Impugnación de Tránsito">Impugnación de Tránsito</option>
                    <option value="Contravensión Penal">Contravensión Penal</option>
                    <option value="Violencia Intrafamiliar">Violencia Intrafamiliar</option>
                    <option value="Robo">Robo</option>
                    <option value="Hurto">Hurto</option>
                    <option value="Lesiones">Lesiones</option>
                    <option value="Injurias">Injurias</option>
                    <option value="Daño Psicológico">Daño Psicológico</option>
                    <option value="Estafa">Estafa</option>
                    <option value="Usura">Usura</option>
                    <option value="Intimidación">Intimidación</option>
                    <option value="Narcotráfico">Narcotráfico</option>
                    <option value="Falsificación">Falsificación</option>
                    <option value="Usurpación">Usurpación</option>
                    <option value="Otros">Otros</option>
                  </select>
              </div>
              <div class="col-md-6 col-sm-6 col-xs-12">
                  <label >Otro delito</label> 
                  <input name="del_otros" class="normal_input_little" type="text" disabled id="inputa"> </div>

              <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Judicatura</label> 
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
                    <option value="Otros">Otros</option></select>
              </div>
              <div class="col-md-6 col-sm-6 col-xs-12">
                  <label >Otro</label> 
                  <input name="jud_otros" class="normal_input_little" type="text" disabled id="inpute"> </div>
            </div>  
          </fieldset>

            <fieldset>
              <legend class="form_title maximus" style="text-align: right;">Fechas</legend>
            <div class="row">
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Instrucción</label> 
                  <input name="instruccion" class="normal_input_little" type="date" title="Click para escojer una fecha de la instrucción del caso."> </div> 
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Audiencia Prepara.</label> 
                  <input name="preparatoria" class="normal_input_little" type="date" title="Click para escojer una fecha para la audiencia preparatoria."> </div> 
            </div>
            
            <div class="row">    
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Audiencia Tribunal</label> 
                  <input name="tribunal" class="normal_input_little" type="date" title="Click para escojer una fecha para la audiencia tribunal."> </div>
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Sentencia</label> 
                  <input name="sentencia" class="normal_input_little" type="date" title="Click para escojer una fecha para la sentencia."> </div> 
            </div>
            <div class="row">    
              <div class="col-md-6 col-sm-12 col-xs-12">
                <label>Apelación</label> 
                <input name="apelacion" class="normal_input_little" type="date" title="Click para escojer una fecha para la audiencia tribunal."> </div>
              <div class="col-md-6 col-sm-12 col-xs-12">
                <label>Casación</label> 
                <input name="casacion" class="normal_input_little" type="date" title="Click para escojer una fecha para la sentencia."> </div> 
          </div>
            </fieldset>

          <fieldset>
            <legend class="form_title maximus" style="text-align: right;">Observaciones</legend>
              <div class="col-md-12 col-sm-12 col-xs-12">
                <textarea name="observaciones" class="normal_textarea normal_input_big" rows="40" cols="40"></textarea>
              </div>
          </fieldset>
          <div class="col-md-12 col-sm-12 col-xs-12 text-center">  
            <input type="submit" name="guardar_penal" class="btn btn-main" value="Guardar" onclick="return confirmar('¿Está seguro que desea guardar el registro?')"></div>  
          </form>
      </div>

<?php include("./template/foot.php"); ?>
