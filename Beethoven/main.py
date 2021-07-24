from math import sqrt
from math import pi
from math import cos
import matplotlib.pyplot as plt
import numpy as np
from matplotlib.widgets import Slider, Button

# Definimos las constantes del modelo del metronomo de Beethoven
# Masas
M = 30.8  # Peso del contrapeso inferior del metronomo
m = 7.1  # Peso de la masa que permite graduar el tempo en el metronomo
u = 3.8  # Peso de la varilla
# Longitudes de la varilla
r = 138
rm = 220  # distancia entre el peso superior y el eje del metronomo
R = 36.4  # distancia entre el eje de la varilla y el contrapeso inferior del metronomo
Rm = 46.3  # variacion maxima que podia tener la varilla hacia abajo
# Angulo Maximo de la varilla
T = 1.03  # valor del angulo de oscilacion que alcanzaba la varilla al funcionar el metronomo
# Otras constantes
roz = 0.25  # valor de constante de rozamiento que empieza en 0 y va hasta 0.5
proy = 1000 # variable que permite visualizar los graficos y sus aproximaciones

# Funcion que calcula el valor de omega que afecta a la grafica del metronomo de Neewer/Beethoven
def omega(M, m, u, r, rm, R, Rm, T, roz):
    Mpri = M / m
    upri = u / m
    g = 9.8  # valor de la gravedad
    dividendo = Mpri * R - ((upri * (rm - Rm) / 2) - r)
    divisor = Mpri * (R ** 2) + (upri * ((Rm ** 2) + (rm ** 2) - (rm * Rm))) / 3 + (r ** 2)
    raiz = sqrt(g * (dividendo / divisor))
    rozamiento = 1/(1 + ((1 / pi) * cos(roz / (1 - roz))) - ((1 / pi) * cos(roz / (1 - roz))))
    omega2 = T * rozamiento * raiz # El valor de T varia entre 1.03 y 1.07
    return omega2


# SECCION DEL PROGRAMA QUE GRAFICA LA FRECUENCIA DEL METRONOMO DE BEETHOVEN 1 a 1 osea si la pieza musical tenia un tempo
# 120bpm, se toca a 120bpm, llegando a ser una grafica de color negro
plt.style.use("bmh")  # stilo a usar del plot
fig, bet = plt.subplots()
bet.margins(x=0, y=0)
plt.subplots_adjust(bottom=0.5)
plt.title('Metrónomo de Neewer (Gráfica en negro)')
plt.axis([0, 240, 0, 240])
var = np.linspace(40,208)  # funcion que genera un valor entre un rango el cual es el de un metronomo del tiempo de Beethoven
line, = bet.plot(var, var, label='Tempo de Beethoven')  # se asigna el valor del plot o grafica a variable para configuracion de la misma en setp
plt.setp(line, color='black', linewidth=2)
bet.set_xlabel("Frecuencia Escrita")  # Etiqueta de x para la precision
bet.set_ylabel("Frecuencia Reproducida")  # Etiqueta para la frecuencia del Metronomo

# grafica segun el modelo y los parametros del modelo matematico
var = np.linspace(40,208)  # funcion que genera un valor entre un rango el cual es el de un metronomo del tiempo de Beethoven
l, = bet.plot(var, var, color='purple', lw=1)  # se asigna el valor del plot o grafica a variable para configuracion de la misma en setp

# Slide que medira variacion en la m o peso de la masa que permite graduar el tempo en el metronomo con un rango +-30.8
axM = plt.axes([0.3, 0.35, 0.60, 0.02])
varM = Slider(
    ax=axM,
    label="M (Peso de masa inferior)",
    valmin=1,
    valmax=60,
    valinit=M,
    orientation='horizontal',
    valstep=0.2,
    color='purple'
)
# Slide que medira variacion en la M o el contrapeso inferior del metronomo con un rango +-7.1
axm = plt.axes([0.3, 0.31, 0.60, 0.02])
varm = Slider(
    ax=axm,
    label="m (Peso de masa superior)",
    valmin=1,
    valmax=14,
    valinit=m,
    orientation='horizontal',
    valstep=0.2,
    color='orange'
)
# Slide que medira variacion en la u o la varilla del metronomo con un rango +-3.8
axu = plt.axes([0.3, 0.27, 0.60, 0.02])
varu = Slider(
    ax=axu,
    label="u (Peso de la varilla)",
    valmin=1,
    valmax=7,
    valinit=u,
    orientation='horizontal',
    valstep=0.2,
    color='cyan'
)

# Slide que medira variacion en la rmax o la distancia entre peso superior y eje con un rango -138
axr = plt.axes([0.3, 0.23, 0.60, 0.02])
varr = Slider(
    ax=axr,
    label="rmax (distancia al eje desde m)",
    valmin=1,
    valmax=200,
    valinit=rm,
    orientation='horizontal',
    valstep=0.2,
    color='magenta'
)

# Slide que medira variacion en la R o la distancia entre peso inferior y eje con un rango -36.4 a 46.3
axR = plt.axes([0.3, 0.19, 0.60, 0.02])
varR = Slider(
    ax=axR,
    label="R/Rmax (distancia al eje desde M)",
    valmin=1,
    valmax=Rm,
    valinit=R,
    orientation='horizontal',
    valstep=0.2,
    color='green'
)

# Slide que medira variacion en la T o el angulo maximo de inclinacion de la varilla con un rango de 1.03 - 1.07
axT = plt.axes([0.3, 0.15, 0.60, 0.02])
varT = Slider(
    ax=axT,
    label="T (angulo maximo de la varilla)",
    valmin=1,
    valmax=1.07,
    valinit=T,
    orientation='horizontal',
    valstep=0.01,
    color='red'
)

# Slide que medira variacion en la e o variable de rozamiento que al ser 0.5 detiene la varilla y el movimiento
axroz = plt.axes([0.3, 0.11, 0.60, 0.02])
varroz = Slider(
    ax=axroz,
    label="e (rozamiento de varilla)",
    valmin=0,
    valmax=0.5,
    valinit=roz,
    orientation='horizontal',
    valstep=0.1,
    color='blue'
)
# funcion que actualizara el eje de las y en la grafica segun los valores de los widgets
def update(val):
    Mnuevo = varM.val*proy
    mnuevo = varm.val*proy
    unuevo = varu.val*proy
    rnuevo = varr.val*proy
    Rnuevo = varR.val*proy
    Tnuevo = varT.val*proy
    roznuevo = varroz.val*proy
    # debido a que los valores de omega son tan pequenos, es necesario multiplicar por 1000 para poder representarlos
    # graficamente
    l.set_ydata(var-(omega(Mnuevo, mnuevo, unuevo, rnuevo, rm, Rnuevo, Rm, Tnuevo, roznuevo)))
    fig.canvas.draw_idle()
# llamado de la funcion ante el evento on-change del widget
varM.on_changed(update)  # Slider del peso de la masa inferior
varm.on_changed(update)  # Slider del peso de la masa superior
varu.on_changed(update)  # Slider del peso de la varilla
varr.on_changed(update)  # Slider de la distancia entre el peso superior y el eje
varR.on_changed(update)  # Slider de la distancia entre el peso inferior y el eje
varT.on_changed(update)  # Slider del angulo Teta
varroz.on_changed(update)  # Slider del factor de rozamiento

# Creamos un widget tipo boton para resetear valores a los sliders
resetear = plt.axes([0.3, 0.06, 0.15, 0.04])  # Se crea clase para ubicarla
button = Button(resetear, 'Reiniciar Valores', color='white', hovercolor='yellow')  # se configura el boton

# Funcion que se llama para resetear los valores de los sliders
def reset(event):
    varT.reset()  # Slider de Angulo
    varR.reset()  # Slider de Distancia al contrapeso
    varr.reset()  # Slider de Distancia al peso superior
    varu.reset()  # Slider de la varilla
    varm.reset()  # Slider de la masa superior
    varM.reset()  # Slider de la masa inferior
    varroz.reset()  # Slider de la variable de rozamiento
button.on_clicked(reset)  # Evento al dar click llamando a la funcoin reset

plt.show()  # mostrar el espacio de dibujo
