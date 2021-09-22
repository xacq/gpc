from PyQt5 import QtWidgets, uic
from PyQt5.QtWidgets import *
import sys
import coneccion


def validacion():
    if ventana.lineEdit_2.text()=="" or ventana.lineEdit_3.text()=="":
        alerta = QMessageBox()
        alerta.setText('Debes llenar los campos...!')
        alerta.setIcon(QMessageBox.Information)
        alerta.exec()
        return True

# Funcion para Agregar registros en la base de datos
def Agregar():
    if validacion():
        return False
    print("Haz aplastado el boton agregar.")  # Imprime en consola
    nombre = ventana.lineEdit_2.text()  # Asignamos el valor a una variable
    correo = ventana.lineEdit_3.text()  # Asignamos el valor a una variable
    contactosObj = coneccion.contactos()  # Generamos un objeto de la coneccion a la DB
    contactos = contactosObj.crearContactos((nombre, correo))  # Instanciamos contactos
    Consultar()


# Funcion para Editar registros en la base de datos
def Editar():
    if validacion():
        return False
    print("Haz aplastado el boton editar.")
    id = ventana.lineEdit.text()
    nombre = ventana.lineEdit_2.text()  # Asignamos el valor a una variable
    correo = ventana.lineEdit_3.text()  # Asignamos el valor a una variable
    contactosObj = coneccion.contactos()  # Generamos un objeto de la coneccion a la DB
    contactos = contactosObj.modificarContactos((nombre, correo, id))  # Instanciamos contactos
    Consultar()


# Funcion para Eliminar registros en la base de datos
def Eliminar():
    print("Haz aplastado el boton eliminar.")
    id = ventana.lineEdit.text()
    print(id)
    contactosObj = coneccion.contactos()
    contactos = contactosObj.borrarContactos(id)
    Consultar()

# Funcion para Cancelar la actividad en ejecucion
def Cancelar():
    print("Haz aplastado el boton cancelar.")
    Consultar()

# Funcion para Consultar registros en la base de datos usando el GUI
def Consultar():
    ventana.tableWidget.setRowCount(0)
    indiceControl = 0

    contactosObj = coneccion.contactos()
    contactos = contactosObj.leerContactos()
    for contacto in contactos:
        ventana.tableWidget.setRowCount(indiceControl + 1)
        ventana.tableWidget.setItem(indiceControl, 0, QTableWidgetItem(str(contacto[0])))  # Muestra valor del indice
        ventana.tableWidget.setItem(indiceControl, 1, QTableWidgetItem(str(contacto[1])))  # Muestra valor del Nombre
        ventana.tableWidget.setItem(indiceControl, 2, QTableWidgetItem(str(contacto[2])))  # Muestra valor del correo
        indiceControl += 1

    ventana.pushButton.setEnabled(True)
    ventana.pushButton_2.setEnabled(False)
    ventana.pushButton_3.setEnabled(False)
    ventana.pushButton_4.setEnabled(False)

    ventana.lineEdit.setText("")
    ventana.lineEdit_2.setText("")
    ventana.lineEdit_3.setText("")


def Seleccionar():
    id = ventana.tableWidget.selectedIndexes()[0].data()
    nombre = ventana.tableWidget.selectedIndexes()[1].data()
    correo = ventana.tableWidget.selectedIndexes()[2].data()
    print(id, nombre, correo)
    ventana.lineEdit.setText(id)
    ventana.lineEdit_2.setText(nombre)
    ventana.lineEdit_3.setText(correo)

    ventana.pushButton.setEnabled(False)
    ventana.pushButton_2.setEnabled(True)
    ventana.pushButton_3.setEnabled(True)
    ventana.pushButton_4.setEnabled(True)

# Generamos un objeto con propiedades de QtWidgets
aplicacion = QtWidgets.QApplication([])
# Cargamos en ventana el objeto ui
ventana = uic.loadUi("CRUD_ventana.ui")
# Mostramos la ventana
ventana.show()

Consultar()  # Se ejecuta la funcoin Consultar en el GUI
ventana.tableWidget.setHorizontalHeaderLabels(['ID', 'Nombre', 'Correo'])  # Muestra las cabeceras en el Table
ventana.tableWidget.setEditTriggers(QTableWidget.NoEditTriggers)
ventana.tableWidget.setSelectionBehavior(QTableWidget.SelectRows)

ventana.tableWidget.clicked.connect(Seleccionar)

ventana.pushButton.clicked.connect(Agregar)  # Asignamos una funcion ante el evento sobre el boton
ventana.pushButton_2.clicked.connect(Editar)  # Asignamos una funcion ante el evento sobre el boton
ventana.pushButton_3.clicked.connect(Eliminar)  # Asignamos una funcion ante el evento sobre el boton
ventana.pushButton_4.clicked.connect(Cancelar)  # Asignamos una funcion ante el evento sobre el boton

# Indicamos el exit del system
sys.exit(aplicacion.exec())
