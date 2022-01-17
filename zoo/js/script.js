// Codigo para validar ingreso de solo numeros
function valideKey(evt){
    var code = (evt.which) ? evt.which : evt.keyCode;    // code is the decimal ASCII representation of the pressed key.
    if(code==8) { // backspace.
      return true;
    } 
    else if(code>=48 && code<=57) { // is a number.
      return true;
    } 
    else if (code==46){// punto
      return true;
    }
    else{ // other keys.
      return false;
    }
}

// Codigo para validar ingreso de solo caracteres permitidos
function valideKeys(evt){
  var code = (evt.which) ? evt.which : evt.keyCode;    // code is the decimal ASCII representation of the pressed key.
  if(code==95||code==91||code==93||code==42||code==36) { // underline, corchetes , asterisco, dollars
    return false;
  } 
  else{ // other keys.
    return true;
  }
}

function confirmar ( mensaje ) {
  return confirm( mensaje );
  }
  