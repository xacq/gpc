#IMPLEMENTACION DE UN MODELO DE RUTAS DE COSTO MINIMO
#CONSIDERADO EL ALGORITMO DE RECORRIDO DEL GRAFO

from lista import *

class cola(lista):

    def __init__(self, dato):
        lista.__init__(self, dato)
        self.tamanio = 1

    def insertar(self,dato):
        res = self.insertarNodo(dato)
        if res != False:
            self.tamanio += 1
            return res

    def quitar(self):
        dato = self.eliminarNodoCabeza()
        if dato:
            self.tamanio -= 1
            return dato
        else:
            return False




