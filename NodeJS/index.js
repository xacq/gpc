const fs = require('fs')

/*fs.readFile('test.txt', 'utf8' , (err, data) => {
  if (err) {
    console.error(err)
    return
  }
  console.log(data)
})*/


const content = 'Xavier Calvas'
fs.writeFile('test.txt', content, { flag: 'a+' }, err => { //PERMITE AUMENTAR TEXTO EN EL ARCHIVO
//fs.writeFile('test.txt', content, err => { //PERMITE BORRAR LA INFO EN EL ARCHIVO Y EXCRIBE LA INFORMACION
  if (err) {    
    console.error(err)
    return
  }
  //file written successfully
})