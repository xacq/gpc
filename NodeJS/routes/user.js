//seteo de usuarios en variable de usuarios
const express = require ('express')

const router = express.Router ()

router.get('/:user', (req, res) =>{  //el orden siempre es importante
    //console.log ('variable user:', req.params.user)  //revisar la terminal para verificar el user ingresado por /xavier
    res.render('user', {
        title: 'GPC - USER',
        message: `Bienvenido usuario: ${req.params.user}`
    })
})

return router