var futuros = [];
var hoy, eventos, i, j;
var html;

$(document).ready(function() {
    $.ajax({
        url: "http://127.0.0.1:5500/info.json"
    }).done(function(resultado) {
        hoy = resultado.fechaActual;
        eventos = resultado.eventos;
        for (i = 0; i < eventos.length; i++) {
            if (eventos[i].fecha > hoy) {
                futuros.push(eventos[i]);
            }
        }
        futuros = futuros.sort(function(x, y) {
            if (x.fecha < y.fecha) {
                return 1;
            }
            return -1;
        });
        html = ""
        for (j = 0; j < futuros.length; j++) {
            html += `
                <div class="col-md-12">
                    <div class="card flex-md-row mb-4  h-md-250">
                        <div class="card-body d-flex flex-column align-items-start">
                            <h3 class="mb-0 text-primary" >
                                <a href="detalle.html?id=${futuros[j].id}">${futuros[j].nombre}</a>
                            </h3>
                            <p class="mb-1 text-muted">Fecha: ${futuros[j].fecha}</p>
                            <p class="card-text mb-auto">Descripción: ${futuros[j].descripcion}</p>
                        </div>
                    </div>
                </div>
            </div>`
        }
        document.getElementById("proximos").innerHTML = html
    })
});