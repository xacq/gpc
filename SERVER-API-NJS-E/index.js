//PARA TRABAJAR CON ESTA PRACTICA DE API REST SE NECESITA UN CLIENTE 
//COMO POSTMAN QUE PERMITE GENERAR INETARCCION CON EL LOCALHOST
//Declaracion de modulos
const Joi = require('joi');
const express = require('express');
const { get } = require('http');
const app = express();

app.use(express.json()); //adding a middleware que trabaja con archivos json

const URLroot = '/';
const URLapi = '/api/cur';
// array de courses
const courses=[
    { id:1, name:'curso 1'},
    { id:2, name:'curso 2'},
    { id:3, name:'curso 3'},
];

app.get(URLroot, (req, res)=>{
    res.send('Estoy vivo de nuevo!!!');
});

app.get(URLapi, (req, res) =>{
    console.log('Estoy en el API REST de mi servidor.');
    res.send(courses); // Se necesita enviar un array de courses
});
// /api/courses/1
app.get('/api/cur', (req, res) => {
    res.send(courses); // mostrara el array courses
});

// /api/courses/1 busqueda por parametros en el server dentro del array
app.get('/api/cur/:id', (req, res) => {
    const course = courses.find(c => c.id === parseInt(req.params.id));
    if (!course) return res.status(404).send('EL curso no se encuentra');  // 404 Error not found object
    res.send(course);
});

// http post request to API REST of Server validando el dato ingresado
app.post('/api/cur', (req, res) => {
    
   //Declaramos una estructura para anadir un data desde CLI (POSTMAN) hacia el API
    const course = {
        id: courses.length + 1,// aumentamos uno en la cantidad de registros del array
        nombre: req.body.name  // se graba en el registro con un nombre ingresado por http postman app chrome
    };
    courses.push(course); // ingresamos al API REST el registro ingresado
    res.send(course);  // mostramos en el API REST
});
// para generar un PUT, necesitamos el POSTMAN en PUT mode y en el address
// el numero de id ingresado y en el text el name a ingresar
app.put('/api/cur/:id', (req, res) =>{
    const course = courses.find(c => c.id === parseInt(req.params.id));
    if (!course) return res.status(404).send('EL curso no se encuentra');  // 404 Error not found object
    res.send(course);
    course.name = req.body.name;
    res.send(course);
});
// para eliminar registros en el API, llevamos a cabo el siguiente codigo
// verificando la existencia del codigo ingresado por el address y despues 
// analizando su eliminacion dentro del contenido del Array inicial
app.delete('/api/cur/:id', (req, res) =>{
    const course = courses.find(c => c.id === parseInt(req.params.id));
    if (!course) return res.status(404).send('EL curso no se encuentra');  // 404 Error not found object
    res.send(course);

    const index = courses.indexOf(course);
    courses.splice(index,1);
    res.send(course);
});

// PORT enviroment variable
const port = process.env.PORT || 3000;
app.listen(port, () => console.log(`Escuchando en puerto ${port}...`));
