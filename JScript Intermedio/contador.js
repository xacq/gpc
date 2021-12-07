function wordCount( val ){
    var wom = val.match(/\S+/g);
    return {
        charactersNoSpaces : val.replace(/\s+/g, '').length,
        characters         : val.length,
        words              : wom ? wom.length : 0,
        lines              : val.split(/\r*\n/).length
    };
}

var textarea = document.getElementById("text");//genera objetos de ingreso
var result   = document.getElementById("result");
textarea.addEventListener("input", function(){
  var v = wordCount( this.value );
  result.innerHTML = ( //muestra en pagina HTML
      "<br>Numero de Caracteres sin espacios: "+ v.charactersNoSpaces +
      "<br>Numero de Caracteres con espacion: "+ v.characters +
      "<br>Palabras ingresadas en el campo: "+ v.words +
      "<br>Lineas ingresadas en el texto: "+ v.lines
  );
}, false);
