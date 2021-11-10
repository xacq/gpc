<?php include("./template/head.php"); ?>


      <div class="container ">
        <form class="normal_form" method="POST" action="./actions/registrar_subtierras.php"> 
          <p class="normal_linea"><br>SECCION SUBSECRETARIA DE TIERRAS Y GADS MUNICIPALES</p>
          <fieldset>
            <legend class="form_title maximus" style="text-align: right;">Datos del caso</legend>
            <div class="row">
              <div class="col-md-6 col-sm-6 col-xs-12">
                  <label >CODIGO</label> 
                  <input name="codigo" class="normal_input_little" type="text"  style="text-transform: uppercase;" required></div>
            </div>
            <div class="row">
              <div class="col-md-6 col-sm-6 col-xs-12">
                  <label >Nro Proceso</label> 
                  <input name="proceso" class="normal_input_little" type="text" ></div>
            </div>
            <div class="row">
              <div class="col-md-6 col-sm-6 col-xs-12">
                <label class="marca">Solicitante</label>  
                <input name="solicitante" class="normal_input_little" type="text"  required></div>
              <div class="col-md-6 col-sm-6 col-xs-12">
                <label >Identificación</label> 
                <input name="sol_identificacion" class="normal_input_little" type="text"  onkeypress="return valideKey(event);"></div>
              <div class="col-md-6 col-sm-6 col-xs-12">  
                <label >Teléfono</label> 
                <input name="sol_telefono" class="normal_input_little" type="text"  onkeypress="return valideKey(event);"> </div>
              </div>  
              <div class="row">
                <div class="col-md-6 col-sm-6 col-xs-12">
                  <label class="marca">Opositor</label>  
                  <input name="opositor" class="normal_input_little" type="text" ></div>
                <div class="col-md-6 col-sm-6 col-xs-12">
                  <label >Identificación</label> 
                  <input name="opo_identificacion" class="normal_input_little" type="text"  onkeypress="return valideKey(event);"></div>
                <div class="col-md-6 col-sm-6 col-xs-12">  
                  <label >Teléfono</label> 
                  <input name="opo_telefono" class="normal_input_little" type="text"  onkeypress="return valideKey(event);"> </div>
                </div>  
          </fieldset>

            <fieldset>
              <legend class="form_title maximus" style="text-align: right;">Datos del tramite</legend>
            <div class="row">
              
              <div class="col-md-6 col-sm-6 col-xs-12">
                  <label >Parroquia</label> 
                  <select name="parroquia" class="normal_input_little"  onchange="carga(this);"> 
                    <option value="">Seleccione una opción</option>
                    <option value="Ingapirca">Ingapirca</option>
                    <option value="Patria Potestad">Don Antonio</option>
                    <option value="Honorato Vasquez">Honorato Vasquez</option>
                    <option value="Juncal">Juncal</option>
                    <option value="La Troncal">La Troncal</option>
                    <option value="Cañar">Cañar</option>
                    <option value="Ventura">Ventura</option>
                    <option value="Chunchi">Chunchi</option>
                    <option value="Suscal">Suscal</option>
                    <option value="El Támbo">El Támbo</option>
                    <option value="Ducur">Ducur</option>
                    <option value="Chorocopte">Chorocopte</option>
                    <option value="General Morales">General Morales</option>
                    <option value="Chontamarca">Chontamarca</option>
                    <option value="Gualleturo">Gualleturo</option>
                    <option value="Otros">Otros</option></select>  </div>

                <div class="col-md-6 col-sm-6 col-xs-12">
                  <label >Otro</label> 
                  <input name="par_otros" class="normal_input_little" type="text" disabled id="inputa"> </div>
              
                <div class="col-md-6 col-sm-6 col-xs-12">
                  <label for="listramtierras">Trámite</label> 
                  <select name="tramite" class="normal_input_little"  onchange="carge(this);">
                    <option value="">Seleccione una opción</option>
                    <option value="Legalización Rural">Legalización Rural</option>
                    <option value="Legalización">Legalización</option>
                    <option value="Urbano">Urbano</option>
                    <option value="Fraccionamiento">Fraccionamiento</option>
                    <option value="Linea de Fabrica">Linea de Fabrica</option>
                    <option value="Otros">Otros</option></select>  </div>

                    <div class="col-md-6 col-sm-6 col-xs-12">
                  <label >Otro</label> 
                  <input name="tra_otros" class="normal_input_little" type="text" disabled id="inpute"> </div></div>

          </fieldset>

            <fieldset>
              <legend class="form_title maximus" style="text-align: right;">Fechas</legend>
            <div class="row">
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Ingreso a Revisión</label> 
                  <input name="revision"class="normal_input_little" type="date" title="Click para escojer una fecha para la revision."> </div> 
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Fecha de Aprobación</label> 
                  <input name="aprobacion" class="normal_input_little" type="date" title="Click para escojer una fecha para la aprobacion."> </div> 
            </div>
            
            <div class="row">    
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Matricula</label> 
                  <input name="matricula" class="normal_input_little" type="date" title="Click para escojer una fecha la matriculacion."> </div>
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Inspección</label>
                  <input name="inspeccion" class="normal_input_little" type="date" title="Click para escojer una fecha para inspeccion."> </div> 
            </div>

            <div class="row">
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Primer pago</label> 
                  <input name="pago1" class="normal_input_little" type="date" title="Click para escojer una fecha para primer pago."> </div> 
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Segundo Pago</label>
                   <input name="pago2" class="normal_input_little" type="date" title="Click para escojer una fecha para segundo pago."> </div> 
            </div>
            
            <div class="row">
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Adjudicación</label> 
                  <input name="adjudicacion" class="normal_input_little" type="date" title="Click para escojer una fecha para la adjudicacion."> </div> 
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Registro de propiedad</label> 
                  <input name="registro_propiedad" class="normal_input_little" type="date" title="Click para escojer una fecha para registro."> </div> 
            </div>    

            <div class="row">
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Entrega</label> 
                  <input name="entrega" class="normal_input_little" type="date" title="Click para escojer una fecha para entrega."> </div> 
            </div>
            </fieldset>

          <fieldset>
            <legend class="form_title maximus" style="text-align: right;">Observaciones</legend>
              <div class="col-md-12 col-sm-12 col-xs-12">
                <textarea name="observaciones" class="normal_textarea normal_input_big" rows="40" cols="40"></textarea>
              </div>
          </fieldset>
          <div class="col-md-12 col-sm-12 col-xs-12 text-center">  
            <input name="guardar_subtierras" type="submit" class="btn btn-main" value="Guardar" onclick="return confirmar('¿Está seguro que desea guardar el registro?')"></div>  
          </form>
      </div>

<?php include("./template/foot.php"); ?>