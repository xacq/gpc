<?php include("./template/head.php"); ?>


      <div class="container ">
        <form class="normal_form" method="POST" action="./actions/registrar_agua.php">
          <p class="normal_linea"><br>SECCION SENAGUA</p>
          <fieldset>
            <legend class="form_title maximus" style="text-align: right;">Datos del caso</legend>
            <div class="row">
              <div class="col-md-6 col-sm-6 col-xs-12">
                  <label >CODIGO</label> 
                  <input name="codigo" class="normal_input_little"  style="text-transform: uppercase;" required></div>
            </div>
            <div class="row">
              <div class="col-md-6 col-sm-6 col-xs-12">
                  <label >Nro Proceso</label> 
                  <input name="proceso"  class="normal_input_little" type="text" ></div>
            </div>

            <div class="row">
              <div class="col-md-6 col-sm-6 col-xs-12">
                <label class="marca1">Cliente</label> 
                  <select class="normal_input_little"   name="cliente"  required> 
                  <option value="">Seleccione una opción</option>
                    <option value="Solicitante">Solicitante</option>
                    <option value="Opositor">Opositor</option>
                    <option value="Adherente">Adherente</option></select></div>
              <div class="col-md-6 col-sm-6 col-xs-12">
                <label  class="marca1">Nombre</label> 
                  <input class="normal_input_little" type="text"  name="cli_nombre"  required></div>
              <div class="col-md-6 col-sm-6 col-xs-12">
                <label >Identificación</label> 
                <input  name="cli_identificacion" class="normal_input_little" type="text"  onkeypress="return valideKey(event);"></div>
              <div class="col-md-6 col-sm-6 col-xs-12">
                <label >Teléfono</label> 
                <input  name="cli_telefono" class="normal_input_little" type="text"  onkeypress="return valideKey(event);"></div>  
            </div>

            <div class="row">
              <div class="col-md-6 col-sm-6 col-xs-12">
                <label class="marca2">Contraparte</label>  
                  <select name="contra" class="normal_input_little" >
                  <option value="">Seleccione una opción</option>
                    <option value="Solicitante">Solicitante</option>
                    <option value="Opositor">Opositor</option>
                    <option value="Adherente">Adherente</option></select></div>
              <div class="col-md-6 col-sm-6 col-xs-12">
                <label  class="marca2">Nombre</label> 
                <input  name="con_nombre" class="normal_input_little" type="text" ></div>
              <div class="col-md-6 col-sm-6 col-xs-12">
                <label >Identificación</label> 
                <input  name="con_identificacion" class="normal_input_little" type="text"  onkeypress="return valideKey(event);"></div>
              <div class="col-md-6 col-sm-6 col-xs-12">
                <label >Teléfono</label> 
                <input  name="con_telefono" class="normal_input_little" type="text"  onkeypress="return valideKey(event);"></div>  
            </div>

            <div class="row">
              <div class="col-md-6 col-sm-6 col-xs-12">
                <label class="marca3">Terceros</label> 
                  <select name="terceros" class="normal_input_little">
                    <option value="">Seleccione una opción</option>
                    <option value="Solicitante">Solicitante</option>
                    <option value="Opositor">Opositor</option>
                    <option value="Adherente">Adherente</option></select></div>
              <div class="col-md-6 col-sm-6 col-xs-12">
                <label class="marca3">Nombre</label> 
                <input  name="ter_nombre" class="normal_input_little" type="text" ></div>
              <div class="col-md-6 col-sm-6 col-xs-12">
                <label >Identificación</label> 
                <input  name="ter_identificacion" class="normal_input_little" type="text"  onkeypress="return valideKey(event);"></div>  
              <div class="col-md-6 col-sm-6 col-xs-12">
                <label >Teléfono</label> 
                <input  name="ter_telefono" class="normal_input_little" type="text" onkeypress="return valideKey(event);" ></div> 
            </div>
          </fieldset>

            <fieldset>
              <legend class="form_title maximus" style="text-align: right;">Datos del tramite</legend>
            <div class="row">
              <div class="col-md-6 col-sm-6 col-xs-12">
                <label>Trámite</label> 
                  <select  name="tramite" class="normal_input_little"  onchange="carga(this);">
                    <option value="">Seleccione una opción</option>
                    <option value="Autorización">Autorización</option>
                    <option value="Cancelación">Cancelación</option>
                    <option value="Reversión">Reversión</option>
                    <option value="Transferencia">Transferencia</option>
                    <option value="Renovación">Renovación</option>
                    <option value="Renov. y Transfer.">Renov. y Transfer.</option>
                    <option value="Sustitución">Sustitución</option>
                    <option value="Aprobación Obras">Aprobación Obras</option>
                    <option value="Otros">Otros</option></select>
              </div>
              <div class="col-md-6 col-sm-6 col-xs-12">
                  <label >Otro trámite</label> 
                  <input name="tra_otros" class="normal_input_little" type="text" disabled id="inputa"> </div>

              <div class="col-md-6 col-sm-6 col-xs-12">
                <label>Uso</label> 
                  <select  name="uso" class="normal_input_little"  onchange="carge(this);"> 
                    <option value="">Seleccione una opción</option>
                    <option value="Autorización">Consumo Humano</option>
                    <option value="Cancelación">Riego</option>
                    <option value="Reversión">Abrevadero</option>
                    <option value="Transferencia">Cons., Rieg. y Abre.</option>
                    <option value="Renovación">Industrial</option>
                    <option value="Renov. y Transfer.">Comercial</option>
                    <option value="Otros">Otros</option></select>
              </div>

              <div class="col-md-6 col-sm-6 col-xs-12">
                  <label >Otro uso</label> 
                  <input name="uso_otros" class="normal_input_little" type="text" disabled id="inpute"> </div>

              <div class="col-md-6 col-sm-6 col-xs-12">
                  <label>Parroquia</label> 
                  <select  name="parroquia" class="normal_input_little"  onchange="cargi(this);"> 
                    <option value="">Seleccione una opción</option>
                    <option value="Ingapirca">Ingapirca</option>
                    <option value="Don Antonio">Don Antonio</option>
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
                    <option value="Otros">Otros</option></select>
              </div>
              <div class="col-md-6 col-sm-6 col-xs-12">
                  <label >Otro</label> 
                  <input name="par_otros" class="normal_input_little" type="text" disabled id="inputi"> </div>
            </div>  
          </fieldset>

            <fieldset>
              <legend class="form_title maximus" style="text-align: right;">Fechas</legend>
            <div class="row">
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Calificación</label>
                   <input name="calificacion" class="normal_input_little" type="date" title="Click para escojer una fecha de calificacion del caso."> </div> 
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Oposición</label> 
                  <input name="oposicion" class="normal_input_little" type="date" title="Click para escojer una fecha de oposición del caso."> </div> 
            </div>
            
            <div class="row">    
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Comisiones</label> 
                  <input name="comisiones" class="normal_input_little" type="date" title="Click para escojer una fecha de comisiones del caso."> </div>
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Publicación</label> 
                  <input name="publicacion" class="normal_input_little" type="date" title="Click para escojer una fecha de publicación."> </div> 
            </div>

            <div class="row">
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Inspección</label> 
                  <input name="inspeccion" class="normal_input_little" type="date" title="Click para escojer una fecha de inspeccion."> </div> 
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Audiencia</label>
                  <input name="audiencia" class="normal_input_little" type="date" title="Click para escojer una fecha audiencia."> </div> 
            </div>
            
            <div class="row">
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Prueba</label> 
                  <input name="prueba" class="normal_input_little" type="date" title="Click para escojer una fecha para la prueba."> </div> 
                <div class="col-md-6 col-sm-12 col-xs-12">
                  <label>Resolución</label> 
                  <input name="resolucion" class="normal_input_little" type="date" title="Click para escojer una fecha para resolucion."> </div> 
                  <div class="col-md-6 col-sm-12 col-xs-12">
                    <label>Apelación</label> 
                    <input  name=" apelacion" class="normal_input_little" type="date" title="Click para escojer una fecha para la apelacion."> </div> 
            </div>    
            </fieldset>

          <fieldset>
            <legend class="form_title maximus" style="text-align: right;">Observaciones</legend>
              <div class="col-md-12 col-sm-12 col-xs-12">
                <textarea  name="observaciones" class="normal_textarea normal_input_big" rows="40" cols="40"></textarea>
              </div>
          </fieldset>
            <div class="col-md-12 col-sm-12 col-xs-12 text-center">  
              <input type="submit" name="guardar_agua" class="btn btn-main" value="Guardar" onclick="return confirmar('¿Está seguro que desea guardar el registro?')"></div>            
          </form>
      </div>

<?php include("./template/foot.php"); ?>
