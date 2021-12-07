//Permite agregar un texto al identificar un id del HTML
//document.getElementById("paragraph").textContent = "Aun estoy vivo...!";

//Segunda forma para incorporar texto como codigo dentro del DOM
//var element = document.createElement('pre');
//element.textContent = "Segunda opcion de ingreso de datos alteradp en el DOM del HTML...!";
//document.body.appendChild(element); //add the newly created element to the DOM

//aparece un mensaje emergente del browser con un mensaje
//alert('Aqui aparece un mensaje de alerta...!');

//combinamos un alert con un console.log y se ve como el primero se ejecuta y luego el segundo en la consola
//alert('Pause!');
//console.log('Alert was dismissed');

//var age = prompt("Cual es su edad?"); // solicitud de informacion a traves del prompt
//var element = document.createElement('h1');  // se puede cambiar el tag de muestra en el DOM
//element.textContent = "La edad ingresada es: " + age; //se muestra en el DOM la informacion ingresada
//document.body.appendChild(element);

//trabajamos con ventana de confirmacion para uso en HTML desde JS
//if(window.confirm("Confirme si la edad era mayor que 40 años?")) {
//    deleteItem(itemId);
//}
// Se puede guardar el return de la ventana en una variable
//var mayorque40 = window.confirm("Confirme si la edad era mayor que 40 años?");
//var respuesta = document.createElement('p');  // se puede cambiar el tag de muestra en el DOM
//respuesta.textContent = "La respuesta es: " + mayorque40; //se muestra en el DOM la informacion ingresada
//document.body.appendChild(respuesta);
//console.log(mayorque40);

//Usamos el DOM API con Canvas
//establecemos un canvas con parametros para la imagen
//var canvas = document.createElement('canvas');
//canvas.width = 500;
//canvas.height = 250;
//Seleccionamos un contexto, es este caso 2 dimensiones
//var ctx = canvas.getContext('2d');
//A continuacion seteamos propiedades relacionadas al texto
//ctx.font = '100px Cursive';
//ctx.fillText("Hello world!", 100, 100)
//finalmente insertamos el elemento canvas a documento
//document.body.appendChild(canvas);


//Usamos el DOM API con SVG
//se crea un elemento SVG o contenedor SVG
var svg = document.createElementNS('http://www.w3.org/2000/svg', 'svg');
svg.width = 50;
svg.height = 50;
//Se construye a continuacion el texto indicando posicion y caracteristicas de la fuente
var text = document.createElementNS('http://www.w3.org/2000/svg', 'text');
text.setAttribute('x', '0');
text.setAttribute('y', '50');
text.style.fontFamily = 'Times New Roman';
text.style.fontSize = '100';
// Se aacopla el texto actual a la pantalla como textelement
text.textContent = 'Estoy muerto...!';
//Finalmente se aumenta el texto a nuestro svg container y asi mismo al DOM
svg.appendChild(text);
document.body.appendChild(svg);

//Usamos el DOM API con IMG
//var img = new Image();
//img.src = 'https://i.ytimg.com/vi/zecueq-mo4M/maxresdefault.jpg';
//img.width = 500;
//img.height = 500;
//document.body.appendChild(img) //Se incluye en el DOM del documento




