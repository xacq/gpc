// codigo que genera el texto de temarios en el view especifico
const express = require ('express')

const router = express.Router()

router.get('/temario', (req, res) =>{
    res.render('temario',{
        title: 'GPC WEBPAGE TEMARIO',
        message: 'Temario GPC'
    })
    res.end()
})

return router