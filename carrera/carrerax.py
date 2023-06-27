import pygame
import random

# Dimensiones de la ventana General
ANCHO_VENTANA = 800
ALTO_VENTANA = 700

# Clase para representar a cada uno de los animales
class Animal:
    def __init__(self, nombre, imagen, x, y): # parametros para cada animal
        self.nombre = nombre #nombre
        self.imagen = pygame.image.load(imagen) #ruta del archivo
        self.x = x #posicion de la imagen en x
        self.y = y #posicion de la imagen en y
    def dibujar(self, ventana): #metodo dibujar
        ventana.blit(self.imagen, (self.x, self.y))
    def mover(self): #metodo para mover el dibujo
        self.x += random.randint(1, 5) # Movimiento aleatorio en el eje x entre 1 y 5


# Mostrar los animales en la ventana
def mostrar_animales():
    for animal in animales:
        animal.dibujar(ventana)
    pygame.display.update()


# Mostrar mensaje de selección de animal
def mostrar_seleccion(animal_seleccionado):
    fuente = pygame.font.Font(None, 40)
    texto = fuente.render("Seleccionaste: " + animal_seleccionado.nombre, True, (255, 255, 0))
    ventana.blit(texto, (ANCHO_VENTANA // 2 - texto.get_width() // 2, ALTO_VENTANA - 50))
    pygame.display.update()


# Mostrar mensaje de ganador
def mostrar_mensaje(animal_ganador):
    fuente = pygame.font.Font(None, 40)
    texto = fuente.render("EL GANADOR ES EL: " + animal_ganador.nombre, True, (255, 255, 255))
    if animal_ganador.nombre == animal_seleccionado.nombre:
        fuente = pygame.font.Font(None, 60)
        mensaje = fuente.render("GANASTE...!!!", True, (0, 255, 255)) #mensaje en magenta
    else:
        fuente = pygame.font.Font(None, 80)
        mensaje = fuente.render("PERDISTE...!!!", True, (255, 0, 0)) #mensaje en rojo
    ventana.blit(texto, (ANCHO_VENTANA // 2 - texto.get_width() // 2, ALTO_VENTANA // 2 - texto.get_height() // 2))
    ventana.blit(mensaje,
                 (ANCHO_VENTANA // 2 - mensaje.get_width() // 2, ALTO_VENTANA // 1.5 - mensaje.get_height() // 1.5))
    pygame.display.update()


pygame.init() # Inicialización de Pygame
ventana = pygame.display.set_mode((ANCHO_VENTANA, ALTO_VENTANA)) #definimos los valores para la ventana
pygame.display.set_caption("CARRERA DE ANIMALES v.1.0")  #Titulo para la ventana del pygame
perro = Animal("PERRO", "perro.png", 50, 50)# Creación de los animales a traves del constructor
gato = Animal("GATO", "gato.png", 50, 160)# Creación de los animales a traves del constructor
conejo = Animal("CONEJO", "conejo.png", 50, 270)# Creación de los animales a traves del constructor
pato = Animal("PATO", "pato.png", 50, 380)# Creación de los animales a traves del constructor
caballo = Animal("CABALLO", "caballo.png", 50, 490)# Creación de los animales a traves del constructor
animales = [perro, gato, conejo, pato, caballo] # Lista de objetos que representa cada animal
jugando = True # Bucle principal del programa
seleccionado = False
animal_seleccionado = None
while jugando:
    for evento in pygame.event.get():
        if evento.type == pygame.QUIT:
            jugando = False
        elif evento.type == pygame.KEYDOWN and not seleccionado: # se espera la tecla a seleccionar
            if evento.key == pygame.K_1:
                animal_seleccionado = perro
                seleccionado = True
            elif evento.key == pygame.K_2:
                animal_seleccionado = gato
                seleccionado = True
            elif evento.key == pygame.K_3:
                animal_seleccionado = conejo
                seleccionado = True
            elif evento.key == pygame.K_4:
                animal_seleccionado = pato
                seleccionado = True
            elif evento.key == pygame.K_5:
                animal_seleccionado = caballo
                seleccionado = True
            else:
                fuente = pygame.font.Font(None, 30)
                texto = fuente.render("SELECCIONA UNO DE LOS ANIMALES DE LA LISTA.", True, (255, 0, 0))
                ventana.blit(texto, (ANCHO_VENTANA // 2 - texto.get_width() // 2, ALTO_VENTANA - 50))
                pygame.display.update()
                pygame.time.wait(750) #tiempo de espera para mostrar el mensaje de error

    if not seleccionado:
        mostrar_animales()
        fuente = pygame.font.Font(None, 30)
        texto = fuente.render("SELECCIONE UN ANIMAL DEL 1 AL 5 ...!", True, (255, 255, 0))
        ventana.blit(texto, (ANCHO_VENTANA // 2 - texto.get_width() // 2, ALTO_VENTANA // 2 - texto.get_height() // 2))
        pygame.display.update()
        pygame.time.wait(500)  # tiempo de espera para mostrar el mensaje
    else:
        mostrar_seleccion(animal_seleccionado)
        pygame.time.wait(1)  # tiempo de espera para mostrar el mensaje
        ventana.fill((0, 0, 0))
        for animal in animales:
            animal.dibujar(ventana)
            animal.mover()
            if animal.x >= ANCHO_VENTANA - animal.imagen.get_width(): # Comprobar si el animal ha llegado a la meta
                mostrar_mensaje(animal)  #muestra el mensaje
                jugando = False
        pygame.display.update()

# Esperar antes de cerrar la ventana
pygame.time.wait(3000)

# Salir del programa
pygame.quit()
