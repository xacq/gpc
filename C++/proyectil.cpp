#include <iostream.h>
#include <stdlib.h>

class  proyectil
{
public:
     proyectil();
     // Constructor

     void ingresa_velocidad();
     void ingresa_tiempo();
     void presenta_resultado();
     void calcula_espacio();
private:
     int velocidad;
     int tiempo;
     int espacio;
};

int main()
{
     proyectil p1;
//   Declaración del objeto y llamada
//   implicita al constructor

     p1.ingresa_velocidad();
     p1.ingresa_tiempo();
     p1.calcula_espacio();
     p1.presenta_resultado();

     system("PAUSE");
     return 0;
}

void proyectil::ingresa_velocidad()
{
     cout << "Ingrese la velocidad del proyectil en (m/s): ";
     cin >> velocidad;
}

void proyectil::ingresa_tiempo()
{
     cout << "Ingrese el tiempo en segundos: ";
     cin >> tiempo;
}

void proyectil::calcula_espacio()
{
     espacio = velocidad * tiempo;
}

void proyectil::presenta_resultado()
{
     cout << "El espacio recorrido es: "<< espacio
          << " metros" <<endl;
}

proyectil::proyectil()
{
     velocidad=0;
     espacio=0;
     tiempo=0;
}
