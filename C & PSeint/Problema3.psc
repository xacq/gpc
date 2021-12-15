Algoritmo Problema3
	Definir control Como Entero
	Definir circulacion Como Entero
	Definir fabricacion Como Entero
	Definir revision Como Entero
	Escribir 'BIENVENIDO AL SISTEMA DE CONTROL VEHICULAR ATM ECUADOR'
	Repetir
		Escribir 'Ingrese el año de fabricacion del automotor: (ejemplo 2010)'
		Leer fabricacion
		Si (fabricacion>1000) Y (fabricacion<2022) Entonces
			control <- 1
		SiNo
			Escribir '--- AÑO DE FACBRICACION MAL INGRESADO.  INGRESE UN NUMERO DE 4 DIGITOS ---'
			control <- 0
		FinSi
	Hasta Que control=1
	Repetir
		Escribir 'Ingrese si ha pasado la Revision Vehicular (SI=1 NO = 0): '
		Leer revision
		Si (revision<>0) Y (revision<>1) Entonces
			Escribir 'RESPUESTA MAL INGRESADA...'
			control <- 0
		SiNo
			control <- 1
		FinSi
	Hasta Que control=1
	Si (revision=1) Y (fabricacion>1995) Entonces
		Escribir 'Felicitaciones...! Ha superado la revision vehicular.  Reciba su calcomania.'
		circulacion <- 5
	SiNo
		Escribir 'Lo Sentimos mucho...! No ha superado la revision vehicular de la ATM.'
		Si (revision=0) Y (fabricacion<=1995) Entonces
			circulacion <- 3
		SiNo
			circulacion <- 4
		FinSi
	FinSi
	Escribir 'Usted puede circular ',circulacion,' dias'
FinAlgoritmo
