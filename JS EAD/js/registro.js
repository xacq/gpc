function validar(formulario) {

    if (formulario.nombres.value.trim().length == 0) {
        alert("Campo Nombre es obligatorio.");
        formulario.nombres.focus();
        return false;
    }
    var re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    if (!re.test(formulario.email.value)) {
        alert("Campo Email esta mal ingresado.");
        formulario.email.focus();
        return false;
    }
    if (formulario.contrasena.value.trim().length == 0) {
        alert("Campo contraseña es obligatorio.");
        formulario.contrasena.focus();
        return false;
    }
    if (formulario.contrasena.value.trim().length < 8) {
        alert("Campo contraseña no puede ser menor de 8 caracteres.");
        formulario.contrasena.focus();
        return false;
    }
    if (formulario.confirmacion.value != formulario.contrasena.value) {
        alert("Las Contraseñas no coinciden.");
        formulario.confirmacion.focus();
        return false;
    }
    if (formulario.usuario.value == "-1") {
        alert("Campo Usuario es obligatorio.");
        formulario.usuario.focus();
        return false;
    }
    if (!formulario.acepto.checked) {
        alert("Debe aceptar los términos y condiciones.");
        formulario.acepto.focus();
        return false;
    }

}