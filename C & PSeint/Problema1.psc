Algoritmo Problema1
	Repetir
		Repetir
			Escribir 'Ingrese el mes en el que recibio su segunda dosis para COVID19: 1 para Enero ... 12 para Diciembre:'
			Leer mes_segunda_dosis
			Si (mes_segunda_dosis>12) Entonces
				Escribir 'ERROR AL INGRESAR EL MES.  POR FAVOR INGRESE UN MES DEL 1 AL 12.'
				control <- 0
			SiNo
				control <- 1
			FinSi
		Mientras Que control=0
		tercera_dosis <- mes_segunda_dosis+6
		Si (tercera_dosis>12) Entonces
			tercera_dosis <- tercera_dosis-12
			Escribir 'Tiene que acercarse a recibir su tercera dosis para COVID 19 el 2022 en el mes numero:',tercera_dosis
		SiNo
			Escribir 'Tiene que acercarse a recibir su tercera dosis para COVID 19 el 2021 en el mes numero:',tercera_dosis
		FinSi
		Escribir 'Desea realizar otra consulta SI=1 NO=0: '
		Leer consulta
	Mientras Que consulta=1
FinAlgoritmo
