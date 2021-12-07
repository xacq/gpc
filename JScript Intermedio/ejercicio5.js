var favoriteFruits = ["apple", "orange", "strawberry"];
var cars = ["Toyota", "Ferrari", "Lexus", "Kia", "Nissan", "Mercedez"];
var employees = ["Billy", "Bob", "Joe"];
var primeNumbers = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31];
var randomVariables = [2, "any type works", undefined, null, true, 2.51];

var myArray = ["zero", "one", "two"];
var i;

for (i = 0;i <= myArray.length-1;i++){
    alert("Objeto del array en la posicion "+ i + "es :"+ myArray[i]);
}
 

var choice = prompt("Ingrese un numero entre 1 y 6:");

console.log ("Este es el array de Marcas de carros =" + cars )

if (choice > 5 || choice < 0) {
    alert ("No existe esa posicion en el array de carros");
}
else {
    choice--;
    alert ("La marca escogida es: "+cars[choice]);
}    




