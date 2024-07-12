
package br.com.senac.sistema;

public class Menu {
    public void gerarMenuOpcoes() {
        System.out.println("Selecione uma opcao: ");
        System.out.println("1 - Cadastrar Autor");
        System.out.println("2 - Salvar informacoes Autor");
        System.out.println("3 - Cadastrar Livro");
        System.out.println("4 - Salvar informacoes Livro");
        System.out.println("100 - Sair do sistema");
    }

    public void gerarMensagemInicial() {
        System.out.println("*** Bem vindo ao Sistema de Biblioteca v1.0 ***");
        System.out.println("-----------------------------------------------");
        System.out.println("");
    }
}
