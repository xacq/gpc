$(document).ready(function() {

    //cargando los datos
    $.ajax({
        url: "info.json"
    }).done(function(resultado) {

        //llenando la variable
        eventos = resultado.eventos;

        //obteniendo el id del url
        var id = location.search.match(/id=(\d)*/)[1]

        evento = eventos.find(function(element) {
                return element.id == id
            })
            //llenando dinamicamente los eventos
        var html = `
            <div class="col-md-12">
                <div class="card flex-md-row mb-4 h-md-250 ">
                    <div class="card-body d-flex flex-column text-center">
                        <h2>${evento.nombre}</h2>
                        <p>${evento.fecha}</p>
                        <p>Lugar: ${evento.lugar}</p
                        <p>Descripción: ${evento.descripcion}</p>
                        <p>Costo: $ ${evento.precio}</p>
                        <p>Invitados: ${evento.invitados}</p>
                    </div>
                </div>
            </div>`
        document.getElementById("evento").innerHTML = html
    });

});