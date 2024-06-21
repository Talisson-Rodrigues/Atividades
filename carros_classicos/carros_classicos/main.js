// pesquisa as informações sobre o
//carro classico
function pesquisar() {
    //recupera o valor do input
    let nome = document.getElementById("nome").value;
    
    //verifica se o campo foi preenchido
    if (nome !== "") {
        //Converte para minúsculas
        nome = nome.toLowerCase();

        //pesquisa no banco de dados
        //as informações sobre o carro
        //let achou = dados.get(nome);
        let achou = null;
        for (const [key,value] of dados) {
            //transforma a key em letras minúsculas
            //e o metodo includes verifica se a string
            //contem o texto que queremos pesquisar
            if (key.toLowerCase().includes(nome)) {
                achou = value;
                break;
            }
        }
    
        //se achou o carro
        if (achou) {
            //constroi o card de informações
            let card = '<div class="col d-flex justify-content-center">' +
                    '<div class="card" style="width: 18rem;">' +
                    '<img src="img/' + achou[2] + '" class="card-img-top" alt="...">' +
                    '    <div class="card-body">' +
                    '        <h5 class="card-title fw-bold">' + achou[3] + '</h5>' +
                    '        <p class="card-text">' + achou[0].substring(0,150) + '</p>' +
                    '        <a href="#" class="btn btn-link" onclick="saibaMais(\'' + achou[3] + '\')">Saiba mais...</a>' +
                    '    </div>' +
                    '</div>' +
                    '</div>';

            //
            //
            let info = document.getElementById("infoRow");
            info.innerHTML = ""; //limpa as infos antigas
            info.innerHTML = card;//

            document.getElementById("pesquisaInfo").innerHTML = '<span class="badge text-bg-primary" onclick="limparPesquisa()">' + achou[3] + ' X</span>';
        }//fim if
        else {
            //referencia o id do toast
            const toast = document.getElementById("toastInfo");
            //cria uma instância do toast
            const toastBootstrap = bootstrap.Toast.getOrCreateInstance(toast);
            //exibe o toast
            toastBootstrap.show();
        }//fim else


    }//fim verificacao
} // fim da function pesquisar

function limparPesquisa() {
    document.getElementById("infoRow").innerHTML = "";
    document.getElementById("pesquisaInfo").innerHTML = "";
    document.getElementById("nome").value = "";
    //fazer o for na variavel dados
    for (const [key,value] of dados) {
        let achou = value;
        //montar os cards com os carros
        let card = '<div class="col d-flex justify-content-center">' +
                   '<div class="card" style="width: 18rem;">' +
                   '<img src="img/' + achou[2] + '" class="card-img-top" alt="...">' +
                   '    <div class="card-body">' +
                   '        <h5 class="card-title fw-bold">' + achou[3] + '</h5>' +
                   '        <p class="card-text">' + achou[0].substring(0,150) + '</p>' +
                   '        <a href="#" class="btn btn-link" onclick="saibaMais(\'' + achou[3] + '\')">Saiba mais...</a>' +
                   '    </div>' +
                   '</div>' +
                   '</div>';

                   
        //inserir os cards na row
        let info = document.getElementById("infoRow");
        info.innerHTML = info.innerHTML + card; //
    } //fim FOR
} // fim da function limparPesquisa

//funcao para mostrar info adicionais do carro
function saibaMais(chave) {
    let infoAdicionais = dados.get(chave);

    //recupera uma referencia ao modal
    let modal = new bootstrap.Modal(document.getElementById('modalInfo'));
    let info = document.getElementById("info");
    let title = document.getElementById("modalTitle");

    //adiciona as informações no modal
    title.innerHTML = infoAdicionais[3];
    info.innerHTML = "";
    info.innerHTML = "<p>" + infoAdicionais[0] + "</p>";
    info.innerHTML += "<p> Ano de fabricação: " + infoAdicionais[1] + "</p>";

    modal.show(); //exibe o modal na tela
}//fim da function saibaMais