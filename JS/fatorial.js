function fatorial() {

let numero = parseInt(document.getElementById("fator").value);
let resultado = 1;

for (let index = 1; index <= numero; index++) {
    resultado = resultado * index;
}

document.getElementById("resultado").innerHTML = resultado;
}