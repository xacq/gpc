#include <iostream.h>
#include <stdlib.h>

class cuentabancaria{
public:
   cuentabancaria();
   void deposito( );
   void retiro ( );
   int operator+(cuentabancaria& b);
   void operator= (cuentabancaria& b);
   bool operator==(cuentabancaria& b);
private:
   int saldo;
};



int main(){

   // Declaración de las variables objeto
   cuentabancaria cuenta1, cuenta2;

   int total=0;

   cuenta1.deposito();

   cuenta2.deposito();

   total = cuenta1 + cuenta2;

   cout << total<< endl;

   system("PAUSE");
   return 0;
}


// Implementación del constructor
cuentabancaria::cuentabancaria(){
   saldo = 0;
}

// Implementación de la función operator=
void cuentabancaria::operator=(cuentabancaria& b){
   saldo = b.saldo;
}

// Implementación de la función operator+
int cuentabancaria::operator+(cuentabancaria& b){
   int sal_total;
   sal_total = saldo + b.saldo;
   return sal_total;
}

// Implementación de la función para comparar
bool cuentabancaria::operator==(cuentabancaria& b){
   return (saldo == b.saldo);
}

// Implementación de la función para depositos
void cuentabancaria::deposito (){
   int x;
   cout << "Ingrese el valor del deposito: ";
   cin >> x;
   saldo = saldo + x;
}


// Implementación de la función para retiros
void cuentabancaria::retiro (){
   int x;
   cout << "Ingrese el valor del retiro: ";
   cin >> x;
   saldo = saldo - x;
}

