
let resultado = "";

for (let index = 1; index <= 10; index++) { 
  //monta o início da linha
  resultado += "(" + index + ", ";
  
  //escreve na tela a sequencia de 1 a 10
  for (let index = 1; index <= 10; index++) {
    resultado += index + " ";
  }//fim da escrita de 1 a 10

  //finaliza a linha
  resultado += ")<br>";
}

document.getElementById("resultado").innerHTML = resultado;
