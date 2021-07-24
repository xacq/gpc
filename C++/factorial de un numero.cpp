#include <iostream.h>
#include <stdlib.h>

int main()
{
   int n,x,f=1;				          /*f Inicia su valor en 1 */
   cout << "Ingrese el valor : ";
   cin >> n;				          /* Se ingresa el valor */
   for (x=1; x<=n; x++) 		      /* Ciclo desde 1 hasta n */
      f = f * x;				      /* Operación para obtener el factorial */
   system("PAUSE");
   return 0;
}
