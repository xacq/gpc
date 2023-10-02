#!/usr/bin/env python
"""Django's command-line utility for administrative tasks."""
import os
import sys
import sqlite3
import csv
import re


def main():
    """Run administrative tasks."""
    os.environ.setdefault('DJANGO_SETTINGS_MODULE', 'sistema.settings')
    try:
       from django.core.management import execute_from_command_line
    except ImportError as exc:
        raise ImportError(
            "Couldn't import Django. Are you sure it's installed and "
            "available on your PYTHONPATH environment variable? Did you "
            "forget to activate a virtual environment?"
        ) from exc
    execute_from_command_line(sys.argv)


if __name__ == '__main__':
    main()


## **SCRIPT PARA PASAR DE UN CSV A UNA TABLA DE SQLITE**
import csv
import sqlite3

#Nombre del archivo CSV y nombre de la tabla SQLite
csv_filename = 'data.csv'
sqlite_db_filename = 'libreria.db'
#Conectarse a la base de datos SQLite
conn = sqlite3.connect(sqlite_db_filename)
cursor = conn.cursor()
#Abrir el archivo CSV y leer los datos
with open(csv_filename, 'r') as csv_file:
    csv_reader = csv.reader(csv_file)
    next(csv_reader)  #Para omitir la fila de encabezados si la tienes en el archivo CSV
    for row in csv_reader:
        #Insertar los datos en la tabla SQLite
        cursor.execute('''
            INSERT INTO libreria_dato ( Direction , Year, Date, Weekday, Country, Commodity, Transport_Mode, Measure, Value, Cumulative)
            VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
        ''', (row[0], row[1], row[2], row[3], row[4], row[5], row[6], row[7], row[8], row[9] ))  # Ajusta los índices según la estructura de tu CSV
#Guardar los cambios y cerrar la conexión a la base de datos
conn.commit()
conn.close()