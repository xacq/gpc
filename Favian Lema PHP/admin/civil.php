<?php include("./template/head.php"); ?>

<body id="bodysystem">


      <div class="container ">
        <form class="normal_form" method="POST" action="./actions/registrar_civil.php">
          <p class="normal_linea"><br>SECCION CIVIL</p>
          <fieldset>
            <legend class="form_title maximus" style="text-align: right;">Datos del caso</legend>
            <div class="row">
              <div class="col-md-6 col-sm-6 col-xs-12">
                  <label >CODIGO</label> 
                  <input name="codigo" class="normal_input_little"  style="text-transform:uppercase;" required></div> </div>
            <div class="row">
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label >Nro Proceso</label> 
                  <input class="normal_input_little" type="text"  name="proceso">  </div>
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label >Nombre del Juez</label> 
                  <input class="normal_input_little" type="text"  name="juez"></div></div>
            <div class="row">  
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label class="marca1">Cliente</label> 
                  <select class="normal_input_little"  name="cliente" required> 
                    <option value="">Seleccione un opción</option>
                    <option value="Actor">Actor</option>
                    <option value="Demandado">Demandado</option></select></div>
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label class="marca1">Nombre</label>  
                  <input class="normal_input_little" type="text"  name="cli_nombre"  required> </div>
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Identificación</label>  
                  <input class="normal_input_little" type="text"  name="cli_identificacion"  onkeypress="return valideKey(event);"> </div>
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Teléfono</label> 
                  <input class="normal_input_little" type="text"  name="cli_telefono"  onkeypress="return valideKey(event);"> </div></div>

            <div class="row">
                  <div class="col-md-6 col-sm-12 col-xs-12">
                    <label class="marca3">Contraparte</label> 
                    <select class="normal_input_little"  name="contra">  
                      <option value="">Seleccione un opción</option>
                      <option value="Actor">Actor</option>
                      <option value="Demandado">Demandado</option></select></div>
                  <div class="col-md-6 col-sm-12 col-xs-12">
                    <label class="marca3">Nombre</label> 
                    <input class="normal_input_little" type="text"  name="con_nombre" > </div>
                  <div class="col-md-6 col-sm-12 col-xs-12">
                    <label >Identificación</label> 
                    <input class="normal_input_little" type="text"  name="con_identificacion"  onkeypress="return valideKey(event);"> </div>
                  <div class="col-md-6 col-sm-12 col-xs-12">
                    <label>Teléfono</label> 
                    <input class="normal_input_little" type="text"  name="con_telefono" size="15"  onkeypress="return valideKey(event);"> </div>
                  </div>

            </fieldset>    
            <fieldset>
              <legend class="form_title maximus" style="text-align: right;">Datos del tramite</legend>
            <div class="row">
              <div class="col-md-6 col-sm-6 col-xs-12">
                <label>Trámite</label> 
                  <select class="normal_input_little"  name="tramite"> 
                    <option value="">Seleccione un opción</option>
                    <option value="Ordinario">Ordinario</option>
                    <option value="Ejecutivo">Ejecutivo</option>
                    <option value="Sumario">Sumario</option>
                    <option value="Ejecución">Ejecución </option>
                    <option value="Monitorio">Monitorio</option>
                    <option value="Otros">Otros</option></select></div>
            </div>
            <div class="row">
              <div class="col-md-6 col-sm-6 col-xs-12">
                  <label>Acción</label> 
                  <select class="normal_input_little"  name="accion" onchange="carga(this);"> 
                    <option value="">Seleccione un opción</option>
                    <option value="Letra de Cambio">Letra de Cambio</option>
                    <option value="Pagare">Pagare</option>
                    <option value="Prescripción">Prescripción</option>
                    <option value="Cobro de Dinero">Cobro de Dinero</option>
                    <option value="Reinvindicación">Reinvindicación</option>
                    <option value="Amparo Posesorio">Amparo Posesorio</option>
                    <option value="Nulidad de Contrato">Nulidad de Contrato</option>
                    <option value="Laboral">Laboral</option>
                    <option value="Inquilinato">Inquilinato</option>
                    <option value="Reserva de Dominio">Reserva de Dominio</option>
                    <option value="Mutuo">Mutuo</option>
                    <option value="Otros">Otros</option></select>        </div>


                    <div class="col-md-6 col-sm-6 col-xs-12">
                  <label >Otra acción</label> 
                  <input name="acc_otros" class="normal_input_little" type="text" disabled id="inputa"> </div>

              <div class="col-md-6 col-sm-6 col-xs-12">
                  <label>Judicatura</label> 
                  <select class="normal_input_little"  name="judicatura" onchange="carge(this);"> 
                    <option value="">Seleccione un opción</option>
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
                  <label >Otros</label> 
                  <input name="jud_otros" class="normal_input_little" type="text" disabled id="inpute"> </div>
            </div>  
          </fieldset>

            <fieldset>
              <legend class="form_title maximus" style="text-align: right;">Fechas</legend>
            <div class="row">
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Ingreso</label> 
                  <input name="ingreso" class="normal_input_little" type="date" title="Click para escojer una fecha de ingreso del caso."> </div> 
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Calificación</label> 
                  <input name="calificacion" class="normal_input_little" type="date" title="Click para escojer una fecha de calificacion del caso."> </div> 
            </div>
            
            <div class="row">    
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Contestación</label> 
                  <input name="contestacion" class="normal_input_little" type="date" title="Click para escojer una fecha de contestación del caso."> </div>
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Reconvensión</label> 
                  <input name="reconvencion" class="normal_input_little" type="date" title="Click para escojer una fecha de califireconvensióncacion."> </div> 
            </div>

            <div class="row">
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Inspección Judicial</label> 
                  <input name="inspeccion" class="normal_input_little" type="date" title="Click para escojer una fecha de inspeccion judición."> </div> 
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Otros</label> 
                  <input name="otros" class="normal_input_little" type="date" title="Click para escojer una fecha otros."> </div> 
            </div>
            
            <div class="row">
              <div class="col-md-6 col-sm-12 col-xs-12">
                <label>Audiencia</label> 
                <input name="audiencia" class="normal_input_little" type="date" title="Click para escojer una fecha para la audiencia."> </div> 
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Resolución</label> 
                  <input name="resolucion" class="normal_input_little" type="date" title="Click para escojer una fecha para la resolución."> </div> 
            </div>    

            <div class="row">
              <div class="col-md-6 col-sm-12 col-xs-12">
                <label>Apelación</label> 
                <input name="apelacion" class="normal_input_little" type="date" title="Click para escojer una fecha para apelación."> </div> 
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Casación</label> 
                  <input name="casacion" class="normal_input_little" type="date" title="Click para escojer una fecha para casación."> </div> 
            </div>
            </fieldset>

          <fieldset>
            <legend class="form_title maximus" style="text-align: right;">Observaciones</legend>
              <div class="col-md-12 col-sm-12 col-xs-12">
                <textarea name="observaciones" class="normal_textarea normal_input_big" rows="40" cols="40"></textarea>
              </div>
          </fieldset>
          <div class="col-md-12 col-sm-12 col-xs-12 text-center">  
            <input type="submit" name="guardar_civil"class="btn btn-main" value="Guardar" onclick="return confirmar('¿Está seguro que desea guardar el registro?')"></div>  
          </form>
      </div>

<?php include("./template/foot.php"); ?>
