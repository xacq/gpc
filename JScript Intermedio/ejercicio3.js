// modelo 1 de funcion reversa
function reverseString(str) {
    return str.split('').reverse().join('');
   }

// modelo 2 de funcion reversa
function reverse(string) {
    var strRev = "";
    var i;
    for (i = string.length - 1; i >= 0; i--) {
        // string = pato        
        // p a t o --> array conjunto de caracteres en forma de cadena
        // >[-1] undefined --> i = -1
        // p[0]
        // a[1]
        // t[2]
        // o[3]  la posicion que te da lenght es 4, debe arrancar desde 3
        // null[4] undefined -- i = 4
        strRev = strRev + string[i];
        console.log ("Valor en la posicion "+ i +" de "+ string +" es: "+ string[i] )
        console.log (strRev);
        //string[0] = p
        //string[1] = a
        //string[2] = t
        //string[3] = o 
    }
    return strRev;
   }
    string = prompt("Ingrese una palabra a revertir");
    alert("Usamos la funcion directa: " + reverseString(string));   
    alert("Usamos la funcion elaborada: "+ reverse(string));   
/*
//Comparativa de textos 1
var a = "hello";
var b = "world";
console.log(a.localeCompare(b)); 

//Comparativa de textos 2
function strcmp(a, b) {
    if(a === b) {
    return 0;
    }
    if (a > b) {
    return 1;
    }
    return -1;
   }

   console.log(strcmp("hello", "world")); // -1
   console.log(strcmp("hello", "hello")); // 0
   console.log(strcmp("world", "hello")); // 1

//ordenamiento de un array de palabras
var arr = ["bananas", "cranberries", "apples"];
arr.sort(function(a, b) {
    return a.localeCompare(b)
    });
console.log(arr); // [ "apples", "bananas", "cranberries" ]

//Ubicacion de un string por posicion de caracter
var palabra = "Revelacion y Gehena!";
console.log( palabra.charAt(4)); // "o"
console.log( palabra[4]); // "o"
console.log( string.charCodeAt(4)); // 111  Code of character

var text = 'L\'albero means tree in Italian';
console.log( text ); // "L'albero means tree in Italian"
var texto = "I feel \"high\""; //
console.log (texto);

// base 10 Number
var b10 = 12;
// base 16 String representation
var b16 = b10.toString(16); // "c"
console.log(b16);

// base 16 String representation
var b16 = 'c';
// base 10 Number
var b10 = parseInt(b16, 16); // 12
console.log(b10);   

var string = "Hello, World!";
console.log( string.indexOf("o") ); // 4
console.log( string.indexOf("foo") ); // -1

console.log( string.lastIndexOf("l") ); // 8
console.log( string.lastIndexOf("u") ); // -1

console.log( string.includes("Hello") ); // true
console.log( string.includes("foo") ); // false

string = string.replace( "Hello", "Bye" );
console.log( string ); // "Bye, World!"
string = string.replace( /W.{3}d/g, "Universe" );
console.log( string ); // "Bye, Universe!"

var palabra = "heLlo, woRlD!";
palabra = palabra.replace( /([a-zA-Z])([a-zA-Z]+)/g, function(match, g1, g2) {
 return g1.toUpperCase() + g2.toLowerCase();
});
console.log( palabra ); // "Hello, World!

console.log('qwerty'.toUpperCase()); // 'QWERTY'
console.log('QWERTY'.toLowerCase()); // 'qwerty

"abc".repeat(3); // Returns "abcabcabc"

var myString = "abc";
var n = 3;
var o =new Array(n + 1).join(myString); 
console.log(o)
*/