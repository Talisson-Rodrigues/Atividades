package br.com.senac.bd;

import br.com.senac.entity.Autor;
import br.com.senac.entity.Livro;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BaseDados {

    public void salvarDadosAutor(String nomeArquivo, Autor autor) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(
                new FileWriter(nomeArquivo, true));

            writer.write(autor.exportaDados());
            writer.newLine();
            
        } catch (IOException e) {
            System.out.println("Erro ao gravar no arquivo: " + e.getMessage());
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("Erro ao fechar o arquivo: " + e.getMessage());
            }
        }
    }

    public void salvarDadosLivro(String nomeArquivo, Livro livro) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(nomeArquivo, true));

            writer.write(livro.exportaDados());
            writer.newLine();

        } catch (IOException e) {
            System.out.println("Erro ao gravar no arquivo: " + e.getMessage());
        } finally {
            try {
               if (writer != null) {
                    writer.close();
               } 
            } catch (IOException e) {
                System.out.println("Erro ao fechar o arquivo: " + e.getMessage());
            }
        }
    }
}
