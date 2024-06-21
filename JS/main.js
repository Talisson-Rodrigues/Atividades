let numeros = [5,152,6,98,55,20,78,10,2,1,158,125,185,896,57,157,103,6,7,99,57];
let maiorNumero = "";

for (let index = 0; index < numeros.length; index++) {
    if (numeros[index] > maiorNumero) {
        maiorNumero = numeros[index];
    }
}

document.getElementById("resultado").innerHTML = 
"O maior número da lista é: " + maiorNumero;