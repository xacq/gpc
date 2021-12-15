//Problema3.cpp

#include <iostream>
using namespace std;
int main(void) {
	int control = 0;
	int circulacion = 0;
	int fabricacion = 0;
	int revision = 0;
	
	cout<<"BIENVENIDO AL SISTEMA DE CONTROL VEHICULAR ATM ECUADOR"; 
	
	do{
		cout<<"Ingrese el año de fabricacion del automotor: (ejemplo 2010)";
	    cin>> fabricacion;
	
        if (fabricacion<1000 || fabricacion > 2022){
            cout<<"--- AÑO DE FACBRICACION MAL INGRESADO.  INGRESE UN NUMERO DE 4 DIGITOS ---.\n";
            control=0;
        }
        else{
            control = 1;
        }
	}while(control == 0);
	
	do{
	    cout<<"Ingrese si ha pasado la Revision Vehicular (SI=1 NO = 0): ";
	    cin>>revision;
	    
	    if (revision < 0 || revision >1){
	        cout<<"RESPUESTA MAL INGRESADA... (SI=1 NO = 0). \n";
	        control=0;
	    }
	    else {
	        control = 1;
	    }
	    
	}while(control == 0);
	
	if (revision == 1 && fabricacion >1995){
	    cout<<"Felicitaciones...! Ha superado la revision vehicular.  Reciba su calcomania.\n";
	    circulacion = 5;
	}
	else{
	    cout<< "Lo Sentimos mucho...! No ha superado la revision vehicular de la ATM.";
	    if (revision ==0 && fabricacion < 1995){
	        circulacion = 3;
	    }
	    else{
	        circulacion = 4;
	    }
	}
	
	cout<<"Usted puede circular " << circulacion <<" dias";
	
return 1;
}