import networkx as nx
from grafo import *

def prim(w, n, s):
    v = []
    while (len(v) != n):
        v.append(0)
    v[s] = 1
    E = []
    for i in range(0, n - 1):
        minimo = 9
        agregar_vertice = 0
        for j in range(0, n):
            if (v[j] == 1):
                for k in range(0, n):
                    if (v[k] == 0 and w[j][k] < minimo):
                        agregar_vertice = k
                        e = [j, k]
                        minimo = w[j][k]
        v[agregar_vertice] = 1
        E.append(e)
    return E


data = 0

print("SELECCIONE UNA DE LAS DOS OPCIONES")
print("1. ALGORITMO DE DJISTKRA")
print("2. ALGORITMO DE PRIM")
print("3. DIAGRAMA DE UN GRAFO")
data = input()

if data == "1":
    # Create a new graph
    G = nx.Graph()
    # Add edges to the graph with weights
    G.add_edge("A", "B", weight=5)
    G.add_edge("B", "C", weight=3)
    G.add_edge("A", "D", weight=6)
    G.add_edge("D", "E", weight=4)
    G.add_edge("E", "C", weight=2)

    print(G)
    print(G.edges)
    # Find the shortest path from node A to node C
    shortest_path = nx.dijkstra_path(G, "A", "C")
    # Print the shortest path
    print("Shortest path:", shortest_path)
    # Find the cost of the shortest path
    cost = nx.dijkstra_path_length(G, "A", "C")
    # Print the cost
    print("Cost:", cost)
elif data == "2":
    n = 6
    s = 0
    w = [
        [9, 4, 2, 9, 3, 9],
        [4, 9, 9, 5, 9, 9],
        [2, 9, 9, 1, 6, 3],
        [9, 5, 1, 9, 9, 6],
        [3, 9, 6, 9, 9, 2],
        [9, 9, 3, 6, 2, 9]
    ]
    print(prim(w, n, s))
elif data == "3":
    grafo = Grafos()
    grafo.agregarVector('A')
    grafo.agregarVector('B')
    grafo.agregarVector('C')
    grafo.agregarVector('D')
    grafo.agregarVector('E')
    grafo.agregarVector('F')

    grafo.relacionar('A', 'B')
    grafo.relacionar('A', 'C')
    grafo.relacionar('B', 'E')
    grafo.relacionar('B', 'F')
    grafo.relacionar('C', 'A')
    grafo.relacionar('C', 'D')
    grafo.relacionar('D', 'A')
    grafo.relacionar('E', 'F')

    grafo.mostrarVectores()