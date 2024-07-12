package br.com.senac.controller;

import br.com.senac.bd.BaseDados;
import br.com.senac.entity.Livro;
import java.util.ArrayList;
import java.util.Scanner;

public class LivroController {
    //atributos
    private ArrayList<Livro> livros;

    //construtor
    public LivroController() {
        this.livros = new ArrayList<Livro>();
    }

    public void cadastrarLivro() {
        Scanner scanner = new Scanner(System.in);
        Livro livro = new Livro();

        System.out.println("Digite o codigo: ");
        int codigo = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o Titulo: ");
        String titulo = scanner.nextLine();

        scanner.nextLine();

        System.out.println("Digite a editora: ");
        String editora = scanner.nextLine();

        livro.setCodigo(codigo);
        livro.setTitulo(titulo);
        livro.setEditora(editora);

        System.out.println("*** Informacoes cadastradas ***");
        System.out.println("-------------------------------");
        System.out.println(livro.exibeDados());
        System.out.println("");

        this.livros.add(livro);
    }

    public void salvarLivro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o codigo do livro para salvar: ");
        int codigo = scanner.nextInt();

        for (Livro livro : this.livros) {
            if (livro.getCodigo() == codigo) {
                BaseDados baseDados = new BaseDados();
                baseDados.salvarDadosLivro("livros.csv", livro);
                System.out.println("Livro salvo com sucesso! \n");
                break;
            }
        }
    }
}
