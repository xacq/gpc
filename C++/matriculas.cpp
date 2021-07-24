#include <iostream.h>
#include <stdlib.h>

class estudiante
{
public:
     estudiante();
     void ingresar_datos();
     void modificar_datos();
     void presentar_datos();
private:
     int cedula;
     char nombre[15];
     char apellido[15];
     char carrera[15];
     char centro[15];
};

int main()
{
     estudiante est;
     int opc=0;
     while (opc != 4)
     {
        cout << "<<1>> Ingresar Datos" << endl;
        cout << "<<2>> Modificar Datos" << endl;
        cout << "<<3>> Presentar Estudiante"<< endl;
        cout << "<<4>> Salir";
        cin >> opc;
        switch (opc)
        {
           case 1:est.ingresar_datos();break;
           case 2:est.modificar_datos(); break;
           case 3:est.presentar_datos(); break;
        }
     }
     system("PAUSE");
     return 0;
}


estudiante::estudiante()
{
     cedula=0;
     strcpy(nombre,"");
     strcpy(apellido,"");
     strcpy(carrera,"");
     strcpy(centro,"");
}

void estudiante::ingresar_datos()
{
     cout << "**Ingrese la información del estudiante***\n";
     cout << "Ingrese la cédula: ";
     cin >> cedula;
     cout << "Ingrese  el  nombre: ";
     cin >> nombre;
     cout << "Ingrese el apellido: ";
     cin >> apellido;
     cout << "Ingrese la  carrera: ";
     cin >> carrera;
     cout << "Ingrese  el  centro: ";
     cin >> centro;
}

void estudiante::modificar_datos()
{
     cout << "**La información actual es :\n";
     presentar_datos();
     cout << "**Ingrese la nueva información del estudiante***\n";
     cout << "Ingrese la cédula: ";
     cin >> cedula;
     cout << "Ingrese  el  nombre: ";
     cin >> nombre;
     cout << "Ingrese el apellido: ";
     cin >> apellido;
     cout << "Ingrese la  carrera: ";
     cin >> carrera;
     cout << "Ingrese  el  centro: ";
     cin >> centro;
}

void estudiante::presentar_datos()
{
     cout << "Presentación de la información\n";
     cout << "CEDULA   : " << cedula << endl;
     cout << "NOMBRE   : " << nombre << endl;
     cout << "APELLIDO : " << apellido << endl;
     cout << "CARRERA  : " << carrera << endl;
     cout << "CENTRO   : " << centro << endl;
}
