#include <iostream.h>
#include <fstream.h>
#include <stdlib.h>

int main() {
     /*Declaracion de la variable*/
     char a;

     /*Declaracion del flujo*/
     ifstream f;
     f.open("valores.txt");
     if (f.fail()) {
          cout <<  "no se pudo abrir el archivo";
          exit(1);
     }


     /*Leer mientras no sea fin de archivo*/
     while ( ! f.eof() ) {
          f.get(a);
          cout.put(a);
     }
     system("PAUSE");
     return 0;
}

