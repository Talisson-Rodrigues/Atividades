function tempCelsius() {
let graus = parseFloat(document.getElementById("temp").value);
let resultado = (graus - 32) * 5/9;

document.getElementById("resultado").innerHTML = "Em graus fahrenheit " + graus + "F é em graus Celsius : " + resultado.toFixed(2) + "C ";
}