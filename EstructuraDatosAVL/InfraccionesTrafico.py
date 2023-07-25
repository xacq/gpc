class NodoInfraccion:
    def __init__(self, fecha, ubicacion, detalles):
        self.fecha = fecha
        self.ubicacion = ubicacion
        self.detalles = detalles
        self.izquierdo = None
        self.derecho = None


class ArbolInfracciones:
    def __init__(self):
        self.raiz = None

    def insertar(self, fecha, ubicacion, detalles): #FUNCION QUE LLAMA A LA RECURSIVA PARA RECORRER EL NODO DEL ARBOL
        self.raiz = self._insertar_recursivo(self.raiz, fecha, ubicacion, detalles)

    def _insertar_recursivo(self, nodo, fecha, ubicacion, detalles):
        if nodo is None: return NodoInfraccion(fecha, ubicacion, detalles)
        if fecha < nodo.fecha: nodo.izquierdo = self._insertar_recursivo(nodo.izquierdo, fecha, ubicacion, detalles)
        else: nodo.derecho = self._insertar_recursivo(nodo.derecho, fecha, ubicacion, detalles)
        return nodo

    def eliminar(self, fecha, ubicacion):
        self.raiz = self._eliminar_recursivo(self.raiz, fecha, ubicacion)

    def _eliminar_recursivo(self, nodo, fecha, ubicacion):
        if nodo is None: return None
        if fecha < nodo.fecha: nodo.izquierdo = self._eliminar_recursivo(nodo.izquierdo, fecha, ubicacion)
        elif fecha > nodo.fecha: nodo.derecho = self._eliminar_recursivo(nodo.derecho, fecha, ubicacion)
        else:
            if ubicacion < nodo.ubicacion: nodo.izquierdo = self._eliminar_recursivo(nodo.izquierdo, fecha, ubicacion)
            elif ubicacion > nodo.ubicacion: nodo.derecho = self._eliminar_recursivo(nodo.derecho, fecha, ubicacion)
            else:
                if not nodo.derecho: return nodo.izquierdo
                elif not nodo.izquierdo: return nodo.derecho
                else:
                    min_nodo = self._encontrar_min_nodo(nodo.derecho)
                    nodo.fecha, nodo.ubicacion, nodo.detalles = min_nodo.fecha, min_nodo.ubicacion, min_nodo.detalles
                    nodo.derecho = self._eliminar_recursivo(nodo.derecho, min_nodo.fecha, min_nodo.ubicacion)
        return nodo

    def _encontrar_min_nodo(self, nodo):
        while nodo.izquierdo: nodo = nodo.izquierdo
        return nodo

    def imprimir_infracciones(self):
        self._imprimir_recursivo(self.raiz)

    def _imprimir_recursivo(self, nodo):
        if nodo is not None:
            self._imprimir_recursivo(nodo.izquierdo)
            print(f"Fecha: {nodo.fecha}, Ubicación: {nodo.ubicacion}, Detalles: {nodo.detalles}")
            self._imprimir_recursivo(nodo.derecho)


class GrafoInfracciones:
    def __init__(self): self.grafo = {}

    def agregar_lugar(self, lugar): self.grafo[lugar] = set()

    def agregar_conexion(self, origen, destino):
        if origen in self.grafo and destino in self.grafo:
            self.grafo[origen].add(destino)
            self.grafo[destino].add(origen)

    def eliminar_conexion(self, origen, destino):
        if origen in self.grafo and destino in self.grafo:
            self.grafo[origen].discard(destino)
            self.grafo[destino].discard(origen)

    def imprimir_grafo(self):
        for lugar, conexiones in self.grafo.items(): print(f"{lugar} conectado con: {', '.join(conexiones)}")


def menu():
    print("\n----- MENÚ -----")
    print("1. Agregar lugar")
    print("2. Agregar conexión")
    print("3. Eliminar conexión")
    print("4. Registrar infracción")
    print("5. Eliminar infracción")
    print("6. Consultar infracciones")
    print("7. Consultar conexiones de un lugar")
    print("8. Salir")


if __name__ == "__main__":
    arbol_infracciones = ArbolInfracciones()
    grafo_infracciones = GrafoInfracciones()
    while True:
        menu()
        opcion = input("Seleccione una opción (1-8): ")
        if opcion == "1": # OPCION PARA CARGAR EN EL GRAFO UN LUFAR O CALLE
            lugar = input("Ingrese el nombre del lugar: ")
            grafo_infracciones.agregar_lugar(lugar)
            print(f"Lugar '{lugar}' agregado correctamente.")
        elif opcion == "2": #OPCION PARA CARGAR EN UN GRAFO UN LUGAR DE ORIGEN Y UN LUGAR DE DESTINO
            origen = input("Ingrese el nombre del lugar de origen: ")
            destino = input("Ingrese el nombre del lugar de destino: ")
            grafo_infracciones.agregar_conexion(origen, destino)
            print(f"Conexión entre '{origen}' y '{destino}' agregada correctamente.")
        elif opcion == "3": #OPCION PARA ELIMINAR UNA CONEXION EXITENTE Y LEVANTADA AL GRAFO
            origen = input("Ingrese el nombre del lugar de origen: ")
            destino = input("Ingrese el nombre del lugar de destino: ")
            grafo_infracciones.eliminar_conexion(origen, destino)
            print(f"Conexión entre '{origen}' y '{destino}' eliminada correctamente.")
        elif opcion == "4": # INGRESO DE INFRACCIONES LEVANTADOS EN UN ARBOL
            fecha = input("Ingrese la fecha de la infracción (YYYY-MM-DD): ")
            ubicacion = input("Ingrese el lugar de la infracción: ")
            detalles = input("Ingrese los detalles de la infracción: ")
            arbol_infracciones.insertar(fecha, ubicacion, detalles)
            print("Infracción registrada correctamente.")
        elif opcion == "5": # ELIMINACION DE UNA INFRACCION SEGUN LA FECHA Y UBICACION
            fecha = input("Ingrese la fecha de la infracción a eliminar (YYYY-MM-DD): ")
            ubicacion = input("Ingrese el lugar de la infracción a eliminar: ")
            arbol_infracciones.eliminar(fecha, ubicacion)
            print("Infracción eliminada correctamente.")
        elif opcion == "6": #MUESTRA LAS INFRACCIONES REGISTRADAS
            print("\nInfracciones registradas:")
            arbol_infracciones.imprimir_infracciones()
        elif opcion == "7": #MUESTRA LAS CONEXIONES REGISTRADAS
            lugar = input("Ingrese el nombre del lugar para consultar las conexiones: ")
            conexiones = grafo_infracciones.grafo.get(lugar)
            if conexiones: print(f"El lugar '{lugar}' está conectado con: {', '.join(conexiones)}")
            else: print(f"No se encontraron conexiones para el lugar '{lugar}'.")
        elif opcion == "8": # SALIDA DEL PROGRAMA
            print("Saliendo del programa...")
            break
        else:
            print("Opción inválida. Por favor, seleccione una opción válida.")
