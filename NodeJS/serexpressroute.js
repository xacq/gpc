const express = require('express')
const morgan = require('morgan')
const bopar = require('body-parser')
const path = require('path')

const app = express()

app.disable('x-powered-by')
app.set ('env', 'development')
app.use (morgan('combined'))
app.use (bopar.json())
app.use (bopar.urlencoded({extended:false}))

app.set('views', path.join(__dirname,'views'))
app.set('view engine', 'pug')

app.get('/', (req, res) =>{
    res.write(`
    <h1>Proceso Server Express Rutas</h1>
    <a href="/temario">Temario</a>
    <a href="/temario/unidad1">Unidad 1</a>
    `)
    res.end()
})

app.get('/temario', (req, res) =>{
    res.write(`
    <h1>TEMARIO</h1>
    <a href="/">Volver</a>
    `)
    res.end()
})

app.get('/temario/unidad1', (req, res) =>{
    res.write(`
    <h1>UNIDAD 1</h1>
    <a href="/">Volver</a>
    `)
    res.end()
})

app.listen(9000, () => {
    console.log('Conectado el servidor al puerto 9000>>> Nueva accion realizada:')
})