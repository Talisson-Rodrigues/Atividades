function dividir() {
    let valor1 = parseFloat(document.getElementById("valor1").value);
    let valor2 = parseFloat(document.getElementById("valor2").value);
    let resultado = "";

    
    if (valor2 === 0) {
        alert("Digite um valor maior que 0");
        document.getElementById("valor2").value = "";
        valor2 = parseFloat(document.getElementById("valor2").value);
    } else {
        resultado = (valor1/valor2);
        document.getElementById("resultado").innerHTML = valor1 + " dividido por " + valor2 + " é igual a: " + resultado;
    }
    
} 