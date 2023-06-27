

  <script type="text/javascript" src="./assets/js/materialize.js"></script>

  <script>
      document.addEventListener('DOMContentLoaded', function() {
          M.AutoInit();
          var instance = M.Tabs.init(elems);
      });

  </script> 

  <script>
      document.addEventListener('DOMContentLoaded', function() {
      var elems = document.querySelectorAll('.sidenav');
      var instances = M.Sidenav.init(elems);
  });
  </script>

  <script>
    document.addEventListener('DOMContentLoaded', function() {
    var elems = document.querySelectorAll('.materialboxed');
    var instances = M.Materialbox.init(elems);
  });
  </script>

<script type="text/javascript">
      function valida_cedula() {
        var cad = document.getElementById("cedula").value.trim();
        var total = 0;
        var longitud = cad.length;
        var longcheck = longitud - 1;
        if (cad !== "" && longitud === 10){
          for(i = 0; i < longcheck; i++){
            if (i%2 === 0) {
              var aux = cad.charAt(i) * 2;
              if (aux > 9) aux -= 9;
              total += aux;
            } else {
              total += parseInt(cad.charAt(i)); // parseInt o concatenará en lugar de sumar
            }
          }
          total = total % 10 ? 10 - total % 10 : 0;
          if (cad.charAt(longitud-1) != total) {
            document.getElementById("cedula").value = ("0");
          }
        }
      }
    </script>

<script>
    function valideKey(evt){
        var code = (evt.which) ? evt.which : evt.keyCode;    // code is the decimal ASCII representation of the pressed key.
        if(code==8) { // backspace.
          return true;
        } else if(code>=48 && code<=57) { // is a number.
          return true;
        } 
        else if (code==46){
          return true;
        }
        else{ // other keys.
          return false;
        }
    }
    </script>

</body>
</html>