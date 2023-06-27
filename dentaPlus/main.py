import sqlite3


def sql_connection():
    conn = sqlite3.connect('DENTAPLUS.db')
    return conn

def sql_table (conn):

    c = conn.cursor()

    c.execute ("""CREATE TABLE IF NOT EXISTS PACIENTES (
        RUT_PAC TEXT PRIMARY KEY NOT NULL,
        NOMBRE TEXT NOT NULL,
        APELLIDO TEXT NOT NULL,
        EDAD INTEGER NOT NULL)
        """)

    c.execute("""CREATE TABLE IF NOT EXISTS DENTISTAS (
        RUT_DEN TEXT PRIMARY KEY NOT NULL,
        NOMBRE TEXT NOT NULL,
        APELLIDO TEXT NOT NULL,
        FECHA_INGRESO TEXT NOT NULL)       
        """)

    c.execute("""CREATE TABLE IF NOT EXISTS ATENCIONES (
        ID INTEGER PRIMARY KEY AUTOINCREMENT,
        RUT_PAC TEXT NOT NULL,
        RUT_DEN TEXT NOT NULL,
        DESCRIPCION TEXT NOT NULL,
        FECHA_ATENCION TEXT NOT NULL)
        """)

    c.execute("INSERT INTO PACIENTES VALUES ('11111111-1','Soledad','Ferrada','65')")
    c.execute("INSERT INTO PACIENTES VALUES ('22222222-2','Margarita','Gonzalez','34')")
    c.execute("INSERT INTO PACIENTES VALUES ('33333333-3','Claudio','Rifo','46')")
    c.execute("INSERT INTO PACIENTES VALUES ('44444444-4','Maria','Perez','39')")
    c.execute("INSERT INTO PACIENTES VALUES ('55555555-5','Cristian','Lopez','18')")
    c.execute("INSERT INTO PACIENTES VALUES ('66666666-6','Gladys','Olivares','45')")
    c.execute("INSERT INTO PACIENTES VALUES ('77777777-7','Natalia','Fritz','46')")

    c.execute("INSERT INTO DENTISTAS VALUES ('88888888-8','Javier','Miranda','2018-05-01')")
    c.execute("INSERT INTO DENTISTAS VALUES ('99999999-9','Patricia','Manterola','2019-01-22')")
    c.execute("INSERT INTO DENTISTAS VALUES ('12121212-1','Paula','Gallegos','2017-09-01')")
    c.execute("INSERT INTO DENTISTAS VALUES ('45454545-4','Pablo','Pereira','2019-04-01')")

    c.execute("INSERT INTO ATENCIONES VALUES ('1','11111111-1','88888888-8','Extracción pieza 20','2019-10-01')")
    c.execute("INSERT INTO ATENCIONES VALUES ('2','22222222-2','88888888-8','Limpieza completa','2019-10-04')")
    c.execute("INSERT INTO ATENCIONES VALUES ('3','33333333-3','99999999-9','Tapadura simple pieza 5','2019-10-05')")
    c.execute("INSERT INTO ATENCIONES VALUES ('4','44444444-4','99999999-9','Tapadura simple pieza 30','2019-10-06')")
    c.execute("INSERT INTO ATENCIONES VALUES ('5','55555555-5','12121212-1','Extracción pieza 20','2019-10-07')")
    c.execute("INSERT INTO ATENCIONES VALUES ('6','66666666-6','45454545-4','Tapadura compuesta pieza 30','2019-10-10')")
    c.execute("INSERT INTO ATENCIONES VALUES ('7','77777777-7','45454545-4','Tapadura simple pieza 30','2019-10-15')")
    conn.commit()


def sql_fetch(conn):
    try:
        c = conn.cursor()

        print("\n******* LISTA DE PACIENTES CON EDAD MAYOR A 30 AÑOS *******")
        consult_a = c.execute("SELECT * FROM PACIENTES WHERE EDAD > 30 ORDER BY NOMBRE ASC")
        for row in consult_a:
            print(row)
        print("\n******* LISTA DE PACIENTES ATENDIDOS POR PATRICIA MANTEROLA *******")
        consult_b = c.execute("SELECT * FROM ATENCIONES WHERE RUT_DEN = '99999999-9'")
        for row in consult_b:
            print(row)

        print("\n******* ACTUALIZACION DE DATOS DE DENTISTAS *******")
        consult_c = c.execute("UPDATE PACIENTES SET APELLIDO='Riffo' WHERE RUT_PAC = '33333333-3'")
        conn.commit()
        print("ACTUALIZACION REALIZADA CON EXITO")
        consult_c = c.execute("SELECT * FROM PACIENTES WHERE RUT_PAC = '33333333-3'")
        for row in consult_c:
            print(row)

        print("\n******* ELIMINACION DE DATOS DE DENTISTAS *******")
        consult_d = c.execute("DELETE FROM ATENCIONES WHERE FECHA_ATENCION < '2019-10-04'")
        conn.commit()
        print("CONSULTA REALIZADA CON EXITO")
        print("\n******* LISTA DE ATENCIONES *******")
        consult_b = c.execute("SELECT * FROM ATENCIONES")
        for row in consult_b:
            print(row)

    except sqlite3.Error as error:
        print("ERROR EN LAS CONSULTAS: ", error)



if __name__ == '__main__':
    coneccion = sql_connection()
    sql_table(coneccion)
    sql_fetch(coneccion)


