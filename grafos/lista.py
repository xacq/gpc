#IMPLEMENTACION DE UN MODELO DE RUTAS DE COSTO MINIMO
#CONSIDERADO EL ALGORITMO DE RECORRIDO DEL GRAFO
#SCRIPT QUE PERMITE ENLAZAR NODOS EN UNA LISTA

from nodo import *

class lista:
    Nodo_cabeza = None
    Nodo_cola = None

    def __init__(self, dato):
        self.Nodo_cabeza = nodo(dato)

    def insertarNodo(self, dato):
        if self.listaVacia():
            self.Nodo_cabeza = nodo(dato)
        else:
            nuevoNodo = nodo(dato)
            nodoFin = self.irAlFinal()
            nodoFin.setDerecha(nuevoNodo)

    def insertarNodoCabeza(self,dato):
        nuevoNodo = nodo(dato)
        if self.listaVacia():
            self.Nodo_cabeza = nuevoNodo
        else:
            nuevoNodo.setDerecha(self.Nodo_cabeza)
            self.Nodo_cabeza = nuevoNodo
            nodoFin = self.irFinal()
            return True

    def eliminarNodoCabeza(self):
        if self.listaVacia:
            return False
        else:
            dato = self.Nodo_cabeza.getDato()
            self.Nodo_cabeza = self.Nodo_cabeza.getDerecha()
            return dato

    def irAlFinal(self):
        nodoGuia = self.Nodo_cabeza
        while True:
            if nodoGuia.getDerecha()!=None:
                nodoGuia=nodoGuia.getDerecha()
            else:
                return nodoGuia

    def eliminarNodo(self,dato):
        if self.listaVacia():
            return False
        else:
            if self.Nodo_cabeza.getDato()==dato:
                self.Nodo_cabeza = self.Nodo_cabeza.getDerecha()
                return True
            else:
                nodoAnterior = self.Nodo_cabeza
                nodoGuia = self.Nodo_cabeza.getDerecha()
                while True:
                    if nodoGuia.getDato == dato:
                        return False

    def buscarNodo(self, dato):
        nodoGuia = self.Nodo_cabeza
        while True:
            if nodoGuia.getDerecha() != None:
                if nodoGuia.getDato()==dato:
                    return nodoGuia
                else:
                    nodoGuia.getDerecha()
            else:
                return False

    def recorrerLista(self):
        if self.listaVacia():
            return False
        else:
            nodoGuia = self.Nodo_cabeza
            while True:
                print(nodoGuia.getDato(), "=>" ,end="")
                if (nodoGuia.getDerecha() != None):
                    nodoGuia = nodoGuia.getDerecha()
                else:
                    break

    def listaVacia(self):
        if self.Nodo_cabeza == None:
            return True
        else:
            return False

    def getNodoCabeza(self):
        return self.Nodo_cabeza



