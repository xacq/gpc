import sqlite3
import random
from datetime import date
from xlsxwriter.workbook import Workbook


def sql_connection():
    conn = sqlite3.connect('FACTURACION.db')
    return conn

def sql_table (conn):

    c = conn.cursor()

    c.execute("""CREATE TABLE IF NOT EXISTS FACTURAS (
        NUMERO TEXT PRIMARY KEY NOT NULL,
        CLIENTE TEXT NOT NULL,
        RUT_CLIENTE TEXT NOT NULL,
        FECHA TEXT NOT NULL,
        FORMA_PAGO TEXT NOT NULL,
        BRUTO REAL NOT NULL,
        IVA REAL NOT NULL,
        TOTAL REAL NOT NULL)
        """)

    c.execute("""CREATE TABLE IF NOT EXISTS DETALLES (
        NUMERO_FACTURA TEXT NOT NULL,
        PRODUCTO TEXT NOT NULL,
        CANTIDAD REAL NOT NULL,
        PRECIO REAL NOT NULL,
        SUBTOTAL REAL NOT NULL)       
        """)


if __name__ == '__main__':
    coneccion = sql_connection()
    sql_table(coneccion)
    valor_menu = input('''
            Opciones del menu
        1   Registrar nueva factura.
        2   Mostrar facturas en sistema.
        3   Exportar facturas del sistema.
        4   Salir del sistema.
            Opcion a escoger: ''')

    c = coneccion.cursor()

    while not int(valor_menu) in range(0, 5):  # LOOP QUE EXIGE QUE SEAN OPCIONES DESDE EL 1 AL 4
        valor_menu = input("Error. Opciones solo del 1 al 4: ")

    if valor_menu == "1":
        print("**********      BIENVENIDO AL MODULO DE REGISTRO DE FACTURAS       **********")
        numFactura = random.randrange(100000, 999999, 1)
        print("NUMERO DE FACTURA: ",numFactura)
        nombre = input("NOMBRE DEL CLIENTE: ").upper()
        rut = input("RUT DEL CLIENTE: ").upper()
        fecha = date.today()
        print("FECHA: ", fecha)
        pago = input('''
                Opciones de pago
            1   Efectivo.
            2   Tarjeta de Credito.
            3   Tarjeta de Debito.
            4   Transferencia.
                Opcion a escoger: ''')
        while not int(pago) in range(0, 5):  # LOOP QUE EXIGE QUE SEAN OPCIONES DESDE EL 1 AL 4
            pago = input("Error. Opciones solo del 1 al 4: ")
        if pago == "1": paga = "Efectivo"
        elif pago == "2": paga = "T.C."
        elif pago == "3": paga = "T.D."
        elif pago == "4": paga = "Transferencia"

        print("**********                 DETALLES DE FACTURACION                 **********")
        subtotal_tab = 0
        for x in range(1000):
            producto = input("INGRESE EL PRODUCTO: ")
            cantidad = input("CANTIDAD DEL PRODUCTO: ")
            precio_unidad = input("PRECIO UNITARIO: ")
            subtotal = float(cantidad) * float(precio_unidad)
            print("SUBTOTAL DE ESTE ITEM: ", subtotal)
            subtotal_tab += subtotal
            c.execute('INSERT INTO DETALLES VALUES (?,?,?,?,?)',(numFactura, producto, cantidad, precio_unidad, subtotal))
            coneccion.commit()
            control = input(">>>>>> DESEA INGRESAR OTRO ITEM >>>> 0(NO) >>>> 1(SI):")
            if control == "0":
                break

        iva = 0.19 * subtotal_tab
        total = subtotal_tab + iva
        c.execute('INSERT INTO FACTURAS VALUES (?,?,?,?,?,?,?,?)', (numFactura, nombre, rut, fecha, paga, subtotal_tab, iva, total))
        coneccion.commit()
        print(">>>>>>>>> FACTURA DETALLADA A CONTINUACION <<<<<<<<<<<")
        print("FACTURA Nº: ", numFactura)
        print("NOMBRE CLIENTE: ", nombre)
        print("FECHA EMITIDA: ", fecha)
        print("FORMA DE PAGO: ", paga)
        print("SUBTOTAL DE LA COMPRA: ", str(subtotal_tab))
        print("IVA GENERADO: ", str(iva))
        print("TOTAL: ", str(total))
        print("------------------------------------------------------")
        print(" PRODUCTO  CANTIDAD  VALOR UNIT.  SUBTOTAL")
        consulta_detalle = c.execute('SELECT PRODUCTO, CANTIDAD, PRECIO, SUBTOTAL FROM DETALLES WHERE NUMERO_FACTURA = ?', (numFactura,))
        for row in consulta_detalle:
            print(" ",row[0],"     ",row[1],"      ", row[2], "      ", row[3])
    if valor_menu == "2":
        print("**********    BIENVENIDO AL MODULO DE PRESENTACION DE FACTURAS     **********")
        fac_data = c.execute('SELECT * FROM FACTURAS')
        for x in fac_data:
            print("FACTURA Nº: ", x[0])
            print("NOMBRE CLIENTE: ", x[1])
            print("FECHA EMITIDA: ", x[2])
            print("FORMA DE PAGO: ", x[3])
            print("SUBTOTAL DE LA COMPRA: ", str(x[4]))
            print("IVA GENERADO: ", str(x[5]))
            print("TOTAL: ", str(x[6]))
            fac_detalle = c.execute('SELECT PRODUCTO, CANTIDAD, PRECIO, SUBTOTAL FROM DETALLES WHERE NUMERO_FACTURA = ?', (x[0],))
            print("------------------------------------------------------")
            print(" PRODUCTO  CANTIDAD  VALOR UNIT.  SUBTOTAL")
            for y in fac_detalle:
                print(" ", y[0], "     ", y[1], "      ", y[2], "      ", y[3])

    if valor_menu == "3":
        print("**********      MODULO DE EXPORTACION DE FACTURAS A EXCEL      **********")
        workbook = Workbook('facturacion.xlsx')
        worksheet = workbook.add_worksheet()
        conn = sqlite3.connect('FACTURACION.db')
        c = conn.cursor()
        mysel = c.execute("select * from facturas")
        for i, row in enumerate(mysel):
            for j, value in enumerate(row):
                worksheet.write(i, j, row[j])
        workbook.close()
        workbook = Workbook('facturacion_detalle.xlsx')
        worksheet = workbook.add_worksheet()
        c = conn.cursor()
        mysel = c.execute("select * from detalles")
        for i, row in enumerate(mysel):
            for j, value in enumerate(row):
                worksheet.write(i, j, row[j])
        workbook.close()
        print(">>>>>>>>>>>>>>ARCHIVOS GENERADOS CORRECTAMENTE<<<<<<<<<<<<<<<<<<")

    if valor_menu == "4":
        print("**********           MODULO DE RESUMEN DE FACTURAS             **********")
        sql1 = c.execute('SELECT COUNT(NUMERO) FROM FACTURAS')
        for z in sql1:
            print("CANTIDAD DE FACTURAS EMITIDAS: " ,z[0])
        sql2 = c.execute('SELECT SUM(BRUTO) FROM FACTURAS')
        for a in sql2:
            print("CANTIDAD EN BRUTO GENERADO: " ,a[0])
        sql3 = c.execute('SELECT SUM(IVA) FROM FACTURAS')
        for b in sql3:
            print("CANTIDAD DE IVA TOTAL GENERADO: " ,b[0])
        sql4 = c.execute('SELECT SUM(TOTAL) FROM FACTURAS')
        for c in sql4:
            print("CANTIDAD TOTAL EN VENTAS GENERADAS: ", c[0])
        print(">>>>>>>>>>>>>>GRACIAS POR USAR NUESTROS SERVICIOS<<<<<<<<<<<<<<<<<<")