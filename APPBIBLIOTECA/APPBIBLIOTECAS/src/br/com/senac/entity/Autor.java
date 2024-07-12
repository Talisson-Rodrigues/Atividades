package br.com.senac.entity;

public class Autor {
    private int codigo;
    private String nome;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String exibeDados() {
        return "Código: " + this.getCodigo() + 
               "\nNome: " + this.getNome();
    
    }

    public String exportaDados() {
        return this.getCodigo() + ";" + this.getNome();
    }
}
