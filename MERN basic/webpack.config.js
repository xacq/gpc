module.exports = {   //creacion de objetos
    entry: './src/app/index.js',  // archivo de ingreso
    output: {
      path: __dirname + '/src/public/js', //se generara en un archivo
      filename: 'bundle.js'   // este es el archivo generado
    },
    module: {
      rules: [
        {
          use: 'babel-loader',  //Usar Babel para traducir el codigo
          test: /\.js$/, //exprecion regular para que tome todos los archivos
          exclude: /node_modules/  //omita esta carpeta
        }
      ]
    }
  };