# importamos librerias
import pandas as pds  # libreria para crear dataframes
import matplotlib.pyplot as plt  # libreria para graficar
import statistics  # libreria para calculos matematicos


# Funcion que permite validar la exixtencia del archivo
def checkFileExistance(codigo_observatorio):
    try:
        with open(codigo_observatorio, 'r') as f:  # resulta en true si existe
            return True
    except FileNotFoundError as e:  # da error -false- si no existe
        return False
    except IOError as e:
        return False  # da error -false- si no existe


# Se muestran los codigos de los archivos txt a seleccionar
print('Seleccione un codigo de una estación:')
print('JUN - SAE - GSB - GRH - SIA - SAM')
print('GRC - DAV - ANT - CHM - ENG - CHD')
print('ELM - STG - MER - SAR - SMA - BER')
print('PAY - NEU - SIO - LUZ - ALT - GVE')
print('OTL - BAS - LUG - SBE - CDF - RAG')
# se genera un ingreso por consola del codigo al que haremos referencia para la graficacion de los datos
codigo_observatorio = input('Ingrese el codigo del Observatorio que desea Graficar: ')
# convertimos el codigo ingresado en mayusculas y aseguramos algun error en el ingreso
codigo_observatorio = codigo_observatorio.upper()
# validamos la existencia del archivo
existe = checkFileExistance('homog_mo_' + codigo_observatorio + '.txt')
# condicion principal que controla si la estacion existe o no
if existe == False:  # si no existe el archivo, sale del programa
    print("No existe tal codigo de estación.")
    quit()
else:  # si existe el archivo realiza la graficacion de los datos del archivo
    # abrimos archivo con el codigo seleccionado
    df = open('homog_mo_' + codigo_observatorio + '.txt', "r")
    # leemos el contenido para el titulo del grafico y guardamos en "tit"
    tit = df.readlines()[5:8]
    df.close()
    # convertimos la list en string
    tit = " ".join(tit)
    # definimos como caracter (espacio) para eliminar en la variable tit
    specialChars = " "
    # loop para que recorra caracteres y compare con los espacios asi se edita el titulo para su presentacion
    for specialChar in specialChars:
        tit = tit.replace(specialChar, '')  # reemplaza el caracter encontrado (espacio) con nada ''
    # abrimos el archivo para verificar si posee las dos variables a graficar o si posee una sola de las dos
    f = open('homog_mo_' + codigo_observatorio + '.txt', "r")  # Abrimos el archivo de modo read (r)
    tip = 0
    i = 0
    while i < 30: # valor promedio de las lineas dentro antes de encontrar la cabecera de los datos
        linea = f.readline()  # <-Almacenamos en variable linea1 el método readline()
        if linea == 'Year  Month        Temperature      Precipitation  \n':
            tip = 1
            break
        elif linea == 'Year  Month        Temperature  \n':
            tip = 2
            break
        elif linea == 'Year  Month      Precipitation  \n':
            tip = 3
            break
        else:
            i += 1
    f.close()

    # abrimos archivo para consultar datos
    df = open('homog_mo_' + codigo_observatorio + '.txt', "r")
    # leemos las lineas desde 27 a 1919 para guardar en una variable data
    data = df.readlines()[i:1920]
    # cerramos los archivos
    df.close()
    # se crea un archivo temporal o se abre si existe y guarda informacion para manipulacion de los datos
    archivo = open("temporal.txt", "w")
    # estructura de control que va a guardar las filas de la lista en el archivo
    for i in data:
        archivo.write(i)
    archivo.close()  # cerramos archivo temporal

    # abrimos archivo usando pandas establecer columnas gracias a opcion delim_whitespace
    i = pds.read_csv("temporal.txt", header=0, delim_whitespace=True)

    # aislamos la primera columna que posee los años
    x = i.iloc[:, 0]  # año del evento

    if tip == 1:  # Cuando el archivo tiene ambas variables
        y1 = i.iloc[:, 2]  # Temperatura segun el mes y el año
        y2 = i.iloc[:, 3]  # Precipitacion segun el mes y el año

        # calculamos el promedio de temperatura
        avgtemp = statistics.mean(y1)
        avgtemp = round(avgtemp, 3)
        # calculamos el promedio de precipitaciones
        avgprec = statistics.mean(y2)
        avgprec = round(avgprec, 3)

        # inicializamos fig para graficacion de datos
        fig, ax1 = plt.subplots()
        color1 = 'tab:blue'  # asignamos un color para graficar una de las dos variables
        ax1.tick_params(axis='y', labelcolor=color1)

        ax2 = ax1.twinx()  # indicamos que en la grafica van a haber una variable mas
        color2 = 'tab:red'
        ax2.tick_params(axis='y')

        ax1.set_xlabel(tit)  # asignamos como label inferior del grafico la variable tit
        ax1.set_ylabel('Temperatura(C)' + '\n' + 'Promedio: ' + str(avgtemp),
                       color='magenta')  # una de las dos variables (Temperatura) en azul
        ax2.set_ylabel('Precipitación(mm)' + '\n' + 'Promedio: ' + str(avgprec),
                       color='cyan')  # una de las dos variables (Precipitacion) en rojo

        line1, = ax1.plot(x, y1, color=color1,
                          label='Temperatura')  # generamos la combinacion de datos entre el ano y la temperatura
        line2, = ax2.plot(x, y2, color=color2,
                          label='Precipitacion')  # generamos la combinacion de datos entre el ano y la precipitacion

        first_legend = plt.legend(handles=[line1], loc='upper right')
        plt.gca().add_artist(first_legend)
        plt.legend(handles=[line2], loc='lower right')

        ax1.axhline(linewidth=4, y=avgtemp, color='magenta', linestyle="--")  # muestra linea con promedio
        ax2.axhline(linewidth=4, y=avgprec, color='cyan', linestyle="--")

        fig.tight_layout()  # determina el espacio para la graficacion
        plt.title(
            'Periodo desde ' + str(x[0]) + ' a 2021')  # se coloca como titulo el periodo de tiempo que abarcan los datos
        plt.grid()
        plt.show()  # muestra el grafico
    elif tip == 2: # Cuando el archivo tiene solo temperaturas
        y1 = i.iloc[:, 2]  # Temperatura segun el mes y el año
        # calculamos el promedio de temperatura
        avgtemp = statistics.mean(y1)
        avgtemp = round(avgtemp, 3)
        # inicializamos fig para graficacion de datos
        fig, ax1 = plt.subplots()
        color1 = 'tab:blue'  # asignamos un color para graficar una de las dos variables
        ax1.plot(x, y1, color=color1, label='Temperatura')  # generamos la combinacion de datos entre el ano y la temperatura
        ax1.axhline(linewidth=4, y=avgtemp, color=color1, linestyle="--")
        ax1.tick_params(axis='y', labelcolor=color1)
        ax1.set_xlabel(tit)  # asignamos como label inferior del grafico la variable tit
        ax1.set_ylabel('Temperatura(C)' + '\n' + 'Promedio: ' + str(avgtemp),
                       color=color1)  # una de las dos variables (Temperatura) en azul
        fig.tight_layout()  # determina el espacio para la graficacion
        plt.title(
            'Periodo desde ' + str(x[0]) + ' a 2021')  # se coloca como titulo el periodo de tiempo que abarcan los datos
        plt.grid()
        plt.legend()
        plt.show()  # muestra el grafico
    elif tip == 3:   # Cuando el archivo tiene solo precipitaciones
        y2 = i.iloc[:, 2]  # Precipitaciones segun el mes y el año
        # calculamos el promedio de precipitacion
        avgprec = statistics.mean(y2)
        avgprec = round(avgprec, 3)
        # inicializamos fig para graficacion de datos
        fig, ax2 = plt.subplots()
        color2 = 'tab:red'  # asignamos un color para graficar una de las dos variables

        ax2.plot(x, y2, color=color2, label='Precipitaciones')  # generamos la combinacion de datos entre el ano y la temperatura
        ax2.axhline(linewidth=4, y=avgprec, color=color2, linestyle="--")

        ax2.tick_params(axis='y', labelcolor=color2)
        ax2.set_xlabel(tit)  # asignamos como label inferior del grafico la variable tit
        ax2.set_ylabel('Precipitación(mm)' + '\n' + 'Promedio: ' + str(avgprec),
                       color=color2)  # una de las dos variables (Precipitacion) en rojo
        fig.tight_layout()  # determina el espacio para la graficacion
        plt.title(
            'Periodo desde ' + str(x[0]) + ' a 2021')  # se coloca como titulo el periodo de tiempo que abarcan los datos
        plt.legend()
        plt.grid()
        plt.show()  # muestra el grafico

