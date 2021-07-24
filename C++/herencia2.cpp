En el siguiente ejemplo, la clase base es un vehiculo, que tiene dos funciones miembro que son ingresar_datos y presentar_datos
Tiene dos clases derivadas que son automovil y camion, estas utilizan las mismas funciones miembro por lo tanto las redefinen y cuentan con variables miembro adicionales.

#include <iostream.h>
#include <stdlib.h>

//Clase base vehiculo
class vehiculo {
   public:
         void ingresar_datos();
         void presentar_datos();
   private:
         char marca[10];
         char color[10];
         int ano;
};


//Clase derivada automovil
class automovil : public vehiculo {
   public:
         void ingresar_datos();
         void presentar_datos();
   private:
         int velocidad;
         int pasajeros;
};


//Clase derivada automovil
class camion : public vehiculo {
   public:
         void ingresar_datos();
         void presentar_datos();
   private:
         int carga;
};

int main()
{

      // declaración de variables objeto
      automovil  objeto1;
      camion     objeto2;

      //Ingreso de datos en los objetos
      objeto1.ingresar_datos();
      objeto2.ingresar_datos();

      //Presentación de datos de los objetos
      objeto1.presentar_datos();
      objeto2.presentar_datos();

      system("PAUSE");
      return 0;
}

void vehiculo::ingresar_datos() {
      cout << "Ingrese la marca ";
      cin >> marca;
      cout << "Ingrese el color ";
      cin >> color;
      cout << "Ingrese el año" ;
      cin >> ano;
}

void vehiculo::presentar_datos() {
      cout << "Marca " ;
      cout << marca << endl;
      cout << "Color " ;
      cout << color << endl;
      cout << "Año " ;
      cout << ano << endl;
}

void automovil::ingresar_datos() {
      vehiculo::ingresar_datos();
      cout << "Velocidad máxima ";
      cin >> velocidad;
      cout << "Cantidad de pasajeros " << endl;
      cin >> pasajeros ;
}

void automovil::presentar_datos() {
      vehiculo::presentar_datos();
      cout << "Velocidad máxima ";
      cout << velocidad << endl;
      cout << "Cantidad de pasajeros ";
      cout << pasajeros << endl;
}

void camion::ingresar_datos() {
      vehiculo::ingresar_datos();
      cout << "Carga máxima ";
      cin >> carga;
}

void camion::presentar_datos() {
      vehiculo::presentar_datos();
      cout << "Carga máxima ";
      cout << carga << endl;
}

