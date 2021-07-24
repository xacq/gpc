#include <iostream.h>
#include <stdlib.h>

int main()
{
   int base, exponente, p=1;
   cout << "Ingrese la base : ";
   cin >> base;
   cout << "Ingrese el exponente: ";
   cin >> exponente;
   for (int x=1; x<=exponente; x++)
      p = p * base;
   cout << "Resultado : " << p;
   system("PAUSE");
   return 0;
}
