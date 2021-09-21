Para arrancar con un proyecto nuevo en NODEJS necesitamos:
- Descargar e instalar NODEJS desde la pagina oficial en internet.
- Comprobar instalacion abriendo un cmd y digitando node en la linea de comando.  Se debe obtener este mensaje:
C:\>...\node
Welcome to Node.js v14.17.4.
Type ".help" for more information.

- Digite CTRL+C para salir del editor de comandos de node.
- Genere una carpeta en la que se guardara el proyecto y desde VisualSCode abrirla.
- Abriendo una terminal, escribir para proyectos nuevos
>npm init --yes 
  para empezar un proyecto de NODEJS
- Se creara un archivo .json de nombre package.json que es un configurable para el proyecto.
- Tambien se necesita instalar express que es un framework para NODEJS > npm install express.
- Tambien necesitamos instalar react que es un framework para JScript en el cliente o frontend > npm install react
- Ademas para este ejemplo de proyecto MERN (Mongodb-Express-React-NODEJS) se necesita instalar algunos modulos:
    npm install mongoose  -> para enlazar a la base de datos
    nodemon -> permite  no reiniciar el servidor para cambios
    morgan
    webpack
    react
    react dom
    npm install babel-core babel-loader babel-preset-react babel-preset-env -D *ara generar e3 archivo Bundle
    npm run webpack  que me permite desarrollar y observar los cambios que se realiza en desarrollo y se van guardando
- Empezamos a trabajar creando un archivo index.js dentro de la carpeta inicial.
- Crear carpetas para estructurar el programa:
    node_modules -> se crea al instalar express
    package-lock.json -> se crea al instalar express
    app -> carpeta que se crea para guardar archivos de la aplicacion
    models -> carpeta que se crea para guardar instrucciones para el esquema de la base de datos en Mongodb
    public -> carpeta que se crea para guardar el HTML que se mostrara en el localhost para la aplicacion
    routes -> carpeta que se crea para especificar el API REST de la aplicacion
- Crear archivos base .js:
    index.js -> archivo que contiene las instrucciones como arranque de servidor desde nodejs, configuracion, etc.
    database.js -> archivo que posee informacion referente a la coneccion con la base de datos
    taskroutes.js -> archivo que va en la carpeta de routes y permite generar el API REST de la aplicacion
    index.html -> archivo web que va en la carpeta public  que posee la presentacion base de la aplicacion sobre la web.
    task.js -> archivo que va en la carpeta models y define el esquema o estructura de la database

