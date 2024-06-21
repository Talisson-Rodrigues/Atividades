function pesoIdeal() {
    let nome = document.getElementById("nome").value;
    let altura = parseFloat(document.getElementById("altura").value);
    let sexo = document.getElementById("sexo").value;
    let selecaoSexo = "";
    let resultado = "";


    if (sexo === "1") {
        selecaoSexo = "Masculino";
        resultado = (72.7 * altura) - 58;
    } else if (sexo === "2") {
        selecaoSexo = "Feminino";
        resultado = (62.1 * altura) - 44.7;
    }


    document.getElementById("resultado").innerHTML =
        "Nome: " + nome + "<br>"        +
        "Altura: " + altura + "<br>"    +
        "Sexo: " + selecaoSexo + "<br>" +
        "Peso Ideal: " + resultado.toFixed(2);
}