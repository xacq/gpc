//Problema1.cpp

#include <iostream>
using namespace std;
int main(void) {

	int control = 0;
	int consulta = 0;
	int segunda_dosis = 0;
	int tercera_dosis = 0;

    do{
    	do {
    		cout<<"Ingrese el mes en el que recibio su segunda dosis para COVID19: 1 para Enero ... 12 para Diciembre:";
    		cin>> segunda_dosis;
    		if (segunda_dosis>0 && segunda_dosis<13) {
    			control = 1;
    		} else {
    			cout<<"EL NUMERO DEL MES ESTA EQUIVOCADO - POR FAVOR INGRESE UN NUMERO DEL 1 AL 12 PARA REPRESENTAR EL MES.\n";
    			control=0;
    		}
    	} while (control==0);
    
    	tercera_dosis = segunda_dosis+6;//aumentamos 6 meses es
    	if (tercera_dosis>12) {
    		tercera_dosis=tercera_dosis-12;
    		cout<< "Tiene que acercarse a recibir su tercera dosis para COVID 19 el 2022 en el mes numero: "<<tercera_dosis;
    	} else {
    		cout<< "Tiene que acercarse a recibir su tercera dosis para COVID 19 este año en el mes numero: "<<tercera_dosis;
    	}

        cout<< "\n Desea realizar otra consulta SI=1 NO=0: ";
        cin>>consulta;
    }while (consulta == 1);
return 1;
}