let resultado = "";
for (let linha = 1; linha <= 6; linha++) {
    for (let coluna = 0; coluna < linha; coluna++) {
        resultado += ".";
    } resultado = resultado + "<br>";
}

document.getElementById("resultado").innerHTML = resultado