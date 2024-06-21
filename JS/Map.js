let palavras = new Map();
palavras.set("Lógica","Logic");
palavras.set("Processo","Process");
palavras.set("Algoritmo","Algorithm");
palavras.set("Construir","Build");
palavras.set("Programador","Programmer");
palavras.set("Computador","Computer");

let palavrasEspanhol = new Map();
palavrasEspanhol.set("Computador", "Computadora");
palavrasEspanhol.set("Construir","Rampa arriba");

function traduzir() {
    let textoTraduzir = document.getElementById("texto").value;
    let opcao = document.getElementById("idioma").value;

    if (opcao === "1") {
        for (const[key,value] of palavras) {
            if (textoTraduzir === key) {
                document.getElementById("traducao").innerHTML = value;
                break;
            }
        }
    } else if (opcao === "2") {
        for (const[key,value] of palavrasEspanhol) {
            if (textoTraduzir === key) {
                document.getElementById("traducao").innerHTML = value;
            }
        }
    }
}