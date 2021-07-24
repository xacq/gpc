#include <iostream.h>
#include <fstream.h>
#include <stdlib.h>

int main() {

      int a, b;

      /*Declaración de flujos*/
      ifstream a_leer;
      ofstream a_escribir;

      /*Conexión del flujo al archivo valores.txt*/
      a_leer.open("valores.txt");
      if (a_leer.fail()) {
           cout <<  "no se pudo abrir el archivo";
           exit(1);
      }

      /*Conexión del flujo al archivo resultado.txt*/
      a_escribir.open("resultado.txt");
      if (a_escribir.fail()) {
           cout <<  "no se pudo abrir el archivo";
           exit(1);
      }


      /*leer los valores desde el archivo*/
      a_leer >> a >> b;

      /*Escribir la suma en el otro archivo*/
      a_escribir << a+b ;

      /*Cerrar el archivo */
      a_leer.close();
      a_escribir.close();

      system("PAUSE");
      return 0;
}

