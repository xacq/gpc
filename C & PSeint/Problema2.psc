Algoritmo Problema2
	Escribir 'Ingrese la cantidad inicial de bacterias a controlar: '
	Leer numero_bacterias
	Repetir
		Escribir 'Ingrese el valor maximo de bacterias permitido: '
		Leer cantidad_maxima
		Si (cantidad_maxima<numero_bacterias) Entonces
			Escribir 'ERROR EN EL INGRESO DE MAXIMO BACTERIAS - INGRESE UN NUMERO MAYOR AL NUMERO DE BACTERIAS INICIAL'
		FinSi
	Hasta Que cantidad_maxima>numero_bacterias
	Definir dias Como Entero
	dias <- 1
	Repetir
		numero_bacterias <- numero_bacterias*2
		Si (numero_bacterias>cantidad_maxima) Entonces
			Escribir 'Las bacterias superaron el valor permitido en:',dias,'dia/s'
		SiNo
			dias <- dias+1
		FinSi
	Hasta Que numero_bacterias>cantidad_maxima
FinAlgoritmo
