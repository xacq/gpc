#include <iostream.h>
#include <stdlib.h>

void pSuma(int x, int y, int* z); /*Prototipo de función */

int main() 
{
   int a,b,c;
     cin >> a;
     cin >> b;
     pSuma(a,b,&c);  /* Llamada con parámetros por valor y por referencia */
     cout << c;
     system("PAUSE");
     return 0;
}
void pSuma (int x, int y, int* c)  /* recepción   en parámetros formales */
{
     *c = x + y;
}


