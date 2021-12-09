const mongoose = require('mongoose')
const host = 'mongodb://127.0.0.1:27017/films'
mongoose.set('debug',true)
mongoose.Promise=global.Promise
const conn = mongoose.createConnection(
    host
)
conn.on('error', err =>{
    console.log('Error', err)
    return process.exit()
})
conn.on ('conectado', () => console.log('Conectado a MongoDB'))
const filmSchema = new mongoose.Schema(
    {
    _id:mongoose.Schema.Types.ObjectId,
    title: {type: String, trim: true, required: true},
    poster: {type: String, trim: true, required: true}
    },
    {
    strict: false
    }
)
const dataFilm = conn.model('dataFilm', filmSchema)
const newDocument = new dataFilm({
    _id: new mongoose.Types.ObjectId(),
    title: 'Star Wars II',
    poster: 'https://cdnb.20m.es/sites/127/2019/05/La-amenaza-t-620x349.jpg'

})

newDocument.save(err => {
    if (err){
        throw err
    }
    console.log('Almacenado...!')
})