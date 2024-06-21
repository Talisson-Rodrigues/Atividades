let valor = parseInt(prompt("Digite um valor: "));
let sequencia = [];
let resultado = "";

resultado += "Asc  = [" 
for (let index = 0; index < valor; index++) {
    resultado += sequencia.push(index) + " ";
}

resultado += "] <br>"
resultado += "Desc  = ["
for (let index = sequencia.length-1; index > -1; index--) {
    resultado += sequencia[index] + " ";
} 
resultado += "]"
 
document.getElementById("resultado").innerHTML = resultado;