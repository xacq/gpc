// Archivo que disena el esquema de los datos
const mongoose = require('mongoose');
const { Schema } = mongoose;
// el esquema se aplica si no esta creada la base de datos la genera
const TaskSchema = new Schema({
  title: { type: String, required: true }, // tipo de dato
  description: { type: String, required: true }  // tipo de dato
});

module.exports = mongoose.model('Task', TaskSchema); //modelo determinado por el Schema para crear la base de datos