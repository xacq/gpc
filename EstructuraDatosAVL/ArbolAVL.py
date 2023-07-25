#DECLARACION DE CLASE NODO
class NodoAVL:
    def __init__(self, clave):
        self.clave = clave
        self.altura = 1
        self.izquierdo = None
        self.derecho = None

#DECLARACION DE LA CALSE ARBOL AVL
class ArbolAVL:
    def __init__(self): # FUNCION ARRANQUE
        self.raiz = None

    def _altura(self, nodo): # FUNCION PARA DETERMINAR ALTURA DEL ARBOL
        if nodo is None: return 0
        return nodo.altura

    def _actualizar_altura(self, nodo): # FUNCION PARA ACTUALIZAR LA ALTURA DEL ARBOL
        nodo.altura = 1 + max(self._altura(nodo.izquierdo), self._altura(nodo.derecho))

    def _factor_balance(self, nodo): # FUNCION PARA VERIFICAR EL BALANCE DEL ARBOL
        if nodo is None: return 0
        return self._altura(nodo.izquierdo) - self._altura(nodo.derecho)

    def _rotar_izquierda(self, z): # FUNCION PARA ROTAR UN NODO HACIA LA IZQUIERDA
        y = z.derecho
        z.derecho = y.izquierdo
        y.izquierdo = z
        self._actualizar_altura(z)
        self._actualizar_altura(y)
        return y

    def _rotar_derecha(self, y): #FUNCION PARA ROTAR UN NODO A LA DERECHA
        x = y.izquierdo
        y.izquierdo = x.derecho
        x.derecho = y
        self._actualizar_altura(y)
        self._actualizar_altura(x)
        return x

    def _rebalancear(self, nodo): # FUNCION PARA REBALANCEAR UN NODO NO BALANCEADO
        self._actualizar_altura(nodo)
        balance = self._factor_balance(nodo)
        if balance > 1:  # Pesado hacia la izquierda
            if self._factor_balance(nodo.izquierdo) < 0:
                nodo.izquierdo = self._rotar_izquierda(nodo.izquierdo)
            return self._rotar_derecha(nodo)
        elif balance < -1:  # Pesado hacia la derecha
            if self._factor_balance(nodo.derecho) > 0:
                nodo.derecho = self._rotar_derecha(nodo.derecho)
            return self._rotar_izquierda(nodo)
        return nodo

    def insertar(self, clave): # FUNCION PARA INGRESAR UN NUEVO NODO
        self.raiz = self._insertar_recursivo(self.raiz, clave)

    # FUNCION DE INSERCION RECURSIVA LLAMANDOSE A SI MISMO HACIA LA DIRECCION EN LA QUE EL NODO DEBE IR POR SU PESO
    def _insertar_recursivo(self, nodo, clave):
        if nodo is None: return NodoAVL(clave)
        elif clave < nodo.clave:
            nodo.izquierdo = self._insertar_recursivo(nodo.izquierdo, clave)
        else:
            nodo.derecho = self._insertar_recursivo(nodo.derecho, clave)
        return self._rebalancear(nodo)

    def eliminar(self, clave):    # FUNCION PARA ELIMINAR UN NODO
        self.raiz = self._eliminar_recursivo(self.raiz, clave)

    # FUNCION PARA ELIMINAR UN NOD DE MANERA RECURSIVA LLAMANDOSE A SI MISMA CUANDO NO ENCUENTRA EL NODO SOLICITADO
    def _eliminar_recursivo(self, nodo, clave):
        if nodo is None: return nodo
        elif clave < nodo.clave: nodo.izquierdo = self._eliminar_recursivo(nodo.izquierdo, clave)
        elif clave > nodo.clave: nodo.derecho = self._eliminar_recursivo(nodo.derecho, clave)
        else:  # Encontramos el nodo a eliminar
            if not nodo.izquierdo: return nodo.derecho
            elif not nodo.derecho: return nodo.izquierdo
            else:  # El nodo tiene dos hijos
                min_nodo = self._encontrar_min_nodo(nodo.derecho)
                nodo.clave = min_nodo.clave
                nodo.derecho = self._eliminar_recursivo(nodo.derecho, min_nodo.clave)
        return self._rebalancear(nodo)

    def _encontrar_min_nodo(self, nodo): #FUNCION PARA ENCONTRAR UN NODO
        while nodo.izquierdo: nodo = nodo.izquierdo
        return nodo

    def buscar(self, clave): #FUNCION QUE PERMITE BUSCAR UN NODO SOLICITADO
        return self._buscar_recursivo(self.raiz, clave)

    def _buscar_recursivo(self, nodo, clave): # BUSQUEDA RECURSIVA LLAMANDO AL NODO SOLICITADO, SEGUN SU PESO
        if nodo is None or nodo.clave == clave: return nodo
        elif clave < nodo.clave: return self._buscar_recursivo(nodo.izquierdo, clave)
        return self._buscar_recursivo(nodo.derecho, clave)

    def imprimir_arbol(self): # SE IMPRIME EN LA TERMINAL EL ARBOL CREADO
        self._imprimir_arbol_recursivo(self.raiz)

    def _imprimir_arbol_recursivo(self, nodo, nivel=0, prefijo="Raíz: "):
        if nodo is not None:
            self._imprimir_arbol_recursivo(nodo.derecho, nivel + 1, prefijo=" " * 4 + "D: ")
            print(" " * 4 * nivel + prefijo + str(nodo.clave))
            self._imprimir_arbol_recursivo(nodo.izquierdo, nivel + 1, prefijo=" " * 4 + "I: ")

#FUNCION PRINCIPAL
if __name__ == "__main__":
    arbol_avl = ArbolAVL() # INSTANCIACION DEL OBJETO ARBOL_AVL
    elementos = [50, 30, 70, 10, 40, 60, 80, 5, 15, 20] #NUMERO DE DATOS EN UN ARRAY
    for elemento in elementos:
        arbol_avl.insertar(elemento) #CARGANDO NUMERO EN EL ARBOL AVL
    print("Árbol AVL después de la inserción:")
    arbol_avl.imprimir_arbol()
    clave_a_eliminar = 30
    arbol_avl.eliminar(clave_a_eliminar)
    print(f"\nÁrbol AVL después de eliminar el nodo con la clave {clave_a_eliminar}:")
    arbol_avl.imprimir_arbol()
    clave_a_buscar = 20
    resultado_busqueda = arbol_avl.buscar(clave_a_buscar)
    if resultado_busqueda:
        print(f"\nClave {clave_a_buscar} encontrada en el árbol.")
    else:
        print(f"\nClave {clave_a_buscar} no encontrada en el árbol.")
