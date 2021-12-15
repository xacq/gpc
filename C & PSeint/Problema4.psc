Algoritmo Problema4
	Definir control Como Entero
	Definir turno Como Caracter
	Definir seccion Como Entero
	Definir sueldo Como Real
	Escribir 'VERIFIQUE SI PUEDE SER PROMOVIDO A UNA NUEVA SECCION DE LA EMPRESA'
	Repetir
		Escribir 'Ingrese el turno de trabajo que se le ha asignado actualmente (M-Mañana/T-Tarde/N-Noche): '
		Leer turno
		control <- 0
		Si (turno='M') Entonces
			control <- 1
		FinSi
		Si (turno='T') Entonces
			control <- 1
		FinSi
		Si (turno='N') Entonces
			control <- 1
		FinSi
		Si (control=0) Entonces
			Escribir 'NO EXISTE ESTE TURNO. POR FAVOR VERIFIQUE M-Mañana/T-Tarde/N-Noche'
		FinSi
	Hasta Que control=1
	Repetir
		Escribir 'Ingrese la seccion a la que pertenece (1 / 2 / 3  / 4): '
		Leer seccion
		Si (seccion>0) Y (seccion<5) Entonces
			control <- 1
		SiNo
			Escribir 'SECCION MAL INGRESADA...'
			control <- 0
		FinSi
	Hasta Que control=1
	Repetir
		Escribir 'Ingrese su sueldo (400 - 10000): '
		Leer sueldo
		Si (sueldo>=400) Y (sueldo<=10000) Entonces
			control <- 1
		SiNo
			Escribir 'SUELDO MAL INGRESADO...'
			control <- 0
		FinSi
	Hasta Que control=1
	Si (turno='M') Entonces
		Si (sueldo<=2000) Entonces
			Si (seccion=1) Entonces
				Escribir 'Felicitaciones...! Ha sido promovido a un nuevo puesto de trabajo.'
			SiNo
				Escribir 'Lo Sentimos mucho...! No ha podido superar los requisitos para este nuevo puesto de trabajo.'
			FinSi
		SiNo
			Escribir 'Lo Sentimos mucho...! No ha podido superar los requisitos para este nuevo puesto de trabajo.'
		FinSi
	SiNo
		Escribir 'Lo Sentimos mucho...! No ha podido superar los requisitos para este nuevo puesto de trabajo.'
	FinSi
FinAlgoritmo
