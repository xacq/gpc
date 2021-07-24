#include <iostream.h>
#include <stdlib.h>

int main()
{
  int nValor_a_leer, nVeces=1, nMenores=0, nMayores=0;
  while (nVeces <= 10) {
      cout << "Ingrese el valor: ";
      cin >> nValor_a_leer;
      if  (nValor_a_leer > 100 )
           nMayores++;
      else
           nMenores++;
      nVeces++;
  }
  cout << "Número de mayores :" << nMayores << "Número de menores: " << nMenores;
  system("PAUSE");
  return 0;
}
