
from lista import *
from cola import *

class Grafos():
    arreglo = []

    def __int__(self, dato):
        Lista = lista(dato)
        self.arreglo.append(Lista)

    def agregarVector(self,dato):
        Lista = lista(dato)
        self.arreglo.append(Lista)

    def mostrarVectores(self):
        for Lista in self.arreglo:
            Lista.recorrerLista()
            print("\n")

    def relacionar(self,vector1, vector2):
        for Lista in self.arreglo:
            if Lista.Nodo_cabeza.dato == vector1:
                Lista.insertarNodo(vector2)

    def recorrer(self, vector1):
        visitado = []  # se marca el vertice de partida
        visitado.append(vector1)
        cola1 = cola(vector1)
        while cola1.tamanio > 0:
            nodoVisita=cola1.quitar()
            for Lista1 in nodoVisita:
                if Lista1.Nodo_cabeza.dato == nodoVisita:
                    Lista = Lista1
            while True:
                nodoMarcado = False
                for nodo in visitado:
                    if nodo == Lista1.Nodo_cabeza:
                        nodoMarcado = True
                        break















