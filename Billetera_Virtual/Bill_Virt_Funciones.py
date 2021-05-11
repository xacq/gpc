# IMPORTE LA FECHA ACTUAL
from datetime import datetime

# VARIABLE QUE GUARDA LA FECHA DE LA TRANSACCION
dia = datetime.now()

# FUNCION QUE GUARDA EN ARCHIVO LOS DATOS DE UNA TRANSFERENCIA
def rec_temporal(dicc, moneda, nuevosaldo, archivo, monto, usd, rot):
    dicc[moneda] = nuevosaldo
    monedaslista = list(dicc.keys())  # SE GENERA LISTA DE LOS SIGNOS DE LAS MONEDAS
    saldoslista = list(dicc.values())  # SE GENERA LISTA DE LOS VALORES DE LAS MONEDAS
    arch = open(archivo, "w")
    for i in range(0, len(monedaslista)): arch.write(monedaslista[i]+":"+str(saldoslista[i])+"\n")
    arch.close()
    if rot == "in":  # VERIFICA QUE CLASE DE TRANSACCION
        print("%7.2f"%monto + " " + moneda + ". Ingresados:%7.2f" %usd + "$, segun cotizacion de criptomoneda." )
    else:
        print("%7.2f"%monto + " " + moneda+". Transferidos:%7.2f" %usd + " $, según cotización de criptomoneda.")


# FUNCION QUE GUARDA EN ARCHIVO LOS DATOS DE UNA TRANSFERENCIA
def rec_final(archivo, moneda, monto, usd, rot):
    arch = open(archivo,"a")
    arch.write(moneda+":"+str(monto)+"\n") # ESCRIBE LA CRIPTOMONEDA FUENTE DE TRANSACCION
    arch.close()
    if rot == "in":  # VERIFICA QUE CLASE DE TRANSACCION
        print("%7.2f"%monto + " " + moneda + ". Ingresados:%7.2f" %usd + "$, segun cotizacion de criptomoneda." )
    else:
        print("%7.2f"%monto + " " + moneda+". Transferidos:%7.2f" %usd + " $, según cotización de criptomoneda.")


# FUNCION QUE GUARDA EN ARCHIVO EL HISTORIAL DE LAS TRANSACCIONES
def rec_historial(archivo, monto, moneda, usd, rot):
    arch = open(archivo, "a")
    if rot == "in":  # VERIFICA QUE CLASE DE TRANSACCION
        arch.write(dia.strftime("Date:%c")+"- Coin:"+moneda+"- ADD(+): %9f"%monto+"- Value:$ %9f"%usd+"\n")
    else:
        arch.write(dia.strftime("Date:%c")+"- Coin:"+moneda+"- OUT(-): %9f"%monto+"- Value:$ %9f"%usd+"\n")
    arch.close()

