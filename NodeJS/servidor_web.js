const fs = require('fs')
const http = require('http')
const port = process.env.PORT || 3000
const file = 'index.html'


const server = http.createServer((req, res) => {
  res.statusCode = 200
  res.setHeader('Content-Type', 'text/html; charset=UTF-8')

    fs.readFile(file, (err, content) => {
        res.write(content)
        res.end()
    })
})

server.listen(port, () => {
  console.log(`Server running at port ${port}`)
})