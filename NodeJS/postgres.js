const sequilize = require('sequelize')
const conect = new sequilize('film', 'postgres','1234',{
    host:'localhost',
    dialect: 'postgres'
})

const film = conect.define(
    'film',
    {
        id:{
            type:sequilize.INTEGER,
            autoIncrement:true,
            field: 'id',
            primaryKey: true
        },
        title:{
            type:sequilize.STRING,
            field: 'title'
        },
        poster:{
            type: sequilize.STRING,
            field: 'poster'
        }
    }
)

film.sync ({ force:true})
    .then(() => film.create({
        title: 'Star Wars II',
        poster: 'https://cdnb.20m.es/sites/127/2019/05/La-amenaza-t-620x349.jpg'
    }))