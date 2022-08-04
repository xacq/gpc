const User = require('./auth.dao');
const jwt = require('jsonwebtoken');
const bcrypt = require('bcryptjs');
const SECRET_KEY = 'secretkey123456';

exports.createUser = (req, res, next) => {
  const newUser = {
    name: req.body.name,
    email: req.body.email,
    password: bcrypt.hashSync(req.body.password),
    type: req.body.type
  }

  User.create(newUser, (err, user) => {
    if (err && err.code === 11000) return res.status(409).send('El correo existe');
    console.log(err);
    if (err) return res.status(500).send('Error del servidor 1');
    const expiresIn = 24 * 60 * 60;
    const accessToken = jwt.sign({ id: user.id },
      SECRET_KEY, {
        expiresIn: expiresIn
      });
    const dataUser = {
      name: user.name,
      email: user.email,
      type: user.type,
      paso1: user.paso1,
      paso2: user.paso2,
      paso3: user.paso3,
      paso4: user.paso4,
      paso5: user.paso5,
      accessToken: accessToken,
      expiresIn: expiresIn
    }
    // response 
    res.send({ dataUser });
  });
}

exports.loginUser = (req, res, next) => {
  const userData = {
    email: req.body.email,
    password: req.body.password
  }
  User.findOne({ email: userData.email }, (err, user) => {
    if (err) {

      return res.status(500).send('Error del servidor 2');
    }
    if (!user) {

      // email does not exist
      res.status(409).send({ message: 'Algo salio mal' });
    } else {
      const resultPassword = bcrypt.compareSync(userData.password, user.password);
      if (resultPassword) {
        const expiresIn = 24 * 60 * 60;
        const accessToken = jwt.sign({ id: user.id }, SECRET_KEY, { expiresIn: expiresIn });
        const dataUser = {
          name: user.name,
          email: user.email,
          type: user.type,
          paso1: user.paso1,
          paso2: user.paso2,
          paso3: user.paso3,
          paso4: user.paso4,
          paso5: user.paso5,
          accessToken: accessToken,
          expiresIn: expiresIn
        }
        res.send({ dataUser });
      } else {

        res.status(409).send({ message: 'Algo salio mal' });
      }
    }
  });
}











