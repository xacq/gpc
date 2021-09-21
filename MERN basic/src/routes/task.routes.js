
const express = require('express');
const router = express.Router(); //definir rutas en el servidor - responder con algo en la pagina

// Task Model
const Task = require('../models/task');

// todas las tareas listadas a continuacoin son procesos asincronos lo que significa que no llevan
// un modelo de lista de espera si no que se generan todas segun la necesidad sin esperar que una
// de ellas se complete para que que se ejecute otra de ellas
// GET all Tasks
router.get('/', async (req, res) => {
  const tasks = await Task.find();
  res.json(tasks);
});

// GET all Tasks
router.get('/:id', async (req, res) => {
  const task = await Task.findById(req.params.id);
  res.json(task);
});

// ADD a new task
router.post('/', async (req, res) => {
  const { title, description } = req.body;
  const task = new Task({title, description});
  await task.save();
  res.json({status: 'Registro grabado'});
});

// UPDATE a new task
router.put('/:id', async (req, res) => {
  const { title, description } = req.body;
  const newTask = {title, description};
  await Task.findByIdAndUpdate(req.params.id, newTask);
  res.json({status: 'Registro Actualizado'});
});

// DELETE a selected task
router.delete('/:id', async (req, res) => {
  await Task.findByIdAndRemove(req.params.id);
  res.json({status: 'Registro Eliminado'});
});

module.exports = router;