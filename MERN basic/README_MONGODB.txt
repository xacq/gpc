INSTALACION DE MOGODB
- Descargar el archivo de Mongodb.com referente a On-premises -> MongoDB Community Server.
- Al estar instalando MongoDB recordar el no seleccionar la opcion de mantener como servicio permanente en el sistema.
- Terminada la instalacion, crear en la raiz del disco C: la carpeta /data, y dentro de esta carpeta crear otra con nombre /db.
- Abrir una consola cmd e ir a la carpeta de intalacion C:\Program Files\MongoDB\Server\5.0\bin.
- Ejecutar programa mongod.exe el cual generara archivos de servicio en las carpetas instaladas y al mismo tiempo iniciara el servicio de MongoDB.
- Sin cerrar el cmd, abrir otro cmd y acceder a la misma ruta C:\Program Files\MongoDB\Server\5.0\bin y ahora ejecutar mongo.exe para ejecutar el servidor.
- Si la instalacion es adecuada mostrara el siguiente mensaje:

MongoDB shell version v5.0.2
connecting to: mongodb://127.0.0.1:27017/?compressors=disabled&gssapiServiceName=mongodb
Implicit session: session { "id" : UUID("e8b3bde2-962d-4cc3-bb66-d66900791176") }
MongoDB server version: 5.0.2
...

The server generated these startup warnings when booting:
        2021-09-01T07:22:26.523-05:00: Access control is not enabled for the database. Read and write access to data and configuration is unrestricted
        2021-09-01T07:22:26.524-05:00: This server is bound to localhost. Remote systems will be unable to connect to this server. Start the server with --bind_ip <address> to specify which IP addresses it should serve responses from, or with --bind_ip_all to bind to all interfaces. If this behavior is desired, start the server with --bind_ip 127.0.0.1 to disable this warning.

>

- No cerrar los cmd aperturados para que haya interaccion con la aplicacion.