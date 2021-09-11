const http = require('http');
const server = http.createServer((req, res) =>{
    if (req.url ==='/'){
        console.log("Servidor Activado.");
    }

    if (req.url === '/api/costumers'){
        console.log("API accedido.")
    }
});

server.listen(3000)