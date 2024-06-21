function sleep(ms) {
    return new Promise(resolve => setTimeout(resolve, ms));
}

async function regressiva() {
    let contagem = parseInt(document.getElementById("contagem").value);
    let resultado = "";

    for (let index = contagem; index >= 0; index--) {
        resultado += index + " ";
        document.getElementById("resultado").innerHTML = resultado;
        await sleep(1000);
    }
    
}

regressiva();