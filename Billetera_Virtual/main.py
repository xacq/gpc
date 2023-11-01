# LIBRERIAS A UTILIZAR EN ESTE PROYECTO
import requests
from Bill_Virt_Funciones import *

# INICIALIZACION DE ARCHIVOS Y VARIABLES GLOBALES
archivo_saldo = "Bill_Virt_Saldos.txt"
archivo_transfer = "Bill_Virt_Transacciones.txt"
archivo_code = "Bill_Virt_Code.txt"
dicc_nombre_valor = {}
moneda_existente = {}
moneda_lista = ()
saldo_lista = ()
i = 0
valor_menu = 0


# FUNCION LOCAL QUE DEVUELVE EL NOMBRE DE LA MONEDA
def esmoneda(criptomoneda): return criptomoneda in dicc_nombre_valor


# PROCESO QUE ABRE UN ARCHIVO DE CUENTA PARA COPIAR SUS DATOS A UNA VARIABLE PARA GENERAR LISTA DE MONEDAS EXISTENTES
archivo_saldo_try = open(archivo_saldo, "r")
archivo_saldo_texto = archivo_saldo_try.read()
archivo_saldo_try.close()
if archivo_saldo_texto != "":
    archivo_lineas = archivo_saldo_texto.splitlines()
    for linea in archivo_lineas:
        saldo = linea.split(":")
        moneda_existente[saldo[0]] = saldo[1]
        moneda_lista = list(moneda_existente.keys())
        saldo_lista = list(moneda_existente.values())
else:
    moneda_existente = {}

# PROCESO PARA RECUPERAR EN LINEA LOS DATOS DEL API DESDE EL SERVER DE COINMARKETCAP
# LLAVE DE LA API QUE LOGRA PETICIONES A LA DIRECCION URL DE COINMARKETCAP
# https://pro.coinmarketcap.com/
API_KEY = "7766f4ee-4fdc-44d0-8392-27454715cca5"
# CABECERA PARA LA CONEXION CON EL API DE COINMARKET JUNTO CON PARAMETROS
headers = {
    # FORMATO DE RESPUESTA DE LA API EN JSON
    'Accepts': 'application/json',
    # PASAMOS LA LLAVE DE LA API DE LA WEB COMO ARGUMENTO
    'X-CMC_PRO_API_KEY': API_KEY
}
# SE ALMACENA EN DATA LA INFORMACION DESDE EL API DE COINMARKET
data = requests.get("https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/latest", headers=headers).json()
# CON UN LOOP FOR PERMITIMOS QUE INGRESE A LA VARIABLE LOS DATOS DE LA CRIPTOMONEDA Y EL VALOR DE LA MISMA
for cripto in data["data"]:
    dicc_nombre_valor[cripto["symbol"]] = cripto["quote"]["USD"]["price"]

# SE CARGA LOS VALORES DEL DICCIONARIO DEL API. LOS SIMBOLOS A MONTUPLA Y LOS VALORES A MONEDAS
nombre_cripto = dicc_nombre_valor.keys()
valor_cripto = dicc_nombre_valor.values()

# PROCESO PARA MOSTRAR BIENVENIDA EN PANTALLA E INGRESO DE VALIDACION DE CODIGO
# SUBPROCESO QUE ABRE ARCHIVO DONDE SE ENCUENTRA EL CODIGO PARA APROBAR TRANSACCIONES
archivo_code_try = open(archivo_code, "r")
code_trans = archivo_code_try.read()
archivo_code_try.close()
print('Billetera Virtual v. 0.1')

# SUBPROCESO QUE VERIFICA EXISTENCIA O NO DE CODIGO DE SEGURIDAD
if code_trans == "":  # CUANDO EL ARCHIVO ESTA VACIO
    print('''
Le damos la bienvenida a Billetera Virtual como usuario nuevo.

Para empezar a utilizar su Billetera es necesario generar un codigo de seguridad.
El codigo de seguridad debe tener un largo MINIMO de OCHO CARACTERES.
Tiene TRES INTENTOS para generar un codigo valido.''')
    # SUBPROCESO QUE GENERA UN INGRESO INICIAL PARA LA GENERACION DE CODIGO POR USUARIO NUEVO
    while i <= 2:  # VALIDA TRES INTENTOS
        code_trans = input("Ingrese su codigo de seguridad (Longitud minima de 8 caracteres)")
        if len(code_trans) < 8:  # CONDICION DE LA LONGITUD DEL CODIGO
            if i == 2:  # SI SE CUMPLEN LOS TRES INTENTOS
                print("Han culminado los intentos para generar su codigo de seguridad.")
                print("Gracias por preferirnos.")
                exit()
            else:
                i += 1
        else:  # SE GENERA DOS VALORES: i PARA NO REINGRESAR UN CODIGO Y valor_menu PARA DAR PASO AL MENU DE SERVICIOS
            archivo_codigo_try = open(archivo_code, "a")  # ABERTURA DE ARHIVO DE CODIGO
            archivo_codigo_try.truncate(0)  # SEGURAMOS QUE SE BORRE EL ARCHIVO
            archivo_codigo_try.write(code_trans)  # ESCRIBIMOS EL CODIGO EN EL ARCHIVO
            archivo_codigo_try.close()  # CERRAMOS EL ARCHIVO
            print("Tu código de seguridad " + code_trans + " se ha creado con éxito")
            print("Le recordamos cambiar su codigo cada mes.")
            valor_menu = "in"  # ASEGURA EL INGRESO AL MENU DE SERVICIOS
            i = 3  # PARA SALIR DEL LOOP INMEDIATAMENTE
else:
    valor_menu = input("Ingrese su codigo para ingresar al sistema:")
    if valor_menu == code_trans:
        valor_menu = "in"  # VALOR PARA CONSIDERAR EL MENU DE SERVICIOS
    else:
        valor_menu = "out"  # ASEGURAMOS QUE NO INGRESE AL MENU

# MENU DE PRESENTACION PARA ACCEDER A LOS SERVICIOS DE LA BILLETERA
if valor_menu == "in":
    valor_menu = input('''
        Opciones de Billetera Virtual
    1   Recibir.
    2   Transferir.
    3   Balance Parcial.
    4   Balance General.
    5   Registro de Movimientos.
    6   Actualizacion de Codigo para Transacciones.
    7   Salir.
        Opcion a escoger: ''')

    while not int(valor_menu) in range(1, 8):  # LOOP QUE EXIGE QUE SEAN OPCIONES DESDE EL 1 AL 7
        valor_menu = input("Error. Opciones solo del 1 al 7: ")
# PROCESO EN OPCION 1 PARA RECIBIR CRIPTOMONEDAS
    if valor_menu == "1":
        moneda_ingresada = input("Ingrese la moneda a recibir (Abortar presione x): ").upper()
        if moneda_ingresada == "X":  # OPCION PARA ABORTAR RECEPCION DE DATOS
            print("Transferencia abortada.")
            print("Gracias por preferirnos.")
            exit()
        else:
            while moneda_ingresada not in nombre_cripto:  # MIENTRAS MONEDA INGRESADA NO SEA PARTE DE MONEDAS EXISTENTES
                moneda_ingresada = input("Error. Ingrese la moneda a recibir: ").upper() # SOLICITA NUEVAMENTE INGRESO
            else:
                monto_ingresado = input("Ingrese la cantidad que va a recibir: ")  # AHORA SOLICITA CANTIDAD
                while not monto_ingresado.replace(".", "", 1).isdigit(): # MIENTRAS NO SEA UN DIGITO
                    monto_ingresado = input("Error. Ingrese una cantidad valida a recibir: ")
                else:
                    usd = float(dicc_nombre_valor.get(moneda_ingresada)) * float(monto_ingresado) # VALOR EN DOLARES
                    if moneda_existente != {}:  # SI LA COLECCION DE DATOS NO ESTA VACIA
                        if moneda_existente.get(moneda_ingresada):  # SE CONSIGUE LA MONEDA INGRESADA
                            saldo_temporal = float(moneda_existente.get(moneda_ingresada)) + float(monto_ingresado) # SUMAMOS LOS DATOS EXISTENTES E INGRESADOS
                            rec_temporal(moneda_existente, moneda_ingresada, saldo_temporal, archivo_saldo, float(monto_ingresado), usd, "in")  #GUARDA EN ARCHIVO TEMPORALMENTE
                            usd_total = float(dicc_nombre_valor.get(moneda_ingresada)) * saldo_temporal  # CALCULO DEL SALDO TOTAL DE ESTA CRIPTOMONEDA EN CUENTA
                            print("Su saldo actual es de: $ %9.2f" % usd_total)
                        else:
                            moneda_existente[moneda_ingresada] = monto_ingresado
                            rec_final(archivo_saldo, moneda_ingresada, float(monto_ingresado), usd, "in")  # GRABAMOS FINALMENTE EN ARCHIVO DE SALDOS
                    else:
                        rec_final(archivo_saldo, moneda_ingresada, float(monto_ingresado), usd, "in")  # GRABAMOS FINALMENTE EN ARCHIVO DE SALDOS
                    rec_historial(archivo_transfer, float(monto_ingresado), moneda_ingresada, usd, "in")  # GRABAMOS EN EL ARCHIVO DE TRANSACCIONES

# PROCESO EN OPCION 2 PARA TRANSFERIR CRIPTOMONEDAS
    elif valor_menu == "2":
        if moneda_existente != {}:  # SI VARIABLE MONEDA TIENE DATOS
            moneda_ingresada = input("Ingrese moneda a transferir (Visualizar criptomonedas presione ? / Abortar presione x): ").upper()  # INGRESA DATO ENMAYUSCULAS
            while moneda_ingresada not in nombre_cripto:  # VARIABLE SE COMPARA CON LOS NOMBRES EN COLECCION
                if moneda_ingresada == "?":  # AYUDA PARA VER LAS MONEDAS EXISTENTES EN LA CUENTA
                    print(moneda_lista)
                elif moneda_ingresada == "X":  # AYUDA PARA SALIR DE LA BILLETERA
                    print("Transferencia abortada.")
                    print("Gracias por preferirnos.")
                    exit()
                else:
                    print("Error en ingreso de criptomoneda. Usted posee en su cuenta estas criptomonedas:")
                moneda_ingresada = input("Ingrese moneda a transferir: ").upper  # VARIABLE GUARDA EN MAYUSCULAS
            else:  # CUANDO LA MONEDA ESTA EN LA BILLETERA
                print('Saldo: ' + moneda_existente.get(moneda_ingresada) + " criptomonedas " + moneda_ingresada + ".")  # MUESTRA EL SALDO DE LA MONEDA A TRANSFERIR
                monto_ingresado = input("Ingrese cantidad a transferir (Abortar presione 0) : ")  # INGRESA CANTIDAD DE MONEDAS A TRANSFERIR
                if monto_ingresado == 0:  # SI ES ) SE ABORTA LA TRNASACCION
                    print("Transferencia abortada.")
                    print("Gracias por preferirnos.")
                    exit()
                else:  # CASO CONTRARIO SE VERIFICA SI ES UN DIGITO EL VALOR U OTRO VALOR ASI COMO SI ES FACTIBLE TRANSFERIR ESA CANTIDAD
                    while not monto_ingresado.replace(".", "", 1).isdigit() or float(monto_ingresado) > float(moneda_existente.get(moneda_ingresada)):
                        if not monto_ingresado.replace(".", "", 1).isdigit():
                            monto_ingresado = input("Error. Ingrese la cantidad de criptomonedas que desea transferir: ")
                        elif float(monto_ingresado) > float(moneda_existente.get(moneda_ingresada)):
                            monto_ingresado = input("Error. Ingrese valor dentro del saldo existente: ")
                        elif not monto_ingresado.replace(".", "", 1).isdigit() and float(monto_ingresado) > float(moneda_existente.get(moneda_ingresada)):
                            monto_ingresado = input("Error. Ingrese cantidad valida de " + moneda_ingresada + " a transferir: ")
                    else:  # SE CALCULA EL VALOR PARCIAL DE DOLARES PARA MOSTRAR, SE LLAMA A LAS FUNCIONES DE GRABACION EN ARCHIVOS Y SE MUESTRA LOS VALORES RESULTANTES DE LA TRANSACCION
                        usd = float(dicc_nombre_valor.get(moneda_ingresada)) * float(monto_ingresado)
                        saldo_temporal = float(moneda_existente.get(moneda_ingresada)) - float(monto_ingresado)
                        rec_temporal(moneda_existente, moneda_ingresada, saldo_temporal, archivo_saldo, float(monto_ingresado), usd, "ou")
                        total = float(dicc_nombre_valor.get(moneda_ingresada)) * saldo_temporal
                        print("Posee %7.2f" % saldo_temporal + " criptomonedas " + moneda_ingresada + ". Saldo :$ %9.2f" % total + ".")
                        rec_historial(archivo_transfer, float(monto_ingresado), moneda_ingresada, usd, "ou")
        else:
            print("Error. No posee criptomonedas para esta transacción. Gracias por preferirnos.")
            print("Gracias por preferirnos")
            exit()

# PROCESO EN OPCION 3 PARA MOSTRAR BALANCE SEGUN CRIPTOMONEDA
    elif valor_menu == "3":
        if moneda_existente != {}:
            moneda_ingresada = input("Ingrese criptomoneda a consultar: ").upper()
            while not moneda_ingresada in nombre_cripto:  # CUANDO NO EXISTE LA MONEDA EN LA CUENTA
                print("Error. Ingrese criptomoneda existente en su cuenta. Usted tiene: ")
                print(moneda_lista)
                moneda_ingresada = input("Ingrese moneda a consultar: ").upper()
            else:  # MONEDA INGRESADA EXISTENTE EN LA CUENTA DEL CLIENTE
                usd = float(dicc_nombre_valor.get(moneda_ingresada)) * float(moneda_existente.get(moneda_ingresada))
                print("Usted posee: " + moneda_existente.get(moneda_ingresada) + " criptomonedas " + moneda_ingresada)
                print("Cantidad en USD: %7.2f" % usd + " de criptomonedas " + moneda_ingresada)
        else:
            print('''
            Error. No posee criptomonedas para esta transacción. 
            Gracias por preferirnos.''')

# PROCESO EN OPCION 4 PARA MOSTRAR BALANCE GENERAL DE LA CUENTA
    elif valor_menu == "4":
        if moneda_existente != {}:  # SI LA VARIABLE POSEE MONEDAS EXISTENTES
            print("\nBALANCE PARCIAL DE SU CUENTA\n")
            i = 0  # INICIALIZAMOS EL CONTADOR EN 0
            usdtotal = 0
            while i < len(moneda_existente):  # SI EL CONTADOR ES MENOR AL LARGO DE LA LISTA DE MONEDAS EXISTENTES
                usd = float(dicc_nombre_valor.get(moneda_lista[i])) * float(saldo_lista[i])  # CALCULO SUBTOTAL DE DOLARES DE LA CUENTA
                print("Criptomoneda: " + moneda_lista[i] + " con Valor:$ %7.2f" % float(saldo_lista[i]) + " un Total:$%7.2f" % usd)
                i += 1  # CONTADOR SE AUMENTA EN UNO PARA VERIFICAR EL SIGUIENTE DATO DE LA CUENTA
                usdtotal += usd  # SUMAMOS EL VALOR PARCIAL AL TOTAL
            print("Total de su cuenta de $ %7.2f" % usdtotal)  # MUESTRA EL VALOR TOTAL DE LA CUENTA
            print("Gracias por preferirnos.")
            exit()
        else:
            print("No posee criptomonedas para Balance.")  # CUANDO NO HAY CRIPTOMONEDAS
            print("Gracias por preferirnos.")
            exit()

# PROCESO EN OPCION 5 PARA MOSTRAR TRANSACCIONES
    elif valor_menu == "5":
        archivo_transfer_try = open(archivo_transfer, "r")  # ABRIMOS ARCHIVO DE TRANSFERENCIAS PARA LECTURA
        archivo_trasnfer_texto = archivo_transfer_try.read()
        archivo_transfer_try.close()
        if archivo_trasnfer_texto == "":  # SI EL ARCHIVO DE TRANSACCCIONES NO POSEE INFORMACION
            print("Usted no posee historial de movimientos.")
            print("Gracias por preferirnos.")
            exit()
        else:
            print("\n" + archivo_trasnfer_texto)  # PRESENTA EN PANTALLA LAS TRANSACCIONES GRABADAS EN EL ARCHIVO
            exit()

# PROCESO EN OPCION 6 PARA CAMBIAR CODIGO DE INGRESO
    elif valor_menu == "6":
        i = 0
        while i <= 2:  # VALIDA TRES INTENTOS
            code_trans = input("Ingrese su codigo de seguridad (Longitud minima de 8 caracteres)")
            if len(code_trans) < 8:  # CONDICION DE LA LONGITUD DEL CODIGO
                if i == 2:  # SI SE CUMPLEN LOS TRES INTENTOS
                    print("Han culminado los intentos para generar su codigo de seguridad.")
                    print("Gracias por preferirnos.")
                    exit()
                else:
                    i += 1
            else:  # SE GENERA DOS VALORES: i PARA NO REINGRESAR UN CODIGO Y valor_menu PARA DAR PASO AL MENU DE SERVICIOS
                archivo_codigo_try = open(archivo_code, "a")  # ABERTURA DE ARHIVO DE CODIGO
                archivo_codigo_try.truncate(0)  # SEGURAMOS QUE SE BORRE EL ARCHIVO
                archivo_codigo_try.write(code_trans)  # ESCRIBIMOS EL CODIGO EN EL ARCHIVO
                archivo_codigo_try.close()  # CERRAMOS EL ARCHIVO
                print("Tu código de seguridad " + code_trans + " se ha creado con éxito")
                print("Le recordamos cambiar su codigo cada mes.")
                print("Gracias por preferirnos.")
                exit()
    else:
        print("Gracias por preferirnos.")
        exit()

# CUANDO NO SE ACEPTA EL CODIGO
else:
    print('''
        Codigo no aceptado. 
        Gracias por preferirnos.''') # MENSAJE SOBRE EL CODIGO NO ACETADO
    exit()
