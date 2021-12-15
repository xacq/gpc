//Problema4.cpp

#include <iostream>
using namespace std;
int main(void) {
	int control = 0;
	char turno = 0;
	int seccion = 0;
	int sueldo = 0;
	
	cout<<"VERIFIQUE SI PUEDE SER PROMOVIDO A UNA NUEVA SECCION DE LA EMPRESA"; 
	
	do{
		cout<<"Ingrese el turno de trabajo que se le ha asignado actualmente (M-Mañana/T-Tarde/N-Noche): ";
	    cin>> turno;
	    if (turno == 'M' || turno == 'T' || turno == 'N'){
            control=1;
        }
        else{
            control = 0;
            cout<<"NO EXISTE ESTE TURNO. POR FAVOR VERIFIQUE M-Mañana/T-Tarde/N-Noche.\n";
        }
	}while(control == 0);
	
	do{
	    cout<<"Ingrese la seccion a la que pertenece (1 / 2 / 3 / 4): ";
	    cin>>seccion;
	    if (seccion < 1 || seccion > 4){
	        cout<<"SECCION MAL INGRESADA...  Verifique la seccion 1 / 2 / 3 / 4.\n";
	        control=0;
	    }
	    else {
	        control = 1;
	    }
	}while(control == 0);
	
	do{
	    cout<<"Ingrese su sueldo (400 - 10000): ";
	    cin>>sueldo;
	    if (sueldo < 400 || sueldo > 10000){
	        cout<<"SUELDO MAL INGRESADO... Entre 400 a 10000 dolares.\n";
	        control=0;
	    }
	    else {
	        control = 1;
	    }
	}while(control == 0);

	if (turno == 'M' && sueldo <=2000 && seccion ==1){
	    cout<<"FELICITACIONES...! Ha sido promovido a un nuevo puesto de trabajo.\n";
	}
	else{
	    cout<< "Lo Sentimos mucho...! No ha podido superar los requisitos para este nuevo puesto de trabajo.\n";
	}
	
return 1;
}