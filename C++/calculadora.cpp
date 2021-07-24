#include <iostream.h>
#include <stdlib.h>


int main()
{
     int n=0, a,b;
     double nNum, nDiv;
     while (n!=5)
     {
          cout << "Elija la opcion\n ";
          cout << "<1> suma\n";
          cout << "<2> resta\n";
          cout << "<3> multiplicacion\n";
          cout << "<4> division\n";
          cout << "<5> terminar\n";
          cin >> n;
          /******** hasta aquí se lee la opción **********/
          switch(n) 
          {
             case 1:	cin >> a >> b;
		        cout << a+b;
		        break;
		     case 2:	cin >> a >> b;
				cout << a-b;
				break;
		     case 3:	cin >> a >> b;
				cout << a*b;
				break;
		     case 4:	cin >> nNum >> nDiv;
				cout << nNum/nDiv;
				break;
		     default:	cout << "Operacion no existe\n";
          }
     }
     system("PAUSE");
     return 0;
}
