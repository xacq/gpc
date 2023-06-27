import sqlite3


def sql_connection():
    try:
        conexion=sqlite3.connect('Cuenta_Corriente.db')
        return conexion
    except sqlite3.Error as er:
        print('SQLite error: %s' % (' '.join(er.args)))


def sql_table(con):
    try:
        cursorObj=con.cursor()
        query="""CREATE TABLE CUENTACORRIENTE (
                RUT TEXT PRIMARY KEY, 
                NOMBRE TEXT NOT NULL, 
                APELLIDO TEXT NOT NULL,
                NUMERO_CUENTA NUMERIC NOT NULL, 
                SALDO NUMERIC)"""
        cursorObj.execute(query)
        query="""CREATE TABLE MOVIMIENTOS ( 
                ID INTEGER PRIMARY KEY AUTOINCREMENT, 
                RUT_USUARIO TEXT, 
                SALDO NUMERIC,
                NUMERO_CUENTA NUMERIC)"""
        cursorObj.execute(query)
        con.commit()
    except sqlite3.Error as er:
        print('SQLite error: %s' % (' '.join(er.args)))


class CuentaCorriente:
    rut=""
    nombre=""
    apellido=""
    NumeroCuenta=""
    saldo=0

    def __init__(self,con,rut,nombre,apellido,NumeroCuenta,saldo):
        self.rut=rut
        self.nombre=nombre
        self.apellido=apellido
        self.NumeroCuenta=NumeroCuenta
        self.saldo=saldo
        cursorObj=con.cursor()
        query=f"INSERT INTO CUENTACORRIENTE VALUES('{rut}','{nombre}','{apellido}',{NumeroCuenta},{saldo})"
        cursorObj.execute(query)
        con.commit()

    def abonar(self,con,abono):
        if abono > 0:
            self.saldo=self.saldo + abono
            return print("abono realizado con exito, nuevo saldo:",self.saldo)
        else:
            return print("solo se permiten valores positivos")

    def cargar(self,con,retiro):
        if retiro > self.saldo:
            return print("el retiro es mayor al saldo actual")
        elif retiro > 0:
            self.saldo=self.saldo - retiro
            return print("retiro realizado con exito,el nuevo saldo es:",self.saldo)
        else:
            return print("solo se permiten valores positivos")

    def ingresarMovimiento(self,con,Movimiento):
        print("Ingresar RUT",Movimiento,"del usuario",self.nombre,self.apellido,self.NumeroCuenta)
        cursorObj=con.cursor()
        query=f"INSERT INTO MOVIMIENTOS (RUT_USUARIO,NUMERO_CUENTA) VALUES('{self.rut}',{Movimiento})"
        cursorObj.execute(query)
        con.commit()


con=sql_connection()
sql_table(con)
CuentaCorriente1=CuentaCorriente(con,'12345-2','Bastian','Mena',2500,1111)
CuentaCorriente2=CuentaCorriente(con,'12345-3','Pedro','Toro',1500,2222)

CuentaCorriente1.ingresarMovimiento(con,11111)
CuentaCorriente2.ingresarMovimiento(con,22222)


