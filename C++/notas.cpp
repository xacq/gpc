#include <iostream.h>
#include <stdlib.h>

class notas
{
public:
     notas();
     void registrar_eval_distan_1();
// Rutina que guarda la nota de la evaluación a distancia del primer bimestre

     void registrar_eval_presen_1();
// Rutina que guarda la nota de la evaluación presencial del primer bimestre

     void registrar_eval_distan_2();
// Rutina que guarda la nota de la evaluación a distancia del segundo bimestre

     void registrar_eval_presen_2();
// Rutina que guarda la nota de la evaluación presencial del segundo bimestre

     void mostrar_notas();
// Rutina que muestra las notas por pantalla

private:
     double eval_distan_1;  /* variable para guardar la nota a distancia 1 */
     double eval_presen_1;   /* variable para guardar la nota presencial 1  */
     double eval_distan_2;  /* variable para guardar la nota a distancia 2 */
     double eval_presen_2;   /* variable para guardar la nota presencial 2  */

};

int main()
{
      notas estudiante; /**variable tipo objeto notas*/
      estudiante.mostrar_notas();
      system("PAUSE");
      estudiante.registrar_eval_distan_1();
      estudiante.registrar_eval_presen_1();
      estudiante.registrar_eval_distan_2();
      estudiante.registrar_eval_presen_2();
      estudiante.mostrar_notas();

      system("PAUSE");
      return 0;
}

void notas::registrar_eval_distan_1()
{
      cout << "Ingrese la nota del trabajo a distancia 1: ";
      cin >> eval_distan_1;
}

void notas::registrar_eval_distan_2()
{
      cout << "Ingrese la nota del trabajo a distancia 2: ";
      cin >> eval_distan_2;
}

void notas::registrar_eval_presen_1()
{
      cout << "Ingrese la nota del trabajo presencial 1: ";
      cin >> eval_presen_1;
}
void notas::registrar_eval_presen_2()
{
      cout << "Ingrese la nota del trabajo presencial 2: ";
      cin >> eval_presen_2;
}

void notas::mostrar_notas()
{
  cout << "Nota  distancia 1: " << eval_distan_1 << endl;
  cout << "Nota presencial 1: " << eval_presen_1 << endl;
  cout << "Total primer bimeste " << eval_distan_1 + eval_presen_1 << endl;
  cout << "Nota  distancia 2: " << eval_distan_2 << endl;
  cout << "Nota presencial 3: " << eval_presen_2 << endl;
  cout << "Total primer bimeste " << eval_distan_2 + eval_presen_2 << endl;
}


notas::notas()
{
     eval_distan_1 = 0;
     eval_presen_1 = 0;
     eval_distan_2 = 0;
     eval_presen_2 = 0;
}
