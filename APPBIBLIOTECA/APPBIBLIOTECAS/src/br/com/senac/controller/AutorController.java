package br.com.senac.controller;

import br.com.senac.bd.BaseDados;
import br.com.senac.entity.Autor;
import java.util.ArrayList;
import java.util.Scanner;

public class AutorController {
    //atributos
    private ArrayList<Autor> autores;

    //construtor
    public AutorController() {
        this.autores = new ArrayList<Autor>();
    }

    public void cadastrarAutor() {
        Scanner scanner = new Scanner(System.in);
        Autor autor = new Autor();

        System.out.println("Digite o codigo: ");
        int codigo = scanner.nextInt();

        scanner.nextLine(); //limpa o buffer

        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();

        autor.setCodigo(codigo);
        autor.setNome(nome);

        System.out.println("*** Informacoes cadastradas ***");
        System.out.println("-------------------------------");
        System.out.println(autor.exibeDados());
        System.out.println("");

        this.autores.add(autor);
    }

    public void salvarAutor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o codigo do autor para salvar: ");
        int codigo = scanner.nextInt();

        
        //pesquisa na lista de autores
        //o autor com o codigo informado
        for (Autor autor : this.autores) {
            if (autor.getCodigo() == codigo) {
                BaseDados baseDados = new BaseDados();
                baseDados.salvarDadosAutor("autores.csv", autor);
                System.out.println("Autor salvo com sucesso! \n");
                break;
            }
        }
    }
}
