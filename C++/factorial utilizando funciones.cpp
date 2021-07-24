#include <iostream.h>
#include <stdlib.h>

#include <iostream.h>

int factorial(int n);		/* prototipo de la función */

int main()
{
     int n, nRes;
     cin >> n;			/* Ingreso del valor n */
     nRes = factorial(n);	/* Llamada a la función */
     cout << nRes;		/* Presentación del resultado */
     system("PAUSE");
     return 0;
}

int factorial (int x)
{
     int f = 1, i;
     for (i=1; i<=x; i++)
     {
          f = f*i;
     }
     return f;
}
