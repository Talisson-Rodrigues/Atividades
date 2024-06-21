function maiorMenor() {
let valor1 = document.getElementById("valor1").value;
let valor2 = document.getElementById("valor2").value;
let resultado = "";

if (valor1 > valor2) {
    resultado = "O primeiro é maior";
} else if (valor2 > valor1) {
    resultado = "O segundo é maior";
} else {
    resultado = "Número iguais";
}

document.getElementById("resultado").innerHTML = resultado;
}