#include <iostream.h>
#include <stdlib.h>

struct estudiante {
       char nombre [20];
       int edad;
       estudiante *enlace;
};

estudiante *cabeza=NULL;
estudiante *cola=NULL;

void insertar(char *nombre, int edad);
void presentarlista();

int main()
{
    char continua = 's';
    char nombre [20];
    int edad;
    while (continua == 's'){
        cout<< "Ingrese el nombre y la edad del estudiante"<< endl;
        cin >> nombre >> edad;
        insertar(nombre, edad);
        cout<< "desea ingresar otro ? s/n :";
        cin >> continua;
    }

    presentarlista();
    system("PAUSE");
    return 0;
}

void insertar(char *nombre, int edad) {
	if (cabeza == NULL) {		// Si no hay ningún nodo en la lista
		cabeza = new estudiante;
		cola = cabeza;
	}
	else {				// Si ya hay nodos en la lista
		cola->enlace = new estudiante;
		cola = cola->enlace;
	}
		strcpy (cola->nombre, nombre);
		cola->edad = edad;
		cola->enlace = NULL;
}

// Rutina que presenta la lista ingresada
void presentarlista(){
     estudiante *recorrer=cabeza;  // variable auxiliar
     while (recorrer != NULL) { // si aun hay elementos en la lista
         // presentar el nombre y la edad
         cout<< "Nombre: "<< recorrer->nombre << " edad: "<< recorrer->edad << endl;

         // Avanzar al siguiente nodo de la lista
         recorrer = recorrer->enlace;
     }
}
