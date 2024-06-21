let info = ["user", "654321"];

function validarLogin(e) {

e.preventDefault();

let usuario = document.getElementById("nome").value;
let senha = document.getElementById("senha").value;

    if (usuario === info[0] && senha === info[1]) {
        sessionStorage.setItem("usuario",usuario); //armazena no local
        window.location = "index.html";
    } else {
        document.getElementById("error").className = "error";
    }
}