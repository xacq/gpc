#include <iostream.h>
#include <stdlib.h>

int main()
{
      char a='k';
      char *p;    // puntero a un char
      p = &a;     // p toma la direccion de a
      *p=*p+1;    // a se incrementa
      cout<< "resultado "<< *p << endl;
      system("PAUSE");
      return 0;
}
