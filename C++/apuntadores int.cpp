#include <iostream.h>
#include <stdlib.h>

int main()
{
      int a=10;
      int *p;
      p = &a;
      *p=11;
      a++;
      cout<< "resultado "<< *p;
      system("PAUSE");
      return 0;
}
