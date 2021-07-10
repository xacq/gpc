var pasados = [];
var hoy, eventos, i, j;


$(document).ready(function() {
    $.ajax({
        url: "http://127.0.0.1:5500/info.json"
    }).done(function(resultado) {
        hoy = resultado.fechaActual;
        eventos = resultado.eventos;
        for (i = 0; i < eventos.length; i++) {
            if (eventos[i].fecha < hoy) {
                pasados.push(eventos[i]);
            }
        }
        pasados = pasados.sort(function(x, y) {
            if (x.fecha < y.fecha) {
                return 1;
            }
            return -1;
        });
        var html2 = "";
        for (j = 0; j < 2; j++) {
            html2 += `
                <div class="col-md-12">
                    <div class="card flex-md-row mb-4  h-md-250">
                        <div class="card-body d-flex flex-column align-items-start">
                            <h3 class="mb-0 text-primary" >
                                <a href="detalle.html?id=${pasados[j].id}">${pasados[j].nombre}</a>
                            </h3>
                            <p class="mb-1 text-muted">Fecha: ${pasados[j].fecha}</p>
                            <p class="card-text mb-auto">Descripción: ${pasados[j].descripcion}</p>
                        </div>
                    </div>
                </div>
            `
        }
        document.getElementById("past").innerHTML = html2;
    })
});