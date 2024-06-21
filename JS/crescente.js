let crescente = [50,2,85,9,63,1,7,20,0,106];

for (let i = 0; i < crescente.length; i++) {
    for (let j = i + 1; j < crescente.length; j++) {
        if (crescente[i] > crescente[j]) {
            let aux = crescente[i];
            crescente[i] = crescente[j];
            crescente[j] = aux;
        }
    }
}

document.getElementById("resultado").innerHTML = 
"A ordem crescente é: " + crescente;