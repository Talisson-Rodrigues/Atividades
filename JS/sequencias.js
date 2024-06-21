let resultado = "";

for (let index = 1; index <= 10; index++) {
      for (let index = 10; index <= 1; index++) {
        resultado = index
      }
      resultado = resultado + index + ", " + "<br>";
}

document.getElementById("resultado").innerHTML = resultado;