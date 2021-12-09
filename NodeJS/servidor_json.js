const fs = require('fs')
const http = require('http')
const port = process.env.PORT || 3000
const file = 'index2.html'

const server = http.createServer((req, res) => {
  res.statusCode = 200
  res.setHeader('Content-Type','application/json')
        res.write(JSON.stringify({"key":"valor"}))
        res.end()
})

server.listen(port, () => {
  console.log(`Server running at port ${port}`)
})