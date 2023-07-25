ROJO = "ROJO"
NEGRO = "NEGRO"

class NodoRN:
    def __init__(self, clave, color, izquierdo=None, derecho=None):
        self.clave = clave
        self.color = color
        self.izquierdo = izquierdo
        self.derecho = derecho


class ArbolRN:
    def __init__(self):
        self.raiz = None

    def insertar(self, clave):
        self.raiz = self._insertar_recursivo(self.raiz, clave)
        self.raiz.color = NEGRO

    def _insertar_recursivo(self, nodo, clave):
        if nodo is None:
            return NodoRN(clave, ROJO)

        if clave < nodo.clave:
            nodo.izquierdo = self._insertar_recursivo(nodo.izquierdo, clave)
        else:
            nodo.derecho = self._insertar_recursivo(nodo.derecho, clave)

        # Rotaciones y ajustes de colores
        if self._es_rojo(nodo.derecho) and not self._es_rojo(nodo.izquierdo):
            nodo = self._rotar_izquierda(nodo)
        if self._es_rojo(nodo.izquierdo) and self._es_rojo(nodo.izquierdo.izquierdo):
            nodo = self._rotar_derecha(nodo)
        if self._es_rojo(nodo.izquierdo) and self._es_rojo(nodo.derecho):
            self._cambiar_colores(nodo)

        return nodo

    def _es_rojo(self, nodo):
        return nodo is not None and nodo.color == ROJO

    def _rotar_izquierda(self, nodo):
        x = nodo.derecho
        nodo.derecho, x.izquierdo = x.izquierdo, nodo
        x.color, nodo.color = nodo.color, ROJO
        return x

    def _rotar_derecha(self, nodo):
        x = nodo.izquierdo
        nodo.izquierdo, x.derecho = x.derecho, nodo
        x.color, nodo.color = nodo.color, ROJO
        return x

    def _cambiar_colores(self, nodo):
        nodo.color = ROJO
        nodo.izquierdo.color = nodo.derecho.color = NEGRO

    def buscar(self, clave):
        return self._buscar_recursivo(self.raiz, clave) is not None

    def _buscar_recursivo(self, nodo, clave):
        if nodo is None or nodo.clave == clave:
            return nodo
        if clave < nodo.clave:
            return self._buscar_recursivo(nodo.izquierdo, clave)
        return self._buscar_recursivo(nodo.derecho, clave)

    def imprimir_arbol(self):
        self._imprimir_arbol_recursivo(self.raiz)

    def _imprimir_arbol_recursivo(self, nodo, nivel=0, prefijo="Raíz: "):
        if nodo is not None:
            self._imprimir_arbol_recursivo(nodo.derecho, nivel + 1, prefijo=" " * 4 + "D: ")
            print(" " * 4 * nivel + prefijo + str(nodo.clave) + f" ({nodo.color})")
            self._imprimir_arbol_recursivo(nodo.izquierdo, nivel + 1, prefijo=" " * 4 + "I: ")



if __name__ == "__main__":
    arbol_rn = ArbolRN() #GENERAMOS OBJETO DE LA CLASE arbolRN
    elementos = [50, 30, 70, 10, 40, 60, 80, 5, 15, 20] #CARGAMOS UN ARRAY CON DATOS
    for elemento in elementos:
        arbol_rn.insertar(elemento)
    print("Árbol Rojo y Negro después de la inserción:")
    arbol_rn.imprimir_arbol()
    clave_a_buscar = 0
    if arbol_rn.buscar(clave_a_buscar):  print(f"\nClave {clave_a_buscar} encontrada en el árbol.")
    else: print(f"\nClave {clave_a_buscar} no encontrada en el árbol.")
