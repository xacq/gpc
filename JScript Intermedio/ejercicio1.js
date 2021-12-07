//PROGRAMA PARA MOSTRAR LAS 4 OPERACIONES BASICAS
//A TRAVES DE MENSAJES PROMPT
var num1 = prompt("Ingrese el primer digito");
var num2 = prompt("Ingrese el segundo digito");

var suma = parseInt(num1) + parseInt(num2); 
alert("La suma de "+num1+" y "+num2+" es: " + suma);

var resta = num1 - num2;
alert("La resta de "+num1+" y "+num2+" es: " + resta);

var multiplicacion = num1 * num2;
alert("La multiplicación de "+num1+" y "+num2+" es: " + multiplicacion);

if (num2 > 0 || num2 < 0) {
    var division =  num1 / num2;
    var mensaje = "La división de "+num1+" y "+num2+" es: " + division;
}
else
{
    mensaje = "No se puede dividir para 0."
}

alert(mensaje)

var myString = "Esta es una aplicación de JavaScript!"; // "I am a string!"
alert(myString)