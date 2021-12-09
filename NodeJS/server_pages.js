const express = require('express')
const morgan = require('morgan')
const bopar = require('body-parser')
const path = require('path')
const { title } = require('process')

const app = express()

app.disable('x-powered-by') // oculta la variable x-powered-by
app.set ('env', 'development') // genera un eniroment development
app.use (morgan('tiny')) //muestra informacion sobre las instrucciones del servidor
app.use (bopar.json()) //generamos la instruccion para trabajar conficheros JSON
app.use (bopar.urlencoded({extended: false}))

app.set('views', path.join(__dirname,'views'))// se establece las vistas para la aplicacion 
app.set('view engine', 'pug') // establecemos la extension de los archivos views

app.use('/static',express.static(path.join(__dirname,'public')))//permite archivos de una direccion 

app.get('/', (req, res) =>{
    res.render('home',{
        title: 'GPC WEBPAGE HOME',
        message: 'Home GPC'
    })
    res.end()
})

app.get('/temario', (req, res) =>{
    res.render('temario',{
        title: 'GPC WEBPAGE TEMARIO',
        message: 'Temario GPC'
    })
    res.end()
})

app.get('/:user', (req, res) =>{  //el orden siempre es importante
    //console.log ('variable user:', req.params.user)  //revisar la terminal para verificar el user ingresado por /xavier
    res.render('user', {
        title: 'GPC - USER',
        message: `Bienvenido usuario: ${req.params.user}`
    })
})

//TRATAMIENTO DE ERRORES CON MIDLEWARE  --  recordemos que el orden despues de la configuracion para usuarios es importantes
app.use((req, res, next) => {
    res.render('404', {
        title: 'Mensaje de Error',
        message: 'No existe la ruta a la que desea acceder...!'
    })
    next() // debido a que es un middleware debes seguir  funcionando despues del control
})

app.listen(9000, () => {
    console.log('Conectado el servidor al puerto 9000')
    console.log('>> Nueva accion realizada:')
})