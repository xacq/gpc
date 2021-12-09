const home = require ('./routes/home')
const units = require ('./routes/units')
const user = require('./routes/user')

return app => {
    app.use('/', home)
    app.use('/temario',units)
    app.use('/', user)
}