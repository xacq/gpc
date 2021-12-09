const http = require('http')

const port = process.env.PORT || 3000

const server = http.createServer((req, res) => {
    //res.writeHead(200, {'Content-Type':'text/html;charset=UTF-8'}
    //res.writeHead(400, {'Content-Type':'aplication/json'}
    //res.setHeader('Content-Type','aplication/json')
    //res.statusCode = 301
    //res.statusCode = 200
    if (req.method === 'GET'){
        res.write ('<h1>Metodo no permitido</h1>')
        return res.end()
    }
  res.statusCode = 200
  res.setHeader('Content-Type', 'text/html')
  res.end('<h1>Metodo permitido</h1>')
})

server.listen(port, () => {
  console.log(`Server running at port ${port}`)
})