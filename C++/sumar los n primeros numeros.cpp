#include <iostream.h>
#include <stdlib.h>

int main()
{
     int s=0, nVal, nVeces;			         /* se inicia con 0 */
     cin >> nVeces;		                     /* Se ingresa el número de términos a sumar */
     for (nVal=1; nVal <=nVeces; nVal++)	 /* nVal inicia en 1 y termina en nVeces */
          s = s + nVal;				         /* a s se le suma nVal */
     cout << s;					             /* se presenta el resultado en s */
     system("PAUSE");
     return 0;
}
