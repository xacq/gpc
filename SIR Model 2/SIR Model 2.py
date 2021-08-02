# Declaracion de variables
import numpy as np
from scipy.integrate import odeint
import matplotlib.pyplot as plt
from matplotlib.animation import FuncAnimation
from matplotlib.widgets import Slider, Button

# Declaracion de variables
poblacion = 1000000
Infectados_0 = 10
Recuperados_0 = 0  # Numero inicial de infectados y recuperados, I0 and R0.
Suceptibles_0 = poblacion - Infectados_0 - Recuperados_0  # Cualquier persona es suseptible a infectarse por lo que restamos al universo en t0
beta, gamma = 0.5, 1 / 3  # beta(b) el periodo de contacto y gamma(k) es el período de recuperacion
tiempo = np.linspace(0, 160, 80)  # para el eje x hasta 365 dias (1 ano)
xdata, ySucep, yInfec, yRecup = [], [], [], []


# Ecuacion Diferencial del modelo SRI
def funciones_diferenciales(y, tiempo, poblacion, beta, gamma):
    S, I, R = y  # cargamos los datos del vector en las variables
    dSdt = -beta * S * I / poblacion  # datos para grafica de suceptibles
    dIdt = beta * S * I / poblacion - gamma * I  # datos para grafica de infectados
    dRdt = gamma * I  # datos para grafica de recuperados
    return dSdt, dIdt, dRdt


valores_iniciales = Suceptibles_0, Infectados_0, Recuperados_0  # tupla con valores de condiciones iniciales
ret = odeint(funciones_diferenciales, valores_iniciales, tiempo,
             args=(poblacion, beta, gamma))  # Se integra la ecuacion SIR en funcion del tiempo, t.
Sucep, Infec, Recup = ret.T  # Carga la lista de valores para cada uno de las variables

menu = input(
    '''Seleccione un opcion:
      1. Simulador de modelo S I R.
      2. Generador de Animacion por ingreso de datos.
      3. Salir
      Ingrese opcion: ''')

if menu == "1":
    # Plot the data on three separate curves for S(t), I(t) and R(t)
    fig = plt.figure(facecolor='#F7F6FF')  # genera espacio para grafico con un fondo de color especifico
    ax = fig.add_subplot(111, facecolor='#F7F6FF', axisbelow=True)  #
    plt.subplots_adjust(bottom=0.25)  # ajuste del espacio de la grafica para los widgets

    figsucep, = ax.plot(tiempo, Sucep / poblacion, 'c', alpha=0.8, lw=2, label='Susceptibles',
                        ls='--')  # Se genera la grafica segun los valores de S
    figinfec, = ax.plot(tiempo, Infec / poblacion, 'red', alpha=0.4, lw=4,
                        label='Infectados')  # Se genera la grafica segun los valores de I
    figrecup, = ax.plot(tiempo, Recup / poblacion, 'm', alpha=0.8, lw=2, label='Recuperados',
                        ls='--')  # Se genera la grafica segun los valores de R

    ax.set_xlabel('Tiempo / días')  # etiquetas para el eje x
    ax.set_ylabel('Población (Fracción de casos/N)')  # etiquetas para el eje y

    ax.set_ylim(0, 1)  # establece el rango para eje y
    ax.grid(b=True, which='both', c='black', lw=1, ls=':')  # parametros sobre la cuadricula

    legend = ax.legend()  # muestra leyenda en el cuadro
    legend.get_frame().set_alpha(0.5)  # reubica la leyenda de las curvas segun se mueva
    for spine in ('top', 'right', 'left', 'bottom'):  # desaparece el marco del cuadro
        ax.spines[spine].set_visible(False)

    # Slide que medira b con rango 0 a 1
    axbeta = plt.axes([0.3, 0.15, 0.60, 0.02])
    var_beta = Slider(
        ax=axbeta,
        label="B (Periodo de contagio)",
        valmin=0,
        valmax=1,
        valinit=beta,
        orientation='horizontal',
        valstep=0.001,
        color='#FF32A5'
    )

    # Slide que medira k con rango 0 a 1
    axgamma = plt.axes([0.3, 0.11, 0.60, 0.02])
    var_gamma = Slider(
        ax=axgamma,
        label="K (Periodo de recuperación)",
        valmin=0,
        valmax=1,
        valinit=gamma,
        orientation='horizontal',
        valstep=0.001,
        color='#26FF38'
    )


    # funcion que actualizara el eje de las y en la grafica segun los valores de los widgets
    def actual(val):
        beta = var_beta.val  # Guardamos los valores del Slider en la variable de beta
        gamma = var_gamma.val  # Guardamos los valores del Slider en la variable de gamma
        # Repetimos instrucciones con odeint y la carga de valores en S, I, R para su respectiva graficacion
        ret = odeint(funciones_diferenciales, valores_iniciales, tiempo,
                     args=(poblacion, beta, gamma))  # Se integra la ecuacion SIR en funcion del tiempo, t.
        Susep, Infec, Recup = ret.T  # se carga los datos en listas representados en cada variable
        figsucep.set_ydata(Susep / poblacion)  # cambio de datos en eje de y (susceptible)
        figinfec.set_ydata(Infec / poblacion)  # cambio de datos en eje de y (infectados)
        figrecup.set_ydata(Recup / poblacion)  # cambio de datos en eje de y (recuperados)
        fig.canvas.draw_idle()  # instruccion que solicita la graficacion con valores alterados


    # llamado de la funcion ante el evento on-change del widget
    var_beta.on_changed(actual)  # Slider del peso de la masa inferior
    var_gamma.on_changed(actual)  # Slider del peso de la masa superior

    # Creamos un widget tipo boton para resetear valores a los sliders
    resetear = plt.axes([0.3, 0.06, 0.15, 0.04])  # Se crea clase para ubicarla
    button = Button(resetear, 'Reiniciar Valores', color='white', hovercolor='yellow')  # se configura el boton


    # Funcion que se llama para resetear los valores de los sliders
    def reset(event):
        var_beta.reset()
        var_gamma.reset()


    button.on_clicked(reset)  # Evento al dar click llamando a la funcoin reset
    plt.show()
elif menu == "2":
    # Valores muestra para ingresar
    print('''
    Modelo de datos para gráficas:
    Grafica con BETA= 0.5  y GAMMA= 0.333
    Grafica con BETA= 1  y GAMMA= 0.025
    Grafica con BETA= 0.25  y GAMMA= 0.6
    Puede escoger otros valores con el simulador.
    ''')
    # Ingresamos los valores para generar la grafica
    beta = input('Ingresar el Valor para BETA (Coeficiente de periodo de contagio): ')
    gamma = input('Ingresar el Valor para GAMMA (Coeficiente de periodo de recuperacion): ')
    beta = float(beta)
    gamma = float(gamma)

    xdata, ySucep, yInfec, yRecup = [], [], [], []

    valores_iniciales = Suceptibles_0, Infectados_0, Recuperados_0  # tupla con valores de condiciones iniciales
    ret = odeint(funciones_diferenciales, valores_iniciales, tiempo,
                 args=(poblacion, beta, gamma))  # Se integra la ecuacion SIR en funcion del tiempo, t.
    Sucep, Infec, Recup = ret.T  # Carga la lista de valores para cada uno de las variables

    fig = plt.figure(facecolor='white', figsize=(10, 6))  # genera espacio para grafico con un fondo de color especifico
    ax = fig.add_subplot(facecolor='white')
    ax.grid(b=True, which='both', c='black', lw=1, ls=':')  # parametros sobre la cuadricula
    ax.set_xlabel('Tiempo / días')  # etiquetas para el eje x
    ax.set_ylabel('Población (Fracción de casos/N)')  # etiquetas para el eje y
    for spine in ('top', 'right', 'left', 'bottom'):  # desaparece el marco del cuadro
        ax.spines[spine].set_visible(False)
    ax.set_title("Grafica 1. Crecimiento de infectados con un periodo de contagio BETA= " + str(beta) +
                 ", y un periodo de recuperacion GAMMA= " + str(gamma), loc="center",
                 fontdict={'fontsize': 10, 'fontweight': 'light', 'color': 'tab:blue'})

    lineSucep, = ax.plot([], [], 'c', alpha=0.8, lw=2,
                         label='Susceptibles')  # Se genera la grafica segun los valores de S
    lineInfec, = ax.plot([], [], 'red', alpha=0.4, lw=4,
                         label='Infectados')  # Se genera la grafica segun los valores de I
    lineRecup, = ax.plot([], [], 'm', alpha=0.8, lw=2,
                         label='Recuperados')  # Se genera la grafica segun los valores de R

    legend = ax.legend()  # muestra leyenda en el cuadro
    legend.get_frame().set_alpha(0.5)  # reubica la leyenda de las curvas segun se mueva


    # Declaracion para inicializar animacion
    def init():
        ax.set_xlim(0, 160)
        ax.set_ylim(0, 1.2)
        return lineSucep, lineInfec, lineRecup


    # Declaracion de funcion para crear la animacion
    def update(frame):
        xdata.append(tiempo[int(frame)])
        ySucep.append(Sucep[int(frame)] / poblacion)
        yInfec.append(Infec[int(frame)] / poblacion)
        yRecup.append(Recup[int(frame)] / poblacion)
        lineSucep.set_data(xdata, ySucep)
        lineInfec.set_data(xdata, yInfec)
        lineRecup.set_data(xdata, yRecup)
        return lineSucep, lineInfec, lineRecup


    ani = FuncAnimation(fig, update, frames=80, init_func=init, blit=True, interval=10)
    ani.save('Graf_B' + str(beta) + '_G' + str(gamma) + '.gif', writer='imagemagick')

    plt.legend()
    print("Animacion Generada...")
    print("Nombre del archivo generado: Graf_B" + str(beta) + "_G" + str(gamma) + ".gif")
else:
    exit()
