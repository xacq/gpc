//Problema2.cpp

#include <iostream>
using namespace std;
int main(void) {
	int cantidad_maxima = 0;
	int numero_bacterias = 0;
	int dias = 1;//EMPIEZA EN UNO YA QUE AL FINAL DEL PRIMER DIA SE HABRIAN DUPLICADO

	cout<<"Ingrese la cantidad inicial de bacterias a controlar: ";
	cin>> numero_bacterias;
	
	do{
	    cout<<"\n Ingrese el valor maximo de bacterias permitido: ";
        cin>>cantidad_maxima;
        if (cantidad_maxima<numero_bacterias){
            cout<<"ERROR EN EL INGRESO DE MAXIMO BACTERIAS - INGRESE UN NUMERO MAYOR AL NUMERO DE BACTERIAS INICIAL.\n";
        }
	}while(cantidad_maxima<numero_bacterias);
	
    do{
        numero_bacterias=numero_bacterias*2;
        if (numero_bacterias>cantidad_maxima){
            cout<<"Las bacterias superaron el valor permitido en: " << dias <<" dia/s.\n";
        }
        else{
            dias=dias+1;
        }
    }while(numero_bacterias<cantidad_maxima);
return 1;
}