package br.com.senac.entity;

public class Livro {
    private int codigo;
    private String titulo;
    private String editora;


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String exibeDados() {
        return "Codigo: " + this.getCodigo() + 
               "\nTitulo: " + this.getTitulo() +
               "\nEditora: " + this.getEditora();
    }

    public String exportaDados() {
        return this.getCodigo() + ";" + this.getTitulo() + ";" + this.getEditora();
    }
}
