function numeroAleatorio() {
    let numeroAleatorio = parseInt(Math.random() * 100);
    let numero = parseInt(document.getElementById("numero").value);

    if (numero === numeroAleatorio) {
        document.getElementById("resultado").innerHTML =
        "Você acertou!!! Parabéns!!!🎉🎉"
    } else if (numero !== numeroAleatorio){
        document.getElementById("resultado").innerHTML = "Tente novamente!!!"
    }
}