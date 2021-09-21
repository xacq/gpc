//Declaracion de constantes de moculos instalados
const express = require('express'); //requiero el modulo express
const morgan = require('morgan');
const path = require('path');
const app = express(); // se iguala a la constante para llamar methodos y Aplicaciones de Express

// Constante para coneccion a Base de Datos
const { mongoose } = require('./database'); //si no existe la crea

// Configuracion para inicializacion de puerto para servidor de NODEJS
app.set('port', process.env.PORT || 3000); // se designa el puerto 3000 para salida de datos

// Middlewares o programas que vincula el sistema con la aplicacion a generar
app.use(morgan('dev'));
app.use(express.json());// cada vez que llegue informacion pasara la informacion y se corrobora si es un json

// Routes o rutas para el API REST
app.use('/api/tasks', require('./routes/task.routes'));

// Static Files o Archivos Estaticos como HTML
app.use(express.static(path.join(__dirname, 'public')));; //se enlaza a la ruta del html

// Inicializando el Servidor
app.listen(app.get('port'), () => {
  console.log(`Servidor inicializado en puerto ${app.get('port')}`);  //Muestra en la consola el mensaje
});