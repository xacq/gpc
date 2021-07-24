#include <iostream.h>
#include <stdlib.h>

int main()
{
   int val;
   cout << "Ingrese el valor: ";
   cin >> val;
   if ((val % 2) == 0)		/*Si el residuo de val para 2 es igual a cero */
       cout << "ES PAR";
   system("PAUSE");
   return 0;
}
