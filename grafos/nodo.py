#IMPLEMENTACION DE UN MODELO DE RUTAS DE COSTO MINIMO
#CONSIDERADO EL ALGORITMO DE RECORRIDO DEL GRAFO

class nodo:
    dato = None
    Derecha = None
    Izquierda = None

    def __init__(self, nuevoDato):
        self.dato = nuevoDato

    def getDato(self):
        return self.dato

    def getDerecha(self):
        return self.Derecha

    def getIzquierda(self):
        return self.Izquierda

    def setDato(self, nuevoDato):
        self.dato = nuevoDato

    def setDerecha(self, nuevoDerecha):
        self.Derecha = nuevoDerecha

    def setIzquierda (self, nuevoIzquierda):
        self.Izquierda = nuevoIzquierda

