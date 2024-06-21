let letras = ["A", "B", "C", "D", "E", "F"];
let resultado = "";

for (let index = 0; index < letras.length; index++) {
    for (let index2 = 0; index2< letras.length; index2++) {
        resultado += letras[index] + " ";
    }
    resultado += "<br>"
}document.getElementById("resultado").innerHTML = resultado;