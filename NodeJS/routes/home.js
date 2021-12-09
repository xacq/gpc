//genera el root del view o home
const express = require ('express')

const router = express.Router()

router.get('/', (req, res) =>{
    res.render('home',{
        title: 'GPC WEBPAGE HOME',
        message: 'Home GPC'
    })
    res.end()
})

return router
