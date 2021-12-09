const express = require('express')
const morgan = require('morgan')
const bopar = require('body-parser')
const path = require('path')

const app = express()

app.disable('x-powered-by')
app.set ('env', 'development')
app.use (morgan('combined'))
//app.use (morgan('tiny'))
//app.use (morgan('common'))
app.use (bopar.json())
app.use (bopar.urlencoded({extended:false}))

app.set('views', path.join(__dirname,'views'))
app.set('view engine', 'pug')


app.post('/', (req, res) =>{
    res.end ('<h1 style="text-align:center; background:darkblue; color:lightblue;">Servidor Express con Morgan acaba de realizar metodo POST</h1>')
})

/*app.get('/', (req, res) =>{
    res.end ('<h1 style="text-align:center; background:orange; color:orangered;">Servidor Express con Morgan acaba de realizar metodo GET</h1>')
})
*/
app.get('/', (req, res) =>{
    res.render ('home',{
        title:'App de servidores con Layout',
        message:'Incorporo Layout con variables'    
    })
})



app.listen(9000, () => {
    console.log('Conectado el servidor al puerto 9000>>> Nueva accion realizada:')
})