#include <iostream.h>
#include <stdlib.h>

class vehiculo
{
public:
     vehiculo();
     //Constructor
     void ingresar_datos();
     void presentar_datos();
protected:
     int pasajeros;
     int modelo;
     int color;
     int precio;
};


class automovil : public vehiculo
// Hereda todo de la clase vehiculo
{
public:
private:
};


class camioneta : public vehiculo
// Hereda de la clase vehiculo y se le agrega
// la variable carga y la redefinición de
// dos de sus funciones
{
public:
     camioneta();
     void ingresar_datos();
     void presentar_datos();
private:
     int carga;
};



int main()
{
     //Definición de las variables objeto
     automovil carro1;
     camioneta carro2;

     // Ingreso de datos del auto y la camioneta
     carro1.ingresar_datos();
     carro2.ingresar_datos();

     // Salida de datos del auto y la camioneta
     carro1.presentar_datos();
     carro2.presentar_datos();

     system("PAUSE");
     return 0;
}


vehiculo::vehiculo()
{
     pasajeros = 0;
     modelo    = 0;
     color     = 0;
     precio    = 0;
}

camioneta::camioneta()
{
     pasajeros = 0;
     modelo    = 0;
     color     = 0;
     precio    = 0;
     carga     = 0;
}

void vehiculo::ingresar_datos()
{
     cout << "Ingrese la información del vehiculo" << endl;
     cin >> pasajeros;
     cin >> modelo;
     cin >> color;
     cin >> precio;
}

void camioneta::ingresar_datos()
{
     cout << "Ingrese la información de la camioneta" << endl;
     cin >> pasajeros;
     cin >> modelo;
     cin >> color;
     cin >> precio;
     cin >> carga;
}

void vehiculo::presentar_datos()
{
     cout << "La información del vehiculo es :" << endl;
     cout << "Pasajeros: " << pasajeros << endl;
     cout << "Modelo   : " << modelo << endl;
     cout << "Color    : " << color << endl;
     cout << "Precio   : " << precio << endl;
}

void camioneta::presentar_datos()
{
     cout << "La información de la camioneta es :" << endl;
     cout << "Pasajeros: " << pasajeros << endl;
     cout << "Modelo   : " << modelo << endl;
     cout << "Color    : " << color << endl;
     cout << "Precio   : " << precio << endl;
     cout << "Carga    : " << carga << endl;
}




