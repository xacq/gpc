#include <iostream.h>
#include <stdlib.h>

int main()
{
     int n;
     cin >> n;
     switch (n) 
     {
          case 1: cout << "lunes\n";
                       break;
          case 2: cout << "martes\n";
                       break;
          case 3: cout << "miércoles\n";
                       break;
          case 4: cout << "jueves\n";
                       break;
          case 5: cout << "viernes\n";
                       break;
          case 6: cout << "sábado\n";
                       break;
          case 7: cout << "domingo\n";
                       break;
          default: cout << "error ese día no existe\n";
      }
      system("PAUSE");
      return 0;
}
