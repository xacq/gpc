// Archivo que me permite conectar con la base de datos
// Se necesita instalar el modulo de mongoose
const mongoose = require('mongoose');
const URI = 'mongodb://localhost/mern-crud-test';//se expecifica la direccion de la base de datos

mongoose.connect(URI)
  .then(db => console.log('Db is connected')) // si la coneccion es exitosa muestre en la consola
  .catch(error => console.error(error)); //si genera un error muestra el error en la consola

module.exports = mongoose;
