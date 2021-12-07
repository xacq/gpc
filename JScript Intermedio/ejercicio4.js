message = "Hello World";
alert(message);

alert('Pause!');
console.log('Alerta fue apagada');

var age = prompt("How old are you?");
console.log(age); // Prints the value inserted by the user
message = "Usted tiene "+ age + "!"
alert(message);

if(window.confirm("Quieres eliminar a este usuario de "+age+" años de edad?")) {
    alert("Has eliminado a un usuario de "+ age + " años de edad");
    age = 0;
   }
else{
    alert("Nuestro usuario de "+ age + " años de edad no ha sido eliminado");
    var usuario = age;
}

var canvas = document.createElement('canvas');
canvas.width = 500;
canvas.height = 50;
var ctx = canvas.getContext('2d');
ctx.font = '50px Cursive';
ctx.fillText("Esto es un texto Canvas", 50, 50);
document.body.appendChild(canvas);

var svg = document.createElementNS('http://www.w3.org/2000/svg', 'svg');
svg.width = 500;
svg.height = 50;
var text = document.createElementNS('http://www.w3.org/2000/svg', 'text');
text.setAttribute('x', '0');
text.setAttribute('y', '50');
text.style.fontFamily = 'Times New Roman';
text.style.fontSize = '100';
text.textContent = 'Este es un texto con SVG!'; 
svg.appendChild(text);
document.body.appendChild(svg);


var img = new Image();
img.src = 'https://i.ytimg.com/vi/zecueq-mo4M/maxresdefault.jpg';
document.body.appendChild(img);