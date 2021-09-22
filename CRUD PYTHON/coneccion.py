import sqlite3
from sqlite3.dbapi2 import connect

class contactos:
    def iniciarConeccion(self):
        conectar = sqlite3.connect('CRUD.s3db')
        conectar.text_factory = lambda b: b.decode(errors='ignore')
        return conectar

    def leerContactos(self,):
        conectar = self.iniciarConeccion()
        cursor = conectar.cursor()
        sentenciaSQL = "SELECT * FROM Contactos"
        cursor.execute(sentenciaSQL)
        #print(cursor.fetchall())
        return cursor.fetchall()


    def crearContactos(self, datosContacto):
        conectar = self.iniciarConeccion()
        cursor = conectar.cursor()
        sentenciaSQL = "INSERT INTO Contactos(nombre, correo) VALUES(?,?)"
        cursor.execute(sentenciaSQL, datosContacto)
        conectar.commit()  #Cerrar la insercion
        conectar.close()  #Cierre de la conexion a la DB


    def borrarContactos(self, idContacto):
        conectar = self.iniciarConeccion()
        cursor = conectar.cursor()
        sentenciaSQL = "DELETE FROM Contactos WHERE id=(?)"
        cursor.execute(sentenciaSQL,[idContacto])
        conectar.commit()  #Cerrar la insercion
        conectar.close()  #Cierre de la conexion a la DB


    def modificarContactos(self, datosContacto):
        conectar = self.iniciarConeccion()
        cursor = conectar.cursor()
        sentenciaSQL = "UPDATE Contactos SET nombre=? ,correo=? WHERE id=?"
        cursor.execute(sentenciaSQL, datosContacto)
        conectar.commit()  #Cerrar la insercion
        conectar.close()  #Cierre de la conexion a la DB
